// #Sireum
// @formatter:off

// This file is auto-generated from Base_Types.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVectors.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVectors.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVectors.scala, OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVectors.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVectors.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVectors.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVectors.scala, OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVectors.scala, OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVectors.scala, Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVectors.scala, OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVectors.scala, Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVectors.scala, DataContent.scala

package RTS

import org.sireum._

object MsgPack {

  object Constants {

    val Base_TypesBoolean_Payload: Z = -32

    val Base_TypesInteger_Payload: Z = -31

    val Base_TypesInteger_8_Payload: Z = -30

    val Base_TypesInteger_16_Payload: Z = -29

    val Base_TypesInteger_32_Payload: Z = -28

    val Base_TypesInteger_64_Payload: Z = -27

    val Base_TypesUnsigned_8_Payload: Z = -26

    val Base_TypesUnsigned_16_Payload: Z = -25

    val Base_TypesUnsigned_32_Payload: Z = -24

    val Base_TypesUnsigned_64_Payload: Z = -23

    val Base_TypesFloat_Payload: Z = -22

    val Base_TypesFloat_32_Payload: Z = -21

    val Base_TypesFloat_64_Payload: Z = -20

    val Base_TypesCharacter_Payload: Z = -19

    val Base_TypesString_Payload: Z = -18

    val Base_TypesBits_Payload: Z = -17

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector: Z = -16

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector: Z = -15

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector: Z = -14

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector: Z = -13

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector: Z = -12

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector: Z = -11

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector: Z = -10

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector: Z = -9

    val ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector: Z = -8

    val ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector: Z = -7

    val ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector: Z = -6

    val ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector: Z = -5

    val _artEmpty: Z = -4

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

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

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector)
      writer.writeB(o.api_input)
      writer.writeB(o.api_manualActuatorInput)
    }

    def writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector)
      writer.writeB(o.api_input)
      writer.writeB(o.api_manualActuatorInput)
    }

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
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
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

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVectorT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVectorT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVectorT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVectorT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(api_channel1, api_channel2)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVectorT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVectorT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVectorT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVectorT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector = {
      val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVectorT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(api_channel1, api_channel2)
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector = {
      val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVectorT(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVectorT(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector)
      }
      val api_input = reader.readB()
      val api_manualActuatorInput = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(api_input, api_manualActuatorInput)
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector = {
      val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVectorT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVectorT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(api_channel1, api_channel2)
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector = {
      val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVectorT(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVectorT(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector)
      }
      val api_input = reader.readB()
      val api_manualActuatorInput = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(api_input, api_manualActuatorInput)
    }

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
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readBase_TypesBits_PayloadT(T)
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

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(reader: Reader): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector = {
      val r = reader.readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(reader: Reader): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector = {
      val r = reader.readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector _)
    return r
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

}