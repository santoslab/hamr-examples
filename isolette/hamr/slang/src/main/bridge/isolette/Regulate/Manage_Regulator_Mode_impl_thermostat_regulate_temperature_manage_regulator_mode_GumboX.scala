// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantees REQ_MRM_1
    *   The initial mode of the regular is INIT
    * @param api_regulator_mode port variable
    */
  @strictpure def initialize_REQ_MRM_1 (
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param api_regulator_mode port variable
    */
  @strictpure def inititialize_IEP_Post (
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    (
     // IEP-Guar: Initialize Entrypoint contract for manage_regulator_mode
     initialize_REQ_MRM_1(api_regulator_mode))

  /** guarantees REQ_MRM_2
    *   'transition from Init to Normal'
    *   If the current regulator mode is Init, then
    *   the regulator mode is set to NORMAL iff the regulator status is valid (see Table A-10), i.e.,
    *     if NOT (Regulator Interface Failure OR Regulator Internal Failure)
    *        AND Current Temperature.Status = Valid
    * @param In_lastRegulatorMode pre-state state variable
    * @param lastRegulatorMode post-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_regulator_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_2(
      In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    (In_lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode) -->:
      ((!(api_interface_failure.value || api_internal_failure.value) &&
          api_current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->:
         (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &&
           lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode))

  /** guarantees REQ_MRM_Maintain_Normal
    *   'maintaining NORMAL, NORMAL to NORMAL'
    *   If the current regulator mode is Normal, then
    *   the regulator mode is stays normal iff
    *   the regulaor status is not false i.e.,
    *          if NOT(
    *              (Regulator Interface Failure OR Regulator Internal Failure)
    *              OR NOT(Current Temperature.Status = Valid)
    *          )
    * @param In_lastRegulatorMode pre-state state variable
    * @param lastRegulatorMode post-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_regulator_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_Maintain_Normal(
      In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    (In_lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode) -->:
      ((!(api_interface_failure.value || api_internal_failure.value) &&
          api_current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->:
         (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &&
           lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode))

  /** guarantees REQ_MRM_3
    *   'transition for NORMAL to FAILED'
    *   If the current regulator mode is Normal, then
    *   the regulator mode is set to Failed iff
    *   the regulator status is false, i.e.,
    *      if  (Regulator Interface Failure OR Regulator Internal Failure)
    *          OR NOT(Current Temperature.Status = Valid)
    * @param In_lastRegulatorMode pre-state state variable
    * @param lastRegulatorMode post-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_regulator_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_3(
      In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    (In_lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode) -->:
      (((api_interface_failure.value || api_internal_failure.value) &&
          api_current_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) -->:
         (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode &&
           lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode))

  /** guarantees REQ_MRM_4
    *   'transition from INIT to FAILED' 
    *   If the current regulator mode is Init, then
    *   the regulator mode and lastRegulatorMode state value is set to Failed iff
    *   the regulator status is false, i.e.,
    *          if  (Regulator Interface Failure OR Regulator Internal Failure)
    *          OR NOT(Current Temperature.Status = Valid)
    * @param In_lastRegulatorMode pre-state state variable
    * @param lastRegulatorMode post-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_regulator_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_4(
      In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    (In_lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode) -->:
      (((api_interface_failure.value || api_internal_failure.value) &&
          api_current_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) -->:
         (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode &&
           lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode))

  /** guarantees REQ_MRM_MaintainFailed
    *   'maintaining FAIL, FAIL to FAIL'
    *   If the current regulator mode is Failed, then
    *   the regulator mode remains in the Failed state and the LastRegulator mode remains Failed.REQ-MRM-Maintain-Failed
    * @param In_lastRegulatorMode pre-state state variable
    * @param lastRegulatorMode post-state state variable
    * @param api_regulator_mode port variable
    */
  @strictpure def compute_case_REQ_MRM_MaintainFailed(
      In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    (In_lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode) -->:
      (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode &&
         lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode)

  /** CEP-T-Case: Top-Level case contracts for manage_regulator_mode's compute entrypoint
    *
    * @param In_lastRegulatorMode pre-state state variable* @param lastRegulatorMode post-state state variable* @param api_current_tempWstatus port variable* @param api_interface_failure port variable* @param api_internal_failure port variable* @param api_regulator_mode port variable
    */
  @strictpure def compute_CEP_T_Case (
      In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    compute_case_REQ_MRM_2(In_lastRegulatorMode, lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_regulator_mode) &
    compute_case_REQ_MRM_Maintain_Normal(In_lastRegulatorMode, lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_regulator_mode) &
    compute_case_REQ_MRM_3(In_lastRegulatorMode, lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_regulator_mode) &
    compute_case_REQ_MRM_4(In_lastRegulatorMode, lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_regulator_mode) &
    compute_case_REQ_MRM_MaintainFailed(In_lastRegulatorMode, lastRegulatorMode, api_regulator_mode)

  /** CEP-Post: Compute Entrypoint Post-Condition for manage_regulator_mode
    *
    * @param In_lastRegulatorMode pre-state state variable
    * @param lastRegulatorMode post-state state variable
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_regulator_mode port variable
    */
  @strictpure def compute_CEP_Post (
      In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type,
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    (// CEP-T-Case: case clauses of manage_regulator_mode's compute entrypoint
     compute_CEP_T_Case (In_lastRegulatorMode, lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_regulator_mode))
}
