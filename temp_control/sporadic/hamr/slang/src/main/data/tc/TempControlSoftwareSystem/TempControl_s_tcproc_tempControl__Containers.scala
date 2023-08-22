// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@datatype class TempControl_s_tcproc_tempControl_PreState_Container (
  val api_tempChanged: Option[art.Empty],
  val api_fanAck: Option[CoolingFan.FanAck.Type],
  val api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i],
  val api_currentTemp: TempSensor.Temperature_i) extends art.DataContent

@datatype class TempControl_s_tcproc_tempControl_PreState_wLContainer (
  val In_currentFanState: CoolingFan.FanCmd.Type,
  val In_currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
  val In_latestTemp: TempSensor.Temperature_i,
  val api_tempChanged: Option[art.Empty],
  val api_fanAck: Option[CoolingFan.FanAck.Type],
  val api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i],
  val api_currentTemp: TempSensor.Temperature_i) extends art.DataContent

@datatype class TempControl_s_tcproc_tempControl_PostState_Container (
  val api_fanCmd: Option[CoolingFan.FanCmd.Type]) extends art.DataContent

@datatype class TempControl_s_tcproc_tempControl_PostState_wLContainer (
  val currentFanState: CoolingFan.FanCmd.Type,
  val currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
  val latestTemp: TempSensor.Temperature_i,
  val api_fanCmd: Option[CoolingFan.FanCmd.Type]) extends art.DataContent