// #Sireum
package tc.runtimemonitor

import org.sireum._
import tc._

object ModelInfo {
  val TempSensor_s_tcproc_tempSensor_MI : Component =
    Component(
      name = "TempSensor_s_tcproc_tempSensor",
      id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.id.toZ,
      dispatchProtocol = iDispatchProtocol.Periodic,
      state = ISZ(
        Port(
          name = "currentTemp",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.currentTemp.id.toZ,
          kind = PortKind.Data,
          direction = StateDirection.Out,
          slangType = ""),
        Port(
          name = "tempChanged",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.tempChanged.id.toZ,
          kind = PortKind.Event,
          direction = StateDirection.Out,
          slangType = "")))

  val Fan_s_tcproc_fan_MI : Component =
    Component(
      name = "Fan_s_tcproc_fan",
      id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.id.toZ,
      dispatchProtocol = iDispatchProtocol.Sporadic,
      state = ISZ(
        Port(
          name = "fanCmd",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.fanCmd.id.toZ,
          kind = PortKind.EventData,
          direction = StateDirection.In,
          slangType = ""),
        Port(
          name = "fanAck",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.fanAck.id.toZ,
          kind = PortKind.EventData,
          direction = StateDirection.Out,
          slangType = "")))

  val TempControl_s_tcproc_tempControl_MI : Component =
    Component(
      name = "TempControl_s_tcproc_tempControl",
      id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.id.toZ,
      dispatchProtocol = iDispatchProtocol.Sporadic,
      state = ISZ(
        StateVariable(
          name = "currentSetPoint",
          direction = StateDirection.Out,
          slangType = "TempControlSoftwareSystem.SetPoint_i"),
        StateVariable(
          name = "currentFanState",
          direction = StateDirection.Out,
          slangType = "CoolingFan.FanCmd.Type"),
        StateVariable(
          name = "latestTemp",
          direction = StateDirection.Out,
          slangType = "TempSensor.Temperature_i"),
        Port(
          name = "currentTemp",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.currentTemp.id.toZ,
          kind = PortKind.Data,
          direction = StateDirection.In,
          slangType = ""),
        Port(
          name = "fanAck",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.fanAck.id.toZ,
          kind = PortKind.EventData,
          direction = StateDirection.In,
          slangType = ""),
        Port(
          name = "setPoint",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.setPoint.id.toZ,
          kind = PortKind.EventData,
          direction = StateDirection.In,
          slangType = ""),
        Port(
          name = "fanCmd",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.fanCmd.id.toZ,
          kind = PortKind.EventData,
          direction = StateDirection.Out,
          slangType = ""),
        Port(
          name = "tempChanged",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.tempChanged.id.toZ,
          kind = PortKind.Event,
          direction = StateDirection.In,
          slangType = "")))

  val OperatorInterface_s_tcproc_operatorInterface_MI : Component =
    Component(
      name = "OperatorInterface_s_tcproc_operatorInterface",
      id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.id.toZ,
      dispatchProtocol = iDispatchProtocol.Periodic,
      state = ISZ(
        Port(
          name = "currentTemp",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.currentTemp.id.toZ,
          kind = PortKind.Data,
          direction = StateDirection.In,
          slangType = ""),
        Port(
          name = "setPoint",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.setPoint.id.toZ,
          kind = PortKind.EventData,
          direction = StateDirection.Out,
          slangType = ""),
        Port(
          name = "tempChanged",
          id = Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.tempChanged.id.toZ,
          kind = PortKind.Event,
          direction = StateDirection.In,
          slangType = "")))

  val modelInfo: ModelInfo =
    ModelInfo(ISZ(
     TempSensor_s_tcproc_tempSensor_MI,
     Fan_s_tcproc_fan_MI,
     TempControl_s_tcproc_tempControl_MI,
     OperatorInterface_s_tcproc_operatorInterface_MI))
}

@datatype class ModelInfo(val components: ISZ[Component])

@datatype class Component(val name: String,
                          val id: Z,
                          val dispatchProtocol: iDispatchProtocol.Type,
                          val state: ISZ[StateElement])

@enum object iDispatchProtocol {
  "Sporadic"
  "Periodic"
}

@enum object StateDirection {
  "In"
  "Out"
}

@sig trait StateElement {
  def name: String

  def slangType: String

  def direction: StateDirection.Type
}

@enum object PortKind {
  "Data"
  "Event"
  "EventData"
}

@datatype class Port(val name: String,
                     val id: Z,
                     val kind: PortKind.Type,
                     val direction: StateDirection.Type,
                     val slangType: String) extends StateElement

@datatype class StateVariable(val name: String,
                              val direction: StateDirection.Type,
                              val slangType: String) extends StateElement
