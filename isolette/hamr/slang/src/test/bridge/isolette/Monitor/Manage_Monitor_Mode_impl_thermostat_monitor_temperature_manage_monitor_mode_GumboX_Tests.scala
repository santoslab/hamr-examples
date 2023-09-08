package isolette.Monitor

import org.sireum._
import isolette.Monitor._
import isolette._
import org.sireum.Random.Impl.Xoshiro256

// This file will not be overwritten so is safe to edit

class Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_Tests extends Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX_TestHarness_ScalaTest_Generator {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  override val verbose: B = F

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  override val failOnUnsatPreconditions: B = F

  // profiles that will be used to generate the incoming port values
  override def getProfiles_P: ISZ[Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Profile_P] = ISZ(getDefaultProfile_P)

  // profiles that will be used to generate the incoming port values
  // and the pre-state values of the state variables
  override def getProfiles_PS: ISZ[Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Profile_PS] = ISZ(getDefaultProfile_PS)
}