// #Sireum

package tc.TempSensor

import org.sireum._
import art._
import tc._

object TempSensorPeriodic_p_Api {
  // guarantee Sensor_Temperature_Range
  @strictpure def Sensor_Temperature_Range(currentTemp: TempSensor.Temperature_i): B =
    TempSensor.GUMBO__Library.inRange(currentTemp)
}

import TempSensorPeriodic_p_Api._

@sig trait TempSensorPeriodic_p_Api {
  def id: Art.BridgeId
  def currentTemp_Id : Art.PortId

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

@datatype class TempSensorPeriodic_p_Initialization_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId) extends TempSensorPeriodic_p_Api

@datatype class TempSensorPeriodic_p_Operational_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId) extends TempSensorPeriodic_p_Api {

}
