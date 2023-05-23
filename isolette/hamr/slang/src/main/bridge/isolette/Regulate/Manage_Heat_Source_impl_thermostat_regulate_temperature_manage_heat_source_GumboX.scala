// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantees initlastCmd
    * @param lastCmd post-state state variable
    */
  @strictpure def initialize_initlastCmd (
      lastCmd: Isolette_Data_Model.On_Off.Type): B =
    lastCmd == Isolette_Data_Model.On_Off.Off

  /** Initialize Entrypoint Contract
    *
    * guarantees REQ_MHS_1
    *   If the Regulator Mode is INIT, the Heat Control shall be
    *   set to Off
    * @param api_heat_control outgoing data port
    */
  @strictpure def initialize_REQ_MHS_1 (
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == Isolette_Data_Model.On_Off.Off

  /** IEP-Guar: Initialize Entrypoint Contracts for manage_heat_source
    *
    * @param lastCmd post-state state variable
    * @param api_heat_control outgoing data port
    */
  @strictpure def initialize_IEP_Guar (
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    initialize_initlastCmd(lastCmd) &
    initialize_REQ_MHS_1(api_heat_control)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param lastCmd post-state state variable
    * @param api_heat_control outgoing data port
    */
  @strictpure def inititialize_IEP_Post (
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    (// IEP-Guar: Initialize Entrypoint contract for manage_heat_source
     initialize_IEP_Guar(lastCmd, api_heat_control))

  /** Compute Entrypoint Contract
    *
    * assumes lower_is_lower_temp
    * @param api_lower_desired_temp incoming data port
    * @param api_upper_desired_temp incoming data port
    */
  @strictpure def compute_spec_lower_is_lower_temp_assume(
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): B =
    api_lower_desired_temp.value <= api_upper_desired_temp.value

  /** CEP-T-Assm: Top-level assume contracts for manage_heat_source's compute entrypoint
    *
    * @param api_lower_desired_temp incoming data port
    * @param api_upper_desired_temp incoming data port
    */
  @strictpure def compute_CEP_T_Assm (
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): B =
    compute_spec_lower_is_lower_temp_assume(api_lower_desired_temp, api_upper_desired_temp)

  /** CEP-Pre: Compute Entrypoint Pre-Condition for manage_heat_source
    *
    * @param In_lastCmd pre-state state variable
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_temp incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_temp incoming data port
    */
  @strictpure def compute_CEP_Pre (
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): B =
    (// CEP-Assm: assume clauses of manage_heat_source's compute entrypoint
     compute_CEP_T_Assm (api_lower_desired_temp, api_upper_desired_temp))

  /** Compute Entrypoint Contract
    *
    * guarantees lastCmd
    *   Set lastCmd to value of output Cmd port
    * @param lastCmd post-state state variable
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_spec_lastCmd_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    lastCmd == api_heat_control

  /** CEP-T-Guar: Top-level guarantee contracts for manage_heat_source's compute entrypoint
    *
    * @param lastCmd post-state state variable
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_CEP_T_Guar (
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    compute_spec_lastCmd_guarantee(lastCmd, api_heat_control)

  /** guarantees REQ_MHS_1
    *   If the Regulator Mode is INIT, the Heat Control shall be
    *   set to Off.
    * @param api_regulator_mode incoming data port
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_case_REQ_MHS_1(
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode) -->:
      (api_heat_control == Isolette_Data_Model.On_Off.Off)

  /** guarantees REQ_MHS_2
    *   If the Regulator Mode is NORMAL and the Current Temperature is less than
    *   the Lower Desired Temperature, the Heat Control shall be set to On.
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_temp incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_case_REQ_MHS_2(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &
       api_current_tempWstatus.value < api_lower_desired_temp.value) -->:
      (api_heat_control == Isolette_Data_Model.On_Off.Onn)

  /** guarantees REQ_MHS_3
    *   If the Regulator Mode is NORMAL and the Current Temperature is greater than
    *   the Upper Desired Temperature, the Heat Control shall be set to Off.
    * @param api_current_tempWstatus incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_temp incoming data port
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_case_REQ_MHS_3(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &
       api_current_tempWstatus.value > api_upper_desired_temp.value) -->:
      (api_heat_control == Isolette_Data_Model.On_Off.Off)

  /** guarantees REQ_MHS_4
    *   If the Regulator Mode is NORMAL and the Current
    *   Temperature is greater than or equal to the Lower Desired Temperature
    *   and less than or equal to the Upper Desired Temperature, the value of
    *   the Heat Control shall not be changed.
    * @param In_lastCmd pre-state state variable
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_temp incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_temp incoming data port
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_case_REQ_MHS_4(
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &
       (api_current_tempWstatus.value >= api_lower_desired_temp.value &
         api_current_tempWstatus.value <= api_upper_desired_temp.value)) -->:
      (api_heat_control == In_lastCmd)

  /** guarantees REQ_MHS_5
    *   If the Regulator Mode is FAILED, the Heat Control shall be
    *   set to Off.
    * @param api_regulator_mode incoming data port
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_case_REQ_MHS_5(
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode) -->:
      (api_heat_control == Isolette_Data_Model.On_Off.Off)

  /** CEP-T-Case: Top-Level case contracts for manage_heat_source's compute entrypoint
    *
    * @param In_lastCmd pre-state state variable
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_temp incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_temp incoming data port
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_CEP_T_Case (
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    compute_case_REQ_MHS_1(api_regulator_mode, api_heat_control) &
    compute_case_REQ_MHS_2(api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_heat_control) &
    compute_case_REQ_MHS_3(api_current_tempWstatus, api_regulator_mode, api_upper_desired_temp, api_heat_control) &
    compute_case_REQ_MHS_4(In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp, api_heat_control) &
    compute_case_REQ_MHS_5(api_regulator_mode, api_heat_control)

  /** CEP-Post: Compute Entrypoint Post-Condition for manage_heat_source
    *
    * @param In_lastCmd pre-state state variable
    * @param lastCmd post-state state variable
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_temp incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_temp incoming data port
    * @param api_heat_control outgoing data port
    */
  @strictpure def compute_CEP_Post (
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    (// CEP-Guar: guarantee clauses of manage_heat_source's compute entrypoint
     compute_CEP_T_Guar (lastCmd, api_heat_control) & 

     // CEP-T-Case: case clauses of manage_heat_source's compute entrypoint
     compute_CEP_T_Case (In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp, api_heat_control))
}
