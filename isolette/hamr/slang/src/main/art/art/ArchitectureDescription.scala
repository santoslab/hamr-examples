// #Sireum

package art

import org.sireum._


@datatype class ArchitectureDescription(components: IS[Art.BridgeId, Bridge],
                                        connections: IS[Art.ConnectionId, UConnection]) {
  @spec val allPorts: IS[Art.PortId, UPort] = $

  @spec def allPortsSpec(i: Z): IS[Art.PortId, UPort] = $
  /*
    l"""
    = base:  ISZ[UPort](), if i == 0
    = rec:   components(i).ports.all ++ allPorts(i - 1), if 0 < i ∧ i < components.size
  """

  l""" invariant

         AllPorts:
           allPorts ≡ allPortsSpec(components.size - 1)

         ComponentIdUnique:
           ∀i: [0, components.size)
             ∀j: [0, components.size)
               i ≠ j → components(i).id ≠ components(j).id

         PortIdUnique:
           ∀i: [0, allPorts.size)
             ∀j: [0, allPorts.size)
               i ≠ j → allPorts(i).id ≠ allPorts(j).id
   """
  */
}

@datatype trait UConnection {
  /*
  l""" invariant
         FromPortOut:   from.mode ≡ PortMode.DataOut ∨ from.mode ≡ PortMode.EventOut
         DataPort:    (from.mode ≡ PortMode.DataOut) ≡ (to.mode ≡ PortMode.DataIn)
         EventPort:  (from.mode ≡ PortMode.EventOut) ≡ (to.mode ≡ PortMode.EventIn)  """
  */

  def from: UPort

  def to: UPort
}

@datatype class Connection(val from: UPort, val to: UPort)
  extends UConnection


@enum object PortMode {
  'DataIn
  'DataOut
  'EventIn
  'EventOut
}

@datatype trait UPort {
  def id: Art.PortId

  def name: String

  def mode: PortMode.Type
}

@datatype trait PortProto extends UPort

@datatype class Port[T](val id: Art.PortId,
                        val name: String,
                        val mode: PortMode.Type)
  extends PortProto

@datatype trait UrgentPortProto extends UPort {
  def urgency: Z
}

@datatype class UrgentPort[T](val id: Art.PortId,
                              val name: String,
                              val mode: PortMode.Type,
                              val urgency: Z)
  extends UrgentPortProto

@sig trait Bridge {
  def id: Art.BridgeId

  def name: String

  def ports: Bridge.Ports

  def entryPoints: Bridge.EntryPoints

  def dispatchProtocol: DispatchPropertyProtocol
}


object Bridge {

  // initialise()  ( compute() | activate() deactivate() | recover() )* finalise()
  @sig trait EntryPoints {

    def initialise(): Unit

    def activate(): Unit

    def deactivate(): Unit

    def compute(): Unit

    def recover(): Unit

    def finalise(): Unit

    def testCompute(): Unit = { println("Default testCompute") }

    def testInitialise(): Unit = { println("Default testInitialise") }
  }

  @datatype class Ports(all: IS[Art.PortId, UPort],
                        dataIns: IS[Art.PortId, UPort],
                        dataOuts: IS[Art.PortId, UPort],
                        eventIns: IS[Art.PortId, UPort],
                        eventOuts: IS[Art.PortId, UPort])

}


@datatype trait DispatchPropertyProtocol

object DispatchPropertyProtocol {

  @datatype class Periodic(period: Z) extends DispatchPropertyProtocol

  // @datatype class Aperiodic() extends DispatchPropertyProtocol

  @datatype class Sporadic(min: Z) extends DispatchPropertyProtocol

  // @datatype class Timed() extends DispatchPropertyProtocol

  // @datatype class Hybrid() extends DispatchPropertyProtocol
}

@datatype trait DispatchStatus

@datatype class TimeTriggered() extends DispatchStatus

@datatype class EventTriggered(portIds: IS[Art.PortId, Art.PortId]) extends DispatchStatus