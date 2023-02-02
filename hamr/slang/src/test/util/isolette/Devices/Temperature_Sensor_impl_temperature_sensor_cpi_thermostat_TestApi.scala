package isolette.Devices

import org.sireum._
import art.{ArtNative_Ext, Empty}
import isolette._

// This file was auto-generated.  Do not edit
abstract class Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_TestApi extends BridgeTestSuite[Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge](Arch.isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat) {

  /** helper function to set the values of all input ports.
   * @param air payload for data port air
   */
  def put_concrete_inputs(air : Isolette_Data_Model.PhysicalTemp_impl): Unit = {
    put_air(air)
  }


  /** helper function to check Temperature_Sensor_impl_temperature_sensor_cpi_thermostat's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param current_tempWstatus method that will be called with the value of the outgoing data
   *        port 'current_tempWstatus'.
   */
  def check_concrete_output(current_tempWstatus: Isolette_Data_Model.TempWstatus_impl => B = current_tempWstatusParam => {T}): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val current_tempWstatusValue: Isolette_Data_Model.TempWstatus_impl = get_current_tempWstatus().get
    if(!current_tempWstatus(current_tempWstatusValue)) {
      testFailures = testFailures :+ st"'current_tempWstatus' did not match expected: value of the outgoing data port is ${current_tempWstatusValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in DataPort
  def put_air(value : Isolette_Data_Model.PhysicalTemp_impl): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.air_Id, Isolette_Data_Model.PhysicalTemp_impl_Payload(value))
  }

  // getter for out DataPort
  def get_current_tempWstatus(): Option[Isolette_Data_Model.TempWstatus_impl] = {
    val value: Option[Isolette_Data_Model.TempWstatus_impl] = get_current_tempWstatus_payload() match {
      case Some(Isolette_Data_Model.TempWstatus_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port current_tempWstatus.  Expecting 'Isolette_Data_Model.TempWstatus_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.TempWstatus_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_current_tempWstatus_payload(): Option[Isolette_Data_Model.TempWstatus_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.current_tempWstatus_Id).asInstanceOf[Option[Isolette_Data_Model.TempWstatus_impl_Payload]]
  }

}
