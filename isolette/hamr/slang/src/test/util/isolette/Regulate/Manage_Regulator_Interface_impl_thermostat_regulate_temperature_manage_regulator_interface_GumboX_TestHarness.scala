package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
abstract class Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness extends Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_TestApi {
  def testComputeCB(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    //   manage_regulator_interface does not have incoming ports or state variables

    // Step 2 [CheckPre]: check/filter based on pre-condition (exiting with true if the pre-condition is not satisfied).
    val CEP_Pre_Result: B = isolette.Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX.compute_CEP_Pre (api_lower_desired_tempWstatus, api_upper_desired_tempWstatus)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // Step 3 [PutInPorts]: put values on the input ports
    put_current_tempWstatus(api_current_tempWstatus)
    put_lower_desired_tempWstatus(api_lower_desired_tempWstatus)
    put_regulator_mode(api_regulator_mode)
    put_upper_desired_tempWstatus(api_upper_desired_tempWstatus)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_displayed_temp: Isolette_Data_Model.Temp_impl = get_displayed_temp().get
    val api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = get_interface_failure().get
    val api_lower_desired_temp: Isolette_Data_Model.Temp_impl = get_lower_desired_temp().get
    val api_regulator_status: Isolette_Data_Model.Status.Type = get_regulator_status().get
    val api_upper_desired_temp: Isolette_Data_Model.Temp_impl = get_upper_desired_temp().get

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = isolette.Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX.compute_CEP_Post(api_current_tempWstatus, api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_lower_desired_tempWstatus, api_regulator_mode, api_regulator_status, api_upper_desired_temp, api_upper_desired_tempWstatus)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
