// #Sireum

package tc.TempSensor

import org.sireum._
import tc.Base_Types

// generated from any "Defs" clause in TempSensor package
object Defs {
  val minTempDegrees: Base_Types.Float_32 = -50.0f
  // This won't be necessary after full support for constants are added
  @spec def minTempDegrees_Inv = Invariant(
    minTempDegrees == -50.0f
  )
  val maxTempDegrees: Base_Types.Float_32 = 150.0f
  // This won't be necessary after full support for constants are added
  @spec def maxTempDegrees_Inv = Invariant(
    maxTempDegrees == 150.0f
  )

  val defaultTempDegrees: Base_Types.Float_32 = 72.0f
  // This won't be necessary after full support for constants are added
  @spec def defaultTempDegrees_Inv = Invariant(
    defaultTempDegrees == 72.0f
  )

  val defaultTemp: Temperature_i = Temperature_i(defaultTempDegrees)
  // This won't be necessary after full support for constants are added
  @spec def defaultTemp_Inv = Invariant(
    // defaultTemp == Temperature_i(defaultTempDegrees)
    //   Robby: must use version below since non-local variables are not supported yet???
    defaultTemp == Temperature_i(72.0f)
  )

  @strictpure def TempSensorRange(temp: Temperature_i): Base_Types.Boolean = {
    temp.degrees >= -50.0f & temp.degrees <= 150.0f
    // Can't use the following currently because @strictpure functions can't reference
    //  non-local variables
    // temp.degrees >= minTempDegrees & temp.degrees <= maxTempDegrees
  }
}
