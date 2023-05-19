package isolette.Regulate

import org.sireum._
import isolette.Regulate._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_Tests extends Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness_ScalaTest {

  val failOnUnsatPreconditions: B = F

  {
    val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
    val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLiblower_desired_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibregulator_mode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibupper_desired_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

    // getInputs - needed
    def getInputs(): Option[Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_SlangCheckContainer] = {
      try {
        val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
        val api_lower_desired_tempWstatus = ranLiblower_desired_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
        val api_regulator_mode = ranLibregulator_mode.next_Isolette_Data_ModelRegulator_ModeType()
        val api_upper_desired_tempWstatus = ranLibupper_desired_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()

        return Some(Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_SlangCheckContainer(api_current_tempWstatus,api_lower_desired_tempWstatus,api_regulator_mode,api_upper_desired_tempWstatus))
      } catch {
        case e: AssertionError => return None()
      }
    }

    for (i <- 0 to 100) {
      this.registerTest(i.toString) {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numRetries && retry) {
          getInputs() match {
            case Some(o) =>

              println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                        |    current_tempWstatus = $o.api_current_tempWstatus
                        |    lower_desired_tempWstatus = $o.api_lower_desired_tempWstatus
                        |    regulator_mode = $o.api_regulator_mode
                        |    upper_desired_tempWstatus = $o.api_upper_desired_tempWstatus""".render)

              testComputeCB(o.api_current_tempWstatus, o.api_lower_desired_tempWstatus, o.api_regulator_mode, o.api_upper_desired_tempWstatus) match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  // success
                  println ("Success!")
                  retry = F
              }
            case _ =>
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }
}