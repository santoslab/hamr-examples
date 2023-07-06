// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._
import tc.GumboXUtil.GumboXResult

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
@msig trait TempControlPeriodic_p_tcproc_tempControl_GumboX_TestHarness extends TempControlPeriodic_p_tcproc_tempControl_TestApi {
  /** Contract-based test harness for the initialise entry point
    */
  def testInitialiseCB(
      ): GumboXResult.Type = {
    // [InvokeEntryPoint]: invoke the entry point test method
    testInitialise()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_fanCmd: CoolingFan.FanCmd.Type = get_fanCmd().get
    val latestFanCmd: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl.latestFanCmd

    // [CheckPost]: invoke the oracle function
    val postResult = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.inititialize_IEP_Post(latestFanCmd, api_fanCmd)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }

  /** Contract-based test harness for the compute entry point
    * @param api_currentTemp incoming data port
    * @param api_fanAck incoming data port
    * @param api_setPoint incoming data port
    */
  def testComputeCB(
      api_currentTemp: TempSensor.Temperature_i,
      api_fanAck: CoolingFan.FanAck.Type,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i): GumboXResult.Type = {
    // [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_latestFanCmd: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl.latestFanCmd

    // [CheckPre]: check/filter based on pre-condition.
    val CEP_Pre_Result: B = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Pre (In_latestFanCmd, api_currentTemp, api_fanAck, api_setPoint)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // [PutInPorts]: put values on the input ports
    put_currentTemp(api_currentTemp)
    put_fanAck(api_fanAck)
    put_setPoint(api_setPoint)

    // [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_fanCmd: CoolingFan.FanCmd.Type = get_fanCmd().get
    val latestFanCmd: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl.latestFanCmd

    // [CheckPost]: invoke the oracle function
    val postResult = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Post(In_latestFanCmd, latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }

  /** Contract-based test harness for the compute entry point
    * @param In_latestFanCmd pre-state state variable
    * @param api_currentTemp incoming data port
    * @param api_fanAck incoming data port
    * @param api_setPoint incoming data port
    */
  def testComputeCBwL(
      In_latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_fanAck: CoolingFan.FanAck.Type,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i): GumboXResult.Type = {
    // [CheckPre]: check/filter based on pre-condition.
    val CEP_Pre_Result: B = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Pre (In_latestFanCmd, api_currentTemp, api_fanAck, api_setPoint)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // [PutInPorts]: put values on the input ports
    put_currentTemp(api_currentTemp)
    put_fanAck(api_fanAck)
    put_setPoint(api_setPoint)

    // [SetInStateVars]: set the pre-state values of state variables
    tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl.latestFanCmd = In_latestFanCmd

    // [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_fanCmd: CoolingFan.FanCmd.Type = get_fanCmd().get
    val latestFanCmd: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl.latestFanCmd

    // [CheckPost]: invoke the oracle function
    val postResult = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Post(In_latestFanCmd, latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
