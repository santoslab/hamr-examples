// #Sireum
// @formatter:off

// This file is auto-generated from DataContent.scala, Heat.scala, Interface_Interaction.scala, PhysicalTemp_impl.scala, ValueStatus.scala, TempWstatus_impl.scala, On_Off.scala, Status.scala, Temp_impl.scala, Regulator_Mode.scala, Failure_Flag_impl.scala, Monitor_Mode.scala, Base_Types.scala

package isolette

import org.sireum._

object MsgPack {

  object Constants {

    val _artEmpty: Z = -32

    val Isolette_EnvironmentHeat_Payload: Z = -31

    val Isolette_EnvironmentInterface_Interaction_Payload: Z = -30

    val Isolette_Data_ModelPhysicalTemp_impl: Z = -29

    val Isolette_Data_ModelPhysicalTemp_impl_Payload: Z = -28

    val Isolette_Data_ModelValueStatus_Payload: Z = -27

    val Isolette_Data_ModelTempWstatus_impl: Z = -26

    val Isolette_Data_ModelTempWstatus_impl_Payload: Z = -25

    val Isolette_Data_ModelOn_Off_Payload: Z = -24

    val Isolette_Data_ModelStatus_Payload: Z = -23

    val Isolette_Data_ModelTemp_impl: Z = -22

    val Isolette_Data_ModelTemp_impl_Payload: Z = -21

    val Isolette_Data_ModelRegulator_Mode_Payload: Z = -20

    val Isolette_Data_ModelFailure_Flag_impl: Z = -19

    val Isolette_Data_ModelFailure_Flag_impl_Payload: Z = -18

    val Isolette_Data_ModelMonitor_Mode_Payload: Z = -17

    val Base_TypesBoolean_Payload: Z = -16

    val Base_TypesInteger_Payload: Z = -15

    val Base_TypesInteger_8_Payload: Z = -14

    val Base_TypesInteger_16_Payload: Z = -13

    val Base_TypesInteger_32_Payload: Z = -12

    val Base_TypesInteger_64_Payload: Z = -11

    val Base_TypesUnsigned_8_Payload: Z = -10

    val Base_TypesUnsigned_16_Payload: Z = -9

    val Base_TypesUnsigned_32_Payload: Z = -8

    val Base_TypesUnsigned_64_Payload: Z = -7

    val Base_TypesFloat_Payload: Z = -6

    val Base_TypesFloat_32_Payload: Z = -5

    val Base_TypesFloat_64_Payload: Z = -4

    val Base_TypesCharacter_Payload: Z = -3

    val Base_TypesString_Payload: Z = -2

