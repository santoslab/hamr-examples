// #Sireum

package tc.TempSensor

import org.sireum._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@datatype class TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container (
  )

@datatype class TempSensorPeriodic_p_tcproc_tempSensor_PreState_wLContainer (
  )

@datatype class TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container (
  val api_currentTemp: TempSensor.Temperature_i)

@datatype class TempSensorPeriodic_p_tcproc_tempSensor_PostState_wLContainer (
  val api_currentTemp: TempSensor.Temperature_i)