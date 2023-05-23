// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._

// This file was auto-generated.  Do not edit
object CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_GumboX {
  /** Compute Entrypoint Contract
    *
    * guarantees coincidenceOutput
    *   from actuationUnit.cry
    *   Coincidence_2_4 : [4]TripPort -> Bit
    *   Coincidence_2_4 x =
    *       (a&&b) || ((a||b) && (c||d)) || (c&&d)
    *   For specification redundancy, provide an alternate but equivalent specification
    *   of the concept 'at least two of the input channels are true.'
    * @param api_channel1 incoming data port
    * @param api_channel2 incoming data port
    * @param api_channel3 incoming data port
    * @param api_channel4 incoming data port
    * @param api_actuate outgoing data port
    */
  @strictpure def compute_spec_coincidenceOutput_guarantee(
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_channel3: Base_Types.Boolean,
      api_channel4: Base_Types.Boolean,
      api_actuate: Base_Types.Boolean): B =
    api_actuate == (api_channel1 & api_channel2 |
       api_channel1 & api_channel3 |
       api_channel1 & api_channel4 |
       api_channel2 & api_channel3 |
       api_channel2 & api_channel4 |
       api_channel3 & api_channel4)

  /** CEP-T-Guar: Top-level guarantee contracts for coincidenceLogic's compute entrypoint
    *
    * @param api_channel1 incoming data port
    * @param api_channel2 incoming data port
    * @param api_channel3 incoming data port
    * @param api_channel4 incoming data port
    * @param api_actuate outgoing data port
    */
  @strictpure def compute_CEP_T_Guar (
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_channel3: Base_Types.Boolean,
      api_channel4: Base_Types.Boolean,
      api_actuate: Base_Types.Boolean): B =
    compute_spec_coincidenceOutput_guarantee(api_channel1, api_channel2, api_channel3, api_channel4, api_actuate)

  /** CEP-Post: Compute Entrypoint Post-Condition for coincidenceLogic
    *
    * @param api_channel1 incoming data port
    * @param api_channel2 incoming data port
    * @param api_channel3 incoming data port
    * @param api_channel4 incoming data port
    * @param api_actuate outgoing data port
    */
  @strictpure def compute_CEP_Post (
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_channel3: Base_Types.Boolean,
      api_channel4: Base_Types.Boolean,
      api_actuate: Base_Types.Boolean): B =
    (// CEP-Guar: guarantee clauses of coincidenceLogic's compute entrypoint
     compute_CEP_T_Guar (api_channel1, api_channel2, api_channel3, api_channel4, api_actuate))
}