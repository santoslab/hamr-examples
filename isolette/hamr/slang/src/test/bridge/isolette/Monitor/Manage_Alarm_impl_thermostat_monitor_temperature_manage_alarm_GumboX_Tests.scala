package isolette.Monitor

import org.sireum._
import isolette.Monitor._
import isolette._
import org.sireum.Random.Impl.Xoshiro256

// This file will not be overwritten so is safe to edit

class Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_Tests extends Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX_TestHarness_ScalaTest_Generator {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  override val verbose: B = F

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  override val failOnUnsatPreconditions: B = F

  //override def numInitialiseTests: Z = 0 // don't run any initialise tests

  // profiles that will be used to generate the incoming port values
  override def getProfiles_P: ISZ[Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Profile_P] = {
    ISZ(getDefaultProfile_P)
    //ISZ() // only run profiles that also generate pre state values of state variables
  }

  // profiles that will be used to generate the incoming port values
  // and the pre-state values of the state variables
  override def getProfiles_PS: ISZ[Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Profile_PS] = {

    var profiles = ISZ(getDefaultProfile_PS)

    // profile whose lower_alarm_temp and upper_alarm_temp configs will always satisfy
    // manage alarm's requirements (ie. [96..101] and [97..102] respectively)
    var boundLU = getDefaultProfile_PS

    boundLU = boundLU(
      name = "Bound lower and upper alarm temp",
      numTests = 20,
      api_lower_alarm_temp = boundLU.api_lower_alarm_temp.set_Config_F32(f32Config(96f, 101f)),
      api_upper_alarm_temp = boundLU.api_upper_alarm_temp.set_Config_F32(f32Config(97f, 102f)))

    //profiles = ISZ(boundLU)

    // could either crank up numTests until desired coverage is reached, however that doesn't guarantee full
    // coverage will always be achieved.  Alternatively could continue tweaking/adding profiles so that the
    // generated tests are forced to explore the paths through the code that we're interested in like below


    // profile that generates current temp values that are closer to the constrained lower and upper alarm
    // temp [95..103]. Note that this profile will include boundLU's configs for the lower and upper alarm values
    val boundLUC = boundLU(
      name = "boundLU + bound current temp",
      numTests = 5,
      api_current_tempWstatus = boundLU.api_current_tempWstatus.set_Config_F32(f32Config(95f, 103f))
    )

    val REQ_MA_3_left = boundLUC(
      name = "boundLUC + generate some tests to cover left partition of REQ_MA_3",
      numTests = 5,
      api_current_tempWstatus = boundLUC.api_current_tempWstatus.set_Config_F32(f32Config(96f, 96.5f))
    )

    val REQ_MA_3_right = boundLUC(
      name = "boundLUC + generate some tests to cover the right partition of REQ_MA_3",
      numTests = 5,
      api_current_tempWstatus = boundLUC.api_current_tempWstatus.set_Config_F32(f32Config(101.5f, 102f))
    )

    val REQ_MA_4 = boundLUC(
      name = "boundLUC + generate some tests that cover/reach REQ_MA_4",
      numTests = 5,
      api_current_tempWstatus = boundLUC.api_current_tempWstatus.set_Config_F32(f32Config(96.6f, 101.4f))
    )

    //profiles = ISZ(boundLUC, REQ_MA_3_left, REQ_MA_3_right, REQ_MA_4)

    return profiles
  }

  def f32Config(lower: F32, upper: F32): Config_F32 = {
    return Config_F32(low = Some(lower), high = Some(upper), attempts = 100, verbose = this.verbose, filter = _ => T)
  }
}