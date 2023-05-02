// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantees alarmcontrolIsInitiallyOff
    * @param api_alarm_control port variable
    */
  @strictpure def initialize_alarmcontrolIsInitiallyOff (
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == Isolette_Data_Model.On_Off.Off

  /** Initialize Entrypoint Contract
    *
    * guarantees lastCmdInitiallySetToOff
    * @param lastCmd post-state state variable
    */
  @strictpure def initialize_lastCmdInitiallySetToOff (
      lastCmd: Isolette_Data_Model.On_Off.Type): B =
    lastCmd == Isolette_Data_Model.On_Off.Off

  /** IEP-Guar: Initialize Entrypoint Contracts for manage_alarm
    *
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def initialize_IEP_Guar (
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    initialize_alarmcontrolIsInitiallyOff(api_alarm_control) &
    initialize_lastCmdInitiallySetToOff(lastCmd)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def inititialize_IEP_Post (
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    (// IEP-Guar: Initialize Entrypoint contract for manage_alarm
     initialize_IEP_Guar(lastCmd, api_alarm_control))

  /** Compute Entrypoint Contract
    *
    * assumes NanAssumes
    *   Assume the port values are valid F32s
    * @param api_current_tempWstatus port variable
    * @param api_lower_alarm_temp port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_spec_NanAssumes_assume(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    api_current_tempWstatus.value != F32.NaN &&
      api_upper_alarm_temp.value != F32.NaN &&
      api_lower_alarm_temp.value != F32.NaN

  /** Compute Entrypoint Contract
    *
    * assumes alarmRange
    *   Assume the lower alarm is at least 1.0f less than the upper alarm
    *   to account for the 0.5f tolerance
    * @param api_lower_alarm_temp port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_spec_alarmRange_assume(
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    api_upper_alarm_temp.value - api_lower_alarm_temp.value >
      1.0f

  /** CEP-T-Assm: Top-level assume contracts for manage_alarm's compute entrypoint
    *
    * @param api_current_tempWstatus port variable
    * @param api_lower_alarm_temp port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_CEP_T_Assm (
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    compute_spec_NanAssumes_assume(api_current_tempWstatus, api_lower_alarm_temp, api_upper_alarm_temp) &
    compute_spec_alarmRange_assume(api_lower_alarm_temp, api_upper_alarm_temp)

  /** CEP-Pre: Compute Entrypoint Pre-Condition for manage_alarm
    *
    * @param In_lastCmd pre-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_lower_alarm_temp port variable
    * @param api_monitor_mode port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_CEP_Pre (
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    (// CEP-Assm: assume clauses of manage_alarm's compute entrypoint
     compute_CEP_T_Assm (api_current_tempWstatus, api_lower_alarm_temp, api_upper_alarm_temp))

  /** guarantees REQ_MRM_1
    *   If the Monitor Mode is INIT, the Alarm Control shall be set
    *   to Off.
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_1(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->:
      (api_alarm_control == Isolette_Data_Model.On_Off.Off &
         lastCmd == Isolette_Data_Model.On_Off.Off)

  /** guarantees REQ_MRM_2
    *   If the Monitor Mode is NORMAL and the Current Temperature is
    *   less than the Lower Alarm Temperature or greater than the Upper Alarm
    *   Temperature, the Alarm Control shall be set to On.
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    * @param api_current_tempWstatus port variable
    * @param api_lower_alarm_temp port variable
    * @param api_monitor_mode port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_case_REQ_MRM_2(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
       (api_current_tempWstatus.value < api_lower_alarm_temp.value ||
         api_current_tempWstatus.value > api_upper_alarm_temp.value)) -->:
      (api_alarm_control == Isolette_Data_Model.On_Off.Onn &
         lastCmd == Isolette_Data_Model.On_Off.Onn)

  /** guarantees REQ_MRM_3
    *   If the Monitor Mode is NORMAL and the Current Temperature
    *   is greater than or equal to the Lower Alarm Temperature and less than
    *   the Lower Alarm Temperature +0.5 degrees, or the Current Temperature is
    *   greater than the Upper Alarm Temperature -0.5 degrees and less than or equal
    *   to the Upper Alarm Temperature, the value of the Alarm Control shall
    *   not be changed.
    * @param In_lastCmd pre-state state variable
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    * @param api_current_tempWstatus port variable
    * @param api_lower_alarm_temp port variable
    * @param api_monitor_mode port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_case_REQ_MRM_3(
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
       (api_current_tempWstatus.value >= api_lower_alarm_temp.value &&
         api_current_tempWstatus.value <
           api_lower_alarm_temp.value + 0.5f ||
         api_current_tempWstatus.value >
           api_upper_alarm_temp.value - 0.5f &&
           api_current_tempWstatus.value <= api_upper_alarm_temp.value)) -->:
      (api_alarm_control == In_lastCmd &
         lastCmd == In_lastCmd)

  /** guarantees REQ_MRM_4
    *   If the Monitor Mode is NORMAL and the value of the Current
    *   Temperature is greater than or equal to the Lower Alarm Temperature
    *   +0.5 degrees and less than or equal to the Upper Alarm Temperature
    *   -0.5 degrees, the Alarm Control shall be set to Off.
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    * @param api_current_tempWstatus port variable
    * @param api_lower_alarm_temp port variable
    * @param api_monitor_mode port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_case_REQ_MRM_4(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
       api_current_tempWstatus.value >=
         api_lower_alarm_temp.value + 0.5f &
       api_current_tempWstatus.value <=
         api_upper_alarm_temp.value - 0.5f) -->:
      (api_alarm_control == Isolette_Data_Model.On_Off.Off &
         lastCmd == Isolette_Data_Model.On_Off.Off)

  /** guarantees REQ_MRM_5
    *   If the Monitor Mode is FAILED, the Alarm Control shall be
    *   set to On.
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    * @param api_monitor_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_5(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type): B =
    (api_monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode) -->:
      (api_alarm_control == Isolette_Data_Model.On_Off.Onn &
         lastCmd == Isolette_Data_Model.On_Off.Onn)

  /** CEP-T-Case: Top-Level case contracts for manage_alarm's compute entrypoint
    *
    * @param In_lastCmd pre-state state variable* @param lastCmd post-state state variable* @param api_alarm_control port variable* @param api_current_tempWstatus port variable* @param api_lower_alarm_temp port variable* @param api_monitor_mode port variable* @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_CEP_T_Case (
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    compute_case_REQ_MRM_1(lastCmd, api_alarm_control, api_monitor_mode) &
    compute_case_REQ_MRM_2(lastCmd, api_alarm_control, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp) &
    compute_case_REQ_MRM_3(In_lastCmd, lastCmd, api_alarm_control, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp) &
    compute_case_REQ_MRM_4(lastCmd, api_alarm_control, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp) &
    compute_case_REQ_MRM_5(lastCmd, api_alarm_control, api_monitor_mode)

  /** CEP-Post: Compute Entrypoint Post-Condition for manage_alarm
    *
    * @param In_lastCmd pre-state state variable
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    * @param api_current_tempWstatus port variable
    * @param api_lower_alarm_temp port variable
    * @param api_monitor_mode port variable
    * @param api_upper_alarm_temp port variable
    */
  @strictpure def compute_CEP_Post (
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): B =
    (// CEP-T-Case: case clauses of manage_alarm's compute entrypoint
     compute_CEP_T_Case (In_lastCmd, lastCmd, api_alarm_control, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp))
}
