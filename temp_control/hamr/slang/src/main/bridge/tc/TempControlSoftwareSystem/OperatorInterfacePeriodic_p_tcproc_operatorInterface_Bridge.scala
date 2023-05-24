// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import art._
import tc._
import tc.TempControlSoftwareSystem.{OperatorInterfacePeriodic_p_tcproc_operatorInterface => component}

// This file was auto-generated.  Do not edit

@datatype class OperatorInterfacePeriodic_p_tcproc_operatorInterface_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  currentTemp: Port[TempSensor.Temperature_i],
  setPoint: Port[TempControlSoftwareSystem.SetPoint_i]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    dataIns = ISZ[art.UPort](currentTemp),

    dataOuts = ISZ[art.UPort](setPoint),

    eventIns = ISZ[art.UPort](),

    eventOuts = ISZ[art.UPort]()
  )

  val initialization_api : OperatorInterfacePeriodic_p_Initialization_Api = {
    val api = OperatorInterfacePeriodic_p_Initialization_Api(
      id,
      currentTemp.id,
      setPoint.id
    )
    OperatorInterfacePeriodic_p_tcproc_operatorInterface_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : OperatorInterfacePeriodic_p_Operational_Api = {
    val api = OperatorInterfacePeriodic_p_Operational_Api(
      id,
      currentTemp.id,
      setPoint.id
    )
    OperatorInterfacePeriodic_p_tcproc_operatorInterface_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    OperatorInterfacePeriodic_p_tcproc_operatorInterface_Bridge.EntryPoints(
      id,

      currentTemp.id,
      setPoint.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object OperatorInterfacePeriodic_p_tcproc_operatorInterface_Bridge {

  var c_initialization_api: Option[OperatorInterfacePeriodic_p_Initialization_Api] = None()
  var c_operational_api: Option[OperatorInterfacePeriodic_p_Operational_Api] = None()

  @datatype class EntryPoints(
    OperatorInterfacePeriodic_p_tcproc_operatorInterface_BridgeId : Art.BridgeId,
    currentTemp_Id : Art.PortId,
    setPoint_Id : Art.PortId,
    dispatchTriggers : Option[ISZ[Art.PortId]],
    initialization_api: OperatorInterfacePeriodic_p_Initialization_Api,
    operational_api: OperatorInterfacePeriodic_p_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = IS(currentTemp_Id)

    val eventInPortIds: ISZ[Art.PortId] = IS()

    val dataOutPortIds: ISZ[Art.PortId] = IS(setPoint_Id)

    val eventOutPortIds: ISZ[Art.PortId] = IS()

    def initialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: OperatorInterfacePeriodic_p_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = {}
      component.recover(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: OperatorInterfacePeriodic_p_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: OperatorInterfacePeriodic_p_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}