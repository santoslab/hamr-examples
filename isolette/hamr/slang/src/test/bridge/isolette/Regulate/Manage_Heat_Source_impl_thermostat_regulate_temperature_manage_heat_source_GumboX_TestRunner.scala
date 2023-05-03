package isolette.Regulate

import org.sireum._
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Impl.Xoshiro256

class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestRunner
  extends Random.Gen.TestRunner[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container] {

  var clonable: Boolean = true
  var owned: Boolean = false
  var ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.create))
  var ranLiblower_desired_temp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.create))
  var ranLibregulator_mode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.create))
  var ranLibupper_desired_temp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.create))

  override def $clonable: Boolean = {
    return clonable
  }

  override def $clonable_=(b: Boolean): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestRunner = {
    clonable = b
    return this
  }

  override def $owned: Boolean = {
    return owned
  }

  override def $owned_=(b: Boolean): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestRunner = {
    owned = b
    return this
  }

  override def $clone: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestRunner = {
    val r = new Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestRunner
    r.ranLibcurrent_tempWstatus = ranLibcurrent_tempWstatus
    r.ranLiblower_desired_temp = ranLiblower_desired_temp
    r.ranLibregulator_mode = ranLibregulator_mode
    r.ranLibupper_desired_temp = ranLibupper_desired_temp
    return r
  }

  override def next(): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container = {
    val api_current_tempWstatus = ranLibcurrent_tempWstatus.next_Isolette_Data_ModelTempWstatus_impl()
    val api_lower_desired_temp = ranLiblower_desired_temp.next_Isolette_Data_ModelTemp_impl()
    val api_regulator_mode = ranLibregulator_mode.next_Isolette_Data_ModelRegulator_ModeType()
    val api_upper_desired_temp = ranLibupper_desired_temp.next_Isolette_Data_ModelTemp_impl()
    return Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container(
      api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp
    )
  }

  override def toCompactJson(o: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container): String = {
    return isolette.JSON.fromRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container(o, T)
  }

  override def fromJson(json: String): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container = {
    isolette.JSON.toRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg)
    }
  }

  override def test(o: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Container): B = {
    art.Art.initTest(isolette.Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source)
    val t = new Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_Tests()
    val r: B = t.testComputeCB(o.api_current_tempWstatus, o.api_lower_desired_temp, o.api_regulator_mode, o.api_upper_desired_temp) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    art.Art.finalizeTest(isolette.Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source)
    return r
  }

  override def string: String = {
    return "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestRunner"
  }
}
