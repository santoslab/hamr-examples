// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// This file was auto-generated.  Do not edit
object TempControl_s_tcproc_tempControl_GumboX {
  /** I-Assm: Integration constraint on tempControl's incoming data port currentTemp
    *
    * assume currentTempRange
    */
  @strictpure def I_Assm_currentTemp(currentTemp: TempSensor.Temperature_i): B =
    currentTemp.degrees >= -70.0f &
      currentTemp.degrees <= 180.0f

  // I-Assm-Guard: Integration constraint on tempControl's incoming data port currentTemp
  @strictpure def I_Assm_Guard_currentTemp(currentTemp: TempSensor.Temperature_i): B =
    I_Assm_currentTemp(currentTemp)

  /** Initialize Entrypoint Contract
    *
    * guarantees defautSetPoint
    * @param currentSetPoint post-state state variable
    */
  @strictpure def initialize_defautSetPoint (
      currentSetPoint: TempControlSoftwareSystem.SetPoint_i): B =
    currentSetPoint.low.degrees == 70.0f &&
      currentSetPoint.high.degrees == 80.0f

  /** Initialize Entrypoint Contract
    *
    * guarantees defaultFanStates
    * @param currentFanState post-state state variable
    */
  @strictpure def initialize_defaultFanStates (
      currentFanState: CoolingFan.FanCmd.Type): B =
    currentFanState == CoolingFan.FanCmd.Off

  /** Initialize Entrypoint Contract
    *
    * guarantees defaultLatestTemp
    * @param latestTemp post-state state variable
    */
  @strictpure def initialize_defaultLatestTemp (
      latestTemp: TempSensor.Temperature_i): B =
    latestTemp.degrees == 72.0f

