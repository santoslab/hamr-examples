// #Sireum

package RTS

import org.sireum._
import art._

// This file was auto-generated.  Do not edit

object LegacyDemo extends App {
  def main(args: ISZ[String]): Z = {

    val seed: Z = if (args.size == z"1") {
      val n = Z(args(0)).get
      if (n <= z"0") 1 else n
    } else {
      1
    }

    Platform.initialise(seed, None())

    val empty = art.Empty()

    Platform.sendAsync(IPCPorts.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_App, IPCPorts.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_App, empty)
    Platform.sendAsync(IPCPorts.EventControlMockThread_i_eventControlMock_eventControlMockThread_App, IPCPorts.EventControlMockThread_i_eventControlMock_eventControlMockThread_App, empty)
    Platform.sendAsync(IPCPorts.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_App, IPCPorts.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_App, empty)
    Platform.sendAsync(IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_App, IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_App, empty)
    Platform.sendAsync(IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_App, IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_App, empty)
    Platform.sendAsync(IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_App, IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_App, empty)
    Platform.sendAsync(IPCPorts.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_App, IPCPorts.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_App, empty)
    Platform.sendAsync(IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_App, IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_App, empty)
    Platform.sendAsync(IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_App, IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_App, empty)
    Platform.sendAsync(IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_App, IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_App, empty)
    Platform.sendAsync(IPCPorts.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_App, IPCPorts.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_App, empty)
    Platform.sendAsync(IPCPorts.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_App, IPCPorts.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_App, empty)
    Platform.sendAsync(IPCPorts.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_App, IPCPorts.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_App, empty)
    Platform.sendAsync(IPCPorts.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_App, IPCPorts.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_App, empty)
    Platform.sendAsync(IPCPorts.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_App, IPCPorts.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_App, empty)

    Platform.finalise()
    return 0
  }
}
