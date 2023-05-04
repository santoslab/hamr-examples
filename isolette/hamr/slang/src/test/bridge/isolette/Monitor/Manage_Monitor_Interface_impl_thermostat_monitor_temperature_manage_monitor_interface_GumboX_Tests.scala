package isolette.Monitor

import org.sireum._
import isolette.Monitor._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX_Tests extends Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX_TestHarness_ScalaTest {

  {
    val seedGen = new Random.Gen64Impl(Xoshiro256.create)
    val ranLibcurrent_tempWstatus = new RandomLib(new Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLiblower_alarm_tempWstatus = new RandomLib(new Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibmonitor_mode = new RandomLib(new Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibupper_alarm_tempWstatus = new RandomLib(new Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

    for (i <- 0 to 100) {
      this.registerTest(i.toString) {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numRetries && retry) {
          val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
          val api_lower_alarm_tempWstatus = ranLiblower_alarm_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
          val api_monitor_mode = ranLibmonitor_mode.next_Isolette_Data_ModelMonitor_ModeType()
          val api_upper_alarm_tempWstatus = ranLibupper_alarm_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()

          println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                      |    current_tempWstatus = $api_current_tempWstatus
                      |    lower_alarm_tempWstatus = $api_lower_alarm_tempWstatus
                      |    monitor_mode = $api_monitor_mode
                      |    upper_alarm_tempWstatus = $api_upper_alarm_tempWstatus""".render)

          testComputeCB(api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus) match {
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