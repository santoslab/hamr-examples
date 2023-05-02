package isolette.Monitor

import org.sireum._
import isolette._
import isolette.GumboXUtil.GumboXResult

// This file was auto-generated.  Do not edit
abstract class Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_TestHarness extends Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_TestApi {
  def testComputeCB(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_upper_alarm_temp: Isolette_Data_Model.Temp_impl): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_lastCmd: Isolette_Data_Model.On_Off.Type = isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.lastCmd

    // Step 2 [CheckPre]: check/filter based on pre-condition (exiting with true if the pre-condition is not satisfied).
    val CEP_Pre_Result: B = isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX.compute_CEP_Pre (In_lastCmd, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // Step 3 [PutInPorts]: put values on the input ports
    put_current_tempWstatus(api_current_tempWstatus)
    put_lower_alarm_temp(api_lower_alarm_temp)
    put_monitor_mode(api_monitor_mode)
    put_upper_alarm_temp(api_upper_alarm_temp)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_alarm_control: Isolette_Data_Model.On_Off.Type = get_alarm_control().get
    val lastCmd: Isolette_Data_Model.On_Off.Type = isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.lastCmd

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX.compute_CEP_Post(In_lastCmd, lastCmd, api_alarm_control, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
