// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._

// This file was auto-generated.  Do not edit
object Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_Bridge_GumboX {
  /** guarantees actuatorOutput
    * @param api_input port variable
    * @param api_manualActuatorInput port variable
    * @param api_output port variable
    */
  @strictpure def compute_spec_actuatorOutput_guarantee(
      api_input: Base_Types.Boolean,
      api_manualActuatorInput: Base_Types.Boolean,
      api_output: Base_Types.Boolean): B =
    api_output == (api_input | api_manualActuatorInput)


  /**
    * @param api_input port variable
    * @param api_manualActuatorInput port variable
    * @param api_output port variable
    */
  @strictpure def time_triggered_oracle(
      api_input: Base_Types.Boolean,
      api_manualActuatorInput: Base_Types.Boolean,
      api_output: Base_Types.Boolean): B =
    compute_spec_actuatorOutput_guarantee(api_input, api_manualActuatorInput, api_output)
}
