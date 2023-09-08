// #Sireum

package isolette.Regulate

import org.sireum._
import art._
import isolette._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_EntryPoint_Companion {

  var last_api_heat_control: Option[Isolette_Data_Model.On_Off.Type] = None()
  def get_api_heat_control: Isolette_Data_Model.On_Off.Type = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.heat_control_Id) match {
      case Some(Isolette_Data_Model.On_Off_Payload(value)) =>
        last_api_heat_control = Some(value)
        return value
      case _ => return last_api_heat_control.get
    }
  }
  var preStateContainer_wL: Option[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(
        lastCmd = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd,
        api_heat_control = get_api_heat_control)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observePostState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.id, isolette.runtimemonitor.ObservationKind.manage_heat_source_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(
        In_lastCmd = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd, 
        api_current_tempWstatus = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.current_tempWstatus_Id).get.asInstanceOf[Isolette_Data_Model.TempWstatus_impl_Payload].value, 
        api_lower_desired_temp = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.lower_desired_temp_Id).get.asInstanceOf[Isolette_Data_Model.Temp_impl_Payload].value, 
        api_regulator_mode = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.regulator_mode_Id).get.asInstanceOf[Isolette_Data_Model.Regulator_Mode_Payload].value, 
        api_upper_desired_temp = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.upper_desired_temp_Id).get.asInstanceOf[Isolette_Data_Model.Temp_impl_Payload].value))

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observePreState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.id, isolette.runtimemonitor.ObservationKind.manage_heat_source_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(
        lastCmd = isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd,
        api_heat_control = get_api_heat_control)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observePrePostState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.id, isolette.runtimemonitor.ObservationKind.manage_heat_source_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}