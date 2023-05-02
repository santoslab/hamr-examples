// #Sireum

package isolette

import org.sireum._

// This file will not be overwritten so is safe to edit

object TranspilerToucher {
  def touch(): Unit = {
    val result = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.compute_CEP_Pre(
      Isolette_Data_Model.On_Off.Off,
      Isolette_Data_Model.TempWstatus_impl.example(),
      Isolette_Data_Model.Temp_impl.example(),
      Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode,
      Isolette_Data_Model.Temp_impl.example()
    )

    val result2 = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.compute_CEP_Post(
      In_lastCmd = Isolette_Data_Model.On_Off.Off,
      lastCmd = Isolette_Data_Model.On_Off.Off,
      api_current_tempWstatus = Isolette_Data_Model.TempWstatus_impl.example(),
      api_heat_control = Isolette_Data_Model.On_Off.Off,
      api_lower_desired_temp = Isolette_Data_Model.Temp_impl.example(),
      api_regulator_mode = Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode,
      api_upper_desired_temp = Isolette_Data_Model.Temp_impl.example()
    )
  }
}
