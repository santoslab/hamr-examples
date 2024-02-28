// #Sireum
// @formatter:off

// This file is auto-generated from Temperature_i.scala, FanCmd.scala, FanAck.scala, SetPoint_i.scala, Base_Types.scala, GUMBO__Library.scala, GUMBO__Library.scala, TempSensorPeriodic_p_tcproc_tempSensor_Containers.scala, FanPeriodic_p_tcproc_fan_Containers.scala, TempControlPeriodic_p_tcproc_tempControl_Containers.scala, OperatorInterfacePeriodic_p_tcproc_operatorInterface_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package tc

import org.sireum._

object MsgPack {

  object Constants {

    val TempSensorTemperature_i: Z = -32

    val TempSensorTemperature_i_Payload: Z = -31

    val CoolingFanFanCmd_Payload: Z = -30

    val CoolingFanFanAck_Payload: Z = -29

    val TempControlSoftwareSystemSetPoint_i: Z = -28

    val TempControlSoftwareSystemSetPoint_i_Payload: Z = -27

    val Base_TypesBoolean_Payload: Z = -26

    val Base_TypesInteger_Payload: Z = -25

    val Base_TypesInteger_8_Payload: Z = -24

    val Base_TypesInteger_16_Payload: Z = -23

    val Base_TypesInteger_32_Payload: Z = -22

    val Base_TypesInteger_64_Payload: Z = -21

    val Base_TypesUnsigned_8_Payload: Z = -20

    val Base_TypesUnsigned_16_Payload: Z = -19

    val Base_TypesUnsigned_32_Payload: Z = -18

    val Base_TypesUnsigned_64_Payload: Z = -17

    val Base_TypesFloat_Payload: Z = -16

    val Base_TypesFloat_32_Payload: Z = -15

    val Base_TypesFloat_64_Payload: Z = -14

    val Base_TypesCharacter_Payload: Z = -13

    val Base_TypesString_Payload: Z = -12

    val Base_TypesBits_Payload: Z = -11

    val TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P: Z = -10

    val TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS: Z = -9

    val TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P: Z = -8

    val TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS: Z = -7

    val CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P: Z = -6

    val CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS: Z = -5

    val CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P: Z = -4

    val CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS: Z = -3

    val TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P: Z = -2

    val TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS: Z = -1

    val TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P: Z = 0

    val TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS: Z = 1

    val TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P: Z = 2

    val TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS: Z = 3

    val TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P: Z = 4

    val TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS: Z = 5

    val utilEmptyContainer: Z = 6

    val _artEmpty: Z = 7

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeTempSensorTemperature_i(o: TempSensor.Temperature_i): Unit = {
      writer.writeZ(Constants.TempSensorTemperature_i)
      writer.writeF32(o.degrees)
    }

    def writeTempSensorTemperature_i_Payload(o: TempSensor.Temperature_i_Payload): Unit = {
      writer.writeZ(Constants.TempSensorTemperature_i_Payload)
      writeTempSensorTemperature_i(o.value)
    }

    def writeCoolingFanFanCmdType(o: CoolingFan.FanCmd.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCoolingFanFanCmd_Payload(o: CoolingFan.FanCmd_Payload): Unit = {
      writer.writeZ(Constants.CoolingFanFanCmd_Payload)
      writeCoolingFanFanCmdType(o.value)
    }

    def writeCoolingFanFanAckType(o: CoolingFan.FanAck.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCoolingFanFanAck_Payload(o: CoolingFan.FanAck_Payload): Unit = {
      writer.writeZ(Constants.CoolingFanFanAck_Payload)
      writeCoolingFanFanAckType(o.value)
    }

    def writeTempControlSoftwareSystemSetPoint_i(o: TempControlSoftwareSystem.SetPoint_i): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemSetPoint_i)
      writeTempSensorTemperature_i(o.low)
      writeTempSensorTemperature_i(o.high)
    }

    def writeTempControlSoftwareSystemSetPoint_i_Payload(o: TempControlSoftwareSystem.SetPoint_i_Payload): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemSetPoint_i_Payload)
      writeTempControlSoftwareSystemSetPoint_i(o.value)
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

