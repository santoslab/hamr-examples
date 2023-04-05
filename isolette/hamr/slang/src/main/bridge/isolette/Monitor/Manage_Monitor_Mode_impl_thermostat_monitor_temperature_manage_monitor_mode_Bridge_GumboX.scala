// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Bridge_GumboX {
  /** guarantees REQ_MRM_2
    *   If the current mode is Init, then
    *   the mode is set to NORMAL iff the monitor status is true (valid) (see Table A-15), i.e.,
    *   if  NOT (Monitor Interface Failure OR Monitor Internal Failure)
    *   AND Current Temperature.Status = Valid
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_2_guarantee(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (!(api_interface_failure.value || api_internal_failure.value) && api_current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) == (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode)

  /** guarantees REQ_MRM_3
    *   If the current Monitor mode is Normal, then
    *   the Monitor mode is set to Failed iff
    *   the Monitor status is false, i.e.,
    *   if  (Monitor Interface Failure OR Monitor Internal Failure)
    *   OR NOT(Current Temperature.Status = Valid)
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_3_guarantee(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (api_interface_failure.value || api_internal_failure.value || api_current_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) == (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode)

  /** guarantees REQ_MRM_4
    *   If the current mode is Init, then
    *   the mode is set to Failed iff the time during
    *   which the thread has been in Init mode exceeds the
    *   Monitor Init Timeout value.
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_4_guarantee(
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.timeout_condition_satisfied() == (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode)


  /**
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def time_triggered_oracle(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    compute_case_REQ_MRM_2_guarantee(api_current_tempWstatus, api_interface_failure, api_internal_failure, api_monitor_mode) &
    compute_case_REQ_MRM_3_guarantee(api_current_tempWstatus, api_interface_failure, api_internal_failure, api_monitor_mode) &
    compute_case_REQ_MRM_4_guarantee(api_monitor_mode)
}
