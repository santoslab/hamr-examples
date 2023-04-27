// #Sireum #Logika

package isolette.Monitor

import org.sireum._
import isolette._
import org.sireum.justification.{Auto, Smt2}

// This file will not be overwritten so is safe to edit
object Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm {

  // BEGIN FUNCTIONS
  @strictpure def timeout_condition_satisfied(): Base_Types.Boolean = T
  // END FUNCTIONS
  // BEGIN STATE VARS
  var lastCmd: Isolette_Data_Model.On_Off.Type = Isolette_Data_Model.On_Off.byOrdinal(0).get
  // END STATE VARS

  def initialise(api: Manage_Alarm_impl_Initialization_Api): Unit = {
    Contract(
      Modifies(
        lastCmd,
        api
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee alarmcontrolIsInitiallyOff
        api.alarm_control == Isolette_Data_Model.On_Off.Off,
        // guarantee lastCmdInitiallySetToOff
        lastCmd == Isolette_Data_Model.On_Off.Off
        // END INITIALIZES ENSURES
      )
    )
    lastCmd = Isolette_Data_Model.On_Off.Off
    //  REQ-MA-1: If the Monitor Mode is INIT, the Alarm Control shall be set
    //    to Off.
    api.put_alarm_control(Isolette_Data_Model.On_Off.Off)

    api.logInfo(s"Sent on alarm_control: ${Isolette_Data_Model.On_Off.Off}")
  }

  def timeTriggered(api: Manage_Alarm_impl_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES timeTriggered
        // assume NanAssumes
        //   Assume the port values are valid F32s
        api.current_tempWstatus.value != F32.NaN &&
          api.upper_alarm_temp.value != F32.NaN &&
          api.lower_alarm_temp.value != F32.NaN,
        // assume alarmRange
        //   Assume the lower alarm is at least 1.0f less than the upper alarm
        //   to account for the 0.5f tolerance
        api.upper_alarm_temp.value - api.lower_alarm_temp.value >
          1.0f
        // END COMPUTE REQUIRES timeTriggered
      ),
      Modifies(lastCmd, api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQ_MRM_1
        //   If the Monitor Mode is INIT, the Alarm Control shall be set
        //   to Off.
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->: (api.alarm_control == Isolette_Data_Model.On_Off.Off &
          lastCmd == Isolette_Data_Model.On_Off.Off),
        // case REQ_MRM_2
        //   If the Monitor Mode is NORMAL and the Current Temperature is
        //   less than the Lower Alarm Temperature or greater than the Upper Alarm
        //   Temperature, the Alarm Control shall be set to On.
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
           (api.current_tempWstatus.value < api.lower_alarm_temp.value ||
             api.current_tempWstatus.value > api.upper_alarm_temp.value)) -->: (api.alarm_control == Isolette_Data_Model.On_Off.Onn &
          lastCmd == Isolette_Data_Model.On_Off.Onn),
        // case REQ_MRM_3
        //   If the Monitor Mode is NORMAL and the Current Temperature
        //   is greater than or equal to the Lower Alarm Temperature and less than
        //   the Lower Alarm Temperature +0.5 degrees, or the Current Temperature is
        //   greater than the Upper Alarm Temperature -0.5 degrees and less than or equal
        //   to the Upper Alarm Temperature, the value of the Alarm Control shall
        //   not be changed.
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
           (api.current_tempWstatus.value >= api.lower_alarm_temp.value &&
             api.current_tempWstatus.value <
               api.lower_alarm_temp.value + 0.5f ||
             api.current_tempWstatus.value >
               api.upper_alarm_temp.value - 0.5f &&
               api.current_tempWstatus.value <= api.upper_alarm_temp.value)) -->: (api.alarm_control == In(lastCmd) &
          lastCmd == In(lastCmd)),
        // case REQ_MRM_4
        //   If the Monitor Mode is NORMAL and the value of the Current
        //   Temperature is greater than or equal to the Lower Alarm Temperature
        //   +0.5 degrees and less than or equal to the Upper Alarm Temperature
        //   -0.5 degrees, the Alarm Control shall be set to Off.
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
           api.current_tempWstatus.value >=
             api.lower_alarm_temp.value + 0.5f &
           api.current_tempWstatus.value <=
             api.upper_alarm_temp.value - 0.5f) -->: (api.alarm_control == Isolette_Data_Model.On_Off.Off &
          lastCmd == Isolette_Data_Model.On_Off.Off),
        // case REQ_MRM_5
        //   If the Monitor Mode is FAILED, the Alarm Control shall be
        //   set to On.
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode) -->: (api.alarm_control == Isolette_Data_Model.On_Off.Onn &
          lastCmd == Isolette_Data_Model.On_Off.Onn)
        // END COMPUTE ENSURES timeTriggered
      )
    )

    // -------------- Get values of input ports ------------------

    val lowerAlarm: Isolette_Data_Model.Temp_impl =
      api.get_lower_alarm_temp().get

    val upperAlarm: Isolette_Data_Model.Temp_impl =
      api.get_upper_alarm_temp().get

    val monitor_mode: Isolette_Data_Model.Monitor_Mode.Type =
      api.get_monitor_mode().get

    val currentTemp: Isolette_Data_Model.TempWstatus_impl =
      api.get_current_tempWstatus().get

    // current command defaults to value of last command
    var currentCmd: Isolette_Data_Model.On_Off.Type = lastCmd

    monitor_mode match {
      case Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode =>
        // REQ_MRM_1
        currentCmd = Isolette_Data_Model.On_Off.Off
      case Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode =>
        if (currentTemp.value < lowerAlarm.value || currentTemp.value > upperAlarm.value) {
          // REQ_MRM_2
          currentCmd = Isolette_Data_Model.On_Off.Onn
        }
        else if ((currentTemp.value >= lowerAlarm.value && currentTemp.value < lowerAlarm.value + 0.5f) ||
          (currentTemp.value > upperAlarm.value - 0.5f && currentTemp.value <= upperAlarm.value)) {
          // REQ_MRM_3
          currentCmd = lastCmd
        }
        else if (currentTemp.value >= lowerAlarm.value + 0.5f && currentTemp.value <= upperAlarm.value - 0.5f) {
          // REQ_MRM_4
          currentCmd = Isolette_Data_Model.On_Off.Off
        }
        else {
          assert (F) // should be infeasible
        }
      case Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode =>
        // REQ_MRM_5
        currentCmd = Isolette_Data_Model.On_Off.Onn
    }
    lastCmd = currentCmd
    api.put_alarm_control(currentCmd)

    api.logInfo(s"Sent on alarm_control: $lastCmd")
  }

  def activate(api: Manage_Alarm_impl_Operational_Api): Unit = { }

  def deactivate(api: Manage_Alarm_impl_Operational_Api): Unit = { }

  def finalise(api: Manage_Alarm_impl_Operational_Api): Unit = { }

  def recover(api: Manage_Alarm_impl_Operational_Api): Unit = { }
}