    val Base_TypesBits_Payload: Z = -1

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: Isolette_Environment.Heat_Payload => writeIsolette_EnvironmentHeat_Payload(o)
        case o: Isolette_Data_Model.On_Off_Payload => writeIsolette_Data_ModelOn_Off_Payload(o)
        case o: Isolette_Data_Model.Status_Payload => writeIsolette_Data_ModelStatus_Payload(o)
        case o: Isolette_Data_Model.Temp_impl_Payload => writeIsolette_Data_ModelTemp_impl_Payload(o)
        case o: Isolette_Data_Model.ValueStatus_Payload => writeIsolette_Data_ModelValueStatus_Payload(o)
        case o: Isolette_Data_Model.Monitor_Mode_Payload => writeIsolette_Data_ModelMonitor_Mode_Payload(o)
        case o: Isolette_Data_Model.Regulator_Mode_Payload => writeIsolette_Data_ModelRegulator_Mode_Payload(o)
        case o: Isolette_Data_Model.TempWstatus_impl_Payload => writeIsolette_Data_ModelTempWstatus_impl_Payload(o)
        case o: Isolette_Data_Model.Failure_Flag_impl_Payload => writeIsolette_Data_ModelFailure_Flag_impl_Payload(o)
        case o: Isolette_Data_Model.PhysicalTemp_impl_Payload => writeIsolette_Data_ModelPhysicalTemp_impl_Payload(o)
        case o: Isolette_Environment.Interface_Interaction_Payload => writeIsolette_EnvironmentInterface_Interaction_Payload(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def writeIsolette_EnvironmentHeatType(o: Isolette_Environment.Heat.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeIsolette_EnvironmentHeat_Payload(o: Isolette_Environment.Heat_Payload): Unit = {
      writer.writeZ(Constants.Isolette_EnvironmentHeat_Payload)
      writeIsolette_EnvironmentHeatType(o.value)
    }

    def writeIsolette_EnvironmentInterface_InteractionType(o: Isolette_Environment.Interface_Interaction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeIsolette_EnvironmentInterface_Interaction_Payload(o: Isolette_Environment.Interface_Interaction_Payload): Unit = {
      writer.writeZ(Constants.Isolette_EnvironmentInterface_Interaction_Payload)
      writeIsolette_EnvironmentInterface_InteractionType(o.value)
    }

    def writeIsolette_Data_ModelPhysicalTemp_impl(o: Isolette_Data_Model.PhysicalTemp_impl): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelPhysicalTemp_impl)
      writer.writeF32(o.value)
    }

    def writeIsolette_Data_ModelPhysicalTemp_impl_Payload(o: Isolette_Data_Model.PhysicalTemp_impl_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelPhysicalTemp_impl_Payload)
      writeIsolette_Data_ModelPhysicalTemp_impl(o.value)
    }

    def writeIsolette_Data_ModelValueStatusType(o: Isolette_Data_Model.ValueStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeIsolette_Data_ModelValueStatus_Payload(o: Isolette_Data_Model.ValueStatus_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelValueStatus_Payload)
      writeIsolette_Data_ModelValueStatusType(o.value)
    }

