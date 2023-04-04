// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge_GumboX {
  /** guarantees REQMRM1
    *   REQ-MA-1
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQMRM1_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == Isolette_Data_Model.On_Off.Off & lastCmd == Isolette_Data_Model.On_Off.Off

  /** guarantees REQMRM2
    *   REQ-MA-2
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQMRM2_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == Isolette_Data_Model.On_Off.Onn & lastCmd == Isolette_Data_Model.On_Off.Onn

  /** guarantees REQMRM3
    *   REQ-MA-3
    * @param In_lastCmd pre-state state variable
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQMRM3_guarantee(
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == In_lastCmd & lastCmd == In_lastCmd

  /** guarantees REQMRM4
    *   REQ-MRM-4
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQMRM4_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == Isolette_Data_Model.On_Off.Off & lastCmd == Isolette_Data_Model.On_Off.Off

  /** guarantees REQMRM5
    *   REQ-MRM-5
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQMRM5_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == Isolette_Data_Model.On_Off.Onn & lastCmd == Isolette_Data_Model.On_Off.Onn


  /**
    * @param In_lastCmd pre-state state variable
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def time_triggered_oracle(
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    compute_case_REQMRM1_guarantee(lastCmd, api_alarm_control) &
    compute_case_REQMRM2_guarantee(lastCmd, api_alarm_control) &
    compute_case_REQMRM3_guarantee(In_lastCmd, lastCmd, api_alarm_control) &
    compute_case_REQMRM4_guarantee(lastCmd, api_alarm_control) &
    compute_case_REQMRM5_guarantee(lastCmd, api_alarm_control)
}
