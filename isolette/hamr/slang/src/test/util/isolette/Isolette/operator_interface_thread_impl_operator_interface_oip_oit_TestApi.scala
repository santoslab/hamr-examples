package isolette.Isolette

import org.sireum._
import art.{ArtNative_Ext, Empty}
import isolette._

// This file was auto-generated.  Do not edit
abstract class operator_interface_thread_impl_operator_interface_oip_oit_TestApi extends BridgeTestSuite[operator_interface_thread_impl_operator_interface_oip_oit_Bridge](Arch.isolette_single_sensor_Instance_operator_interface_oip_oit) {

  /** helper function to set the values of all input ports.
   * @param regulator_status payload for data port regulator_status
   * @param monitor_status payload for data port monitor_status
   * @param display_temperature payload for data port display_temperature
   * @param alarm_control payload for data port alarm_control
   */
  def put_concrete_inputs(regulator_status : Isolette_Data_Model.Status.Type,
                          monitor_status : Isolette_Data_Model.Status.Type,
                          display_temperature : Isolette_Data_Model.Temp_impl,
                          alarm_control : Isolette_Data_Model.On_Off.Type): Unit = {
    put_regulator_status(regulator_status)
    put_monitor_status(monitor_status)
    put_display_temperature(display_temperature)
    put_alarm_control(alarm_control)
  }


  /** helper function to check operator_interface_thread_impl_operator_interface_oip_oit's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param lower_desired_tempWstatus method that will be called with the value of the outgoing data
   *        port 'lower_desired_tempWstatus'.
   * @param upper_desired_tempWstatus method that will be called with the value of the outgoing data
   *        port 'upper_desired_tempWstatus'.
   * @param lower_alarm_tempWstatus method that will be called with the value of the outgoing data
   *        port 'lower_alarm_tempWstatus'.
   * @param upper_alarm_tempWstatus method that will be called with the value of the outgoing data
   *        port 'upper_alarm_tempWstatus'.
   */
  def check_concrete_output(lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl => B = lower_desired_tempWstatusParam => {T},
                            upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl => B = upper_desired_tempWstatusParam => {T},
                            lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl => B = lower_alarm_tempWstatusParam => {T},
                            upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl => B = upper_alarm_tempWstatusParam => {T}): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val lower_desired_tempWstatusValue: Isolette_Data_Model.TempWstatus_impl = get_lower_desired_tempWstatus().get
    if(!lower_desired_tempWstatus(lower_desired_tempWstatusValue)) {
      testFailures = testFailures :+ st"'lower_desired_tempWstatus' did not match expected: value of the outgoing data port is ${lower_desired_tempWstatusValue}"
    }
    val upper_desired_tempWstatusValue: Isolette_Data_Model.TempWstatus_impl = get_upper_desired_tempWstatus().get
    if(!upper_desired_tempWstatus(upper_desired_tempWstatusValue)) {
      testFailures = testFailures :+ st"'upper_desired_tempWstatus' did not match expected: value of the outgoing data port is ${upper_desired_tempWstatusValue}"
    }
    val lower_alarm_tempWstatusValue: Isolette_Data_Model.TempWstatus_impl = get_lower_alarm_tempWstatus().get
    if(!lower_alarm_tempWstatus(lower_alarm_tempWstatusValue)) {
      testFailures = testFailures :+ st"'lower_alarm_tempWstatus' did not match expected: value of the outgoing data port is ${lower_alarm_tempWstatusValue}"
    }
    val upper_alarm_tempWstatusValue: Isolette_Data_Model.TempWstatus_impl = get_upper_alarm_tempWstatus().get
    if(!upper_alarm_tempWstatus(upper_alarm_tempWstatusValue)) {
      testFailures = testFailures :+ st"'upper_alarm_tempWstatus' did not match expected: value of the outgoing data port is ${upper_alarm_tempWstatusValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in DataPort
  def put_regulator_status(value : Isolette_Data_Model.Status.Type): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.regulator_status_Id, Isolette_Data_Model.Status_Payload(value))
  }

  // setter for in DataPort
  def put_monitor_status(value : Isolette_Data_Model.Status.Type): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.monitor_status_Id, Isolette_Data_Model.Status_Payload(value))
  }

  // setter for in DataPort
  def put_display_temperature(value : Isolette_Data_Model.Temp_impl): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.display_temperature_Id, Isolette_Data_Model.Temp_impl_Payload(value))
  }

  // setter for in DataPort
  def put_alarm_control(value : Isolette_Data_Model.On_Off.Type): Unit = {
    ArtNative_Ext.insertInPortValue(bridge.operational_api.alarm_control_Id, Isolette_Data_Model.On_Off_Payload(value))
  }

  // getter for out DataPort
  def get_lower_desired_tempWstatus(): Option[Isolette_Data_Model.TempWstatus_impl] = {
    val value: Option[Isolette_Data_Model.TempWstatus_impl] = get_lower_desired_tempWstatus_payload() match {
      case Some(Isolette_Data_Model.TempWstatus_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port lower_desired_tempWstatus.  Expecting 'Isolette_Data_Model.TempWstatus_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.TempWstatus_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_lower_desired_tempWstatus_payload(): Option[Isolette_Data_Model.TempWstatus_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.lower_desired_tempWstatus_Id).asInstanceOf[Option[Isolette_Data_Model.TempWstatus_impl_Payload]]
  }

  // getter for out DataPort
  def get_upper_desired_tempWstatus(): Option[Isolette_Data_Model.TempWstatus_impl] = {
    val value: Option[Isolette_Data_Model.TempWstatus_impl] = get_upper_desired_tempWstatus_payload() match {
      case Some(Isolette_Data_Model.TempWstatus_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port upper_desired_tempWstatus.  Expecting 'Isolette_Data_Model.TempWstatus_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.TempWstatus_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_upper_desired_tempWstatus_payload(): Option[Isolette_Data_Model.TempWstatus_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.upper_desired_tempWstatus_Id).asInstanceOf[Option[Isolette_Data_Model.TempWstatus_impl_Payload]]
  }

  // getter for out DataPort
  def get_lower_alarm_tempWstatus(): Option[Isolette_Data_Model.TempWstatus_impl] = {
    val value: Option[Isolette_Data_Model.TempWstatus_impl] = get_lower_alarm_tempWstatus_payload() match {
      case Some(Isolette_Data_Model.TempWstatus_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port lower_alarm_tempWstatus.  Expecting 'Isolette_Data_Model.TempWstatus_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.TempWstatus_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_lower_alarm_tempWstatus_payload(): Option[Isolette_Data_Model.TempWstatus_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.lower_alarm_tempWstatus_Id).asInstanceOf[Option[Isolette_Data_Model.TempWstatus_impl_Payload]]
  }

  // getter for out DataPort
  def get_upper_alarm_tempWstatus(): Option[Isolette_Data_Model.TempWstatus_impl] = {
    val value: Option[Isolette_Data_Model.TempWstatus_impl] = get_upper_alarm_tempWstatus_payload() match {
      case Some(Isolette_Data_Model.TempWstatus_impl_Payload(v)) => Some(v)
      case Some(v) => fail(s"Unexpected payload on port upper_alarm_tempWstatus.  Expecting 'Isolette_Data_Model.TempWstatus_impl_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.TempWstatus_impl]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_upper_alarm_tempWstatus_payload(): Option[Isolette_Data_Model.TempWstatus_impl_Payload] = {
    return ArtNative_Ext.observeOutPortValue(bridge.initialization_api.upper_alarm_tempWstatus_Id).asInstanceOf[Option[Isolette_Data_Model.TempWstatus_impl_Payload]]
  }

}
