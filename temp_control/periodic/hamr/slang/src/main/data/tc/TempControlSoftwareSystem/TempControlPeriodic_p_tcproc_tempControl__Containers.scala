// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@datatype class TempControlPeriodic_p_tcproc_tempControl_PreState_Container (
  val api_currentTemp: TempSensor.Temperature_i,
  val api_fanAck: CoolingFan.FanAck.Type,
  val api_setPoint: TempControlSoftwareSystem.SetPoint_i)

@datatype class TempControlPeriodic_p_tcproc_tempControl_PreState_wLContainer (
  val In_latestFanCmd: CoolingFan.FanCmd.Type,
  val api_currentTemp: TempSensor.Temperature_i,
  val api_fanAck: CoolingFan.FanAck.Type,
  val api_setPoint: TempControlSoftwareSystem.SetPoint_i)

@datatype class TempControlPeriodic_p_tcproc_tempControl_PostState_Container (
  val api_fanCmd: CoolingFan.FanCmd.Type)

@datatype class TempControlPeriodic_p_tcproc_tempControl_PostState_wLContainer (
  val latestFanCmd: CoolingFan.FanCmd.Type,
  val api_fanCmd: CoolingFan.FanCmd.Type)