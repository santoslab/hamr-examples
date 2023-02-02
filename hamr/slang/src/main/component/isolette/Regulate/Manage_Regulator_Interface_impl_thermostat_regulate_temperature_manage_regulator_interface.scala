// #Sireum #Logika

package isolette.Regulate

import org.sireum._
import isolette._

// This file will not be overwritten so is safe to edit
object Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface {

  // BEGIN FUNCTIONS
  @strictpure def ROUND(num: Base_Types.Float_32): Base_Types.Float_32 = num
  // END FUNCTIONS


  // FIXME: hack of initialization of data port values due lack of proper protocol for thread/port initialization
  // Default lower and upper desired temperatures.
  // Used as a hack because we don't have a proper method for initialization of thread states and port values yet
  val LOW: Isolette_Data_Model.TempWstatus_impl = Isolette_Data_Model.TempWstatus_impl.example() //TODO This example method does not provide proper initial values in a real system.
  val HIGH: Isolette_Data_Model.TempWstatus_impl = Isolette_Data_Model.TempWstatus_impl.example() //TODO This example method does not provide proper initial values in a real system.
  // val DEFAULT_MODE: Isolette_Data_Model.Regulator_Mode.Type = Isolette_Data_Model.Regulator_Mode.Init
  // val DEFAULT_TEMP: Isolette_Data_Model.TempWstatus = Isolette_Data_Model.TempWstatus(InitialValues.DEFAULT_CURRENT_TEMPERATURE, Isolette_Data_Model.ValueStatus.Valid)


  def initialise(api: Manage_Regulator_Interface_impl_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee RegulatorStatusIsInitiallyInit
        api.regulator_status == Isolette_Data_Model.Status.Init_Status
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

//    api.logInfo("Example info logging")
//    api.logDebug("Example debug logging")
//    api.logError("Example error logging")
//
//    api.put_upper_desired_temp(Isolette_Data_Model.Temp_impl.example())
//    api.put_lower_desired_temp(Isolette_Data_Model.Temp_impl.example())
//    api.put_displayed_temp(Isolette_Data_Model.Temp_impl.example())
//    api.put_regulator_status(Isolette_Data_Model.Status.byOrdinal(0).get)
//    api.put_interface_failure(Isolette_Data_Model.Failure_Flag_impl.example())

    // set initial lower desired temp
    api.put_lower_desired_temp(
      Isolette_Data_Model.Temp_impl.example())
    // set initial upper desired temp
    api.put_upper_desired_temp(
      Isolette_Data_Model.Temp_impl.example())
    // set initial displayed temp
    api.put_displayed_temp(
      Isolette_Data_Model.Temp_impl.example())
    // set initial regulator status
    api.put_regulator_status(Isolette_Data_Model.Status.Init_Status)
    // set initial regulator failure
    api.put_interface_failure(
      Isolette_Data_Model.Failure_Flag_impl.example())
  }

