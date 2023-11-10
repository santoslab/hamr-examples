// #Sireum

package isolette.Devices

import org.sireum._
import isolette._

// This file will not be overwritten so is safe to edit
object Heat_Source_impl_heat_source_cpi_heat_controller {

  // TODO:  Since initialization now guarantees that this is never NONE,
  //   should we represent the internal state as an Isolette_Data_Model.On_Off.Type value?
  var heater_state: Isolette_Data_Model.On_Off.Type = Isolette_Data_Model.On_Off.Off

  def initialise(api: Heat_Source_impl_Initialization_Api): Unit = {
    heater_state = Isolette_Data_Model.On_Off.Off

    // must initiliaze outgoing data ports during initialization phase
    api.put_heat_out(Isolette_Environment.Heat.Dummy_Head_Enum)
  }

  def timeTriggered(api: Heat_Source_impl_Operational_Api): Unit = {
    if (heater_state != api.get_heat_control().get) {
      heater_state = api.get_heat_control().get
      api.logInfo(s"Received command: ${heater_state}")
      Heat_Source_Native.setState(heater_state)
    }
  }

  def activate(api: Heat_Source_impl_Operational_Api): Unit = { }

  def deactivate(api: Heat_Source_impl_Operational_Api): Unit = { }

  def finalise(api: Heat_Source_impl_Operational_Api): Unit = { }

  def recover(api: Heat_Source_impl_Operational_Api): Unit = { }
}

@ext object Heat_Source_Native {
  def setState(value: Isolette_Data_Model.On_Off.Type): Unit = $
}
