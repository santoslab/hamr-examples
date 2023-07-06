package tc

import org.sireum._
import art.Art
import art.scheduling.static.Schedule.DScheduleSpec

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object ScheduleProvider {

  def getRoundRobinOrder(): ISZ[Art.BridgeId] = {
    return Schedulers.roundRobinSchedule
  }

  def getStaticSchedule(): DScheduleSpec = {
    return Schedulers.staticSchedule
  }
}
