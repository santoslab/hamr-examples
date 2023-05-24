// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import art._
import tc._

@sig trait OperatorInterfacePeriodic_p_Api {
  def id: Art.BridgeId
  def currentTemp_Id : Art.PortId
  def setPoint_Id : Art.PortId

  // Logika spec var representing port state for outgoing data port
  @spec var setPoint: TempControlSoftwareSystem.SetPoint_i = $

  def put_setPoint(value : TempControlSoftwareSystem.SetPoint_i) : Unit = {
    Contract(
      Modifies(setPoint),
      Ensures(
        setPoint == value
      )
    )
    Spec {
      setPoint = value
    }

    Art.putValue(setPoint_Id, TempControlSoftwareSystem.SetPoint_i_Payload(value))
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

@datatype class OperatorInterfacePeriodic_p_Initialization_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val setPoint_Id : Art.PortId) extends OperatorInterfacePeriodic_p_Api

@datatype class OperatorInterfacePeriodic_p_Operational_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val setPoint_Id : Art.PortId) extends OperatorInterfacePeriodic_p_Api {

  // Logika spec var representing port state for incoming data port
  @spec var currentTemp: TempSensor.Temperature_i = $

  def get_currentTemp() : Option[TempSensor.Temperature_i] = {
    Contract(
      Ensures(
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
}
