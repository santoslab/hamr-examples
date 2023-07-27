// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import art._
import tc._

object TempControlPeriodic_p_Api {
  // assume currentTempRange
  @strictpure def currentTempRange(currentTemp: TempSensor.Temperature_i): B =
    currentTemp.degrees >= -70.0f &
      currentTemp.degrees <= 80.0f
}

import TempControlPeriodic_p_Api._

@sig trait TempControlPeriodic_p_Api {
  def id: Art.BridgeId
  def currentTemp_Id : Art.PortId
  def fanAck_Id : Art.PortId
  def setPoint_Id : Art.PortId
  def fanCmd_Id : Art.PortId

  // Logika spec var representing port state for outgoing data port
  @spec var fanCmd: CoolingFan.FanCmd.Type = $

  def put_fanCmd(value : CoolingFan.FanCmd.Type) : Unit = {
    Contract(
      Modifies(fanCmd),
      Ensures(
        fanCmd == value
      )
    )
    Spec {
      fanCmd = value
    }

    Art.putValue(fanCmd_Id, CoolingFan.FanCmd_Payload(value))
  }

  def logInfo(msg: String): Unit = {
    Art.logInfo(id, msg)
  }

  def logDebug(msg: String): Unit = {
    Art.logDebug(id, msg)
  }

  def logError(msg: String): Unit = {
    Art.logError(id, msg)
  }
}

@datatype class TempControlPeriodic_p_Initialization_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val fanAck_Id : Art.PortId,
  val setPoint_Id : Art.PortId,
  val fanCmd_Id : Art.PortId) extends TempControlPeriodic_p_Api

@datatype class TempControlPeriodic_p_Operational_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val fanAck_Id : Art.PortId,
  val setPoint_Id : Art.PortId,
  val fanCmd_Id : Art.PortId) extends TempControlPeriodic_p_Api {

  // Logika spec var representing port state for incoming data port
  @spec var currentTemp: TempSensor.Temperature_i = $
  @spec def currentTemp_Inv = Invariant(
    currentTempRange(currentTemp)
  )

  def get_currentTemp() : Option[TempSensor.Temperature_i] = {
    Contract(
      Ensures(
        currentTempRange(currentTemp),
        Res == Some(currentTemp)
      )
    )
    val value : Option[TempSensor.Temperature_i] = Art.getValue(currentTemp_Id) match {
      case Some(TempSensor.Temperature_i_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port currentTemp.  Expecting 'TempSensor.Temperature_i_Payload' but received ${v}")
        None[TempSensor.Temperature_i]()
      case _ => None[TempSensor.Temperature_i]()
    }
    return value
  }

  // Logika spec var representing port state for incoming data port
  @spec var fanAck: CoolingFan.FanAck.Type = $

  def get_fanAck() : Option[CoolingFan.FanAck.Type] = {
    Contract(
      Ensures(
        Res == Some(fanAck)
      )
    )
    val value : Option[CoolingFan.FanAck.Type] = Art.getValue(fanAck_Id) match {
      case Some(CoolingFan.FanAck_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port fanAck.  Expecting 'CoolingFan.FanAck_Payload' but received ${v}")
        None[CoolingFan.FanAck.Type]()
      case _ => None[CoolingFan.FanAck.Type]()
    }
    return value
  }

  // Logika spec var representing port state for incoming data port
  @spec var setPoint: TempControlSoftwareSystem.SetPoint_i = $

  def get_setPoint() : Option[TempControlSoftwareSystem.SetPoint_i] = {
    Contract(
      Ensures(
        Res == Some(setPoint)
      )
    )
    val value : Option[TempControlSoftwareSystem.SetPoint_i] = Art.getValue(setPoint_Id) match {
      case Some(TempControlSoftwareSystem.SetPoint_i_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port setPoint.  Expecting 'TempControlSoftwareSystem.SetPoint_i_Payload' but received ${v}")
        None[TempControlSoftwareSystem.SetPoint_i]()
      case _ => None[TempControlSoftwareSystem.SetPoint_i]()
    }
    return value
  }
}
