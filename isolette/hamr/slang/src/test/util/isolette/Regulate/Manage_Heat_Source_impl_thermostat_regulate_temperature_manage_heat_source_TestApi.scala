// #Sireum

package isolette.Regulate

import org.sireum._
import art.{Art, ArtNative, Empty}
import isolette._

// This file was auto-generated.  Do not edit
@msig trait Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source)
  }

  /** helper function to set the values of all input ports.
   * @param current_tempWstatus payload for data port current_tempWstatus
   * @param lower_desired_temp payload for data port lower_desired_temp
   * @param upper_desired_temp payload for data port upper_desired_temp
   * @param regulator_mode payload for data port regulator_mode
   */
  def put_concrete_inputs(current_tempWstatus : Isolette_Data_Model.TempWstatus_impl,
                          lower_desired_temp : Isolette_Data_Model.Temp_impl,
                          upper_desired_temp : Isolette_Data_Model.Temp_impl,
                          regulator_mode : Isolette_Data_Model.Regulator_Mode.Type): Unit = {
    put_current_tempWstatus(current_tempWstatus)
    put_lower_desired_temp(lower_desired_temp)
    put_upper_desired_temp(upper_desired_temp)
    put_regulator_mode(regulator_mode)
  }


  /** helper function to check Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param heat_control method that will be called with the value of the outgoing data
   *        port 'heat_control'.
   */
  def check_concrete_output(heat_control: Isolette_Data_Model.On_Off.Type => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val heat_controlValue: Isolette_Data_Model.On_Off.Type = get_heat_control().get
    if(!heat_control(heat_controlValue)) {
      testFailures = testFailures :+ st"'heat_control' did not match expected: value of the outgoing data port is ${heat_controlValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in DataPort
  def put_current_tempWstatus(value : Isolette_Data_Model.TempWstatus_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.current_tempWstatus_Id, Isolette_Data_Model.TempWstatus_impl_Payload(value))
  }

  // setter for in DataPort
  def put_lower_desired_temp(value : Isolette_Data_Model.Temp_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.lower_desired_temp_Id, Isolette_Data_Model.Temp_impl_Payload(value))
  }

  // setter for in DataPort
  def put_upper_desired_temp(value : Isolette_Data_Model.Temp_impl): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.upper_desired_temp_Id, Isolette_Data_Model.Temp_impl_Payload(value))
  }

  // setter for in DataPort
  def put_regulator_mode(value : Isolette_Data_Model.Regulator_Mode.Type): Unit = {
    ArtNative.insertInPortValue(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.operational_api.regulator_mode_Id, Isolette_Data_Model.Regulator_Mode_Payload(value))
  }

  // getter for out DataPort
  def get_heat_control(): Option[Isolette_Data_Model.On_Off.Type] = {
    val value: Option[Isolette_Data_Model.On_Off.Type] = get_heat_control_payload() match {
      case Some(Isolette_Data_Model.On_Off_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port heat_control.  Expecting 'Isolette_Data_Model.On_Off_Payload' but received ${v}")
      case _ => None[Isolette_Data_Model.On_Off.Type]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_heat_control_payload(): Option[Isolette_Data_Model.On_Off_Payload] = {
    return ArtNative.observeOutPortValue(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.initialization_api.heat_control_Id).asInstanceOf[Option[Isolette_Data_Model.On_Off_Payload]]
  }

}
