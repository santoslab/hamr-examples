// #Sireum

package tc.TempSensor

import org.sireum._
import art._
import tc._

object TempSensor_s_Api {
  @strictpure def Sensor_Temperature_Range(currentTemp: TempSensor.Temperature_i): B =
    TempSensor.GUMBO__Library.inRange(currentTemp)
}

import TempSensor_s_Api._

@sig trait TempSensor_s_Api {
  def id: Art.BridgeId
  def currentTemp_Id : Art.PortId
  def tempChanged_Id : Art.PortId

  // Logika spec var representing port state for outgoing data port
  @spec var currentTemp: TempSensor.Temperature_i = $
  @spec def currentTemp_Inv = Invariant(
    Sensor_Temperature_Range(currentTemp)
  )

  def put_currentTemp(value : TempSensor.Temperature_i) : Unit = {
    Contract(
      Requires(
        Sensor_Temperature_Range(value)
      ),
      Modifies(currentTemp),
      Ensures(
        currentTemp == value
      )
    )
    Spec {
      currentTemp = value
    }

    Art.putValue(currentTemp_Id, TempSensor.Temperature_i_Payload(value))
  }

  // Logika spec var representing port state for outgoing event port
  @spec var tempChanged: Option[art.Empty] = $

  def put_tempChanged() : Unit = {
    Contract(
      Modifies(tempChanged),
      Ensures(
        tempChanged == Some(Empty())
      )
    )
    Spec {
      tempChanged = Some(Empty())
    }

    Art.putValue(tempChanged_Id, art.Empty())
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

@datatype class TempSensor_s_Initialization_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val tempChanged_Id : Art.PortId) extends TempSensor_s_Api

@datatype class TempSensor_s_Operational_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val tempChanged_Id : Art.PortId) extends TempSensor_s_Api {

}
