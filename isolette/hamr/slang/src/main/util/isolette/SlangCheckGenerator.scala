// #Sireum

package isolette

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Heat.scala

Interface_Interaction.scala

PhysicalTemp_impl.scala

ValueStatus.scala

TempWstatus_impl.scala

On_Off.scala

Status.scala

Temp_impl.scala

Regulator_Mode.scala

Failure_Flag_impl.scala

Monitor_Mode.scala

Base_Types.scala

Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface__Containers.scala

Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source__Containers.scala

Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode__Containers.scala

Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface__Containers.scala

Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm__Containers.scala

Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode__Containers.scala

DataContent.scala

Aux_Types.scala

*/

@record class Gen_String(param: RandomLibI) extends MJen[String] {
  override def generate(f: String => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextString())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Z(param: RandomLibI) extends MJen[Z] {
  override def generate(f: Z => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextZ())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_B(param: RandomLibI) extends MJen[B] {
  override def generate(f: B => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_C(param: RandomLibI) extends MJen[C] {
  override def generate(f: C => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextC())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_R(param: RandomLibI) extends MJen[R] {
  override def generate(f: R => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextR())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F32(param: RandomLibI) extends MJen[F32] {
  override def generate(f: F32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F64(param: RandomLibI) extends MJen[F64] {
  override def generate(f: F64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S8(param: RandomLibI) extends MJen[S8] {
  override def generate(f: S8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S16(param: RandomLibI) extends MJen[S16] {
  override def generate(f: S16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S32(param: RandomLibI) extends MJen[S32] {
  override def generate(f: S32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S64(param: RandomLibI) extends MJen[S64] {
  override def generate(f: S64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U8(param: RandomLibI) extends MJen[U8] {
  override def generate(f: U8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U16(param: RandomLibI) extends MJen[U16] {
  override def generate(f: U16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U32(param: RandomLibI) extends MJen[U32] {
  override def generate(f: U32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U64(param: RandomLibI) extends MJen[U64] {
  override def generate(f: U64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


@record class Gen__artDataContent(param: RandomLibI) extends MJen[art.DataContent] {
  override def generate(f: art.DataContent => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artDataContent())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen__artEmpty(param: RandomLibI) extends MJen[art.Empty] {
  override def generate(f: art.Empty => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artEmpty())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBoolean_Payload(param: RandomLibI) extends MJen[Base_Types.Boolean_Payload] {
  override def generate(f: Base_Types.Boolean_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBoolean_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_Payload] {
  override def generate(f: Base_Types.Integer_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_8_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_8_Payload] {
  override def generate(f: Base_Types.Integer_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_16_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_16_Payload] {
  override def generate(f: Base_Types.Integer_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_32_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_32_Payload] {
  override def generate(f: Base_Types.Integer_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_64_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_64_Payload] {
  override def generate(f: Base_Types.Integer_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_8_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_8_Payload] {
  override def generate(f: Base_Types.Unsigned_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_16_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_16_Payload] {
  override def generate(f: Base_Types.Unsigned_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_32_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_32_Payload] {
  override def generate(f: Base_Types.Unsigned_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_64_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_64_Payload] {
  override def generate(f: Base_Types.Unsigned_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_Payload(param: RandomLibI) extends MJen[Base_Types.Float_Payload] {
  override def generate(f: Base_Types.Float_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_32_Payload(param: RandomLibI) extends MJen[Base_Types.Float_32_Payload] {
  override def generate(f: Base_Types.Float_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_64_Payload(param: RandomLibI) extends MJen[Base_Types.Float_64_Payload] {
  override def generate(f: Base_Types.Float_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesCharacter_Payload(param: RandomLibI) extends MJen[Base_Types.Character_Payload] {
  override def generate(f: Base_Types.Character_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesCharacter_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesString_Payload(param: RandomLibI) extends MJen[Base_Types.String_Payload] {
  override def generate(f: Base_Types.String_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesString_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBits_Payload(param: RandomLibI) extends MJen[Base_Types.Bits_Payload] {
  override def generate(f: Base_Types.Bits_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBits_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelFailure_Flag_impl(param: RandomLibI) extends MJen[Isolette_Data_Model.Failure_Flag_impl] {
  override def generate(f: Isolette_Data_Model.Failure_Flag_impl => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelFailure_Flag_impl())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelFailure_Flag_impl_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.Failure_Flag_impl_Payload] {
  override def generate(f: Isolette_Data_Model.Failure_Flag_impl_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelFailure_Flag_impl_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelMonitor_ModeType(param: RandomLibI) extends MJen[Isolette_Data_Model.Monitor_Mode.Type] {
  override def generate(f: Isolette_Data_Model.Monitor_Mode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelMonitor_ModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelMonitor_Mode_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.Monitor_Mode_Payload] {
  override def generate(f: Isolette_Data_Model.Monitor_Mode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelMonitor_Mode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelOn_OffType(param: RandomLibI) extends MJen[Isolette_Data_Model.On_Off.Type] {
  override def generate(f: Isolette_Data_Model.On_Off.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelOn_OffType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelOn_Off_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.On_Off_Payload] {
  override def generate(f: Isolette_Data_Model.On_Off_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelOn_Off_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelPhysicalTemp_impl(param: RandomLibI) extends MJen[Isolette_Data_Model.PhysicalTemp_impl] {
  override def generate(f: Isolette_Data_Model.PhysicalTemp_impl => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelPhysicalTemp_impl())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelPhysicalTemp_impl_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.PhysicalTemp_impl_Payload] {
  override def generate(f: Isolette_Data_Model.PhysicalTemp_impl_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelPhysicalTemp_impl_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelRegulator_ModeType(param: RandomLibI) extends MJen[Isolette_Data_Model.Regulator_Mode.Type] {
  override def generate(f: Isolette_Data_Model.Regulator_Mode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelRegulator_ModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelRegulator_Mode_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.Regulator_Mode_Payload] {
  override def generate(f: Isolette_Data_Model.Regulator_Mode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelRegulator_Mode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelStatusType(param: RandomLibI) extends MJen[Isolette_Data_Model.Status.Type] {
  override def generate(f: Isolette_Data_Model.Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelStatus_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.Status_Payload] {
  override def generate(f: Isolette_Data_Model.Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelTempWstatus_impl(param: RandomLibI) extends MJen[Isolette_Data_Model.TempWstatus_impl] {
  override def generate(f: Isolette_Data_Model.TempWstatus_impl => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelTempWstatus_impl())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelTempWstatus_impl_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.TempWstatus_impl_Payload] {
  override def generate(f: Isolette_Data_Model.TempWstatus_impl_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelTempWstatus_impl_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelTemp_impl(param: RandomLibI) extends MJen[Isolette_Data_Model.Temp_impl] {
  override def generate(f: Isolette_Data_Model.Temp_impl => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelTemp_impl())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelTemp_impl_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.Temp_impl_Payload] {
  override def generate(f: Isolette_Data_Model.Temp_impl_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelTemp_impl_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelValueStatusType(param: RandomLibI) extends MJen[Isolette_Data_Model.ValueStatus.Type] {
  override def generate(f: Isolette_Data_Model.ValueStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelValueStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_Data_ModelValueStatus_Payload(param: RandomLibI) extends MJen[Isolette_Data_Model.ValueStatus_Payload] {
  override def generate(f: Isolette_Data_Model.ValueStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_Data_ModelValueStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_EnvironmentHeatType(param: RandomLibI) extends MJen[Isolette_Environment.Heat.Type] {
  override def generate(f: Isolette_Environment.Heat.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_EnvironmentHeatType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_EnvironmentHeat_Payload(param: RandomLibI) extends MJen[Isolette_Environment.Heat_Payload] {
  override def generate(f: Isolette_Environment.Heat_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_EnvironmentHeat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_EnvironmentInterface_InteractionType(param: RandomLibI) extends MJen[Isolette_Environment.Interface_Interaction.Type] {
  override def generate(f: Isolette_Environment.Interface_Interaction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_EnvironmentInterface_InteractionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Isolette_EnvironmentInterface_Interaction_Payload(param: RandomLibI) extends MJen[Isolette_Environment.Interface_Interaction_Payload] {
  override def generate(f: Isolette_Environment.Interface_Interaction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextIsolette_EnvironmentInterface_Interaction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container(param: RandomLibI) extends MJen[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container] {
  override def generate(f: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(param: RandomLibI) extends MJen[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P] {
  override def generate(f: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(param: RandomLibI) extends MJen[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS] {
  override def generate(f: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container(param: RandomLibI) extends MJen[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container] {
  override def generate(f: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(param: RandomLibI) extends MJen[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P] {
  override def generate(f: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(param: RandomLibI) extends MJen[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS] {
  override def generate(f: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container] {
  override def generate(f: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P] {
  override def generate(f: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS] {
  override def generate(f: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container] {
  override def generate(f: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P] {
  override def generate(f: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS] {
  override def generate(f: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container] {
  override def generate(f: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P] {
  override def generate(f: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS] {
  override def generate(f: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container] {
  override def generate(f: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P] {
  override def generate(f: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(param: RandomLibI) extends MJen[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS] {
  override def generate(f: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container(param: RandomLibI) extends MJen[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container] {
  override def generate(f: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(param: RandomLibI) extends MJen[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P] {
  override def generate(f: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(param: RandomLibI) extends MJen[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS] {
  override def generate(f: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container(param: RandomLibI) extends MJen[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container] {
  override def generate(f: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(param: RandomLibI) extends MJen[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P] {
  override def generate(f: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(param: RandomLibI) extends MJen[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS] {
  override def generate(f: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container] {
  override def generate(f: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P] {
  override def generate(f: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS] {
  override def generate(f: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container] {
  override def generate(f: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P] {
  override def generate(f: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS] {
  override def generate(f: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container] {
  override def generate(f: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P] {
  override def generate(f: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS] {
  override def generate(f: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container] {
  override def generate(f: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P] {
  override def generate(f: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(param: RandomLibI) extends MJen[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS] {
  override def generate(f: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


