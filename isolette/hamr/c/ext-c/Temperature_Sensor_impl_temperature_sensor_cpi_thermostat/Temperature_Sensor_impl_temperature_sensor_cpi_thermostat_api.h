#ifndef TEMPERATURE_SENSOR_IMPL_TEMPERATURE_SENSOR_CPI_THERMOSTAT_API_H
#define TEMPERATURE_SENSOR_IMPL_TEMPERATURE_SENSOR_CPI_THERMOSTAT_API_H

#include <all.h>

// This file was auto-generated.  Do not edit

bool api_get_air__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  isolette_Isolette_Data_Model_PhysicalTemp_impl value);

void api_put_current_tempWstatus__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  isolette_Isolette_Data_Model_TempWstatus_impl value);

void api_logInfo__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  String str);

void api_logDebug__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  String str);

void api_logError__isolette_Devices_Temperature_Sensor_impl_temperature_sensor_cpi_thermostat(
  STACK_FRAME
  String str);

#endif
