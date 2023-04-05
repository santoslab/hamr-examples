// #Sireum

package isolette

import org.sireum._
import art._
import art.PortMode._
import art.DispatchPropertyProtocol._
import art.Art.BridgeId._
import art.Art.PortId._

// This file was auto-generated.  Do not edit

object Arch {
  val isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface : isolette.Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge = {
    val upper_desired_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"0", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_upper_desired_tempWstatus", mode = DataIn)
    val lower_desired_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"1", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_lower_desired_tempWstatus", mode = DataIn)
    val current_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"2", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_current_tempWstatus", mode = DataIn)
    val regulator_mode = Port[Isolette_Data_Model.Regulator_Mode.Type] (id = portId"3", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_regulator_mode", mode = DataIn)
    val upper_desired_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"4", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_upper_desired_temp", mode = DataOut)
    val lower_desired_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"5", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_lower_desired_temp", mode = DataOut)
    val displayed_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"6", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_displayed_temp", mode = DataOut)
    val regulator_status = Port[Isolette_Data_Model.Status.Type] (id = portId"7", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_regulator_status", mode = DataOut)
    val interface_failure = Port[Isolette_Data_Model.Failure_Flag_impl] (id = portId"8", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_interface_failure", mode = DataOut)

    isolette.Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge(
      id = bridgeId"0",
      name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      upper_desired_tempWstatus = upper_desired_tempWstatus,
      lower_desired_tempWstatus = lower_desired_tempWstatus,
      current_tempWstatus = current_tempWstatus,
      regulator_mode = regulator_mode,
      upper_desired_temp = upper_desired_temp,
      lower_desired_temp = lower_desired_temp,
      displayed_temp = displayed_temp,
      regulator_status = regulator_status,
      interface_failure = interface_failure
    )
  }
  val isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source : isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Bridge = {
    val current_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"9", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source_current_tempWstatus", mode = DataIn)
    val lower_desired_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"10", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source_lower_desired_temp", mode = DataIn)
    val upper_desired_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"11", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source_upper_desired_temp", mode = DataIn)
    val regulator_mode = Port[Isolette_Data_Model.Regulator_Mode.Type] (id = portId"12", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source_regulator_mode", mode = DataIn)
    val heat_control = Port[Isolette_Data_Model.On_Off.Type] (id = portId"13", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source_heat_control", mode = DataOut)

    isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Bridge(
      id = bridgeId"1",
      name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      current_tempWstatus = current_tempWstatus,
      lower_desired_temp = lower_desired_temp,
      upper_desired_temp = upper_desired_temp,
      regulator_mode = regulator_mode,
      heat_control = heat_control
    )
  }
  val isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode : isolette.Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Bridge = {
    val current_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"14", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode_current_tempWstatus", mode = DataIn)
    val interface_failure = Port[Isolette_Data_Model.Failure_Flag_impl] (id = portId"15", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode_interface_failure", mode = DataIn)
    val internal_failure = Port[Isolette_Data_Model.Failure_Flag_impl] (id = portId"16", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode_internal_failure", mode = DataIn)
    val regulator_mode = Port[Isolette_Data_Model.Regulator_Mode.Type] (id = portId"17", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode_regulator_mode", mode = DataOut)

    isolette.Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Bridge(
      id = bridgeId"2",
      name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      current_tempWstatus = current_tempWstatus,
      interface_failure = interface_failure,
      internal_failure = internal_failure,
      regulator_mode = regulator_mode
    )
  }
  val isolette_single_sensor_Instance_thermostat_regulate_temperature_detect_regulator_failure : isolette.Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_Bridge = {
    val internal_failure = Port[Isolette_Data_Model.Failure_Flag_impl] (id = portId"18", name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_detect_regulator_failure_internal_failure", mode = DataOut)

    isolette.Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_Bridge(
      id = bridgeId"3",
      name = "isolette_single_sensor_Instance_thermostat_regulate_temperature_detect_regulator_failure",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      internal_failure = internal_failure
    )
  }
  val isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface : isolette.Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Bridge = {
    val upper_alarm_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"19", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_upper_alarm_tempWstatus", mode = DataIn)
    val lower_alarm_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"20", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_lower_alarm_tempWstatus", mode = DataIn)
    val current_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"21", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_current_tempWstatus", mode = DataIn)
    val monitor_mode = Port[Isolette_Data_Model.Monitor_Mode.Type] (id = portId"22", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_monitor_mode", mode = DataIn)
    val upper_alarm_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"23", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_upper_alarm_temp", mode = DataOut)
    val lower_alarm_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"24", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_lower_alarm_temp", mode = DataOut)
    val monitor_status = Port[Isolette_Data_Model.Status.Type] (id = portId"25", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_monitor_status", mode = DataOut)
    val interface_failure = Port[Isolette_Data_Model.Failure_Flag_impl] (id = portId"26", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_interface_failure", mode = DataOut)

    isolette.Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Bridge(
      id = bridgeId"4",
      name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      upper_alarm_tempWstatus = upper_alarm_tempWstatus,
      lower_alarm_tempWstatus = lower_alarm_tempWstatus,
      current_tempWstatus = current_tempWstatus,
      monitor_mode = monitor_mode,
      upper_alarm_temp = upper_alarm_temp,
      lower_alarm_temp = lower_alarm_temp,
      monitor_status = monitor_status,
      interface_failure = interface_failure
    )
  }
  val isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm : isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge = {
    val current_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"27", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_current_tempWstatus", mode = DataIn)
    val lower_alarm_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"28", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_lower_alarm_temp", mode = DataIn)
    val upper_alarm_temp = Port[Isolette_Data_Model.Temp_impl] (id = portId"29", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_upper_alarm_temp", mode = DataIn)
    val monitor_mode = Port[Isolette_Data_Model.Monitor_Mode.Type] (id = portId"30", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_monitor_mode", mode = DataIn)
    val alarm_control = Port[Isolette_Data_Model.On_Off.Type] (id = portId"31", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_alarm_control", mode = DataOut)

    isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge(
      id = bridgeId"5",
      name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      current_tempWstatus = current_tempWstatus,
      lower_alarm_temp = lower_alarm_temp,
      upper_alarm_temp = upper_alarm_temp,
      monitor_mode = monitor_mode,
      alarm_control = alarm_control
    )
  }
  val isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode : isolette.Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Bridge = {
    val current_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"32", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode_current_tempWstatus", mode = DataIn)
    val interface_failure = Port[Isolette_Data_Model.Failure_Flag_impl] (id = portId"33", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode_interface_failure", mode = DataIn)
    val internal_failure = Port[Isolette_Data_Model.Failure_Flag_impl] (id = portId"34", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode_internal_failure", mode = DataIn)
    val monitor_mode = Port[Isolette_Data_Model.Monitor_Mode.Type] (id = portId"35", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode_monitor_mode", mode = DataOut)

    isolette.Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Bridge(
      id = bridgeId"6",
      name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      current_tempWstatus = current_tempWstatus,
      interface_failure = interface_failure,
      internal_failure = internal_failure,
      monitor_mode = monitor_mode
    )
  }
  val isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure : isolette.Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge = {
    val internal_failure = Port[Isolette_Data_Model.Failure_Flag_impl] (id = portId"36", name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure_internal_failure", mode = DataOut)

    isolette.Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge(
      id = bridgeId"7",
      name = "isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      internal_failure = internal_failure
    )
  }
  val isolette_single_sensor_Instance_operator_interface_oip_oit : isolette.Isolette.operator_interface_thread_impl_operator_interface_oip_oit_Bridge = {
    val regulator_status = Port[Isolette_Data_Model.Status.Type] (id = portId"37", name = "isolette_single_sensor_Instance_operator_interface_oip_oit_regulator_status", mode = DataIn)
    val monitor_status = Port[Isolette_Data_Model.Status.Type] (id = portId"38", name = "isolette_single_sensor_Instance_operator_interface_oip_oit_monitor_status", mode = DataIn)
    val display_temperature = Port[Isolette_Data_Model.Temp_impl] (id = portId"39", name = "isolette_single_sensor_Instance_operator_interface_oip_oit_display_temperature", mode = DataIn)
    val alarm_control = Port[Isolette_Data_Model.On_Off.Type] (id = portId"40", name = "isolette_single_sensor_Instance_operator_interface_oip_oit_alarm_control", mode = DataIn)
    val lower_desired_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"41", name = "isolette_single_sensor_Instance_operator_interface_oip_oit_lower_desired_tempWstatus", mode = DataOut)
    val upper_desired_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"42", name = "isolette_single_sensor_Instance_operator_interface_oip_oit_upper_desired_tempWstatus", mode = DataOut)
    val lower_alarm_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"43", name = "isolette_single_sensor_Instance_operator_interface_oip_oit_lower_alarm_tempWstatus", mode = DataOut)
    val upper_alarm_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"44", name = "isolette_single_sensor_Instance_operator_interface_oip_oit_upper_alarm_tempWstatus", mode = DataOut)

    isolette.Isolette.operator_interface_thread_impl_operator_interface_oip_oit_Bridge(
      id = bridgeId"8",
      name = "isolette_single_sensor_Instance_operator_interface_oip_oit",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      regulator_status = regulator_status,
      monitor_status = monitor_status,
      display_temperature = display_temperature,
      alarm_control = alarm_control,
      lower_desired_tempWstatus = lower_desired_tempWstatus,
      upper_desired_tempWstatus = upper_desired_tempWstatus,
      lower_alarm_tempWstatus = lower_alarm_tempWstatus,
      upper_alarm_tempWstatus = upper_alarm_tempWstatus
    )
  }
  val isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat : isolette.Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge = {
    val air = Port[Isolette_Data_Model.PhysicalTemp_impl] (id = portId"45", name = "isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat_air", mode = DataIn)
    val current_tempWstatus = Port[Isolette_Data_Model.TempWstatus_impl] (id = portId"46", name = "isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat_current_tempWstatus", mode = DataOut)

    isolette.Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge(
      id = bridgeId"9",
      name = "isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      air = air,
      current_tempWstatus = current_tempWstatus
    )
  }
  val isolette_single_sensor_Instance_heat_source_cpi_heat_controller : isolette.Devices.Heat_Source_impl_heat_source_cpi_heat_controller_Bridge = {
    val heat_control = Port[Isolette_Data_Model.On_Off.Type] (id = portId"47", name = "isolette_single_sensor_Instance_heat_source_cpi_heat_controller_heat_control", mode = DataIn)
    val heat_out = Port[Isolette_Environment.Heat.Type] (id = portId"48", name = "isolette_single_sensor_Instance_heat_source_cpi_heat_controller_heat_out", mode = DataOut)

    isolette.Devices.Heat_Source_impl_heat_source_cpi_heat_controller_Bridge(
      id = bridgeId"10",
      name = "isolette_single_sensor_Instance_heat_source_cpi_heat_controller",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      heat_control = heat_control,
      heat_out = heat_out
    )
  }

  val ad : ArchitectureDescription = {

    ArchitectureDescription(
      components = IS[Art.BridgeId, Bridge] (isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface, isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source, isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode, isolette_single_sensor_Instance_thermostat_regulate_temperature_detect_regulator_failure, isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface, isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm, isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode, isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure, isolette_single_sensor_Instance_operator_interface_oip_oit, isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat, isolette_single_sensor_Instance_heat_source_cpi_heat_controller),

      connections = IS[Art.ConnectionId, UConnection] (Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.upper_desired_temp, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.upper_desired_temp),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.lower_desired_temp, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.lower_desired_temp),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.interface_failure, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.interface_failure),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.regulator_mode, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.regulator_mode),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.regulator_mode, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.regulator_mode),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_detect_regulator_failure.internal_failure, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.internal_failure),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.upper_alarm_temp, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.upper_alarm_temp),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.lower_alarm_temp, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.lower_alarm_temp),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.interface_failure, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.interface_failure),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.monitor_mode, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.monitor_mode),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.monitor_mode, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.monitor_mode),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure.internal_failure, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.internal_failure),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.displayed_temp, to = isolette_single_sensor_Instance_operator_interface_oip_oit.display_temperature),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.regulator_status, to = isolette_single_sensor_Instance_operator_interface_oip_oit.regulator_status),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.heat_control, to = isolette_single_sensor_Instance_heat_source_cpi_heat_controller.heat_control),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.monitor_status, to = isolette_single_sensor_Instance_operator_interface_oip_oit.monitor_status),
                                                       Connection(from = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.alarm_control, to = isolette_single_sensor_Instance_operator_interface_oip_oit.alarm_control),
                                                       Connection(from = isolette_single_sensor_Instance_operator_interface_oip_oit.lower_desired_tempWstatus, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.lower_desired_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_operator_interface_oip_oit.upper_desired_tempWstatus, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.upper_desired_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_operator_interface_oip_oit.lower_alarm_tempWstatus, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.lower_alarm_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_operator_interface_oip_oit.upper_alarm_tempWstatus, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.upper_alarm_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.current_tempWstatus, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.current_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.current_tempWstatus, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.current_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.current_tempWstatus, to = isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.current_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.current_tempWstatus, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.current_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.current_tempWstatus, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.current_tempWstatus),
                                                       Connection(from = isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.current_tempWstatus, to = isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.current_tempWstatus))
    )
  }
}
