// #Sireum

package tc.CoolingFan

import org.sireum._
import tc._

// This file will not be overwritten so is safe to edit
object FanPeriodic_p_tcproc_fan {

  def initialise(api: FanPeriodic_p_Initialization_Api): Unit = {
    // The Initialize Entry Point must initialize all component local state and all output data ports.

    // initialize component local state
    //   (no component local state to initialize)

    // initialize output data ports
    api.put_fanAck(FanAck.Ok)
  }

  def timeTriggered(api: FanPeriodic_p_Operational_Api): Unit = {
    // log the received fan command
    val value = api.get_fanCmd().get
    api.logInfo(s"received fanCmd $value")

    // send actuation command to fan driver
    // via interface realized via Slang Extension "FanNative"
    val ack = FanDevice.fanCmdActuate(value)

    // put an event on fanAck out event data port to
    // notify subscribers (e.g., tempControl thermostat) that the
    // fan actuation has been achieved
    api.put_fanAck(ack)

    // log the actuation result
    api.logInfo(s"Actuation result: ${ack}")
  }

  def activate(api: FanPeriodic_p_Operational_Api): Unit = { }

  def deactivate(api: FanPeriodic_p_Operational_Api): Unit = { }

  def finalise(api: FanPeriodic_p_Operational_Api): Unit = { }

  def recover(api: FanPeriodic_p_Operational_Api): Unit = { }
}

//=================================================
//
//  Slang extension used to interface with non-Slang
//  code to turn the fan hardware on or off.
//
//  In this case, the extension is abstracting a call
//  to underlying communication/hardware infrastructure
//  to control the fan.
//
//  Early in development we may choose to simulate the
//  sensor.  Later we may construct a extension implementation that
//  writes to an actual hardware interface to control the fan.
//=================================================

@ext("FanDevice_Ext_Sim") object FanDevice {
  def fanCmdActuate(cmd: FanCmd.Type): FanAck.Type = $
}
