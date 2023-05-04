// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

// SlangCheck test container to hold the incoming port values for manage_heat_source
@datatype class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container (
  val api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  val api_lower_desired_temp: Isolette_Data_Model.Temp_impl,
  val api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
  val api_upper_desired_temp: Isolette_Data_Model.Temp_impl)
