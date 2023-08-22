// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import art._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object OperatorInterface_s_tcproc_operatorInterface_EntryPoint_Companion {

  var preStateContainer_wL: Option[OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(
        api_setPoint = 
          if (Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.operational_api.setPoint_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.operational_api.setPoint_Id).get.asInstanceOf[TempControlSoftwareSystem.SetPoint_i_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observePostState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.id, tc.runtimemonitor.ObservationKind.operatorInterface_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(
        api_tempChanged = Art.observeInPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.operational_api.tempChanged_Id).asInstanceOf[Option[art.Empty]], 
        api_currentTemp = Art.observeInPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.operational_api.currentTemp_Id).get.asInstanceOf[TempSensor.Temperature_i_Payload].value))

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observePreState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.id, tc.runtimemonitor.ObservationKind.operatorInterface_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(
        api_setPoint = 
          if (Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.operational_api.setPoint_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.operational_api.setPoint_Id).get.asInstanceOf[TempControlSoftwareSystem.SetPoint_i_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observePrePostState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface.id, tc.runtimemonitor.ObservationKind.operatorInterface_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}