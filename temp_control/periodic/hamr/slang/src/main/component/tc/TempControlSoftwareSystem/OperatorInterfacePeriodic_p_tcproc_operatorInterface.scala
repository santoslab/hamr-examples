// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// This file will not be overwritten so is safe to edit
object OperatorInterfacePeriodic_p_tcproc_operatorInterface {

  def initialise(api: OperatorInterfacePeriodic_p_Initialization_Api): Unit = {
    api.put_setPoint(DefaultValues.defaultSetPoint)
  }

  def timeTriggered(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = {
    // example api usage

    val apiUsage_currentTemp: Option[TempSensor.Temperature_i] = api.get_currentTemp()
    api.logInfo(s"Received on currentTemp: ${apiUsage_currentTemp}")

    api.put_setPoint(DefaultValues.defaultSetPoint)
  }

  def activate(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = { }

  def deactivate(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = { }

  def finalise(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = { }

  def recover(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = { }
}
