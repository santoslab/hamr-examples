#include <operator_interface_thread_impl_operator_interface_oip_oit_api.h>
#include <operator_interface_thread_impl_operator_interface_oip_oit.h>
#include <ext.h>

// This file will not be overwritten so is safe to edit

static char* component_id = "isolette_single_sensor_Instance_operator_interface_oip_oit";

Unit isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit_initialise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "operator_interface_thread_impl_operator_interface_oip_oit.c", "", "isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit_initialise_", 0);

  printf("%s: isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit_initialise_ called\n", component_id);

  // example usage of api setters

  DeclNewisolette_Isolette_Data_Model_TempWstatus_impl(t0);
  isolette_Isolette_Data_Model_TempWstatus_impl_example(SF &t0);
  api_put_lower_desired_tempWstatus__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF &t0);

  DeclNewisolette_Isolette_Data_Model_TempWstatus_impl(t1);
  isolette_Isolette_Data_Model_TempWstatus_impl_example(SF &t1);
  api_put_upper_desired_tempWstatus__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF &t1);

  DeclNewisolette_Isolette_Data_Model_TempWstatus_impl(t2);
  isolette_Isolette_Data_Model_TempWstatus_impl_example(SF &t2);
  api_put_lower_alarm_tempWstatus__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF &t2);

  DeclNewisolette_Isolette_Data_Model_TempWstatus_impl(t3);
  isolette_Isolette_Data_Model_TempWstatus_impl_example(SF &t3);
  api_put_upper_alarm_tempWstatus__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF &t3);

  /* example usage of api loggers. Commented out as the constructed String may be too long
  api_logInfo__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF string("Example logInfo"));

  api_logDebug__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF string("Example logDebug"));

  api_logError__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF string("Example logError"));
  */
}

Unit isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit_finalise_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "operator_interface_thread_impl_operator_interface_oip_oit.c", "", "isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit_finalise_", 0);
}

Unit isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit_timeTriggered_(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "operator_interface_thread_impl_operator_interface_oip_oit.c", "", "isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit_timeTriggered_", 0);

  // examples of api getter usage

  isolette_Isolette_Data_Model_Status_Type t0;
  if(api_get_regulator_status__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF &t0)) {
    printf("%s: Received data on data port regulator_status: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(regulator_status_str);
    String__append(SF (String) &regulator_status_str, string("Received data on data port regulator_status: "));
    isolette_Isolette_Data_Model_Status_Type_string_(SF (String) &regulator_status_str, t0);
    api_logInfo__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF (String) &regulator_status_str);
    */
  }

  isolette_Isolette_Data_Model_Status_Type t1;
  if(api_get_monitor_status__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF &t1)) {
    printf("%s: Received data on data port monitor_status: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(monitor_status_str);
    String__append(SF (String) &monitor_status_str, string("Received data on data port monitor_status: "));
    isolette_Isolette_Data_Model_Status_Type_string_(SF (String) &monitor_status_str, t1);
    api_logInfo__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF (String) &monitor_status_str);
    */
  }

  DeclNewisolette_Isolette_Data_Model_Temp_impl(t2);
  if(api_get_display_temperature__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF &t2)) {
    printf("%s: Received data on data port display_temperature: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(display_temperature_str);
    String__append(SF (String) &display_temperature_str, string("Received data on data port display_temperature: "));
    isolette_Isolette_Data_Model_Temp_impl_string_(SF (String) &display_temperature_str, &t2);
    api_logInfo__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF (String) &display_temperature_str);
    */
  }

  isolette_Isolette_Data_Model_On_Off_Type t3;
  if(api_get_alarm_control__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF &t3)) {
    printf("%s: Received data on data port alarm_control: \n", component_id);

    /* alternative using logInfo.  Commented out as the constructed String may be too large
    DeclNewString(alarm_control_str);
    String__append(SF (String) &alarm_control_str, string("Received data on data port alarm_control: "));
    isolette_Isolette_Data_Model_On_Off_Type_string_(SF (String) &alarm_control_str, t3);
    api_logInfo__isolette_Isolette_operator_interface_thread_impl_operator_interface_oip_oit(SF (String) &alarm_control_str);
    */
  }
}
