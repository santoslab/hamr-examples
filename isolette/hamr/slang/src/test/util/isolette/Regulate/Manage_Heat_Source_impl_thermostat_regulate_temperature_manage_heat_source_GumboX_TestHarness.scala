// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._
import isolette.GumboXUtil.GumboXResult

// This file was auto-generated.  Do not edit
@msig trait Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestHarness extends Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_TestApi {
  def testComputeCB(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_temp: Isolette_Data_Model.Temp_impl): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_lastCmd: Isolette_Data_Model.On_Off.Type = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd

    // Step 2 [CheckPre]: check/filter based on pre-condition.
    val CEP_Pre_Result: B = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.compute_CEP_Pre (In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // Step 3 [PutInPorts]: put values on the input ports
    put_current_tempWstatus(api_current_tempWstatus)
    put_lower_desired_temp(api_lower_desired_temp)
    put_regulator_mode(api_regulator_mode)
    put_upper_desired_temp(api_upper_desired_temp)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_heat_control: Isolette_Data_Model.On_Off.Type = get_heat_control().get
    val lastCmd: Isolette_Data_Model.On_Off.Type = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.compute_CEP_Post(In_lastCmd, lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp, api_heat_control)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
