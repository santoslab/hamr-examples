// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Bridge_GumboX {
  /** guarantees lastCmd
    *   Set lastCmd to value of output Cmd port
    * @param lastCmd post-state state variable
    * @param api_heat_control port variable
    */
  @strictpure def compute_spec_lastCmd_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    lastCmd == api_heat_control

  /** guarantees REQ_MHS_1
    *   If the Regulator Mode is INIT, the Heat Control shall be
    *   set to Off.
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_REQ_MHS_1_guarantee(
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == Isolette_Data_Model.On_Off.Off

  /** guarantees REQ_MHS_2
    *   If the Regulator Mode is NORMAL and the Current Temperature is less than
    *   the Lower Desired Temperature, the Heat Control shall be set to On.
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_REQ_MHS_2_guarantee(
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == Isolette_Data_Model.On_Off.Onn

  /** guarantees REQ_MHS_3
    *   If the Regulator Mode is NORMAL and the Current Temperature is greater than
    *   the Upper Desired Temperature, the Heat Control shall be set to Off.
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_REQ_MHS_3_guarantee(
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == Isolette_Data_Model.On_Off.Off

  /** guarantees REQ_MHS_4
    *   If the Regulator Mode is NORMAL and the Current
    *   Temperature is greater than or equal to the Lower Desired Temperature
    *   and less than or equal to the Upper Desired Temperature, the value of
    *   the Heat Control shall not be changed.
    * @param In_lastCmd pre-state state variable
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_REQ_MHS_4_guarantee(
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == In_lastCmd

  /** guarantees REQ_MHS_5
    *   If the Regulator Mode is FAILED, the Heat Control shall be
    *   set to Off.
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_REQ_MHS_5_guarantee(
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == Isolette_Data_Model.On_Off.Off


  /**
    * @param In_lastCmd pre-state state variable
    * @param lastCmd post-state state variable
    * @param api_heat_control port variable
    */
  @strictpure def time_triggered_oracle(
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    compute_spec_lastCmd_guarantee(lastCmd, api_heat_control) &
    compute_case_REQ_MHS_1_guarantee(api_heat_control) &
    compute_case_REQ_MHS_2_guarantee(api_heat_control) &
    compute_case_REQ_MHS_3_guarantee(api_heat_control) &
    compute_case_REQ_MHS_4_guarantee(In_lastCmd, api_heat_control) &
    compute_case_REQ_MHS_5_guarantee(api_heat_control)
}
