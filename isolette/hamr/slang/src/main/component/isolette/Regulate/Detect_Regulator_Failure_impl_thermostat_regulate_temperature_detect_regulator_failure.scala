// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file will not be overwritten so is safe to edit
object Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure {

  def initialise(api: Detect_Regulator_Failure_impl_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_internal_failure(Isolette_Data_Model.Failure_Flag_impl.example())
  }

  def timeTriggered(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = {
    // example api usage


  }

  def activate(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = { }

  def deactivate(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = { }

  def finalise(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = { }

  def recover(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = { }
}
