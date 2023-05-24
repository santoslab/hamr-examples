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
  val TempControlSoftwareSystem_p_Instance_tcproc_tempSensor : tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_Bridge = {
    val currentTemp = Port[TempSensor.Temperature_i] (id = portId"0", name = "TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_currentTemp", mode = DataOut)

    tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_Bridge(
      id = bridgeId"0",
      name = "TempControlSoftwareSystem_p_Instance_tcproc_tempSensor",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      currentTemp = currentTemp
    )
  }
  val TempControlSoftwareSystem_p_Instance_tcproc_fan : tc.CoolingFan.FanPeriodic_p_tcproc_fan_Bridge = {
    val fanCmd = Port[CoolingFan.FanCmd.Type] (id = portId"1", name = "TempControlSoftwareSystem_p_Instance_tcproc_fan_fanCmd", mode = DataIn)
    val fanAck = Port[CoolingFan.FanAck.Type] (id = portId"2", name = "TempControlSoftwareSystem_p_Instance_tcproc_fan_fanAck", mode = DataOut)

    tc.CoolingFan.FanPeriodic_p_tcproc_fan_Bridge(
      id = bridgeId"1",
      name = "TempControlSoftwareSystem_p_Instance_tcproc_fan",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      fanCmd = fanCmd,
      fanAck = fanAck
    )
  }
  val TempControlSoftwareSystem_p_Instance_tcproc_tempControl : tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_Bridge = {
    val currentTemp = Port[TempSensor.Temperature_i] (id = portId"3", name = "TempControlSoftwareSystem_p_Instance_tcproc_tempControl_currentTemp", mode = DataIn)
    val fanAck = Port[CoolingFan.FanAck.Type] (id = portId"4", name = "TempControlSoftwareSystem_p_Instance_tcproc_tempControl_fanAck", mode = DataIn)
    val setPoint = Port[TempControlSoftwareSystem.SetPoint_i] (id = portId"5", name = "TempControlSoftwareSystem_p_Instance_tcproc_tempControl_setPoint", mode = DataIn)
    val fanCmd = Port[CoolingFan.FanCmd.Type] (id = portId"6", name = "TempControlSoftwareSystem_p_Instance_tcproc_tempControl_fanCmd", mode = DataOut)

    tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_Bridge(
      id = bridgeId"2",
      name = "TempControlSoftwareSystem_p_Instance_tcproc_tempControl",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      currentTemp = currentTemp,
      fanAck = fanAck,
      setPoint = setPoint,
      fanCmd = fanCmd
    )
  }
  val TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface : tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_Bridge = {
    val currentTemp = Port[TempSensor.Temperature_i] (id = portId"7", name = "TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_currentTemp", mode = DataIn)
    val setPoint = Port[TempControlSoftwareSystem.SetPoint_i] (id = portId"8", name = "TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_setPoint", mode = DataOut)

    tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_Bridge(
      id = bridgeId"3",
      name = "TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      currentTemp = currentTemp,
      setPoint = setPoint
    )
  }

  val ad : ArchitectureDescription = {

    ArchitectureDescription(
      components = IS[Art.BridgeId, Bridge] (TempControlSoftwareSystem_p_Instance_tcproc_tempSensor, TempControlSoftwareSystem_p_Instance_tcproc_fan, TempControlSoftwareSystem_p_Instance_tcproc_tempControl, TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface),

      connections = IS[Art.ConnectionId, UConnection] (Connection(from = TempControlSoftwareSystem_p_Instance_tcproc_tempSensor.currentTemp, to = TempControlSoftwareSystem_p_Instance_tcproc_tempControl.currentTemp),
                                                       Connection(from = TempControlSoftwareSystem_p_Instance_tcproc_tempSensor.currentTemp, to = TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.currentTemp),
                                                       Connection(from = TempControlSoftwareSystem_p_Instance_tcproc_fan.fanAck, to = TempControlSoftwareSystem_p_Instance_tcproc_tempControl.fanAck),
                                                       Connection(from = TempControlSoftwareSystem_p_Instance_tcproc_tempControl.fanCmd, to = TempControlSoftwareSystem_p_Instance_tcproc_fan.fanCmd),
                                                       Connection(from = TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.setPoint, to = TempControlSoftwareSystem_p_Instance_tcproc_tempControl.setPoint))
    )
  }
}
