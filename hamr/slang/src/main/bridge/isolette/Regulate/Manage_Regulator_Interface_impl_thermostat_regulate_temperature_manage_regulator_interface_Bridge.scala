// #Sireum

package isolette.Regulate

import org.sireum._
import art._
import isolette._
import isolette.Regulate.{Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface => component}

// This file was auto-generated.  Do not edit

@datatype class Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  upper_desired_tempWstatus: Port[Isolette_Data_Model.TempWstatus_impl],
  lower_desired_tempWstatus: Port[Isolette_Data_Model.TempWstatus_impl],
  current_tempWstatus: Port[Isolette_Data_Model.TempWstatus_impl],
  regulator_mode: Port[Isolette_Data_Model.Regulator_Mode.Type],
  upper_desired_temp: Port[Isolette_Data_Model.Temp_impl],
  lower_desired_temp: Port[Isolette_Data_Model.Temp_impl],
  displayed_temp: Port[Isolette_Data_Model.Temp_impl],
  regulator_status: Port[Isolette_Data_Model.Status.Type],
  interface_failure: Port[Isolette_Data_Model.Failure_Flag_impl]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    all = ISZ(upper_desired_tempWstatus,
              lower_desired_tempWstatus,
              current_tempWstatus,
              regulator_mode,
              upper_desired_temp,
              lower_desired_temp,
              displayed_temp,
              regulator_status,
              interface_failure),

    dataIns = ISZ(upper_desired_tempWstatus,
                  lower_desired_tempWstatus,
                  current_tempWstatus,
                  regulator_mode),

    dataOuts = ISZ(upper_desired_temp,
                   lower_desired_temp,
                   displayed_temp,
                   regulator_status,
                   interface_failure),

    eventIns = ISZ(),

    eventOuts = ISZ()
  )

  val initialization_api : Manage_Regulator_Interface_impl_Initialization_Api = {
    val api = Manage_Regulator_Interface_impl_Initialization_Api(
      id,
      upper_desired_tempWstatus.id,
      lower_desired_tempWstatus.id,
      current_tempWstatus.id,
      regulator_mode.id,
      upper_desired_temp.id,
      lower_desired_temp.id,
      displayed_temp.id,
      regulator_status.id,
      interface_failure.id
    )
    Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : Manage_Regulator_Interface_impl_Operational_Api = {
    val api = Manage_Regulator_Interface_impl_Operational_Api(
      id,
      upper_desired_tempWstatus.id,
      lower_desired_tempWstatus.id,
      current_tempWstatus.id,
      regulator_mode.id,
      upper_desired_temp.id,
      lower_desired_temp.id,
      displayed_temp.id,
      regulator_status.id,
      interface_failure.id
    )
    Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge.EntryPoints(
      id,

      upper_desired_tempWstatus.id,
      lower_desired_tempWstatus.id,
      current_tempWstatus.id,
      regulator_mode.id,
      upper_desired_temp.id,
      lower_desired_temp.id,
      displayed_temp.id,
      regulator_status.id,
      interface_failure.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge {

  var c_initialization_api: Option[Manage_Regulator_Interface_impl_Initialization_Api] = None()
  var c_operational_api: Option[Manage_Regulator_Interface_impl_Operational_Api] = None()

  @datatype class EntryPoints(
    Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_BridgeId : Art.BridgeId,

    upper_desired_tempWstatus_Id : Art.PortId,
    lower_desired_tempWstatus_Id : Art.PortId,
    current_tempWstatus_Id : Art.PortId,
    regulator_mode_Id : Art.PortId,
    upper_desired_temp_Id : Art.PortId,
    lower_desired_temp_Id : Art.PortId,
    displayed_temp_Id : Art.PortId,
    regulator_status_Id : Art.PortId,
    interface_failure_Id : Art.PortId,

    dispatchTriggers : Option[ISZ[Art.PortId]],

    initialization_api: Manage_Regulator_Interface_impl_Initialization_Api,
    operational_api: Manage_Regulator_Interface_impl_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = ISZ(upper_desired_tempWstatus_Id,
                                             lower_desired_tempWstatus_Id,
                                             current_tempWstatus_Id,
                                             regulator_mode_Id)

    val eventInPortIds: ISZ[Art.PortId] = ISZ()

    val dataOutPortIds: ISZ[Art.PortId] = ISZ(upper_desired_temp_Id,
                                              lower_desired_temp_Id,
                                              displayed_temp_Id,
                                              regulator_status_Id,
                                              interface_failure_Id)

    val eventOutPortIds: ISZ[Art.PortId] = ISZ()

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testInitialise(): Unit = {
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def initialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: Manage_Regulator_Interface_impl_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: Manage_Regulator_Interface_impl_Operational_Api): Unit = {}
      component.recover(operational_api)
    }
  }
}