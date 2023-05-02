// #Sireum

package isolette.Monitor

import org.sireum._
import isolette._

@datatype class Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Container (
  api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
  api_internal_failure: Isolette_Data_Model.Failure_Flag_impl)
