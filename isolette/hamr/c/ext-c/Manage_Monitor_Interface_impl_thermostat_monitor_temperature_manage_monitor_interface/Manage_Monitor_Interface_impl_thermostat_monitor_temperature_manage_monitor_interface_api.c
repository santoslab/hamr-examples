#include <Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.h>
#include <Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.h>

static bool apis_initialized = false;
static struct isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api initialization_api;
static struct isolette_Monitor_Manage_Monitor_Interface_impl_Operational_Api operational_api;

static void initialize_apis(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.c", "", "initialize_apis", 0);

  // Option_B0692B = Option[isolette.Monitor.Manage_Monitor_Interface_impl_Initialization_Api]
  Option_B0692B_get_(SF (isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api) &initialization_api, isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Bridge_c_initialization_api(SF_LAST));
  // Option_99BDA1 = Option[isolette.Monitor.Manage_Monitor_Interface_impl_Operational_Api]
  Option_99BDA1_get_(SF (isolette_Monitor_Manage_Monitor_Interface_impl_Operational_Api) &operational_api, isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Bridge_c_operational_api(SF_LAST));
  apis_initialized = true;
}

// This file was auto-generated.  Do not edit

bool api_get_upper_alarm_tempWstatus__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  isolette_Isolette_Data_Model_TempWstatus_impl value){
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_get_upper_alarm_tempWstatus__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_0A1DB7 = Option[isolette.Isolette_Data_Model.TempWstatus_impl]
  // Some_4EE836 = Some[isolette.Isolette_Data_Model.TempWstatus_impl]
  DeclNewOption_0A1DB7(t_0);
  isolette_Monitor_Manage_Monitor_Interface_impl_Operational_Api_get_upper_alarm_tempWstatus_(
    SF
    (Option_0A1DB7) &t_0,
    &operational_api);

  if(t_0.type == TSome_4EE836){
    Type_assign(value, &t_0.Some_4EE836.value, sizeof(struct isolette_Isolette_Data_Model_TempWstatus_impl));
    return true;
  } else {
    return false;
  }
}

bool api_get_lower_alarm_tempWstatus__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  isolette_Isolette_Data_Model_TempWstatus_impl value){
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_get_lower_alarm_tempWstatus__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_0A1DB7 = Option[isolette.Isolette_Data_Model.TempWstatus_impl]
  // Some_4EE836 = Some[isolette.Isolette_Data_Model.TempWstatus_impl]
  DeclNewOption_0A1DB7(t_0);
  isolette_Monitor_Manage_Monitor_Interface_impl_Operational_Api_get_lower_alarm_tempWstatus_(
    SF
    (Option_0A1DB7) &t_0,
    &operational_api);

  if(t_0.type == TSome_4EE836){
    Type_assign(value, &t_0.Some_4EE836.value, sizeof(struct isolette_Isolette_Data_Model_TempWstatus_impl));
    return true;
  } else {
    return false;
  }
}

bool api_get_current_tempWstatus__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  isolette_Isolette_Data_Model_TempWstatus_impl value){
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_get_current_tempWstatus__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_0A1DB7 = Option[isolette.Isolette_Data_Model.TempWstatus_impl]
  // Some_4EE836 = Some[isolette.Isolette_Data_Model.TempWstatus_impl]
  DeclNewOption_0A1DB7(t_0);
  isolette_Monitor_Manage_Monitor_Interface_impl_Operational_Api_get_current_tempWstatus_(
    SF
    (Option_0A1DB7) &t_0,
    &operational_api);

  if(t_0.type == TSome_4EE836){
    Type_assign(value, &t_0.Some_4EE836.value, sizeof(struct isolette_Isolette_Data_Model_TempWstatus_impl));
    return true;
  } else {
    return false;
  }
}

bool api_get_monitor_mode__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  isolette_Isolette_Data_Model_Monitor_Mode_Type *value){
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_get_monitor_mode__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_4CF585 = Option[isolette.Isolette_Data_Model.Monitor_Mode.Type]
  // Some_2B12CA = Some[isolette.Isolette_Data_Model.Monitor_Mode.Type]
  DeclNewOption_4CF585(t_0);
  isolette_Monitor_Manage_Monitor_Interface_impl_Operational_Api_get_monitor_mode_(
    SF
    (Option_4CF585) &t_0,
    &operational_api);

  if(t_0.type == TSome_2B12CA){
    *value = t_0.Some_2B12CA.value;
    return true;
  } else {
    return false;
  }
}

void api_put_upper_alarm_temp__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  isolette_Isolette_Data_Model_Temp_impl value) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_put_upper_alarm_temp__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api_put_upper_alarm_temp_(
    SF
    &initialization_api,
    value);
}

void api_put_lower_alarm_temp__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  isolette_Isolette_Data_Model_Temp_impl value) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_put_lower_alarm_temp__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api_put_lower_alarm_temp_(
    SF
    &initialization_api,
    value);
}

void api_put_monitor_status__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  isolette_Isolette_Data_Model_Status_Type value) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_put_monitor_status__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api_put_monitor_status_(
    SF
    &initialization_api,
    value);
}

void api_put_interface_failure__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  isolette_Isolette_Data_Model_Failure_Flag_impl value) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_put_interface_failure__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api_put_interface_failure_(
    SF
    &initialization_api,
    value);
}

void api_logInfo__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_logInfo__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api_logInfo_(
    SF
    &initialization_api,
    str);
}

void api_logDebug__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_logDebug__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api_logDebug_(
    SF
    &initialization_api,
    str);
}

void api_logError__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "api_logError__isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api_logError_(
    SF
    &initialization_api,
    str);
}

Unit isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_initialise(
  STACK_FRAME
  isolette_Monitor_Manage_Monitor_Interface_impl_Initialization_Api api) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_initialise", 0);

  isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_initialise_(SF_LAST);
}

Unit isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_finalise(
  STACK_FRAME
  isolette_Monitor_Manage_Monitor_Interface_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_finalise", 0);

  isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_finalise_(SF_LAST);
}

Unit isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_timeTriggered(
  STACK_FRAME
  isolette_Monitor_Manage_Monitor_Interface_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_api.c", "", "isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_timeTriggered", 0);

  isolette_Monitor_Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_timeTriggered_(SF_LAST);
}