// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._
import tc.GumboXUtil.GumboXResult

// This file was auto-generated.  Do not edit
@msig trait OperatorInterface_s_tcproc_operatorInterface_GumboX_TestHarness extends OperatorInterface_s_tcproc_operatorInterface_TestApi {
  def testComputeCB(
      api_tempChanged: Option[art.Empty],
      api_currentTemp: TempSensor.Temperature_i): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    //   operatorInterface does not have incoming ports or state variables

    // Step 2 [CheckPre]: check/filter based on pre-condition.
    val CEP_Pre_Result: B = tc.TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_GumboX.compute_CEP_Pre (api_tempChanged, api_currentTemp)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // Step 3 [PutInPorts]: put values on the input ports
    put_tempChanged()
    put_currentTemp(api_currentTemp)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i] = get_setPoint()

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = tc.TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_GumboX.compute_CEP_Post(api_setPoint)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
