// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

// SlangCheck test container to hold the incoming port values for manage_regulator_interface
@datatype class Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Container (
  val api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  val api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  val api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
  val api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl)
