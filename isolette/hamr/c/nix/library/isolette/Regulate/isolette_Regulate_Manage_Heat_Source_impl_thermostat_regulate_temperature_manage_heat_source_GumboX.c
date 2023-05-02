#include <all.h>

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_CEP_Pre(STACK_FRAME isolette_Isolette_Data_Model_On_Off_Type In_lastCmd, isolette_Isolette_Data_Model_TempWstatus_impl api_current_tempWstatus, isolette_Isolette_Data_Model_Temp_impl api_lower_desired_temp, isolette_Isolette_Data_Model_Regulator_Mode_Type api_regulator_mode, isolette_Isolette_Data_Model_Temp_impl api_upper_desired_temp) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_CEP_Pre", 0);

  sfUpdateLoc(88);
  B _r_;
  {
    B t_0 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_CEP_T_Assm(SF (isolette_Isolette_Data_Model_Temp_impl) api_lower_desired_temp, (isolette_Isolette_Data_Model_Temp_impl) api_upper_desired_temp);
    _r_ = t_0;
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_CEP_Post(STACK_FRAME isolette_Isolette_Data_Model_On_Off_Type In_lastCmd, isolette_Isolette_Data_Model_On_Off_Type lastCmd, isolette_Isolette_Data_Model_TempWstatus_impl api_current_tempWstatus, isolette_Isolette_Data_Model_On_Off_Type api_heat_control, isolette_Isolette_Data_Model_Temp_impl api_lower_desired_temp, isolette_Isolette_Data_Model_Regulator_Mode_Type api_regulator_mode, isolette_Isolette_Data_Model_Temp_impl api_upper_desired_temp) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_CEP_Post", 0);

  sfUpdateLoc(230);
  B _r_;
  {
    B t_0 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_CEP_T_Guar(SF lastCmd, api_heat_control);
    B t_1 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_CEP_T_Case(SF In_lastCmd, (isolette_Isolette_Data_Model_TempWstatus_impl) api_current_tempWstatus, api_heat_control, (isolette_Isolette_Data_Model_Temp_impl) api_lower_desired_temp, api_regulator_mode, (isolette_Isolette_Data_Model_Temp_impl) api_upper_desired_temp);
    _r_ = B__and(t_0, t_1);
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_CEP_T_Assm(STACK_FRAME isolette_Isolette_Data_Model_Temp_impl api_lower_desired_temp, isolette_Isolette_Data_Model_Temp_impl api_upper_desired_temp) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_CEP_T_Assm", 0);

  sfUpdateLoc(71);
  B _r_;
  {
    B t_0 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_spec_lower_is_lower_temp_assume(SF (isolette_Isolette_Data_Model_Temp_impl) api_lower_desired_temp, (isolette_Isolette_Data_Model_Temp_impl) api_upper_desired_temp);
    _r_ = t_0;
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_CEP_T_Guar(STACK_FRAME isolette_Isolette_Data_Model_On_Off_Type lastCmd, isolette_Isolette_Data_Model_On_Off_Type api_heat_control) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_CEP_T_Guar", 0);

  sfUpdateLoc(110);
  B _r_;
  {
    B t_0 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_spec_lastCmd_guarantee(SF lastCmd, api_heat_control);
    _r_ = t_0;
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_CEP_T_Case(STACK_FRAME isolette_Isolette_Data_Model_On_Off_Type In_lastCmd, isolette_Isolette_Data_Model_TempWstatus_impl api_current_tempWstatus, isolette_Isolette_Data_Model_On_Off_Type api_heat_control, isolette_Isolette_Data_Model_Temp_impl api_lower_desired_temp, isolette_Isolette_Data_Model_Regulator_Mode_Type api_regulator_mode, isolette_Isolette_Data_Model_Temp_impl api_upper_desired_temp) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_CEP_T_Case", 0);

  sfUpdateLoc(205);
  B _r_;
  {
    B t_0 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_1(SF api_heat_control, api_regulator_mode);
    B t_1 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_2(SF (isolette_Isolette_Data_Model_TempWstatus_impl) api_current_tempWstatus, api_heat_control, (isolette_Isolette_Data_Model_Temp_impl) api_lower_desired_temp, api_regulator_mode);
    B t_2 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_3(SF (isolette_Isolette_Data_Model_TempWstatus_impl) api_current_tempWstatus, api_heat_control, api_regulator_mode, (isolette_Isolette_Data_Model_Temp_impl) api_upper_desired_temp);
    B t_3 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_4(SF In_lastCmd, (isolette_Isolette_Data_Model_TempWstatus_impl) api_current_tempWstatus, api_heat_control, (isolette_Isolette_Data_Model_Temp_impl) api_lower_desired_temp, api_regulator_mode, (isolette_Isolette_Data_Model_Temp_impl) api_upper_desired_temp);
    B t_4 = isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_5(SF api_heat_control, api_regulator_mode);
    _r_ = B__and(B__and(B__and(B__and(t_0, t_1), t_2), t_3), t_4);
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_spec_lower_is_lower_temp_assume(STACK_FRAME isolette_Isolette_Data_Model_Temp_impl api_lower_desired_temp, isolette_Isolette_Data_Model_Temp_impl api_upper_desired_temp) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_spec_lower_is_lower_temp_assume", 0);

  sfUpdateLoc(61);
  B _r_;
  {
    _r_ = F32__le(isolette_Isolette_Data_Model_Temp_impl_value_(api_lower_desired_temp), isolette_Isolette_Data_Model_Temp_impl_value_(api_upper_desired_temp));
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_spec_lastCmd_guarantee(STACK_FRAME isolette_Isolette_Data_Model_On_Off_Type lastCmd, isolette_Isolette_Data_Model_On_Off_Type api_heat_control) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_spec_lastCmd_guarantee", 0);

  sfUpdateLoc(100);
  B _r_;
  {
    _r_ = isolette_Isolette_Data_Model_On_Off_Type__eq(lastCmd, api_heat_control);
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_1(STACK_FRAME isolette_Isolette_Data_Model_On_Off_Type api_heat_control, isolette_Isolette_Data_Model_Regulator_Mode_Type api_regulator_mode) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_case_REQ_MHS_1", 0);

  sfUpdateLoc(121);
  B _r_;
  {
    B t_0 = T;
    if (isolette_Isolette_Data_Model_Regulator_Mode_Type__eq(api_regulator_mode, isolette_Isolette_Data_Model_Regulator_Mode_Type_Init_Regulator_Mode)) {
      t_0 = isolette_Isolette_Data_Model_On_Off_Type__eq(api_heat_control, isolette_Isolette_Data_Model_On_Off_Type_Off);
    }
    _r_ = t_0;
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_2(STACK_FRAME isolette_Isolette_Data_Model_TempWstatus_impl api_current_tempWstatus, isolette_Isolette_Data_Model_On_Off_Type api_heat_control, isolette_Isolette_Data_Model_Temp_impl api_lower_desired_temp, isolette_Isolette_Data_Model_Regulator_Mode_Type api_regulator_mode) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_case_REQ_MHS_2", 0);

  sfUpdateLoc(137);
  B _r_;
  {
    B t_0 = T;
    if (B__and(isolette_Isolette_Data_Model_Regulator_Mode_Type__eq(api_regulator_mode, isolette_Isolette_Data_Model_Regulator_Mode_Type_Normal_Regulator_Mode), F32__lt(isolette_Isolette_Data_Model_TempWstatus_impl_value_(api_current_tempWstatus), isolette_Isolette_Data_Model_Temp_impl_value_(api_lower_desired_temp)))) {
      t_0 = isolette_Isolette_Data_Model_On_Off_Type__eq(api_heat_control, isolette_Isolette_Data_Model_On_Off_Type_Onn);
    }
    _r_ = t_0;
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_3(STACK_FRAME isolette_Isolette_Data_Model_TempWstatus_impl api_current_tempWstatus, isolette_Isolette_Data_Model_On_Off_Type api_heat_control, isolette_Isolette_Data_Model_Regulator_Mode_Type api_regulator_mode, isolette_Isolette_Data_Model_Temp_impl api_upper_desired_temp) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_case_REQ_MHS_3", 0);

  sfUpdateLoc(154);
  B _r_;
  {
    B t_0 = T;
    if (B__and(isolette_Isolette_Data_Model_Regulator_Mode_Type__eq(api_regulator_mode, isolette_Isolette_Data_Model_Regulator_Mode_Type_Normal_Regulator_Mode), F32__gt(isolette_Isolette_Data_Model_TempWstatus_impl_value_(api_current_tempWstatus), isolette_Isolette_Data_Model_Temp_impl_value_(api_upper_desired_temp)))) {
      t_0 = isolette_Isolette_Data_Model_On_Off_Type__eq(api_heat_control, isolette_Isolette_Data_Model_On_Off_Type_Off);
    }
    _r_ = t_0;
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_4(STACK_FRAME isolette_Isolette_Data_Model_On_Off_Type In_lastCmd, isolette_Isolette_Data_Model_TempWstatus_impl api_current_tempWstatus, isolette_Isolette_Data_Model_On_Off_Type api_heat_control, isolette_Isolette_Data_Model_Temp_impl api_lower_desired_temp, isolette_Isolette_Data_Model_Regulator_Mode_Type api_regulator_mode, isolette_Isolette_Data_Model_Temp_impl api_upper_desired_temp) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_case_REQ_MHS_4", 0);

  sfUpdateLoc(177);
  B _r_;
  {
    B t_0 = T;
    if (B__and(isolette_Isolette_Data_Model_Regulator_Mode_Type__eq(api_regulator_mode, isolette_Isolette_Data_Model_Regulator_Mode_Type_Normal_Regulator_Mode), B__and(F32__ge(isolette_Isolette_Data_Model_TempWstatus_impl_value_(api_current_tempWstatus), isolette_Isolette_Data_Model_Temp_impl_value_(api_lower_desired_temp)), F32__le(isolette_Isolette_Data_Model_TempWstatus_impl_value_(api_current_tempWstatus), isolette_Isolette_Data_Model_Temp_impl_value_(api_upper_desired_temp))))) {
      t_0 = isolette_Isolette_Data_Model_On_Off_Type__eq(api_heat_control, In_lastCmd);
    }
    _r_ = t_0;
  }
  return _r_;
}

B isolette_Regulate_Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_compute_case_REQ_MHS_5(STACK_FRAME isolette_Isolette_Data_Model_On_Off_Type api_heat_control, isolette_Isolette_Data_Model_Regulator_Mode_Type api_regulator_mode) {
  DeclNewStackFrame(caller, "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala", "isolette.Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX", "compute_case_REQ_MHS_5", 0);

  sfUpdateLoc(191);
  B _r_;
  {
    B t_0 = T;
    if (isolette_Isolette_Data_Model_Regulator_Mode_Type__eq(api_regulator_mode, isolette_Isolette_Data_Model_Regulator_Mode_Type_Failed_Regulator_Mode)) {
      t_0 = isolette_Isolette_Data_Model_On_Off_Type__eq(api_heat_control, isolette_Isolette_Data_Model_On_Off_Type_Off);
    }
    _r_ = t_0;
  }
  return _r_;
}