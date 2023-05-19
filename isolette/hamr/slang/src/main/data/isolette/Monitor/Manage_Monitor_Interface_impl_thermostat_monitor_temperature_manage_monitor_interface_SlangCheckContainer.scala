// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

// SlangCheck test container to hold the incoming port values for manage_monitor_interface
@datatype class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_SlangCheckContainer (
  val api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  val api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  val api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
  val api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl)
