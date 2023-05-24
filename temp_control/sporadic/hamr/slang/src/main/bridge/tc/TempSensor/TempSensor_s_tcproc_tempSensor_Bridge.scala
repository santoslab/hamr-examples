// #Sireum

package tc.TempSensor

import org.sireum._
import art._
import tc._
import tc.TempSensor.{TempSensor_s_tcproc_tempSensor => component}

// This file was auto-generated.  Do not edit

@datatype class TempSensor_s_tcproc_tempSensor_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  currentTemp: Port[TempSensor.Temperature_i],
  tempChanged: Port[art.Empty]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    dataIns = ISZ[art.UPort](),

    dataOuts = ISZ[art.UPort](currentTemp),

    eventIns = ISZ[art.UPort](),

    eventOuts = ISZ[art.UPort](tempChanged)
  )

  val initialization_api : TempSensor_s_Initialization_Api = {
    val api = TempSensor_s_Initialization_Api(
      id,
      currentTemp.id,
      tempChanged.id
    )
    TempSensor_s_tcproc_tempSensor_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : TempSensor_s_Operational_Api = {
    val api = TempSensor_s_Operational_Api(
      id,
      currentTemp.id,
      tempChanged.id
    )
    TempSensor_s_tcproc_tempSensor_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    TempSensor_s_tcproc_tempSensor_Bridge.EntryPoints(
      id,

      currentTemp.id,
      tempChanged.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object TempSensor_s_tcproc_tempSensor_Bridge {

  var c_initialization_api: Option[TempSensor_s_Initialization_Api] = None()
  var c_operational_api: Option[TempSensor_s_Operational_Api] = None()

  @datatype class EntryPoints(
    TempSensor_s_tcproc_tempSensor_BridgeId : Art.BridgeId,
    currentTemp_Id : Art.PortId,
    tempChanged_Id : Art.PortId,
    dispatchTriggers : Option[ISZ[Art.PortId]],
    initialization_api: TempSensor_s_Initialization_Api,
    operational_api: TempSensor_s_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = IS()

    val eventInPortIds: ISZ[Art.PortId] = IS()

    val dataOutPortIds: ISZ[Art.PortId] = IS(currentTemp_Id)

    val eventOutPortIds: ISZ[Art.PortId] = IS(tempChanged_Id)

    def initialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: TempSensor_s_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: TempSensor_s_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: TempSensor_s_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: TempSensor_s_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: TempSensor_s_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: TempSensor_s_Operational_Api): Unit = {}
      component.recover(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: TempSensor_s_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: TempSensor_s_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}