  /** IEP-Guar: Initialize Entrypoint Contracts for tempControl
    *
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def initialize_IEP_Guar (
      currentFanState: CoolingFan.FanCmd.Type,
      currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      latestTemp: TempSensor.Temperature_i,
      api_fanCmd: Option[CoolingFan.FanCmd.Type]): B =
    initialize_defautSetPoint(currentSetPoint) &
    initialize_defaultFanStates(currentFanState) &
    initialize_defaultLatestTemp(latestTemp)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def inititialize_IEP_Post (
      currentFanState: CoolingFan.FanCmd.Type,
      currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      latestTemp: TempSensor.Temperature_i,
      api_fanCmd: Option[CoolingFan.FanCmd.Type]): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with tempControl's state variables and outgoing ports
     TempControlSoftwareSystem.SetPoint_i_GumboX.D_Inv_SetPoint_i(currentSetPoint) &
     TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i(latestTemp) & 

     // IEP-Guar: Initialize Entrypoint contract for tempControl
     initialize_IEP_Guar(currentFanState, currentSetPoint, latestTemp, api_fanCmd))

  /** CEP-Pre: Compute Entrypoint Pre-Condition for tempControl
    *
    * @param In_currentFanState pre-state state variable
    * @param In_currentSetPoint pre-state state variable
    * @param In_latestTemp pre-state state variable
    * @param api_tempChanged incoming event port
    * @param api_fanAck incoming event data port
    * @param api_setPoint incoming event data port
    * @param api_currentTemp incoming data port
    */
  @strictpure def compute_CEP_Pre (
      In_currentFanState: CoolingFan.FanCmd.Type,
      In_currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      In_latestTemp: TempSensor.Temperature_i,
      api_tempChanged: Option[art.Empty],
      api_fanAck: Option[CoolingFan.FanAck.Type],
      api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i],
      api_currentTemp: TempSensor.Temperature_i): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with tempControl's state variables and incoming ports
     TempControlSoftwareSystem.SetPoint_i_GumboX.D_Inv_SetPoint_i(In_currentSetPoint) & 
     TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i(In_latestTemp) & 
     TempControlSoftwareSystem.SetPoint_i_GumboX.D_Inv_Guard_SetPoint_i(api_setPoint) & 
     TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i(api_currentTemp) & 

     // I-Assm-Guard: Integration constraints for tempControl's incoming ports
     I_Assm_Guard_currentTemp(api_currentTemp))

  /** Compute Entrypoint Contract
    *
    * guarantees TC_Req_01
    *   If the current temperature is less than the set point, then the fan state shall be Off.
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    */
  @strictpure def compute_spec_TC_Req_01_guarantee(
      currentFanState: CoolingFan.FanCmd.Type,
      currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      latestTemp: TempSensor.Temperature_i): B =
    (latestTemp.degrees < currentSetPoint.low.degrees) ->: (currentFanState == CoolingFan.FanCmd.Off)

  /** Compute Entrypoint Contract
    *
    * guarantees TC_Req_02
    *   If the current temperature is greater than the set point,
    *   then the fan state shall be On.
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    */
  @strictpure def compute_spec_TC_Req_02_guarantee(
      currentFanState: CoolingFan.FanCmd.Type,
      currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      latestTemp: TempSensor.Temperature_i): B =
    (latestTemp.degrees > currentSetPoint.high.degrees) ->: (currentFanState == CoolingFan.FanCmd.On)

  /** Compute Entrypoint Contract
    *
    * guarantees TC_Req_03
    *   If the current temperature is greater than or equal to the
    *   current low set point and less than or equal to the current high set point,
    *   then the current fan state is maintained.
    * @param In_currentFanState pre-state state variable
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    */
  @strictpure def compute_spec_TC_Req_03_guarantee(
      In_currentFanState: CoolingFan.FanCmd.Type,
      currentFanState: CoolingFan.FanCmd.Type,
      currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      latestTemp: TempSensor.Temperature_i): B =
    (latestTemp.degrees >= currentSetPoint.low.degrees &
       latestTemp.degrees <= currentSetPoint.high.degrees) ->: (currentFanState == In_currentFanState)

  /** Compute Entrypoint Contract
    *
    * guarantees mustSendFanCmd
    *   If the local record of the fan state was updated, 
    *   then send a fan command event with this updated value.
    * @param In_currentFanState pre-state state variable
    * @param currentFanState post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def compute_spec_mustSendFanCmd_guarantee(
      In_currentFanState: CoolingFan.FanCmd.Type,
      currentFanState: CoolingFan.FanCmd.Type,
      api_fanCmd: Option[CoolingFan.FanCmd.Type]): B =
    (In_currentFanState != currentFanState) -->:
      (api_fanCmd.nonEmpty &&
        api_fanCmd.get == currentFanState) &&
      (currentFanState == In_currentFanState) -->:
        api_fanCmd.isEmpty

  /** CEP-T-Guar: Top-level guarantee contracts for tempControl's compute entrypoint
    *
    * @param In_currentFanState pre-state state variable
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def compute_CEP_T_Guar (
      In_currentFanState: CoolingFan.FanCmd.Type,
      currentFanState: CoolingFan.FanCmd.Type,
      currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      latestTemp: TempSensor.Temperature_i,
      api_fanCmd: Option[CoolingFan.FanCmd.Type]): B =
    compute_spec_TC_Req_01_guarantee(currentFanState, currentSetPoint, latestTemp) &
    compute_spec_TC_Req_02_guarantee(currentFanState, currentSetPoint, latestTemp) &
    compute_spec_TC_Req_03_guarantee(In_currentFanState, currentFanState, currentSetPoint, latestTemp) &
    compute_spec_mustSendFanCmd_guarantee(In_currentFanState, currentFanState, api_fanCmd)

  /** CEP-Post: Compute Entrypoint Post-Condition for tempControl
    *
    * @param In_currentFanState pre-state state variable
    * @param In_currentSetPoint pre-state state variable
    * @param In_latestTemp pre-state state variable
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def compute_CEP_Post (
      In_currentFanState: CoolingFan.FanCmd.Type,
      In_currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      In_latestTemp: TempSensor.Temperature_i,
      currentFanState: CoolingFan.FanCmd.Type,
      currentSetPoint: TempControlSoftwareSystem.SetPoint_i,
      latestTemp: TempSensor.Temperature_i,
      api_fanCmd: Option[CoolingFan.FanCmd.Type]): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with tempControl's state variables and outgoing ports
     TempControlSoftwareSystem.SetPoint_i_GumboX.D_Inv_SetPoint_i(In_currentSetPoint) & 
     TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i(In_latestTemp) & 
     TempControlSoftwareSystem.SetPoint_i_GumboX.D_Inv_SetPoint_i(currentSetPoint) & 
     TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i(latestTemp) & 

     // CEP-Guar: guarantee clauses of tempControl's compute entrypoint
     compute_CEP_T_Guar (In_currentFanState, currentFanState, currentSetPoint, latestTemp, api_fanCmd))
}
