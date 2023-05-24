// #Sireum

package tc.TempSensor

import org.sireum._
import tc._
import tc.GumboXUtil.GumboXResult

// This file was auto-generated.  Do not edit
@msig trait TempSensorPeriodic_p_tcproc_tempSensor_GumboX_TestHarness extends TempSensorPeriodic_p_tcproc_tempSensor_TestApi {
  def testComputeCB(
      ): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    //   tempSensor does not have incoming ports or state variables

    // Step 2 [CheckPre]: check/filter based on pre-condition.
    //   tempSensor's compute entry point does not have top level assume clauses

    // Step 3 [PutInPorts]: put values on the input ports
    //   tempSensor does not have incoming ports

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_currentTemp: TempSensor.Temperature_i = get_currentTemp().get

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_GumboX.compute_CEP_Post(api_currentTemp)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
