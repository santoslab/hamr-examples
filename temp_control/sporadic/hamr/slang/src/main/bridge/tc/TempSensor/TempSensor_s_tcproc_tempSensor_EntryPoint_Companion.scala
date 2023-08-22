// #Sireum

package tc.TempSensor

import org.sireum._
import art._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object TempSensor_s_tcproc_tempSensor_EntryPoint_Companion {

  var last_api_currentTemp: Option[TempSensor.Temperature_i] = None()
  def get_api_currentTemp: TempSensor.Temperature_i = {
    Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.operational_api.currentTemp_Id) match {
      case Some(TempSensor.Temperature_i_Payload(value)) =>
        last_api_currentTemp = Some(value)
        return value
      case _ => return last_api_currentTemp.get
    }
  }
  var preStateContainer_wL: Option[TempSensor_s_tcproc_tempSensor_PreState_wLContainer] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      TempSensor_s_tcproc_tempSensor_PostState_wLContainer(
        api_tempChanged = Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.operational_api.tempChanged_Id).asInstanceOf[Option[art.Empty]],
        api_currentTemp = get_api_currentTemp)

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observePostState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.id, tc.runtimemonitor.ObservationKind.tempSensor_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      TempSensor_s_tcproc_tempSensor_PreState_wLContainer())

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observePreState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.id, tc.runtimemonitor.ObservationKind.tempSensor_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      TempSensor_s_tcproc_tempSensor_PostState_wLContainer(
        api_tempChanged = Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.operational_api.tempChanged_Id).asInstanceOf[Option[art.Empty]],
        api_currentTemp = get_api_currentTemp)

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observePrePostState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempSensor.id, tc.runtimemonitor.ObservationKind.tempSensor_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}