package isolette.Monitor

import isolette.Isolette_Data_Model.Monitor_Mode
import org.sireum._
import isolette.Monitor._
import isolette._
import org.sireum.Random.Impl.Xoshiro256

// This file will not be overwritten so is safe to edit

class Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_Tests extends Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_TestHarness_ScalaTest_Generator {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  override val verbose: B = T

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  override val failOnUnsatPreconditions: B = F

  // profiles that will be used for the initialise tests
  override def getInitialiseProfiles: MSZ[Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Profile] = {
    return MSZ(getDefaultInitialiseProfile)
    //return MSZ()
  }

  // profiles that will be used to generate the incoming port values
  override def getProfiles_P: MSZ[Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Profile_P] = {
    return MSZ(getDefaultProfile_P)
    //return MSZ() // only run profiles that also generate pre state values of state variables
  }

  // profiles that will be used to generate the incoming port values
  // and the pre-state values of the state variables
  override def getProfiles_PS: MSZ[Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Profile_PS] = {

    var profiles = MSZ(getDefaultProfile_PS)

    // profile whose lower_alarm_temp and upper_alarm_temp configs will always satisfy
    // manage alarm's requirements (ie. [96..101] and [97..102] respectively)
    val boundLU = getDefaultProfile_PS(
      name = "Bound lower and upper alarm temp",
      numTests = 25,
      api_lower_alarm_temp = freshRandomLib.set_Config_F32(f32Config(96f, 101f)),
      api_upper_alarm_temp = freshRandomLib.set_Config_F32(f32Config(97f, 102f)))

    //profiles = MSZ(boundLU)

    // could either crank up numTests until desired coverage is reached, however that doesn't guarantee full
    // coverage will always be achieved.  Alternatively could continue tweaking/adding profiles so that the
    // generated tests are forced to explore the paths through the code that we're interested in like below

    // the behavior we want to explore is in the Normal_Monitor_Mode case so create a
    // monitor mode config whose filter only accepts that value
    val onlyNormal = freshRandomLib.get_Config_Isolette_Data_ModelMonitor_ModeType(
      filter = mode => mode == Monitor_Mode.Normal_Monitor_Mode)

    // profile that generates current temp values that are closer to the constrained lower and upper alarm
    // temp [95..103]. Note that this profile will include boundLU's configs for the lower and upper alarm values
    val boundLUC = boundLU(
      name = "boundLU + only normal mode + bound current temp",
      api_monitor_mode = freshRandomLib.set_Config_Isolette_Data_ModelMonitor_ModeType(onlyNormal),
      api_current_tempWstatus = freshRandomLib.set_Config_F32(f32Config(95f, 103f))
    )

    val REQ_MA_3_left = boundLUC(
      name = "boundLUC + generate some tests trying to cover the left partition of REQ_MA_3",
      numTests = 25,
      api_current_tempWstatus = freshRandomLib.set_Config_F32(f32Config(96f, 101f))
    )

    val REQ_MA_3_right = boundLUC(
      name = "boundLUC + generate some tests trying to cover the right partition of REQ_MA_3",
      numTests = 25,
      api_monitor_mode = freshRandomLib.set_Config_Isolette_Data_ModelMonitor_ModeType(onlyNormal),
      api_current_tempWstatus = freshRandomLib.set_Config_F32(f32Config(97f, 102f))
    )

    val REQ_MA_4 = boundLUC(
      name = "boundLUC + generate some tests trying to cover/reach REQ_MA_4",
      numTests = 25,
      api_current_tempWstatus = freshRandomLib.set_Config_F32(f32Config(96.6f, 101.4f))
    )

    //profiles = MSZ(boundLU, boundLUC, REQ_MA_3_left, REQ_MA_3_right, REQ_MA_4)

    return profiles
  }

  def f32Config(lower: F32, upper: F32): Config_F32 = {
    return Config_F32(low = Some(lower), high = Some(upper), attempts = 100, verbose = this.verbose, filter = _ => T)
  }
}