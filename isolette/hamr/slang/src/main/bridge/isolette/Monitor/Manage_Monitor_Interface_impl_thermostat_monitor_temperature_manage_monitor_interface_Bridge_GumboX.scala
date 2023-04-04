// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Bridge_GumboX {
  /** guarantees REQMMI1
    *   REQ-MMI-1
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQMMI1_guarantee(
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    api_monitor_status == Isolette_Data_Model.Status.Init_Status

  /** guarantees REQMMI2
    *   REQ-MMI-2
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQMMI2_guarantee(
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    api_monitor_status == Isolette_Data_Model.Status.On_Status

  /** guarantees REQMMI3
    *   REQ-MMI-3
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQMMI3_guarantee(
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    api_monitor_status == Isolette_Data_Model.Status.Failed_Status

  /** guarantees REQMMI4
    *   REQ-MMI-4
    * @param api_interface_failure port variable
    */
  @strictpure def compute_case_REQMMI4_guarantee(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    api_interface_failure.value

  /** guarantees REQMMI5
    *   REQ-MMI-5
    * @param api_interface_failure port variable
    */
  @strictpure def compute_case_REQMMI5_guarantee(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    !(api_interface_failure.value)

  /** guarantees REQMMI6
    *   REQ-MMI-6
    * @param api_lower_alarm_temp port variable
    * @param api_lower_alarm_tempWstatus port variable
    * @param api_upper_alarm_temp port variable
    * @param api_upper_alarm_tempWstatus port variable
    */
  @strictpure def compute_case_REQMMI6_guarantee(
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    api_lower_alarm_temp.value == api_lower_alarm_tempWstatus.value & api_upper_alarm_temp.value == api_upper_alarm_tempWstatus.value

  /** guarantees REQMMI7
    *   REQ-MMI-7
    */
  @strictpure def compute_case_REQMMI7_guarantee(
      ): B =
    T


  /**
    * @param api_interface_failure port variable
    * @param api_lower_alarm_temp port variable
    * @param api_lower_alarm_tempWstatus port variable
    * @param api_monitor_status port variable
    * @param api_upper_alarm_temp port variable
    * @param api_upper_alarm_tempWstatus port variable
    */
  @strictpure def time_triggered_oracle(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_monitor_status: Isolette_Data_Model.Status.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    compute_case_REQMMI1_guarantee(api_monitor_status) &
    compute_case_REQMMI2_guarantee(api_monitor_status) &
    compute_case_REQMMI3_guarantee(api_monitor_status) &
    compute_case_REQMMI4_guarantee(api_interface_failure) &
    compute_case_REQMMI5_guarantee(api_interface_failure) &
    compute_case_REQMMI6_guarantee(api_lower_alarm_temp, api_lower_alarm_tempWstatus, api_upper_alarm_temp, api_upper_alarm_tempWstatus) &
    compute_case_REQMMI7_guarantee()
}
