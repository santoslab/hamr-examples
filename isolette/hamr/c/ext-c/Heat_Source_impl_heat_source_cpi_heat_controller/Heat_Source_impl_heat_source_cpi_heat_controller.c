#include <Heat_Source_impl_heat_source_cpi_heat_controller_api.h>
#include <Heat_Source_impl_heat_source_cpi_heat_controller.h>
#include <ext.h>

// This file will not be overwritten so is safe to edit

static char* component_id = "isolette_single_sensor_Instance_heat_source_cpi_heat_controller";

Unit isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller_initialise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Heat_Source_impl_heat_source_cpi_heat_controller.c", "", "isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller_initialise_", 0);

  printf("%s: isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller_initialise_ called\n", component_id);

  // example usage of api setters

  isolette_Isolette_Environment_Heat_Type t0 = isolette_Isolette_Environment_Heat_Type_Dummy_Head_Enum;
  api_put_heat_out__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(SF t0);

  /* example usage of api loggers. Commented out as the constructed String may be too long
  api_logInfo__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(SF string("Example logInfo"));

  api_logDebug__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(SF string("Example logDebug"));

  api_logError__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(SF string("Example logError"));
  */
}

Unit isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller_finalise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Heat_Source_impl_heat_source_cpi_heat_controller.c", "", "isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller_finalise_", 0);
}

Unit isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller_timeTriggered_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "Heat_Source_impl_heat_source_cpi_heat_controller.c", "", "isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller_timeTriggered_", 0);

  // examples of api getter usage

  isolette_Isolette_Data_Model_On_Off_Type t0;
  if(api_get_heat_control__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(SF &t0)) {
    printf("%s: Received data on data port heat_control: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(heat_control_str);
    String__append(SF (String) &heat_control_str, string("Received data on data port heat_control: "));
    isolette_Isolette_Data_Model_On_Off_Type_string_(SF (String) &heat_control_str, t0);
    api_logInfo__isolette_Devices_Heat_Source_impl_heat_source_cpi_heat_controller(SF (String) &heat_control_str);
    */
  }
}
