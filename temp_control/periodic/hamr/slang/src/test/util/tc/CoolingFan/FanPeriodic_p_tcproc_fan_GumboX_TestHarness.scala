// #Sireum

package tc.CoolingFan

import org.sireum._
import tc._
import tc.GumboXUtil.GumboXResult

// This file was auto-generated.  Do not edit
@msig trait FanPeriodic_p_tcproc_fan_GumboX_TestHarness extends FanPeriodic_p_tcproc_fan_TestApi {
  def testComputeCB(
      api_fanCmd: CoolingFan.FanCmd.Type): GumboXResult.Type = {
    // Step 1 [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    //   fan does not have incoming ports or state variables

    // Step 2 [CheckPre]: check/filter based on pre-condition.
    //   fan's compute entry point does not have top level assume clauses

    // Step 3 [PutInPorts]: put values on the input ports
    put_fanCmd(api_fanCmd)

    // Step 4 [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // Step 6 [CheckPost]: invoke the oracle function
    //   fan does not contain guarantee clauses for its compute entrypoint

    return GumboXResult.Post_Condition_Pass
  }
}
