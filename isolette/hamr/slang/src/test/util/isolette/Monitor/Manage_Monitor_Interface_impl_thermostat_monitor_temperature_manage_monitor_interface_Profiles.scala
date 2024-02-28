// #Sireum

package isolette.Monitor

import org.sireum._
import isolette.util.Profile
import isolette.util.EmptyContainer
import isolette.RandomLib

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Profile for initialise entrypoint
@msig trait Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_Trait extends Profile

@record class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile (
  val name: String,
) extends Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_Trait {

  override def next: EmptyContainer = {
    return EmptyContainer()
  }
}

// Profile with generators for incoming ports
@msig trait Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P_Trait extends Profile {
  def api_current_tempWstatus: RandomLib // random lib for generating Isolette_Data_Model.TempWstatus_impl
  def api_lower_alarm_tempWstatus: RandomLib // random lib for generating Isolette_Data_Model.TempWstatus_impl
  def api_monitor_mode: RandomLib // random lib for generating Isolette_Data_Model.Monitor_Mode
  def api_upper_alarm_tempWstatus: RandomLib // random lib for generating Isolette_Data_Model.TempWstatus_impl
}

@record class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P(
  val name: String,
  var api_current_tempWstatus: RandomLib, // random lib for generating Isolette_Data_Model.TempWstatus_impl
  var api_lower_alarm_tempWstatus: RandomLib, // random lib for generating Isolette_Data_Model.TempWstatus_impl
  var api_monitor_mode: RandomLib, // random lib for generating Isolette_Data_Model.Monitor_Mode
  var api_upper_alarm_tempWstatus: RandomLib // random lib for generating Isolette_Data_Model.TempWstatus_impl
  ) extends Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P_Trait {

  override def next: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P = {
    return (Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P (
      api_current_tempWstatus = api_current_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl(),
      api_lower_alarm_tempWstatus = api_lower_alarm_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl(),
      api_monitor_mode = api_monitor_mode.nextIsolette_Data_ModelMonitor_ModeType(),
      api_upper_alarm_tempWstatus = api_upper_alarm_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()))
  }
}

// Profile with generators for state variables and incoming ports
@msig trait Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_PS_Trait extends Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P_Trait {
  def In_lastCmd: RandomLib // random lib for generating Isolette_Data_Model.On_Off
  def api_current_tempWstatus: RandomLib // random lib for generating Isolette_Data_Model.TempWstatus_impl
  def api_lower_alarm_tempWstatus: RandomLib // random lib for generating Isolette_Data_Model.TempWstatus_impl
  def api_monitor_mode: RandomLib // random lib for generating Isolette_Data_Model.Monitor_Mode
  def api_upper_alarm_tempWstatus: RandomLib // random lib for generating Isolette_Data_Model.TempWstatus_impl
}

@record class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_PS(
  val name: String,
  var In_lastCmd: RandomLib, // random lib for generating Isolette_Data_Model.On_Off
  var api_current_tempWstatus: RandomLib, // random lib for generating Isolette_Data_Model.TempWstatus_impl
  var api_lower_alarm_tempWstatus: RandomLib, // random lib for generating Isolette_Data_Model.TempWstatus_impl
  var api_monitor_mode: RandomLib, // random lib for generating Isolette_Data_Model.Monitor_Mode
  var api_upper_alarm_tempWstatus: RandomLib // random lib for generating Isolette_Data_Model.TempWstatus_impl
  ) extends Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_PS_Trait {

  override def next: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS = {
    return (Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS (
      In_lastCmd = In_lastCmd.nextIsolette_Data_ModelOn_OffType(),
      api_current_tempWstatus = api_current_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl(),
      api_lower_alarm_tempWstatus = api_lower_alarm_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl(),
      api_monitor_mode = api_monitor_mode.nextIsolette_Data_ModelMonitor_ModeType(),
      api_upper_alarm_tempWstatus = api_upper_alarm_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()))
  }
}
