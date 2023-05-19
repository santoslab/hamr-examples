// #Sireum

package isolette.Regulate

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

// SlangCheck test container to hold the incoming port values for manage_regulator_mode
@datatype class Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_SlangCheckContainer (
  val api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
  val api_interface_failure: Isolette_Data_Model.Failure_Flag_impl,
  val api_internal_failure: Isolette_Data_Model.Failure_Flag_impl)
