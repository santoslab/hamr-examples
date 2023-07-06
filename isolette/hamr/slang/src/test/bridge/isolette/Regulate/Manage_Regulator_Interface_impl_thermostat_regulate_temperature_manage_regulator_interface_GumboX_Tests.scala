package isolette.Regulate

import org.sireum._
import isolette.Regulate._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
class Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_Tests extends Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness_ScalaTest {

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  val failOnUnsatPreconditions: B = F

  val verbose: B = F

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblower_desired_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibregulator_mode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibupper_desired_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  def getTestVector(): Option[Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector] = {
    try {
      val api_current_tempWstatus = ranLibcurrent_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_lower_desired_tempWstatus = ranLiblower_desired_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_regulator_mode = ranLibregulator_mode.nextIsolette_Data_ModelRegulator_ModeType()
      val api_upper_desired_tempWstatus = ranLibupper_desired_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()

      return Some(Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(api_current_tempWstatus,api_lower_desired_tempWstatus,api_regulator_mode,api_upper_desired_tempWstatus))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  {
    for (i <- 0 to GumboXUtil.numTests) {
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
                            |    lower_desired_tempWstatus = $o.api_lower_desired_tempWstatus
                            |    regulator_mode = $o.api_regulator_mode
                            |    upper_desired_tempWstatus = $o.api_upper_desired_tempWstatus""".render)
              }

              testComputeCB(o.api_current_tempWstatus, o.api_lower_desired_tempWstatus, o.api_regulator_mode, o.api_upper_desired_tempWstatus) match {
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