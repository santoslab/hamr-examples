// #Sireum

package tc

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Temperature_i.scala

FanCmd.scala

FanAck.scala

SetPoint_i.scala

Base_Types.scala

GUMBO__Library.scala

GUMBO__Library.scala

TempSensor_s_tcproc_tempSensor__Containers.scala

Fan_s_tcproc_fan__Containers.scala

TempControl_s_tcproc_tempControl__Containers.scala

OperatorInterface_s_tcproc_operatorInterface__Containers.scala

DataContent.scala

Aux_Types.scala

*/

@datatype class Config_Z(low: Option[Z], high: Option[Z], attempts: Z, verbose: B, filter: Z => B) {}

@datatype class Config_B(attempts: Z, verbose: B, filter: B => B) {}

@datatype class Config_C(attempts: Z, verbose: B, filter: C => B) {}

@datatype class Config_R(low: Option[R], high: Option[R], attempts: Z, verbose: B, filter: R => B) {}

@datatype class Config_F32(low: Option[F32], high: Option[F32], attempts: Z, verbose: B, filter: F32 => B) {}

@datatype class Config_F64(low: Option[F64], high: Option[F64], attempts: Z, verbose: B, filter: F64 => B) {}

@datatype class Config_S8(low: Option[S8], high: Option[S8], attempts: Z, verbose: B, filter: S8 => B) {}

@datatype class Config_S16(low: Option[S16], high: Option[S16], attempts: Z, verbose: B, filter: S16 => B) {}

@datatype class Config_S32(low: Option[S32], high: Option[S32], attempts: Z, verbose: B, filter: S32 => B) {}

@datatype class Config_S64(low: Option[S64], high: Option[S64], attempts: Z, verbose: B, filter: S64 => B) {}

@datatype class Config_U8(low: Option[U8], high: Option[U8], attempts: Z, verbose: B, filter: U8 => B) {}

@datatype class Config_U16(low: Option[U16], high: Option[U16], attempts: Z, verbose: B, filter: U16 => B) {}

@datatype class Config_U32(low: Option[U32], high: Option[U32], attempts: Z, verbose: B, filter: U32 => B) {}

@datatype class Config_U64(low: Option[U64], high: Option[U64], attempts: Z, verbose: B, filter: U64 => B) {}

@datatype class Config__artDataContent(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[_artDataContent_DataTypeId.Type], filter: art.DataContent => B) {}

@datatype class Config__artEmpty(attempts: Z, verbose: B, filter: art.Empty => B) {}

@datatype class Config_Base_TypesBoolean_Payload(attempts: Z, verbose: B, filter: Base_Types.Boolean_Payload => B) {}

@datatype class Config_Base_TypesInteger_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_Payload => B) {}

@datatype class Config_Base_TypesInteger_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_8_Payload => B) {}

@datatype class Config_Base_TypesInteger_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_16_Payload => B) {}

@datatype class Config_Base_TypesInteger_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_32_Payload => B) {}

@datatype class Config_Base_TypesInteger_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_64_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_8_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_16_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_32_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_64_Payload => B) {}

@datatype class Config_Base_TypesFloat_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_Payload => B) {}

@datatype class Config_Base_TypesFloat_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_32_Payload => B) {}

@datatype class Config_Base_TypesFloat_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_64_Payload => B) {}

@datatype class Config_Base_TypesCharacter_Payload(attempts: Z, verbose: B, filter: Base_Types.Character_Payload => B) {}

@datatype class Config_Base_TypesString_Payload(attempts: Z, verbose: B, filter: Base_Types.String_Payload => B) {}

@datatype class Config_Base_TypesBits_Payload(attempts: Z, verbose: B, filter: Base_Types.Bits_Payload => B) {}

@datatype class Config_CoolingFanFanAckType(attempts: Z, verbose: B, filter: CoolingFan.FanAck.Type => B) {}

@datatype class Config_CoolingFanFanAck_Payload(attempts: Z, verbose: B, filter: CoolingFan.FanAck_Payload => B) {}

@datatype class Config_CoolingFanFanCmdType(attempts: Z, verbose: B, filter: CoolingFan.FanCmd.Type => B) {}

@datatype class Config_CoolingFanFanCmd_Payload(attempts: Z, verbose: B, filter: CoolingFan.FanCmd_Payload => B) {}

@datatype class Config_CoolingFanFan_s_tcproc_fan_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[CoolingFanFan_s_tcproc_fan_PreState_Container_DataTypeId.Type], filter: CoolingFan.Fan_s_tcproc_fan_PreState_Container => B) {}

@datatype class Config_CoolingFanFan_s_tcproc_fan_PreState_Container_P(attempts: Z, verbose: B, filter: CoolingFan.Fan_s_tcproc_fan_PreState_Container_P => B) {}

@datatype class Config_CoolingFanFan_s_tcproc_fan_PreState_Container_PS(attempts: Z, verbose: B, filter: CoolingFan.Fan_s_tcproc_fan_PreState_Container_PS => B) {}

@datatype class Config_CoolingFanFan_s_tcproc_fan_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[CoolingFanFan_s_tcproc_fan_PostState_Container_DataTypeId.Type], filter: CoolingFan.Fan_s_tcproc_fan_PostState_Container => B) {}

@datatype class Config_CoolingFanFan_s_tcproc_fan_PostState_Container_P(attempts: Z, verbose: B, filter: CoolingFan.Fan_s_tcproc_fan_PostState_Container_P => B) {}

@datatype class Config_CoolingFanFan_s_tcproc_fan_PostState_Container_PS(attempts: Z, verbose: B, filter: CoolingFan.Fan_s_tcproc_fan_PostState_Container_PS => B) {}

@datatype class Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_DataTypeId.Type], filter: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container => B) {}

@datatype class Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_P(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_P => B) {}

@datatype class Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container_PS => B) {}

@datatype class Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_DataTypeId.Type], filter: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container => B) {}

@datatype class Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_P(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_P => B) {}

@datatype class Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container_PS => B) {}

@datatype class Config_TempControlSoftwareSystemSetPoint_i(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.SetPoint_i => B) {}

@datatype class Config_TempControlSoftwareSystemSetPoint_i_Payload(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.SetPoint_i_Payload => B) {}

@datatype class Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_DataTypeId.Type], filter: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container => B) {}

@datatype class Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_P(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_P => B) {}

@datatype class Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_PS(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container_PS => B) {}

@datatype class Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_DataTypeId.Type], filter: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container => B) {}

@datatype class Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_P(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_P => B) {}

@datatype class Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_PS(attempts: Z, verbose: B, filter: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container_PS => B) {}

@datatype class Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_DataTypeId.Type], filter: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container => B) {}

@datatype class Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_P(attempts: Z, verbose: B, filter: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_P => B) {}

@datatype class Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_PS(attempts: Z, verbose: B, filter: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container_PS => B) {}

@datatype class Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_DataTypeId.Type], filter: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container => B) {}

@datatype class Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_P(attempts: Z, verbose: B, filter: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_P => B) {}

@datatype class Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_PS(attempts: Z, verbose: B, filter: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container_PS => B) {}

@datatype class Config_TempSensorTemperature_i(attempts: Z, verbose: B, filter: TempSensor.Temperature_i => B) {}

@datatype class Config_TempSensorTemperature_i_Payload(attempts: Z, verbose: B, filter: TempSensor.Temperature_i_Payload => B) {}


