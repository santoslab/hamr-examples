// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Bridge_GumboX {
  /** guarantees REQ_MMI_1
    *   If the Manage Monitor Interface mode is INIT,
    *   the Monitor Status shall be set to Init.
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQ_MMI_1_guarantee(
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    api_monitor_status == Isolette_Data_Model.Status.Init_Status

  /** guarantees REQ_MMI_2
    *   If the Manage Monitor Interface mode is NORMAL,
    *   the Monitor Status shall be set to On
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQ_MMI_2_guarantee(
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    api_monitor_status == Isolette_Data_Model.Status.On_Status

  /** guarantees REQ_MMI_3
    *   If the Manage Monitor Interface mode is FAILED,
    *   the Monitor Status shall be set to Failed.
    *   Latency: < Max Operator Response Time
    *   Tolerance: N/A
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQ_MMI_3_guarantee(
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    api_monitor_status == Isolette_Data_Model.Status.Failed_Status

  /** guarantees REQ_MMI_4
    *   If the Status attribute of the Lower Alarm Temperature
    *   or the Upper Alarm Temperature is Invalid,
    *   the Monitor Interface Failure shall be set to True
    * @param api_interface_failure port variable
    */
  @strictpure def compute_case_REQ_MMI_4_guarantee(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    api_interface_failure.value

  /** guarantees REQ_MMI_5
    *   If the Status attribute of the Lower Alarm Temperature
    *   and the Upper Alarm Temperature is Valid,
    *   the Monitor Interface Failure shall be set to False
    * @param api_interface_failure port variable
    */
  @strictpure def compute_case_REQ_MMI_5_guarantee(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    !(api_interface_failure.value)

  /** guarantees REQ_MMI_6
    *   If the Monitor Interface Failure is False,
    *   the Alarm Range variable shall be set to the Desired Temperature Range
    * @param api_lower_alarm_temp port variable
    * @param api_lower_alarm_tempWstatus port variable
    * @param api_upper_alarm_temp port variable
    * @param api_upper_alarm_tempWstatus port variable
    */
  @strictpure def compute_case_REQ_MMI_6_guarantee(
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    api_lower_alarm_temp.value == api_lower_alarm_tempWstatus.value & api_upper_alarm_temp.value == api_upper_alarm_tempWstatus.value

  /** guarantees REQ_MMI_7
    *   If the Monitor Interface Failure is True,
    *   the Alarm Range variable is UNSPECIFIED
    */
  @strictpure def compute_case_REQ_MMI_7_guarantee(
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
    compute_case_REQ_MMI_1_guarantee(api_monitor_status) &
    compute_case_REQ_MMI_2_guarantee(api_monitor_status) &
    compute_case_REQ_MMI_3_guarantee(api_monitor_status) &
    compute_case_REQ_MMI_4_guarantee(api_interface_failure) &
    compute_case_REQ_MMI_5_guarantee(api_interface_failure) &
    compute_case_REQ_MMI_6_guarantee(api_lower_alarm_temp, api_lower_alarm_tempWstatus, api_upper_alarm_temp, api_upper_alarm_tempWstatus) &
    compute_case_REQ_MMI_7_guarantee()
}
