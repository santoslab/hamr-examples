// #Sireum

package isolette

import org.sireum._
import art._
import art.Art.PortId._

// This file was auto-generated.  Do not edit

object IPCPorts {
  val Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_App: Art.PortId = Art.PortId.fromZ(49)
  val Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_App: Art.PortId = Art.PortId.fromZ(50)
  val Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_App: Art.PortId = Art.PortId.fromZ(51)
  val Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_App: Art.PortId = Art.PortId.fromZ(52)
  val Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_App: Art.PortId = Art.PortId.fromZ(53)
  val Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_App: Art.PortId = Art.PortId.fromZ(54)
  val Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_App: Art.PortId = Art.PortId.fromZ(55)
  val Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_App: Art.PortId = Art.PortId.fromZ(56)
  val operator_interface_thread_impl_operator_interface_oip_oit_App: Art.PortId = Art.PortId.fromZ(57)
  val Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_App: Art.PortId = Art.PortId.fromZ(58)
  val Heat_Source_impl_heat_source_cpi_heat_controller_App: Art.PortId = Art.PortId.fromZ(59)
  val Main: Art.PortId = Art.PortId.fromZ(60)

  def emptyReceiveOut: MBox2[Art.PortId, DataContent] = {
    return MBox2(portId"0", art.Empty())
  }

  def emptyReceiveAsyncOut: MBox2[Art.PortId, Option[DataContent]] = {
    return MBox2(portId"0", None())
  }
}
