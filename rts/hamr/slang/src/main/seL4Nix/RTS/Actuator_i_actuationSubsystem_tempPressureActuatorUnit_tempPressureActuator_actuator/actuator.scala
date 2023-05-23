// #Sireum

// This file was auto-generated.  Do not edit

package RTS.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator

import org.sireum._
import art._
import art.Art.BridgeId._
import art.Art.PortId._
import art.DispatchPropertyProtocol._
import art.PortMode._
import RTS._
import RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_seL4Nix

object actuator extends App {

  val actuatorBridge : RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge = {
    val input = Port[Base_Types.Boolean] (id = portId"0", name = "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_input", mode = DataIn)
    val manualActuatorInput = Port[Base_Types.Boolean] (id = portId"1", name = "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_manualActuatorInput", mode = DataIn)
    val output = Port[Base_Types.Boolean] (id = portId"2", name = "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_output", mode = DataOut)

    RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge(
      id = bridgeId"0",
      name = "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      input = input,
      manualActuatorInput = manualActuatorInput,
      output = output
    )
  }

  val entryPoints: Bridge.EntryPoints = actuatorBridge.entryPoints
  val noData: Option[DataContent] = None()

  // input: In DataPort Base_Types.Boolean
  val input_id: Art.PortId = actuatorBridge.input.id
  var input_port: Option[DataContent] = noData

  // manualActuatorInput: In DataPort Base_Types.Boolean
  val manualActuatorInput_id: Art.PortId = actuatorBridge.manualActuatorInput.id
  var manualActuatorInput_port: Option[DataContent] = noData

  // output: Out DataPort Base_Types.Boolean
  val output_id: Art.PortId = actuatorBridge.output.id
  var output_port: Option[DataContent] = noData

  def dispatchStatus(bridgeId: Art.BridgeId): DispatchStatus = {
    return TimeTriggered()
  }

  def getValue(portId: Art.PortId): Option[DataContent] = {
    if(portId == input_id) {
      return input_port
    } else if(portId == manualActuatorInput_id) {
      return manualActuatorInput_port
    } else {
      halt(s"Unexpected: actuator.getValue called with: ${portId}")
    }
  }

  def receiveInput(eventPortIds: ISZ[Art.PortId], dataPortIds: ISZ[Art.PortId]): Unit = {
    // ignore params

    input_port = Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_seL4Nix.input_Receive()

    manualActuatorInput_port = Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_seL4Nix.manualActuatorInput_Receive()
  }

  def putValue(portId: Art.PortId, data: DataContent): Unit = {
    if(portId == output_id) {
      output_port = Some(data)
    } else {
      halt(s"Unexpected: actuator.putValue called with: ${portId}")
    }
  }

  def sendOutput(eventPortIds: ISZ[Art.PortId], dataPortIds: ISZ[Art.PortId]): Unit = {
    // ignore params

    if(output_port.nonEmpty) {
      Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_seL4Nix.output_Send(output_port.get)
      output_port = noData
    }
  }

  def initialiseArchitecture(): Unit = {
    // nothing to do - CAmkES is responsible for initialization
  }

  def initialiseEntryPoint(): Unit = { entryPoints.initialise() }

  def computeEntryPoint(): Unit = { entryPoints.compute() }

  def finaliseEntryPoint(): Unit = { entryPoints.finalise() }

  def main(args: ISZ[String]): Z = {

    // need to touch the following for transpiler
    initialiseArchitecture()
    initialiseEntryPoint()
    computeEntryPoint()
    finaliseEntryPoint()

    touch()

    return 0
  }

  def touch(): Unit = {
    if(F) {
      TranspilerToucher.touch()

      // add types used in Platform.receive and Platform.receiveAsync
      val mbox2Boolean_Payload: MBox2[Art.PortId, DataContent] = MBox2(portId"0", Base_Types.Boolean_Payload(T))
      val mbox2OptionDataContent: MBox2[Art.PortId, Option[DataContent]] = MBox2(portId"0", None())

      // touch each payload/type in case some are only used as a field in a record
      def printDataContent(a: art.DataContent): Unit = { println(s"${a}") }

      printDataContent(Base_Types.Boolean_Payload(Base_Types.Boolean_example()))
      printDataContent(Base_Types.Integer_Payload(Base_Types.Integer_example()))
      printDataContent(Base_Types.Integer_8_Payload(Base_Types.Integer_8_example()))
      printDataContent(Base_Types.Integer_16_Payload(Base_Types.Integer_16_example()))
      printDataContent(Base_Types.Integer_32_Payload(Base_Types.Integer_32_example()))
      printDataContent(Base_Types.Integer_64_Payload(Base_Types.Integer_64_example()))
      printDataContent(Base_Types.Unsigned_8_Payload(Base_Types.Unsigned_8_example()))
      printDataContent(Base_Types.Unsigned_16_Payload(Base_Types.Unsigned_16_example()))
      printDataContent(Base_Types.Unsigned_32_Payload(Base_Types.Unsigned_32_example()))
      printDataContent(Base_Types.Unsigned_64_Payload(Base_Types.Unsigned_64_example()))
      printDataContent(Base_Types.Float_Payload(Base_Types.Float_example()))
      printDataContent(Base_Types.Float_32_Payload(Base_Types.Float_32_example()))
      printDataContent(Base_Types.Float_64_Payload(Base_Types.Float_64_example()))
      printDataContent(Base_Types.Character_Payload(Base_Types.Character_example()))
      printDataContent(Base_Types.String_Payload(Base_Types.String_example()))
      printDataContent(art.Empty())

      RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_initialization_api.get.logInfo("")
      RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_initialization_api.get.logDebug("")
      RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_initialization_api.get.logError("")
      RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_operational_api.get.logInfo("")
      RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_operational_api.get.logDebug("")
      RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_operational_api.get.logError("")
      val apiUsage_input: Option[Base_Types.Boolean] = RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_operational_api.get.get_input()
      val apiUsage_manualActuatorInput: Option[Base_Types.Boolean] = RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_operational_api.get.get_manualActuatorInput()
      RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_initialization_api.get.put_output(Base_Types.Boolean_example())
      RTS.Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge.c_operational_api.get.put_output(Base_Types.Boolean_example())
    }
  }

  def logInfo(title: String, msg: String): Unit = {
    print(actuatorBridge.name)
    print(": ")
    println(msg)
  }

  def logError(title: String, msg: String): Unit = {
    eprint(actuatorBridge.name)
    eprint(": ")
    eprintln(msg)
  }

  def logDebug(title: String, msg: String): Unit = {
    print(actuatorBridge.name)
    print(": ")
    println(msg)
  }

  def run(): Unit = {}

}
