// #Sireum #Logika

package tc.CoolingFan

import org.sireum._
import tc._

// This file will not be overwritten so is safe to edit
object Fan_s_tcproc_fan {

  def initialise(api: Fan_s_Initialization_Api): Unit = {
    // The Initialize Entry Point must initialize all component local state and all output data ports.

    // initialize component local state
    //   (no component local state to initialize)

    // initialize output data ports
    //   (no data ports to initialize)
  }

  def handle_fanCmd(api: Fan_s_Operational_Api, value : CoolingFan.FanCmd.Type): Unit = {
    Contract(
      Modifies(api)
    )
    // log the received fan command
    api.logInfo(s"received fanCmd $value")

    // put an event on fanAck out event data port to
    // notify subscribers (e.g., tempControl thermostat) that the
    // fan actuation has been achieved
    api.put_fanAck(FanDevice.fanCmdActuate(value))

    // log the actuation result
    //api.logInfo(s"Actuation result: ${ack}")
  }

  def finalise(api: Fan_s_Operational_Api): Unit = { }
}

@ext("FanDevice_Ext_Sim") object FanDevice {
  def fanCmdActuate(cmd: FanCmd.Type): FanAck.Type = $
}