// #Sireum

package tc.TempSensor

import org.sireum._
import tc._

// This file was auto-generated.  Do not edit
object Temperature_i_GumboX {
  /** invariant AbsZero
    */
  @strictpure def AbsZero_Invariant(value: TempSensor.Temperature_i): B =
    value.degrees >= GUMBO_Definitions.GUMBO__Library.absoluteZero()

  /** D-Inv Data Invariant for TempSensor.Temperature_i
    */
  @strictpure def D_Inv_Temperature_i(value: TempSensor.Temperature_i): B =
    (AbsZero_Invariant(value))

  /** D-Inv-Guard Data Invariant for TempSensor.Temperature_i
    */
  @strictpure def D_Inv_Guard_Temperature_i(value: Option[TempSensor.Temperature_i]): B =
    value.nonEmpty -->: D_Inv_Temperature_i(value.get)
}