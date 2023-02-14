// #Sireum

package isolette.Monitor

import org.sireum._
import art._
import isolette._
import isolette.Monitor.{Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure => component}

// This file was auto-generated.  Do not edit

@datatype class Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[IS[Art.PortId, Art.PortId]],

  internal_failure: Port[Isolette_Data_Model.Failure_Flag_impl]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    all = IS[Art.PortId, art.UPort](internal_failure),

    dataIns = IS[Art.PortId, art.UPort](),

    dataOuts = IS[Art.PortId, art.UPort](internal_failure),

    eventIns = IS[Art.PortId, art.UPort](),

    eventOuts = IS[Art.PortId, art.UPort]()
  )

  val initialization_api : Detect_Monitor_Failure_impl_Initialization_Api = {
    val api = Detect_Monitor_Failure_impl_Initialization_Api(
      id,
      internal_failure.id
    )
    Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : Detect_Monitor_Failure_impl_Operational_Api = {
    val api = Detect_Monitor_Failure_impl_Operational_Api(
      id,
      internal_failure.id
    )
    Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge.EntryPoints(
      id,

      internal_failure.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Bridge {

  var c_initialization_api: Option[Detect_Monitor_Failure_impl_Initialization_Api] = None()
  var c_operational_api: Option[Detect_Monitor_Failure_impl_Operational_Api] = None()

  @datatype class EntryPoints(
    Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_BridgeId : Art.BridgeId,
    internal_failure_Id : Art.PortId,
    dispatchTriggers : Option[IS[Art.PortId, Art.PortId]],
    initialization_api: Detect_Monitor_Failure_impl_Initialization_Api,
    operational_api: Detect_Monitor_Failure_impl_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: IS[Art.PortId, Art.PortId] = IS()

    val eventInPortIds: IS[Art.PortId, Art.PortId] = IS()

    val dataOutPortIds: IS[Art.PortId, Art.PortId] = IS(internal_failure_Id)

    val eventOutPortIds: IS[Art.PortId, Art.PortId] = IS()

    def initialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Detect_Monitor_Failure_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Detect_Monitor_Failure_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: Detect_Monitor_Failure_impl_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: Detect_Monitor_Failure_impl_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: Detect_Monitor_Failure_impl_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: Detect_Monitor_Failure_impl_Operational_Api): Unit = {}
      component.recover(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Detect_Monitor_Failure_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Detect_Monitor_Failure_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}