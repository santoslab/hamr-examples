// #Sireum

package RTS

import org.sireum._
import art._

// This file was auto-generated.  Do not edit

object ArtNix {

  val maxPortIds: Z = IPCPorts.Main.toZ + 1
  val timeTriggered: TimeTriggered = TimeTriggered()
  val noData: Option[DataContent] = None()
  val data: MS[Art.PortId, Option[DataContent]] = MS.create(maxPortIds, noData)
  val connection: MS[Art.PortId, IS[Art.ConnectionId, (Art.PortId, Art.PortId)]] = {
    // mapping from src ports to pairs holding the destination app port ids and component port ids
    val r = MS.create[Art.PortId, IS[Art.ConnectionId, (Art.PortId, Art.PortId)]](maxPortIds, IS())

    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_temperatureLogic_channel1.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_temperatureLogic_channel2.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_temperatureLogic_channel3.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.channel3.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_temperatureLogic_channel4.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.channel4.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_pressureLogic_channel1.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_pressureLogic_channel2.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_pressureLogic_channel3.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.channel3.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_pressureLogic_channel4.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.channel4.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_saturationLogic_channel1.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_saturationLogic_channel2.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_saturationLogic_channel3.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.channel3.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit1_saturationLogic_channel4.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.channel4.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_temperatureLogic_channel1.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_temperatureLogic_channel2.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_temperatureLogic_channel3.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.channel3.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_temperatureLogic_channel4.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.channel4.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_pressureLogic_channel1.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_pressureLogic_channel2.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_pressureLogic_channel3.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.channel3.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_pressureLogic_channel4.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.channel4.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_saturationLogic_channel1.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_saturationLogic_channel2.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_saturationLogic_channel3.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.channel3.id)
    )
    r(Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.unit2_saturationLogic_channel4.id) = IS(
      (IPCPorts.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.channel4.id)
    )
    r(Arch.RTS_i_Instance_eventControlMock_eventControlMockThread.manualActuatorInput1.id) = IS(
      (IPCPorts.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_App, Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator.manualActuatorInput.id)
    )
    r(Arch.RTS_i_Instance_eventControlMock_eventControlMockThread.manualActuatorInput2.id) = IS(
      (IPCPorts.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_App, Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator.manualActuatorInput.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator.output.id) = IS(
      (IPCPorts.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_App, Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread.tempPressureActuate.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator.output.id) = IS(
      (IPCPorts.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_App, Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread.saturationActuate.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.actuate.id) = IS(
      (IPCPorts.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_App, Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.actuate.id) = IS(
      (IPCPorts.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_App, Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.actuate.id) = IS(
      (IPCPorts.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_App, Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic.actuate.id) = IS(
      (IPCPorts.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_App, Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.actuate.id) = IS(
      (IPCPorts.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.actuate.id) = IS(
      (IPCPorts.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.actuate.id) = IS(
      (IPCPorts.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic.channel1.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.actuate.id) = IS(
      (IPCPorts.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_App, Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic.channel2.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic.actuate.id) = IS(
      (IPCPorts.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_App, Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator.input.id)
    )
    r(Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic.actuate.id) = IS(
      (IPCPorts.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_App, Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator.input.id)
    )

    r
  }
  val eventInPorts: MS[Art.PortId, Art.PortId] = MS[Art.PortId, Art.PortId] (
  )
  var frozen: MS[Art.PortId, Option[DataContent]] = MS.create(maxPortIds, noData)
  var outgoing: MS[Art.PortId, Option[DataContent]] = MS.create(maxPortIds, noData)
  var isTimeDispatch: B = F

  def updateData(port: Art.PortId, d: DataContent): Unit = {
    data(port) = Some(d)
  }

  def timeDispatch(): Unit = {
    isTimeDispatch = T
  }

  def eventDispatch(): Unit = {
    isTimeDispatch = F
  }

  def dispatchStatus(bridgeId: Art.BridgeId): DispatchStatus = {
    if (isTimeDispatch) {
      return timeTriggered
    } else {
      var r = ISZ[Art.PortId]()
      for (i <- eventInPorts if data(i).nonEmpty) {
        r = r :+ i
      }
      return EventTriggered(r)
    }
  }

  def receiveInput(eventPortIds: ISZ[Art.PortId], dataPortIds: ISZ[Art.PortId]): Unit = {
    frozen = data
    for (i <- eventPortIds) {
      data(i) = noData
    }
  }

  def putValue(portId: Art.PortId, data: DataContent): Unit = {
    outgoing(portId) = Some(data)
  }

  def getValue(portId: Art.PortId): Option[DataContent] = {
    return frozen(portId)
  }

  def sendOutput(eventPortIds: ISZ[Art.PortId], dataPortIds: ISZ[Art.PortId]): Unit = {
    for (p <- dataPortIds) {
      outgoing(p) match {
        case Some(d) =>
          outgoing(p) = noData
          for(e <- connection(p)){
            Platform.sendAsync(e._1, e._2, d)
          }
        case _ =>
      }
    }

    for (p <- eventPortIds) {
      outgoing(p) match {
        case Some(d) =>
          outgoing(p) = noData
          for(e <- connection(p)){
            Platform.sendAsync(e._1, e._2, d)
          }
        case _ =>
      }
    }
  }

  def logInfo(title: String, msg: String): Unit = {
    print(title)
    print(": ")
    println(msg)
  }

  def logError(title: String, msg: String): Unit = {
    eprint(title)
    eprint(": ")
    eprintln(msg)
  }

  def logDebug(title: String, msg: String): Unit = {
    print(title)
    print(": ")
    println(msg)
  }

  def time(): Art.Time = {
    return Process.time()
  }

  def run(): Unit = {}

  def tearDownSystemState(): Unit = {}

  def setUpSystemState(): Unit = {}

  def initializePhase(): Unit = {}

  def computePhase(): Unit = {}

  def finalizePhase(): Unit = {}
}
