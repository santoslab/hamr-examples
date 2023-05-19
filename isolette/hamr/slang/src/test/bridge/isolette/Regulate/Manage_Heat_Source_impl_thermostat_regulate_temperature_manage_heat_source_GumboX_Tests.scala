package isolette.Regulate

import org.sireum._
import isolette.Regulate._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_Tests extends Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestHarness_ScalaTest {

  val failOnUnsatPreconditions: B = F

  {
    val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
    val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLiblower_desired_temp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibregulator_mode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibupper_desired_temp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

    // getInputs - needed
    def getInputs(): Option[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer] = {
      try {
        val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
        val api_lower_desired_temp = ranLiblower_desired_temp.next_Isolette_Data_ModelTemp_impl()
        val api_regulator_mode = ranLibregulator_mode.next_Isolette_Data_ModelRegulator_ModeType()
        val api_upper_desired_temp = ranLibupper_desired_temp.next_Isolette_Data_ModelTemp_impl()

        return Some(Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer(api_current_tempWstatus,api_lower_desired_temp,api_regulator_mode,api_upper_desired_temp))
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
                        |    lower_desired_temp = $o.api_lower_desired_temp
                        |    regulator_mode = $o.api_regulator_mode
                        |    upper_desired_temp = $o.api_upper_desired_temp""".render)

              testComputeCB(o.api_current_tempWstatus, o.api_lower_desired_temp, o.api_regulator_mode, o.api_upper_desired_temp) match {
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