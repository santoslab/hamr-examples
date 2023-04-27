#include <Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.h>
#include <Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.h>

static bool apis_initialized = false;
static struct isolette_Regulate_Manage_Heat_Source_impl_Initialization_Api initialization_api;
static struct isolette_Regulate_Manage_Heat_Source_impl_Operational_Api operational_api;

static void initialize_apis(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.c", "", "initialize_apis", 0);

  // Option_2BDA4C = Option[isolette.Regulate.Manage_Heat_Source_impl_Initialization_Api]
  Option_2BDA4C_get_(SF (isolette_Regulate_Manage_Heat_Source_impl_Initialization_Api) &initialization_api, isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Bridge_c_initialization_api(SF_LAST));
  // Option_45B9B1 = Option[isolette.Regulate.Manage_Heat_Source_impl_Operational_Api]
  Option_45B9B1_get_(SF (isolette_Regulate_Manage_Heat_Source_impl_Operational_Api) &operational_api, isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Bridge_c_operational_api(SF_LAST));
  apis_initialized = true;
}

// This file was auto-generated.  Do not edit

bool api_get_current_tempWstatus__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(
  STACK_FRAME
  isolette_Isolette_Data_Model_TempWstatus_impl value){
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "api_get_current_tempWstatus__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_0A1DB7 = Option[isolette.Isolette_Data_Model.TempWstatus_impl]
  // Some_4EE836 = Some[isolette.Isolette_Data_Model.TempWstatus_impl]
  DeclNewOption_0A1DB7(t_0);
  isolette_Regulate_Manage_Heat_Source_impl_Operational_Api_get_current_tempWstatus_(
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

bool api_get_lower_desired_temp__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(
  STACK_FRAME
  isolette_Isolette_Data_Model_Temp_impl value){
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "api_get_lower_desired_temp__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_0893BB = Option[isolette.Isolette_Data_Model.Temp_impl]
  // Some_78BA16 = Some[isolette.Isolette_Data_Model.Temp_impl]
  DeclNewOption_0893BB(t_0);
  isolette_Regulate_Manage_Heat_Source_impl_Operational_Api_get_lower_desired_temp_(
    SF
    (Option_0893BB) &t_0,
    &operational_api);

  if(t_0.type == TSome_78BA16){
    Type_assign(value, &t_0.Some_78BA16.value, sizeof(struct isolette_Isolette_Data_Model_Temp_impl));
    return true;
  } else {
    return false;
  }
}

bool api_get_upper_desired_temp__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(
  STACK_FRAME
  isolette_Isolette_Data_Model_Temp_impl value){
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "api_get_upper_desired_temp__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_0893BB = Option[isolette.Isolette_Data_Model.Temp_impl]
  // Some_78BA16 = Some[isolette.Isolette_Data_Model.Temp_impl]
  DeclNewOption_0893BB(t_0);
  isolette_Regulate_Manage_Heat_Source_impl_Operational_Api_get_upper_desired_temp_(
    SF
    (Option_0893BB) &t_0,
    &operational_api);

  if(t_0.type == TSome_78BA16){
    Type_assign(value, &t_0.Some_78BA16.value, sizeof(struct isolette_Isolette_Data_Model_Temp_impl));
    return true;
  } else {
    return false;
  }
}

bool api_get_regulator_mode__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(
  STACK_FRAME
  isolette_Isolette_Data_Model_Regulator_Mode_Type *value){
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "api_get_regulator_mode__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_EDC12C = Option[isolette.Isolette_Data_Model.Regulator_Mode.Type]
  // Some_1AB779 = Some[isolette.Isolette_Data_Model.Regulator_Mode.Type]
  DeclNewOption_EDC12C(t_0);
  isolette_Regulate_Manage_Heat_Source_impl_Operational_Api_get_regulator_mode_(
    SF
    (Option_EDC12C) &t_0,
    &operational_api);

  if(t_0.type == TSome_1AB779){
    *value = t_0.Some_1AB779.value;
    return true;
  } else {
    return false;
  }
}

void api_put_heat_control__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(
  STACK_FRAME
  isolette_Isolette_Data_Model_On_Off_Type value) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "api_put_heat_control__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Regulate_Manage_Heat_Source_impl_Initialization_Api_put_heat_control_(
    SF
    &initialization_api,
    value);
}

void api_logInfo__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "api_logInfo__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Regulate_Manage_Heat_Source_impl_Initialization_Api_logInfo_(
    SF
    &initialization_api,
    str);
}

void api_logDebug__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "api_logDebug__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Regulate_Manage_Heat_Source_impl_Initialization_Api_logDebug_(
    SF
    &initialization_api,
    str);
}

void api_logError__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "api_logError__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Regulate_Manage_Heat_Source_impl_Initialization_Api_logError_(
    SF
    &initialization_api,
    str);
}

Unit isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_initialise(
  STACK_FRAME
  isolette_Regulate_Manage_Heat_Source_impl_Initialization_Api api) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_initialise", 0);

  isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_initialise_(SF_LAST);
}

Unit isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_finalise(
  STACK_FRAME
  isolette_Regulate_Manage_Heat_Source_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_finalise", 0);

  isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_finalise_(SF_LAST);
}

Unit isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_timeTriggered(
  STACK_FRAME
  isolette_Regulate_Manage_Heat_Source_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.c", "", "isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_timeTriggered", 0);

  isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_timeTriggered_(SF_LAST);
}
