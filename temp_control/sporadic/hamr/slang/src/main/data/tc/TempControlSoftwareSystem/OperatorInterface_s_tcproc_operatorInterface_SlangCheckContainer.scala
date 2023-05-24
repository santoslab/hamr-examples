// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// This file was auto-generated.  Do not edit

// SlangCheck test container to hold the incoming port values for operatorInterface
@datatype class OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer (
  val api_tempChanged: Option[art.Empty],
  val api_currentTemp: TempSensor.Temperature_i)
