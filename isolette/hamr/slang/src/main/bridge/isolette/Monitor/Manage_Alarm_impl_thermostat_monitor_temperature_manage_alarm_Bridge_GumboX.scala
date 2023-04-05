// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
object Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge_GumboX {
  /** guarantees REQ_MRM_1
    *   If the Monitor Mode is INIT, the Alarm Control shall be set
    *   to Off.
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQ_MRM_1_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == Isolette_Data_Model.On_Off.Off & lastCmd == Isolette_Data_Model.On_Off.Off

  /** guarantees REQ_MRM_2
    *   If the Monitor Mode is NORMAL and the Current Temperature is
    *   less than the Lower Alarm Temperature or greater than the Upper Alarm
    *   Temperature, the Alarm Control shall be set to On.
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQ_MRM_2_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == Isolette_Data_Model.On_Off.Onn & lastCmd == Isolette_Data_Model.On_Off.Onn

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
    */
  @strictpure def compute_case_REQ_MRM_3_guarantee(
      In_lastCmd: Isolette_Data_Model.On_Off.Type,
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == In_lastCmd & lastCmd == In_lastCmd

  /** guarantees REQ_MRM_4
    *   If the Monitor Mode is NORMAL and the value of the Current
    *   Temperature is greater than or equal to the Lower Alarm Temperature
    *   +0.5 degrees and less than or equal to the Upper Alarm Temperature
    *   -0.5 degrees, the Alarm Control shall be set to Off.
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQ_MRM_4_guarantee(
      lastCmd: Isolette_Data_Model.On_Off.Type,
      api_alarm_control: Isolette_Data_Model.On_Off.Type): B =
    api_alarm_control == Isolette_Data_Model.On_Off.Off & lastCmd == Isolette_Data_Model.On_Off.Off

  /** guarantees REQ_MRM_5
    *   If the Monitor Mode is FAILED, the Alarm Control shall be
    *   set to On.
    * @param lastCmd post-state state variable
    * @param api_alarm_control port variable
    */
  @strictpure def compute_case_REQ_MRM_5_guarantee(
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
    compute_case_REQ_MRM_1_guarantee(lastCmd, api_alarm_control) &
    compute_case_REQ_MRM_2_guarantee(lastCmd, api_alarm_control) &
    compute_case_REQ_MRM_3_guarantee(In_lastCmd, lastCmd, api_alarm_control) &
    compute_case_REQ_MRM_4_guarantee(lastCmd, api_alarm_control) &
    compute_case_REQ_MRM_5_guarantee(lastCmd, api_alarm_control)
}
