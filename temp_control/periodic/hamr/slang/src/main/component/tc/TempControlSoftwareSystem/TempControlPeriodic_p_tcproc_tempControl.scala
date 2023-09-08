// #Sireum #Logika

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._
import tc.TempSensor._
import tc.CoolingFan._

// This file will not be overwritten so is safe to edit
object TempControlPeriodic_p_tcproc_tempControl {

  // BEGIN STATE VARS
  var latestFanCmd: CoolingFan.FanCmd.Type = CoolingFan.FanCmd.byOrdinal(0).get
  // END STATE VARS

  def initialise(api: TempControlPeriodic_p_Initialization_Api): Unit = {
    Contract(
      Modifies(
        api,
        // BEGIN INITIALIZES MODIFIES
        latestFanCmd
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initLatestFanCmd
        //   Initialize state variable
        latestFanCmd == CoolingFan.FanCmd.Off,
        // guarantee initFanCmd
        //   Initial fan command
        api.fanCmd == CoolingFan.FanCmd.Off
        // END INITIALIZES ENSURES
      )
    )
    // initialize thread local variables
    latestFanCmd = CoolingFan.FanCmd.Off
    // initialize output data port
    api.put_fanCmd(latestFanCmd)
  }

  def timeTriggered(api: TempControlPeriodic_p_Operational_Api): Unit = {
    Contract(
      Modifies(
        api,
        // BEGIN COMPUTE MODIFIES timeTriggered
        latestFanCmd
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee altCurrentTempLTSetPoint
        //   If current temperature is less than
        //   the current low set point, then the fan state shall be Off
        (api.currentTemp.degrees < api.setPoint.low.degrees) ->: (latestFanCmd == CoolingFan.FanCmd.Off &&
           api.fanCmd == CoolingFan.FanCmd.Off),
        // guarantee altCurrentTempGTSetPoint
        //   If current temperature is greater than
        //   the current high set point, then the fan state shall be On
        (api.currentTemp.degrees > api.setPoint.high.degrees) ->: (latestFanCmd == CoolingFan.FanCmd.On &
           api.fanCmd == CoolingFan.FanCmd.On),
        // guarantee altCurrentTempInRange
        //   If current temperature is greater than or equal to the 
        //   current low set point and less than or equal to the current high set point, 
        //   then the current fan state is maintained.
        (api.currentTemp.degrees >= api.setPoint.low.degrees &
           api.currentTemp.degrees <= api.setPoint.high.degrees) -->:
          (latestFanCmd == In(latestFanCmd) &
            api.fanCmd == latestFanCmd),
        // case currentTempLTSetPoint
        //   If current temperature is less than
        //   the current low set point, then the fan state shall be Off
        (api.currentTemp.degrees < api.setPoint.low.degrees) -->: (latestFanCmd == CoolingFan.FanCmd.Off &
          api.fanCmd == CoolingFan.FanCmd.Off),
        // case currentTempGTSetPoint
        //   If current temperature is greater than
        //   the current high set point, then the fan state shall be On
        (api.currentTemp.degrees > api.setPoint.high.degrees) -->: (latestFanCmd == CoolingFan.FanCmd.On &
          api.fanCmd == CoolingFan.FanCmd.On),
        // case currentTempInRange
        //   If current temperature is greater than or equal to the 
        //   current low set point and less than or equal to the current high set point, 
        //   then the current fan state is maintained.
        (api.currentTemp.degrees >= api.setPoint.low.degrees &
           api.currentTemp.degrees <= api.setPoint.high.degrees) -->: (latestFanCmd == In(latestFanCmd) &
          api.fanCmd == latestFanCmd)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // Note the following was originally needed to help SMT out
    // Deduce( |- (api.setPoint.high.degrees >= api.setPoint.low.degrees))
    // get the current temperature
    val currentTemp: Temperature_i = api.get_currentTemp().get

    // get the current set point
    val setPoint: SetPoint_i = api.get_setPoint().get
    // Deduce( |- (setPoint.high.degrees >= setPoint.low.degrees))


    // get the current fan acknowledge
    //  Note: in a more complete system, we might set up a status or error mode for the entire system
    val fanAck: FanAck.Type = api.get_fanAck().get

    // enforce control laws for fanCmd
    if (currentTemp.degrees < setPoint.low.degrees) {
      // if current temp is below low set point,
      latestFanCmd = FanCmd.Off
      api.logInfo("Set fan command: Off")
    } else if (currentTemp.degrees > setPoint.high.degrees) {
      // if current temp exceeds high set point,
      latestFanCmd = FanCmd.On
      api.logInfo("Set fan command: On")
    } else {
      // Note: This is a situation where it would be nice to have the options of the true data flow model
      // where we could read the previous value of an output data port
      api.logInfo("Fan state unchanged")
    }

    // Deduce( |- (setPoint.high.degrees >= setPoint.low.degrees))
    // Deduce( |- (currentTemp.degrees > setPoint.high.degrees))
    api.put_fanCmd(latestFanCmd)
  }

  def activate(api: TempControlPeriodic_p_Operational_Api): Unit = { }

  def deactivate(api: TempControlPeriodic_p_Operational_Api): Unit = { }

  def finalise(api: TempControlPeriodic_p_Operational_Api): Unit = { }

  def recover(api: TempControlPeriodic_p_Operational_Api): Unit = { }
}
