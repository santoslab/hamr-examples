// #Sireum

package RTS.Actuators

import org.sireum._
import RTS._

// This file will not be overwritten so is safe to edit
object ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread {

  def initialise(api: ActuatorsMockThread_i_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

  }

  def timeTriggered(api: ActuatorsMockThread_i_Operational_Api): Unit = {
    // example api usage

    val apiUsage_tempPressureActuate: Option[Base_Types.Boolean] = api.get_tempPressureActuate()
    api.logInfo(s"Received on tempPressureActuate: ${apiUsage_tempPressureActuate}")
    val apiUsage_saturationActuate: Option[Base_Types.Boolean] = api.get_saturationActuate()
    api.logInfo(s"Received on saturationActuate: ${apiUsage_saturationActuate}")
  }

  def activate(api: ActuatorsMockThread_i_Operational_Api): Unit = { }

  def deactivate(api: ActuatorsMockThread_i_Operational_Api): Unit = { }

  def finalise(api: ActuatorsMockThread_i_Operational_Api): Unit = { }

  def recover(api: ActuatorsMockThread_i_Operational_Api): Unit = { }
}
