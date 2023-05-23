// #Sireum

// This file was auto-generated.  Do not edit

package RTS.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread

import org.sireum._
import art._
import art.Art.BridgeId._
import art.Art.PortId._
import art.DispatchPropertyProtocol._
import art.PortMode._
import RTS._
import RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix

object instrumentationMockThread extends App {

  val instrumentationMockThreadBridge : RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge = {
    val unit1_temperatureLogic_channel1 = Port[Base_Types.Boolean] (id = portId"0", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_temperatureLogic_channel1", mode = DataOut)
    val unit1_temperatureLogic_channel2 = Port[Base_Types.Boolean] (id = portId"1", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_temperatureLogic_channel2", mode = DataOut)
    val unit1_temperatureLogic_channel3 = Port[Base_Types.Boolean] (id = portId"2", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_temperatureLogic_channel3", mode = DataOut)
    val unit1_temperatureLogic_channel4 = Port[Base_Types.Boolean] (id = portId"3", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_temperatureLogic_channel4", mode = DataOut)
    val unit1_pressureLogic_channel1 = Port[Base_Types.Boolean] (id = portId"4", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_pressureLogic_channel1", mode = DataOut)
    val unit1_pressureLogic_channel2 = Port[Base_Types.Boolean] (id = portId"5", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_pressureLogic_channel2", mode = DataOut)
    val unit1_pressureLogic_channel3 = Port[Base_Types.Boolean] (id = portId"6", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_pressureLogic_channel3", mode = DataOut)
    val unit1_pressureLogic_channel4 = Port[Base_Types.Boolean] (id = portId"7", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_pressureLogic_channel4", mode = DataOut)
    val unit1_saturationLogic_channel1 = Port[Base_Types.Boolean] (id = portId"8", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_saturationLogic_channel1", mode = DataOut)
    val unit1_saturationLogic_channel2 = Port[Base_Types.Boolean] (id = portId"9", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_saturationLogic_channel2", mode = DataOut)
    val unit1_saturationLogic_channel3 = Port[Base_Types.Boolean] (id = portId"10", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_saturationLogic_channel3", mode = DataOut)
    val unit1_saturationLogic_channel4 = Port[Base_Types.Boolean] (id = portId"11", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit1_saturationLogic_channel4", mode = DataOut)
    val unit2_temperatureLogic_channel1 = Port[Base_Types.Boolean] (id = portId"12", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_temperatureLogic_channel1", mode = DataOut)
    val unit2_temperatureLogic_channel2 = Port[Base_Types.Boolean] (id = portId"13", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_temperatureLogic_channel2", mode = DataOut)
    val unit2_temperatureLogic_channel3 = Port[Base_Types.Boolean] (id = portId"14", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_temperatureLogic_channel3", mode = DataOut)
    val unit2_temperatureLogic_channel4 = Port[Base_Types.Boolean] (id = portId"15", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_temperatureLogic_channel4", mode = DataOut)
    val unit2_pressureLogic_channel1 = Port[Base_Types.Boolean] (id = portId"16", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_pressureLogic_channel1", mode = DataOut)
    val unit2_pressureLogic_channel2 = Port[Base_Types.Boolean] (id = portId"17", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_pressureLogic_channel2", mode = DataOut)
    val unit2_pressureLogic_channel3 = Port[Base_Types.Boolean] (id = portId"18", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_pressureLogic_channel3", mode = DataOut)
    val unit2_pressureLogic_channel4 = Port[Base_Types.Boolean] (id = portId"19", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_pressureLogic_channel4", mode = DataOut)
    val unit2_saturationLogic_channel1 = Port[Base_Types.Boolean] (id = portId"20", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_saturationLogic_channel1", mode = DataOut)
    val unit2_saturationLogic_channel2 = Port[Base_Types.Boolean] (id = portId"21", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_saturationLogic_channel2", mode = DataOut)
    val unit2_saturationLogic_channel3 = Port[Base_Types.Boolean] (id = portId"22", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_saturationLogic_channel3", mode = DataOut)
    val unit2_saturationLogic_channel4 = Port[Base_Types.Boolean] (id = portId"23", name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread_unit2_saturationLogic_channel4", mode = DataOut)

    RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge(
      id = bridgeId"0",
      name = "RTS_i_Instance_instrumentationMock_instrumentationMockThread",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      unit1_temperatureLogic_channel1 = unit1_temperatureLogic_channel1,
      unit1_temperatureLogic_channel2 = unit1_temperatureLogic_channel2,
      unit1_temperatureLogic_channel3 = unit1_temperatureLogic_channel3,
      unit1_temperatureLogic_channel4 = unit1_temperatureLogic_channel4,
      unit1_pressureLogic_channel1 = unit1_pressureLogic_channel1,
      unit1_pressureLogic_channel2 = unit1_pressureLogic_channel2,
      unit1_pressureLogic_channel3 = unit1_pressureLogic_channel3,
      unit1_pressureLogic_channel4 = unit1_pressureLogic_channel4,
      unit1_saturationLogic_channel1 = unit1_saturationLogic_channel1,
      unit1_saturationLogic_channel2 = unit1_saturationLogic_channel2,
      unit1_saturationLogic_channel3 = unit1_saturationLogic_channel3,
      unit1_saturationLogic_channel4 = unit1_saturationLogic_channel4,
      unit2_temperatureLogic_channel1 = unit2_temperatureLogic_channel1,
      unit2_temperatureLogic_channel2 = unit2_temperatureLogic_channel2,
      unit2_temperatureLogic_channel3 = unit2_temperatureLogic_channel3,
      unit2_temperatureLogic_channel4 = unit2_temperatureLogic_channel4,
      unit2_pressureLogic_channel1 = unit2_pressureLogic_channel1,
      unit2_pressureLogic_channel2 = unit2_pressureLogic_channel2,
      unit2_pressureLogic_channel3 = unit2_pressureLogic_channel3,
      unit2_pressureLogic_channel4 = unit2_pressureLogic_channel4,
      unit2_saturationLogic_channel1 = unit2_saturationLogic_channel1,
      unit2_saturationLogic_channel2 = unit2_saturationLogic_channel2,
      unit2_saturationLogic_channel3 = unit2_saturationLogic_channel3,
      unit2_saturationLogic_channel4 = unit2_saturationLogic_channel4
    )
  }

  val entryPoints: Bridge.EntryPoints = instrumentationMockThreadBridge.entryPoints
  val noData: Option[DataContent] = None()

  // unit1_temperatureLogic_channel1: Out DataPort Base_Types.Boolean
  val unit1_temperatureLogic_channel1_id: Art.PortId = instrumentationMockThreadBridge.unit1_temperatureLogic_channel1.id
  var unit1_temperatureLogic_channel1_port: Option[DataContent] = noData

  // unit1_temperatureLogic_channel2: Out DataPort Base_Types.Boolean
  val unit1_temperatureLogic_channel2_id: Art.PortId = instrumentationMockThreadBridge.unit1_temperatureLogic_channel2.id
  var unit1_temperatureLogic_channel2_port: Option[DataContent] = noData

  // unit1_temperatureLogic_channel3: Out DataPort Base_Types.Boolean
  val unit1_temperatureLogic_channel3_id: Art.PortId = instrumentationMockThreadBridge.unit1_temperatureLogic_channel3.id
  var unit1_temperatureLogic_channel3_port: Option[DataContent] = noData

  // unit1_temperatureLogic_channel4: Out DataPort Base_Types.Boolean
  val unit1_temperatureLogic_channel4_id: Art.PortId = instrumentationMockThreadBridge.unit1_temperatureLogic_channel4.id
  var unit1_temperatureLogic_channel4_port: Option[DataContent] = noData

  // unit1_pressureLogic_channel1: Out DataPort Base_Types.Boolean
  val unit1_pressureLogic_channel1_id: Art.PortId = instrumentationMockThreadBridge.unit1_pressureLogic_channel1.id
  var unit1_pressureLogic_channel1_port: Option[DataContent] = noData

  // unit1_pressureLogic_channel2: Out DataPort Base_Types.Boolean
  val unit1_pressureLogic_channel2_id: Art.PortId = instrumentationMockThreadBridge.unit1_pressureLogic_channel2.id
  var unit1_pressureLogic_channel2_port: Option[DataContent] = noData

  // unit1_pressureLogic_channel3: Out DataPort Base_Types.Boolean
  val unit1_pressureLogic_channel3_id: Art.PortId = instrumentationMockThreadBridge.unit1_pressureLogic_channel3.id
  var unit1_pressureLogic_channel3_port: Option[DataContent] = noData

  // unit1_pressureLogic_channel4: Out DataPort Base_Types.Boolean
  val unit1_pressureLogic_channel4_id: Art.PortId = instrumentationMockThreadBridge.unit1_pressureLogic_channel4.id
  var unit1_pressureLogic_channel4_port: Option[DataContent] = noData

  // unit1_saturationLogic_channel1: Out DataPort Base_Types.Boolean
  val unit1_saturationLogic_channel1_id: Art.PortId = instrumentationMockThreadBridge.unit1_saturationLogic_channel1.id
  var unit1_saturationLogic_channel1_port: Option[DataContent] = noData

  // unit1_saturationLogic_channel2: Out DataPort Base_Types.Boolean
  val unit1_saturationLogic_channel2_id: Art.PortId = instrumentationMockThreadBridge.unit1_saturationLogic_channel2.id
  var unit1_saturationLogic_channel2_port: Option[DataContent] = noData

  // unit1_saturationLogic_channel3: Out DataPort Base_Types.Boolean
  val unit1_saturationLogic_channel3_id: Art.PortId = instrumentationMockThreadBridge.unit1_saturationLogic_channel3.id
  var unit1_saturationLogic_channel3_port: Option[DataContent] = noData

  // unit1_saturationLogic_channel4: Out DataPort Base_Types.Boolean
  val unit1_saturationLogic_channel4_id: Art.PortId = instrumentationMockThreadBridge.unit1_saturationLogic_channel4.id
  var unit1_saturationLogic_channel4_port: Option[DataContent] = noData

  // unit2_temperatureLogic_channel1: Out DataPort Base_Types.Boolean
  val unit2_temperatureLogic_channel1_id: Art.PortId = instrumentationMockThreadBridge.unit2_temperatureLogic_channel1.id
  var unit2_temperatureLogic_channel1_port: Option[DataContent] = noData

  // unit2_temperatureLogic_channel2: Out DataPort Base_Types.Boolean
  val unit2_temperatureLogic_channel2_id: Art.PortId = instrumentationMockThreadBridge.unit2_temperatureLogic_channel2.id
  var unit2_temperatureLogic_channel2_port: Option[DataContent] = noData

  // unit2_temperatureLogic_channel3: Out DataPort Base_Types.Boolean
  val unit2_temperatureLogic_channel3_id: Art.PortId = instrumentationMockThreadBridge.unit2_temperatureLogic_channel3.id
  var unit2_temperatureLogic_channel3_port: Option[DataContent] = noData

  // unit2_temperatureLogic_channel4: Out DataPort Base_Types.Boolean
  val unit2_temperatureLogic_channel4_id: Art.PortId = instrumentationMockThreadBridge.unit2_temperatureLogic_channel4.id
  var unit2_temperatureLogic_channel4_port: Option[DataContent] = noData

  // unit2_pressureLogic_channel1: Out DataPort Base_Types.Boolean
  val unit2_pressureLogic_channel1_id: Art.PortId = instrumentationMockThreadBridge.unit2_pressureLogic_channel1.id
  var unit2_pressureLogic_channel1_port: Option[DataContent] = noData

  // unit2_pressureLogic_channel2: Out DataPort Base_Types.Boolean
  val unit2_pressureLogic_channel2_id: Art.PortId = instrumentationMockThreadBridge.unit2_pressureLogic_channel2.id
  var unit2_pressureLogic_channel2_port: Option[DataContent] = noData

  // unit2_pressureLogic_channel3: Out DataPort Base_Types.Boolean
  val unit2_pressureLogic_channel3_id: Art.PortId = instrumentationMockThreadBridge.unit2_pressureLogic_channel3.id
  var unit2_pressureLogic_channel3_port: Option[DataContent] = noData

  // unit2_pressureLogic_channel4: Out DataPort Base_Types.Boolean
  val unit2_pressureLogic_channel4_id: Art.PortId = instrumentationMockThreadBridge.unit2_pressureLogic_channel4.id
  var unit2_pressureLogic_channel4_port: Option[DataContent] = noData

  // unit2_saturationLogic_channel1: Out DataPort Base_Types.Boolean
  val unit2_saturationLogic_channel1_id: Art.PortId = instrumentationMockThreadBridge.unit2_saturationLogic_channel1.id
  var unit2_saturationLogic_channel1_port: Option[DataContent] = noData

  // unit2_saturationLogic_channel2: Out DataPort Base_Types.Boolean
  val unit2_saturationLogic_channel2_id: Art.PortId = instrumentationMockThreadBridge.unit2_saturationLogic_channel2.id
  var unit2_saturationLogic_channel2_port: Option[DataContent] = noData

  // unit2_saturationLogic_channel3: Out DataPort Base_Types.Boolean
  val unit2_saturationLogic_channel3_id: Art.PortId = instrumentationMockThreadBridge.unit2_saturationLogic_channel3.id
  var unit2_saturationLogic_channel3_port: Option[DataContent] = noData

  // unit2_saturationLogic_channel4: Out DataPort Base_Types.Boolean
  val unit2_saturationLogic_channel4_id: Art.PortId = instrumentationMockThreadBridge.unit2_saturationLogic_channel4.id
  var unit2_saturationLogic_channel4_port: Option[DataContent] = noData

  def dispatchStatus(bridgeId: Art.BridgeId): DispatchStatus = {
    return TimeTriggered()
  }

  def getValue(portId: Art.PortId): Option[DataContent] = {
    halt(s"Unexpected: instrumentationMockThread.getValue called with: ${portId}")
  }

  def receiveInput(eventPortIds: ISZ[Art.PortId], dataPortIds: ISZ[Art.PortId]): Unit = {
    // ignore params


  }

  def putValue(portId: Art.PortId, data: DataContent): Unit = {
    if(portId == unit1_temperatureLogic_channel1_id) {
      unit1_temperatureLogic_channel1_port = Some(data)
    } else if(portId == unit1_temperatureLogic_channel2_id) {
      unit1_temperatureLogic_channel2_port = Some(data)
    } else if(portId == unit1_temperatureLogic_channel3_id) {
      unit1_temperatureLogic_channel3_port = Some(data)
    } else if(portId == unit1_temperatureLogic_channel4_id) {
      unit1_temperatureLogic_channel4_port = Some(data)
    } else if(portId == unit1_pressureLogic_channel1_id) {
      unit1_pressureLogic_channel1_port = Some(data)
    } else if(portId == unit1_pressureLogic_channel2_id) {
      unit1_pressureLogic_channel2_port = Some(data)
    } else if(portId == unit1_pressureLogic_channel3_id) {
      unit1_pressureLogic_channel3_port = Some(data)
    } else if(portId == unit1_pressureLogic_channel4_id) {
      unit1_pressureLogic_channel4_port = Some(data)
    } else if(portId == unit1_saturationLogic_channel1_id) {
      unit1_saturationLogic_channel1_port = Some(data)
    } else if(portId == unit1_saturationLogic_channel2_id) {
      unit1_saturationLogic_channel2_port = Some(data)
    } else if(portId == unit1_saturationLogic_channel3_id) {
      unit1_saturationLogic_channel3_port = Some(data)
    } else if(portId == unit1_saturationLogic_channel4_id) {
      unit1_saturationLogic_channel4_port = Some(data)
    } else if(portId == unit2_temperatureLogic_channel1_id) {
      unit2_temperatureLogic_channel1_port = Some(data)
    } else if(portId == unit2_temperatureLogic_channel2_id) {
      unit2_temperatureLogic_channel2_port = Some(data)
    } else if(portId == unit2_temperatureLogic_channel3_id) {
      unit2_temperatureLogic_channel3_port = Some(data)
    } else if(portId == unit2_temperatureLogic_channel4_id) {
      unit2_temperatureLogic_channel4_port = Some(data)
    } else if(portId == unit2_pressureLogic_channel1_id) {
      unit2_pressureLogic_channel1_port = Some(data)
    } else if(portId == unit2_pressureLogic_channel2_id) {
      unit2_pressureLogic_channel2_port = Some(data)
    } else if(portId == unit2_pressureLogic_channel3_id) {
      unit2_pressureLogic_channel3_port = Some(data)
    } else if(portId == unit2_pressureLogic_channel4_id) {
      unit2_pressureLogic_channel4_port = Some(data)
    } else if(portId == unit2_saturationLogic_channel1_id) {
      unit2_saturationLogic_channel1_port = Some(data)
    } else if(portId == unit2_saturationLogic_channel2_id) {
      unit2_saturationLogic_channel2_port = Some(data)
    } else if(portId == unit2_saturationLogic_channel3_id) {
      unit2_saturationLogic_channel3_port = Some(data)
    } else if(portId == unit2_saturationLogic_channel4_id) {
      unit2_saturationLogic_channel4_port = Some(data)
    } else {
      halt(s"Unexpected: instrumentationMockThread.putValue called with: ${portId}")
    }
  }

  def sendOutput(eventPortIds: ISZ[Art.PortId], dataPortIds: ISZ[Art.PortId]): Unit = {
    // ignore params

    if(unit1_temperatureLogic_channel1_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_temperatureLogic_channel1_Send(unit1_temperatureLogic_channel1_port.get)
      unit1_temperatureLogic_channel1_port = noData
    }

    if(unit1_temperatureLogic_channel2_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_temperatureLogic_channel2_Send(unit1_temperatureLogic_channel2_port.get)
      unit1_temperatureLogic_channel2_port = noData
    }

    if(unit1_temperatureLogic_channel3_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_temperatureLogic_channel3_Send(unit1_temperatureLogic_channel3_port.get)
      unit1_temperatureLogic_channel3_port = noData
    }

    if(unit1_temperatureLogic_channel4_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_temperatureLogic_channel4_Send(unit1_temperatureLogic_channel4_port.get)
      unit1_temperatureLogic_channel4_port = noData
    }

    if(unit1_pressureLogic_channel1_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_pressureLogic_channel1_Send(unit1_pressureLogic_channel1_port.get)
      unit1_pressureLogic_channel1_port = noData
    }

    if(unit1_pressureLogic_channel2_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_pressureLogic_channel2_Send(unit1_pressureLogic_channel2_port.get)
      unit1_pressureLogic_channel2_port = noData
    }

    if(unit1_pressureLogic_channel3_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_pressureLogic_channel3_Send(unit1_pressureLogic_channel3_port.get)
      unit1_pressureLogic_channel3_port = noData
    }

    if(unit1_pressureLogic_channel4_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_pressureLogic_channel4_Send(unit1_pressureLogic_channel4_port.get)
      unit1_pressureLogic_channel4_port = noData
    }

    if(unit1_saturationLogic_channel1_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_saturationLogic_channel1_Send(unit1_saturationLogic_channel1_port.get)
      unit1_saturationLogic_channel1_port = noData
    }

    if(unit1_saturationLogic_channel2_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_saturationLogic_channel2_Send(unit1_saturationLogic_channel2_port.get)
      unit1_saturationLogic_channel2_port = noData
    }

    if(unit1_saturationLogic_channel3_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_saturationLogic_channel3_Send(unit1_saturationLogic_channel3_port.get)
      unit1_saturationLogic_channel3_port = noData
    }

    if(unit1_saturationLogic_channel4_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit1_saturationLogic_channel4_Send(unit1_saturationLogic_channel4_port.get)
      unit1_saturationLogic_channel4_port = noData
    }

    if(unit2_temperatureLogic_channel1_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_temperatureLogic_channel1_Send(unit2_temperatureLogic_channel1_port.get)
      unit2_temperatureLogic_channel1_port = noData
    }

    if(unit2_temperatureLogic_channel2_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_temperatureLogic_channel2_Send(unit2_temperatureLogic_channel2_port.get)
      unit2_temperatureLogic_channel2_port = noData
    }

    if(unit2_temperatureLogic_channel3_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_temperatureLogic_channel3_Send(unit2_temperatureLogic_channel3_port.get)
      unit2_temperatureLogic_channel3_port = noData
    }

    if(unit2_temperatureLogic_channel4_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_temperatureLogic_channel4_Send(unit2_temperatureLogic_channel4_port.get)
      unit2_temperatureLogic_channel4_port = noData
    }

    if(unit2_pressureLogic_channel1_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_pressureLogic_channel1_Send(unit2_pressureLogic_channel1_port.get)
      unit2_pressureLogic_channel1_port = noData
    }

    if(unit2_pressureLogic_channel2_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_pressureLogic_channel2_Send(unit2_pressureLogic_channel2_port.get)
      unit2_pressureLogic_channel2_port = noData
    }

    if(unit2_pressureLogic_channel3_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_pressureLogic_channel3_Send(unit2_pressureLogic_channel3_port.get)
      unit2_pressureLogic_channel3_port = noData
    }

    if(unit2_pressureLogic_channel4_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_pressureLogic_channel4_Send(unit2_pressureLogic_channel4_port.get)
      unit2_pressureLogic_channel4_port = noData
    }

    if(unit2_saturationLogic_channel1_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_saturationLogic_channel1_Send(unit2_saturationLogic_channel1_port.get)
      unit2_saturationLogic_channel1_port = noData
    }

    if(unit2_saturationLogic_channel2_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_saturationLogic_channel2_Send(unit2_saturationLogic_channel2_port.get)
      unit2_saturationLogic_channel2_port = noData
    }

    if(unit2_saturationLogic_channel3_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_saturationLogic_channel3_Send(unit2_saturationLogic_channel3_port.get)
      unit2_saturationLogic_channel3_port = noData
    }

    if(unit2_saturationLogic_channel4_port.nonEmpty) {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_seL4Nix.unit2_saturationLogic_channel4_Send(unit2_saturationLogic_channel4_port.get)
      unit2_saturationLogic_channel4_port = noData
    }
  }

  def initialiseArchitecture(): Unit = {
    // nothing to do - CAmkES is responsible for initialization
  }

  def initialiseEntryPoint(): Unit = { entryPoints.initialise() }

  def computeEntryPoint(): Unit = { entryPoints.compute() }

  def finaliseEntryPoint(): Unit = { entryPoints.finalise() }

  def main(args: ISZ[String]): Z = {

    // need to touch the following for transpiler
    initialiseArchitecture()
    initialiseEntryPoint()
    computeEntryPoint()
    finaliseEntryPoint()

    touch()

    return 0
  }

  def touch(): Unit = {
    if(F) {
      TranspilerToucher.touch()

      // add types used in Platform.receive and Platform.receiveAsync
      val mbox2Boolean_Payload: MBox2[Art.PortId, DataContent] = MBox2(portId"0", Base_Types.Boolean_Payload(T))
      val mbox2OptionDataContent: MBox2[Art.PortId, Option[DataContent]] = MBox2(portId"0", None())

      // touch each payload/type in case some are only used as a field in a record
      def printDataContent(a: art.DataContent): Unit = { println(s"${a}") }

      printDataContent(Base_Types.Boolean_Payload(Base_Types.Boolean_example()))
      printDataContent(Base_Types.Integer_Payload(Base_Types.Integer_example()))
      printDataContent(Base_Types.Integer_8_Payload(Base_Types.Integer_8_example()))
      printDataContent(Base_Types.Integer_16_Payload(Base_Types.Integer_16_example()))
      printDataContent(Base_Types.Integer_32_Payload(Base_Types.Integer_32_example()))
      printDataContent(Base_Types.Integer_64_Payload(Base_Types.Integer_64_example()))
      printDataContent(Base_Types.Unsigned_8_Payload(Base_Types.Unsigned_8_example()))
      printDataContent(Base_Types.Unsigned_16_Payload(Base_Types.Unsigned_16_example()))
      printDataContent(Base_Types.Unsigned_32_Payload(Base_Types.Unsigned_32_example()))
      printDataContent(Base_Types.Unsigned_64_Payload(Base_Types.Unsigned_64_example()))
      printDataContent(Base_Types.Float_Payload(Base_Types.Float_example()))
      printDataContent(Base_Types.Float_32_Payload(Base_Types.Float_32_example()))
      printDataContent(Base_Types.Float_64_Payload(Base_Types.Float_64_example()))
      printDataContent(Base_Types.Character_Payload(Base_Types.Character_example()))
      printDataContent(Base_Types.String_Payload(Base_Types.String_example()))
      printDataContent(art.Empty())

      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.logInfo("")
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.logDebug("")
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.logError("")
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.logInfo("")
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.logDebug("")
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.logError("")
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_temperatureLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_temperatureLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_temperatureLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_temperatureLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_temperatureLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_temperatureLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_temperatureLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_temperatureLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_pressureLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_pressureLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_pressureLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_pressureLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_pressureLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_pressureLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_pressureLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_pressureLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_saturationLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_saturationLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_saturationLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_saturationLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_saturationLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_saturationLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit1_saturationLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit1_saturationLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_temperatureLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_temperatureLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_temperatureLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_temperatureLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_temperatureLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_temperatureLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_temperatureLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_temperatureLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_pressureLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_pressureLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_pressureLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_pressureLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_pressureLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_pressureLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_pressureLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_pressureLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_saturationLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_saturationLogic_channel1(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_saturationLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_saturationLogic_channel2(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_saturationLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_saturationLogic_channel3(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api.get.put_unit2_saturationLogic_channel4(Base_Types.Boolean_example())
      RTS.Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api.get.put_unit2_saturationLogic_channel4(Base_Types.Boolean_example())
    }
  }

  def logInfo(title: String, msg: String): Unit = {
    print(instrumentationMockThreadBridge.name)
    print(": ")
    println(msg)
  }

  def logError(title: String, msg: String): Unit = {
    eprint(instrumentationMockThreadBridge.name)
    eprint(": ")
    eprintln(msg)
  }

  def logDebug(title: String, msg: String): Unit = {
    print(instrumentationMockThreadBridge.name)
    print(": ")
    println(msg)
  }

  def run(): Unit = {}

}
