package isolette.Monitor

import org.sireum._
import isolette.Monitor._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

trait Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX_TestHarness_ScalaTest_Generator extends Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX_TestHarness_ScalaTest {

  def failOnUnsatPreconditions: B = F

  def seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)

  def getProfiles_P: ISZ[Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P]

  def getDefaultProfile_P: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P = {
    return Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P (
      name = "Default Port Profile", 
      numTests = 100, 
      api_current_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_lower_alarm_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_monitor_mode = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_upper_alarm_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))))
  }

  def getProfiles_PS: ISZ[Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_PS]

  def getDefaultProfile_PS: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_PS = {
    return Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_PS (
      name = "Default Port and State Variable Profile", 
      numTests = 100, 
      In_lastCmd = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_current_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_lower_alarm_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_monitor_mode = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_upper_alarm_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))))
  }

  def next(profile: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P): Option[Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P] = {
    try {
      val api_current_tempWstatus = profile.api_current_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_lower_alarm_tempWstatus = profile.api_lower_alarm_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_monitor_mode = profile.api_monitor_mode.nextIsolette_Data_ModelMonitor_ModeType()
      val api_upper_alarm_tempWstatus = profile.api_upper_alarm_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()

      return Some(Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(api_current_tempWstatus,api_lower_alarm_tempWstatus,api_monitor_mode,api_upper_alarm_tempWstatus))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  def nextwL(profile: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_PS): Option[Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS] = {
    try {
      val In_lastCmd = profile.In_lastCmd.nextIsolette_Data_ModelOn_OffType()
      val api_current_tempWstatus = profile.api_current_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_lower_alarm_tempWstatus = profile.api_lower_alarm_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_monitor_mode = profile.api_monitor_mode.nextIsolette_Data_ModelMonitor_ModeType()
      val api_upper_alarm_tempWstatus = profile.api_upper_alarm_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()

      return Some(Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(In_lastCmd,api_current_tempWstatus,api_lower_alarm_tempWstatus,api_monitor_mode,api_upper_alarm_tempWstatus))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  def numInitialiseTests: Z = 100

  {
    for (i <- 0 to numInitialiseTests) {
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

  for (profile <- getProfiles_P) {
    testComputeCB_Profile_P(profile)
  }

  def testComputeCB_Profile_P(profile: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_P): Unit = {
    for (i <- 0 to profile.numTests) {
      this.registerTest(s"Profile \"${profile.name}\": testComputeCB_$i") {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numTestVectorGenRetries && retry) {
          next(profile) match {
            case Some(o) =>

              if (verbose && j > 0) {
                println(s"Retry $j:")
              }

              val results = testComputeCBV(o)

              if (verbose) {
                val tq = "\"\"\""
                println(st"""Replay Unit Test:
                            |  test("Replay: Profile \"${profile.name}\": testComputeCB_$i") {
                            |    val json = st${tq}${isolette.JSON.fromMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(o, T)}${tq}.render
                            |    val testVector = isolette.JSON.toMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(json).left
                            |    assert (testComputeCBV(testVector) == isolette.GumboXUtil.GumboXResult.$results)
                            |  }""".render)
              }

              results match {
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

  for (profile <- getProfiles_PS) {
    testComputeCBwL_Profile_PS(profile)
  }

  def testComputeCBwL_Profile_PS(profile: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Profile_PS): Unit = {
    for (i <- 0 to profile.numTests) {
      this.registerTest(s"Profile \"${profile.name}\": testComputeCBwL_$i") {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numTestVectorGenRetries && retry) {
          nextwL(profile) match {
            case Some(o) =>

              if (verbose && j > 0) {
                println(s"Retry $j:")
              }

              val results = testComputeCBwLV(o)

              if (verbose) {
                val tq = "\"\"\""
                println(st"""Replay Unit Test:
                            |  test("Replay: Profile \"${profile.name}\": testComputeCBwL_$i") {
                            |    val json = st${tq}${isolette.JSON.fromMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(o, T)}${tq}.render
                            |    val testVector = isolette.JSON.toMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(json).left
                            |    assert (testComputeCBwLV(testVector) == isolette.GumboXUtil.GumboXResult.$results)
                            |  }""".render)
              }

              results match {
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