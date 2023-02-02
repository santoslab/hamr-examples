// #Sireum
package isolette

import org.sireum._
import art.Art
import art.scheduling.legacy.Legacy
import art.scheduling.roundrobin.RoundRobin
import art.scheduling.static.Schedule.{DSchedule, DScheduleSpec, Slot}
import art.scheduling.static.StaticScheduler

// This file was auto-generated.  Do not edit

@datatype class ProcessorTimingProperties(val clockPeriod: Option[Z],
                                          val framePeriod: Option[Z],
                                          val maxDomain: Option[Z],
                                          val slotTime: Option[Z])

@datatype class ThreadTimingProperties(val domain: Option[Z],
                                       val computeExecutionTime: Option[(Z, Z)])

object Schedulers {


  val isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  val isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  val isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  val isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  val isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  val isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  val isolette_single_sensor_Instance_operator_interface_oip_oit_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  val isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  val isolette_single_sensor_Instance_heat_source_cpi_heat_controller_timingProperties: ThreadTimingProperties = ThreadTimingProperties(
    computeExecutionTime = None(),
    domain = None())

  // roundRobinSchedule represents the component dispatch order
  val roundRobinSchedule: ISZ[art.Bridge] = Arch.ad.components

  val framePeriod: Z = 1000
  val numComponents: Z = Arch.ad.components.size
  val maxExecutionTime: Z = numComponents / framePeriod

  // staticSchedule represents the component dispatch order
  val staticSchedule: DScheduleSpec = DScheduleSpec(0, 0, DSchedule(ISZ(
    Slot(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.id, maxExecutionTime),
    Slot(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.id, maxExecutionTime),
    Slot(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.id, maxExecutionTime),
    Slot(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.id, maxExecutionTime),
    Slot(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.id, maxExecutionTime),
    Slot(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.id, maxExecutionTime),
    Slot(Arch.isolette_single_sensor_Instance_operator_interface_oip_oit.id, maxExecutionTime),
    Slot(Arch.isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.id, maxExecutionTime),
    Slot(Arch.isolette_single_sensor_Instance_heat_source_cpi_heat_controller.id, maxExecutionTime)
  )))


  def getRoundRobinScheduler(schedule: Option[ISZ[art.Bridge]]): RoundRobin = {
    if(roundRobinSchedule.isEmpty) {} // line needed for transpiler; do not remove
    schedule match {
      case Some(s) => return RoundRobin(s)
      case _ => return RoundRobin(ScheduleProviderI.getRoundRobinOrder())
    }
  }

  def getStaticScheduler(schedule: Option[DScheduleSpec]): StaticScheduler = {
    if(staticSchedule.schedule.slots.isEmpty) {} // line needed for transpiler; do not remove
    schedule match {
      case Some(s) => return StaticScheduler(Arch.ad.components, s)
      case _ => return StaticScheduler(Arch.ad.components, ScheduleProviderI.getStaticSchedule())
    }
  }

  def getLegacyScheduler(): Legacy = {
    return Legacy(Arch.ad.components)
  }
}

@ext(name = "ScheduleProvider") object ScheduleProviderI {
  def getRoundRobinOrder(): ISZ[art.Bridge] = $
  def getStaticSchedule(): DScheduleSpec = $
}