#include <Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_api.h>
#include <Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.h>
#include <ext.h>

// This file will not be overwritten so is safe to edit

static char* component_id = "isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode";

Unit isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_initialise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.c", "", "isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_initialise_", 0);

  printf("%s: isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_initialise_ called\n", component_id);

  // example usage of api setters

  isolette_Isolette_Data_Model_Monitor_Mode_Type t0 = isolette_Isolette_Data_Model_Monitor_Mode_Type_Init_Monitor_Mode;
  api_put_monitor_mode__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF t0);

  /* example usage of api loggers. Commented out as the constructed String may be too long
  api_logInfo__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF string("Example logInfo"));

  api_logDebug__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF string("Example logDebug"));

  api_logError__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF string("Example logError"));
  */
}

Unit isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_finalise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.c", "", "isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_finalise_", 0);
}

Unit isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_timeTriggered_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.c", "", "isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_timeTriggered_", 0);

  // examples of api getter usage

  DeclNewisolette_Isolette_Data_Model_TempWstatus_impl(t0);
  if(api_get_current_tempWstatus__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF &t0)) {
    printf("%s: Received data on data port current_tempWstatus: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(current_tempWstatus_str);
    String__append(SF (String) &current_tempWstatus_str, string("Received data on data port current_tempWstatus: "));
    isolette_Isolette_Data_Model_TempWstatus_impl_string_(SF (String) &current_tempWstatus_str, &t0);
    api_logInfo__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF (String) &current_tempWstatus_str);
    */
  }

  DeclNewisolette_Isolette_Data_Model_Failure_Flag_impl(t1);
  if(api_get_interface_failure__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF &t1)) {
    printf("%s: Received data on data port interface_failure: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(interface_failure_str);
    String__append(SF (String) &interface_failure_str, string("Received data on data port interface_failure: "));
    isolette_Isolette_Data_Model_Failure_Flag_impl_string_(SF (String) &interface_failure_str, &t1);
    api_logInfo__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF (String) &interface_failure_str);
    */
  }

  DeclNewisolette_Isolette_Data_Model_Failure_Flag_impl(t2);
  if(api_get_internal_failure__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF &t2)) {
    printf("%s: Received data on data port internal_failure: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(internal_failure_str);
    String__append(SF (String) &internal_failure_str, string("Received data on data port internal_failure: "));
    isolette_Isolette_Data_Model_Failure_Flag_impl_string_(SF (String) &internal_failure_str, &t2);
    api_logInfo__isolette_Monitor_Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode(SF (String) &internal_failure_str);
    */
  }
}
