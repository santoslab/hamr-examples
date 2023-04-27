#include <Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.h>
#include <Temperature_Sensor_impl_temperature_sensor_cpi_thermostat.h>

static bool apis_initialized = false;
static struct isolette_Devices_Temperature_Sensor_impl_Initialization_Api initialization_api;
static struct isolette_Devices_Temperature_Sensor_impl_Operational_Api operational_api;

static void initialize_apis(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat.c", "", "initialize_apis", 0);

  // Option_278B1D = Option[isolette.Devices.Temperature_Sensor_impl_Initialization_Api]
  Option_278B1D_get_(SF (isolette_Devices_Temperature_Sensor_impl_Initialization_Api) &initialization_api, isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge_c_initialization_api(SF_LAST));
  // Option_E2586D = Option[isolette.Devices.Temperature_Sensor_impl_Operational_Api]
  Option_E2586D_get_(SF (isolette_Devices_Temperature_Sensor_impl_Operational_Api) &operational_api, isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge_c_operational_api(SF_LAST));
  apis_initialized = true;
}

// This file was auto-generated.  Do not edit

bool api_get_air__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  isolette_Isolette_Data_Model_PhysicalTemp_impl value){
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.c", "", "api_get_air__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  // Option_6B1BEE = Option[isolette.Isolette_Data_Model.PhysicalTemp_impl]
  // Some_20EF3E = Some[isolette.Isolette_Data_Model.PhysicalTemp_impl]
  DeclNewOption_6B1BEE(t_0);
  isolette_Devices_Temperature_Sensor_impl_Operational_Api_get_air_(
    SF
    (Option_6B1BEE) &t_0,
    &operational_api);

  if(t_0.type == TSome_20EF3E){
    Type_assign(value, &t_0.Some_20EF3E.value, sizeof(struct isolette_Isolette_Data_Model_PhysicalTemp_impl));
    return true;
  } else {
    return false;
  }
}

void api_put_current_tempWstatus__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  isolette_Isolette_Data_Model_TempWstatus_impl value) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.c", "", "api_put_current_tempWstatus__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Devices_Temperature_Sensor_impl_Initialization_Api_put_current_tempWstatus_(
    SF
    &initialization_api,
    value);
}

void api_logInfo__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.c", "", "api_logInfo__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Devices_Temperature_Sensor_impl_Initialization_Api_logInfo_(
    SF
    &initialization_api,
    str);
}

void api_logDebug__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.c", "", "api_logDebug__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Devices_Temperature_Sensor_impl_Initialization_Api_logDebug_(
    SF
    &initialization_api,
    str);
}

void api_logError__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  String str) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.c", "", "api_logError__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat", 0);

  if(!apis_initialized) { initialize_apis(SF_LAST); }

  isolette_Devices_Temperature_Sensor_impl_Initialization_Api_logError_(
    SF
    &initialization_api,
    str);
}

Unit isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_initialise(
  STACK_FRAME
  isolette_Devices_Temperature_Sensor_impl_Initialization_Api api) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.c", "", "isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_initialise", 0);

  isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_initialise_(SF_LAST);
}

Unit isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_finalise(
  STACK_FRAME
  isolette_Devices_Temperature_Sensor_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.c", "", "isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_finalise", 0);

  isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_finalise_(SF_LAST);
}

Unit isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_timeTriggered(
  STACK_FRAME
  isolette_Devices_Temperature_Sensor_impl_Operational_Api api) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.c", "", "isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_timeTriggered", 0);

  isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_timeTriggered_(SF_LAST);
}
