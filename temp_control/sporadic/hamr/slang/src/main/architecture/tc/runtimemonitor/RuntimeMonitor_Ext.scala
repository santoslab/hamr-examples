package tc.runtimemonitor

import org.sireum._
import art.Art._

object RuntimeMonitor_Ext {

  var gui: GUI = _

  def init(): Unit = {
    gui = new GUI()
    gui.init()
  }

  def observePreState(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent]): Unit = {
    gui.observePreState(bridgeId, observationKind, pre)
  }

  def observePostState(bridgeId: BridgeId, observationKind: ObservationKind.Type, post: art.DataContent): Unit = {
    gui.observePostState(bridgeId, observationKind, post)
  }

  def observePrePostState(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent], post: art.DataContent): Unit = {
    gui.observePrePostState(bridgeId, observationKind, pre, post)
  }
}