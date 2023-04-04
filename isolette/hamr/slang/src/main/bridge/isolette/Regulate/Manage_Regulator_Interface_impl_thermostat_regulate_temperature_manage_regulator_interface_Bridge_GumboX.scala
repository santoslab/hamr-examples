// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge_GumboX {
  /** guarantees REQMRI1
    *   REQ-MRI-1
    * @param api_regulator_status port variable
    */
  @strictpure def compute_case_REQMRI1_guarantee(
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    api_regulator_status == Isolette_Data_Model.Status.Init_Status

  /** guarantees REQMRI2
    *   REQ-MRI-2
    * @param api_regulator_status port variable
    */
  @strictpure def compute_case_REQMRI2_guarantee(
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    api_regulator_status == Isolette_Data_Model.Status.On_Status

  /** guarantees REQMRI3
    *   REQ-MRI-3
    * @param api_regulator_status port variable
    */
  @strictpure def compute_case_REQMRI3_guarantee(
      api_regulator_status: Isolette_Data_Model.Status.Type): B =
    api_regulator_status == Isolette_Data_Model.Status.Failed_Status

  /** guarantees REQMRI4
    *   REQ-MRI-4
    * @param api_current_tempWstatus port variable
    * @param api_displayed_temp port variable
    */
  @strictpure def compute_case_REQMRI4_guarantee(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_displayed_temp: Isolette_Data_Model.Temp_impl): B =
    api_displayed_temp.value == Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.ROUND(api_current_tempWstatus.value)

  /** guarantees REQMRI6
    *   REQ-MRI-6
    * @param api_interface_failure port variable
    */
  @strictpure def compute_case_REQMRI6_guarantee(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl): B =
    api_interface_failure.value

  /** guarantees REQMRI7
    *   REQ-MRI-7
    * @param api_interface_failure port variable
    * @param api_lower_desired_tempWstatus port variable
    * @param api_upper_desired_tempWstatus port variable
    */
  @strictpure def compute_case_REQMRI7_guarantee(
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    api_interface_failure.value == !(api_upper_desired_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid & api_lower_desired_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid)

  /** guarantees REQMRI8
    *   REQ-MRI-8
    * @param api_lower_desired_temp port variable
    * @param api_lower_desired_tempWstatus port variable
    * @param api_upper_desired_temp port variable
    * @param api_upper_desired_tempWstatus port variable
    */
  @strictpure def compute_case_REQMRI8_guarantee(
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): B =
    api_lower_desired_temp.value == api_lower_desired_tempWstatus.value & api_upper_desired_temp.value == api_upper_desired_tempWstatus.value


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
    compute_case_REQMRI1_guarantee(api_regulator_status) &
    compute_case_REQMRI2_guarantee(api_regulator_status) &
    compute_case_REQMRI3_guarantee(api_regulator_status) &
    compute_case_REQMRI4_guarantee(api_current_tempWstatus, api_displayed_temp) &
    compute_case_REQMRI6_guarantee(api_interface_failure) &
    compute_case_REQMRI7_guarantee(api_interface_failure, api_lower_desired_tempWstatus, api_upper_desired_tempWstatus) &
    compute_case_REQMRI8_guarantee(api_lower_desired_temp, api_lower_desired_tempWstatus, api_upper_desired_temp, api_upper_desired_tempWstatus)
}