    def writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container): Unit = {
      o match {
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(o)
      }
    }

    def writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P)
    }

    def writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS)
    }

    def writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container): Unit = {
      o match {
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(o)
      }
    }

    def writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P)
      writeTempSensorTemperature_i(o.api_currentTemp)
    }

    def writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS)
      writeTempSensorTemperature_i(o.api_currentTemp)
    }

    def writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container(o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container): Unit = {
      o match {
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P => writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS => writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(o)
      }
    }

    def writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P): Unit = {
      writer.writeZ(Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P)
      writeCoolingFanFanCmdType(o.api_fanCmd)
    }

    def writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS)
      writeCoolingFanFanCmdType(o.api_fanCmd)
    }

    def writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container(o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container): Unit = {
      o match {
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P => writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS => writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(o)
      }
    }

    def writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P): Unit = {
      writer.writeZ(Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P)
      writeCoolingFanFanAckType(o.api_fanAck)
    }

    def writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS)
      writeCoolingFanFanAckType(o.api_fanAck)
    }

    def writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container): Unit = {
      o match {
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(o)
      }
    }

    def writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P)
      writeTempSensorTemperature_i(o.api_currentTemp)
      writeCoolingFanFanAckType(o.api_fanAck)
      writeTempControlSoftwareSystemSetPoint_i(o.api_setPoint)
    }

    def writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS)
      writeCoolingFanFanCmdType(o.In_latestFanCmd)
      writeTempSensorTemperature_i(o.api_currentTemp)
      writeCoolingFanFanAckType(o.api_fanAck)
      writeTempControlSoftwareSystemSetPoint_i(o.api_setPoint)
    }

    def writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container): Unit = {
      o match {
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(o)
      }
    }

    def writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P)
      writeCoolingFanFanCmdType(o.api_fanCmd)
    }

    def writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS)
      writeCoolingFanFanCmdType(o.latestFanCmd)
      writeCoolingFanFanCmdType(o.api_fanCmd)
    }

    def writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container): Unit = {
      o match {
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(o)
      }
    }

    def writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P)
      writeTempSensorTemperature_i(o.api_currentTemp)
    }

    def writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS)
      writeTempSensorTemperature_i(o.api_currentTemp)
    }

    def writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container): Unit = {
      o match {
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(o)
      }
    }

    def writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P)
      writeTempControlSoftwareSystemSetPoint_i(o.api_setPoint)
    }

    def writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS)
      writeTempControlSoftwareSystemSetPoint_i(o.api_setPoint)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P => writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS => writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P => writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS => writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
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
        case o: art.Empty => write_artEmpty(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: CoolingFan.FanCmd_Payload => writeCoolingFanFanCmd_Payload(o)
        case o: CoolingFan.FanAck_Payload => writeCoolingFanFanAck_Payload(o)
        case o: TempSensor.Temperature_i_Payload => writeTempSensorTemperature_i_Payload(o)
        case o: TempControlSoftwareSystem.SetPoint_i_Payload => writeTempControlSoftwareSystemSetPoint_i_Payload(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P => writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS => writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P => writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(o)
        case o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS => writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(o)
        case o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS => writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS => writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(o)
        case o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS => writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(o)
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

    def readTempSensorTemperature_i(): TempSensor.Temperature_i = {
      val r = readTempSensorTemperature_iT(F)
      return r
    }

    def readTempSensorTemperature_iT(typeParsed: B): TempSensor.Temperature_i = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempSensorTemperature_i)
      }
      val degrees = reader.readF32()
      return TempSensor.Temperature_i(degrees)
    }

    def readTempSensorTemperature_i_Payload(): TempSensor.Temperature_i_Payload = {
      val r = readTempSensorTemperature_i_PayloadT(F)
      return r
    }

    def readTempSensorTemperature_i_PayloadT(typeParsed: B): TempSensor.Temperature_i_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempSensorTemperature_i_Payload)
      }
      val value = readTempSensorTemperature_i()
      return TempSensor.Temperature_i_Payload(value)
    }

    def readCoolingFanFanCmdType(): CoolingFan.FanCmd.Type = {
      val r = reader.readZ()
      return CoolingFan.FanCmd.byOrdinal(r).get
    }

    def readCoolingFanFanCmd_Payload(): CoolingFan.FanCmd_Payload = {
      val r = readCoolingFanFanCmd_PayloadT(F)
      return r
    }

    def readCoolingFanFanCmd_PayloadT(typeParsed: B): CoolingFan.FanCmd_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.CoolingFanFanCmd_Payload)
      }
      val value = readCoolingFanFanCmdType()
      return CoolingFan.FanCmd_Payload(value)
    }

    def readCoolingFanFanAckType(): CoolingFan.FanAck.Type = {
      val r = reader.readZ()
      return CoolingFan.FanAck.byOrdinal(r).get
    }

    def readCoolingFanFanAck_Payload(): CoolingFan.FanAck_Payload = {
      val r = readCoolingFanFanAck_PayloadT(F)
      return r
    }

    def readCoolingFanFanAck_PayloadT(typeParsed: B): CoolingFan.FanAck_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.CoolingFanFanAck_Payload)
      }
      val value = readCoolingFanFanAckType()
      return CoolingFan.FanAck_Payload(value)
    }

    def readTempControlSoftwareSystemSetPoint_i(): TempControlSoftwareSystem.SetPoint_i = {
      val r = readTempControlSoftwareSystemSetPoint_iT(F)
      return r
    }

    def readTempControlSoftwareSystemSetPoint_iT(typeParsed: B): TempControlSoftwareSystem.SetPoint_i = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemSetPoint_i)
      }
      val low = readTempSensorTemperature_i()
      val high = readTempSensorTemperature_i()
      return TempControlSoftwareSystem.SetPoint_i(low, high)
    }

    def readTempControlSoftwareSystemSetPoint_i_Payload(): TempControlSoftwareSystem.SetPoint_i_Payload = {
      val r = readTempControlSoftwareSystemSetPoint_i_PayloadT(F)
      return r
    }

    def readTempControlSoftwareSystemSetPoint_i_PayloadT(typeParsed: B): TempControlSoftwareSystem.SetPoint_i_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemSetPoint_i_Payload)
      }
      val value = readTempControlSoftwareSystemSetPoint_i()
      return TempControlSoftwareSystem.SetPoint_i_Payload(value)
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

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container(): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PT(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container.")
          val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PST(T)
          return r
      }
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P = {
      val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PT(F)
      return r
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PT(typeParsed: B): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P)
      }
      return TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P()
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS = {
      val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PST(F)
      return r
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PST(typeParsed: B): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS)
      }
      return TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS()
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container(): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PT(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container.")
          val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PST(T)
          return r
      }
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P = {
      val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PT(F)
      return r
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PT(typeParsed: B): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P)
      }
      val api_currentTemp = readTempSensorTemperature_i()
      return TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(api_currentTemp)
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS = {
      val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PST(F)
      return r
    }

    def readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PST(typeParsed: B): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS)
      }
      val api_currentTemp = readTempSensorTemperature_i()
      return TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(api_currentTemp)
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container(): CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PT(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container.")
          val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PST(T)
          return r
      }
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(): CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P = {
      val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PT(F)
      return r
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PT(typeParsed: B): CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P)
      }
      val api_fanCmd = readCoolingFanFanCmdType()
      return CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P(api_fanCmd)
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(): CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS = {
      val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PST(F)
      return r
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PST(typeParsed: B): CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS)
      }
      val api_fanCmd = readCoolingFanFanCmdType()
      return CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS(api_fanCmd)
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container(): CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PT(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container.")
          val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PST(T)
          return r
      }
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(): CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P = {
      val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PT(F)
      return r
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PT(typeParsed: B): CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P)
      }
      val api_fanAck = readCoolingFanFanAckType()
      return CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P(api_fanAck)
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(): CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS = {
      val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PST(F)
      return r
    }

    def readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PST(typeParsed: B): CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS)
      }
      val api_fanAck = readCoolingFanFanAckType()
      return CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS(api_fanAck)
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container(): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container.")
          val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PST(T)
          return r
      }
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P = {
      val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PT(F)
      return r
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PT(typeParsed: B): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P)
      }
      val api_currentTemp = readTempSensorTemperature_i()
      val api_fanAck = readCoolingFanFanAckType()
      val api_setPoint = readTempControlSoftwareSystemSetPoint_i()
      return TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(api_currentTemp, api_fanAck, api_setPoint)
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS = {
      val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PST(F)
      return r
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PST(typeParsed: B): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS)
      }
      val In_latestFanCmd = readCoolingFanFanCmdType()
      val api_currentTemp = readTempSensorTemperature_i()
      val api_fanAck = readCoolingFanFanAckType()
      val api_setPoint = readTempControlSoftwareSystemSetPoint_i()
      return TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(In_latestFanCmd, api_currentTemp, api_fanAck, api_setPoint)
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container(): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container.")
          val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PST(T)
          return r
      }
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P = {
      val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PT(F)
      return r
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PT(typeParsed: B): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P)
      }
      val api_fanCmd = readCoolingFanFanCmdType()
      return TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(api_fanCmd)
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS = {
      val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PST(F)
      return r
    }

    def readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PST(typeParsed: B): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS)
      }
      val latestFanCmd = readCoolingFanFanCmdType()
      val api_fanCmd = readCoolingFanFanCmdType()
      return TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(latestFanCmd, api_fanCmd)
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container(): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container.")
          val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PST(T)
          return r
      }
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P = {
      val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PT(F)
      return r
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PT(typeParsed: B): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P)
      }
      val api_currentTemp = readTempSensorTemperature_i()
      return TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(api_currentTemp)
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS = {
      val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PST(F)
      return r
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PST(typeParsed: B): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS)
      }
      val api_currentTemp = readTempSensorTemperature_i()
      return TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(api_currentTemp)
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container(): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container.")
          val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PST(T)
          return r
      }
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P = {
      val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PT(F)
      return r
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PT(typeParsed: B): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P)
      }
      val api_setPoint = readTempControlSoftwareSystemSetPoint_i()
      return TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(api_setPoint)
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS = {
      val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PST(F)
      return r
    }

    def readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PST(typeParsed: B): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS)
      }
      val api_setPoint = readTempControlSoftwareSystemSetPoint_i()
      return TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(api_setPoint)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PT(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PST(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PT(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PST(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PT(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PST(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PT(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PST(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PST(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PST(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PST(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
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
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.CoolingFanFanCmd_Payload => val r = readCoolingFanFanCmd_PayloadT(T); return r
        case Constants.CoolingFanFanAck_Payload => val r = readCoolingFanFanAck_PayloadT(T); return r
        case Constants.TempSensorTemperature_i_Payload => val r = readTempSensorTemperature_i_PayloadT(T); return r
        case Constants.TempControlSoftwareSystemSetPoint_i_Payload => val r = readTempControlSoftwareSystemSetPoint_i_PayloadT(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PT(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PST(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PT(T); return r
        case Constants.CoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS => val r = readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PST(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PT(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PST(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PT(T); return r
        case Constants.TempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS => val r = readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PST(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PST(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS => val r = readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PST(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PST(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PT(T); return r
        case Constants.TempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS => val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PST(T)
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

  def fromTempSensorTemperature_i(o: TempSensor.Temperature_i, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempSensorTemperature_i(o)
    return w.result
  }

  def toTempSensorTemperature_i(data: ISZ[U8]): Either[TempSensor.Temperature_i, MessagePack.ErrorMsg] = {
    def fTempSensorTemperature_i(reader: Reader): TempSensor.Temperature_i = {
      val r = reader.readTempSensorTemperature_i()
      return r
    }
    val r = to(data, fTempSensorTemperature_i _)
    return r
  }

  def fromTempSensorTemperature_i_Payload(o: TempSensor.Temperature_i_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempSensorTemperature_i_Payload(o)
    return w.result
  }

  def toTempSensorTemperature_i_Payload(data: ISZ[U8]): Either[TempSensor.Temperature_i_Payload, MessagePack.ErrorMsg] = {
    def fTempSensorTemperature_i_Payload(reader: Reader): TempSensor.Temperature_i_Payload = {
      val r = reader.readTempSensorTemperature_i_Payload()
      return r
    }
    val r = to(data, fTempSensorTemperature_i_Payload _)
    return r
  }

  def fromCoolingFanFanCmd_Payload(o: CoolingFan.FanCmd_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCoolingFanFanCmd_Payload(o)
    return w.result
  }

  def toCoolingFanFanCmd_Payload(data: ISZ[U8]): Either[CoolingFan.FanCmd_Payload, MessagePack.ErrorMsg] = {
    def fCoolingFanFanCmd_Payload(reader: Reader): CoolingFan.FanCmd_Payload = {
      val r = reader.readCoolingFanFanCmd_Payload()
      return r
    }
    val r = to(data, fCoolingFanFanCmd_Payload _)
    return r
  }

  def fromCoolingFanFanAck_Payload(o: CoolingFan.FanAck_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCoolingFanFanAck_Payload(o)
    return w.result
  }

  def toCoolingFanFanAck_Payload(data: ISZ[U8]): Either[CoolingFan.FanAck_Payload, MessagePack.ErrorMsg] = {
    def fCoolingFanFanAck_Payload(reader: Reader): CoolingFan.FanAck_Payload = {
      val r = reader.readCoolingFanFanAck_Payload()
      return r
    }
    val r = to(data, fCoolingFanFanAck_Payload _)
    return r
  }

  def fromTempControlSoftwareSystemSetPoint_i(o: TempControlSoftwareSystem.SetPoint_i, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemSetPoint_i(o)
    return w.result
  }

  def toTempControlSoftwareSystemSetPoint_i(data: ISZ[U8]): Either[TempControlSoftwareSystem.SetPoint_i, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemSetPoint_i(reader: Reader): TempControlSoftwareSystem.SetPoint_i = {
      val r = reader.readTempControlSoftwareSystemSetPoint_i()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemSetPoint_i _)
    return r
  }

  def fromTempControlSoftwareSystemSetPoint_i_Payload(o: TempControlSoftwareSystem.SetPoint_i_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemSetPoint_i_Payload(o)
    return w.result
  }

  def toTempControlSoftwareSystemSetPoint_i_Payload(data: ISZ[U8]): Either[TempControlSoftwareSystem.SetPoint_i_Payload, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemSetPoint_i_Payload(reader: Reader): TempControlSoftwareSystem.SetPoint_i_Payload = {
      val r = reader.readTempControlSoftwareSystemSetPoint_i_Payload()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemSetPoint_i_Payload _)
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

  def fromTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container(o)
    return w.result
  }

  def toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container(data: ISZ[U8]): Either[TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container, MessagePack.ErrorMsg] = {
    def fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container(reader: Reader): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container = {
      val r = reader.readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container()
      return r
    }
    val r = to(data, fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container _)
    return r
  }

  def fromTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(o)
    return w.result
  }

  def toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(data: ISZ[U8]): Either[TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P(reader: Reader): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P = {
      val r = reader.readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P()
      return r
    }
    val r = to(data, fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_P _)
    return r
  }

  def fromTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(o)
    return w.result
  }

  def toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(data: ISZ[U8]): Either[TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(reader: Reader): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS = {
      val r = reader.readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS()
      return r
    }
    val r = to(data, fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS _)
    return r
  }

  def fromTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container(o)
    return w.result
  }

  def toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container(data: ISZ[U8]): Either[TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container, MessagePack.ErrorMsg] = {
    def fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container(reader: Reader): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container = {
      val r = reader.readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container()
      return r
    }
    val r = to(data, fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container _)
    return r
  }

  def fromTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(o)
    return w.result
  }

  def toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(data: ISZ[U8]): Either[TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P(reader: Reader): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P = {
      val r = reader.readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P()
      return r
    }
    val r = to(data, fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_P _)
    return r
  }

  def fromTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(o: TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(o)
    return w.result
  }

  def toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(data: ISZ[U8]): Either[TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(reader: Reader): TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS = {
      val r = reader.readTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS()
      return r
    }
    val r = to(data, fTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS _)
    return r
  }

  def fromCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container(o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container(o)
    return w.result
  }

  def toCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container(data: ISZ[U8]): Either[CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container, MessagePack.ErrorMsg] = {
    def fCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container(reader: Reader): CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container = {
      val r = reader.readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container()
      return r
    }
    val r = to(data, fCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container _)
    return r
  }

  def fromCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(o)
    return w.result
  }

  def toCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(data: ISZ[U8]): Either[CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(reader: Reader): CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_P = {
      val r = reader.readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P()
      return r
    }
    val r = to(data, fCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P _)
    return r
  }

  def fromCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(o: CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(o)
    return w.result
  }

  def toCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(data: ISZ[U8]): Either[CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS(reader: Reader): CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS = {
      val r = reader.readCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS()
      return r
    }
    val r = to(data, fCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_PS _)
    return r
  }

  def fromCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container(o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container(o)
    return w.result
  }

  def toCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container(data: ISZ[U8]): Either[CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container, MessagePack.ErrorMsg] = {
    def fCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container(reader: Reader): CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container = {
      val r = reader.readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container()
      return r
    }
    val r = to(data, fCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container _)
    return r
  }

  def fromCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(o)
    return w.result
  }

  def toCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(data: ISZ[U8]): Either[CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P(reader: Reader): CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_P = {
      val r = reader.readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P()
      return r
    }
    val r = to(data, fCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_P _)
    return r
  }

  def fromCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(o: CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(o)
    return w.result
  }

  def toCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(data: ISZ[U8]): Either[CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS(reader: Reader): CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS = {
      val r = reader.readCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS()
      return r
    }
    val r = to(data, fCoolingFanFanPeriodic_p_tcproc_fan_PostState_Container_PS _)
    return r
  }

  def fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container(o)
    return w.result
  }

  def toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container(data: ISZ[U8]): Either[TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container(reader: Reader): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container = {
      val r = reader.readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container _)
    return r
  }

  def fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(o)
    return w.result
  }

  def toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(data: ISZ[U8]): Either[TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P(reader: Reader): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P = {
      val r = reader.readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_P _)
    return r
  }

  def fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(o)
    return w.result
  }

  def toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(data: ISZ[U8]): Either[TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(reader: Reader): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS = {
      val r = reader.readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS _)
    return r
  }

  def fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container(o)
    return w.result
  }

  def toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container(data: ISZ[U8]): Either[TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container(reader: Reader): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container = {
      val r = reader.readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container _)
    return r
  }

  def fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(o)
    return w.result
  }

  def toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(data: ISZ[U8]): Either[TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P(reader: Reader): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P = {
      val r = reader.readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_P _)
    return r
  }

  def fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(o: TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(o)
    return w.result
  }

  def toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(data: ISZ[U8]): Either[TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(reader: Reader): TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS = {
      val r = reader.readTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container(o)
    return w.result
  }

  def toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container(data: ISZ[U8]): Either[TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container(reader: Reader): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container = {
      val r = reader.readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(o)
    return w.result
  }

  def toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(data: ISZ[U8]): Either[TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P(reader: Reader): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P = {
      val r = reader.readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_P _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(o)
    return w.result
  }

  def toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(data: ISZ[U8]): Either[TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(reader: Reader): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS = {
      val r = reader.readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container(o)
    return w.result
  }

  def toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container(data: ISZ[U8]): Either[TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container(reader: Reader): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container = {
      val r = reader.readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(o)
    return w.result
  }

  def toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(data: ISZ[U8]): Either[TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P(reader: Reader): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P = {
      val r = reader.readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_P _)
    return r
  }

  def fromTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(o: TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(o)
    return w.result
  }

  def toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(data: ISZ[U8]): Either[TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(reader: Reader): TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS = {
      val r = reader.readTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS()
      return r
    }
    val r = to(data, fTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
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