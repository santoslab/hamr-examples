// #Sireum

package isolette.Monitor

import org.sireum._
import art.{Art, ArtNative, Empty}
import isolette._

// This file was auto-generated.  Do not edit
@msig trait Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure)
  }

  /** helper function to check Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param internal_failure method that will be called with the value of the outgoing data
   *        port 'internal_failure'.
   */
  def check_concrete_output(internal_failure: Isolette_Data_Model.Failure_Flag_impl => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val internal_failureValue: Isolette_Data_Model.Failure_Flag_impl = get_internal_failure().get
    if(!internal_failure(internal_failureValue)) {
      testFailures = testFailures :+ st"'internal_failure' did not match expected: value of the outgoing data port is ${internal_failureValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // getter for out DataPort
  def get_internal_failure(): Option[Isolette_Data_Model.Failure_Flag_impl] = {
    val value: Option[Isolette_Data_Model.Failure_Flag_impl] = get_internal_failure_payload() match {
      case Some(Isolette_Data_Model.Failure_Flag_impl_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port internal_failure.  Expecting 'Isolette_Data_Model.Failure_Flag_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.Failure_Flag_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_internal_failure_payload(): Option[Isolette_Data_Model.Failure_Flag_impl_Payload] = {
    return ArtNative.observeOutPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure.initialization_api.internal_failure_Id).asInstanceOf[Option[Isolette_Data_Model.Failure_Flag_impl_Payload]]
  }

}
