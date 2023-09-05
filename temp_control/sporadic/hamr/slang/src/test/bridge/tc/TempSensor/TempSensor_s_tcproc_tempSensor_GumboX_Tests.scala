package tc.TempSensor

import org.sireum._
import tc.TempSensor._
import tc._
import org.sireum.Random.Impl.Xoshiro256
import tc.CoolingFan.FanDevice_Ext_Sim

// This file will not be overwritten so is safe to edit

class TempSensor_s_tcproc_tempSensor_GumboX_Tests extends TempSensor_s_tcproc_tempSensor_GumboX_TestHarness_ScalaTest_Generator {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  override val verbose: B = F

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  override val failOnUnsatPreconditions: B = F

  override def getProfiles_P: ISZ[TempSensor_s_tcproc_tempSensor_Profile_P] = ISZ(getDefaultProfile_P)

  // TempSensor's currentTemp integration constraint requires it to be between -50f and 150f. The
  // simulated device either increments or decrements by 1f so we want the simulated device's
  // lastTemperature 'state' variable to be in a safe range to guarantee that whatever is sent on out
  // currentTemp will satisfies the integration constraint.

  val safeLastTemperatureRange: RandomLib = {
    val rl = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    rl.set_Config_F32(Config_F32(Some(TempSensorDevice_Ext_Sim.lowerLimit + 1f), Some(TempSensorDevice_Ext_Sim.upperLimit - 1f), 100, T, _ => T))
    rl
  }

  override def beforeEach(): Unit = {
    super.beforeEach()

    //FanDevice_Ext_Sim.isOn = safeLastTemperatureRange.nextB()
    val safeLastTemp = Temperature_i(safeLastTemperatureRange.nextF32())
    TempSensorDevice_Ext_Sim.lastTemperature = safeLastTemp

    // whether the temp sensor increments or decrements is based on whether the
    // fan is turned on.  However that is effectively constant when temp sensor is
    // tested in isolation so also randomize the fan state
    FanDevice_Ext_Sim.isOn = safeLastTemperatureRange.nextB()

    if (verbose) {
      // TODO: scala test doesn't capture/attach output for a given test during
      //       beforeEach and afterEach. Perhaps bake a, e.g., beforeCompute, afterInit, etc
      //       calls into the testHarness itself that the user can override

      println(s"Set temp sensor's lastTemperature = $safeLastTemp")
      println(s"Set fan isOn = ${FanDevice_Ext_Sim.isOn}")
    }

  }
}