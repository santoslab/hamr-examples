// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import art._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object TempControl_s_tcproc_tempControl_EntryPoint_Companion {

  var preStateContainer_wL: Option[TempControl_s_tcproc_tempControl_PreState_wLContainer] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      TempControl_s_tcproc_tempControl_PostState_wLContainer(
        currentFanState = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentFanState,
        currentSetPoint = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentSetPoint,
        latestTemp = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.latestTemp,
        api_fanCmd = // tipe indicates the following is not in slang :(
        //Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanCmd_Id) match {
        //  case Some(CoolingFan.FanCmd_Payload(value)) => Some(value)
        //  case _ => None()
        //}
        // so instead ...
        if (Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanCmd_Id).nonEmpty)
          Some(Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanCmd_Id).get.asInstanceOf[CoolingFan.FanCmd_Payload].value)
        else None())

    tc.runtimemonitor.RuntimeMonitor.update1(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.id, tc.runtimemonitor.CaptureKind.tempControl_postInit, postStateContainer_wL)

    // the rest of this could be done in a separate thread

    //val json = JSON.fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer(postStateContainer_wL, T)
    //println(s"tempControl.initialise: Post-State values: $json")

    /*
    val result: B = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_GumboX.inititialize_IEP_Post_Container(postContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer])
    println(s"tempControl.initialise: Post-condition: ${if (result) "" else "un"}satisfied")
    return result
    */
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      TempControl_s_tcproc_tempControl_PreState_wLContainer(
        In_currentFanState = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentFanState, 
        In_currentSetPoint = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentSetPoint, 
        In_latestTemp = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.latestTemp, 
        api_tempChanged = Art.observeInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.tempChanged_Id).asInstanceOf[Option[art.Empty]], 
        api_fanAck = // tipe indicates the following is not in slang :(
        //Art.observeInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanAck_Id) match {
        //  case Some(CoolingFan.FanAck_Payload(value)) => Some(value)
        //  case _ => None()
        //}
        // so instead ..
        if (Art.observeInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanAck_Id).nonEmpty)
          Some(Art.observeInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanAck_Id).get.asInstanceOf[CoolingFan.FanAck_Payload].value)
        else None(), 
        api_setPoint = // tipe indicates the following is not in slang :(
        //Art.observeInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.setPoint_Id) match {
        //  case Some(TempControlSoftwareSystem.SetPoint_i_Payload(value)) => Some(value)
        //  case _ => None()
        //}
        // so instead ..
        if (Art.observeInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.setPoint_Id).nonEmpty)
          Some(Art.observeInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.setPoint_Id).get.asInstanceOf[TempControlSoftwareSystem.SetPoint_i_Payload].value)
        else None(), 
        api_currentTemp = Art.observeInPortValue(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.currentTemp_Id).get.asInstanceOf[TempSensor.Temperature_i_Payload].value))

    tc.runtimemonitor.RuntimeMonitor.update1(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.id, tc.runtimemonitor.CaptureKind.tempControl_preCompute, preStateContainer_wL.get)

    // the rest of this could be done in a separate thread
    /*
    val json = JSON.fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer(preStateContainer_wL.get, T)
    println(s"tempControl.timeTriggered: Pre-State values: $json")

    val result: B = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_GumboX.compute_CEP_Pre_Container(preContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer])
    println(s"tempControl.timeTriggered: Pre-condition: ${if (result) "" else "un"}satisfied")
    return result
    */
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      TempControl_s_tcproc_tempControl_PostState_wLContainer(
        currentFanState = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentFanState,
        currentSetPoint = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.currentSetPoint,
        latestTemp = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl.latestTemp,
        api_fanCmd = // tipe indicates the following is not in slang :(
        //Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanCmd_Id) match {
        //  case Some(CoolingFan.FanCmd_Payload(value)) => Some(value)
        //  case _ => None()
        //}
        // so instead ...
        if (Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanCmd_Id).nonEmpty)
          Some(Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.operational_api.fanCmd_Id).get.asInstanceOf[CoolingFan.FanCmd_Payload].value)
        else None())

    tc.runtimemonitor.RuntimeMonitor.update2(Arch.TempControlSoftwareSystem_s_Instance_tcproc_tempControl.id, tc.runtimemonitor.CaptureKind.tempControl_postCompute, preStateContainer_wL.get, postStateContainer_wL)

    /*
    // the rest of this could be done in a separate thread

    val json = JSON.fromTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer(postStateContainer_wL, T)
    println(s"tempControl.timeTriggered: Post-State values: $json")

    val result: B = tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_GumboX.compute_CEP_Post_Container(preContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer], postContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer])
    println(s"tempControl.timeTriggered: Post-condition: ${if (result) "" else "un"}satisfied")
    return result
    */
  }
}