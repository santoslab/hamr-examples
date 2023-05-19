// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantees RegulatorStatusIsInitiallyInit
    * @param api_regulator_status outgoing data port
    */
  @strictpure def initialize_RegulatorStatusIsInitiallyInit (
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    api_regulator_status == Isolette_Data_Model.Status.Init_Status

  /** IEP-Guar: Initialize Entrypoint Contracts for manage_regulator_interface
    *
    * @param api_displayed_temp outgoing data port
    * @param api_interface_failure outgoing data port
    * @param api_lower_desired_temp outgoing data port
    * @param api_regulator_status outgoing data port
    * @param api_upper_desired_temp outgoing data port
    */
  @strictpure def initialize_IEP_Guar (
      api_displayed_temp: Isolette_Data_Model.Temp_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_status: Isolette_Data_Model.Status.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): B =
    initialize_RegulatorStatusIsInitiallyInit(api_regulator_status)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param api_displayed_temp outgoing data port
    * @param api_interface_failure outgoing data port
    * @param api_lower_desired_temp outgoing data port
    * @param api_regulator_status outgoing data port
    * @param api_upper_desired_temp outgoing data port
    */
  @strictpure def inititialize_IEP_Post (
      api_displayed_temp: Isolette_Data_Model.Temp_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_status: Isolette_Data_Model.Status.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): B =
    (// IEP-Guar: Initialize Entrypoint contract for manage_regulator_interface
     initialize_IEP_Guar(api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp))

  /** Compute Entrypoint Contract
    *
    * assumes lower_is_not_higher_than_upper
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    */
  @strictpure def compute_spec_lower_is_not_higher_than_upper_assume(
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    api_lower_desired_tempWstatus.value <= api_upper_desired_tempWstatus.value

  /** CEP-T-Assm: Top-level assume contracts for manage_regulator_interface's compute entrypoint
    *
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    */
  @strictpure def compute_CEP_T_Assm (
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    compute_spec_lower_is_not_higher_than_upper_assume(api_lower_desired_tempWstatus, api_upper_desired_tempWstatus)

  /** CEP-Pre: Compute Entrypoint Pre-Condition for manage_regulator_interface
    *
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    */
  @strictpure def compute_CEP_Pre (
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    (// CEP-Assm: assume clauses of manage_regulator_interface's compute entrypoint
     compute_CEP_T_Assm (api_lower_desired_tempWstatus, api_upper_desired_tempWstatus))

  /** guarantees REQ_MRI_1
    *   If the Regulator Mode is INIT,
    *   the Regulator Status shall be set to Init.
    * @param api_regulator_mode incoming data port
    * @param api_regulator_status outgoing data port
    */
  @strictpure def compute_case_REQ_MRI_1(
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode) -->:
      (api_regulator_status == Isolette_Data_Model.Status.Init_Status)

  /** guarantees REQ_MRI_2
    *   If the Regulator Mode is NORMAL,
    *   the Regulator Status shall be set to On
    * @param api_regulator_mode incoming data port
    * @param api_regulator_status outgoing data port
    */
  @strictpure def compute_case_REQ_MRI_2(
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode) -->:
      (api_regulator_status == Isolette_Data_Model.Status.On_Status)

  /** guarantees REQ_MRI_3
    *   If the Regulator Mode is FAILED,
    *   the Regulator Status shall be set to Failed.
    * @param api_regulator_mode incoming data port
    * @param api_regulator_status outgoing data port
    */
  @strictpure def compute_case_REQ_MRI_3(
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode) -->:
      (api_regulator_status == Isolette_Data_Model.Status.Failed_Status)

  /** guarantees REQ_MRI_4
    *   If the Regulator Mode is NORMAL, the
    *   Display Temperature shall be set to the value of the
    *   Current Temperature rounded to the nearest integer.
    * @param api_current_tempWstatus incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_displayed_temp outgoing data port
    */
  @strictpure def compute_case_REQ_MRI_4(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_displayed_temp: Isolette_Data_Model.Temp_impl): B =
    (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode) -->:
      (api_displayed_temp.value == Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.ROUND(api_current_tempWstatus.value))

  /** guarantees REQ_MRI_5
    *   If the Regulator Mode is not NORMAL,
    *   the value of the Display Temperature is UNSPECIFIED.
    */
  @strictpure def compute_case_REQ_MRI_5(
      ): B =
    (T) -->:
      (T)

  /** guarantees REQ_MRI_6
    *   If the Status attribute of the Lower Desired Temperature
    *   or the Upper Desired Temperature is Invalid,
    *   the Regulator Interface Failure shall be set to True.
    * @param api_upper_desired_tempWstatus incoming data port
    * @param api_interface_failure outgoing data port
    */
  @strictpure def compute_case_REQ_MRI_6(
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    (api_upper_desired_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid |
       api_upper_desired_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) -->:
      (api_interface_failure.value)

  /** guarantees REQ_MRI_7
    *   If the Status attribute of the Lower Desired Temperature
    *   and the Upper Desired Temperature is Valid,
    *   the Regulator Interface Failure shall be set to False.
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    * @param api_interface_failure outgoing data port
    */
  @strictpure def compute_case_REQ_MRI_7(
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    (T) -->:
      (api_interface_failure.value == !(api_upper_desired_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid &
          api_lower_desired_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid))

  /** guarantees REQ_MRI_8
    *   If the Regulator Interface Failure is False
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    * @param api_interface_failure outgoing data port
    * @param api_lower_desired_temp outgoing data port
    * @param api_upper_desired_temp outgoing data port
    */
  @strictpure def compute_case_REQ_MRI_8(
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): B =
    (T) -->:
      (!(api_interface_failure.value) ->: (api_lower_desired_temp.value == api_lower_desired_tempWstatus.value &
          api_upper_desired_temp.value == api_upper_desired_tempWstatus.value))

  /** guarantees REQ_MRI_9
    *   If the Regulator Interface Failure is True,
    *   the Desired Range is UNSPECIFIED.
    *   the Desired Range shall be set to the Desired Temperature Range.
    *   (** currently omitted due to the 'UNSPECIFIED' **)
    */
  @strictpure def compute_case_REQ_MRI_9(
      ): B =
    (T) -->:
      (T)

  /** CEP-T-Case: Top-Level case contracts for manage_regulator_interface's compute entrypoint
    *
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    * @param api_displayed_temp outgoing data port
    * @param api_interface_failure outgoing data port
    * @param api_lower_desired_temp outgoing data port
    * @param api_regulator_status outgoing data port
    * @param api_upper_desired_temp outgoing data port
    */
  @strictpure def compute_CEP_T_Case (
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_displayed_temp: Isolette_Data_Model.Temp_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_status: Isolette_Data_Model.Status.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): B =
    compute_case_REQ_MRI_1(api_regulator_mode, api_regulator_status) &
    compute_case_REQ_MRI_2(api_regulator_mode, api_regulator_status) &
    compute_case_REQ_MRI_3(api_regulator_mode, api_regulator_status) &
    compute_case_REQ_MRI_4(api_current_tempWstatus, api_regulator_mode, api_displayed_temp) &
    compute_case_REQ_MRI_5() &
    compute_case_REQ_MRI_6(api_upper_desired_tempWstatus, api_interface_failure) &
    compute_case_REQ_MRI_7(api_lower_desired_tempWstatus, api_upper_desired_tempWstatus, api_interface_failure) &
    compute_case_REQ_MRI_8(api_lower_desired_tempWstatus, api_upper_desired_tempWstatus, api_interface_failure, api_lower_desired_temp, api_upper_desired_temp) &
    compute_case_REQ_MRI_9()

  /** CEP-Post: Compute Entrypoint Post-Condition for manage_regulator_interface
    *
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    * @param api_displayed_temp outgoing data port
    * @param api_interface_failure outgoing data port
    * @param api_lower_desired_temp outgoing data port
    * @param api_regulator_status outgoing data port
    * @param api_upper_desired_temp outgoing data port
    */
  @strictpure def compute_CEP_Post (
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_displayed_temp: Isolette_Data_Model.Temp_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_status: Isolette_Data_Model.Status.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): B =
    (// CEP-T-Case: case clauses of manage_regulator_interface's compute entrypoint
     compute_CEP_T_Case (api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus, api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp))
}
