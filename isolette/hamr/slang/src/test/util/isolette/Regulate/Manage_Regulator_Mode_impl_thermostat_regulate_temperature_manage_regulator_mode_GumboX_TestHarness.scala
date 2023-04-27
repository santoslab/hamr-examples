package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit
abstract class Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_GumboX_TestHarness extends Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_TestApi {
  def testComputeCB(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
      api_internal_failure: Isolette_Data_Model.Failure_Flag_impl): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type = isolette.Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.lastRegulatorMode

    // Step 2 [CheckPre]: check/filter based on pre-condition (exiting with true if the pre-condition is not satisfied).
    //   manage_regulator_mode's compute entry point does not have top level assume clauses

    // Step 3 [PutInPorts]: put values on the input ports
    put_current_tempWstatus(api_current_tempWstatus)
    put_interface_failure(api_interface_failure)
    put_internal_failure(api_internal_failure)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = get_regulator_mode().get
    val lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type = isolette.Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.lastRegulatorMode

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = isolette.Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_GumboX.compute_CEP_Post(In_lastRegulatorMode, lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure, api_regulator_mode)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
