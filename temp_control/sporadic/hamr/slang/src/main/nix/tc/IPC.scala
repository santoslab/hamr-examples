// #Sireum

package tc

import org.sireum._
import art._
import art.Art.PortId._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object IPCPorts {
  val TempSensor_s_tcproc_tempSensor_App: Art.PortId = Art.PortId.fromZ(12)
  val Fan_s_tcproc_fan_App: Art.PortId = Art.PortId.fromZ(13)
  val TempControl_s_tcproc_tempControl_App: Art.PortId = Art.PortId.fromZ(14)
  val OperatorInterface_s_tcproc_operatorInterface_App: Art.PortId = Art.PortId.fromZ(15)
  val Main: Art.PortId = Art.PortId.fromZ(16)

  def emptyReceiveOut: MBox2[Art.PortId, DataContent] = {
    return MBox2(portId"0", art.Empty())
  }

  def emptyReceiveAsyncOut: MBox2[Art.PortId, Option[DataContent]] = {
    return MBox2(portId"0", None())
  }
}
