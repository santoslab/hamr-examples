// #Sireum

package isolette.Monitor

import org.sireum._
import art.{Art, ArtNative, Empty}
import isolette._

// This file was auto-generated.  Do not edit
@msig trait Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm)
  }

  /** helper function to set the values of all input ports.
   * @param current_tempWstatus payload for data port current_tempWstatus
   * @param lower_alarm_temp payload for data port lower_alarm_temp
   * @param upper_alarm_temp payload for data port upper_alarm_temp
   * @param monitor_mode payload for data port monitor_mode
   */
  def put_concrete_inputs(current_tempWstatus : Isolette_Data_Model.TempWstatus_impl,
                          lower_alarm_temp : Isolette_Data_Model.Temp_impl,
                          upper_alarm_temp : Isolette_Data_Model.Temp_impl,
                          monitor_mode : Isolette_Data_Model.Monitor_Mode.Type): Unit = {
    put_current_tempWstatus(current_tempWstatus)
    put_lower_alarm_temp(lower_alarm_temp)
    put_upper_alarm_temp(upper_alarm_temp)
    put_monitor_mode(monitor_mode)
  }


  /** helper function to check Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param alarm_control method that will be called with the value of the outgoing data
   *        port 'alarm_control'.
   */
  def check_concrete_output(alarm_control: Isolette_Data_Model.On_Off.Type => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val alarm_controlValue: Isolette_Data_Model.On_Off.Type = get_alarm_control().get
    if(!alarm_control(alarm_controlValue)) {
      testFailures = testFailures :+ st"'alarm_control' did not match expected: value of the outgoing data port is ${alarm_controlValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in DataPort
  def put_current_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.current_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // setter for in DataPort
  def put_lower_alarm_temp(value : Isolette_Data_Model.Temp_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.lower_alarm_temp_Id, Isolette_Data_Model.Temp_impl_Payload(value))
  }

  // setter for in DataPort
  def put_upper_alarm_temp(value : Isolette_Data_Model.Temp_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.upper_alarm_temp_Id, Isolette_Data_Model.Temp_impl_Payload(value))
  }

  // setter for in DataPort
  def put_monitor_mode(value : Isolette_Data_Model.Monitor_Mode.Type): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.monitor_mode_Id, Isolette_Data_Model.Monitor_Mode_Payload(value))
  }

  // getter for out DataPort
  def get_alarm_control(): Option[Isolette_Data_Model.On_Off.Type] = {
    val value: Option[Isolette_Data_Model.On_Off.Type] = get_alarm_control_payload() match {
      case Some(Isolette_Data_Model.On_Off_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port alarm_control.  Expecting 'Isolette_Data_Model.On_Off_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.On_Off.Type]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_alarm_control_payload(): Option[Isolette_Data_Model.On_Off_Payload] = {
    return ArtNative.observeOutPortValue(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.initialization_api.alarm_control_Id).asInstanceOf[Option[Isolette_Data_Model.On_Off_Payload]]
  }

}
