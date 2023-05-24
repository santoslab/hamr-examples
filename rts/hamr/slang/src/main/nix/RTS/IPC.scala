// #Sireum

package RTS

import org.sireum._
import art._
import art.Art.PortId._

// This file was auto-generated.  Do not edit

object IPCPorts {
  val InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_App: Art.PortId = Art.PortId.fromZ(76)
  val EventControlMockThread_i_eventControlMock_eventControlMockThread_App: Art.PortId = Art.PortId.fromZ(77)
  val ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_App: Art.PortId = Art.PortId.fromZ(78)
  val CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_App: Art.PortId = Art.PortId.fromZ(79)
  val CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_App: Art.PortId = Art.PortId.fromZ(80)
  val CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_App: Art.PortId = Art.PortId.fromZ(81)
  val OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_App: Art.PortId = Art.PortId.fromZ(82)
  val CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_App: Art.PortId = Art.PortId.fromZ(83)
  val CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_App: Art.PortId = Art.PortId.fromZ(84)
  val CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_App: Art.PortId = Art.PortId.fromZ(85)
  val OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_App: Art.PortId = Art.PortId.fromZ(86)
  val OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_App: Art.PortId = Art.PortId.fromZ(87)
  val Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_App: Art.PortId = Art.PortId.fromZ(88)
  val OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_App: Art.PortId = Art.PortId.fromZ(89)
  val Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_App: Art.PortId = Art.PortId.fromZ(90)
  val Main: Art.PortId = Art.PortId.fromZ(91)

  def emptyReceiveOut: MBox2[Art.PortId, DataContent] = {
    return MBox2(portId"0", art.Empty())
  }

  def emptyReceiveAsyncOut: MBox2[Art.PortId, Option[DataContent]] = {
    return MBox2(portId"0", None())
  }
}