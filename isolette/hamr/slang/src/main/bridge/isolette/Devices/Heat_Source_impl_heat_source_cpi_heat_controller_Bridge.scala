// #Sireum

package isolette.Devices

import org.sireum._
import art._
import isolette._
import isolette.Devices.{Heat_Source_impl_heat_source_cpi_heat_controller => component}

// This file was auto-generated.  Do not edit

@datatype class Heat_Source_impl_heat_source_cpi_heat_controller_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  heat_control: Port[Isolette_Data_Model.On_Off.Type],
  heat_out: Port[Isolette_Environment.Heat.Type]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    dataIns = ISZ[art.UPort](heat_control),

    dataOuts = ISZ[art.UPort](heat_out),

    eventIns = ISZ[art.UPort](),

    eventOuts = ISZ[art.UPort]()
  )

  val initialization_api : Heat_Source_impl_Initialization_Api = {
    val api = Heat_Source_impl_Initialization_Api(
      id,
      heat_control.id,
      heat_out.id
    )
    Heat_Source_impl_heat_source_cpi_heat_controller_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : Heat_Source_impl_Operational_Api = {
    val api = Heat_Source_impl_Operational_Api(
      id,
      heat_control.id,
      heat_out.id
    )
    Heat_Source_impl_heat_source_cpi_heat_controller_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    Heat_Source_impl_heat_source_cpi_heat_controller_Bridge.EntryPoints(
      id,

      heat_control.id,
      heat_out.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object Heat_Source_impl_heat_source_cpi_heat_controller_Bridge {

  var c_initialization_api: Option[Heat_Source_impl_Initialization_Api] = None()
  var c_operational_api: Option[Heat_Source_impl_Operational_Api] = None()

  @datatype class EntryPoints(
    Heat_Source_impl_heat_source_cpi_heat_controller_BridgeId : Art.BridgeId,
    heat_control_Id : Art.PortId,
    heat_out_Id : Art.PortId,
    dispatchTriggers : Option[ISZ[Art.PortId]],
    initialization_api: Heat_Source_impl_Initialization_Api,
    operational_api: Heat_Source_impl_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = IS(heat_control_Id)

    val eventInPortIds: ISZ[Art.PortId] = IS()

    val dataOutPortIds: ISZ[Art.PortId] = IS(heat_out_Id)

    val eventOutPortIds: ISZ[Art.PortId] = IS()

    def initialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Heat_Source_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Heat_Source_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: Heat_Source_impl_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: Heat_Source_impl_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: Heat_Source_impl_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: Heat_Source_impl_Operational_Api): Unit = {}
      component.recover(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Heat_Source_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Heat_Source_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}