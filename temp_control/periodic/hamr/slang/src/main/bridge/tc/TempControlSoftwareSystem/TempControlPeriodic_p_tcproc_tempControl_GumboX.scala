// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
object TempControlPeriodic_p_tcproc_tempControl_GumboX {
  /** I-Assm: Integration constraint on tempControl's incoming data port currentTemp
    *
    * assume currentTempRange
    */
  @strictpure def I_Assm_currentTemp(currentTemp: TempSensor.Temperature_i): B =
    currentTemp.degrees >= -70.0f &
      currentTemp.degrees <= 80.0f

  // I-Assm-Guard: Integration constraint on tempControl's incoming data port currentTemp
  @strictpure def I_Assm_Guard_currentTemp(currentTemp: TempSensor.Temperature_i): B =
    I_Assm_currentTemp(currentTemp)

  /** Initialize Entrypoint Contract
    *
    * guarantee initLatestFanCmd
    *   Initialize state variable
    * @param latestFanCmd post-state state variable
    */
  @strictpure def initialize_initLatestFanCmd (
      latestFanCmd: CoolingFan.FanCmd.Type): B =
    latestFanCmd == CoolingFan.FanCmd.Off

  /** Initialize Entrypoint Contract
    *
    * guarantee initFanCmd
    *   Initial fan command
    * @param api_fanCmd outgoing data port
    */
  @strictpure def initialize_initFanCmd (
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    api_fanCmd == CoolingFan.FanCmd.Off

  /** IEP-Guar: Initialize Entrypoint Contracts for tempControl
    *
    * @param latestFanCmd post-state state variable
    * @param api_fanCmd outgoing data port
    */
  @strictpure def initialize_IEP_Guar (
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    initialize_initLatestFanCmd(latestFanCmd) &
    initialize_initFanCmd(api_fanCmd)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param latestFanCmd post-state state variable
    * @param api_fanCmd outgoing data port
    */
  @strictpure def inititialize_IEP_Post (
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    (// IEP-Guar: Initialize Entrypoint contract for tempControl
     initialize_IEP_Guar(latestFanCmd, api_fanCmd))

  /** IEP-Post: Initialize Entrypoint Post-Condition via container
    *
    * @param post Container holding the value of incoming ports and the pre-state values of state variables
    */
  @strictpure def inititialize_IEP_Post_Container (post: TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS): B =
    inititialize_IEP_Post (
      latestFanCmd = post.latestFanCmd,
      api_fanCmd = post.api_fanCmd)

  /** CEP-Pre: Compute Entrypoint Pre-Condition for tempControl
    *
    * @param In_latestFanCmd pre-state state variable
    * @param api_currentTemp incoming data port
    * @param api_fanAck incoming data port
    * @param api_setPoint incoming data port
    */
  @strictpure def compute_CEP_Pre (
      In_latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_fanAck: CoolingFan.FanAck.Type,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with tempControl's state variables and incoming ports
     TempSensor.Temperature_i.D_Inv_Temperature_i(api_currentTemp) & 
     TempControlSoftwareSystem.SetPoint_i.D_Inv_SetPoint_i(api_setPoint) & 

     // I-Assm-Guard: Integration constraints for tempControl's incoming ports
     I_Assm_Guard_currentTemp(api_currentTemp))

  /** CEP-Pre: Compute Entrypoint Pre-Condition for tempControl via container
    *
    * @param pre Container holding the value of incoming ports and the pre-state values of state variables
    */
  @strictpure def compute_CEP_Pre_Container(pre: TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS): B =
    compute_CEP_Pre(
      In_latestFanCmd = pre.In_latestFanCmd,
      api_currentTemp = pre.api_currentTemp,
      api_fanAck = pre.api_fanAck,
      api_setPoint = pre.api_setPoint)

  /** Compute Entrypoint Contract
    *
    * guarantee altCurrentTempLTSetPoint
    *   If current temperature is less than
    *   the current low set point, then the fan state shall be Off
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_spec_altCurrentTempLTSetPoint_guarantee(
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    (api_currentTemp.degrees < api_setPoint.low.degrees) ->: (latestFanCmd == CoolingFan.FanCmd.Off &&
       api_fanCmd == CoolingFan.FanCmd.Off)

  /** Compute Entrypoint Contract
    *
    * guarantee altCurrentTempGTSetPoint
    *   If current temperature is greater than
    *   the current high set point, then the fan state shall be On
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_spec_altCurrentTempGTSetPoint_guarantee(
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    (api_currentTemp.degrees > api_setPoint.high.degrees) ->: (latestFanCmd == CoolingFan.FanCmd.On &
       api_fanCmd == CoolingFan.FanCmd.On)

  /** Compute Entrypoint Contract
    *
    * guarantee altCurrentTempInRange
    *   If current temperature is greater than or equal to the 
    *   current low set point and less than or equal to the current high set point, 
    *   then the current fan state is maintained.
    * @param In_latestFanCmd pre-state state variable
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_spec_altCurrentTempInRange_guarantee(
      In_latestFanCmd: CoolingFan.FanCmd.Type,
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    (api_currentTemp.degrees >= api_setPoint.low.degrees &
       api_currentTemp.degrees <= api_setPoint.high.degrees) -->:
      (latestFanCmd == In_latestFanCmd &
        api_fanCmd == latestFanCmd)

  /** CEP-T-Guar: Top-level guarantee contracts for tempControl's compute entrypoint
    *
    * @param In_latestFanCmd pre-state state variable
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_CEP_T_Guar (
      In_latestFanCmd: CoolingFan.FanCmd.Type,
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    compute_spec_altCurrentTempLTSetPoint_guarantee(latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd) &
    compute_spec_altCurrentTempGTSetPoint_guarantee(latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd) &
    compute_spec_altCurrentTempInRange_guarantee(In_latestFanCmd, latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd)

  /** guarantee currentTempLTSetPoint
    *   If current temperature is less than
    *   the current low set point, then the fan state shall be Off
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_case_currentTempLTSetPoint(
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    (api_currentTemp.degrees < api_setPoint.low.degrees) -->:
      (latestFanCmd == CoolingFan.FanCmd.Off &
         api_fanCmd == CoolingFan.FanCmd.Off)

  /** guarantee currentTempGTSetPoint
    *   If current temperature is greater than
    *   the current high set point, then the fan state shall be On
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_case_currentTempGTSetPoint(
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    (api_currentTemp.degrees > api_setPoint.high.degrees) -->:
      (latestFanCmd == CoolingFan.FanCmd.On &
         api_fanCmd == CoolingFan.FanCmd.On)

  /** guarantee currentTempInRange
    *   If current temperature is greater than or equal to the 
    *   current low set point and less than or equal to the current high set point, 
    *   then the current fan state is maintained.
    * @param In_latestFanCmd pre-state state variable
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_case_currentTempInRange(
      In_latestFanCmd: CoolingFan.FanCmd.Type,
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    (api_currentTemp.degrees >= api_setPoint.low.degrees &
       api_currentTemp.degrees <= api_setPoint.high.degrees) -->:
      (latestFanCmd == In_latestFanCmd &
         api_fanCmd == latestFanCmd)

  /** CEP-T-Case: Top-Level case contracts for tempControl's compute entrypoint
    *
    * @param In_latestFanCmd pre-state state variable
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_CEP_T_Case (
      In_latestFanCmd: CoolingFan.FanCmd.Type,
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    compute_case_currentTempLTSetPoint(latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd) &
    compute_case_currentTempGTSetPoint(latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd) &
    compute_case_currentTempInRange(In_latestFanCmd, latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd)

  /** CEP-Post: Compute Entrypoint Post-Condition for tempControl
    *
    * @param In_latestFanCmd pre-state state variable
    * @param latestFanCmd post-state state variable
    * @param api_currentTemp incoming data port
    * @param api_setPoint incoming data port
    * @param api_fanCmd outgoing data port
    */
  @strictpure def compute_CEP_Post (
      In_latestFanCmd: CoolingFan.FanCmd.Type,
      latestFanCmd: CoolingFan.FanCmd.Type,
      api_currentTemp: TempSensor.Temperature_i,
      api_setPoint: TempControlSoftwareSystem.SetPoint_i,
      api_fanCmd: CoolingFan.FanCmd.Type): B =
    (// CEP-Guar: guarantee clauses of tempControl's compute entrypoint
     compute_CEP_T_Guar (In_latestFanCmd, latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd) & 

     // CEP-T-Case: case clauses of tempControl's compute entrypoint
     compute_CEP_T_Case (In_latestFanCmd, latestFanCmd, api_currentTemp, api_setPoint, api_fanCmd))

  /** CEP-Post: Compute Entrypoint Post-Condition for tempControl via containers
    *
    * @param pre Container holding the values of incoming ports and the pre-state values of state variables
    * @param post Container holding the values of outgoing ports and the post-state values of state variables
    */
  @strictpure def compute_CEP_Post_Container(
      pre: TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS,
      post: TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS): B =
    compute_CEP_Post(
      In_latestFanCmd = pre.In_latestFanCmd,
      latestFanCmd = post.latestFanCmd,
      api_currentTemp = pre.api_currentTemp,
      api_setPoint = pre.api_setPoint,
      api_fanCmd = post.api_fanCmd)
}
