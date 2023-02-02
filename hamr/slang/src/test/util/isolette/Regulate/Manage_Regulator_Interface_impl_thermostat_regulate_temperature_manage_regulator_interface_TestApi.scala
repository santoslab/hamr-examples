package isolette.Regulate

import org.sireum._
import art.{ArtNative_Ext, Empty}
import isolette._

// This file was auto-generated.  Do not edit
abstract class Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_TestApi extends BridgeTestSuite[Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Bridge](Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface) {

  /** helper function to set the values of all input ports.
   * @param upper_desired_tempWstatus payload for data port upper_desired_tempWstatus
   * @param lower_desired_tempWstatus payload for data port lower_desired_tempWstatus
   * @param current_tempWstatus payload for data port current_tempWstatus
   * @param regulator_mode payload for data port regulator_mode
   */
  def put_concrete_inputs(upper_desired_tempWstatus : Isolette_Data_Model.TempWstatus_impl,
                          lower_desired_tempWstatus : Isolette_Data_Model.TempWstatus_impl,
                          current_tempWstatus : Isolette_Data_Model.TempWstatus_impl,
                          regulator_mode : Isolette_Data_Model.Regulator_Mode.Type): Unit = {
    put_upper_desired_tempWstatus(upper_desired_tempWstatus)
    put_lower_desired_tempWstatus(lower_desired_tempWstatus)
    put_current_tempWstatus(current_tempWstatus)
    put_regulator_mode(regulator_mode)
  }


  /** helper function to check Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param upper_desired_temp method that will be called with the value of the outgoing data
   *        port 'upper_desired_temp'.
   * @param lower_desired_temp method that will be called with the value of the outgoing data
   *        port 'lower_desired_temp'.
   * @param displayed_temp method that will be called with the value of the outgoing data
   *        port 'displayed_temp'.
   * @param regulator_status method that will be called with the value of the outgoing data
   *        port 'regulator_status'.
   * @param interface_failure method that will be called with the value of the outgoing data
   *        port 'interface_failure'.
   */
  def check_concrete_output(upper_desired_temp: Isolette_Data_Model.Temp_impl => B = upper_desired_tempParam => {T},
                            lower_desired_temp: Isolette_Data_Model.Temp_impl => B = lower_desired_tempParam => {T},
                            displayed_temp: Isolette_Data_Model.Temp_impl => B = displayed_tempParam => {T},
                            regulator_status: Isolette_Data_Model.Status.Type => B = regulator_statusParam => {T},
                            interface_failure: Isolette_Data_Model.Failure_Flag_impl => B = interface_failureParam => {T}): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val upper_desired_tempValue: Isolette_Data_Model.Temp_impl = get_upper_desired_temp().get
    if(!upper_desired_temp(upper_desired_tempValue)) {
      testFailures = testFailures :+ st"'upper_desired_temp' did not match expected: value of the outgoing data port is ${upper_desired_tempValue}"
    }
    val lower_desired_tempValue: Isolette_Data_Model.Temp_impl = get_lower_desired_temp().get
    if(!lower_desired_temp(lower_desired_tempValue)) {
      testFailures = testFailures :+ st"'lower_desired_temp' did not match expected: value of the outgoing data port is ${lower_desired_tempValue}"
    }
    val displayed_tempValue: Isolette_Data_Model.Temp_impl = get_displayed_temp().get
    if(!displayed_temp(displayed_tempValue)) {
      testFailures = testFailures :+ st"'displayed_temp' did not match expected: value of the outgoing data port is ${displayed_tempValue}"
    }
    val regulator_statusValue: Isolette_Data_Model.Status.Type = get_regulator_status().get
    if(!regulator_status(regulator_statusValue)) {
      testFailures = testFailures :+ st"'regulator_status' did not match expected: value of the outgoing data port is ${regulator_statusValue}"
    }
    val interface_failureValue: Isolette_Data_Model.Failure_Flag_impl = get_interface_failure().get
    if(!interface_failure(interface_failureValue)) {
      testFailures = testFailures :+ st"'interface_failure' did not match expected: value of the outgoing data port is ${interface_failureValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in DataPort
  def put_upper_desired_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.upper_desired_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // setter for in DataPort
  def put_lower_desired_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.lower_desired_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // setter for in DataPort
  def put_current_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.current_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // setter for in DataPort
  def put_regulator_mode(value : Isolette_Data_Model.Regulator_Mode.Type): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.regulator_mode_Id, Isolette_Data_Model.Regulator_Mode_Payload(value))
  }

  // getter for out DataPort
  def get_upper_desired_temp(): Option[Isolette_Data_Model.Temp_impl] = {
    val value: Option[Isolette_Data_Model.Temp_impl] = get_upper_desired_temp_payload() match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port upper_desired_temp.  Expecting 'Isolette_Data_Model.Temp_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.Temp_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_upper_desired_temp_payload(): Option[Isolette_Data_Model.Temp_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.upper_desired_temp_Id).asInstanceOf[Option[Isolette_Data_Model.Temp_impl_Payload]]
  }

  // getter for out DataPort
  def get_lower_desired_temp(): Option[Isolette_Data_Model.Temp_impl] = {
    val value: Option[Isolette_Data_Model.Temp_impl] = get_lower_desired_temp_payload() match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port lower_desired_temp.  Expecting 'Isolette_Data_Model.Temp_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.Temp_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_lower_desired_temp_payload(): Option[Isolette_Data_Model.Temp_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.lower_desired_temp_Id).asInstanceOf[Option[Isolette_Data_Model.Temp_impl_Payload]]
  }

  // getter for out DataPort
  def get_displayed_temp(): Option[Isolette_Data_Model.Temp_impl] = {
    val value: Option[Isolette_Data_Model.Temp_impl] = get_displayed_temp_payload() match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port displayed_temp.  Expecting 'Isolette_Data_Model.Temp_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.Temp_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_displayed_temp_payload(): Option[Isolette_Data_Model.Temp_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.displayed_temp_Id).asInstanceOf[Option[Isolette_Data_Model.Temp_impl_Payload]]
  }

  // getter for out DataPort
  def get_regulator_status(): Option[Isolette_Data_Model.Status.Type] = {
    val value: Option[Isolette_Data_Model.Status.Type] = get_regulator_status_payload() match {
      case Some(Isolette_Data_Model.Status_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port regulator_status.  Expecting 'Isolette_Data_Model.Status_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.Status.Type]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_regulator_status_payload(): Option[Isolette_Data_Model.Status_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.regulator_status_Id).asInstanceOf[Option[Isolette_Data_Model.Status_Payload]]
  }

  // getter for out DataPort
  def get_interface_failure(): Option[Isolette_Data_Model.Failure_Flag_impl] = {
    val value: Option[Isolette_Data_Model.Failure_Flag_impl] = get_interface_failure_payload() match {
      case Some(Isolette_Data_Model.Failure_Flag_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port interface_failure.  Expecting 'Isolette_Data_Model.Failure_Flag_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.Failure_Flag_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_interface_failure_payload(): Option[Isolette_Data_Model.Failure_Flag_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.interface_failure_Id).asInstanceOf[Option[Isolette_Data_Model.Failure_Flag_impl_Payload]]
  }

}
