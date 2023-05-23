// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._
import RTS.GumboXUtil.GumboXResult

// This file was auto-generated.  Do not edit
@msig trait Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_GumboX_TestHarness extends Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_TestApi {
  def testComputeCB(
      api_input: Base_Types.Boolean,
      api_manualActuatorInput: Base_Types.Boolean): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    //   actuator does not have incoming ports or state variables

    // Step 2 [CheckPre]: check/filter based on pre-condition.
    //   actuator's compute entry point does not have top level assume clauses

    // Step 3 [PutInPorts]: put values on the input ports
    put_input(api_input)
    put_manualActuatorInput(api_manualActuatorInput)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_output: Base_Types.Boolean = get_output().get

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = RTS.Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_GumboX.compute_CEP_Post(api_input, api_manualActuatorInput, api_output)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
