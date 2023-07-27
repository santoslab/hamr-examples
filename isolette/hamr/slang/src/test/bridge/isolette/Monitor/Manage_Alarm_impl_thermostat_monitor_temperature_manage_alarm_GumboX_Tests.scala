package isolette.Monitor

import org.sireum._
import isolette.Monitor._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
class Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_Tests extends Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_TestHarness_ScalaTest {

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  val failOnUnsatPreconditions: B = F

  val verbose: B = F

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblower_alarm_temp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibmonitor_mode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibupper_alarm_temp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblastCmd: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  def getTestVector(): Option[Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector] = {
    try {
      val api_current_tempWstatus = ranLibcurrent_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_lower_alarm_temp = ranLiblower_alarm_temp.nextIsolette_Data_ModelTemp_impl()
      val api_monitor_mode = ranLibmonitor_mode.nextIsolette_Data_ModelMonitor_ModeType()
      val api_upper_alarm_temp = ranLibupper_alarm_temp.nextIsolette_Data_ModelTemp_impl()

      return Some(Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(api_current_tempWstatus,api_lower_alarm_temp,api_monitor_mode,api_upper_alarm_temp))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  def getTestVectorwL(): Option[Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL] = {
    try {
      val In_lastCmd = ranLiblastCmd.nextIsolette_Data_ModelOn_OffType()
      val api_current_tempWstatus = ranLibcurrent_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_lower_alarm_temp = ranLiblower_alarm_temp.nextIsolette_Data_ModelTemp_impl()
      val api_monitor_mode = ranLibmonitor_mode.nextIsolette_Data_ModelMonitor_ModeType()
      val api_upper_alarm_temp = ranLibupper_alarm_temp.nextIsolette_Data_ModelTemp_impl()

      return Some(Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(In_lastCmd,api_current_tempWstatus,api_lower_alarm_temp,api_monitor_mode,api_upper_alarm_temp))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  {
    for (i <- 0 to GumboXUtil.numTests) {
      this.registerTest(s"testInitialiseCB_$i") {
        testInitialiseCB() match {
          case GumboXResult.Pre_Condition_Unsat =>
            halt("Infeasible as initialize entry points cannot contain assume clauses and cannot access incoming ports or state variables")
          case GumboXResult.Post_Condition_Fail =>
            fail ("Post condition did not hold")
          case GumboXResult.Post_Condition_Pass =>
            if (verbose) {
              println ("Success!")
            }
        }
      }
    }
  }

  {

    for (i <- 0 to GumboXUtil.numTests) {
      this.registerTest(s"testComputeCB_$i") {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numTestVectorGenRetries && retry) {
          getTestVector() match {
            case Some(o) =>

              if (verbose) {
                println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                            |    current_tempWstatus = $o.api_current_tempWstatus
                            |    lower_alarm_temp = $o.api_lower_alarm_temp
                            |    monitor_mode = $o.api_monitor_mode
                            |    upper_alarm_temp = $o.api_upper_alarm_temp""".render)
              }

              testComputeCB(o.api_current_tempWstatus, o.api_lower_alarm_temp, o.api_monitor_mode, o.api_upper_alarm_temp) match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println ("Success!")
                  }
                  retry = F
              }
            case _ =>
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }

  {

    for (i <- 0 to GumboXUtil.numTests) {
      this.registerTest(s"testComputeCBwL_$i") {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numTestVectorGenRetries && retry) {
          getTestVectorwL() match {
            case Some(o) =>

              if (verbose) {
                println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                            |    lastCmd = $o.In_lastCmd
                            |    current_tempWstatus = $o.api_current_tempWstatus
                            |    lower_alarm_temp = $o.api_lower_alarm_temp
                            |    monitor_mode = $o.api_monitor_mode
                            |    upper_alarm_temp = $o.api_upper_alarm_temp""".render)
              }

              testComputeCBwL(o.In_lastCmd, o.api_current_tempWstatus, o.api_lower_alarm_temp, o.api_monitor_mode, o.api_upper_alarm_temp) match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println ("Success!")
                  }
                  retry = F
              }
            case _ =>
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }
}