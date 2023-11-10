// #Sireum

package isolette.Devices

import org.sireum._
import isolette._

// This file will not be overwritten so is safe to edit
object Temperature_Sensor_impl_temperature_sensor_cpi_thermostat {

  def initialise(api: Temperature_Sensor_impl_Initialization_Api): Unit = {
    Temperature_Sensor__InjectionProvider.init()

    val defaultTemp: Isolette_Data_Model.Temp_impl = Isolette_Data_Model.Temp_impl(InitialValues.DEFAULT_CURRENT_TEMPERATURE)
    val defaultTempWstatus = Isolette_Data_Model.TempWstatus_impl(defaultTemp.value, Isolette_Data_Model.ValueStatus.Valid)
    api.put_current_tempWstatus(defaultTempWstatus)
  }

  def timeTriggered(api: Temperature_Sensor_impl_Operational_Api): Unit = {
    val t = api.get_air().get // air is unconnected so simulating values via injection in Temperature_Sensor__InjectionProvider_Ext$

    // TODO:
    //  Status value (Valid, Invalid) of sensed temperature.
    //  Determine what meaningful approach should followed to choose a status value.
    //  As of now, the status value is always set to "Valid"
    val current_tempWstatus = Isolette_Data_Model.TempWstatus_impl(t.value, Isolette_Data_Model.ValueStatus.Valid)
    api.put_current_tempWstatus(current_tempWstatus)
    api.logInfo(s"Sensed temperature: ${t.value}")
  }

  def activate(api: Temperature_Sensor_impl_Operational_Api): Unit = { }

  def deactivate(api: Temperature_Sensor_impl_Operational_Api): Unit = { }

  def finalise(api: Temperature_Sensor_impl_Operational_Api): Unit = { }

  def recover(api: Temperature_Sensor_impl_Operational_Api): Unit = { }
}

@ext object Temperature_Sensor__InjectionProvider {
  def init(): Unit = $
}