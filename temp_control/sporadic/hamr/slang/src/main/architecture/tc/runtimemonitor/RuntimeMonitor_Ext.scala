package tc.runtimemonitor

import org.sireum._
import art.Art._
import tc.catgui.CatRuntimeMonitor

// This file will not be overwritten so is safe to edit

trait RuntimeMonitorListener {
  def init(modelInfo: ModelInfo): Unit

  def observePreState(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent]): Unit

  def observePostState(bridgeId: BridgeId, observationKind: ObservationKind.Type, post: art.DataContent): Unit

  def observePrePostState(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent], post: art.DataContent): Unit
}

object RuntimeMonitor_Ext {

  val registeredListeners: ISZ[RuntimeMonitorListener] = ISZ(

    // add/remove listeners here
    new CatRuntimeMonitor(),

    // BEGIN DEFAULT RM MARKER

    // if you don't want to use the default runtime monitor then surround this marker block
    // with a block comment /** .. **/ to prevent codegen from emitting an error if it's rerun

    new DefaultRuntimeMonitor()

    // END DEFAULT RM MARKER
  )

  def init(modelInfo: ModelInfo): Unit = {
    for (l <- registeredListeners) {
      l.init(modelInfo)
    }
  }

  def observePreState(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent]): Unit = {
    for (l <- registeredListeners) {
      l.observePreState(bridgeId, observationKind, pre)
    }
  }

  def observePostState(bridgeId: BridgeId, observationKind: ObservationKind.Type, post: art.DataContent): Unit = {
    for (l <- registeredListeners) {
      l.observePostState(bridgeId, observationKind, post)
    }
  }

  def observePrePostState(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent], post: art.DataContent): Unit = {
    for (l <- registeredListeners) {
      l.observePrePostState(bridgeId, observationKind, pre, post)
    }
  }
}