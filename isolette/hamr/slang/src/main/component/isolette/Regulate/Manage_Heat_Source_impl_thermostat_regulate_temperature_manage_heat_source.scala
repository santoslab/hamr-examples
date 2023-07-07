// #Sireum #Logika

package isolette.Regulate

import org.sireum._
import org.sireum.justification.Auto;
import isolette._
import isolette.Isolette_Data_Model._

// This file will not be overwritten so is safe to edit
object Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source {

  // BEGIN STATE VARS
  var lastCmd: Isolette_Data_Model.On_Off.Type = Isolette_Data_Model.On_Off.byOrdinal(0).get
  // END STATE VARS

  //======================================
  // Initialize Entry Point
  //======================================
  def initialise(api: Manage_Heat_Source_impl_Initialization_Api): Unit = {
    Contract(
      Modifies(api,lastCmd),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initlastCmd
        lastCmd == Isolette_Data_Model.On_Off.Off,
        // guarantee REQ_MHS_1
        //   If the Regulator Mode is INIT, the Heat Control shall be
        //   set to Off
        //   http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=110
        api.heat_control == Isolette_Data_Model.On_Off.Off
        // END INITIALIZES ENSURES
      )
    )
    lastCmd = Isolette_Data_Model.On_Off.Off
    // REQ-MHS-1: If the Regulator Mode is INIT, the Heat Control shall be
    // set to Off
    val currentCmd = Isolette_Data_Model.On_Off.Off
    api.put_heat_control(currentCmd)

    //api.logInfo(s"Sent on heat_control: $currentCmd")
  }

  //======================================
  // Compute Entry Point
  //======================================
  def timeTriggered(api: Manage_Heat_Source_impl_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES timeTriggered
        // assume lower_is_lower_temp
        api.lower_desired_temp.value <= api.upper_desired_temp.value
        // END COMPUTE REQUIRES timeTriggered
      ),
      Modifies(api,lastCmd),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee lastCmd
        //   Set lastCmd to value of output Cmd port
        lastCmd == api.heat_control,
        // case REQ_MHS_1
        //   If the Regulator Mode is INIT, the Heat Control shall be
        //   set to Off.
        //   http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=110
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode) -->: (api.heat_control == Isolette_Data_Model.On_Off.Off),
        // case REQ_MHS_2
        //   If the Regulator Mode is NORMAL and the Current Temperature is less than
        //   the Lower Desired Temperature, the Heat Control shall be set to On.
        //   http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=110
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &
           api.current_tempWstatus.value < api.lower_desired_temp.value) -->: (api.heat_control == Isolette_Data_Model.On_Off.Onn),
        // case REQ_MHS_3
        //   If the Regulator Mode is NORMAL and the Current Temperature is greater than
        //   the Upper Desired Temperature, the Heat Control shall be set to Off.
        //   http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=110
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &
           api.current_tempWstatus.value > api.upper_desired_temp.value) -->: (api.heat_control == Isolette_Data_Model.On_Off.Off),
        // case REQ_MHS_4
        //   If the Regulator Mode is NORMAL and the Current
        //   Temperature is greater than or equal to the Lower Desired Temperature
        //   and less than or equal to the Upper Desired Temperature, the value of
        //   the Heat Control shall not be changed.
        //   http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=110
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &
           (api.current_tempWstatus.value >= api.lower_desired_temp.value &
             api.current_tempWstatus.value <= api.upper_desired_temp.value)) -->: (api.heat_control == In(lastCmd)),
        // case REQ_MHS_5
        //   If the Regulator Mode is FAILED, the Heat Control shall be
        //   set to Off.
        //   http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=111
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode) -->: (api.heat_control == Isolette_Data_Model.On_Off.Off)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // -------------- Get values of input ports ------------------
    val lower: Isolette_Data_Model.Temp_impl = api.get_lower_desired_temp().get
    val upper: Isolette_Data_Model.Temp_impl = api.get_upper_desired_temp().get
    val regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = api.get_regulator_mode().get
    val currentTemp: Isolette_Data_Model.TempWstatus_impl = api.get_current_tempWstatus().get

    //================ compute / control logic ===========================

    // current command defaults to value of last command (REQ-MHS-4)
    var currentCmd: Isolette_Data_Model.On_Off.Type = lastCmd

    regulator_mode match {

      // ----- INIT Mode --------
      case Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode =>
        // REQ-MHS-1
        currentCmd = Isolette_Data_Model.On_Off.Off

      // ------ NORMAL Mode -------
      case Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode =>
        if (currentTemp.value > upper.value) {
          // REQ-MHS-3
          currentCmd = Isolette_Data_Model.On_Off.Off
        } else if (currentTemp.value < lower.value) {
          // REQ-MHS-2
          //currentCmd = Isolette_Data_Model.On_Off.Off // seeded bug/error
          currentCmd = Isolette_Data_Model.On_Off.Onn
        }

      // otherwise currentCmd defaults to lastCmd (REQ-MHS-4)

      // ------ FAILED Mode -------
      case Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode =>
        // REQ-MHS-5
        currentCmd = Isolette_Data_Model.On_Off.Off
    }

    // -------------- Set values of output ports ------------------
    api.put_heat_control(currentCmd)

    //api.logInfo(s"Sent on currentCmd data port: $currentCmd")

    lastCmd = currentCmd
  }

  def activate(api: Manage_Heat_Source_impl_Operational_Api): Unit = { }

  def deactivate(api: Manage_Heat_Source_impl_Operational_Api): Unit = { }

  def finalise(api: Manage_Heat_Source_impl_Operational_Api): Unit = { }

  def recover(api: Manage_Heat_Source_impl_Operational_Api): Unit = { }
}
