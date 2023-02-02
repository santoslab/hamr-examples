// #Sireum

package isolette.Isolette

import org.sireum._
import isolette._

// This file will not be overwritten so is safe to edit
object operator_interface_thread_impl_operator_interface_oip_oit {

  def initialise(api: operator_interface_thread_impl_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_lower_desired_tempWstatus(Isolette_Data_Model.TempWstatus_impl.example())
    api.put_upper_desired_tempWstatus(Isolette_Data_Model.TempWstatus_impl.example())
    api.put_lower_alarm_tempWstatus(Isolette_Data_Model.TempWstatus_impl.example())
    api.put_upper_alarm_tempWstatus(Isolette_Data_Model.TempWstatus_impl.example())
  }

  def timeTriggered(api: operator_interface_thread_impl_Operational_Api): Unit = {
    // example api usage

    val apiUsage_regulator_status: Option[Isolette_Data_Model.Status.Type] = api.get_regulator_status()
    api.logInfo(s"Received on regulator_status: ${apiUsage_regulator_status}")
    val apiUsage_monitor_status: Option[Isolette_Data_Model.Status.Type] = api.get_monitor_status()
    api.logInfo(s"Received on monitor_status: ${apiUsage_monitor_status}")
    val apiUsage_display_temperature: Option[Isolette_Data_Model.Temp_impl] = api.get_display_temperature()
    api.logInfo(s"Received on display_temperature: ${apiUsage_display_temperature}")
    val apiUsage_alarm_control: Option[Isolette_Data_Model.On_Off.Type] = api.get_alarm_control()
    api.logInfo(s"Received on alarm_control: ${apiUsage_alarm_control}")
  }

  def activate(api: operator_interface_thread_impl_Operational_Api): Unit = { }

  def deactivate(api: operator_interface_thread_impl_Operational_Api): Unit = { }

  def finalise(api: operator_interface_thread_impl_Operational_Api): Unit = { }

  def recover(api: operator_interface_thread_impl_Operational_Api): Unit = { }
}
