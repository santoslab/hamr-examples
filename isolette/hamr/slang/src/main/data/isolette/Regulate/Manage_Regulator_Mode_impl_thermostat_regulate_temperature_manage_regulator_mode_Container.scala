// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

@datatype class Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Container (
  api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
  api_internal_failure: Isolette_Data_Model.Failure_Flag_impl)
