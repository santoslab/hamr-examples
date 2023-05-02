// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

@datatype class Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Container (
  api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
  api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl)
