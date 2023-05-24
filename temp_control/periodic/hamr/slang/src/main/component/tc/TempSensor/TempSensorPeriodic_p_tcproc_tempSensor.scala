// #Sireum #Logika

package tc.TempSensor

import org.sireum._
import tc._

// This file will not be overwritten so is safe to edit
object TempSensorPeriodic_p_tcproc_tempSensor {

  def initialise(api: TempSensorPeriodic_p_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initializes
        api.currentTemp.degrees == 72.0f
        // END INITIALIZES ENSURES
      )
    )
    api.put_currentTemp(Temperature_i(72.0f))
  }

  def timeTriggered(api: TempSensorPeriodic_p_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // read temperature from HARDWARE temperature sensor,
    // via interface realized via Slang Extension "TempSensorNative"
    var temp = TempSensorDevice.currentTempGet()
    // set the out data port currentTemp to hold the read temperature
    //  BUG - unauthorized mod of temperature data
    // val adjDegrees = temp.degrees + 13.0f // adjust temperature upward
    // temp = Temperature_i(adjDegrees)
    api.put_currentTemp(temp)
  }

  def activate(api: TempSensorPeriodic_p_Operational_Api): Unit = { }

  def deactivate(api: TempSensorPeriodic_p_Operational_Api): Unit = { }

  def finalise(api: TempSensorPeriodic_p_Operational_Api): Unit = { }

  def recover(api: TempSensorPeriodic_p_Operational_Api): Unit = { }
}

//=================================================
//
//  Slang extension used to interface with non-Slang
//  code to retreive a temperature value.
//
//  In this case, the extension is abstracting a call
//  to underlying communication/hardware infrastructure
//  to retrieve a sensor value.
//
//  Early in development we may choose to simulate the
//  sensor.  Later we may construct a extension implementation that
//  reads from actual hardware.
//=================================================

@ext("TempSensorDevice_Ext_Sim") object TempSensorDevice {
  def currentTempGet(): Temperature_i = Contract.Only(
    Ensures(Res[Temperature_i].degrees >= -50.0f & Res[Temperature_i].degrees <= 150.0f)
  )
}
