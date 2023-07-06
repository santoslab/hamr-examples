// #Sireum
// @formatter:off

// This file is auto-generated from Heat.scala, Interface_Interaction.scala, PhysicalTemp_impl.scala, ValueStatus.scala, TempWstatus_impl.scala, On_Off.scala, Status.scala, Temp_impl.scala, Regulator_Mode.scala, Failure_Flag_impl.scala, Monitor_Mode.scala, Base_Types.scala, Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVectors.scala, Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectors.scala, Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectors.scala, Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectors.scala, Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectors.scala, Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectors.scala, DataContent.scala

package isolette

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printIsolette_EnvironmentHeatType(o: Isolette_Environment.Heat.Type): ST = {
      val value: String = o match {
        case Isolette_Environment.Heat.Dummy_Head_Enum => "Dummy_Head_Enum"
      }
      return printObject(ISZ(
        ("type", printString("Isolette_Environment.Heat")),
        ("value", printString(value))
      ))
    }

    @pure def printIsolette_EnvironmentHeat_Payload(o: Isolette_Environment.Heat_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Environment.Heat_Payload""""),
        ("value", printIsolette_EnvironmentHeatType(o.value))
      ))
    }

    @pure def printIsolette_EnvironmentInterface_InteractionType(o: Isolette_Environment.Interface_Interaction.Type): ST = {
      val value: String = o match {
        case Isolette_Environment.Interface_Interaction.Dummy_Interface_Interaction_Enum => "Dummy_Interface_Interaction_Enum"
      }
      return printObject(ISZ(
        ("type", printString("Isolette_Environment.Interface_Interaction")),
        ("value", printString(value))
      ))
    }

    @pure def printIsolette_EnvironmentInterface_Interaction_Payload(o: Isolette_Environment.Interface_Interaction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Environment.Interface_Interaction_Payload""""),
        ("value", printIsolette_EnvironmentInterface_InteractionType(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelPhysicalTemp_impl(o: Isolette_Data_Model.PhysicalTemp_impl): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.PhysicalTemp_impl""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelPhysicalTemp_impl_Payload(o: Isolette_Data_Model.PhysicalTemp_impl_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.PhysicalTemp_impl_Payload""""),
        ("value", printIsolette_Data_ModelPhysicalTemp_impl(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelValueStatusType(o: Isolette_Data_Model.ValueStatus.Type): ST = {
      val value: String = o match {
        case Isolette_Data_Model.ValueStatus.Valid => "Valid"
        case Isolette_Data_Model.ValueStatus.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Isolette_Data_Model.ValueStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printIsolette_Data_ModelValueStatus_Payload(o: Isolette_Data_Model.ValueStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.ValueStatus_Payload""""),
        ("value", printIsolette_Data_ModelValueStatusType(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelTempWstatus_impl(o: Isolette_Data_Model.TempWstatus_impl): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.TempWstatus_impl""""),
        ("value", printF32(o.value)),
        ("status", printIsolette_Data_ModelValueStatusType(o.status))
      ))
    }

    @pure def printIsolette_Data_ModelTempWstatus_impl_Payload(o: Isolette_Data_Model.TempWstatus_impl_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.TempWstatus_impl_Payload""""),
        ("value", printIsolette_Data_ModelTempWstatus_impl(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelOn_OffType(o: Isolette_Data_Model.On_Off.Type): ST = {
      val value: String = o match {
        case Isolette_Data_Model.On_Off.Onn => "Onn"
        case Isolette_Data_Model.On_Off.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("Isolette_Data_Model.On_Off")),
        ("value", printString(value))
      ))
    }

    @pure def printIsolette_Data_ModelOn_Off_Payload(o: Isolette_Data_Model.On_Off_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.On_Off_Payload""""),
        ("value", printIsolette_Data_ModelOn_OffType(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelStatusType(o: Isolette_Data_Model.Status.Type): ST = {
      val value: String = o match {
        case Isolette_Data_Model.Status.Init_Status => "Init_Status"
        case Isolette_Data_Model.Status.On_Status => "On_Status"
        case Isolette_Data_Model.Status.Failed_Status => "Failed_Status"
      }
      return printObject(ISZ(
        ("type", printString("Isolette_Data_Model.Status")),
        ("value", printString(value))
      ))
    }

    @pure def printIsolette_Data_ModelStatus_Payload(o: Isolette_Data_Model.Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.Status_Payload""""),
        ("value", printIsolette_Data_ModelStatusType(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelTemp_impl(o: Isolette_Data_Model.Temp_impl): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.Temp_impl""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelTemp_impl_Payload(o: Isolette_Data_Model.Temp_impl_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.Temp_impl_Payload""""),
        ("value", printIsolette_Data_ModelTemp_impl(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelRegulator_ModeType(o: Isolette_Data_Model.Regulator_Mode.Type): ST = {
      val value: String = o match {
        case Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode => "Init_Regulator_Mode"
        case Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode => "Normal_Regulator_Mode"
        case Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode => "Failed_Regulator_Mode"
      }
      return printObject(ISZ(
        ("type", printString("Isolette_Data_Model.Regulator_Mode")),
        ("value", printString(value))
      ))
    }

    @pure def printIsolette_Data_ModelRegulator_Mode_Payload(o: Isolette_Data_Model.Regulator_Mode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.Regulator_Mode_Payload""""),
        ("value", printIsolette_Data_ModelRegulator_ModeType(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelFailure_Flag_impl(o: Isolette_Data_Model.Failure_Flag_impl): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.Failure_Flag_impl""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelFailure_Flag_impl_Payload(o: Isolette_Data_Model.Failure_Flag_impl_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.Failure_Flag_impl_Payload""""),
        ("value", printIsolette_Data_ModelFailure_Flag_impl(o.value))
      ))
    }

    @pure def printIsolette_Data_ModelMonitor_ModeType(o: Isolette_Data_Model.Monitor_Mode.Type): ST = {
      val value: String = o match {
        case Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode => "Init_Monitor_Mode"
        case Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode => "Normal_Monitor_Mode"
        case Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode => "Failed_Monitor_Mode"
      }
      return printObject(ISZ(
        ("type", printString("Isolette_Data_Model.Monitor_Mode")),
        ("value", printString(value))
      ))
    }

    @pure def printIsolette_Data_ModelMonitor_Mode_Payload(o: Isolette_Data_Model.Monitor_Mode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Isolette_Data_Model.Monitor_Mode_Payload""""),
        ("value", printIsolette_Data_ModelMonitor_ModeType(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(o: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector): ST = {
      return printObject(ISZ(
        ("type", st""""Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector""""),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_lower_desired_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_lower_desired_tempWstatus)),
        ("api_regulator_mode", printIsolette_Data_ModelRegulator_ModeType(o.api_regulator_mode)),
        ("api_upper_desired_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_upper_desired_tempWstatus))
      ))
    }

    @pure def printRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(o: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector): ST = {
      return printObject(ISZ(
        ("type", st""""Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector""""),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_lower_desired_temp", printIsolette_Data_ModelTemp_impl(o.api_lower_desired_temp)),
        ("api_regulator_mode", printIsolette_Data_ModelRegulator_ModeType(o.api_regulator_mode)),
        ("api_upper_desired_temp", printIsolette_Data_ModelTemp_impl(o.api_upper_desired_temp))
      ))
    }

    @pure def printRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(o: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL): ST = {
      return printObject(ISZ(
        ("type", st""""Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL""""),
        ("In_lastCmd", printIsolette_Data_ModelOn_OffType(o.In_lastCmd)),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_lower_desired_temp", printIsolette_Data_ModelTemp_impl(o.api_lower_desired_temp)),
        ("api_regulator_mode", printIsolette_Data_ModelRegulator_ModeType(o.api_regulator_mode)),
        ("api_upper_desired_temp", printIsolette_Data_ModelTemp_impl(o.api_upper_desired_temp))
      ))
    }

    @pure def printRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(o: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector): ST = {
      return printObject(ISZ(
        ("type", st""""Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector""""),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_interface_failure", printIsolette_Data_ModelFailure_Flag_impl(o.api_interface_failure)),
        ("api_internal_failure", printIsolette_Data_ModelFailure_Flag_impl(o.api_internal_failure))
      ))
    }

    @pure def printRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(o: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL): ST = {
      return printObject(ISZ(
        ("type", st""""Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL""""),
        ("In_lastRegulatorMode", printIsolette_Data_ModelRegulator_ModeType(o.In_lastRegulatorMode)),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_interface_failure", printIsolette_Data_ModelFailure_Flag_impl(o.api_interface_failure)),
        ("api_internal_failure", printIsolette_Data_ModelFailure_Flag_impl(o.api_internal_failure))
      ))
    }

    @pure def printMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(o: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector): ST = {
      return printObject(ISZ(
        ("type", st""""Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector""""),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_lower_alarm_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_lower_alarm_tempWstatus)),
        ("api_monitor_mode", printIsolette_Data_ModelMonitor_ModeType(o.api_monitor_mode)),
        ("api_upper_alarm_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_upper_alarm_tempWstatus))
      ))
    }

    @pure def printMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(o: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL): ST = {
      return printObject(ISZ(
        ("type", st""""Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL""""),
        ("In_lastCmd", printIsolette_Data_ModelOn_OffType(o.In_lastCmd)),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_lower_alarm_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_lower_alarm_tempWstatus)),
        ("api_monitor_mode", printIsolette_Data_ModelMonitor_ModeType(o.api_monitor_mode)),
        ("api_upper_alarm_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_upper_alarm_tempWstatus))
      ))
    }

    @pure def printMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(o: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector): ST = {
      return printObject(ISZ(
        ("type", st""""Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector""""),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_lower_alarm_temp", printIsolette_Data_ModelTemp_impl(o.api_lower_alarm_temp)),
        ("api_monitor_mode", printIsolette_Data_ModelMonitor_ModeType(o.api_monitor_mode)),
        ("api_upper_alarm_temp", printIsolette_Data_ModelTemp_impl(o.api_upper_alarm_temp))
      ))
    }

    @pure def printMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(o: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL): ST = {
      return printObject(ISZ(
        ("type", st""""Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL""""),
        ("In_lastCmd", printIsolette_Data_ModelOn_OffType(o.In_lastCmd)),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_lower_alarm_temp", printIsolette_Data_ModelTemp_impl(o.api_lower_alarm_temp)),
        ("api_monitor_mode", printIsolette_Data_ModelMonitor_ModeType(o.api_monitor_mode)),
        ("api_upper_alarm_temp", printIsolette_Data_ModelTemp_impl(o.api_upper_alarm_temp))
      ))
    }

    @pure def printMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(o: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector): ST = {
      return printObject(ISZ(
        ("type", st""""Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector""""),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_interface_failure", printIsolette_Data_ModelFailure_Flag_impl(o.api_interface_failure)),
        ("api_internal_failure", printIsolette_Data_ModelFailure_Flag_impl(o.api_internal_failure))
      ))
    }

    @pure def printMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(o: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL): ST = {
      return printObject(ISZ(
        ("type", st""""Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL""""),
        ("In_lastMonitorMode", printIsolette_Data_ModelMonitor_ModeType(o.In_lastMonitorMode)),
        ("api_current_tempWstatus", printIsolette_Data_ModelTempWstatus_impl(o.api_current_tempWstatus)),
        ("api_interface_failure", printIsolette_Data_ModelFailure_Flag_impl(o.api_interface_failure)),
        ("api_internal_failure", printIsolette_Data_ModelFailure_Flag_impl(o.api_internal_failure))
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: Isolette_Environment.Heat_Payload => return printIsolette_EnvironmentHeat_Payload(o)
        case o: Isolette_Data_Model.On_Off_Payload => return printIsolette_Data_ModelOn_Off_Payload(o)
        case o: Isolette_Data_Model.Status_Payload => return printIsolette_Data_ModelStatus_Payload(o)
        case o: Isolette_Data_Model.Temp_impl_Payload => return printIsolette_Data_ModelTemp_impl_Payload(o)
        case o: Isolette_Data_Model.ValueStatus_Payload => return printIsolette_Data_ModelValueStatus_Payload(o)
        case o: Isolette_Data_Model.Monitor_Mode_Payload => return printIsolette_Data_ModelMonitor_Mode_Payload(o)
        case o: Isolette_Data_Model.Regulator_Mode_Payload => return printIsolette_Data_ModelRegulator_Mode_Payload(o)
        case o: Isolette_Data_Model.TempWstatus_impl_Payload => return printIsolette_Data_ModelTempWstatus_impl_Payload(o)
        case o: Isolette_Data_Model.Failure_Flag_impl_Payload => return printIsolette_Data_ModelFailure_Flag_impl_Payload(o)
        case o: Isolette_Data_Model.PhysicalTemp_impl_Payload => return printIsolette_Data_ModelPhysicalTemp_impl_Payload(o)
        case o: Isolette_Environment.Interface_Interaction_Payload => return printIsolette_EnvironmentInterface_Interaction_Payload(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseIsolette_EnvironmentHeatType(): Isolette_Environment.Heat.Type = {
      val r = parseIsolette_EnvironmentHeatT(F)
      return r
    }

    def parseIsolette_EnvironmentHeatT(typeParsed: B): Isolette_Environment.Heat.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Environment.Heat")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Isolette_Environment.Heat.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Isolette_Environment.Heat.")
          return Isolette_Environment.Heat.byOrdinal(0).get
      }
    }

    def parseIsolette_EnvironmentHeat_Payload(): Isolette_Environment.Heat_Payload = {
      val r = parseIsolette_EnvironmentHeat_PayloadT(F)
      return r
    }

    def parseIsolette_EnvironmentHeat_PayloadT(typeParsed: B): Isolette_Environment.Heat_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Environment.Heat_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_EnvironmentHeatType()
      parser.parseObjectNext()
      return Isolette_Environment.Heat_Payload(value)
    }

    def parseIsolette_EnvironmentInterface_InteractionType(): Isolette_Environment.Interface_Interaction.Type = {
      val r = parseIsolette_EnvironmentInterface_InteractionT(F)
      return r
    }

    def parseIsolette_EnvironmentInterface_InteractionT(typeParsed: B): Isolette_Environment.Interface_Interaction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Environment.Interface_Interaction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Isolette_Environment.Interface_Interaction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Isolette_Environment.Interface_Interaction.")
          return Isolette_Environment.Interface_Interaction.byOrdinal(0).get
      }
    }

    def parseIsolette_EnvironmentInterface_Interaction_Payload(): Isolette_Environment.Interface_Interaction_Payload = {
      val r = parseIsolette_EnvironmentInterface_Interaction_PayloadT(F)
      return r
    }

    def parseIsolette_EnvironmentInterface_Interaction_PayloadT(typeParsed: B): Isolette_Environment.Interface_Interaction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Environment.Interface_Interaction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_EnvironmentInterface_InteractionType()
      parser.parseObjectNext()
      return Isolette_Environment.Interface_Interaction_Payload(value)
    }

    def parseIsolette_Data_ModelPhysicalTemp_impl(): Isolette_Data_Model.PhysicalTemp_impl = {
      val r = parseIsolette_Data_ModelPhysicalTemp_implT(F)
      return r
    }

    def parseIsolette_Data_ModelPhysicalTemp_implT(typeParsed: B): Isolette_Data_Model.PhysicalTemp_impl = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.PhysicalTemp_impl")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Isolette_Data_Model.PhysicalTemp_impl(value)
    }

    def parseIsolette_Data_ModelPhysicalTemp_impl_Payload(): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
      val r = parseIsolette_Data_ModelPhysicalTemp_impl_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelPhysicalTemp_impl_PayloadT(typeParsed: B): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.PhysicalTemp_impl_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelPhysicalTemp_impl()
      parser.parseObjectNext()
      return Isolette_Data_Model.PhysicalTemp_impl_Payload(value)
    }

    def parseIsolette_Data_ModelValueStatusType(): Isolette_Data_Model.ValueStatus.Type = {
      val r = parseIsolette_Data_ModelValueStatusT(F)
      return r
    }

    def parseIsolette_Data_ModelValueStatusT(typeParsed: B): Isolette_Data_Model.ValueStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.ValueStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Isolette_Data_Model.ValueStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Isolette_Data_Model.ValueStatus.")
          return Isolette_Data_Model.ValueStatus.byOrdinal(0).get
      }
    }

    def parseIsolette_Data_ModelValueStatus_Payload(): Isolette_Data_Model.ValueStatus_Payload = {
      val r = parseIsolette_Data_ModelValueStatus_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelValueStatus_PayloadT(typeParsed: B): Isolette_Data_Model.ValueStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.ValueStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelValueStatusType()
      parser.parseObjectNext()
      return Isolette_Data_Model.ValueStatus_Payload(value)
    }

    def parseIsolette_Data_ModelTempWstatus_impl(): Isolette_Data_Model.TempWstatus_impl = {
      val r = parseIsolette_Data_ModelTempWstatus_implT(F)
      return r
    }

    def parseIsolette_Data_ModelTempWstatus_implT(typeParsed: B): Isolette_Data_Model.TempWstatus_impl = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.TempWstatus_impl")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseIsolette_Data_ModelValueStatusType()
      parser.parseObjectNext()
      return Isolette_Data_Model.TempWstatus_impl(value, status)
    }

    def parseIsolette_Data_ModelTempWstatus_impl_Payload(): Isolette_Data_Model.TempWstatus_impl_Payload = {
      val r = parseIsolette_Data_ModelTempWstatus_impl_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelTempWstatus_impl_PayloadT(typeParsed: B): Isolette_Data_Model.TempWstatus_impl_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.TempWstatus_impl_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      return Isolette_Data_Model.TempWstatus_impl_Payload(value)
    }

    def parseIsolette_Data_ModelOn_OffType(): Isolette_Data_Model.On_Off.Type = {
      val r = parseIsolette_Data_ModelOn_OffT(F)
      return r
    }

    def parseIsolette_Data_ModelOn_OffT(typeParsed: B): Isolette_Data_Model.On_Off.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.On_Off")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Isolette_Data_Model.On_Off.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Isolette_Data_Model.On_Off.")
          return Isolette_Data_Model.On_Off.byOrdinal(0).get
      }
    }

    def parseIsolette_Data_ModelOn_Off_Payload(): Isolette_Data_Model.On_Off_Payload = {
      val r = parseIsolette_Data_ModelOn_Off_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelOn_Off_PayloadT(typeParsed: B): Isolette_Data_Model.On_Off_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.On_Off_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelOn_OffType()
      parser.parseObjectNext()
      return Isolette_Data_Model.On_Off_Payload(value)
    }

    def parseIsolette_Data_ModelStatusType(): Isolette_Data_Model.Status.Type = {
      val r = parseIsolette_Data_ModelStatusT(F)
      return r
    }

    def parseIsolette_Data_ModelStatusT(typeParsed: B): Isolette_Data_Model.Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Isolette_Data_Model.Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Isolette_Data_Model.Status.")
          return Isolette_Data_Model.Status.byOrdinal(0).get
      }
    }

    def parseIsolette_Data_ModelStatus_Payload(): Isolette_Data_Model.Status_Payload = {
      val r = parseIsolette_Data_ModelStatus_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelStatus_PayloadT(typeParsed: B): Isolette_Data_Model.Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelStatusType()
      parser.parseObjectNext()
      return Isolette_Data_Model.Status_Payload(value)
    }

    def parseIsolette_Data_ModelTemp_impl(): Isolette_Data_Model.Temp_impl = {
      val r = parseIsolette_Data_ModelTemp_implT(F)
      return r
    }

    def parseIsolette_Data_ModelTemp_implT(typeParsed: B): Isolette_Data_Model.Temp_impl = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Temp_impl")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Isolette_Data_Model.Temp_impl(value)
    }

    def parseIsolette_Data_ModelTemp_impl_Payload(): Isolette_Data_Model.Temp_impl_Payload = {
      val r = parseIsolette_Data_ModelTemp_impl_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelTemp_impl_PayloadT(typeParsed: B): Isolette_Data_Model.Temp_impl_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Temp_impl_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      return Isolette_Data_Model.Temp_impl_Payload(value)
    }

    def parseIsolette_Data_ModelRegulator_ModeType(): Isolette_Data_Model.Regulator_Mode.Type = {
      val r = parseIsolette_Data_ModelRegulator_ModeT(F)
      return r
    }

    def parseIsolette_Data_ModelRegulator_ModeT(typeParsed: B): Isolette_Data_Model.Regulator_Mode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Regulator_Mode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Isolette_Data_Model.Regulator_Mode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Isolette_Data_Model.Regulator_Mode.")
          return Isolette_Data_Model.Regulator_Mode.byOrdinal(0).get
      }
    }

    def parseIsolette_Data_ModelRegulator_Mode_Payload(): Isolette_Data_Model.Regulator_Mode_Payload = {
      val r = parseIsolette_Data_ModelRegulator_Mode_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelRegulator_Mode_PayloadT(typeParsed: B): Isolette_Data_Model.Regulator_Mode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Regulator_Mode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelRegulator_ModeType()
      parser.parseObjectNext()
      return Isolette_Data_Model.Regulator_Mode_Payload(value)
    }

    def parseIsolette_Data_ModelFailure_Flag_impl(): Isolette_Data_Model.Failure_Flag_impl = {
      val r = parseIsolette_Data_ModelFailure_Flag_implT(F)
      return r
    }

    def parseIsolette_Data_ModelFailure_Flag_implT(typeParsed: B): Isolette_Data_Model.Failure_Flag_impl = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Failure_Flag_impl")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Isolette_Data_Model.Failure_Flag_impl(value)
    }

    def parseIsolette_Data_ModelFailure_Flag_impl_Payload(): Isolette_Data_Model.Failure_Flag_impl_Payload = {
      val r = parseIsolette_Data_ModelFailure_Flag_impl_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelFailure_Flag_impl_PayloadT(typeParsed: B): Isolette_Data_Model.Failure_Flag_impl_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Failure_Flag_impl_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      return Isolette_Data_Model.Failure_Flag_impl_Payload(value)
    }

    def parseIsolette_Data_ModelMonitor_ModeType(): Isolette_Data_Model.Monitor_Mode.Type = {
      val r = parseIsolette_Data_ModelMonitor_ModeT(F)
      return r
    }

    def parseIsolette_Data_ModelMonitor_ModeT(typeParsed: B): Isolette_Data_Model.Monitor_Mode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Monitor_Mode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Isolette_Data_Model.Monitor_Mode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Isolette_Data_Model.Monitor_Mode.")
          return Isolette_Data_Model.Monitor_Mode.byOrdinal(0).get
      }
    }

    def parseIsolette_Data_ModelMonitor_Mode_Payload(): Isolette_Data_Model.Monitor_Mode_Payload = {
      val r = parseIsolette_Data_ModelMonitor_Mode_PayloadT(F)
      return r
    }

    def parseIsolette_Data_ModelMonitor_Mode_PayloadT(typeParsed: B): Isolette_Data_Model.Monitor_Mode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Isolette_Data_Model.Monitor_Mode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseIsolette_Data_ModelMonitor_ModeType()
      parser.parseObjectNext()
      return Isolette_Data_Model.Monitor_Mode_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector = {
      val r = parseRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVectorT(F)
      return r
    }

    def parseRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVectorT(typeParsed: B): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector = {
      if (!typeParsed) {
        parser.parseObjectType("Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector")
      }
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lower_desired_tempWstatus")
      val api_lower_desired_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_regulator_mode")
      val api_regulator_mode = parseIsolette_Data_ModelRegulator_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_desired_tempWstatus")
      val api_upper_desired_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      return Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)
    }

    def parseRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector = {
      val r = parseRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorT(F)
      return r
    }

    def parseRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorT(typeParsed: B): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector = {
      if (!typeParsed) {
        parser.parseObjectType("Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector")
      }
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lower_desired_temp")
      val api_lower_desired_temp = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_regulator_mode")
      val api_regulator_mode = parseIsolette_Data_ModelRegulator_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_desired_temp")
      val api_upper_desired_temp = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      return Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
    }

    def parseRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL = {
      val r = parseRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwLT(F)
      return r
    }

    def parseRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwLT(typeParsed: B): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL = {
      if (!typeParsed) {
        parser.parseObjectType("Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL")
      }
      parser.parseObjectKey("In_lastCmd")
      val In_lastCmd = parseIsolette_Data_ModelOn_OffType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lower_desired_temp")
      val api_lower_desired_temp = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_regulator_mode")
      val api_regulator_mode = parseIsolette_Data_ModelRegulator_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_desired_temp")
      val api_upper_desired_temp = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      return Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
    }

    def parseRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector = {
      val r = parseRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorT(F)
      return r
    }

    def parseRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorT(typeParsed: B): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector = {
      if (!typeParsed) {
        parser.parseObjectType("Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector")
      }
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interface_failure")
      val api_interface_failure = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_internal_failure")
      val api_internal_failure = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      return Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(api_current_tempWstatus, api_interface_failure, api_internal_failure)
    }

    def parseRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL = {
      val r = parseRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwLT(F)
      return r
    }

    def parseRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwLT(typeParsed: B): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL = {
      if (!typeParsed) {
        parser.parseObjectType("Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL")
      }
      parser.parseObjectKey("In_lastRegulatorMode")
      val In_lastRegulatorMode = parseIsolette_Data_ModelRegulator_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interface_failure")
      val api_interface_failure = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_internal_failure")
      val api_internal_failure = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      return Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(In_lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
    }

    def parseMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector = {
      val r = parseMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorT(F)
      return r
    }

    def parseMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorT(typeParsed: B): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector = {
      if (!typeParsed) {
        parser.parseObjectType("Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector")
      }
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lower_alarm_tempWstatus")
      val api_lower_alarm_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitor_mode")
      val api_monitor_mode = parseIsolette_Data_ModelMonitor_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_alarm_tempWstatus")
      val api_upper_alarm_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      return Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
    }

    def parseMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL = {
      val r = parseMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwLT(F)
      return r
    }

    def parseMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwLT(typeParsed: B): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL = {
      if (!typeParsed) {
        parser.parseObjectType("Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL")
      }
      parser.parseObjectKey("In_lastCmd")
      val In_lastCmd = parseIsolette_Data_ModelOn_OffType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lower_alarm_tempWstatus")
      val api_lower_alarm_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitor_mode")
      val api_monitor_mode = parseIsolette_Data_ModelMonitor_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_alarm_tempWstatus")
      val api_upper_alarm_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      return Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
    }

    def parseMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector = {
      val r = parseMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorT(F)
      return r
    }

    def parseMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorT(typeParsed: B): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector = {
      if (!typeParsed) {
        parser.parseObjectType("Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector")
      }
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lower_alarm_temp")
      val api_lower_alarm_temp = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitor_mode")
      val api_monitor_mode = parseIsolette_Data_ModelMonitor_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_alarm_temp")
      val api_upper_alarm_temp = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      return Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
    }

    def parseMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL = {
      val r = parseMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwLT(F)
      return r
    }

    def parseMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwLT(typeParsed: B): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL = {
      if (!typeParsed) {
        parser.parseObjectType("Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL")
      }
      parser.parseObjectKey("In_lastCmd")
      val In_lastCmd = parseIsolette_Data_ModelOn_OffType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lower_alarm_temp")
      val api_lower_alarm_temp = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitor_mode")
      val api_monitor_mode = parseIsolette_Data_ModelMonitor_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_alarm_temp")
      val api_upper_alarm_temp = parseIsolette_Data_ModelTemp_impl()
      parser.parseObjectNext()
      return Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
    }

    def parseMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector = {
      val r = parseMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorT(F)
      return r
    }

    def parseMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorT(typeParsed: B): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector = {
      if (!typeParsed) {
        parser.parseObjectType("Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector")
      }
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interface_failure")
      val api_interface_failure = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_internal_failure")
      val api_internal_failure = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      return Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(api_current_tempWstatus, api_interface_failure, api_internal_failure)
    }

    def parseMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL = {
      val r = parseMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwLT(F)
      return r
    }

    def parseMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwLT(typeParsed: B): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL = {
      if (!typeParsed) {
        parser.parseObjectType("Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL")
      }
      parser.parseObjectKey("In_lastMonitorMode")
      val In_lastMonitorMode = parseIsolette_Data_ModelMonitor_ModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_tempWstatus")
      val api_current_tempWstatus = parseIsolette_Data_ModelTempWstatus_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interface_failure")
      val api_interface_failure = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_internal_failure")
      val api_internal_failure = parseIsolette_Data_ModelFailure_Flag_impl()
      parser.parseObjectNext()
      return Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "Isolette_Environment.Heat_Payload", "Isolette_Data_Model.On_Off_Payload", "Isolette_Data_Model.Status_Payload", "Isolette_Data_Model.Temp_impl_Payload", "Isolette_Data_Model.ValueStatus_Payload", "Isolette_Data_Model.Monitor_Mode_Payload", "Isolette_Data_Model.Regulator_Mode_Payload", "Isolette_Data_Model.TempWstatus_impl_Payload", "Isolette_Data_Model.Failure_Flag_impl_Payload", "Isolette_Data_Model.PhysicalTemp_impl_Payload", "Isolette_Environment.Interface_Interaction_Payload"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "Isolette_Environment.Heat_Payload" => val r = parseIsolette_EnvironmentHeat_PayloadT(T); return r
        case "Isolette_Data_Model.On_Off_Payload" => val r = parseIsolette_Data_ModelOn_Off_PayloadT(T); return r
        case "Isolette_Data_Model.Status_Payload" => val r = parseIsolette_Data_ModelStatus_PayloadT(T); return r
        case "Isolette_Data_Model.Temp_impl_Payload" => val r = parseIsolette_Data_ModelTemp_impl_PayloadT(T); return r
        case "Isolette_Data_Model.ValueStatus_Payload" => val r = parseIsolette_Data_ModelValueStatus_PayloadT(T); return r
        case "Isolette_Data_Model.Monitor_Mode_Payload" => val r = parseIsolette_Data_ModelMonitor_Mode_PayloadT(T); return r
        case "Isolette_Data_Model.Regulator_Mode_Payload" => val r = parseIsolette_Data_ModelRegulator_Mode_PayloadT(T); return r
        case "Isolette_Data_Model.TempWstatus_impl_Payload" => val r = parseIsolette_Data_ModelTempWstatus_impl_PayloadT(T); return r
        case "Isolette_Data_Model.Failure_Flag_impl_Payload" => val r = parseIsolette_Data_ModelFailure_Flag_impl_PayloadT(T); return r
        case "Isolette_Data_Model.PhysicalTemp_impl_Payload" => val r = parseIsolette_Data_ModelPhysicalTemp_impl_PayloadT(T); return r
        case "Isolette_Environment.Interface_Interaction_Payload" => val r = parseIsolette_EnvironmentInterface_Interaction_PayloadT(T); return r
        case _ => val r = parseIsolette_EnvironmentInterface_Interaction_PayloadT(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromIsolette_EnvironmentHeat_Payload(o: Isolette_Environment.Heat_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_EnvironmentHeat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_EnvironmentHeat_Payload(s: String): Either[Isolette_Environment.Heat_Payload, Json.ErrorMsg] = {
    def fIsolette_EnvironmentHeat_Payload(parser: Parser): Isolette_Environment.Heat_Payload = {
      val r = parser.parseIsolette_EnvironmentHeat_Payload()
      return r
    }
    val r = to(s, fIsolette_EnvironmentHeat_Payload _)
    return r
  }

  def fromIsolette_EnvironmentInterface_Interaction_Payload(o: Isolette_Environment.Interface_Interaction_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_EnvironmentInterface_Interaction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_EnvironmentInterface_Interaction_Payload(s: String): Either[Isolette_Environment.Interface_Interaction_Payload, Json.ErrorMsg] = {
    def fIsolette_EnvironmentInterface_Interaction_Payload(parser: Parser): Isolette_Environment.Interface_Interaction_Payload = {
      val r = parser.parseIsolette_EnvironmentInterface_Interaction_Payload()
      return r
    }
    val r = to(s, fIsolette_EnvironmentInterface_Interaction_Payload _)
    return r
  }

  def fromIsolette_Data_ModelPhysicalTemp_impl(o: Isolette_Data_Model.PhysicalTemp_impl, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelPhysicalTemp_impl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelPhysicalTemp_impl(s: String): Either[Isolette_Data_Model.PhysicalTemp_impl, Json.ErrorMsg] = {
    def fIsolette_Data_ModelPhysicalTemp_impl(parser: Parser): Isolette_Data_Model.PhysicalTemp_impl = {
      val r = parser.parseIsolette_Data_ModelPhysicalTemp_impl()
      return r
    }
    val r = to(s, fIsolette_Data_ModelPhysicalTemp_impl _)
    return r
  }

  def fromIsolette_Data_ModelPhysicalTemp_impl_Payload(o: Isolette_Data_Model.PhysicalTemp_impl_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelPhysicalTemp_impl_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelPhysicalTemp_impl_Payload(s: String): Either[Isolette_Data_Model.PhysicalTemp_impl_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelPhysicalTemp_impl_Payload(parser: Parser): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
      val r = parser.parseIsolette_Data_ModelPhysicalTemp_impl_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelPhysicalTemp_impl_Payload _)
    return r
  }

  def fromIsolette_Data_ModelValueStatus_Payload(o: Isolette_Data_Model.ValueStatus_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelValueStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelValueStatus_Payload(s: String): Either[Isolette_Data_Model.ValueStatus_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelValueStatus_Payload(parser: Parser): Isolette_Data_Model.ValueStatus_Payload = {
      val r = parser.parseIsolette_Data_ModelValueStatus_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelValueStatus_Payload _)
    return r
  }

  def fromIsolette_Data_ModelTempWstatus_impl(o: Isolette_Data_Model.TempWstatus_impl, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelTempWstatus_impl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelTempWstatus_impl(s: String): Either[Isolette_Data_Model.TempWstatus_impl, Json.ErrorMsg] = {
    def fIsolette_Data_ModelTempWstatus_impl(parser: Parser): Isolette_Data_Model.TempWstatus_impl = {
      val r = parser.parseIsolette_Data_ModelTempWstatus_impl()
      return r
    }
    val r = to(s, fIsolette_Data_ModelTempWstatus_impl _)
    return r
  }

  def fromIsolette_Data_ModelTempWstatus_impl_Payload(o: Isolette_Data_Model.TempWstatus_impl_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelTempWstatus_impl_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelTempWstatus_impl_Payload(s: String): Either[Isolette_Data_Model.TempWstatus_impl_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelTempWstatus_impl_Payload(parser: Parser): Isolette_Data_Model.TempWstatus_impl_Payload = {
      val r = parser.parseIsolette_Data_ModelTempWstatus_impl_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelTempWstatus_impl_Payload _)
    return r
  }

  def fromIsolette_Data_ModelOn_Off_Payload(o: Isolette_Data_Model.On_Off_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelOn_Off_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelOn_Off_Payload(s: String): Either[Isolette_Data_Model.On_Off_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelOn_Off_Payload(parser: Parser): Isolette_Data_Model.On_Off_Payload = {
      val r = parser.parseIsolette_Data_ModelOn_Off_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelOn_Off_Payload _)
    return r
  }

  def fromIsolette_Data_ModelStatus_Payload(o: Isolette_Data_Model.Status_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelStatus_Payload(s: String): Either[Isolette_Data_Model.Status_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelStatus_Payload(parser: Parser): Isolette_Data_Model.Status_Payload = {
      val r = parser.parseIsolette_Data_ModelStatus_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelStatus_Payload _)
    return r
  }

  def fromIsolette_Data_ModelTemp_impl(o: Isolette_Data_Model.Temp_impl, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelTemp_impl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelTemp_impl(s: String): Either[Isolette_Data_Model.Temp_impl, Json.ErrorMsg] = {
    def fIsolette_Data_ModelTemp_impl(parser: Parser): Isolette_Data_Model.Temp_impl = {
      val r = parser.parseIsolette_Data_ModelTemp_impl()
      return r
    }
    val r = to(s, fIsolette_Data_ModelTemp_impl _)
    return r
  }

  def fromIsolette_Data_ModelTemp_impl_Payload(o: Isolette_Data_Model.Temp_impl_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelTemp_impl_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelTemp_impl_Payload(s: String): Either[Isolette_Data_Model.Temp_impl_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelTemp_impl_Payload(parser: Parser): Isolette_Data_Model.Temp_impl_Payload = {
      val r = parser.parseIsolette_Data_ModelTemp_impl_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelTemp_impl_Payload _)
    return r
  }

  def fromIsolette_Data_ModelRegulator_Mode_Payload(o: Isolette_Data_Model.Regulator_Mode_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelRegulator_Mode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelRegulator_Mode_Payload(s: String): Either[Isolette_Data_Model.Regulator_Mode_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelRegulator_Mode_Payload(parser: Parser): Isolette_Data_Model.Regulator_Mode_Payload = {
      val r = parser.parseIsolette_Data_ModelRegulator_Mode_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelRegulator_Mode_Payload _)
    return r
  }

  def fromIsolette_Data_ModelFailure_Flag_impl(o: Isolette_Data_Model.Failure_Flag_impl, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelFailure_Flag_impl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelFailure_Flag_impl(s: String): Either[Isolette_Data_Model.Failure_Flag_impl, Json.ErrorMsg] = {
    def fIsolette_Data_ModelFailure_Flag_impl(parser: Parser): Isolette_Data_Model.Failure_Flag_impl = {
      val r = parser.parseIsolette_Data_ModelFailure_Flag_impl()
      return r
    }
    val r = to(s, fIsolette_Data_ModelFailure_Flag_impl _)
    return r
  }

  def fromIsolette_Data_ModelFailure_Flag_impl_Payload(o: Isolette_Data_Model.Failure_Flag_impl_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelFailure_Flag_impl_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelFailure_Flag_impl_Payload(s: String): Either[Isolette_Data_Model.Failure_Flag_impl_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelFailure_Flag_impl_Payload(parser: Parser): Isolette_Data_Model.Failure_Flag_impl_Payload = {
      val r = parser.parseIsolette_Data_ModelFailure_Flag_impl_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelFailure_Flag_impl_Payload _)
    return r
  }

  def fromIsolette_Data_ModelMonitor_Mode_Payload(o: Isolette_Data_Model.Monitor_Mode_Payload, isCompact: B): String = {
    val st = Printer.printIsolette_Data_ModelMonitor_Mode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toIsolette_Data_ModelMonitor_Mode_Payload(s: String): Either[Isolette_Data_Model.Monitor_Mode_Payload, Json.ErrorMsg] = {
    def fIsolette_Data_ModelMonitor_Mode_Payload(parser: Parser): Isolette_Data_Model.Monitor_Mode_Payload = {
      val r = parser.parseIsolette_Data_ModelMonitor_Mode_Payload()
      return r
    }
    val r = to(s, fIsolette_Data_ModelMonitor_Mode_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(o: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector, isCompact: B): String = {
    val st = Printer.printRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(s: String): Either[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector, Json.ErrorMsg] = {
    def fRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(parser: Parser): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector = {
      val r = parser.parseRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector()
      return r
    }
    val r = to(s, fRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector _)
    return r
  }

  def fromRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(o: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector, isCompact: B): String = {
    val st = Printer.printRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(s: String): Either[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector, Json.ErrorMsg] = {
    def fRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(parser: Parser): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector = {
      val r = parser.parseRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector()
      return r
    }
    val r = to(s, fRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector _)
    return r
  }

  def fromRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(o: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL, isCompact: B): String = {
    val st = Printer.printRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(s: String): Either[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL, Json.ErrorMsg] = {
    def fRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(parser: Parser): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL = {
      val r = parser.parseRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL()
      return r
    }
    val r = to(s, fRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL _)
    return r
  }

  def fromRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(o: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector, isCompact: B): String = {
    val st = Printer.printRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(s: String): Either[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector, Json.ErrorMsg] = {
    def fRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(parser: Parser): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector = {
      val r = parser.parseRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector()
      return r
    }
    val r = to(s, fRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector _)
    return r
  }

  def fromRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(o: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL, isCompact: B): String = {
    val st = Printer.printRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(s: String): Either[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL, Json.ErrorMsg] = {
    def fRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(parser: Parser): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL = {
      val r = parser.parseRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL()
      return r
    }
    val r = to(s, fRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL _)
    return r
  }

  def fromMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(o: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector, isCompact: B): String = {
    val st = Printer.printMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(s: String): Either[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector, Json.ErrorMsg] = {
    def fMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(parser: Parser): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector = {
      val r = parser.parseMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector()
      return r
    }
    val r = to(s, fMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector _)
    return r
  }

  def fromMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(o: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL, isCompact: B): String = {
    val st = Printer.printMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(s: String): Either[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL, Json.ErrorMsg] = {
    def fMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(parser: Parser): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL = {
      val r = parser.parseMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL()
      return r
    }
    val r = to(s, fMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL _)
    return r
  }

  def fromMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(o: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector, isCompact: B): String = {
    val st = Printer.printMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(s: String): Either[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector, Json.ErrorMsg] = {
    def fMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(parser: Parser): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector = {
      val r = parser.parseMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector()
      return r
    }
    val r = to(s, fMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector _)
    return r
  }

  def fromMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(o: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL, isCompact: B): String = {
    val st = Printer.printMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(s: String): Either[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL, Json.ErrorMsg] = {
    def fMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(parser: Parser): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL = {
      val r = parser.parseMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL()
      return r
    }
    val r = to(s, fMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL _)
    return r
  }

  def fromMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(o: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector, isCompact: B): String = {
    val st = Printer.printMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(s: String): Either[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector, Json.ErrorMsg] = {
    def fMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(parser: Parser): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector = {
      val r = parser.parseMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector()
      return r
    }
    val r = to(s, fMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector _)
    return r
  }

  def fromMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(o: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL, isCompact: B): String = {
    val st = Printer.printMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(s: String): Either[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL, Json.ErrorMsg] = {
    def fMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(parser: Parser): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL = {
      val r = parser.parseMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL()
      return r
    }
    val r = to(s, fMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}