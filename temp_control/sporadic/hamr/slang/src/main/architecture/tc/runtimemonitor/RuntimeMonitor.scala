// #Sireum
package tc.runtimemonitor

import org.sireum._
import art.Art.BridgeId

@ext object RuntimeMonitor {

  def init(): Unit = $

  def update1(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: art.DataContent): Unit = $

  def update2(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: art.DataContent, post: art.DataContent): Unit = $
}
