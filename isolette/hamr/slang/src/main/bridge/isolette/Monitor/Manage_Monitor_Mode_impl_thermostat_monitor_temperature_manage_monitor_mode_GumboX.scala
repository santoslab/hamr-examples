// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantees REQ_MMM_1
    *   Upon the first dispatch of the thread, the monitor mode is Init.
    * @param api_monitor_mode port variable
    */
  @strictpure def initialize_REQ_MMM_1 (
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode

  /** IEP-Guar: Initialize Entrypoint Contracts for manage_monitor_mode
    *
    * @param lastMonitorMode post-state state variable
    * @param api_monitor_mode port variable
    */
  @strictpure def initialize_IEP_Guar (
      lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    initialize_REQ_MMM_1(api_monitor_mode)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param lastMonitorMode post-state state variable
    * @param api_monitor_mode port variable
    */
  @strictpure def inititialize_IEP_Post (
      lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (// IEP-Guar: Initialize Entrypoint contract for manage_monitor_mode
     initialize_IEP_Guar(lastMonitorMode, api_monitor_mode))

  /** guarantees REQ_MRM_2
    *   If the current mode is Init, then
    *   the mode is set to NORMAL iff the monitor status is true (valid) (see Table A-15), i.e.,
    *   if  NOT (Monitor Interface Failure OR Monitor Internal Failure)
    *   AND Current Temperature.Status = Valid
    * @param In_lastMonitorMode pre-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_2(
      In_lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (In_lastMonitorMode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->:
      ((!(api_interface_failure.value || api_internal_failure.value) &&
          api_current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->:
         (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode))

  /** guarantees REQ_MRM_3
    *   If the current Monitor mode is Normal, then
    *   the Monitor mode is set to Failed iff
    *   the Monitor status is false, i.e.,
    *   if  (Monitor Interface Failure OR Monitor Internal Failure)
    *   OR NOT(Current Temperature.Status = Valid)
    * @param In_lastMonitorMode pre-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_3(
      In_lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (In_lastMonitorMode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode) -->:
      ((api_interface_failure.value || api_internal_failure.value ||
          api_current_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) -->:
         (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode))

  /** guarantees REQ_MRM_4
    *   If the current mode is Init, then
    *   the mode is set to Failed iff the time during
    *   which the thread has been in Init mode exceeds the
    *   Monitor Init Timeout value.
    * @param In_lastMonitorMode pre-state state variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_4(
      In_lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (In_lastMonitorMode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->:
      (Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.timeout_condition_satisfied() ==
         (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode))

  /** CEP-T-Case: Top-Level case contracts for manage_monitor_mode's compute entrypoint
    *
    * @param In_lastMonitorMode pre-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_CEP_T_Case (
      In_lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    compute_case_REQ_MRM_2(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_monitor_mode) &
    compute_case_REQ_MRM_3(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_monitor_mode) &
    compute_case_REQ_MRM_4(In_lastMonitorMode, api_monitor_mode)

  /** CEP-Post: Compute Entrypoint Post-Condition for manage_monitor_mode
    *
    * @param In_lastMonitorMode pre-state state variable
    * @param lastMonitorMode post-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_CEP_Post (
      In_lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type,
      lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (// CEP-T-Case: case clauses of manage_monitor_mode's compute entrypoint
     compute_CEP_T_Case (In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_monitor_mode))
}