  def timeTriggered(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN_COMPUTE_REQUIRES_timeTriggered
        // assume lower_is_not_higher_than_upper
        api.lower_desired_temp.value <= api.upper_desired_temp.value
        // END_COMPUTE REQUIRES_timeTriggered
      ),
      Modifies(
        api
      ),
      Ensures(
        // BEGIN_COMPUTE_ENSURES_timeTriggered
        // case REQMRI1
        //   REQ-MRI-1
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode) -->: (api.regulator_status == Isolette_Data_Model.Status.Init_Status),
        // case REQMRI2
        //   REQ-MRI-2
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode) -->: (api.regulator_status == Isolette_Data_Model.Status.On_Status),
        // case REQMRI3
        //   REQ-MRI-3
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode) -->: (api.regulator_status == Isolette_Data_Model.Status.Failed_Status),
        // case REQMRI4
        //   REQ-MRI-4
        (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode) -->: (api.displayed_temp.value == Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.ROUND(api.current_tempWstatus.value)),
        // case REQMRI6
        //   REQ-MRI-6
        (api.upper_desired_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid | api.upper_desired_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) -->: (api.interface_failure.value),
        // case REQMRI7
        //   REQ-MRI-7
        (T) -->: (api.interface_failure.value == !(api.upper_desired_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid & api.lower_desired_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid)),
        // case REQMRI8
        //   REQ-MRI-8
        (!(api.interface_failure.value)) -->: (api.lower_desired_temp.value == api.lower_desired_tempWstatus.value & api.upper_desired_temp.value == api.upper_desired_tempWstatus.value)
        // END_COMPUTE ENSURES_timeTriggered
      )
    )
    // example api usage

    // -------------- Get values of input ports ------------------

    val lower: Isolette_Data_Model.TempWstatus_impl =
      api.get_lower_desired_tempWstatus().get
    // remove code for old approach that lacked initializers
    // api.getlower_desired_tempWstatus().getOrElseEager(LOW)

    val upper: Isolette_Data_Model.TempWstatus_impl =
      api.get_upper_desired_tempWstatus().get
    // remove code for old approach that lacked initializers
    // api.getupper_desired_tempWstatus().getOrElseEager(HIGH)

    val regulator_mode: Isolette_Data_Model.Regulator_Mode.Type =
      api.get_regulator_mode().get
    // remove code for old approach that lacked initializers
    // api.getregulator_mode().getOrElseEager(DEFAULT_MODE)

    val currentTemp: Isolette_Data_Model.TempWstatus_impl =
      api.get_current_tempWstatus().get
    // remove code for old approach that lacked initializers
    // api.getcurrent_tempWstatus().getOrElseEager(DEFAULT_TEMP)

    // =============================================
    //  Set values for Regulator Status (Table A-6)
    // =============================================

    var regulator_status: Isolette_Data_Model.Status.Type = Isolette_Data_Model.Status.Init_Status

    regulator_mode match {


      // =============================================
      //  Set values for Regulator Status
      // =============================================

      // Note that this code computes a function that is independent of the other
      // aspects of this thread.  This should be reflected in flow declarations.

      // INIT Mode
      case Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode =>
        // REQ-MRI-1: If the Regulator Mode is INIT,
        //   the Regulator Status shall be set to Init.
        regulator_status = Isolette_Data_Model.Status.Init_Status

      // NORMAL Mode
      case Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode =>
        // REQ-MRI-2: If the Regulator Mode is NORMAL,
        //   the Regulator Status shall be set to On.
        regulator_status = Isolette_Data_Model.Status.On_Status

      // FAILED Mode
      case Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode =>
        // REQ-MRI-3: If the Regulator Mode is FAILED,
        //   the Regulator Status shall be set to Failed.
        regulator_status = Isolette_Data_Model.Status.Failed_Status
    }

    api.put_regulator_status(regulator_status)

    // =============================================
    //  Set values for Display Temperature (Table A-6)
    // =============================================

    // Latency: < Max Operator Response Time
    // Tolerance: +/- 0.6 degrees F
    //

    // FIXME: Develop better way to assigning final value to display temperature that
    //        doesn't involve selecting an arbitrary default temperature.
    var display_temperature =
    Isolette_Data_Model.Temp_impl.example()

    regulator_mode match {
      // NORMAL Mode
      case Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode =>
        // REQ-MRI-4: If the Regulator Mode is NORMAL, the
        //  Display Temperature shall be set to the value of the
        //  Current Temperature rounded to the nearest integer.
        // FIXME: add rounding, which is currently omitted (FIXED?)
        display_temperature = Isolette_Data_Model.Temp_impl(ROUND(currentTemp.value))

      // INIT, FAILED Modes

      // REQ-MRI-5:
      //  If the Regulator Mode is not NORMAL,
      //  the value of the Display Temperature is UNSPECIFIED.
      //
      // leave the current temperature set to the default temperature value above.
      // This fulfills the requirement since the value when the Regulator Mode is not NORMAL
      // is unspecified.

      case Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode => // Do nothing
      case Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode => // Do nothing
    }

    api.put_displayed_temp(display_temperature)

    // =============================================
    //  Set values for Regulator Interface Failure internal variable
    // =============================================


    //
    // REQ-MRI-7: If the Status attribute of the Lower Desired Temperature
    // and the Upper Desired Temperature is Valid,
    // the Regulator Interface Failure shall be set to False.

    // FIXME:
    //  I [JMH] believe that these requirements reflect poor design.
    //  I don't even see why desired temperature values should have a status value.
    //  Input validation should be performed on these values in the operator interface.
    //  Improper values (i.e., values with bad status), should never even be passed here.

    // The interface_failure status defaults to TRUE (i.e., failing), which is the safe modality.
    var interface_failure: B = true

    // Extract the value status from both the upper and lower alarm range
    val upper_desired_temp_status: Isolette_Data_Model.ValueStatus.Type = upper.status
    val lower_desired_temp_status: Isolette_Data_Model.ValueStatus.Type = lower.status

    // Set the Monitor Interface Failure value based on the status values of the
    //   upper and lower temperature
    if (!(upper_desired_temp_status == Isolette_Data_Model.ValueStatus.Valid) ||
      !(lower_desired_temp_status == Isolette_Data_Model.ValueStatus.Valid)) {
      // REQ-MRI-6: If the Status attribute of the Lower Desired Temperature
      // or the Upper Desired Temperature is Invalid,
      // the Regulator Interface Failure shall be set to True.
      interface_failure = true
    } else {
      // REQ-MRI-7: If the Status attribute of the Lower Desired Temperature
      // and the Upper Desired Temperature is Valid,
      // the Regulator Interface Failure shall be set to False.
      interface_failure = false
    }

    // create the appropriately typed value to send on the output port and set the port value
    var interface_failure_flag = Isolette_Data_Model.Failure_Flag_impl(interface_failure)
    api.put_interface_failure(interface_failure_flag)


    // =============================================
    //  Set values for Desired Range internal variable
    // =============================================

    // REQ-MRI-9: If the Regulator Interface Failure is True,
    // the Desired Range is UNSPECIFIED.

    // FIXME:
    //   What to do for unspecified case

    if (!interface_failure) {
      // REQ-MRI-8: If the Regulator Interface Failure is False,
      // the Desired Range shall be set to the Desired Temperature Range.
      api.put_lower_desired_temp(Isolette_Data_Model.Temp_impl(lower.value))
      api.put_upper_desired_temp(Isolette_Data_Model.Temp_impl(upper.value))
    } else {
      // FIXME: The requirement is that the values should be unspecified.
      //  For now, set the values to the default values from the initial values file.
      //  We may need to have a discussion to confirm that this is acceptable.
      // Avoid using the Float.NaN because that value is in Scala but not Slang
      // api.put_lower_desired_temp(Isolette_Data_Model.Temp_impl(Float.NaN))
      // api.put_upper_desired_temp(Isolette_Data_Model.Temp_impl(Float.NaN))
      api.put_lower_desired_temp(
        Isolette_Data_Model.Temp_impl.example())
      api.put_upper_desired_temp(
        Isolette_Data_Model.Temp_impl.example())
    }

//    val apiUsage_upper_desired_tempWstatus: Option[Isolette_Data_Model.TempWstatus_impl] = api.get_upper_desired_tempWstatus()
//    api.logInfo(s"Received on upper_desired_tempWstatus: ${apiUsage_upper_desired_tempWstatus}")
//    val apiUsage_lower_desired_tempWstatus: Option[Isolette_Data_Model.TempWstatus_impl] = api.get_lower_desired_tempWstatus()
//    api.logInfo(s"Received on lower_desired_tempWstatus: ${apiUsage_lower_desired_tempWstatus}")
//    val apiUsage_current_tempWstatus: Option[Isolette_Data_Model.TempWstatus_impl] = api.get_current_tempWstatus()
//    api.logInfo(s"Received on current_tempWstatus: ${apiUsage_current_tempWstatus}")
//    val apiUsage_regulator_mode: Option[Isolette_Data_Model.Regulator_Mode.Type] = api.get_regulator_mode()
//    api.logInfo(s"Received on regulator_mode: ${apiUsage_regulator_mode}")
  }

  def activate(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = { }

  def deactivate(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = { }

  def finalise(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = { }

  def recover(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = { }
}
