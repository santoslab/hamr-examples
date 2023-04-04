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

  /** guarantees ReqMHS1
    *   Req-MHS-1
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_ReqMHS1_guarantee(
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == Isolette_Data_Model.On_Off.Off

  /** guarantees ReqMHS2
    *   Req-MHS-2
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_ReqMHS2_guarantee(
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == Isolette_Data_Model.On_Off.Onn

  /** guarantees ReqMHS3
    *   Req-MHS-3
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_ReqMHS3_guarantee(
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == Isolette_Data_Model.On_Off.Off

  /** guarantees ReqMHS4
    *   Req-MHS-4
    * @param In_lastCmd pre-state state variable
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_ReqMHS4_guarantee(
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      api_heat_control: Isolette_Data_Model.On_Off.Type): B =
    api_heat_control == In_lastCmd

  /** guarantees ReqMHS5
    *   Req-MHS-5
    * @param api_heat_control port variable
    */
  @strictpure def compute_case_ReqMHS5_guarantee(
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
    compute_case_ReqMHS1_guarantee(api_heat_control) &
    compute_case_ReqMHS2_guarantee(api_heat_control) &
    compute_case_ReqMHS3_guarantee(api_heat_control) &
    compute_case_ReqMHS4_guarantee(In_lastCmd, api_heat_control) &
    compute_case_ReqMHS5_guarantee(api_heat_control)
}
