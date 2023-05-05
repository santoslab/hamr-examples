// #Sireum

package isolette.Monitor

import org.sireum._
import art.{Art, ArtNative, Empty}
import isolette._

// This file was auto-generated.  Do not edit
@msig trait Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode)
  }

  /** helper function to set the values of all input ports.
   * @param current_tempWstatus payload for data port current_tempWstatus
   * @param interface_failure payload for data port interface_failure
   * @param internal_failure payload for data port internal_failure
   */
  def put_concrete_inputs(current_tempWstatus : Isolette_Data_Model.TempWstatus_impl,
                          interface_failure : Isolette_Data_Model.Failure_Flag_impl,
                          internal_failure : Isolette_Data_Model.Failure_Flag_impl): Unit = {
    put_current_tempWstatus(current_tempWstatus)
    put_interface_failure(interface_failure)
    put_internal_failure(internal_failure)
  }


  /** helper function to check Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param monitor_mode method that will be called with the value of the outgoing data
   *        port 'monitor_mode'.
   */
  def check_concrete_output(monitor_mode: Isolette_Data_Model.Monitor_Mode.Type => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val monitor_modeValue: Isolette_Data_Model.Monitor_Mode.Type = get_monitor_mode().get
    if(!monitor_mode(monitor_modeValue)) {
      testFailures = testFailures :+ st"'monitor_mode' did not match expected: value of the outgoing data port is ${monitor_modeValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in DataPort
  def put_current_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.operational_api.current_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // setter for in DataPort
  def put_interface_failure(value : Isolette_Data_Model.Failure_Flag_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.operational_api.interface_failure_Id, Isolette_Data_Model.Failure_Flag_impl_Payload(value))
  }

  // setter for in DataPort
  def put_internal_failure(value : Isolette_Data_Model.Failure_Flag_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.operational_api.internal_failure_Id, Isolette_Data_Model.Failure_Flag_impl_Payload(value))
  }

  // getter for out DataPort
  def get_monitor_mode(): Option[Isolette_Data_Model.Monitor_Mode.Type] = {
    val value: Option[Isolette_Data_Model.Monitor_Mode.Type] = get_monitor_mode_payload() match {
      case Some(Isolette_Data_Model.Monitor_Mode_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port monitor_mode.  Expecting 'Isolette_Data_Model.Monitor_Mode_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.Monitor_Mode.Type]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_monitor_mode_payload(): Option[Isolette_Data_Model.Monitor_Mode_Payload] = {
    return ArtNative.observeOutPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.initialization_api.monitor_mode_Id).asInstanceOf[Option[Isolette_Data_Model.Monitor_Mode_Payload]]
  }

}
