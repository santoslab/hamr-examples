// #Sireum #Logika

package isolette.Monitor

import org.sireum._
import isolette._
import org.sireum.justification._

// This file will not be overwritten so is safe to edit
object Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode {

  // BEGIN FUNCTIONS
  @strictpure def timeout_condition_satisfied(): Base_Types.Boolean = T
  // END FUNCTIONS
  // BEGIN STATE VARS
  var firstInvocationFlag: Base_Types.Boolean = Base_Types.Boolean_example()

  var lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type = Isolette_Data_Model.Monitor_Mode.byOrdinal(0).get
  // END STATE VARS

  def initialise(api: Manage_Monitor_Mode_impl_Initialization_Api): Unit = {
    Contract(
      Modifies(
        api,
        firstInvocationFlag
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee MonitorModeIsInitiallyInit
        api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode,
        // guarantee firstInvocationFlagInitiallyTrue
        firstInvocationFlag == T
        // END INITIALIZES ENSURES
      )
    )
    // example api usage
    api.put_monitor_mode(Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)
    firstInvocationFlag = true
  }

  def timeTriggered(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = {
    Contract(
      Requires(
        In(api).monitor_mode == In(lastMonitorMode)
      ),
      Modifies(
        api,
        lastMonitorMode,
        firstInvocationFlag
      ),
      Ensures(
        api.monitor_mode == lastMonitorMode,
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQMRM2
        //   REQ-MMM-2
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->: ((!(api.interface_failure.value || api.internal_failure.value) && api.current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) == (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode)),
        // case REQMRM3
        //   REQ-MMM-3
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode) -->: ((api.interface_failure.value || api.internal_failure.value || api.current_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) == (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode)),
        // case REQMRM4
        //   REQ-MMM-4
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->: (Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.timeout_condition_satisfied() == (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode))
        // END COMPUTE ENSURES timeTriggered
      )
    )

    // -------------- Get values of input ports ------------------

    val current_tempWstatus: Isolette_Data_Model.TempWstatus_impl =
      api.get_current_tempWstatus().get
    //  -- old code used before initialization methods
    // api.getcurrent_tempWstatus().getOrElseEager(DEFAULT_TEMPWSTATUS)
    val current_temperature_status: Isolette_Data_Model.ValueStatus.Type =
    current_tempWstatus.status

    val interface_failure: Isolette_Data_Model.Failure_Flag_impl =
      api.get_interface_failure().get

    val internal_failure: Isolette_Data_Model.Failure_Flag_impl = api.get_internal_failure().get

    //==============================================================================


    // determine monitor status as specified in FAA REMH Table A-15
    //  monitor_status = NOT (Monitor Interface Failure OR Monitor Internal Failure)
    //                          AND Current Temperature.Status = Valid
    val monitor_status: B = {
      (!(interface_failure.value || internal_failure.value) && current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid)
    }
    Deduce(
      1 #> (interface_failure.value == api.interface_failure.value) by Auto,
      2 #> (internal_failure.value == api.internal_failure.value) by Auto,
    )

    lastMonitorMode match {

      // Transitions from INIT Mode
      case Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode =>

        // REQ-MMM-2: If the current monitor mode is Init, then
        //   the monitor mode is set to NORMAL iff the monitor status is true, i.e.,
        //     if  NOT (Monitor Interface Failure OR Monitor Internal Failure)
        //         AND Current Temperature.Status = Valid
        assert((lastMonitorMode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode))
        if (monitor_status) {
          assert((!(interface_failure.value || internal_failure.value)
            && (current_temperature_status == Isolette_Data_Model.ValueStatus.Valid)))
          assert((!(interface_failure.value || internal_failure.value) && current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid))
          lastMonitorMode = Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode
        }

        // REQ-MMM-4: If the current monitor mode is Init, then
        //     the monitor mode is set to Failed iff the time during
        //     which the thread has been in Init mode exceeds the
        //     Monitor Init Timeout value.
        if (Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.timeout_condition_satisfied()) {//!monitor_status && timeout_condition_satisfied()) {
        lastMonitorMode = Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode
        }

      // otherwise we stay in Init mode

      // Transitions from NORMAL Mode
      case Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode =>

        assert((lastMonitorMode != Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode))
        // REQ-MMM-3: If the current monitor mode is Normal, then
        //     the monitor mode is set to Failed iff
        //     the monitor status is false, i.e.,
        //       if  (Monitor Interface Failure OR Monitor Internal Failure)
        //           OR NOT(Current Temperature.Status = Valid)

        if (!monitor_status) {
          lastMonitorMode = Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode
        }

      // Transitions from FAILED Mode (do nothing -- system must be rebooted)
      case Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode =>
        assert((lastMonitorMode != Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode))
      // do nothing
    }

    api.put_monitor_mode(lastMonitorMode)
    firstInvocationFlag = F

    val apiUsage_current_tempWstatus: Option[Isolette_Data_Model.TempWstatus_impl] = api.get_current_tempWstatus()
    api.logInfo(s"Received on current_tempWstatus: ${apiUsage_current_tempWstatus}")
    val apiUsage_interface_failure: Option[Isolette_Data_Model.Failure_Flag_impl] = api.get_interface_failure()
    api.logInfo(s"Received on interface_failure: ${apiUsage_interface_failure}")
    val apiUsage_internal_failure: Option[Isolette_Data_Model.Failure_Flag_impl] = api.get_internal_failure()
    api.logInfo(s"Received on internal_failure: ${apiUsage_internal_failure}")

    Deduce(
      1#> (In(api).internal_failure == api.internal_failure)  by Auto,
      2 #> (In(api).interface_failure == api.interface_failure) by Auto,
      3 #> (In(api).current_tempWstatus == api.current_tempWstatus) by Auto,
      4 #> (In(api).monitor_mode == In(lastMonitorMode)) by Auto,
    )
  }

  def activate(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = { }

  def deactivate(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = { }

  def finalise(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = { }

  def recover(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = { }
}
