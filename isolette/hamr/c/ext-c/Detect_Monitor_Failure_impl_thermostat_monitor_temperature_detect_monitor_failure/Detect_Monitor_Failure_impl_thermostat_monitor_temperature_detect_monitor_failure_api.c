#include <Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_api.h>
#include <Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure.h>

static bool apis_initialized = false;
static struct isolette_Monitor_Detect_Monitor_Failure_impl_Initialization_Api initialization_api;
static struct isolette_Monitor_Detect_Monitor_Failure_impl_Operational_Api operational_api;

static void initialize_apis(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure.c", "", "initialize_apis", 0);

  // Option_D9F845 = Option[isolette.Monitor.Detect_Monitor_Failure_impl_Initialization_Api]
  Option_D9F845_get_(SF (isolette_Monitor_Detect_Monitor_Failure_impl_Initialization_Api) &initialization_api, isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge_c_initialization_api(SF_LAST));
  // Option_23DCAB = Option[isolette.Monitor.Detect_Monitor_Failure_impl_Operational_Api]
  Option_23DCAB_get_(SF (isolette_Monitor_Detect_Monitor_Failure_impl_Operational_Api) &operational_api, isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge_c_operational_api(SF_LAST));
  apis_initialized = true;
}

// This file was auto-generated.  Do not edit

void api_put_internal_failure__isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure(
  STACK_FRAME
  isolette_Isolette_Data_Model_Failure_Flag_impl value) {
  DeclNewStackFrame(caller, "Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_api.c", "", "api_put_internal_failure__isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Detect_Monitor_Failure_impl_Initialization_Api_put_internal_failure_(
    SF
    &initialization_api,
    value);
}

void api_logInfo__isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_api.c", "", "api_logInfo__isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Detect_Monitor_Failure_impl_Initialization_Api_logInfo_(
    SF
    &initialization_api,
    str);
}

void api_logDebug__isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_api.c", "", "api_logDebug__isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Detect_Monitor_Failure_impl_Initialization_Api_logDebug_(
    SF
    &initialization_api,
    str);
}

void api_logError__isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_api.c", "", "api_logError__isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Monitor_Detect_Monitor_Failure_impl_Initialization_Api_logError_(
    SF
    &initialization_api,
    str);
}

Unit isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_initialise(
  STACK_FRAME
  isolette_Monitor_Detect_Monitor_Failure_impl_Initialization_Api api) {
  DeclNewStackFrame(caller, "Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_api.c", "", "isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_initialise", 0);

  isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_initialise_(SF_LAST);
}

Unit isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_finalise(
  STACK_FRAME
  isolette_Monitor_Detect_Monitor_Failure_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_api.c", "", "isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_finalise", 0);

  isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_finalise_(SF_LAST);
}

Unit isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_timeTriggered(
  STACK_FRAME
  isolette_Monitor_Detect_Monitor_Failure_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_api.c", "", "isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_timeTriggered", 0);

  isolette_Monitor_Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_timeTriggered_(SF_LAST);
}
