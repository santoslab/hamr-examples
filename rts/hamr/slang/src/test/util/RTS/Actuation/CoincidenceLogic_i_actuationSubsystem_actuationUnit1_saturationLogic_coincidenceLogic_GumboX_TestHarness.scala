// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._
import RTS.GumboXUtil.GumboXResult

// This file was auto-generated.  Do not edit
@msig trait CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_GumboX_TestHarness extends CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_TestApi {
  def testComputeCB(
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_channel3: Base_Types.Boolean,
      api_channel4: Base_Types.Boolean): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    //   coincidenceLogic does not have incoming ports or state variables

    // Step 2 [CheckPre]: check/filter based on pre-condition.
    //   coincidenceLogic's compute entry point does not have top level assume clauses

    // Step 3 [PutInPorts]: put values on the input ports
    put_channel1(api_channel1)
    put_channel2(api_channel2)
    put_channel3(api_channel3)
    put_channel4(api_channel4)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 5 [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variables
    val api_actuate: Base_Types.Boolean = get_actuate().get

    // Step 6 [CheckPost]: invoke the oracle function
    val postResult = RTS.Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_GumboX.compute_CEP_Post(api_channel1, api_channel2, api_channel3, api_channel4, api_actuate)
    if (!postResult) {
      return GumboXResult.Post_Condition_Fail
    }

    return GumboXResult.Post_Condition_Pass
  }
}
