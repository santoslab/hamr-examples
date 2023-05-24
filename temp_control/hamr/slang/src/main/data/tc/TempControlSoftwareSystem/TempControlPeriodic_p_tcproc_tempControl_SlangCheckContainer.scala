// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// This file was auto-generated.  Do not edit

// SlangCheck test container to hold the incoming port values for tempControl
@datatype class TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer (
  val api_currentTemp: TempSensor.Temperature_i,
  val api_fanAck: CoolingFan.FanAck.Type,
  val api_setPoint: TempControlSoftwareSystem.SetPoint_i)
