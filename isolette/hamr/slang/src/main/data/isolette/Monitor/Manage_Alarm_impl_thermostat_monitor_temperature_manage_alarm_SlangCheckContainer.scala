// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

// SlangCheck test container to hold the incoming port values for manage_alarm
@datatype class Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_SlangCheckContainer (
  val api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  val api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
  val api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
  val api_upper_alarm_temp: Isolette_Data_Model.Temp_impl)
