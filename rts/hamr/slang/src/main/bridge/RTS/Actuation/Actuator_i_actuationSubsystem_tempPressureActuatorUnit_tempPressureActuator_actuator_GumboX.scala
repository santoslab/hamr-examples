// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._

// This file was auto-generated.  Do not edit
object Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantees initOutputDataPort
    *   The Initialize Entry Point must initialize all component 
    *   local state and all output data ports.
    * @param api_output outgoing data port
    */
  @strictpure def initialize_initOutputDataPort (
      api_output: Base_Types.Boolean): B =
    api_output == F

  /** IEP-Guar: Initialize Entrypoint Contracts for actuator
    *
    * @param api_output outgoing data port
    */
  @strictpure def initialize_IEP_Guar (
      api_output: Base_Types.Boolean): B =
    initialize_initOutputDataPort(api_output)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param api_output outgoing data port
    */
  @strictpure def inititialize_IEP_Post (
      api_output: Base_Types.Boolean): B =
    (// IEP-Guar: Initialize Entrypoint contract for actuator
     initialize_IEP_Guar(api_output))

  /** Compute Entrypoint Contract
    *
    * guarantees actuatorOutput
    * @param api_input incoming data port
    * @param api_manualActuatorInput incoming data port
    * @param api_output outgoing data port
    */
  @strictpure def compute_spec_actuatorOutput_guarantee(
      api_input: Base_Types.Boolean,
      api_manualActuatorInput: Base_Types.Boolean,
      api_output: Base_Types.Boolean): B =
    api_output == (api_input | api_manualActuatorInput)

  /** CEP-T-Guar: Top-level guarantee contracts for actuator's compute entrypoint
    *
    * @param api_input incoming data port
    * @param api_manualActuatorInput incoming data port
    * @param api_output outgoing data port
    */
  @strictpure def compute_CEP_T_Guar (
      api_input: Base_Types.Boolean,
      api_manualActuatorInput: Base_Types.Boolean,
      api_output: Base_Types.Boolean): B =
    compute_spec_actuatorOutput_guarantee(api_input, api_manualActuatorInput, api_output)

  /** CEP-Post: Compute Entrypoint Post-Condition for actuator
    *
    * @param api_input incoming data port
    * @param api_manualActuatorInput incoming data port
    * @param api_output outgoing data port
    */
  @strictpure def compute_CEP_Post (
      api_input: Base_Types.Boolean,
      api_manualActuatorInput: Base_Types.Boolean,
      api_output: Base_Types.Boolean): B =
    (// CEP-Guar: guarantee clauses of actuator's compute entrypoint
     compute_CEP_T_Guar (api_input, api_manualActuatorInput, api_output))
}
