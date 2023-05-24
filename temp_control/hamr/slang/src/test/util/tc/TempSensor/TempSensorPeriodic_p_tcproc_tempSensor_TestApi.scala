// #Sireum

package tc.TempSensor

import org.sireum._
import art.{Art, ArtNative, Empty}
import tc._

// This file was auto-generated.  Do not edit
@msig trait TempSensorPeriodic_p_tcproc_tempSensor_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor)
  }

  /** helper function to check TempSensorPeriodic_p_tcproc_tempSensor's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param currentTemp method that will be called with the value of the outgoing data
   *        port 'currentTemp'.
   */
  def check_concrete_output(currentTemp: TempSensor.Temperature_i => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val currentTempValue: TempSensor.Temperature_i = get_currentTemp().get
    if(!currentTemp(currentTempValue)) {
      testFailures = testFailures :+ st"'currentTemp' did not match expected: value of the outgoing data port is ${currentTempValue}"
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
    return ArtNative.observeOutPortValue(Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor.initialization_api.currentTemp_Id).asInstanceOf[Option[TempSensor.Temperature_i_Payload]]
  }

}
