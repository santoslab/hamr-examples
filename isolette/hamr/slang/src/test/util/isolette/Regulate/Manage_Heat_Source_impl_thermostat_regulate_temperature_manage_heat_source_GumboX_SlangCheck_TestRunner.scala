// #Sireum

package isolette.Regulate

import org.sireum._
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer]
  with Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblower_desired_temp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibregulator_mode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibupper_desired_temp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer = {
    val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
    val api_lower_desired_temp = ranLiblower_desired_temp.next_Isolette_Data_ModelTemp_impl()
    val api_regulator_mode = ranLibregulator_mode.next_Isolette_Data_ModelRegulator_ModeType()
    val api_upper_desired_temp = ranLibupper_desired_temp.next_Isolette_Data_ModelTemp_impl()
    return Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer(
      api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp
    )
  }

  override def toCompactJson(o: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer): String = {
    return isolette.JSON.fromRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer = {
    isolette.JSON.toRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_current_tempWstatus, o.api_lower_desired_temp, o.api_regulator_mode, o.api_upper_desired_temp) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}