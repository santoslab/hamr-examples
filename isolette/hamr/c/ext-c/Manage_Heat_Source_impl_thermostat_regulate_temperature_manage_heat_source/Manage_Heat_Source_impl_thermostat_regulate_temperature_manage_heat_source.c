#include <Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_api.h>
#include <Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.h>
#include <ext.h>

// This file will not be overwritten so is safe to edit

static char* component_id = "isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source";

Unit isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_initialise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.c", "", "isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_initialise_", 0);

  printf("%s: isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_initialise_ called\n", component_id);

  // example usage of api setters

  isolette_Isolette_Data_Model_On_Off_Type t0 = isolette_Isolette_Data_Model_On_Off_Type_Onn;
  api_put_heat_control__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF t0);

  /* example usage of api loggers. Commented out as the constructed String may be too long
  api_logInfo__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF string("Example logInfo"));

  api_logDebug__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF string("Example logDebug"));

  api_logError__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF string("Example logError"));
  */
}

Unit isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_finalise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.c", "", "isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_finalise_", 0);
}

Unit isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_timeTriggered_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.c", "", "isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_timeTriggered_", 0);

  // examples of api getter usage

  DeclNewisolette_Isolette_Data_Model_TempWstatus_impl(t0);
  if(api_get_current_tempWstatus__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF &t0)) {
    printf("%s: Received data on data port current_tempWstatus: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(current_tempWstatus_str);
    String__append(SF (String) &current_tempWstatus_str, string("Received data on data port current_tempWstatus: "));
    isolette_Isolette_Data_Model_TempWstatus_impl_string_(SF (String) &current_tempWstatus_str, &t0);
    api_logInfo__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF (String) &current_tempWstatus_str);
    */
  }

  DeclNewisolette_Isolette_Data_Model_Temp_impl(t1);
  if(api_get_lower_desired_temp__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF &t1)) {
    printf("%s: Received data on data port lower_desired_temp: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(lower_desired_temp_str);
    String__append(SF (String) &lower_desired_temp_str, string("Received data on data port lower_desired_temp: "));
    isolette_Isolette_Data_Model_Temp_impl_string_(SF (String) &lower_desired_temp_str, &t1);
    api_logInfo__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF (String) &lower_desired_temp_str);
    */
  }

  DeclNewisolette_Isolette_Data_Model_Temp_impl(t2);
  if(api_get_upper_desired_temp__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF &t2)) {
    printf("%s: Received data on data port upper_desired_temp: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(upper_desired_temp_str);
    String__append(SF (String) &upper_desired_temp_str, string("Received data on data port upper_desired_temp: "));
    isolette_Isolette_Data_Model_Temp_impl_string_(SF (String) &upper_desired_temp_str, &t2);
    api_logInfo__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF (String) &upper_desired_temp_str);
    */
  }

  isolette_Isolette_Data_Model_Regulator_Mode_Type t3;
  if(api_get_regulator_mode__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF &t3)) {
    printf("%s: Received data on data port regulator_mode: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(regulator_mode_str);
    String__append(SF (String) &regulator_mode_str, string("Received data on data port regulator_mode: "));
    isolette_Isolette_Data_Model_Regulator_Mode_Type_string_(SF (String) &regulator_mode_str, t3);
    api_logInfo__isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source(SF (String) &regulator_mode_str);
    */
  }
}
