// #Sireum

package isolette.Isolette

import org.sireum._
import art._
import isolette._

@sig trait operator_interface_thread_impl_Api {
  def id: Art.BridgeId
  def regulator_status_Id : Art.PortId
  def monitor_status_Id : Art.PortId
  def display_temperature_Id : Art.PortId
  def alarm_control_Id : Art.PortId
  def lower_desired_tempWstatus_Id : Art.PortId
  def upper_desired_tempWstatus_Id : Art.PortId
  def lower_alarm_tempWstatus_Id : Art.PortId
  def upper_alarm_tempWstatus_Id : Art.PortId

  // Logika spec var representing port state for outgoing data port
  @spec var lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = $

  def put_lower_desired_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl) : Unit = {
    Contract(
      Modifies(lower_desired_tempWstatus),
      Ensures(
        lower_desired_tempWstatus == value
      )
    )
    Spec {
      lower_desired_tempWstatus = value
    }

    Art.putValue(lower_desired_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // Logika spec var representing port state for outgoing data port
  @spec var upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = $

  def put_upper_desired_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl) : Unit = {
    Contract(
      Modifies(upper_desired_tempWstatus),
      Ensures(
        upper_desired_tempWstatus == value
      )
    )
    Spec {
      upper_desired_tempWstatus = value
    }

    Art.putValue(upper_desired_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // Logika spec var representing port state for outgoing data port
  @spec var lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = $

  def put_lower_alarm_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl) : Unit = {
    Contract(
      Modifies(lower_alarm_tempWstatus),
      Ensures(
        lower_alarm_tempWstatus == value
      )
    )
    Spec {
      lower_alarm_tempWstatus = value
    }

    Art.putValue(lower_alarm_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // Logika spec var representing port state for outgoing data port
  @spec var upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = $

  def put_upper_alarm_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl) : Unit = {
    Contract(
      Modifies(upper_alarm_tempWstatus),
      Ensures(
        upper_alarm_tempWstatus == value
      )
    )
    Spec {
      upper_alarm_tempWstatus = value
    }

    Art.putValue(upper_alarm_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
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

@datatype class operator_interface_thread_impl_Initialization_Api (
  val id: Art.BridgeId,
  val regulator_status_Id : Art.PortId,
  val monitor_status_Id : Art.PortId,
  val display_temperature_Id : Art.PortId,
  val alarm_control_Id : Art.PortId,
  val lower_desired_tempWstatus_Id : Art.PortId,
  val upper_desired_tempWstatus_Id : Art.PortId,
  val lower_alarm_tempWstatus_Id : Art.PortId,
  val upper_alarm_tempWstatus_Id : Art.PortId) extends operator_interface_thread_impl_Api

@datatype class operator_interface_thread_impl_Operational_Api (
  val id: Art.BridgeId,
  val regulator_status_Id : Art.PortId,
  val monitor_status_Id : Art.PortId,
  val display_temperature_Id : Art.PortId,
  val alarm_control_Id : Art.PortId,
  val lower_desired_tempWstatus_Id : Art.PortId,
  val upper_desired_tempWstatus_Id : Art.PortId,
  val lower_alarm_tempWstatus_Id : Art.PortId,
  val upper_alarm_tempWstatus_Id : Art.PortId) extends operator_interface_thread_impl_Api {

  // Logika spec var representing port state for incoming data port
  @spec var regulator_status: Isolette_Data_Model.Status.Type = $

  def get_regulator_status() : Option[Isolette_Data_Model.Status.Type] = {
    Contract(
      Ensures(
        Res == Some(regulator_status)
      )
    )
    val value : Option[Isolette_Data_Model.Status.Type] = Art.getValue(regulator_status_Id) match {
      case Some(Isolette_Data_Model.Status_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port regulator_status.  Expecting 'Isolette_Data_Model.Status_Payload' but received ${v}")
        None[Isolette_Data_Model.Status.Type]()
      case _ => None[Isolette_Data_Model.Status.Type]()
    }
    return value
  }

  // Logika spec var representing port state for incoming data port
  @spec var monitor_status: Isolette_Data_Model.Status.Type = $

  def get_monitor_status() : Option[Isolette_Data_Model.Status.Type] = {
    Contract(
      Ensures(
        Res == Some(monitor_status)
      )
    )
    val value : Option[Isolette_Data_Model.Status.Type] = Art.getValue(monitor_status_Id) match {
      case Some(Isolette_Data_Model.Status_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port monitor_status.  Expecting 'Isolette_Data_Model.Status_Payload' but received ${v}")
        None[Isolette_Data_Model.Status.Type]()
      case _ => None[Isolette_Data_Model.Status.Type]()
    }
    return value
  }

  // Logika spec var representing port state for incoming data port
  @spec var display_temperature: Isolette_Data_Model.Temp_impl = $

  def get_display_temperature() : Option[Isolette_Data_Model.Temp_impl] = {
    Contract(
      Ensures(
        Res == Some(display_temperature)
      )
    )
    val value : Option[Isolette_Data_Model.Temp_impl] = Art.getValue(display_temperature_Id) match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port display_temperature.  Expecting 'Isolette_Data_Model.Temp_impl_Payload' but received ${v}")
        None[Isolette_Data_Model.Temp_impl]()
      case _ => None[Isolette_Data_Model.Temp_impl]()
    }
    return value
  }

  // Logika spec var representing port state for incoming data port
  @spec var alarm_control: Isolette_Data_Model.On_Off.Type = $

  def get_alarm_control() : Option[Isolette_Data_Model.On_Off.Type] = {
    Contract(
      Ensures(
        Res == Some(alarm_control)
      )
    )
    val value : Option[Isolette_Data_Model.On_Off.Type] = Art.getValue(alarm_control_Id) match {
      case Some(Isolette_Data_Model.On_Off_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port alarm_control.  Expecting 'Isolette_Data_Model.On_Off_Payload' but received ${v}")
        None[Isolette_Data_Model.On_Off.Type]()
      case _ => None[Isolette_Data_Model.On_Off.Type]()
    }
    return value
  }
}
