// #Sireum

package isolette.Monitor

import org.sireum._
import art._
import isolette._

@sig trait Detect_Monitor_Failure_impl_Api {
  def id: Art.BridgeId
  def internal_failure_Id : Art.PortId

  def put_internal_failure(value : Isolette_Data_Model.Failure_Flag_impl) : Unit = {
    Art.putValue(internal_failure_Id, Isolette_Data_Model.Failure_Flag_impl_Payload(value))
  }

  def logInfo(msg: String): Unit = {
    Art.logInfo(id, msg)
  }

  def logDebug(msg: String): Unit = {
    Art.logDebug(id, msg)
  }

  def logError(msg: String): Unit = {
    Art.logError(id, msg)
  }
}

@datatype class Detect_Monitor_Failure_impl_Initialization_Api (
  val id: Art.BridgeId,
  val internal_failure_Id : Art.PortId) extends Detect_Monitor_Failure_impl_Api

@datatype class Detect_Monitor_Failure_impl_Operational_Api (
  val id: Art.BridgeId,
  val internal_failure_Id : Art.PortId) extends Detect_Monitor_Failure_impl_Api {

}
