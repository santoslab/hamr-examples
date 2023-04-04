// #Sireum

package isolette.Regulate

import org.sireum._
import art._
import isolette._

@sig trait Manage_Heat_Source_impl_Api {
  def id: Art.BridgeId
  def current_tempWstatus_Id : Art.PortId
  def lower_desired_temp_Id : Art.PortId
  def upper_desired_temp_Id : Art.PortId
  def regulator_mode_Id : Art.PortId
  def heat_control_Id : Art.PortId

  // Logika spec var representing port state for outgoing data port
  @spec var heat_control: Isolette_Data_Model.On_Off.Type = $

  def put_heat_control(value : Isolette_Data_Model.On_Off.Type) : Unit = {
    Contract(
      Modifies(heat_control),
      Ensures(
        heat_control == value
      )
    )
    Spec {
      heat_control = value
    }

    Art.putValue(heat_control_Id, Isolette_Data_Model.On_Off_Payload(value))
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

@datatype class Manage_Heat_Source_impl_Initialization_Api (
  val id: Art.BridgeId,
  val current_tempWstatus_Id : Art.PortId,
  val lower_desired_temp_Id : Art.PortId,
  val upper_desired_temp_Id : Art.PortId,
  val regulator_mode_Id : Art.PortId,
  val heat_control_Id : Art.PortId) extends Manage_Heat_Source_impl_Api

@datatype class Manage_Heat_Source_impl_Operational_Api (
  val id: Art.BridgeId,
  val current_tempWstatus_Id : Art.PortId,
  val lower_desired_temp_Id : Art.PortId,
  val upper_desired_temp_Id : Art.PortId,
  val regulator_mode_Id : Art.PortId,
  val heat_control_Id : Art.PortId) extends Manage_Heat_Source_impl_Api {

  // Logika spec var representing port state for incoming data port
  @spec var current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = $

  def get_current_tempWstatus() : Option[Isolette_Data_Model.TempWstatus_impl] = {
    Contract(
      Ensures(
        Res == Some(current_tempWstatus)
      )
    )
    val value : Option[Isolette_Data_Model.TempWstatus_impl] = Art.getValue(current_tempWstatus_Id) match {
      case Some(Isolette_Data_Model.TempWstatus_impl_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port current_tempWstatus.  Expecting 'Isolette_Data_Model.TempWstatus_impl_Payload' but received ${v}")
        None[Isolette_Data_Model.TempWstatus_impl]()
      case _ => None[Isolette_Data_Model.TempWstatus_impl]()
    }
    return value
  }

  // Logika spec var representing port state for incoming data port
  @spec var lower_desired_temp: Isolette_Data_Model.Temp_impl = $

  def get_lower_desired_temp() : Option[Isolette_Data_Model.Temp_impl] = {
    Contract(
      Ensures(
        Res == Some(lower_desired_temp)
      )
    )
    val value : Option[Isolette_Data_Model.Temp_impl] = Art.getValue(lower_desired_temp_Id) match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port lower_desired_temp.  Expecting 'Isolette_Data_Model.Temp_impl_Payload' but received ${v}")
        None[Isolette_Data_Model.Temp_impl]()
      case _ => None[Isolette_Data_Model.Temp_impl]()
    }
    return value
  }

  // Logika spec var representing port state for incoming data port
  @spec var upper_desired_temp: Isolette_Data_Model.Temp_impl = $

  def get_upper_desired_temp() : Option[Isolette_Data_Model.Temp_impl] = {
    Contract(
      Ensures(
        Res == Some(upper_desired_temp)
      )
    )
    val value : Option[Isolette_Data_Model.Temp_impl] = Art.getValue(upper_desired_temp_Id) match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port upper_desired_temp.  Expecting 'Isolette_Data_Model.Temp_impl_Payload' but received ${v}")
        None[Isolette_Data_Model.Temp_impl]()
      case _ => None[Isolette_Data_Model.Temp_impl]()
    }
    return value
  }

  // Logika spec var representing port state for incoming data port
  @spec var regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = $

  def get_regulator_mode() : Option[Isolette_Data_Model.Regulator_Mode.Type] = {
    Contract(
      Ensures(
        Res == Some(regulator_mode)
      )
    )
    val value : Option[Isolette_Data_Model.Regulator_Mode.Type] = Art.getValue(regulator_mode_Id) match {
      case Some(Isolette_Data_Model.Regulator_Mode_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port regulator_mode.  Expecting 'Isolette_Data_Model.Regulator_Mode_Payload' but received ${v}")
        None[Isolette_Data_Model.Regulator_Mode.Type]()
      case _ => None[Isolette_Data_Model.Regulator_Mode.Type]()
    }
    return value
  }
}
