// #Sireum

package isolette.Devices

import org.sireum._
import art._
import isolette._

@sig trait Heat_Source_impl_Api {
  def id: Art.BridgeId
  def heat_control_Id : Art.PortId
  def heat_out_Id : Art.PortId

  // Logika spec var representing port state for outgoing data port
  @spec var heat_out: Isolette_Environment.Heat.Type = $

  def put_heat_out(value : Isolette_Environment.Heat.Type) : Unit = {
    Contract(
      Modifies(heat_out),
      Ensures(
        heat_out == value
      )
    )
    Spec {
      heat_out = value
    }

    Art.putValue(heat_out_Id, Isolette_Environment.Heat_Payload(value))
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

@datatype class Heat_Source_impl_Initialization_Api (
  val id: Art.BridgeId,
  val heat_control_Id : Art.PortId,
  val heat_out_Id : Art.PortId) extends Heat_Source_impl_Api

@datatype class Heat_Source_impl_Operational_Api (
  val id: Art.BridgeId,
  val heat_control_Id : Art.PortId,
  val heat_out_Id : Art.PortId) extends Heat_Source_impl_Api {

  // Logika spec var representing port state for incoming data port
  @spec var heat_control: Isolette_Data_Model.On_Off.Type = $

  def get_heat_control() : Option[Isolette_Data_Model.On_Off.Type] = {
    Contract(
      Ensures(
        Res == Some(heat_control)
      )
    )
    val value : Option[Isolette_Data_Model.On_Off.Type] = Art.getValue(heat_control_Id) match {
      case Some(Isolette_Data_Model.On_Off_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port heat_control.  Expecting 'Isolette_Data_Model.On_Off_Payload' but received ${v}")
        None[Isolette_Data_Model.On_Off.Type]()
      case _ => None[Isolette_Data_Model.On_Off.Type]()
    }
    return value
  }
}
