// #Sireum

package tc.runtimemonitor

import org.sireum._
import art.Art.BridgeId

@ext object RuntimeMonitor {

  def init(): Unit = $

  def observePreState(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent]): Unit = $

  def observePostState(bridgeId: BridgeId, observationKind: ObservationKind.Type, post: art.DataContent): Unit = $

  def observePrePostState(bridgeId: BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent], post: art.DataContent): Unit = $
}
