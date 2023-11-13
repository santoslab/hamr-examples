// #Sireum
// @formatter:off

// This file is auto-generated from Temperature_i.scala, FanCmd.scala, FanAck.scala, SetPoint_i.scala, Base_Types.scala, GUMBO__Library.scala, GUMBO__Library.scala, TempSensor_s_tcproc_tempSensor__Containers.scala, Fan_s_tcproc_fan__Containers.scala, TempControl_s_tcproc_tempControl__Containers.scala, OperatorInterface_s_tcproc_operatorInterface__Containers.scala, ObservationKind.scala, DataContent.scala, Aux_Types.scala

package tc

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printTempSensorTemperature_i(o: TempSensor.Temperature_i): ST = {
      return printObject(ISZ(
        ("type", st""""TempSensor.Temperature_i""""),
        ("degrees", printF32(o.degrees))
      ))
    }

    @pure def printTempSensorTemperature_i_Payload(o: TempSensor.Temperature_i_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""TempSensor.Temperature_i_Payload""""),
        ("value", printTempSensorTemperature_i(o.value))
      ))
    }

    @pure def printCoolingFanFanCmdType(o: CoolingFan.FanCmd.Type): ST = {
      val value: String = o match {
        case CoolingFan.FanCmd.On => "On"
        case CoolingFan.FanCmd.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("CoolingFan.FanCmd")),
        ("value", printString(value))
      ))
    }

    @pure def printCoolingFanFanCmd_Payload(o: CoolingFan.FanCmd_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""CoolingFan.FanCmd_Payload""""),
        ("value", printCoolingFanFanCmdType(o.value))
      ))
    }

    @pure def printCoolingFanFanAckType(o: CoolingFan.FanAck.Type): ST = {
      val value: String = o match {
        case CoolingFan.FanAck.Ok => "Ok"
        case CoolingFan.FanAck.Error => "Error"
      }
      return printObject(ISZ(
        ("type", printString("CoolingFan.FanAck")),
        ("value", printString(value))
      ))
    }

    @pure def printCoolingFanFanAck_Payload(o: CoolingFan.FanAck_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""CoolingFan.FanAck_Payload""""),
        ("value", printCoolingFanFanAckType(o.value))
      ))
    }

    @pure def printTempControlSoftwareSystemSetPoint_i(o: TempControlSoftwareSystem.SetPoint_i): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.SetPoint_i""""),
        ("low", printTempSensorTemperature_i(o.low)),
        ("high", printTempSensorTemperature_i(o.high))
      ))
    }

    @pure def printTempControlSoftwareSystemSetPoint_i_Payload(o: TempControlSoftwareSystem.SetPoint_i_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.SetPoint_i_Payload""""),
        ("value", printTempControlSoftwareSystemSetPoint_i(o.value))
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

    @pure def printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container): ST = {
      o match {
        case o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P => return printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(o)
        case o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS => return printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(o)
      }
    }

    @pure def printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P"""")
      ))
    }

    @pure def printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS"""")
      ))
    }

    @pure def printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container): ST = {
      o match {
        case o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P => return printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(o)
        case o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS => return printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(o)
      }
    }

    @pure def printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P""""),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_currentTemp", printTempSensorTemperature_i(o.api_currentTemp))
      ))
    }

    @pure def printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS""""),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_currentTemp", printTempSensorTemperature_i(o.api_currentTemp))
      ))
    }

    @pure def printCoolingFanFan_s_tcproc_fan_PreState_Container(o: CoolingFan.Fan_s_tcproc_fan_PreState_Container): ST = {
      o match {
        case o: CoolingFan.Fan_s_tcproc_fan_PreState_Container_P => return printCoolingFanFan_s_tcproc_fan_PreState_Container_P(o)
        case o: CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS => return printCoolingFanFan_s_tcproc_fan_PreState_Container_PS(o)
      }
    }

    @pure def printCoolingFanFan_s_tcproc_fan_PreState_Container_P(o: CoolingFan.Fan_s_tcproc_fan_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""CoolingFan.Fan_s_tcproc_fan_PreState_Container_P""""),
        ("api_fanCmd", printOption(F, o.api_fanCmd, printCoolingFanFanCmdType _))
      ))
    }

    @pure def printCoolingFanFan_s_tcproc_fan_PreState_Container_PS(o: CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS""""),
        ("api_fanCmd", printOption(F, o.api_fanCmd, printCoolingFanFanCmdType _))
      ))
    }

    @pure def printCoolingFanFan_s_tcproc_fan_PostState_Container(o: CoolingFan.Fan_s_tcproc_fan_PostState_Container): ST = {
      o match {
        case o: CoolingFan.Fan_s_tcproc_fan_PostState_Container_P => return printCoolingFanFan_s_tcproc_fan_PostState_Container_P(o)
        case o: CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS => return printCoolingFanFan_s_tcproc_fan_PostState_Container_PS(o)
      }
    }

    @pure def printCoolingFanFan_s_tcproc_fan_PostState_Container_P(o: CoolingFan.Fan_s_tcproc_fan_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""CoolingFan.Fan_s_tcproc_fan_PostState_Container_P""""),
        ("api_fanAck", printOption(F, o.api_fanAck, printCoolingFanFanAckType _))
      ))
    }

    @pure def printCoolingFanFan_s_tcproc_fan_PostState_Container_PS(o: CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS""""),
        ("api_fanAck", printOption(F, o.api_fanAck, printCoolingFanFanAckType _))
      ))
    }

    @pure def printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container): ST = {
      o match {
        case o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P => return printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS => return printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(o)
      }
    }

    @pure def printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P""""),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_fanAck", printOption(F, o.api_fanAck, printCoolingFanFanAckType _)),
        ("api_setPoint", printOption(F, o.api_setPoint, printTempControlSoftwareSystemSetPoint_i _)),
        ("api_currentTemp", printTempSensorTemperature_i(o.api_currentTemp))
      ))
    }

    @pure def printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS""""),
        ("In_currentFanState", printCoolingFanFanCmdType(o.In_currentFanState)),
        ("In_currentSetPoint", printTempControlSoftwareSystemSetPoint_i(o.In_currentSetPoint)),
        ("In_latestTemp", printTempSensorTemperature_i(o.In_latestTemp)),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_fanAck", printOption(F, o.api_fanAck, printCoolingFanFanAckType _)),
        ("api_setPoint", printOption(F, o.api_setPoint, printTempControlSoftwareSystemSetPoint_i _)),
        ("api_currentTemp", printTempSensorTemperature_i(o.api_currentTemp))
      ))
    }

    @pure def printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container): ST = {
      o match {
        case o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P => return printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS => return printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(o)
      }
    }

    @pure def printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P""""),
        ("api_fanCmd", printOption(F, o.api_fanCmd, printCoolingFanFanCmdType _))
      ))
    }

    @pure def printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS""""),
        ("currentFanState", printCoolingFanFanCmdType(o.currentFanState)),
        ("currentSetPoint", printTempControlSoftwareSystemSetPoint_i(o.currentSetPoint)),
        ("latestTemp", printTempSensorTemperature_i(o.latestTemp)),
        ("api_fanCmd", printOption(F, o.api_fanCmd, printCoolingFanFanCmdType _))
      ))
    }

    @pure def printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container): ST = {
      o match {
        case o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P => return printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS => return printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(o)
      }
    }

    @pure def printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P""""),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_currentTemp", printTempSensorTemperature_i(o.api_currentTemp))
      ))
    }

    @pure def printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS""""),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_currentTemp", printTempSensorTemperature_i(o.api_currentTemp))
      ))
    }

    @pure def printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container): ST = {
      o match {
        case o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P => return printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS => return printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(o)
      }
    }

    @pure def printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P""""),
        ("api_setPoint", printOption(F, o.api_setPoint, printTempControlSoftwareSystemSetPoint_i _))
      ))
    }

    @pure def printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS""""),
        ("api_setPoint", printOption(F, o.api_setPoint, printTempControlSoftwareSystemSetPoint_i _))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor_postInit => "TempControlSoftwareSystem_s_Instance_tcproc_tempSensor_postInit"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor_preCompute => "TempControlSoftwareSystem_s_Instance_tcproc_tempSensor_preCompute"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor_postCompute => "TempControlSoftwareSystem_s_Instance_tcproc_tempSensor_postCompute"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_fan_postInit => "TempControlSoftwareSystem_s_Instance_tcproc_fan_postInit"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_fan_preCompute => "TempControlSoftwareSystem_s_Instance_tcproc_fan_preCompute"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_fan_postCompute => "TempControlSoftwareSystem_s_Instance_tcproc_fan_postCompute"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_tempControl_postInit => "TempControlSoftwareSystem_s_Instance_tcproc_tempControl_postInit"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_tempControl_preCompute => "TempControlSoftwareSystem_s_Instance_tcproc_tempControl_preCompute"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_tempControl_postCompute => "TempControlSoftwareSystem_s_Instance_tcproc_tempControl_postCompute"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_postInit => "TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_postInit"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_preCompute => "TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_preCompute"
        case runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_postCompute => "TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
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
        case o: art.Empty => return print_artEmpty(o)
        case o: CoolingFan.FanCmd_Payload => return printCoolingFanFanCmd_Payload(o)
        case o: CoolingFan.FanAck_Payload => return printCoolingFanFanAck_Payload(o)
        case o: TempSensor.Temperature_i_Payload => return printTempSensorTemperature_i_Payload(o)
        case o: TempControlSoftwareSystem.SetPoint_i_Payload => return printTempControlSoftwareSystemSetPoint_i_Payload(o)
        case o: CoolingFan.Fan_s_tcproc_fan_PreState_Container_P => return printCoolingFanFan_s_tcproc_fan_PreState_Container_P(o)
        case o: CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS => return printCoolingFanFan_s_tcproc_fan_PreState_Container_PS(o)
        case o: CoolingFan.Fan_s_tcproc_fan_PostState_Container_P => return printCoolingFanFan_s_tcproc_fan_PostState_Container_P(o)
        case o: CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS => return printCoolingFanFan_s_tcproc_fan_PostState_Container_PS(o)
        case o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P => return printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(o)
        case o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS => return printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(o)
        case o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P => return printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(o)
        case o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS => return printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(o)
        case o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P => return printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS => return printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(o)
        case o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P => return printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS => return printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(o)
        case o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P => return printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS => return printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(o)
        case o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P => return printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS => return printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(o)
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

    def parseTempSensorTemperature_i(): TempSensor.Temperature_i = {
      val r = parseTempSensorTemperature_iT(F)
      return r
    }

    def parseTempSensorTemperature_iT(typeParsed: B): TempSensor.Temperature_i = {
      if (!typeParsed) {
        parser.parseObjectType("TempSensor.Temperature_i")
      }
      parser.parseObjectKey("degrees")
      val degrees = parser.parseF32()
      parser.parseObjectNext()
      return TempSensor.Temperature_i(degrees)
    }

    def parseTempSensorTemperature_i_Payload(): TempSensor.Temperature_i_Payload = {
      val r = parseTempSensorTemperature_i_PayloadT(F)
      return r
    }

    def parseTempSensorTemperature_i_PayloadT(typeParsed: B): TempSensor.Temperature_i_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("TempSensor.Temperature_i_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      return TempSensor.Temperature_i_Payload(value)
    }

    def parseCoolingFanFanCmdType(): CoolingFan.FanCmd.Type = {
      val r = parseCoolingFanFanCmdT(F)
      return r
    }

    def parseCoolingFanFanCmdT(typeParsed: B): CoolingFan.FanCmd.Type = {
      if (!typeParsed) {
        parser.parseObjectType("CoolingFan.FanCmd")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      CoolingFan.FanCmd.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for CoolingFan.FanCmd.")
          return CoolingFan.FanCmd.byOrdinal(0).get
      }
    }

    def parseCoolingFanFanCmd_Payload(): CoolingFan.FanCmd_Payload = {
      val r = parseCoolingFanFanCmd_PayloadT(F)
      return r
    }

    def parseCoolingFanFanCmd_PayloadT(typeParsed: B): CoolingFan.FanCmd_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("CoolingFan.FanCmd_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCoolingFanFanCmdType()
      parser.parseObjectNext()
      return CoolingFan.FanCmd_Payload(value)
    }

    def parseCoolingFanFanAckType(): CoolingFan.FanAck.Type = {
      val r = parseCoolingFanFanAckT(F)
      return r
    }

    def parseCoolingFanFanAckT(typeParsed: B): CoolingFan.FanAck.Type = {
      if (!typeParsed) {
        parser.parseObjectType("CoolingFan.FanAck")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      CoolingFan.FanAck.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for CoolingFan.FanAck.")
          return CoolingFan.FanAck.byOrdinal(0).get
      }
    }

    def parseCoolingFanFanAck_Payload(): CoolingFan.FanAck_Payload = {
      val r = parseCoolingFanFanAck_PayloadT(F)
      return r
    }

    def parseCoolingFanFanAck_PayloadT(typeParsed: B): CoolingFan.FanAck_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("CoolingFan.FanAck_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCoolingFanFanAckType()
      parser.parseObjectNext()
      return CoolingFan.FanAck_Payload(value)
    }

    def parseTempControlSoftwareSystemSetPoint_i(): TempControlSoftwareSystem.SetPoint_i = {
      val r = parseTempControlSoftwareSystemSetPoint_iT(F)
      return r
    }

    def parseTempControlSoftwareSystemSetPoint_iT(typeParsed: B): TempControlSoftwareSystem.SetPoint_i = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.SetPoint_i")
      }
      parser.parseObjectKey("low")
      val low = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      parser.parseObjectKey("high")
      val high = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      return TempControlSoftwareSystem.SetPoint_i(low, high)
    }

    def parseTempControlSoftwareSystemSetPoint_i_Payload(): TempControlSoftwareSystem.SetPoint_i_Payload = {
      val r = parseTempControlSoftwareSystemSetPoint_i_PayloadT(F)
      return r
    }

    def parseTempControlSoftwareSystemSetPoint_i_PayloadT(typeParsed: B): TempControlSoftwareSystem.SetPoint_i_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.SetPoint_i_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseTempControlSoftwareSystemSetPoint_i()
      parser.parseObjectNext()
      return TempControlSoftwareSystem.SetPoint_i_Payload(value)
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

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P", "TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS"))
      t.native match {
        case "TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P" => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PT(T); return r
        case "TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS" => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PST(T); return r
        case _ => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PST(T); return r
      }
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P = {
      val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PT(F)
      return r
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PT(typeParsed: B): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P")
      }
      return TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P()
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS = {
      val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PST(F)
      return r
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PST(typeParsed: B): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS")
      }
      return TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS()
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P", "TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS"))
      t.native match {
        case "TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P" => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PT(T); return r
        case "TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS" => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PST(T); return r
        case _ => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PST(T); return r
      }
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P = {
      val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PT(F)
      return r
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PT(typeParsed: B): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P")
      }
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      return TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P(api_tempChanged, api_currentTemp)
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS = {
      val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PST(F)
      return r
    }

    def parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PST(typeParsed: B): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      return TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS(api_tempChanged, api_currentTemp)
    }

    def parseCoolingFanFan_s_tcproc_fan_PreState_Container(): CoolingFan.Fan_s_tcproc_fan_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("CoolingFan.Fan_s_tcproc_fan_PreState_Container_P", "CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS"))
      t.native match {
        case "CoolingFan.Fan_s_tcproc_fan_PreState_Container_P" => val r = parseCoolingFanFan_s_tcproc_fan_PreState_Container_PT(T); return r
        case "CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS" => val r = parseCoolingFanFan_s_tcproc_fan_PreState_Container_PST(T); return r
        case _ => val r = parseCoolingFanFan_s_tcproc_fan_PreState_Container_PST(T); return r
      }
    }

    def parseCoolingFanFan_s_tcproc_fan_PreState_Container_P(): CoolingFan.Fan_s_tcproc_fan_PreState_Container_P = {
      val r = parseCoolingFanFan_s_tcproc_fan_PreState_Container_PT(F)
      return r
    }

    def parseCoolingFanFan_s_tcproc_fan_PreState_Container_PT(typeParsed: B): CoolingFan.Fan_s_tcproc_fan_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("CoolingFan.Fan_s_tcproc_fan_PreState_Container_P")
      }
      parser.parseObjectKey("api_fanCmd")
      val api_fanCmd = parser.parseOption(parseCoolingFanFanCmdType _)
      parser.parseObjectNext()
      return CoolingFan.Fan_s_tcproc_fan_PreState_Container_P(api_fanCmd)
    }

    def parseCoolingFanFan_s_tcproc_fan_PreState_Container_PS(): CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS = {
      val r = parseCoolingFanFan_s_tcproc_fan_PreState_Container_PST(F)
      return r
    }

    def parseCoolingFanFan_s_tcproc_fan_PreState_Container_PST(typeParsed: B): CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS")
      }
      parser.parseObjectKey("api_fanCmd")
      val api_fanCmd = parser.parseOption(parseCoolingFanFanCmdType _)
      parser.parseObjectNext()
      return CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS(api_fanCmd)
    }

    def parseCoolingFanFan_s_tcproc_fan_PostState_Container(): CoolingFan.Fan_s_tcproc_fan_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("CoolingFan.Fan_s_tcproc_fan_PostState_Container_P", "CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS"))
      t.native match {
        case "CoolingFan.Fan_s_tcproc_fan_PostState_Container_P" => val r = parseCoolingFanFan_s_tcproc_fan_PostState_Container_PT(T); return r
        case "CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS" => val r = parseCoolingFanFan_s_tcproc_fan_PostState_Container_PST(T); return r
        case _ => val r = parseCoolingFanFan_s_tcproc_fan_PostState_Container_PST(T); return r
      }
    }

    def parseCoolingFanFan_s_tcproc_fan_PostState_Container_P(): CoolingFan.Fan_s_tcproc_fan_PostState_Container_P = {
      val r = parseCoolingFanFan_s_tcproc_fan_PostState_Container_PT(F)
      return r
    }

    def parseCoolingFanFan_s_tcproc_fan_PostState_Container_PT(typeParsed: B): CoolingFan.Fan_s_tcproc_fan_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("CoolingFan.Fan_s_tcproc_fan_PostState_Container_P")
      }
      parser.parseObjectKey("api_fanAck")
      val api_fanAck = parser.parseOption(parseCoolingFanFanAckType _)
      parser.parseObjectNext()
      return CoolingFan.Fan_s_tcproc_fan_PostState_Container_P(api_fanAck)
    }

    def parseCoolingFanFan_s_tcproc_fan_PostState_Container_PS(): CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS = {
      val r = parseCoolingFanFan_s_tcproc_fan_PostState_Container_PST(F)
      return r
    }

    def parseCoolingFanFan_s_tcproc_fan_PostState_Container_PST(typeParsed: B): CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS")
      }
      parser.parseObjectKey("api_fanAck")
      val api_fanAck = parser.parseOption(parseCoolingFanFanAckType _)
      parser.parseObjectNext()
      return CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS(api_fanAck)
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P", "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS"))
      t.native match {
        case "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P" => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PT(T); return r
        case "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS" => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PST(T); return r
        case _ => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PST(T); return r
      }
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P = {
      val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PT(F)
      return r
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PT(typeParsed: B): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P")
      }
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_fanAck")
      val api_fanAck = parser.parseOption(parseCoolingFanFanAckType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_setPoint")
      val api_setPoint = parser.parseOption(parseTempControlSoftwareSystemSetPoint_i _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      return TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS = {
      val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PST(F)
      return r
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PST(typeParsed: B): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS")
      }
      parser.parseObjectKey("In_currentFanState")
      val In_currentFanState = parseCoolingFanFanCmdType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_currentSetPoint")
      val In_currentSetPoint = parseTempControlSoftwareSystemSetPoint_i()
      parser.parseObjectNext()
      parser.parseObjectKey("In_latestTemp")
      val In_latestTemp = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_fanAck")
      val api_fanAck = parser.parseOption(parseCoolingFanFanAckType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_setPoint")
      val api_setPoint = parser.parseOption(parseTempControlSoftwareSystemSetPoint_i _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      return TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS(In_currentFanState, In_currentSetPoint, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P", "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS"))
      t.native match {
        case "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P" => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PT(T); return r
        case "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS" => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PST(T); return r
        case _ => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PST(T); return r
      }
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P = {
      val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PT(F)
      return r
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PT(typeParsed: B): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P")
      }
      parser.parseObjectKey("api_fanCmd")
      val api_fanCmd = parser.parseOption(parseCoolingFanFanCmdType _)
      parser.parseObjectNext()
      return TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P(api_fanCmd)
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS = {
      val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PST(F)
      return r
    }

    def parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PST(typeParsed: B): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS")
      }
      parser.parseObjectKey("currentFanState")
      val currentFanState = parseCoolingFanFanCmdType()
      parser.parseObjectNext()
      parser.parseObjectKey("currentSetPoint")
      val currentSetPoint = parseTempControlSoftwareSystemSetPoint_i()
      parser.parseObjectNext()
      parser.parseObjectKey("latestTemp")
      val latestTemp = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fanCmd")
      val api_fanCmd = parser.parseOption(parseCoolingFanFanCmdType _)
      parser.parseObjectNext()
      return TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS(currentFanState, currentSetPoint, latestTemp, api_fanCmd)
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P", "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS"))
      t.native match {
        case "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P" => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PT(T); return r
        case "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS" => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PST(T); return r
        case _ => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PST(T); return r
      }
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P = {
      val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PT(F)
      return r
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PT(typeParsed: B): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P")
      }
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      return TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(api_tempChanged, api_currentTemp)
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS = {
      val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PST(F)
      return r
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PST(typeParsed: B): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS")
      }
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempSensorTemperature_i()
      parser.parseObjectNext()
      return TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(api_tempChanged, api_currentTemp)
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P", "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS"))
      t.native match {
        case "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P" => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PT(T); return r
        case "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS" => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PST(T); return r
        case _ => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PST(T); return r
      }
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P = {
      val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PT(F)
      return r
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PT(typeParsed: B): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P")
      }
      parser.parseObjectKey("api_setPoint")
      val api_setPoint = parser.parseOption(parseTempControlSoftwareSystemSetPoint_i _)
      parser.parseObjectNext()
      return TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(api_setPoint)
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS = {
      val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PST(F)
      return r
    }

    def parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PST(typeParsed: B): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS")
      }
      parser.parseObjectKey("api_setPoint")
      val api_setPoint = parser.parseOption(parseTempControlSoftwareSystemSetPoint_i _)
      parser.parseObjectNext()
      return TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(api_setPoint)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "art.Empty", "CoolingFan.FanCmd_Payload", "CoolingFan.FanAck_Payload", "TempSensor.Temperature_i_Payload", "TempControlSoftwareSystem.SetPoint_i_Payload", "CoolingFan.Fan_s_tcproc_fan_PreState_Container_P", "CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS", "CoolingFan.Fan_s_tcproc_fan_PostState_Container_P", "CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS", "TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P", "TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS", "TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P", "TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS", "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P", "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS", "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P", "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS", "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P", "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS", "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P", "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS"))
      t.native match {
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
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "CoolingFan.FanCmd_Payload" => val r = parseCoolingFanFanCmd_PayloadT(T); return r
        case "CoolingFan.FanAck_Payload" => val r = parseCoolingFanFanAck_PayloadT(T); return r
        case "TempSensor.Temperature_i_Payload" => val r = parseTempSensorTemperature_i_PayloadT(T); return r
        case "TempControlSoftwareSystem.SetPoint_i_Payload" => val r = parseTempControlSoftwareSystemSetPoint_i_PayloadT(T); return r
        case "CoolingFan.Fan_s_tcproc_fan_PreState_Container_P" => val r = parseCoolingFanFan_s_tcproc_fan_PreState_Container_PT(T); return r
        case "CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS" => val r = parseCoolingFanFan_s_tcproc_fan_PreState_Container_PST(T); return r
        case "CoolingFan.Fan_s_tcproc_fan_PostState_Container_P" => val r = parseCoolingFanFan_s_tcproc_fan_PostState_Container_PT(T); return r
        case "CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS" => val r = parseCoolingFanFan_s_tcproc_fan_PostState_Container_PST(T); return r
        case "TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P" => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PT(T); return r
        case "TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS" => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PST(T); return r
        case "TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P" => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PT(T); return r
        case "TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS" => val r = parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PST(T); return r
        case "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P" => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PT(T); return r
        case "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS" => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PST(T); return r
        case "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P" => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PT(T); return r
        case "TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS" => val r = parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PST(T); return r
        case "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P" => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PT(T); return r
        case "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS" => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PST(T); return r
        case "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P" => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PT(T); return r
        case "TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS" => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PST(T); return r
        case _ => val r = parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PST(T); return r
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

  def fromTempSensorTemperature_i(o: TempSensor.Temperature_i, isCompact: B): String = {
    val st = Printer.printTempSensorTemperature_i(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempSensorTemperature_i(s: String): Either[TempSensor.Temperature_i, Json.ErrorMsg] = {
    def fTempSensorTemperature_i(parser: Parser): TempSensor.Temperature_i = {
      val r = parser.parseTempSensorTemperature_i()
      return r
    }
    val r = to(s, fTempSensorTemperature_i _)
    return r
  }

  def fromTempSensorTemperature_i_Payload(o: TempSensor.Temperature_i_Payload, isCompact: B): String = {
    val st = Printer.printTempSensorTemperature_i_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempSensorTemperature_i_Payload(s: String): Either[TempSensor.Temperature_i_Payload, Json.ErrorMsg] = {
    def fTempSensorTemperature_i_Payload(parser: Parser): TempSensor.Temperature_i_Payload = {
      val r = parser.parseTempSensorTemperature_i_Payload()
      return r
    }
    val r = to(s, fTempSensorTemperature_i_Payload _)
    return r
  }

  def fromCoolingFanFanCmd_Payload(o: CoolingFan.FanCmd_Payload, isCompact: B): String = {
    val st = Printer.printCoolingFanFanCmd_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCoolingFanFanCmd_Payload(s: String): Either[CoolingFan.FanCmd_Payload, Json.ErrorMsg] = {
    def fCoolingFanFanCmd_Payload(parser: Parser): CoolingFan.FanCmd_Payload = {
      val r = parser.parseCoolingFanFanCmd_Payload()
      return r
    }
    val r = to(s, fCoolingFanFanCmd_Payload _)
    return r
  }

  def fromCoolingFanFanAck_Payload(o: CoolingFan.FanAck_Payload, isCompact: B): String = {
    val st = Printer.printCoolingFanFanAck_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCoolingFanFanAck_Payload(s: String): Either[CoolingFan.FanAck_Payload, Json.ErrorMsg] = {
    def fCoolingFanFanAck_Payload(parser: Parser): CoolingFan.FanAck_Payload = {
      val r = parser.parseCoolingFanFanAck_Payload()
      return r
    }
    val r = to(s, fCoolingFanFanAck_Payload _)
    return r
  }

  def fromTempControlSoftwareSystemSetPoint_i(o: TempControlSoftwareSystem.SetPoint_i, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemSetPoint_i(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemSetPoint_i(s: String): Either[TempControlSoftwareSystem.SetPoint_i, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemSetPoint_i(parser: Parser): TempControlSoftwareSystem.SetPoint_i = {
      val r = parser.parseTempControlSoftwareSystemSetPoint_i()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemSetPoint_i _)
    return r
  }

  def fromTempControlSoftwareSystemSetPoint_i_Payload(o: TempControlSoftwareSystem.SetPoint_i_Payload, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemSetPoint_i_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemSetPoint_i_Payload(s: String): Either[TempControlSoftwareSystem.SetPoint_i_Payload, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemSetPoint_i_Payload(parser: Parser): TempControlSoftwareSystem.SetPoint_i_Payload = {
      val r = parser.parseTempControlSoftwareSystemSetPoint_i_Payload()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemSetPoint_i_Payload _)
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

  def fromTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container, isCompact: B): String = {
    val st = Printer.printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(s: String): Either[TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container, Json.ErrorMsg] = {
    def fTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(parser: Parser): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container = {
      val r = parser.parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container()
      return r
    }
    val r = to(s, fTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container _)
    return r
  }

  def fromTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(s: String): Either[TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P, Json.ErrorMsg] = {
    def fTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(parser: Parser): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P = {
      val r = parser.parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P()
      return r
    }
    val r = to(s, fTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P _)
    return r
  }

  def fromTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(o: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(s: String): Either[TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS, Json.ErrorMsg] = {
    def fTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(parser: Parser): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS = {
      val r = parser.parseTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS()
      return r
    }
    val r = to(s, fTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS _)
    return r
  }

  def fromTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container, isCompact: B): String = {
    val st = Printer.printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(s: String): Either[TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container, Json.ErrorMsg] = {
    def fTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(parser: Parser): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container = {
      val r = parser.parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container()
      return r
    }
    val r = to(s, fTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container _)
    return r
  }

  def fromTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(s: String): Either[TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P, Json.ErrorMsg] = {
    def fTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(parser: Parser): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P = {
      val r = parser.parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P()
      return r
    }
    val r = to(s, fTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P _)
    return r
  }

  def fromTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(o: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(s: String): Either[TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS, Json.ErrorMsg] = {
    def fTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(parser: Parser): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS = {
      val r = parser.parseTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS()
      return r
    }
    val r = to(s, fTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS _)
    return r
  }

  def fromCoolingFanFan_s_tcproc_fan_PreState_Container(o: CoolingFan.Fan_s_tcproc_fan_PreState_Container, isCompact: B): String = {
    val st = Printer.printCoolingFanFan_s_tcproc_fan_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCoolingFanFan_s_tcproc_fan_PreState_Container(s: String): Either[CoolingFan.Fan_s_tcproc_fan_PreState_Container, Json.ErrorMsg] = {
    def fCoolingFanFan_s_tcproc_fan_PreState_Container(parser: Parser): CoolingFan.Fan_s_tcproc_fan_PreState_Container = {
      val r = parser.parseCoolingFanFan_s_tcproc_fan_PreState_Container()
      return r
    }
    val r = to(s, fCoolingFanFan_s_tcproc_fan_PreState_Container _)
    return r
  }

  def fromCoolingFanFan_s_tcproc_fan_PreState_Container_P(o: CoolingFan.Fan_s_tcproc_fan_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printCoolingFanFan_s_tcproc_fan_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCoolingFanFan_s_tcproc_fan_PreState_Container_P(s: String): Either[CoolingFan.Fan_s_tcproc_fan_PreState_Container_P, Json.ErrorMsg] = {
    def fCoolingFanFan_s_tcproc_fan_PreState_Container_P(parser: Parser): CoolingFan.Fan_s_tcproc_fan_PreState_Container_P = {
      val r = parser.parseCoolingFanFan_s_tcproc_fan_PreState_Container_P()
      return r
    }
    val r = to(s, fCoolingFanFan_s_tcproc_fan_PreState_Container_P _)
    return r
  }

  def fromCoolingFanFan_s_tcproc_fan_PreState_Container_PS(o: CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printCoolingFanFan_s_tcproc_fan_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCoolingFanFan_s_tcproc_fan_PreState_Container_PS(s: String): Either[CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS, Json.ErrorMsg] = {
    def fCoolingFanFan_s_tcproc_fan_PreState_Container_PS(parser: Parser): CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS = {
      val r = parser.parseCoolingFanFan_s_tcproc_fan_PreState_Container_PS()
      return r
    }
    val r = to(s, fCoolingFanFan_s_tcproc_fan_PreState_Container_PS _)
    return r
  }

  def fromCoolingFanFan_s_tcproc_fan_PostState_Container(o: CoolingFan.Fan_s_tcproc_fan_PostState_Container, isCompact: B): String = {
    val st = Printer.printCoolingFanFan_s_tcproc_fan_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCoolingFanFan_s_tcproc_fan_PostState_Container(s: String): Either[CoolingFan.Fan_s_tcproc_fan_PostState_Container, Json.ErrorMsg] = {
    def fCoolingFanFan_s_tcproc_fan_PostState_Container(parser: Parser): CoolingFan.Fan_s_tcproc_fan_PostState_Container = {
      val r = parser.parseCoolingFanFan_s_tcproc_fan_PostState_Container()
      return r
    }
    val r = to(s, fCoolingFanFan_s_tcproc_fan_PostState_Container _)
    return r
  }

  def fromCoolingFanFan_s_tcproc_fan_PostState_Container_P(o: CoolingFan.Fan_s_tcproc_fan_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printCoolingFanFan_s_tcproc_fan_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCoolingFanFan_s_tcproc_fan_PostState_Container_P(s: String): Either[CoolingFan.Fan_s_tcproc_fan_PostState_Container_P, Json.ErrorMsg] = {
    def fCoolingFanFan_s_tcproc_fan_PostState_Container_P(parser: Parser): CoolingFan.Fan_s_tcproc_fan_PostState_Container_P = {
      val r = parser.parseCoolingFanFan_s_tcproc_fan_PostState_Container_P()
      return r
    }
    val r = to(s, fCoolingFanFan_s_tcproc_fan_PostState_Container_P _)
    return r
  }

  def fromCoolingFanFan_s_tcproc_fan_PostState_Container_PS(o: CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printCoolingFanFan_s_tcproc_fan_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCoolingFanFan_s_tcproc_fan_PostState_Container_PS(s: String): Either[CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS, Json.ErrorMsg] = {
    def fCoolingFanFan_s_tcproc_fan_PostState_Container_PS(parser: Parser): CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS = {
      val r = parser.parseCoolingFanFan_s_tcproc_fan_PostState_Container_PS()
      return r
    }
    val r = to(s, fCoolingFanFan_s_tcproc_fan_PostState_Container_PS _)
    return r
  }

  def fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(s: String): Either[TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(parser: Parser): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container = {
      val r = parser.parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container _)
    return r
  }

  def fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(s: String): Either[TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(parser: Parser): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P = {
      val r = parser.parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P _)
    return r
  }

  def fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(s: String): Either[TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(parser: Parser): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS = {
      val r = parser.parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS _)
    return r
  }

  def fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(s: String): Either[TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(parser: Parser): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container = {
      val r = parser.parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container _)
    return r
  }

  def fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(s: String): Either[TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(parser: Parser): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P = {
      val r = parser.parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P _)
    return r
  }

  def fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(o: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(s: String): Either[TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(parser: Parser): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS = {
      val r = parser.parseTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(s: String): Either[TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(parser: Parser): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container = {
      val r = parser.parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(s: String): Either[TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(parser: Parser): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P = {
      val r = parser.parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(s: String): Either[TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(parser: Parser): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS = {
      val r = parser.parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(s: String): Either[TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(parser: Parser): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container = {
      val r = parser.parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(s: String): Either[TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(parser: Parser): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P = {
      val r = parser.parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(o: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(s: String): Either[TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS, Json.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(parser: Parser): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS = {
      val r = parser.parseTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS()
      return r
    }
    val r = to(s, fTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS _)
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