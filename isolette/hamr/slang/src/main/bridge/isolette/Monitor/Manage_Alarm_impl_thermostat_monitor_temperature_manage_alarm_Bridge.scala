// #Sireum

package isolette.Monitor

import org.sireum._
import art._
import isolette._
import isolette.Monitor.{Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm => component}

// This file was auto-generated.  Do not edit

@datatype class Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[IS[Art.PortId, Art.PortId]],

  current_tempWstatus: Port[Isolette_Data_Model.TempWstatus_impl],
  lower_alarm_temp: Port[Isolette_Data_Model.Temp_impl],
  upper_alarm_temp: Port[Isolette_Data_Model.Temp_impl],
  monitor_mode: Port[Isolette_Data_Model.Monitor_Mode.Type],
  alarm_control: Port[Isolette_Data_Model.On_Off.Type]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    all = IS[Art.PortId, art.UPort](current_tempWstatus,
                                    lower_alarm_temp,
                                    upper_alarm_temp,
                                    monitor_mode,
                                    alarm_control),

    dataIns = IS[Art.PortId, art.UPort](current_tempWstatus,
                                        lower_alarm_temp,
                                        upper_alarm_temp,
                                        monitor_mode),

    dataOuts = IS[Art.PortId, art.UPort](alarm_control),

    eventIns = IS[Art.PortId, art.UPort](),

    eventOuts = IS[Art.PortId, art.UPort]()
  )

  val initialization_api : Manage_Alarm_impl_Initialization_Api = {
    val api = Manage_Alarm_impl_Initialization_Api(
      id,
      current_tempWstatus.id,
      lower_alarm_temp.id,
      upper_alarm_temp.id,
      monitor_mode.id,
      alarm_control.id
    )
    Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : Manage_Alarm_impl_Operational_Api = {
    val api = Manage_Alarm_impl_Operational_Api(
      id,
      current_tempWstatus.id,
      lower_alarm_temp.id,
      upper_alarm_temp.id,
      monitor_mode.id,
      alarm_control.id
    )
    Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge.EntryPoints(
      id,

      current_tempWstatus.id,
      lower_alarm_temp.id,
      upper_alarm_temp.id,
      monitor_mode.id,
      alarm_control.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Bridge {

  var c_initialization_api: Option[Manage_Alarm_impl_Initialization_Api] = None()
  var c_operational_api: Option[Manage_Alarm_impl_Operational_Api] = None()

  @datatype class EntryPoints(
    Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_BridgeId : Art.BridgeId,
    current_tempWstatus_Id : Art.PortId,
    lower_alarm_temp_Id : Art.PortId,
    upper_alarm_temp_Id : Art.PortId,
    monitor_mode_Id : Art.PortId,
    alarm_control_Id : Art.PortId,
    dispatchTriggers : Option[IS[Art.PortId, Art.PortId]],
    initialization_api: Manage_Alarm_impl_Initialization_Api,
    operational_api: Manage_Alarm_impl_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: IS[Art.PortId, Art.PortId] = IS(current_tempWstatus_Id,
                                                       lower_alarm_temp_Id,
                                                       upper_alarm_temp_Id,
                                                       monitor_mode_Id)

    val eventInPortIds: IS[Art.PortId, Art.PortId] = IS()

    val dataOutPortIds: IS[Art.PortId, Art.PortId] = IS(alarm_control_Id)

    val eventOutPortIds: IS[Art.PortId, Art.PortId] = IS()

    def initialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Manage_Alarm_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Manage_Alarm_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: Manage_Alarm_impl_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: Manage_Alarm_impl_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: Manage_Alarm_impl_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: Manage_Alarm_impl_Operational_Api): Unit = {}
      component.recover(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Manage_Alarm_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Manage_Alarm_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}