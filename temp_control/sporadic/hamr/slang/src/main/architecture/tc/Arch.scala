// #Sireum

package tc

import org.sireum._
import art._
import art.PortMode._
import art.DispatchPropertyProtocol._
import art.Art.BridgeId._
import art.Art.PortId._

// This file was auto-generated.  Do not edit

object Arch {
  val TempControlSoftwareSystem_s_Instance_tcproc_tempSensor : tc.TempSensor.TempSensor_s_tcproc_tempSensor_Bridge = {
    val currentTemp = Port[TempSensor.Temperature_i] (id = portId"0", name = "TempControlSoftwareSystem_s_Instance_tcproc_tempSensor_currentTemp", mode = DataOut)
    val tempChanged = Port[art.Empty] (id = portId"1", name = "TempControlSoftwareSystem_s_Instance_tcproc_tempSensor_tempChanged", mode = EventOut)

    tc.TempSensor.TempSensor_s_tcproc_tempSensor_Bridge(
      id = bridgeId"0",
      name = "TempControlSoftwareSystem_s_Instance_tcproc_tempSensor",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      currentTemp = currentTemp,
      tempChanged = tempChanged
    )
  }
  val TempControlSoftwareSystem_s_Instance_tcproc_fan : tc.CoolingFan.Fan_s_tcproc_fan_Bridge = {
    val fanCmd = Port[CoolingFan.FanCmd.Type] (id = portId"2", name = "TempControlSoftwareSystem_s_Instance_tcproc_fan_fanCmd", mode = EventIn)
    val fanAck = Port[CoolingFan.FanAck.Type] (id = portId"3", name = "TempControlSoftwareSystem_s_Instance_tcproc_fan_fanAck", mode = EventOut)

    tc.CoolingFan.Fan_s_tcproc_fan_Bridge(
      id = bridgeId"1",
      name = "TempControlSoftwareSystem_s_Instance_tcproc_fan",
      dispatchProtocol = Sporadic(min = 1000),
      dispatchTriggers = None(),

      fanCmd = fanCmd,
      fanAck = fanAck
    )
  }
  val TempControlSoftwareSystem_s_Instance_tcproc_tempControl : tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_Bridge = {
    val currentTemp = Port[TempSensor.Temperature_i] (id = portId"4", name = "TempControlSoftwareSystem_s_Instance_tcproc_tempControl_currentTemp", mode = DataIn)
    val fanAck = Port[CoolingFan.FanAck.Type] (id = portId"5", name = "TempControlSoftwareSystem_s_Instance_tcproc_tempControl_fanAck", mode = EventIn)
    val setPoint = Port[TempControlSoftwareSystem.SetPoint_i] (id = portId"6", name = "TempControlSoftwareSystem_s_Instance_tcproc_tempControl_setPoint", mode = EventIn)
    val fanCmd = Port[CoolingFan.FanCmd.Type] (id = portId"7", name = "TempControlSoftwareSystem_s_Instance_tcproc_tempControl_fanCmd", mode = EventOut)
    val tempChanged = Port[art.Empty] (id = portId"8", name = "TempControlSoftwareSystem_s_Instance_tcproc_tempControl_tempChanged", mode = EventIn)

    tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_Bridge(
      id = bridgeId"2",
      name = "TempControlSoftwareSystem_s_Instance_tcproc_tempControl",
      dispatchProtocol = Sporadic(min = 1000),
      dispatchTriggers = None(),

      currentTemp = currentTemp,
      fanAck = fanAck,
      setPoint = setPoint,
      fanCmd = fanCmd,
      tempChanged = tempChanged
    )
  }
  val TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface : tc.TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_Bridge = {
    val currentTemp = Port[TempSensor.Temperature_i] (id = portId"9", name = "TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_currentTemp", mode = DataIn)
    val setPoint = Port[TempControlSoftwareSystem.SetPoint_i] (id = portId"10", name = "TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_setPoint", mode = EventOut)
    val tempChanged = Port[art.Empty] (id = portId"11", name = "TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface_tempChanged", mode = EventIn)

    tc.TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_Bridge(
      id = bridgeId"3",
      name = "TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      currentTemp = currentTemp,
      setPoint = setPoint,
      tempChanged = tempChanged
    )
  }

  val ad : ArchitectureDescription = {

    ArchitectureDescription(
      components = IS[Art.BridgeId, Bridge] (TempControlSoftwareSystem_s_Instance_tcproc_tempSensor, TempControlSoftwareSystem_s_Instance_tcproc_fan, TempControlSoftwareSystem_s_Instance_tcproc_tempControl, TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface),

      connections = IS[Art.ConnectionId, UConnection] (Connection(from = TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.currentTemp, to = TempControlSoftwareSystem_s_Instance_tcproc_tempControl.currentTemp),
                                                       Connection(from = TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.currentTemp, to = TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.currentTemp),
                                                       Connection(from = TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.tempChanged, to = TempControlSoftwareSystem_s_Instance_tcproc_tempControl.tempChanged),
                                                       Connection(from = TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.tempChanged, to = TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.tempChanged),
                                                       Connection(from = TempControlSoftwareSystem_s_Instance_tcproc_fan.fanAck, to = TempControlSoftwareSystem_s_Instance_tcproc_tempControl.fanAck),
                                                       Connection(from = TempControlSoftwareSystem_s_Instance_tcproc_tempControl.fanCmd, to = TempControlSoftwareSystem_s_Instance_tcproc_fan.fanCmd),
                                                       Connection(from = TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.setPoint, to = TempControlSoftwareSystem_s_Instance_tcproc_tempControl.setPoint))
    )
  }
}
