package isolette.Devices

import isolette._
import org.sireum.$internal.MutableMarker
import org.sireum._

object Temperature_Sensor__InjectionProvider_Ext {

  def init(): Unit = {
    Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Injection_Service.register(
      new Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Injection_Provider {

        var lastTemperature = Isolette_Data_Model.PhysicalTemp_impl(InitialValues.DEFAULT_CURRENT_TEMPERATURE)
        var rand = new java.util.Random

        override def pre_receiveInput(): Unit = {
          // simulate the arrival of data on the unconnected air incoming data port
          lastTemperature = if (rand.nextBoolean()) {
            val delta =
              F32((rand.nextGaussian() * 3).abs.min(2).toFloat *
                (if (Heat_Source_Native_Ext.isOn) 1 else -1))
            lastTemperature(lastTemperature.value + delta)
          } else {
            lastTemperature
          }

          val air_port_id = Arch.isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat.initialization_api.air_Id
          art.Art.insertInInfrastructurePort(
            air_port_id,
            Isolette_Data_Model.PhysicalTemp_impl_Payload(lastTemperature))
        }

        override def string: String = toString

        override def $clonable: Boolean = F

        override def $clonable_=(b: Boolean): MutableMarker = this

        override def $owned: Boolean = F

        override def $owned_=(b: Boolean): MutableMarker = this

        override def $clone: MutableMarker = this
      })
  }
}