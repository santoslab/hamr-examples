package isolette.Regulate

import org.sireum._
import art.{ArtNative_Ext, Empty}
import isolette._

// This file was auto-generated.  Do not edit
abstract class Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_TestApi extends BridgeTestSuite[Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_Bridge](Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_detect_regulator_failure) {

  /** helper function to check Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param internal_failure method that will be called with the value of the outgoing data
   *        port 'internal_failure'.
   */
  def check_concrete_output(internal_failure: Isolette_Data_Model.Failure_Flag_impl => B = internal_failureParam => {T}): Unit = {
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
      case Some(v) => fail(s"Unexpected payload on port internal_failure.  Expecting 'Isolette_Data_Model.Failure_Flag_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.Failure_Flag_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_internal_failure_payload(): Option[Isolette_Data_Model.Failure_Flag_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.internal_failure_Id).asInstanceOf[Option[Isolette_Data_Model.Failure_Flag_impl_Payload]]
  }

}
