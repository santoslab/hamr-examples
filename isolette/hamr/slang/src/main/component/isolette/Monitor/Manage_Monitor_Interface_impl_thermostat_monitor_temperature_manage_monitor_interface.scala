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

  val unspecified: Isolette_Data_Model.Temp_impl = Isolette_Data_Model.Temp_impl(0f)

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

    api.put_upper_alarm_temp(Isolette_Data_Model.Temp_impl.example())
    api.put_lower_alarm_temp(Isolette_Data_Model.Temp_impl.example())
    api.put_interface_failure(Isolette_Data_Model.Failure_Flag_impl.example())

    api.put_monitor_status(Isolette_Data_Model.Status.Init_Status)

    api.logInfo(s"Sent on upper_alarm_temp: ${Isolette_Data_Model.Temp_impl.example()}")
    api.logInfo(s"Sent on lower_alarm_temp: ${Isolette_Data_Model.Temp_impl.example()}")
    api.logInfo(s"Sent on interface_failure: ${Isolette_Data_Model.Failure_Flag_impl.example()}")
    api.logInfo(s"Sent on monitor_status: ${Isolette_Data_Model.Status.Init_Status}")
  }

  def timeTriggered(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = {
    Contract(
      Modifies(
        api,
        lastCmd
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQ_MMI_1
        //   If the Manage Monitor Interface mode is INIT,
        //   the Monitor Status shall be set to Init.
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->: (api.monitor_status == Isolette_Data_Model.Status.Init_Status),
        // case REQ_MMI_2
        //   If the Manage Monitor Interface mode is NORMAL,
        //   the Monitor Status shall be set to On
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode) -->: (api.monitor_status == Isolette_Data_Model.Status.On_Status),
        // case REQ_MMI_3
        //   If the Manage Monitor Interface mode is FAILED,
        //   the Monitor Status shall be set to Failed.
        //   Latency: < Max Operator Response Time
        //   Tolerance: N/A
        (api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode) -->: (api.monitor_status == Isolette_Data_Model.Status.Failed_Status),
        // case REQ_MMI_4
        //   If the Status attribute of the Lower Alarm Temperature
        //   or the Upper Alarm Temperature is Invalid,
        //   the Monitor Interface Failure shall be set to True
        (api.lower_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Invalid |
           api.upper_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Invalid) -->: (api.interface_failure.value),
        // case REQ_MMI_5
        //   If the Status attribute of the Lower Alarm Temperature
        //   and the Upper Alarm Temperature is Valid,
        //   the Monitor Interface Failure shall be set to False
        (api.lower_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid &
           api.upper_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->: (!(api.interface_failure.value)),
        // case REQ_MMI_6
        //   If the Monitor Interface Failure is False,
        //   the Alarm Range variable shall be set to the Desired Temperature Range
        (T) -->: (!(api.interface_failure.value) -->:
          (api.lower_alarm_temp.value == api.lower_alarm_tempWstatus.value &
            api.upper_alarm_temp.value == api.upper_alarm_tempWstatus.value)),
        // case REQ_MMI_7
        //   If the Monitor Interface Failure is True,
        //   the Alarm Range variable is UNSPECIFIED
        (T) -->: (api.interface_failure.value -->: T)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val lower: Isolette_Data_Model.TempWstatus_impl = api.get_lower_alarm_tempWstatus().get

    val upper: Isolette_Data_Model.TempWstatus_impl = api.get_upper_alarm_tempWstatus().get

    val monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = api.get_monitor_mode().get

    val currentTemp: Isolette_Data_Model.TempWstatus_impl = api.get_current_tempWstatus().get

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
    }
    assert(((monitor_mode != Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)||(monitor_status == Isolette_Data_Model.Status.Init_Status)))
    assert(((monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)-->:(monitor_status == Isolette_Data_Model.Status.Init_Status)))
    api.put_monitor_status(monitor_status)

    api.logInfo(s"Sent on monitor_status: $monitor_status")

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

    api.logInfo(s"Sent on interface_failure: $interface_failure_flag")


    // =============================================
    //  Set values for Alarm Range internal variable
    // =============================================

    if (!interface_failure) {
      //  REQ-MMI-6: If the Monitor Interface Failure is False,
      //  the Alarm Range variable shall be set to the Desired Temperature Range.
      api.put_lower_alarm_temp(Isolette_Data_Model.Temp_impl(lower.value))
      api.put_upper_alarm_temp(Isolette_Data_Model.Temp_impl(upper.value))

      api.logInfo(s"Sent on lower_alarm_temp: ${Isolette_Data_Model.Temp_impl(lower.value)}")
      api.logInfo(s"Sent on upper_alarm_temp: ${Isolette_Data_Model.Temp_impl(upper.value)}")
    } else {
      //  REQ-MMI-7: If the Monitor Interface Failure is True,
      //  the Alarm Range variable is UNSPECIFIED.
      //  [RP] Values from initialization should be maintained here, but are not. Putting default values to skirt error
      //       while running unit test - should really be putting an "UNSPECIFIED" value.
      api.put_lower_alarm_temp(unspecified)
      api.put_upper_alarm_temp(unspecified)

      api.logInfo(s"Sent on lower_alarm_temp: ${Isolette_Data_Model.Temp_impl(lower.value)}")
      api.logInfo(s"Sent on upper_alarm_temp: ${Isolette_Data_Model.Temp_impl(upper.value)}")
    }
  }

  def activate(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = { }

  def deactivate(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = { }

  def finalise(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = { }

  def recover(api: Manage_Monitor_Interface_impl_Operational_Api): Unit = { }
}
