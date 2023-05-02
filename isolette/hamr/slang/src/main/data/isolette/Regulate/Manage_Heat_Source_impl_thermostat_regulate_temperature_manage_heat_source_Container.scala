// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

@datatype class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container (
  api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
  api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
  api_upper_desired_temp: Isolette_Data_Model.Temp_impl)
