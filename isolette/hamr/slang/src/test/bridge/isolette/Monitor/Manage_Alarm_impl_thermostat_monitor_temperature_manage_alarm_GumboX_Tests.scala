package isolette.Monitor

import org.sireum._
import isolette.Monitor._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_Tests extends Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_TestHarness {

  {
    val ranLibcurrent_tempWstatus = new RandomLib(new Random.Gen64Impl(Xoshiro256.create))
    val ranLiblower_alarm_temp = new RandomLib(new Random.Gen64Impl(Xoshiro256.create))
    val ranLibmonitor_mode = new RandomLib(new Random.Gen64Impl(Xoshiro256.create))
    val ranLibupper_alarm_temp = new RandomLib(new Random.Gen64Impl(Xoshiro256.create))

    for (i <- 0 to 100) {
      this.registerTest(i.toString) {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numRetries && retry) {
          val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
          val api_lower_alarm_temp = ranLiblower_alarm_temp.next_Isolette_Data_ModelTemp_impl()
          val api_monitor_mode = ranLibmonitor_mode.next_Isolette_Data_ModelMonitor_ModeType()
          val api_upper_alarm_temp = ranLibupper_alarm_temp.next_Isolette_Data_ModelTemp_impl()

          println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                      |    current_tempWstatus = $api_current_tempWstatus
                      |    lower_alarm_temp = $api_lower_alarm_temp
                      |    monitor_mode = $api_monitor_mode
                      |    upper_alarm_temp = $api_upper_alarm_temp""".render)

          testComputeCB(api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp) match {
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