#ifndef HEAT_SOURCE_IMPL_HEAT_SOURCE_CPI_HEAT_CONTROLLER_API_H
#define HEAT_SOURCE_IMPL_HEAT_SOURCE_CPI_HEAT_CONTROLLER_API_H

#include <all.h>

// This file was auto-generated.  Do not edit

bool api_get_heat_control__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(
  STACK_FRAME
  isolette_Isolette_Data_Model_On_Off_Type *value);

void api_put_heat_out__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(
  STACK_FRAME
  isolette_Isolette_Environment_Heat_Type value);

void api_logInfo__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(
  STACK_FRAME
  String str);

void api_logDebug__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(
  STACK_FRAME
  String str);

void api_logError__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(
  STACK_FRAME
  String str);

#endif
