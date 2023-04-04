// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Bridge_GumboX {
  /** guarantees REQMRM2
    *   REQ-MRM-2
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_regulator_mode port variable
    */
  @strictpure def compute_case_REQMRM2_guarantee(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    (!(api_interface_failure.value || api_internal_failure.value) && api_current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->: (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode)

  /** guarantees REQMRM4
    *   REQ-MRM-4
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_regulator_mode port variable
    */
  @strictpure def compute_case_REQMRM4_guarantee(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    ((api_interface_failure.value || api_internal_failure.value) && api_current_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) -->: (api_regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode)


  /**
    * @param api_current_tempWstatus port variable
    * @param api_interface_failure port variable
    * @param api_internal_failure port variable
    * @param api_regulator_mode port variable
    */
  @strictpure def time_triggered_oracle(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type): B =
    compute_case_REQMRM2_guarantee(api_current_tempWstatus, api_interface_failure, api_internal_failure, api_regulator_mode) &
    compute_case_REQMRM4_guarantee(api_current_tempWstatus, api_interface_failure, api_internal_failure, api_regulator_mode)
}
