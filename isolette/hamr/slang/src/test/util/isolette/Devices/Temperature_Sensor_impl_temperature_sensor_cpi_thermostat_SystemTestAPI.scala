// #Sireum

package isolette.Devices

import org.sireum._
import art._
import isolette.SystemTestSuiteSlang.runtimeMonitorStream
import isolette._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_SystemTestAPI {
  /** helper method to set the values of all incoming ports
    * @param api_air incoming data port
    */
  def put_concrete_inputs(api_air: Isolette_Data_Model.PhysicalTemp_impl): Unit = {
    put_air(api_air)
  }

  // setter for incoming data port
  def put_air(value: Isolette_Data_Model.PhysicalTemp_impl): Unit = {
    Art.insertInInfrastructurePort(Arch.isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.operational_api.air_Id, Isolette_Data_Model.PhysicalTemp_impl_Payload(value))
  }

  def fetchContainer(): isolette.Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS = {
    if (runtimeMonitorStream.contains(Arch.isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.id)) {
      val (_, postContainer_) = runtimeMonitorStream.get(Arch.isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.id).get
      return postContainer_.asInstanceOf[isolette.Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS]
    }
    else {
      assert(F, s"No post state recorded for ${Arch.isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.name}")
      halt(s"No post state recorded for ${Arch.isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.name}")
    }
  }

  def check_concrete_outputs(api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl): Unit = {
    var failureReasons: ISZ[ST] = ISZ()

    val actual_current_tempWstatus = get_api_current_tempWstatus()
    if (api_current_tempWstatus != actual_current_tempWstatus) {
      failureReasons = failureReasons :+ st"'current_tempWstatus' did not match expected.  Expected: $api_current_tempWstatus, Actual: $actual_current_tempWstatus"
    }

    assert(failureReasons.isEmpty, st"${(failureReasons, "\n")}".render)
  }

  def get_api_current_tempWstatus(): Isolette_Data_Model.TempWstatus_impl = {
    return fetchContainer().api_current_tempWstatus
  }
}