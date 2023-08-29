// #Sireum
package tc.runtimemonitor

import org.sireum._

@enum object iDispatchProtocol {
  "Sporadic"
  "Periodic"
}

@datatype class ModelInfo(val components: ISZ[Component])

@datatype class Component(val name: String,
                          val id: Z,
                          val dispatchProtocol: iDispatchProtocol.Type,
                          val state: ISZ[StateElement])

@enum object StateDirection {
  "In"
  "Out"
}

@sig trait StateElement {
  def name: String

  def slangType: String

  def direction: StateDirection.Type
}

@datatype class Port(val name: String,
                     val id: Z,
                     val direction: StateDirection.Type,
                     val slangType: String) extends StateElement

@datatype class StateVariable(val name: String,
                              val direction: StateDirection.Type,
                              val slangType: String) extends StateElement