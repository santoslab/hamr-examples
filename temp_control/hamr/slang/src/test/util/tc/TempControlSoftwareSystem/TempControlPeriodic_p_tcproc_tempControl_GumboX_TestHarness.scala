// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._
import tc.GumboXUtil.GumboXResult

// This file was auto-generated.  Do not edit
@msig trait TempControlPeriodic_p_tcproc_tempControl_GumboX_TestHarness extends TempControlPeriodic_p_tcproc_tempControl_TestApi {
  def testComputeCB(
      api_currentTemp: TempSensor.Temperature_i,
      api_fanAck: CoolingFan.FanAck.Type,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_latestFanCmd: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl.latestFanCmd

    // Step 2 [CheckPre]: check/filter based on pre-condition.
    val CEP_Pre_Result: B = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Pre (In_latestFanCmd, api_currentTemp, api_fanAck, api_setPoint)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // Step 3 [PutInPorts]: put values on the input ports
    put_currentTemp(api_currentTemp)
    put_fanAck(api_fanAck)
    put_setPoint(api_setPoint)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_fanCmd: CoolingFan.FanCmd.Type = get_fanCmd().get
    val latestFanCmd: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl.latestFanCmd

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Post(In_latestFanCmd, latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
