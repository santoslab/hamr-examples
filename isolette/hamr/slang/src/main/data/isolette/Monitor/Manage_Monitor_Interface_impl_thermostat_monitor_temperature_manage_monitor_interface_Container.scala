// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

@datatype class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container (
  api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type,
  api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl)
