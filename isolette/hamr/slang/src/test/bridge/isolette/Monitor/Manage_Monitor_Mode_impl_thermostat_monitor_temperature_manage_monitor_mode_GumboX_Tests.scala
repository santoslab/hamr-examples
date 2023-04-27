package isolette.Monitor

import org.sireum._
import isolette.Monitor._
import isolette.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_Tests extends Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_TestHarness {

  {
    val ranLibcurrent_tempWstatus = new RandomLib(new Random.Gen64Impl(Xoshiro256.create))
    val ranLibinterface_failure = new RandomLib(new Random.Gen64Impl(Xoshiro256.create))
    val ranLibinternal_failure = new RandomLib(new Random.Gen64Impl(Xoshiro256.create))

    for (i <- 0 to 100) {
      this.registerTest(i.toString) {
        var retry: B = T

        for (j <- 0 to 100 if retry) {
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
        }

        if (retry) {
          fail ("Unable to satisfy precondition")
        }
      }
    }
  }
}