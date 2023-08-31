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
    new DefaultRuntimeMonitor(),

    new CatRuntimeMonitor() // NOTE: codegen generated everything but this line
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