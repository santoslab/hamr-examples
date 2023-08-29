// #Sireum
package tc.runtimemonitor

import org.sireum._

object tcModelInfo {

  val modelInfo = ModelInfo(
    ISZ(
      Component(
        name = "TempSensor",
        id = 0,
        dispatchProtocol = iDispatchProtocol.Sporadic,
        state = ISZ(
          Port(
            name = "tempChanged",
            id = 0,
            direction = StateDirection.Out,
            slangType = ""
          ),
          Port(
            name = "currentTemp",
            id = 1,
            direction = StateDirection.Out,
            slangType = ""
          )
        )
      ),
      Component(
        name = "TempControl",
        id = 12,
        dispatchProtocol = iDispatchProtocol.Sporadic,
        state = ISZ(
          Port(
            name = "tempChanged",
            id = 0,
            direction = StateDirection.In,
            slangType = ""
          )
        )
      ))
  )
}
