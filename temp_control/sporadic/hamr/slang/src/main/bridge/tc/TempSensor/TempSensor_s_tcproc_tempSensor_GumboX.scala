// #Sireum

package tc.TempSensor

import org.sireum._
import tc._

// This file was auto-generated.  Do not edit
object TempSensor_s_tcproc_tempSensor_GumboX {
  /** I-Guar: Integration constraint on tempSensor's outgoing data port currentTemp
    *
    * guarantee Sensor_Temperature_Range
    */
  @strictpure def I_Guar_currentTemp(currentTemp: TempSensor.Temperature_i): B =
    TempSensor.GUMBO__Library.inRange(currentTemp)

  // I_Guar-Guard: Integration constraint on tempSensor's outgoing data port currentTemp
  @strictpure def I_Guar_Guard_currentTemp(currentTemp: Option[TempSensor.Temperature_i]): B =
    currentTemp.nonEmpty -->: I_Guar_currentTemp(currentTemp.get)

  /** Initialize Entrypoint Contract
    *
    * guarantees initializes
    * @param api_currentTemp outgoing data port
    */
  @strictpure def initialize_initializes (
      api_currentTemp: TempSensor.Temperature_i): B =
    api_currentTemp.degrees == TempSensor_s_tcproc_tempSensor.defaultTempDegrees()

  /** IEP-Guar: Initialize Entrypoint Contracts for tempSensor
    *
    * @param api_tempChanged outgoing event port
    * @param api_currentTemp outgoing data port
    */
  @strictpure def initialize_IEP_Guar (
      api_tempChanged: Option[art.Empty],
      api_currentTemp: TempSensor.Temperature_i): B =
    initialize_initializes(api_currentTemp)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param api_tempChanged outgoing event port
    * @param api_currentTemp outgoing data port
    */
  @strictpure def inititialize_IEP_Post (
      api_tempChanged: Option[art.Empty],
      api_currentTemp: TempSensor.Temperature_i): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with tempSensor's state variables and outgoing ports
     TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i(api_currentTemp) & 

     // I-Guar-Guard: Integration constraints for tempSensor's outgoing ports"
     I_Guar_currentTemp(api_currentTemp) & 

     // IEP-Guar: Initialize Entrypoint contract for tempSensor
     initialize_IEP_Guar(api_tempChanged, api_currentTemp))

  /** CEP-Post: Compute Entrypoint Post-Condition for tempSensor
    *
    * @param api_tempChanged outgoing event port
    * @param api_currentTemp outgoing data port
    */
  @strictpure def compute_CEP_Post (
      api_tempChanged: Option[art.Empty],
      api_currentTemp: TempSensor.Temperature_i): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with tempSensor's state variables and outgoing ports
     TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i(api_currentTemp) & 

     // I-Guar-Guard: Integration constraints for tempSensor's outgoing ports
     I_Guar_currentTemp(api_currentTemp))
}
