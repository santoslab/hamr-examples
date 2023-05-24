// #Sireum

package tc.TempSensor

import org.sireum._
import art.{Art, ArtNative, Empty}
import tc._

// This file was auto-generated.  Do not edit
@msig trait TempSensor_s_tcproc_tempSensor_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor)
  }

  /** helper function to check TempSensor_s_tcproc_tempSensor's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param currentTemp method that will be called with the value of the outgoing data
   *        port 'currentTemp'.
   * @param tempChanged method that will be called with the number of events to be sent
   *        on the outgoing event port 'tempChanged'.
   */
  def check_concrete_output(currentTemp: TempSensor.Temperature_i => B,
                            tempChanged: Z => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val currentTempValue: TempSensor.Temperature_i = get_currentTemp().get
    if(!currentTemp(currentTempValue)) {
      testFailures = testFailures :+ st"'currentTemp' did not match expected: value of the outgoing data port is ${currentTempValue}"
    }
    // TODO: event port getter should return the number of events in
    //       the output queue when queue sizes > 1 support is added to ART
    val tempChangedValue: Z = if(get_tempChanged().nonEmpty) z"1" else z"0"
    if(!tempChanged(tempChangedValue)) {
      testFailures = testFailures :+ st"'tempChanged' did not match expected: ${tempChangedValue} events were in the outgoing event queue"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // getter for out DataPort
  def get_currentTemp(): Option[TempSensor.Temperature_i] = {
    val value: Option[TempSensor.Temperature_i] = get_currentTemp_payload() match {
      case Some(TempSensor.Temperature_i_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port currentTemp.  Expecting 'TempSensor.Temperature_i_Payload' but received ${v}")
      case _ => None[TempSensor.Temperature_i]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_currentTemp_payload(): Option[TempSensor.Temperature_i_Payload] = {
    return ArtNative.observeOutPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.initialization_api.currentTemp_Id).asInstanceOf[Option[TempSensor.Temperature_i_Payload]]
  }

  // getter for out EventPort
  def get_tempChanged(): Option[art.Empty] = {
    val value: Option[art.Empty] = get_tempChanged_payload() match {
      case Some(Empty()) => Some(Empty())
      case Some(v) => halt(s"Unexpected payload on port tempChanged.  Expecting 'Empty' but received ${v}")
      case _ => None[art.Empty]()
    }
    return value
  }

  // payload getter for out EventPort
  def get_tempChanged_payload(): Option[Empty] = {
    return ArtNative.observeOutPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.initialization_api.tempChanged_Id).asInstanceOf[Option[Empty]]
  }

}
