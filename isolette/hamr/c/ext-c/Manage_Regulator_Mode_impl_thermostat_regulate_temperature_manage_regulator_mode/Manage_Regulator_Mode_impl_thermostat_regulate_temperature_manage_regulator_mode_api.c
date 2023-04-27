#include <Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.h>
#include <Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.h>

static bool apis_initialized = false;
static struct isolette_Regulate_Manage_Regulator_Mode_impl_Initialization_Api initialization_api;
static struct isolette_Regulate_Manage_Regulator_Mode_impl_Operational_Api operational_api;

static void initialize_apis(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.c", "", "initialize_apis", 0);

  // Option_47AAF4 = Option[isolette.Regulate.Manage_Regulator_Mode_impl_Initialization_Api]
  Option_47AAF4_get_(SF (isolette_Regulate_Manage_Regulator_Mode_impl_Initialization_Api) &initialization_api, isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Bridge_c_initialization_api(SF_LAST));
  // Option_535587 = Option[isolette.Regulate.Manage_Regulator_Mode_impl_Operational_Api]
  Option_535587_get_(SF (isolette_Regulate_Manage_Regulator_Mode_impl_Operational_Api) &operational_api, isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Bridge_c_operational_api(SF_LAST));
  apis_initialized = true;
}

// This file was auto-generated.  Do not edit

bool api_get_current_tempWstatus__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode(
  STACK_FRAME
  isolette_Isolette_Data_Model_TempWstatus_impl value){
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "api_get_current_tempWstatus__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_0A1DB7 = Option[isolette.Isolette_Data_Model.TempWstatus_impl]
  // Some_4EE836 = Some[isolette.Isolette_Data_Model.TempWstatus_impl]
  DeclNewOption_0A1DB7(t_0);
  isolette_Regulate_Manage_Regulator_Mode_impl_Operational_Api_get_current_tempWstatus_(
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

bool api_get_interface_failure__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode(
  STACK_FRAME
  isolette_Isolette_Data_Model_Failure_Flag_impl value){
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "api_get_interface_failure__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_89FBA1 = Option[isolette.Isolette_Data_Model.Failure_Flag_impl]
  // Some_1FB941 = Some[isolette.Isolette_Data_Model.Failure_Flag_impl]
  DeclNewOption_89FBA1(t_0);
  isolette_Regulate_Manage_Regulator_Mode_impl_Operational_Api_get_interface_failure_(
    SF
    (Option_89FBA1) &t_0,
    &operational_api);

  if(t_0.type == TSome_1FB941){
    Type_assign(value, &t_0.Some_1FB941.value, sizeof(struct isolette_Isolette_Data_Model_Failure_Flag_impl));
    return true;
  } else {
    return false;
  }
}

bool api_get_internal_failure__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode(
  STACK_FRAME
  isolette_Isolette_Data_Model_Failure_Flag_impl value){
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "api_get_internal_failure__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_89FBA1 = Option[isolette.Isolette_Data_Model.Failure_Flag_impl]
  // Some_1FB941 = Some[isolette.Isolette_Data_Model.Failure_Flag_impl]
  DeclNewOption_89FBA1(t_0);
  isolette_Regulate_Manage_Regulator_Mode_impl_Operational_Api_get_internal_failure_(
    SF
    (Option_89FBA1) &t_0,
    &operational_api);

  if(t_0.type == TSome_1FB941){
    Type_assign(value, &t_0.Some_1FB941.value, sizeof(struct isolette_Isolette_Data_Model_Failure_Flag_impl));
    return true;
  } else {
    return false;
  }
}

void api_put_regulator_mode__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode(
  STACK_FRAME
  isolette_Isolette_Data_Model_Regulator_Mode_Type value) {
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "api_put_regulator_mode__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Regulate_Manage_Regulator_Mode_impl_Initialization_Api_put_regulator_mode_(
    SF
    &initialization_api,
    value);
}

void api_logInfo__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "api_logInfo__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Regulate_Manage_Regulator_Mode_impl_Initialization_Api_logInfo_(
    SF
    &initialization_api,
    str);
}

void api_logDebug__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "api_logDebug__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Regulate_Manage_Regulator_Mode_impl_Initialization_Api_logDebug_(
    SF
    &initialization_api,
    str);
}

void api_logError__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "api_logError__isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Regulate_Manage_Regulator_Mode_impl_Initialization_Api_logError_(
    SF
    &initialization_api,
    str);
}

Unit isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_initialise(
  STACK_FRAME
  isolette_Regulate_Manage_Regulator_Mode_impl_Initialization_Api api) {
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_initialise", 0);

  isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_initialise_(SF_LAST);
}

Unit isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_finalise(
  STACK_FRAME
  isolette_Regulate_Manage_Regulator_Mode_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_finalise", 0);

  isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_finalise_(SF_LAST);
}

Unit isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_timeTriggered(
  STACK_FRAME
  isolette_Regulate_Manage_Regulator_Mode_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_api.c", "", "isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_timeTriggered", 0);

  isolette_Regulate_Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_timeTriggered_(SF_LAST);
}
