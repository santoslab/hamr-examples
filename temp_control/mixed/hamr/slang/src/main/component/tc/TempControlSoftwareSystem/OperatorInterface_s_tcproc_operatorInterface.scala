// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// This file will not be overwritten so is safe to edit
object OperatorInterface_s_tcproc_operatorInterface {

  def initialise(api: OperatorInterface_s_Initialization_Api): Unit = {
    api.put_setPoint(Initial_Values.defaultSetPoint)
  }

  def timeTriggered(api: OperatorInterface_s_Operational_Api): Unit = {
    api.get_tempChanged() match {
      case Some(event) =>
        api.logInfo(s"Current Temperature: ${api.get_currentTemp().get}")
      case _ =>
    }
  }

  def finalise(api: OperatorInterface_s_Operational_Api): Unit = { }
}
