// #Sireum
package tc.runtimemonitor

import art.Art.BridgeId
import org.sireum._

@ext object RuntimeMonitor {

  def init(): Unit = $

  def update1(bridgeId: BridgeId, captureKind: CaptureKind.Type, pre: art.DataContent): Unit = $

  def update2(bridgeId: BridgeId, captureKind: CaptureKind.Type, pre: art.DataContent, post: art.DataContent): Unit = $
}
