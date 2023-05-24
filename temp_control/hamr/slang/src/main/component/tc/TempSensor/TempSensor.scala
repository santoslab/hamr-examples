package tc.TempSensor

import tc.Base_Types

object TempSensorDevice_Ext_Sim {
  // represents the most recent "sensed" temperature
  var lastTemperature = Defs.defaultTemp

  // high bound of range of simulated values
  val sim_highbound = 105f;
  // low bound of range of simulated values
  val sim_lowbound = 50f;
  // direction/amount (positive or negative 1) of change in temperature
  var sim_increment = 1f;

  // Implement method from extension interface.
  //
  // This method simulates obtaining a sensor reading from a
  // hardware sensor.
  def currentTempGet(): Temperature_i = {
    // simulate rising and falling temperature
    var nextTemperatureDegrees: Base_Types.Float_32 = lastTemperature.degrees
    nextTemperatureDegrees = nextTemperatureDegrees + sim_increment
    if (nextTemperatureDegrees > sim_highbound) {
      // on next invocation, start moving the temperature in a cooler direction
      sim_increment = -1f
    } else if (nextTemperatureDegrees < sim_lowbound) {
      // on next invocation, start moving the temperature in a warmer direction
      sim_increment = 1f
    }
    // update the most recent "sensed" temperature
    lastTemperature = Temperature_i(nextTemperatureDegrees)
    return lastTemperature
  }
}
