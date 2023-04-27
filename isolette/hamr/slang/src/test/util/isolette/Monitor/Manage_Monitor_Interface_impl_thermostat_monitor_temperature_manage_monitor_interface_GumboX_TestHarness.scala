package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
abstract class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX_TestHarness extends Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_TestApi {
  def testComputeCB(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
      api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_lastCmd: Isolette_Data_Model.On_Off.Type = isolette.Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.lastCmd

    // Step 2 [CheckPre]: check/filter based on pre-condition (exiting with true if the pre-condition is not satisfied).
    //   manage_monitor_interface's compute entry point does not have top level assume clauses

    // Step 3 [PutInPorts]: put values on the input ports
    put_current_tempWstatus(api_current_tempWstatus)
    put_lower_alarm_tempWstatus(api_lower_alarm_tempWstatus)
    put_monitor_mode(api_monitor_mode)
    put_upper_alarm_tempWstatus(api_upper_alarm_tempWstatus)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = get_interface_failure().get
    val api_lower_alarm_temp: Isolette_Data_Model.Temp_impl = get_lower_alarm_temp().get
    val api_monitor_status: Isolette_Data_Model.Status.Type = get_monitor_status().get
    val api_upper_alarm_temp: Isolette_Data_Model.Temp_impl = get_upper_alarm_temp().get
    val lastCmd: Isolette_Data_Model.On_Off.Type = isolette.Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.lastCmd

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = isolette.Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX.compute_CEP_Post(api_interface_failure, api_lower_alarm_temp, api_lower_alarm_tempWstatus, api_monitor_mode, api_monitor_status, api_upper_alarm_temp, api_upper_alarm_tempWstatus)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
