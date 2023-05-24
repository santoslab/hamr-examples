// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import art.{Art, ArtNative, Empty}
import tc._

// This file was auto-generated.  Do not edit
@msig trait TempControl_s_tcproc_tempControl_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl)
  }

  /** helper function to set the values of all input ports.
   * @param currentTemp payload for data port currentTemp
   * @param fanAck payloads for event data port fanAck.
   *   ART currently supports single element event data queues so
   *   only the last element of fanAck will be used
   * @param setPoint payloads for event data port setPoint.
   *   ART currently supports single element event data queues so
   *   only the last element of setPoint will be used
   * @param tempChanged the number of events to place in the tempChanged event port queue.
   *   ART currently supports single element event queues so at most
   *   one event will be placed in the queue.
   */
  def put_concrete_inputs(currentTemp : TempSensor.Temperature_i,
                          fanAck : ISZ[CoolingFan.FanAck.Type],
                          setPoint : ISZ[TempControlSoftwareSystem.SetPoint_i],
                          tempChanged : Z): Unit = {
    put_currentTemp(currentTemp)
    for(v <- fanAck){
      put_fanAck(v)
    }
    for(v <- setPoint){
      put_setPoint(v)
    }
    for(i <- 0 until tempChanged) {
      put_tempChanged()
    }
  }


  /** helper function to check TempControl_s_tcproc_tempControl's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param fanCmd method that will be called with the payloads to be sent
   *        on the outgoing event data port 'fanCmd'.
   */
  def check_concrete_output(fanCmd: ISZ[CoolingFan.FanCmd.Type] => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    var fanCmdValue: ISZ[CoolingFan.FanCmd.Type] = ISZ()
    // TODO: event data port getter should return all of the events/payloads
    //       received on event data ports when queue sizes > 1 support is added
    //       to ART
    if(get_fanCmd().nonEmpty) { fanCmdValue = fanCmdValue :+ get_fanCmd().get }
    if(!fanCmd(fanCmdValue)) {
      testFailures = testFailures :+ st"'fanCmd' did not match expected: received ${fanCmdValue.size} events with the following payloads ${fanCmdValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in DataPort
  def put_currentTemp(value : TempSensor.Temperature_i): Unit = {
    ArtNative.insertInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.currentTemp_Id, TempSensor.Temperature_i_Payload(value))
  }

  // setter for in EventDataPort
  def put_fanAck(value : CoolingFan.FanAck.Type): Unit = {
    ArtNative.insertInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanAck_Id, CoolingFan.FanAck_Payload(value))
  }

  // setter for in EventDataPort
  def put_setPoint(value : TempControlSoftwareSystem.SetPoint_i): Unit = {
    ArtNative.insertInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.setPoint_Id, TempControlSoftwareSystem.SetPoint_i_Payload(value))
  }

  // setter for in EventPort
  def put_tempChanged(): Unit = {
    ArtNative.insertInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.tempChanged_Id, Empty())
  }

  // getter for out EventDataPort
  def get_fanCmd(): Option[CoolingFan.FanCmd.Type] = {
    val value: Option[CoolingFan.FanCmd.Type] = get_fanCmd_payload() match {
      case Some(CoolingFan.FanCmd_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port fanCmd.  Expecting 'CoolingFan.FanCmd_Payload' but received ${v}")
      case _ => None[CoolingFan.FanCmd.Type]()
    }
    return value
  }

  // payload getter for out EventDataPort
  def get_fanCmd_payload(): Option[CoolingFan.FanCmd_Payload] = {
    return ArtNative.observeOutPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.initialization_api.fanCmd_Id).asInstanceOf[Option[CoolingFan.FanCmd_Payload]]
  }

}
