// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// This file was auto-generated.  Do not edit
object SetPoint_i_GumboX {
  /** invariant SetPoint_Data_Invariant
    */
  @strictpure def SetPoint_Data_Invariant_Invariant(value: TempControlSoftwareSystem.SetPoint_i): B =
    value.low.degrees >= 50.0f &
      value.high.degrees <= 110.0f &
      value.low.degrees <= value.high.degrees

  /** D-Inv Data Invariant for TempControlSoftwareSystem.SetPoint_i
    */
  @strictpure def D_Inv_SetPoint_i(value: TempControlSoftwareSystem.SetPoint_i): B =
    (SetPoint_Data_Invariant_Invariant(value))

  /** D-Inv-Guard Data Invariant for TempControlSoftwareSystem.SetPoint_i
    */
  @strictpure def D_Inv_Guard_SetPoint_i(value: Option[TempControlSoftwareSystem.SetPoint_i]): B =
    value.nonEmpty -->: D_Inv_SetPoint_i(value.get)
}