// #Sireum

package tc.CoolingFan

import org.sireum._
import art._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Fan_s_tcproc_fan_EntryPoint_Companion {

  var preStateContainer_wL: Option[Fan_s_tcproc_fan_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Fan_s_tcproc_fan_PostState_Container_PS(
        api_fanAck = 
          if (Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.operational_api.fanAck_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.operational_api.fanAck_Id).get.asInstanceOf[CoolingFan.FanAck_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.id, tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_fan_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      Fan_s_tcproc_fan_PreState_Container_PS(
        api_fanCmd = 
          if (Art.observeInPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.operational_api.fanCmd_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.operational_api.fanCmd_Id).get.asInstanceOf[CoolingFan.FanCmd_Payload].value)
          else None()))

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.id, tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_fan_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Fan_s_tcproc_fan_PostState_Container_PS(
        api_fanAck = 
          if (Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.operational_api.fanAck_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.operational_api.fanAck_Id).get.asInstanceOf[CoolingFan.FanAck_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.TempControlSoftwareSystem_s_Instance_tcproc_fan.id, tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_s_Instance_tcproc_fan_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}