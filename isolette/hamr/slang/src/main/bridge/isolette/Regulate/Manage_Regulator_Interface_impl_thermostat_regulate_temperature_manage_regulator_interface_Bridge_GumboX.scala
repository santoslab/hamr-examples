// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge_GumboX {
  /** guarantees REQ_MRI_1
    *   If the Regulator Mode is INIT,
    *   the Regulator Status shall be set to Init.
    * @param api_regulator_status port variable
    */
  @strictpure def compute_case_REQ_MRI_1_guarantee(
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    api_regulator_status == Isolette_Data_Model.Status.Init_Status

  /** guarantees REQ_MRI_2
    *   If the Regulator Mode is NORMAL,
    *   the Regulator Status shall be set to On
    * @param api_regulator_status port variable
    */
  @strictpure def compute_case_REQ_MRI_2_guarantee(
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    api_regulator_status == Isolette_Data_Model.Status.On_Status

  /** guarantees REQ_MRI_3
    *   If the Regulator Mode is FAILED,
    *   the Regulator Status shall be set to Failed.
    * @param api_regulator_status port variable
    */
  @strictpure def compute_case_REQ_MRI_3_guarantee(
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    api_regulator_status == Isolette_Data_Model.Status.Failed_Status

  /** guarantees REQ_MRI_4
    *   If the Regulator Mode is NORMAL, the
    *   Display Temperature shall be set to the value of the
    *   Current Temperature rounded to the nearest integer.
    * @param api_current_tempWstatus port variable
    * @param api_displayed_temp port variable
    */
  @strictpure def compute_case_REQ_MRI_4_guarantee(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_displayed_temp: Isolette_Data_Model.Temp_impl): B =
    api_displayed_temp.value == Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.ROUND(api_current_tempWstatus.value)

  /** guarantees REQ_MRI_5
    *   If the Regulator Mode is not NORMAL,
    *   the value of the Display Temperature is UNSPECIFIED.
    */
  @strictpure def compute_case_REQ_MRI_5_guarantee(
      ): B =
    T

  /** guarantees REQ_MRI_6
    *   If the Status attribute of the Lower Desired Temperature
    *   or the Upper Desired Temperature is Invalid,
    *   the Regulator Interface Failure shall be set to True.
    * @param api_interface_failure port variable
    */
  @strictpure def compute_case_REQ_MRI_6_guarantee(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    api_interface_failure.value

  /** guarantees REQ_MRI_7
    *   If the Status attribute of the Lower Desired Temperature
    *   and the Upper Desired Temperature is Valid,
    *   the Regulator Interface Failure shall be set to False.
    * @param api_interface_failure port variable
    * @param api_lower_desired_tempWstatus port variable
    * @param api_upper_desired_tempWstatus port variable
    */
  @strictpure def compute_case_REQ_MRI_7_guarantee(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    api_interface_failure.value == !(api_upper_desired_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid & api_lower_desired_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid)

  /** guarantees REQ_MRI_8
    *   If the Regulator Interface Failure is False
    * @param api_lower_desired_temp port variable
    * @param api_lower_desired_tempWstatus port variable
    * @param api_upper_desired_temp port variable
    * @param api_upper_desired_tempWstatus port variable
    */
  @strictpure def compute_case_REQ_MRI_8_guarantee(
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    api_lower_desired_temp.value == api_lower_desired_tempWstatus.value & api_upper_desired_temp.value == api_upper_desired_tempWstatus.value

  /** guarantees REQ_MRI_9
    *   If the Regulator Interface Failure is True,
    *   the Desired Range is UNSPECIFIED.
    *   the Desired Range shall be set to the Desired Temperature Range.
    *   (** currently omitted due to the 'UNSPECIFIED' **)
    */
  @strictpure def compute_case_REQ_MRI_9_guarantee(
      ): B =
    T


  /**
    * @param api_current_tempWstatus port variable
    * @param api_displayed_temp port variable
    * @param api_interface_failure port variable
    * @param api_lower_desired_temp port variable
    * @param api_lower_desired_tempWstatus port variable
    * @param api_regulator_status port variable
    * @param api_upper_desired_temp port variable
    * @param api_upper_desired_tempWstatus port variable
    */
  @strictpure def time_triggered_oracle(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_displayed_temp: Isolette_Data_Model.Temp_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_regulator_status: Isolette_Data_Model.Status.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    compute_case_REQ_MRI_1_guarantee(api_regulator_status) &
    compute_case_REQ_MRI_2_guarantee(api_regulator_status) &
    compute_case_REQ_MRI_3_guarantee(api_regulator_status) &
    compute_case_REQ_MRI_4_guarantee(api_current_tempWstatus, api_displayed_temp) &
    compute_case_REQ_MRI_5_guarantee() &
    compute_case_REQ_MRI_6_guarantee(api_interface_failure) &
    compute_case_REQ_MRI_7_guarantee(api_interface_failure, api_lower_desired_tempWstatus, api_upper_desired_tempWstatus) &
    compute_case_REQ_MRI_8_guarantee(api_lower_desired_temp, api_lower_desired_tempWstatus, api_upper_desired_temp, api_upper_desired_tempWstatus) &
    compute_case_REQ_MRI_9_guarantee()
}
