// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantees monitorStatusInitiallyInit
    * @param api_monitor_status port variable
    */
  @strictpure def initialize_monitorStatusInitiallyInit (
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    api_monitor_status == Isolette_Data_Model.Status.Init_Status

  /** IEP-Guar: Initialize Entrypoint Contracts for manage_monitor_interface
    *
    * @param lastCmd post-state state variable
    * @param api_interface_failure port variable
    * @param api_lower_alarm_temp port variable
    * @param api_monitor_status port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def initialize_IEP_Guar (
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_status: Isolette_Data_Model.Status.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    initialize_monitorStatusInitiallyInit(api_monitor_status)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param lastCmd post-state state variable
    * @param api_interface_failure port variable
    * @param api_lower_alarm_temp port variable
    * @param api_monitor_status port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def inititialize_IEP_Post (
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_status: Isolette_Data_Model.Status.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    (// IEP-Guar: Initialize Entrypoint contract for manage_monitor_interface
     initialize_IEP_Guar(lastCmd, api_interface_failure, api_lower_alarm_temp, api_monitor_status, api_upper_alarm_temp))

  /** guarantees REQ_MMI_1
    *   If the Manage Monitor Interface mode is INIT,
    *   the Monitor Status shall be set to Init.
    * @param api_monitor_mode port variable
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQ_MMI_1(
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->:
      (api_monitor_status == Isolette_Data_Model.Status.Init_Status)

  /** guarantees REQ_MMI_2
    *   If the Manage Monitor Interface mode is NORMAL,
    *   the Monitor Status shall be set to On
    * @param api_monitor_mode port variable
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQ_MMI_2(
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode) -->:
      (api_monitor_status == Isolette_Data_Model.Status.On_Status)

  /** guarantees REQ_MMI_3
    *   If the Manage Monitor Interface mode is FAILED,
    *   the Monitor Status shall be set to Failed.
    *   Latency: < Max Operator Response Time
    *   Tolerance: N/A
    * @param api_monitor_mode port variable
    * @param api_monitor_status port variable
    */
  @strictpure def compute_case_REQ_MMI_3(
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_monitor_status: Isolette_Data_Model.Status.Type): B =
    (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode) -->:
      (api_monitor_status == Isolette_Data_Model.Status.Failed_Status)

  /** guarantees REQ_MMI_4
    *   If the Status attribute of the Lower Alarm Temperature
    *   or the Upper Alarm Temperature is Invalid,
    *   the Monitor Interface Failure shall be set to True
    * @param api_interface_failure port variable
    * @param api_lower_alarm_tempWstatus port variable
    * @param api_upper_alarm_tempWstatus port variable
    */
  @strictpure def compute_case_REQ_MMI_4(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    (api_lower_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Invalid |
       api_upper_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Invalid) -->:
      (api_interface_failure.value)

  /** guarantees REQ_MMI_5
    *   If the Status attribute of the Lower Alarm Temperature
    *   and the Upper Alarm Temperature is Valid,
    *   the Monitor Interface Failure shall be set to False
    * @param api_interface_failure port variable
    * @param api_lower_alarm_tempWstatus port variable
    * @param api_upper_alarm_tempWstatus port variable
    */
  @strictpure def compute_case_REQ_MMI_5(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    (api_lower_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid &
       api_upper_alarm_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->:
      (!(api_interface_failure.value))

  /** guarantees REQ_MMI_6
    *   If the Monitor Interface Failure is False,
    *   the Alarm Range variable shall be set to the Desired Temperature Range
    * @param api_interface_failure port variable
    * @param api_lower_alarm_temp port variable
    * @param api_lower_alarm_tempWstatus port variable
    * @param api_upper_alarm_temp port variable
    * @param api_upper_alarm_tempWstatus port variable
    */
  @strictpure def compute_case_REQ_MMI_6(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    (T) -->:
      (!(api_interface_failure.value) -->:
         (api_lower_alarm_temp.value == api_lower_alarm_tempWstatus.value &
           api_upper_alarm_temp.value == api_upper_alarm_tempWstatus.value))

  /** guarantees REQ_MMI_7
    *   If the Monitor Interface Failure is True,
    *   the Alarm Range variable is UNSPECIFIED
    * @param api_interface_failure port variable
    */
  @strictpure def compute_case_REQ_MMI_7(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    (T) -->:
      (api_interface_failure.value -->: T)

  /** CEP-T-Case: Top-Level case contracts for manage_monitor_interface's compute entrypoint
    *
    * @param api_interface_failure port variable
    * @param api_lower_alarm_temp port variable
    * @param api_lower_alarm_tempWstatus port variable
    * @param api_monitor_mode port variable
    * @param api_monitor_status port variable
    * @param api_upper_alarm_temp port variable
    * @param api_upper_alarm_tempWstatus port variable
    */
  @strictpure def compute_CEP_T_Case (
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_monitor_status: Isolette_Data_Model.Status.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    compute_case_REQ_MMI_1(api_monitor_mode, api_monitor_status) &
    compute_case_REQ_MMI_2(api_monitor_mode, api_monitor_status) &
    compute_case_REQ_MMI_3(api_monitor_mode, api_monitor_status) &
    compute_case_REQ_MMI_4(api_interface_failure, api_lower_alarm_tempWstatus, api_upper_alarm_tempWstatus) &
    compute_case_REQ_MMI_5(api_interface_failure, api_lower_alarm_tempWstatus, api_upper_alarm_tempWstatus) &
    compute_case_REQ_MMI_6(api_interface_failure, api_lower_alarm_temp, api_lower_alarm_tempWstatus, api_upper_alarm_temp, api_upper_alarm_tempWstatus) &
    compute_case_REQ_MMI_7(api_interface_failure)

  /** CEP-Post: Compute Entrypoint Post-Condition for manage_monitor_interface
    *
    * @param In_lastCmd pre-state state variable
    * @param lastCmd post-state state variable
    * @param api_interface_failure port variable
    * @param api_lower_alarm_temp port variable
    * @param api_lower_alarm_tempWstatus port variable
    * @param api_monitor_mode port variable
    * @param api_monitor_status port variable
    * @param api_upper_alarm_temp port variable
    * @param api_upper_alarm_tempWstatus port variable
    */
  @strictpure def compute_CEP_Post (
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_monitor_status: Isolette_Data_Model.Status.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    (// CEP-T-Case: case clauses of manage_monitor_interface's compute entrypoint
     compute_CEP_T_Case (api_interface_failure, api_lower_alarm_temp, api_lower_alarm_tempWstatus, api_monitor_mode, api_monitor_status, api_upper_alarm_temp, api_upper_alarm_tempWstatus))
}
