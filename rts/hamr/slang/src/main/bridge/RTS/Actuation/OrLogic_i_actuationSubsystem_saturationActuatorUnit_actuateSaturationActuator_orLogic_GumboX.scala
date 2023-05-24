// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._

// This file was auto-generated.  Do not edit
object OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_GumboX {
  /** Compute Entrypoint Contract
    *
    * guarantees orOutput
    * @param api_channel1 incoming data port
    * @param api_channel2 incoming data port
    * @param api_actuate outgoing data port
    */
  @strictpure def compute_spec_orOutput_guarantee(
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_actuate: Base_Types.Boolean): B =
    api_actuate == (api_channel1 | api_channel2)

  /** CEP-T-Guar: Top-level guarantee contracts for orLogic's compute entrypoint
    *
    * @param api_channel1 incoming data port
    * @param api_channel2 incoming data port
    * @param api_actuate outgoing data port
    */
  @strictpure def compute_CEP_T_Guar (
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_actuate: Base_Types.Boolean): B =
    compute_spec_orOutput_guarantee(api_channel1, api_channel2, api_actuate)

  /** CEP-Post: Compute Entrypoint Post-Condition for orLogic
    *
    * @param api_channel1 incoming data port
    * @param api_channel2 incoming data port
    * @param api_actuate outgoing data port
    */
  @strictpure def compute_CEP_Post (
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_actuate: Base_Types.Boolean): B =
    (// CEP-Guar: guarantee clauses of orLogic's compute entrypoint
     compute_CEP_T_Guar (api_channel1, api_channel2, api_actuate))
}
