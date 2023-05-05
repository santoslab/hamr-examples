// #Sireum

package isolette.Monitor

import org.sireum._
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container]
  with Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblower_alarm_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibmonitor_mode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibupper_alarm_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container = {
    val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
    val api_lower_alarm_tempWstatus = ranLiblower_alarm_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
    val api_monitor_mode = ranLibmonitor_mode.next_Isolette_Data_ModelMonitor_ModeType()
    val api_upper_alarm_tempWstatus = ranLibupper_alarm_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
    return Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container(
      api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus
    )
  }

  override def toCompactJson(o: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container): String = {
    return isolette.JSON.fromMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container(o, T)
  }

  override def fromJson(json: String): Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container = {
    isolette.JSON.toMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Container): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_current_tempWstatus, o.api_lower_alarm_tempWstatus, o.api_monitor_mode, o.api_upper_alarm_tempWstatus) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}