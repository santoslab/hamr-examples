// #Sireum

package isolette.Devices

import org.sireum._
import art._
import isolette._
import isolette.Devices.{Temperature_Sensor_impl_temperature_sensor_cpi_thermostat => component}

// This file was auto-generated.  Do not edit

@datatype class Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  air: Port[Isolette_Data_Model.PhysicalTemp_impl],
  current_tempWstatus: Port[Isolette_Data_Model.TempWstatus_impl]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    dataIns = ISZ[art.UPort](air),

    dataOuts = ISZ[art.UPort](current_tempWstatus),

    eventIns = ISZ[art.UPort](),

    eventOuts = ISZ[art.UPort]()
  )

  val initialization_api : Temperature_Sensor_impl_Initialization_Api = {
    val api = Temperature_Sensor_impl_Initialization_Api(
      id,
      air.id,
      current_tempWstatus.id
    )
    Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : Temperature_Sensor_impl_Operational_Api = {
    val api = Temperature_Sensor_impl_Operational_Api(
      id,
      air.id,
      current_tempWstatus.id
    )
    Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge.EntryPoints(
      id,

      air.id,
      current_tempWstatus.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Bridge {

  var c_initialization_api: Option[Temperature_Sensor_impl_Initialization_Api] = None()
  var c_operational_api: Option[Temperature_Sensor_impl_Operational_Api] = None()

  @datatype class EntryPoints(
    Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_BridgeId : Art.BridgeId,
    air_Id : Art.PortId,
    current_tempWstatus_Id : Art.PortId,
    dispatchTriggers : Option[ISZ[Art.PortId]],
    initialization_api: Temperature_Sensor_impl_Initialization_Api,
    operational_api: Temperature_Sensor_impl_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = IS(air_Id)

    val eventInPortIds: ISZ[Art.PortId] = IS()

    val dataOutPortIds: ISZ[Art.PortId] = IS(current_tempWstatus_Id)

    val eventOutPortIds: ISZ[Art.PortId] = IS()

    def initialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Temperature_Sensor_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Temperature_Sensor_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: Temperature_Sensor_impl_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: Temperature_Sensor_impl_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: Temperature_Sensor_impl_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: Temperature_Sensor_impl_Operational_Api): Unit = {}
      component.recover(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Temperature_Sensor_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Temperature_Sensor_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}