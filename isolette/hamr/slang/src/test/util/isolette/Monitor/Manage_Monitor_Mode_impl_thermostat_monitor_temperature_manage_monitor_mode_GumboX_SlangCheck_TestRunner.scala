// #Sireum

package isolette.Monitor

import org.sireum._
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SlangCheckContainer]
  with Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibinterface_failure: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibinternal_failure: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SlangCheckContainer = {
    val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
    val api_interface_failure = ranLibinterface_failure.next_Isolette_Data_ModelFailure_Flag_impl()
    val api_internal_failure = ranLibinternal_failure.next_Isolette_Data_ModelFailure_Flag_impl()
    return Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SlangCheckContainer(
      api_current_tempWstatus, api_interface_failure, api_internal_failure
    )
  }

  override def toCompactJson(o: Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SlangCheckContainer): String = {
    return isolette.JSON.fromMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SlangCheckContainer = {
    isolette.JSON.toMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_current_tempWstatus, o.api_interface_failure, o.api_internal_failure) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}