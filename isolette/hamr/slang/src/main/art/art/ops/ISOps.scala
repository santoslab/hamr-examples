// #Sireum

package art.ops

import org.sireum._
import art.Art
import art.Art.PortId._

@datatype class ISPOps[T] (val s: IS[Art.PortId, T]) {

  @pure def contains(e: T): B = {
    for (v <- s) {
      if (v == e) {
        return T
      }
    }
    return F
  }

  def tail: IS[Art.PortId, T] = {
    if (s.isEmpty) {
      return s
    }
    val ms = MS.create[Art.PortId, T](s.size - 1, s(portId"0"))
    var zindex = 0
    var pindex = portId"0"
    for (e <- s) {
      if (zindex > 0) {
        ms(pindex) = e
        pindex = pindex + portId"1"
      }
      zindex = zindex + 1
    }
    return ms.toIS
  }
}
