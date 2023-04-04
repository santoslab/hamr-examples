// #Sireum

package isolette.Monitor

import org.sireum._
import art._
import isolette._
import isolette.Monitor.{Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode => component}

// This file was auto-generated.  Do not edit

@datatype class Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  current_tempWstatus: Port[Isolette_Data_Model.TempWstatus_impl],
  interface_failure: Port[Isolette_Data_Model.Failure_Flag_impl],
  internal_failure: Port[Isolette_Data_Model.Failure_Flag_impl],
  monitor_mode: Port[Isolette_Data_Model.Monitor_Mode.Type]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    dataIns = ISZ[art.UPort](current_tempWstatus,
                             interface_failure,
                             internal_failure),

    dataOuts = ISZ[art.UPort](monitor_mode),

    eventIns = ISZ[art.UPort](),

    eventOuts = ISZ[art.UPort]()
  )

  val initialization_api : Manage_Monitor_Mode_impl_Initialization_Api = {
    val api = Manage_Monitor_Mode_impl_Initialization_Api(
      id,
      current_tempWstatus.id,
      interface_failure.id,
      internal_failure.id,
      monitor_mode.id
    )
    Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : Manage_Monitor_Mode_impl_Operational_Api = {
    val api = Manage_Monitor_Mode_impl_Operational_Api(
      id,
      current_tempWstatus.id,
      interface_failure.id,
      internal_failure.id,
      monitor_mode.id
    )
    Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Bridge.EntryPoints(
      id,

      current_tempWstatus.id,
      interface_failure.id,
      internal_failure.id,
      monitor_mode.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Bridge {

  var c_initialization_api: Option[Manage_Monitor_Mode_impl_Initialization_Api] = None()
  var c_operational_api: Option[Manage_Monitor_Mode_impl_Operational_Api] = None()

  @datatype class EntryPoints(
    Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_BridgeId : Art.BridgeId,
    current_tempWstatus_Id : Art.PortId,
    interface_failure_Id : Art.PortId,
    internal_failure_Id : Art.PortId,
    monitor_mode_Id : Art.PortId,
    dispatchTriggers : Option[ISZ[Art.PortId]],
    initialization_api: Manage_Monitor_Mode_impl_Initialization_Api,
    operational_api: Manage_Monitor_Mode_impl_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = IS(current_tempWstatus_Id,
                                            interface_failure_Id,
                                            internal_failure_Id)

    val eventInPortIds: ISZ[Art.PortId] = IS()

    val dataOutPortIds: ISZ[Art.PortId] = IS(monitor_mode_Id)

    val eventOutPortIds: ISZ[Art.PortId] = IS()

    def initialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Manage_Monitor_Mode_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = {}
      component.recover(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Manage_Monitor_Mode_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Manage_Monitor_Mode_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}