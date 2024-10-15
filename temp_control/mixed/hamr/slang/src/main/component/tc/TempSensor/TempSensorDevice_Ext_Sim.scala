package tc.TempSensor

import org.sireum.Random
import org.sireum.Random.Impl.Xoshiro256
import org.sireum.hamr.vision.value.RandomLib
import tc.CoolingFan.FanDevice_Ext_Sim
import tc.Base_Types

object TempSensorDevice_Ext_Sim {
  // represents the most recent "sensed" temperature
  var lastTemperature = Defs.defaultTemp

  // direction/amount (positive or negative 1) of change in temperature
  var delta = 4f;

  val random = RandomLib(Random.Gen64Impl(Xoshiro256.create))

  // Implement method from extension interface.
  //
  // This method simulates obtaining a sensor reading from a
  // hardware sensor.
  def currentTempGet(): Temperature_i = {
    // simulate rising and falling temperature
    val nextTemperatureDegrees: Base_Types.Float_32 = {
      // 'query' the fan device to see if it's on.  This wouldn't be possible if
      // the threads were running on different processors/partitions
      if (FanDevice_Ext_Sim.isOn)
        random.gen.nextF32Between(lastTemperature.degrees - delta, lastTemperature.degrees)
      else
        random.gen.nextF32Between(lastTemperature.degrees, lastTemperature.degrees + delta)
    }
    // update the most recent "sensed" temperature
    lastTemperature = Temperature_i(nextTemperatureDegrees)
    return lastTemperature
  }
}
