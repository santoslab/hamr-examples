#include <Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_api.h>
#include <Temperature_Sensor_impl_temperature_sensor_cpi_thermostat.h>
#include <ext.h>

// This file will not be overwritten so is safe to edit

static char* component_id = "isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat";

Unit isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_initialise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat.c", "", "isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_initialise_", 0);

  printf("%s: isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_initialise_ called\n", component_id);

  // example usage of api setters

  DeclNewisolette_Isolette_Data_Model_TempWstatus_impl(t0);
  isolette_Isolette_Data_Model_TempWstatus_impl_example(SF &t0);
  api_put_current_tempWstatus__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(SF &t0);

  /* example usage of api loggers. Commented out as the constructed String may be too long
  api_logInfo__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(SF string("Example logInfo"));

  api_logDebug__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(SF string("Example logDebug"));

  api_logError__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(SF string("Example logError"));
  */
}

Unit isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_finalise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat.c", "", "isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_finalise_", 0);
}

Unit isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_timeTriggered_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Temperature_Sensor_impl_temperature_sensor_cpi_thermostat.c", "", "isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_timeTriggered_", 0);

  // examples of api getter usage

  DeclNewisolette_Isolette_Data_Model_PhysicalTemp_impl(t0);
  if(api_get_air__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(SF &t0)) {
    printf("%s: Received data on data port air: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(air_str);
    String__append(SF (String) &air_str, string("Received data on data port air: "));
    isolette_Isolette_Data_Model_PhysicalTemp_impl_string_(SF (String) &air_str, &t0);
    api_logInfo__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(SF (String) &air_str);
    */
  }
}
