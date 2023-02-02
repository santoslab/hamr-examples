// #Sireum #Logika

package isolette.Monitor

import org.sireum._
import isolette._
import org.sireum.justification.Auto

// This file will not be overwritten so is safe to edit
object Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface {

  // BEGIN FUNCTIONS
  @strictpure def timeout_condition_satisfied(): Base_Types.Boolean = T
  // END FUNCTIONS
  // BEGIN STATE VARS
  var lastCmd: Isolette_Data_Model.On_Off.Type = Isolette_Data_Model.On_Off.byOrdinal(0).get
  // END STATE VARS

  def initialise(api: Manage_Monitor_Interface_impl_Initialization_Api): Unit = {
    Contract(
      Modifies(
        api
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee monitorStatusInitiallyInit
        api.monitor_status == Isolette_Data_Model.Status.Init_Status
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    // set initial lower desired temp
    //api.put_lower_alarm_temp(
      //Temp_impl(
        //InitialValues.DEFAULT_LOWER_ALARM_TEMPERATURE))
    // set initial upper desired temp
    //api.put_upper_alarm_temp(
      //Temp_impl(
        //InitialValues.DEFAULT_UPPER_ALARM_TEMPERATURE))
    // set initial regulator status
    //api.put_monitor_status(InitialValues.DEFAULT_MONITOR_STATUS)
    // set initial regulator failure
    //api.put_interface_failure(
      //Failure_Flag_impl(
        //InitialValues.DEFAULT_MONITOR_INTERFACE_FAILURE_FLAG))

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_upper_alarm_temp(Isolette_Data_Model.Temp_impl.example())
    api.put_lower_alarm_temp(Isolette_Data_Model.Temp_impl.example())
    //api.put_monitor_status(Isolette_Data_Model.Status.byOrdinal(0).get)
    api.put_interface_failure(Isolette_Data_Model.Failure_Flag_impl.example())

    api.put_monitor_status(Isolette_Data_Model.Status.Init_Status)
  }

  def timeTriggered(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = {
    Contract(
      Modifies(
        api,
        lastCmd
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQMMI1
        //   REQ-MMI-1
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->: (api.monitor_status == Isolette_Data_Model.Status.Init_Status),
        // case REQMMI2
        //   REQ-MMI-2
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode) -->: (api.monitor_status == Isolette_Data_Model.Status.On_Status),
        // case REQMMI3
        //   REQ-MMI-3
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode) -->: (api.monitor_status == Isolette_Data_Model.Status.Failed_Status),
        // case REQMMI4
        //   REQ-MMI-4
        (api.lower_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Invalid | api.upper_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Invalid) -->: (api.interface_failure.value),
        // case REQMMI5
        //   REQ-MMI-5
        (api.lower_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid & api.upper_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->: (!(api.interface_failure.value)),
        // case REQMMI6
        //   REQ-MMI-6
        (!(api.interface_failure.value)) -->: (api.lower_alarm_temp.value == api.lower_alarm_tempWstatus.value & api.upper_alarm_temp.value == api.upper_alarm_tempWstatus.value),
        // case REQMMI7
        //   REQ-MMI-7
        (api.interface_failure.value) -->: (T)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val lower: Isolette_Data_Model.TempWstatus_impl =
      api.get_lower_alarm_tempWstatus().get
    // remove code for old approach that lacked initializers
    // api.getlower_alarm_tempWstatus().getOrElseEager(LOW)

    // api.logInfo(s"   XXXXXXXXXXX  ${lower}")
    val upper: Isolette_Data_Model.TempWstatus_impl =
      api.get_upper_alarm_tempWstatus().get
    // remove code for old approach that lacked initializers
    // api.getupper_alarm_tempWstatus().getOrElseEager(HIGH)

    val monitor_mode: Isolette_Data_Model.Monitor_Mode.Type =
      api.get_monitor_mode().get
    // remove code for old approach that lacked initializers
    // api.getmonitor_mode().getOrElseEager(DEFAULT_MODE)

    val currentTemp: Isolette_Data_Model.TempWstatus_impl =
      api.get_current_tempWstatus().get
    // remove code for old approach that lacked initializers
    // api.getcurrent_tempWstatus().getOrElseEager(DEFAULT_TEMP)


    // =============================================
    //  Set values for Monitor Status (Table A-6)
    // =============================================

    var monitor_status: Isolette_Data_Model.Status.Type = Isolette_Data_Model.Status.Init_Status

    monitor_mode match {

      // INIT Mode
      case Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode =>
        //  REQ-MMI-1: If the Manage Monitor Interface mode is INIT,
        //  the Monitor Status shall be set to Init.
        assert(monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)
        monitor_status = Isolette_Data_Model.Status.Init_Status

      // NORMAL Mode
      case Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode =>
        //  REQ-MMI-2: If the Manage Monitor Interface mode is NORMAL,
        //  the Monitor Status shall be set to On.
        assert(monitor_mode != Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)
        monitor_status = Isolette_Data_Model.Status.On_Status

      // FAILED Mode
      case Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode =>
        //  REQ-MMI-3: If the Manage Monitor Interface mode is FAILED,
        //  the Monitor Status shall be set to Failed.
        assert(monitor_mode != Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)
        monitor_status = Isolette_Data_Model.Status.Failed_Status

      //case _ => //TODO This is not needed, but used to make sure that the above is exhaustive as I work on verification (Gage)
      //  assert(monitor_mode != Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)
    }
    assert(((monitor_mode != Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)||(monitor_status == Isolette_Data_Model.Status.Init_Status)))
    assert(((monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)-->:(monitor_status == Isolette_Data_Model.Status.Init_Status)))
    api.put_monitor_status(monitor_status)
    Deduce(
      1 #> (api.monitor_status == monitor_status) by Auto,
      2 #> ((monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)-->:(monitor_status == Isolette_Data_Model.Status.Init_Status)) by Auto,
      3 #> ((monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)-->:(api.monitor_status == Isolette_Data_Model.Status.Init_Status)) by Auto,
    )

    // =============================================
    //  Set values for Monitor Interface Failure internal variable
    // =============================================


    // FIXME: I [JMH] believe that these requirements reflect poor design.
    //  I don't even see why alarm temperature values should have a status value.
    //  Input validation should be performed on these values in the operator interface.
    //  Improper values (i.e., values with bad status), should never even be passed here.
    //

    // The interface_failure status defaults to TRUE, which is the safe modality.
    var interface_failure: B = true

    // Extract the value status from both the upper and lower alarm range
    val upper_alarm_status: Isolette_Data_Model.ValueStatus.Type = upper.status
    val lower_alarm_status: Isolette_Data_Model.ValueStatus.Type = lower.status

    // Set the Monitor Interface Failure value based on the status values of the
    //   upper and lower temperature
    if (!(upper_alarm_status == Isolette_Data_Model.ValueStatus.Valid) ||
      !(lower_alarm_status == Isolette_Data_Model.ValueStatus.Valid)) {
      //  REQ-MMI-4: If the Status attribute of the Lower Alarm Temperature
      //  or the Upper Alarm Temperature is Invalid,
      //  the Monitor Interface Failure shall be set to True.
      interface_failure = true
    } else {
      //  REQ-MMI-5: If the Status attribute of the Lower Alarm Temperature
      //  and the Upper Alarm Temperature is Valid,
      //  the Monitor Interface Failure shall be set to False.
      interface_failure = false
    }

    // create the appropriately typed value to send on the output port and set the port value
    var interface_failure_flag = Isolette_Data_Model.Failure_Flag_impl(interface_failure)
    api.put_interface_failure(interface_failure_flag)


    // =============================================
    //  Set values for Alarm Range internal variable
    // =============================================

    if (!interface_failure) {
      //  REQ-MMI-6: If the Monitor Interface Failure is False,
      //  the Alarm Range variable shall be set to the Desired Temperature Range.
      api.put_lower_alarm_temp(Isolette_Data_Model.Temp_impl(lower.value))
      api.put_upper_alarm_temp(Isolette_Data_Model.Temp_impl(upper.value))
    } else {
      //  REQ-MMI-7: If the Monitor Interface Failure is True,
      //  the Alarm Range variable is UNSPECIFIED.
      //  [RP] Values from initialization should be maintained here, but are not. Putting default values to skirt error
      //       while running unit test - should really be putting an "UNSPECIFIED" value.
      //api.put_lower_alarm_temp(Isolette_Data_Model.Temp_impl(InitialValues.DEFAULT_LOWER_ALARM_TEMPERATURE))
      //api.put_upper_alarm_temp(Isolette_Data_Model.Temp_impl(InitialValues.DEFAULT_UPPER_ALARM_TEMPERATURE))
    }

    val apiUsage_upper_alarm_tempWstatus: Option[Isolette_Data_Model.TempWstatus_impl] = api.get_upper_alarm_tempWstatus()
    api.logInfo(s"Received on upper_alarm_tempWstatus: ${apiUsage_upper_alarm_tempWstatus}")
    val apiUsage_lower_alarm_tempWstatus: Option[Isolette_Data_Model.TempWstatus_impl] = api.get_lower_alarm_tempWstatus()
    api.logInfo(s"Received on lower_alarm_tempWstatus: ${apiUsage_lower_alarm_tempWstatus}")
    val apiUsage_current_tempWstatus: Option[Isolette_Data_Model.TempWstatus_impl] = api.get_current_tempWstatus()
    api.logInfo(s"Received on current_tempWstatus: ${apiUsage_current_tempWstatus}")
    val apiUsage_monitor_mode: Option[Isolette_Data_Model.Monitor_Mode.Type] = api.get_monitor_mode()
    api.logInfo(s"Received on monitor_mode: ${apiUsage_monitor_mode}")
  }

  def activate(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = { }

  def deactivate(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = { }

  def finalise(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = { }

  def recover(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = { }
}
