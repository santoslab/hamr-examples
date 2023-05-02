// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

@datatype class Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Container (
  api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  api_lower_alarm_temp: Isolette_Data_Model.Temp_impl,
  api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
  api_upper_alarm_temp: Isolette_Data_Model.Temp_impl)