    def writeIsolette_Data_ModelTempWstatus_impl(o: Isolette_Data_Model.TempWstatus_impl): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelTempWstatus_impl)
      writer.writeF32(o.value)
      writeIsolette_Data_ModelValueStatusType(o.status)
    }

    def writeIsolette_Data_ModelTempWstatus_impl_Payload(o: Isolette_Data_Model.TempWstatus_impl_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelTempWstatus_impl_Payload)
      writeIsolette_Data_ModelTempWstatus_impl(o.value)
    }

    def writeIsolette_Data_ModelOn_OffType(o: Isolette_Data_Model.On_Off.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeIsolette_Data_ModelOn_Off_Payload(o: Isolette_Data_Model.On_Off_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelOn_Off_Payload)
      writeIsolette_Data_ModelOn_OffType(o.value)
    }

    def writeIsolette_Data_ModelStatusType(o: Isolette_Data_Model.Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeIsolette_Data_ModelStatus_Payload(o: Isolette_Data_Model.Status_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelStatus_Payload)
      writeIsolette_Data_ModelStatusType(o.value)
    }

    def writeIsolette_Data_ModelTemp_impl(o: Isolette_Data_Model.Temp_impl): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelTemp_impl)
      writer.writeF32(o.value)
    }

    def writeIsolette_Data_ModelTemp_impl_Payload(o: Isolette_Data_Model.Temp_impl_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelTemp_impl_Payload)
      writeIsolette_Data_ModelTemp_impl(o.value)
    }

    def writeIsolette_Data_ModelRegulator_ModeType(o: Isolette_Data_Model.Regulator_Mode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeIsolette_Data_ModelRegulator_Mode_Payload(o: Isolette_Data_Model.Regulator_Mode_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelRegulator_Mode_Payload)
      writeIsolette_Data_ModelRegulator_ModeType(o.value)
    }

    def writeIsolette_Data_ModelFailure_Flag_impl(o: Isolette_Data_Model.Failure_Flag_impl): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelFailure_Flag_impl)
      writer.writeB(o.value)
    }

    def writeIsolette_Data_ModelFailure_Flag_impl_Payload(o: Isolette_Data_Model.Failure_Flag_impl_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelFailure_Flag_impl_Payload)
      writeIsolette_Data_ModelFailure_Flag_impl(o.value)
    }

    def writeIsolette_Data_ModelMonitor_ModeType(o: Isolette_Data_Model.Monitor_Mode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeIsolette_Data_ModelMonitor_Mode_Payload(o: Isolette_Data_Model.Monitor_Mode_Payload): Unit = {
      writer.writeZ(Constants.Isolette_Data_ModelMonitor_Mode_Payload)
      writeIsolette_Data_ModelMonitor_ModeType(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.Isolette_EnvironmentHeat_Payload => val r = readIsolette_EnvironmentHeat_PayloadT(T); return r
        case Constants.Isolette_Data_ModelOn_Off_Payload => val r = readIsolette_Data_ModelOn_Off_PayloadT(T); return r
        case Constants.Isolette_Data_ModelStatus_Payload => val r = readIsolette_Data_ModelStatus_PayloadT(T); return r
        case Constants.Isolette_Data_ModelTemp_impl_Payload => val r = readIsolette_Data_ModelTemp_impl_PayloadT(T); return r
        case Constants.Isolette_Data_ModelValueStatus_Payload => val r = readIsolette_Data_ModelValueStatus_PayloadT(T); return r
        case Constants.Isolette_Data_ModelMonitor_Mode_Payload => val r = readIsolette_Data_ModelMonitor_Mode_PayloadT(T); return r
        case Constants.Isolette_Data_ModelRegulator_Mode_Payload => val r = readIsolette_Data_ModelRegulator_Mode_PayloadT(T); return r
        case Constants.Isolette_Data_ModelTempWstatus_impl_Payload => val r = readIsolette_Data_ModelTempWstatus_impl_PayloadT(T); return r
        case Constants.Isolette_Data_ModelFailure_Flag_impl_Payload => val r = readIsolette_Data_ModelFailure_Flag_impl_PayloadT(T); return r
        case Constants.Isolette_Data_ModelPhysicalTemp_impl_Payload => val r = readIsolette_Data_ModelPhysicalTemp_impl_PayloadT(T); return r
        case Constants.Isolette_EnvironmentInterface_Interaction_Payload => val r = readIsolette_EnvironmentInterface_Interaction_PayloadT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readIsolette_EnvironmentInterface_Interaction_PayloadT(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

    def readIsolette_EnvironmentHeatType(): Isolette_Environment.Heat.Type = {
      val r = reader.readZ()
      return Isolette_Environment.Heat.byOrdinal(r).get
    }

    def readIsolette_EnvironmentHeat_Payload(): Isolette_Environment.Heat_Payload = {
      val r = readIsolette_EnvironmentHeat_PayloadT(F)
      return r
    }

    def readIsolette_EnvironmentHeat_PayloadT(typeParsed: B): Isolette_Environment.Heat_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_EnvironmentHeat_Payload)
      }
      val value = readIsolette_EnvironmentHeatType()
      return Isolette_Environment.Heat_Payload(value)
    }

    def readIsolette_EnvironmentInterface_InteractionType(): Isolette_Environment.Interface_Interaction.Type = {
      val r = reader.readZ()
      return Isolette_Environment.Interface_Interaction.byOrdinal(r).get
    }

    def readIsolette_EnvironmentInterface_Interaction_Payload(): Isolette_Environment.Interface_Interaction_Payload = {
      val r = readIsolette_EnvironmentInterface_Interaction_PayloadT(F)
      return r
    }

    def readIsolette_EnvironmentInterface_Interaction_PayloadT(typeParsed: B): Isolette_Environment.Interface_Interaction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_EnvironmentInterface_Interaction_Payload)
      }
      val value = readIsolette_EnvironmentInterface_InteractionType()
      return Isolette_Environment.Interface_Interaction_Payload(value)
    }

    def readIsolette_Data_ModelPhysicalTemp_impl(): Isolette_Data_Model.PhysicalTemp_impl = {
      val r = readIsolette_Data_ModelPhysicalTemp_implT(F)
      return r
    }

    def readIsolette_Data_ModelPhysicalTemp_implT(typeParsed: B): Isolette_Data_Model.PhysicalTemp_impl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelPhysicalTemp_impl)
      }
      val value = reader.readF32()
      return Isolette_Data_Model.PhysicalTemp_impl(value)
    }

    def readIsolette_Data_ModelPhysicalTemp_impl_Payload(): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
      val r = readIsolette_Data_ModelPhysicalTemp_impl_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelPhysicalTemp_impl_PayloadT(typeParsed: B): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelPhysicalTemp_impl_Payload)
      }
      val value = readIsolette_Data_ModelPhysicalTemp_impl()
      return Isolette_Data_Model.PhysicalTemp_impl_Payload(value)
    }

    def readIsolette_Data_ModelValueStatusType(): Isolette_Data_Model.ValueStatus.Type = {
      val r = reader.readZ()
      return Isolette_Data_Model.ValueStatus.byOrdinal(r).get
    }

    def readIsolette_Data_ModelValueStatus_Payload(): Isolette_Data_Model.ValueStatus_Payload = {
      val r = readIsolette_Data_ModelValueStatus_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelValueStatus_PayloadT(typeParsed: B): Isolette_Data_Model.ValueStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelValueStatus_Payload)
      }
      val value = readIsolette_Data_ModelValueStatusType()
      return Isolette_Data_Model.ValueStatus_Payload(value)
    }

    def readIsolette_Data_ModelTempWstatus_impl(): Isolette_Data_Model.TempWstatus_impl = {
      val r = readIsolette_Data_ModelTempWstatus_implT(F)
      return r
    }

    def readIsolette_Data_ModelTempWstatus_implT(typeParsed: B): Isolette_Data_Model.TempWstatus_impl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelTempWstatus_impl)
      }
      val value = reader.readF32()
      val status = readIsolette_Data_ModelValueStatusType()
      return Isolette_Data_Model.TempWstatus_impl(value, status)
    }

    def readIsolette_Data_ModelTempWstatus_impl_Payload(): Isolette_Data_Model.TempWstatus_impl_Payload = {
      val r = readIsolette_Data_ModelTempWstatus_impl_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelTempWstatus_impl_PayloadT(typeParsed: B): Isolette_Data_Model.TempWstatus_impl_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelTempWstatus_impl_Payload)
      }
      val value = readIsolette_Data_ModelTempWstatus_impl()
      return Isolette_Data_Model.TempWstatus_impl_Payload(value)
    }

    def readIsolette_Data_ModelOn_OffType(): Isolette_Data_Model.On_Off.Type = {
      val r = reader.readZ()
      return Isolette_Data_Model.On_Off.byOrdinal(r).get
    }

    def readIsolette_Data_ModelOn_Off_Payload(): Isolette_Data_Model.On_Off_Payload = {
      val r = readIsolette_Data_ModelOn_Off_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelOn_Off_PayloadT(typeParsed: B): Isolette_Data_Model.On_Off_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelOn_Off_Payload)
      }
      val value = readIsolette_Data_ModelOn_OffType()
      return Isolette_Data_Model.On_Off_Payload(value)
    }

    def readIsolette_Data_ModelStatusType(): Isolette_Data_Model.Status.Type = {
      val r = reader.readZ()
      return Isolette_Data_Model.Status.byOrdinal(r).get
    }

    def readIsolette_Data_ModelStatus_Payload(): Isolette_Data_Model.Status_Payload = {
      val r = readIsolette_Data_ModelStatus_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelStatus_PayloadT(typeParsed: B): Isolette_Data_Model.Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelStatus_Payload)
      }
      val value = readIsolette_Data_ModelStatusType()
      return Isolette_Data_Model.Status_Payload(value)
    }

    def readIsolette_Data_ModelTemp_impl(): Isolette_Data_Model.Temp_impl = {
      val r = readIsolette_Data_ModelTemp_implT(F)
      return r
    }

    def readIsolette_Data_ModelTemp_implT(typeParsed: B): Isolette_Data_Model.Temp_impl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelTemp_impl)
      }
      val value = reader.readF32()
      return Isolette_Data_Model.Temp_impl(value)
    }

    def readIsolette_Data_ModelTemp_impl_Payload(): Isolette_Data_Model.Temp_impl_Payload = {
      val r = readIsolette_Data_ModelTemp_impl_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelTemp_impl_PayloadT(typeParsed: B): Isolette_Data_Model.Temp_impl_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelTemp_impl_Payload)
      }
      val value = readIsolette_Data_ModelTemp_impl()
      return Isolette_Data_Model.Temp_impl_Payload(value)
    }

    def readIsolette_Data_ModelRegulator_ModeType(): Isolette_Data_Model.Regulator_Mode.Type = {
      val r = reader.readZ()
      return Isolette_Data_Model.Regulator_Mode.byOrdinal(r).get
    }

    def readIsolette_Data_ModelRegulator_Mode_Payload(): Isolette_Data_Model.Regulator_Mode_Payload = {
      val r = readIsolette_Data_ModelRegulator_Mode_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelRegulator_Mode_PayloadT(typeParsed: B): Isolette_Data_Model.Regulator_Mode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelRegulator_Mode_Payload)
      }
      val value = readIsolette_Data_ModelRegulator_ModeType()
      return Isolette_Data_Model.Regulator_Mode_Payload(value)
    }

    def readIsolette_Data_ModelFailure_Flag_impl(): Isolette_Data_Model.Failure_Flag_impl = {
      val r = readIsolette_Data_ModelFailure_Flag_implT(F)
      return r
    }

    def readIsolette_Data_ModelFailure_Flag_implT(typeParsed: B): Isolette_Data_Model.Failure_Flag_impl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelFailure_Flag_impl)
      }
      val value = reader.readB()
      return Isolette_Data_Model.Failure_Flag_impl(value)
    }

    def readIsolette_Data_ModelFailure_Flag_impl_Payload(): Isolette_Data_Model.Failure_Flag_impl_Payload = {
      val r = readIsolette_Data_ModelFailure_Flag_impl_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelFailure_Flag_impl_PayloadT(typeParsed: B): Isolette_Data_Model.Failure_Flag_impl_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelFailure_Flag_impl_Payload)
      }
      val value = readIsolette_Data_ModelFailure_Flag_impl()
      return Isolette_Data_Model.Failure_Flag_impl_Payload(value)
    }

    def readIsolette_Data_ModelMonitor_ModeType(): Isolette_Data_Model.Monitor_Mode.Type = {
      val r = reader.readZ()
      return Isolette_Data_Model.Monitor_Mode.byOrdinal(r).get
    }

    def readIsolette_Data_ModelMonitor_Mode_Payload(): Isolette_Data_Model.Monitor_Mode_Payload = {
      val r = readIsolette_Data_ModelMonitor_Mode_PayloadT(F)
      return r
    }

    def readIsolette_Data_ModelMonitor_Mode_PayloadT(typeParsed: B): Isolette_Data_Model.Monitor_Mode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Isolette_Data_ModelMonitor_Mode_Payload)
      }
      val value = readIsolette_Data_ModelMonitor_ModeType()
      return Isolette_Data_Model.Monitor_Mode_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

  def fromIsolette_EnvironmentHeat_Payload(o: Isolette_Environment.Heat_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_EnvironmentHeat_Payload(o)
    return w.result
  }

  def toIsolette_EnvironmentHeat_Payload(data: ISZ[U8]): Either[Isolette_Environment.Heat_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_EnvironmentHeat_Payload(reader: Reader): Isolette_Environment.Heat_Payload = {
      val r = reader.readIsolette_EnvironmentHeat_Payload()
      return r
    }
    val r = to(data, fIsolette_EnvironmentHeat_Payload _)
    return r
  }

  def fromIsolette_EnvironmentInterface_Interaction_Payload(o: Isolette_Environment.Interface_Interaction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_EnvironmentInterface_Interaction_Payload(o)
    return w.result
  }

  def toIsolette_EnvironmentInterface_Interaction_Payload(data: ISZ[U8]): Either[Isolette_Environment.Interface_Interaction_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_EnvironmentInterface_Interaction_Payload(reader: Reader): Isolette_Environment.Interface_Interaction_Payload = {
      val r = reader.readIsolette_EnvironmentInterface_Interaction_Payload()
      return r
    }
    val r = to(data, fIsolette_EnvironmentInterface_Interaction_Payload _)
    return r
  }

  def fromIsolette_Data_ModelPhysicalTemp_impl(o: Isolette_Data_Model.PhysicalTemp_impl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelPhysicalTemp_impl(o)
    return w.result
  }

  def toIsolette_Data_ModelPhysicalTemp_impl(data: ISZ[U8]): Either[Isolette_Data_Model.PhysicalTemp_impl, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelPhysicalTemp_impl(reader: Reader): Isolette_Data_Model.PhysicalTemp_impl = {
      val r = reader.readIsolette_Data_ModelPhysicalTemp_impl()
      return r
    }
    val r = to(data, fIsolette_Data_ModelPhysicalTemp_impl _)
    return r
  }

  def fromIsolette_Data_ModelPhysicalTemp_impl_Payload(o: Isolette_Data_Model.PhysicalTemp_impl_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelPhysicalTemp_impl_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelPhysicalTemp_impl_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.PhysicalTemp_impl_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelPhysicalTemp_impl_Payload(reader: Reader): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
      val r = reader.readIsolette_Data_ModelPhysicalTemp_impl_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelPhysicalTemp_impl_Payload _)
    return r
  }

  def fromIsolette_Data_ModelValueStatus_Payload(o: Isolette_Data_Model.ValueStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelValueStatus_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelValueStatus_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.ValueStatus_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelValueStatus_Payload(reader: Reader): Isolette_Data_Model.ValueStatus_Payload = {
      val r = reader.readIsolette_Data_ModelValueStatus_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelValueStatus_Payload _)
    return r
  }

  def fromIsolette_Data_ModelTempWstatus_impl(o: Isolette_Data_Model.TempWstatus_impl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelTempWstatus_impl(o)
    return w.result
  }

  def toIsolette_Data_ModelTempWstatus_impl(data: ISZ[U8]): Either[Isolette_Data_Model.TempWstatus_impl, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelTempWstatus_impl(reader: Reader): Isolette_Data_Model.TempWstatus_impl = {
      val r = reader.readIsolette_Data_ModelTempWstatus_impl()
      return r
    }
    val r = to(data, fIsolette_Data_ModelTempWstatus_impl _)
    return r
  }

  def fromIsolette_Data_ModelTempWstatus_impl_Payload(o: Isolette_Data_Model.TempWstatus_impl_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelTempWstatus_impl_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelTempWstatus_impl_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.TempWstatus_impl_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelTempWstatus_impl_Payload(reader: Reader): Isolette_Data_Model.TempWstatus_impl_Payload = {
      val r = reader.readIsolette_Data_ModelTempWstatus_impl_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelTempWstatus_impl_Payload _)
    return r
  }

  def fromIsolette_Data_ModelOn_Off_Payload(o: Isolette_Data_Model.On_Off_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelOn_Off_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelOn_Off_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.On_Off_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelOn_Off_Payload(reader: Reader): Isolette_Data_Model.On_Off_Payload = {
      val r = reader.readIsolette_Data_ModelOn_Off_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelOn_Off_Payload _)
    return r
  }

  def fromIsolette_Data_ModelStatus_Payload(o: Isolette_Data_Model.Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelStatus_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelStatus_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.Status_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelStatus_Payload(reader: Reader): Isolette_Data_Model.Status_Payload = {
      val r = reader.readIsolette_Data_ModelStatus_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelStatus_Payload _)
    return r
  }

  def fromIsolette_Data_ModelTemp_impl(o: Isolette_Data_Model.Temp_impl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelTemp_impl(o)
    return w.result
  }

  def toIsolette_Data_ModelTemp_impl(data: ISZ[U8]): Either[Isolette_Data_Model.Temp_impl, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelTemp_impl(reader: Reader): Isolette_Data_Model.Temp_impl = {
      val r = reader.readIsolette_Data_ModelTemp_impl()
      return r
    }
    val r = to(data, fIsolette_Data_ModelTemp_impl _)
    return r
  }

  def fromIsolette_Data_ModelTemp_impl_Payload(o: Isolette_Data_Model.Temp_impl_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelTemp_impl_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelTemp_impl_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.Temp_impl_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelTemp_impl_Payload(reader: Reader): Isolette_Data_Model.Temp_impl_Payload = {
      val r = reader.readIsolette_Data_ModelTemp_impl_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelTemp_impl_Payload _)
    return r
  }

  def fromIsolette_Data_ModelRegulator_Mode_Payload(o: Isolette_Data_Model.Regulator_Mode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelRegulator_Mode_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelRegulator_Mode_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.Regulator_Mode_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelRegulator_Mode_Payload(reader: Reader): Isolette_Data_Model.Regulator_Mode_Payload = {
      val r = reader.readIsolette_Data_ModelRegulator_Mode_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelRegulator_Mode_Payload _)
    return r
  }

  def fromIsolette_Data_ModelFailure_Flag_impl(o: Isolette_Data_Model.Failure_Flag_impl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelFailure_Flag_impl(o)
    return w.result
  }

  def toIsolette_Data_ModelFailure_Flag_impl(data: ISZ[U8]): Either[Isolette_Data_Model.Failure_Flag_impl, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelFailure_Flag_impl(reader: Reader): Isolette_Data_Model.Failure_Flag_impl = {
      val r = reader.readIsolette_Data_ModelFailure_Flag_impl()
      return r
    }
    val r = to(data, fIsolette_Data_ModelFailure_Flag_impl _)
    return r
  }

  def fromIsolette_Data_ModelFailure_Flag_impl_Payload(o: Isolette_Data_Model.Failure_Flag_impl_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelFailure_Flag_impl_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelFailure_Flag_impl_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.Failure_Flag_impl_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelFailure_Flag_impl_Payload(reader: Reader): Isolette_Data_Model.Failure_Flag_impl_Payload = {
      val r = reader.readIsolette_Data_ModelFailure_Flag_impl_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelFailure_Flag_impl_Payload _)
    return r
  }

  def fromIsolette_Data_ModelMonitor_Mode_Payload(o: Isolette_Data_Model.Monitor_Mode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeIsolette_Data_ModelMonitor_Mode_Payload(o)
    return w.result
  }

  def toIsolette_Data_ModelMonitor_Mode_Payload(data: ISZ[U8]): Either[Isolette_Data_Model.Monitor_Mode_Payload, MessagePack.ErrorMsg] = {
    def fIsolette_Data_ModelMonitor_Mode_Payload(reader: Reader): Isolette_Data_Model.Monitor_Mode_Payload = {
      val r = reader.readIsolette_Data_ModelMonitor_Mode_Payload()
      return r
    }
    val r = to(data, fIsolette_Data_ModelMonitor_Mode_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

}