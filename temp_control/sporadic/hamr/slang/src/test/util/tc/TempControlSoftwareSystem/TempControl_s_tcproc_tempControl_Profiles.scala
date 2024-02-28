// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc.util.Profile
import tc.util.EmptyContainer
import tc.RandomLib

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Profile for initialise entrypoint
@msig trait TempControl_s_tcproc_tempControl_Profile_Trait extends Profile

@record class TempControl_s_tcproc_tempControl_Profile (
  val name: String,
) extends TempControl_s_tcproc_tempControl_Profile_Trait {

  override def next: EmptyContainer = {
    return EmptyContainer()
  }
}

// Profile with generators for incoming ports
@msig trait TempControl_s_tcproc_tempControl_Profile_P_Trait extends Profile {
  def api_tempChanged: RandomLib // random lib for generating art.Empty
  def api_fanAck: RandomLib // random lib for generating CoolingFan.FanAck
  def api_setPoint: RandomLib // random lib for generating TempControlSoftwareSystem.SetPoint_i
  def api_currentTemp: RandomLib // random lib for generating TempSensor.Temperature_i
}

@record class TempControl_s_tcproc_tempControl_Profile_P(
  val name: String,
  var api_tempChanged: RandomLib, // random lib for generating art.Empty
  var api_fanAck: RandomLib, // random lib for generating CoolingFan.FanAck
  var api_setPoint: RandomLib, // random lib for generating TempControlSoftwareSystem.SetPoint_i
  var api_currentTemp: RandomLib // random lib for generating TempSensor.Temperature_i
  ) extends TempControl_s_tcproc_tempControl_Profile_P_Trait {

  override def next: TempControl_s_tcproc_tempControl_PreState_Container_P = {
    return (TempControl_s_tcproc_tempControl_PreState_Container_P (
      api_tempChanged = api_tempChanged.nextOption_artEmpty(),
      api_fanAck = api_fanAck.nextOptionCoolingFanFanAckType(),
      api_setPoint = api_setPoint.nextOptionTempControlSoftwareSystemSetPoint_i(),
      api_currentTemp = api_currentTemp.nextTempSensorTemperature_i()))
  }
}

// Profile with generators for state variables and incoming ports
@msig trait TempControl_s_tcproc_tempControl_Profile_PS_Trait extends TempControl_s_tcproc_tempControl_Profile_P_Trait {
  def In_currentFanState: RandomLib // random lib for generating CoolingFan.FanCmd
  def In_currentSetPoint: RandomLib // random lib for generating TempControlSoftwareSystem.SetPoint_i
  def In_latestTemp: RandomLib // random lib for generating TempSensor.Temperature_i
  def api_tempChanged: RandomLib // random lib for generating art.Empty
  def api_fanAck: RandomLib // random lib for generating CoolingFan.FanAck
  def api_setPoint: RandomLib // random lib for generating TempControlSoftwareSystem.SetPoint_i
  def api_currentTemp: RandomLib // random lib for generating TempSensor.Temperature_i
}

@record class TempControl_s_tcproc_tempControl_Profile_PS(
  val name: String,
  var In_currentFanState: RandomLib, // random lib for generating CoolingFan.FanCmd
  var In_currentSetPoint: RandomLib, // random lib for generating TempControlSoftwareSystem.SetPoint_i
  var In_latestTemp: RandomLib, // random lib for generating TempSensor.Temperature_i
  var api_tempChanged: RandomLib, // random lib for generating art.Empty
  var api_fanAck: RandomLib, // random lib for generating CoolingFan.FanAck
  var api_setPoint: RandomLib, // random lib for generating TempControlSoftwareSystem.SetPoint_i
  var api_currentTemp: RandomLib // random lib for generating TempSensor.Temperature_i
  ) extends TempControl_s_tcproc_tempControl_Profile_PS_Trait {

  override def next: TempControl_s_tcproc_tempControl_PreState_Container_PS = {
    return (TempControl_s_tcproc_tempControl_PreState_Container_PS (
      In_currentFanState = In_currentFanState.nextCoolingFanFanCmdType(),
      In_currentSetPoint = In_currentSetPoint.nextTempControlSoftwareSystemSetPoint_i(),
      In_latestTemp = In_latestTemp.nextTempSensorTemperature_i(),
      api_tempChanged = api_tempChanged.nextOption_artEmpty(),
      api_fanAck = api_fanAck.nextOptionCoolingFanFanAckType(),
      api_setPoint = api_setPoint.nextOptionTempControlSoftwareSystemSetPoint_i(),
      api_currentTemp = api_currentTemp.nextTempSensorTemperature_i()))
  }
}