// #Sireum

package tc.CoolingFan

import org.sireum._
import tc._

// This file was auto-generated.  Do not edit

@enum object FanCmd {
  "On"
  "Off"
}

object FanCmd_Payload {
  def example(): FanCmd_Payload = {
    return FanCmd_Payload(CoolingFan.FanCmd.byOrdinal(0).get)
  }
}

@datatype class FanCmd_Payload(value: CoolingFan.FanCmd.Type) extends art.DataContent
