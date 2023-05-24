// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// This file was auto-generated.  Do not edit
object OperatorInterface_s_tcproc_operatorInterface_GumboX {
  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param api_setPoint outgoing event data port
    */
  @strictpure def inititialize_IEP_Post (
      api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i]): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with operatorInterface's state variables and outgoing ports
     TempControlSoftwareSystem.SetPoint_i_GumboX.D_Inv_Guard_SetPoint_i(api_setPoint))

  /** CEP-Pre: Compute Entrypoint Pre-Condition for operatorInterface
    *
    * @param api_tempChanged incoming event port
    * @param api_currentTemp incoming data port
    */
  @strictpure def compute_CEP_Pre (
      api_tempChanged: Option[art.Empty],
      api_currentTemp: TempSensor.Temperature_i): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with operatorInterface's state variables and incoming ports
     TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i(api_currentTemp))

  /** CEP-Post: Compute Entrypoint Post-Condition for operatorInterface
    *
    * @param api_setPoint outgoing event data port
    */
  @strictpure def compute_CEP_Post (
      api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i]): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with operatorInterface's state variables and outgoing ports
     TempControlSoftwareSystem.SetPoint_i_GumboX.D_Inv_Guard_SetPoint_i(api_setPoint))
}
