// #Sireum

package isolette

import org.sireum._
import org.sireum.Random.Gen64


@datatype class Config_Z(filter: Z => B) {}

@datatype class Config_B(filter: B => B) {}

@datatype class Config_C(filter: C => B) {}

@datatype class Config_R(filter: R => B) {}

@datatype class Config_F32(filter: F32 => B) {}

@datatype class Config_F64(filter: F64 => B) {}

@datatype class Config_S8(filter: S8 => B) {}

@datatype class Config_S16(filter: S16 => B) {}

@datatype class Config_S32(filter: S32 => B) {}

@datatype class Config_S64(filter: S64 => B) {}

@datatype class Config_U8(filter: U8 => B) {}

@datatype class Config_U16(filter: U16 => B) {}

@datatype class Config_U32(filter: U32 => B) {}

@datatype class Config_U64(filter: U64 => B) {}

@datatype class Config_Base_TypesBoolean_Payload(filter: Base_Types.Boolean_Payload => B) {}

@datatype class Config_Base_TypesInteger_Payload(filter: Base_Types.Integer_Payload => B) {}

@datatype class Config_Base_TypesInteger_8_Payload(filter: Base_Types.Integer_8_Payload => B) {}

@datatype class Config_Base_TypesInteger_16_Payload(filter: Base_Types.Integer_16_Payload => B) {}

@datatype class Config_Base_TypesInteger_32_Payload(filter: Base_Types.Integer_32_Payload => B) {}

@datatype class Config_Base_TypesInteger_64_Payload(filter: Base_Types.Integer_64_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_8_Payload(filter: Base_Types.Unsigned_8_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_16_Payload(filter: Base_Types.Unsigned_16_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_32_Payload(filter: Base_Types.Unsigned_32_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_64_Payload(filter: Base_Types.Unsigned_64_Payload => B) {}

@datatype class Config_Base_TypesFloat_Payload(filter: Base_Types.Float_Payload => B) {}

@datatype class Config_Base_TypesFloat_32_Payload(filter: Base_Types.Float_32_Payload => B) {}

@datatype class Config_Base_TypesFloat_64_Payload(filter: Base_Types.Float_64_Payload => B) {}

@datatype class Config_Base_TypesCharacter_Payload(filter: Base_Types.Character_Payload => B) {}

@datatype class Config_Base_TypesString_Payload(filter: Base_Types.String_Payload => B) {}

@datatype class Config_Base_TypesBits_Payload(filter: Base_Types.Bits_Payload => B) {}

@datatype class Config_Isolette_EnvironmentHeatType(filter: Isolette_Environment.Heat.Type => B) {}

@datatype class Config_Isolette_EnvironmentHeat_Payload(filter: Isolette_Environment.Heat_Payload => B) {}

@datatype class Config_Isolette_Data_ModelOn_OffType(filter: Isolette_Data_Model.On_Off.Type => B) {}

@datatype class Config_Isolette_Data_ModelStatusType(filter: Isolette_Data_Model.Status.Type => B) {}

@datatype class Config_Isolette_Data_ModelOn_Off_Payload(filter: Isolette_Data_Model.On_Off_Payload => B) {}

@datatype class Config_Isolette_Data_ModelStatus_Payload(filter: Isolette_Data_Model.Status_Payload => B) {}

@datatype class Config_Isolette_Data_ModelTemp_impl(filter: Isolette_Data_Model.Temp_impl => B) {}

@datatype class Config_Isolette_Data_ModelTemp_impl_Payload(filter: Isolette_Data_Model.Temp_impl_Payload => B) {}

@datatype class Config_Isolette_Data_ModelValueStatusType(filter: Isolette_Data_Model.ValueStatus.Type => B) {}

@datatype class Config_Isolette_Data_ModelValueStatus_Payload(filter: Isolette_Data_Model.ValueStatus_Payload => B) {}

@datatype class Config_Isolette_Data_ModelMonitor_ModeType(filter: Isolette_Data_Model.Monitor_Mode.Type => B) {}

@datatype class Config_Isolette_Data_ModelMonitor_Mode_Payload(filter: Isolette_Data_Model.Monitor_Mode_Payload => B) {}

@datatype class Config_Isolette_Data_ModelRegulator_ModeType(filter: Isolette_Data_Model.Regulator_Mode.Type => B) {}

@datatype class Config_Isolette_Data_ModelRegulator_Mode_Payload(filter: Isolette_Data_Model.Regulator_Mode_Payload => B) {}

@datatype class Config_Isolette_Data_ModelTempWstatus_impl(filter: Isolette_Data_Model.TempWstatus_impl => B) {}

@datatype class Config_Isolette_Data_ModelTempWstatus_impl_Payload(filter: Isolette_Data_Model.TempWstatus_impl_Payload => B) {}

@datatype class Config_Isolette_Data_ModelFailure_Flag_impl(filter: Isolette_Data_Model.Failure_Flag_impl => B) {}

@datatype class Config_Isolette_Data_ModelPhysicalTemp_impl(filter: Isolette_Data_Model.PhysicalTemp_impl => B) {}

@datatype class Config_Isolette_Data_ModelFailure_Flag_impl_Payload(filter: Isolette_Data_Model.Failure_Flag_impl_Payload => B) {}

@datatype class Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(filter: Isolette_Data_Model.PhysicalTemp_impl_Payload => B) {}

@datatype class Config_Isolette_EnvironmentInterface_InteractionType(filter: Isolette_Environment.Interface_Interaction.Type => B) {}

@datatype class Config_Isolette_EnvironmentInterface_Interaction_Payload(filter: Isolette_Environment.Interface_Interaction_Payload => B) {}


