package isolette.Monitor

import isolette.Isolette_Data_Model._
import org.sireum
import org.sireum.$internal.MutableMarker

object Manage_Monitor_Mode__InjectionProvider_Ext {

  def init(): Unit = {
    Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Injection_Service.register(
      new Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Injection_Provider {
        override def pre_receiveInput(): Unit = {
          // simulate the arrival of data on unconnected internal_failure incoming data port
          val internal_failure_id = isolette.Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.initialization_api.internal_failure_Id
          art.Art.insertInInfrastructurePort(internal_failure_id, Failure_Flag_impl_Payload(Failure_Flag_impl(false)))
        }

        override def string: sireum.String = toString

        override def $clonable: Boolean = false

        override def $clonable_=(b: Boolean): MutableMarker = this

        override def $owned: Boolean = false

        override def $owned_=(b: Boolean): MutableMarker = this

        override def $clone: MutableMarker = this
      }
    )
  }
}