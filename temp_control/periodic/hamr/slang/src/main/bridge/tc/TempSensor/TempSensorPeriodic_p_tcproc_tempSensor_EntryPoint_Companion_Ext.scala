package tc.TempSensor

import org.sireum._
import art._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object TempSensorPeriodic_p_tcproc_tempSensor_EntryPoint_Companion_Ext {

  var last_api_currentTemp: TempSensor.Temperature_i = _

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    TempSensorPeriodic_p_tcproc_tempSensor_PostState_wLContainer(
      api_currentTemp = Art.observeOutPortValue(Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor.operational_api.currentTemp_Id).get match {
        case Some(TempSensor.Temperature_i_Payload(value)) =>
          last_api_currentTemp = value
          value
        case _ => last_api_currentTemp
      })
  }

  def pre_compute(): Unit = {
    TempSensorPeriodic_p_tcproc_tempSensor_PreState_wLContainer()
  }

  def post_compute(): Unit = {
    TempSensorPeriodic_p_tcproc_tempSensor_PostState_wLContainer(
      api_currentTemp = Art.observeOutPortValue(Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor.operational_api.currentTemp_Id).get match {
        case Some(TempSensor.Temperature_i_Payload(value)) =>
          last_api_currentTemp = value
          value
        case _ => last_api_currentTemp
      })
  }
}