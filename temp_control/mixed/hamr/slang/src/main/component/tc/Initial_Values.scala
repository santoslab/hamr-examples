// #Sireum

package tc

import org.sireum._
import tc.TempControlSoftwareSystem.SetPoint_i
import tc.TempSensor.Temperature_i

object Initial_Values {

  val defaultSetPoint: SetPoint_i = SetPoint_i(low = Temperature_i(70.0f), high = Temperature_i(90.0f))

}
