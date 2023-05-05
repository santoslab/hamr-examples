package isolette.Monitor

import org.sireum._
import isolette.Monitor._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_Tests extends Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_TestHarness_ScalaTest {

  {
    val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
    val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibinterface_failure: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibinternal_failure: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

    for (i <- 0 to 100) {
      this.registerTest(i.toString) {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numRetries && retry) {
          val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
          val api_interface_failure = ranLibinterface_failure.next_Isolette_Data_ModelFailure_Flag_impl()
          val api_internal_failure = ranLibinternal_failure.next_Isolette_Data_ModelFailure_Flag_impl()

          println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                      |    current_tempWstatus = $api_current_tempWstatus
                      |    interface_failure = $api_interface_failure
                      |    internal_failure = $api_internal_failure""".render)

          testComputeCB(api_current_tempWstatus, api_interface_failure, api_internal_failure) match {
            case GumboXResult.Pre_Condition_Unsat =>
            case GumboXResult.Post_Condition_Fail =>
              fail ("Post condition did not hold")
              retry = F
            case GumboXResult.Post_Condition_Pass =>
              // success
              println ("Success!")
              retry = F
          }
          j = j + 1
        }

        if (retry) {
          fail ("Unable to satisfy precondition")
        }
      }
    }
  }
}