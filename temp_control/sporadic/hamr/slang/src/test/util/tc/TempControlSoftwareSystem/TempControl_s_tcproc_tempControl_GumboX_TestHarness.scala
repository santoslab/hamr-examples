// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._
import tc.GumboXUtil.GumboXResult

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
@msig trait TempControl_s_tcproc_tempControl_GumboX_TestHarness extends TempControl_s_tcproc_tempControl_TestApi {
  def verbose: B

  /** Contract-based test harness for the initialise entry point
    */
  def testInitialiseCB(
      ): GumboXResult.Type = {

    if (verbose) {
      println(st"""Pre State Values:
                  """.render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testInitialise()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_fanCmd: Option[CoolingFan.FanCmd.Type] = get_fanCmd()
    val currentSetPoint: TempControlSoftwareSystem.SetPoint_i = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentSetPoint
    val currentFanState: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentFanState
    val latestTemp: TempSensor.Temperature_i = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.latestTemp

    if (verbose) {
      println(st"""Post State Values:
                  |  api_fanCmd = ${api_fanCmd.string}
                  |  currentSetPoint = ${currentSetPoint.string}
                  |  currentFanState = ${currentFanState.string}
                  |  latestTemp = ${latestTemp.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_GumboX.inititialize_IEP_Post(currentFanState, currentSetPoint, latestTemp, api_fanCmd)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }

  def testComputeCBJ(json: String): GumboXResult.Type = {
    tc.JSON.toTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(json) match {
      case Either.Left(o) => return testComputeCBV(o)
      case Either.Right(msg) => halt(msg.string)
    }
  }

  def testComputeCBV(o: TempControl_s_tcproc_tempControl_PreState_Container): GumboXResult.Type = {
    return testComputeCB(o.api_tempChanged, o.api_fanAck, o.api_setPoint, o.api_currentTemp)
  }

  /** Contract-based test harness for the compute entry point
    * @param api_tempChanged incoming event port
    * @param api_fanAck incoming event data port
    * @param api_setPoint incoming event data port
    * @param api_currentTemp incoming data port
    */
  def testComputeCB(
      api_tempChanged: Option[art.Empty],
      api_fanAck: Option[CoolingFan.FanAck.Type],
      api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i],
      api_currentTemp: TempSensor.Temperature_i): GumboXResult.Type = {

    // [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_currentSetPoint: TempControlSoftwareSystem.SetPoint_i = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentSetPoint
    val In_currentFanState: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentFanState
    val In_latestTemp: TempSensor.Temperature_i = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.latestTemp

    // [CheckPre]: check/filter based on pre-condition.
    val CEP_Pre_Result: B = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_GumboX.compute_CEP_Pre (In_currentFanState, In_currentSetPoint, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // [PutInPorts]: put values on the input ports
    if (api_tempChanged.nonEmpty) {
      put_tempChanged()
    }
    if (api_fanAck.nonEmpty) {
      put_fanAck(api_fanAck.get)
    }
    if (api_setPoint.nonEmpty) {
      put_setPoint(api_setPoint.get)
    }
    put_currentTemp(api_currentTemp)

    if (verbose) {
      println(st"""Pre State Values:
                  |  In_currentFanState = ${In_currentFanState.string}
                  |  In_currentSetPoint = ${In_currentSetPoint.string}
                  |  In_latestTemp = ${In_latestTemp.string}
                  |  api_tempChanged = ${api_tempChanged.string}
                  |  api_fanAck = ${api_fanAck.string}
                  |  api_setPoint = ${api_setPoint.string}
                  |  api_currentTemp = ${api_currentTemp.string}""".render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_fanCmd: Option[CoolingFan.FanCmd.Type] = get_fanCmd()
    val currentSetPoint: TempControlSoftwareSystem.SetPoint_i = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentSetPoint
    val currentFanState: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentFanState
    val latestTemp: TempSensor.Temperature_i = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.latestTemp

    if (verbose) {
      println(st"""Post State Values:
                  |  api_fanCmd = ${api_fanCmd.string}
                  |  currentSetPoint = ${currentSetPoint.string}
                  |  currentFanState = ${currentFanState.string}
                  |  latestTemp = ${latestTemp.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_GumboX.compute_CEP_Post(In_currentFanState, In_currentSetPoint, In_latestTemp, currentFanState, currentSetPoint, latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp, api_fanCmd)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }

  def testComputeCBwLJ(json: String): GumboXResult.Type = {
    tc.JSON.toTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(json) match {
      case Either.Left(o) => return testComputeCBwLV(o)
      case Either.Right(msg) => halt(msg.string)
    }
  }

  def testComputeCBwLV(o: TempControl_s_tcproc_tempControl_PreState_Container_PS): GumboXResult.Type = {
    return testComputeCBwL(o.In_currentFanState, o.In_currentSetPoint, o.In_latestTemp, o.api_tempChanged, o.api_fanAck, o.api_setPoint, o.api_currentTemp)
  }

  /** Contract-based test harness for the compute entry point
    * @param In_currentFanState pre-state state variable
    * @param In_currentSetPoint pre-state state variable
    * @param In_latestTemp pre-state state variable
    * @param api_tempChanged incoming event port
    * @param api_fanAck incoming event data port
    * @param api_setPoint incoming event data port
    * @param api_currentTemp incoming data port
    */
  def testComputeCBwL(
      In_currentFanState: CoolingFan.FanCmd.Type,
      In_currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      In_latestTemp: TempSensor.Temperature_i,
      api_tempChanged: Option[art.Empty],
      api_fanAck: Option[CoolingFan.FanAck.Type],
      api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i],
      api_currentTemp: TempSensor.Temperature_i): GumboXResult.Type = {

    // [CheckPre]: check/filter based on pre-condition.
    val CEP_Pre_Result: B = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_GumboX.compute_CEP_Pre (In_currentFanState, In_currentSetPoint, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // [PutInPorts]: put values on the input ports
    if (api_tempChanged.nonEmpty) {
      put_tempChanged()
    }
    if (api_fanAck.nonEmpty) {
      put_fanAck(api_fanAck.get)
    }
    if (api_setPoint.nonEmpty) {
      put_setPoint(api_setPoint.get)
    }
    put_currentTemp(api_currentTemp)

    // [SetInStateVars]: set the pre-state values of state variables
    tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentSetPoint = In_currentSetPoint
    tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentFanState = In_currentFanState
    tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.latestTemp = In_latestTemp

    if (verbose) {
      println(st"""Pre State Values:
                  |  In_currentFanState = ${In_currentFanState.string}
                  |  In_currentSetPoint = ${In_currentSetPoint.string}
                  |  In_latestTemp = ${In_latestTemp.string}
                  |  api_tempChanged = ${api_tempChanged.string}
                  |  api_fanAck = ${api_fanAck.string}
                  |  api_setPoint = ${api_setPoint.string}
                  |  api_currentTemp = ${api_currentTemp.string}""".render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_fanCmd: Option[CoolingFan.FanCmd.Type] = get_fanCmd()
    val currentSetPoint: TempControlSoftwareSystem.SetPoint_i = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentSetPoint
    val currentFanState: CoolingFan.FanCmd.Type = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentFanState
    val latestTemp: TempSensor.Temperature_i = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.latestTemp

    if (verbose) {
      println(st"""Post State Values:
                  |  api_fanCmd = ${api_fanCmd.string}
                  |  currentSetPoint = ${currentSetPoint.string}
                  |  currentFanState = ${currentFanState.string}
                  |  latestTemp = ${latestTemp.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_GumboX.compute_CEP_Post(In_currentFanState, In_currentSetPoint, In_latestTemp, currentFanState, currentSetPoint, latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp, api_fanCmd)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }
}
