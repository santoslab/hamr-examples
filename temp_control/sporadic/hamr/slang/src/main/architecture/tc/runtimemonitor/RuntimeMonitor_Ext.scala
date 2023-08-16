package tc.runtimemonitor

import org.sireum._
import art.Art._

object RuntimeMonitor_Ext {

  var gui: GUI = _

  def init(): Unit = {
    gui = new GUI()
    gui.init()
  }

  def update1(bridgeId: BridgeId, captureKind: CaptureKind.Type, pre: art.DataContent): Unit = {
    gui.update1(bridgeId, captureKind, pre)
  }

  def update2(bridgeId: BridgeId, captureKind: CaptureKind.Type, pre: art.DataContent, post: art.DataContent): Unit = {
    gui.update2(bridgeId, captureKind, pre, post)
  }
}
