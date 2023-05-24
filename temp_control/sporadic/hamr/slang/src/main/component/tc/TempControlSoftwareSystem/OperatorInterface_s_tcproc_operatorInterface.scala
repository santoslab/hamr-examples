// #Sireum #Logika

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// This file will not be overwritten so is safe to edit
object OperatorInterface_s_tcproc_operatorInterface {

  def initialise(api: OperatorInterface_s_Initialization_Api): Unit = {}

  def timeTriggered(api: OperatorInterface_s_Operational_Api): Unit = {}

  def activate(api: OperatorInterface_s_Operational_Api): Unit = { }

  def deactivate(api: OperatorInterface_s_Operational_Api): Unit = { }

  def finalise(api: OperatorInterface_s_Operational_Api): Unit = { }

  def recover(api: OperatorInterface_s_Operational_Api): Unit = { }
}
