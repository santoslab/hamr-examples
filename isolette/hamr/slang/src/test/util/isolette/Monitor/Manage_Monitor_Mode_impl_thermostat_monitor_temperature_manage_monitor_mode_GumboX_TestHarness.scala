package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
abstract class Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_TestHarness extends Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_TestApi {
  def testComputeCB(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type = isolette.Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.lastMonitorMode

    // Step 2 [CheckPre]: check/filter based on pre-condition (exiting with true if the pre-condition is not satisfied).
    //   manage_monitor_mode's compute entry point does not have top level assume clauses

    // Step 3 [PutInPorts]: put values on the input ports
    put_current_tempWstatus(api_current_tempWstatus)
    put_interface_failure(api_interface_failure)
    put_internal_failure(api_internal_failure)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = get_monitor_mode().get
    val lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type = isolette.Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.lastMonitorMode

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = isolette.Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX.compute_CEP_Post(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_monitor_mode)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
