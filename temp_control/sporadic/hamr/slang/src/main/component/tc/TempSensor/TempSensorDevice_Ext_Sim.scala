package tc.TempSensor

import tc.Base_Types
import tc.CoolingFan.FanDevice_Ext_Sim

object TempSensorDevice_Ext_Sim {
  // represents the most recent "sensed" temperature
  var lastTemperature = Defs.defaultTemp

  // Implement method from extension interface.
  //
  // This method simulates obtaining a sensor reading from a
  // hardware sensor.
  def currentTempGet(): Temperature_i = {
    // simulate rising and falling temperature
    var nextTemperatureDegrees: Base_Types.Float_32 = lastTemperature.degrees
    nextTemperatureDegrees = nextTemperatureDegrees + (if (FanDevice_Ext_Sim.isOn) -1 else 1)
    // update the most recent "sensed" temperature
    lastTemperature = Temperature_i(nextTemperatureDegrees)
    return lastTemperature
  }
}
