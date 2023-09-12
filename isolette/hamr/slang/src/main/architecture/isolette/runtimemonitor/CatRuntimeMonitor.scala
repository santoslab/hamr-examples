package isolette.runtimemonitor

import art.{Art, DataContent}
import isolette.catgui._
import org.sireum._

import java.awt.BorderLayout
import java.util.concurrent.Executors
import javax.swing.{JFrame, JScrollPane}
import scala.concurrent.{ExecutionContext, ExecutionContextExecutorService, Future}

class CatRuntimeMonitor extends RuntimeMonitorListener {

  var catTreeTable: JTreeTableSC = _
  var catTreeModel: DemoTreeTableModelSC = _
  var cmModelInfo: Map[Z, compSC] = Map.empty

  def modelInfoToCompSC(modelInfo: ModelInfo): DemoTreeTableModelSC = {

    var components: Array[compSC] = new Array[compSC](0)

    for (c <- modelInfo.components) {
      var inputCompSCs: Array[InputSC] = new Array[InputSC](0)
      var outputCompSCs: Array[OutputSC] = new Array[OutputSC](0)

      for (state <- c.state) {
        val kind = state match {
          case i: Port => s"${if (state.direction == StateDirection.In) "Incoming" else "Outgoing"} Port"
          case i: StateVariable => s"${if (state.direction == StateDirection.In) "Pre" else "Post"} State Variable"
        }
        state.direction match {
          case StateDirection.In =>
            inputCompSCs = inputCompSCs :+ new InputSC(Array[Predef.String](state.name.native, kind, ""))
          case StateDirection.Out =>
            outputCompSCs = outputCompSCs :+ new OutputSC(Array[Predef.String](state.name.native, kind, ""))
        }
      }
      val sc = new compSC(new InputsSC(inputCompSCs), new OutputsSC(outputCompSCs), c.name.native)
      cmModelInfo = cmModelInfo + (c.id ~> sc)
      components = components :+ sc
    }

    return new DemoTreeTableModelSC(components)
  }

  override def init(modelInfo: ModelInfo): Unit = {
    catTreeModel = modelInfoToCompSC(modelInfo)
    catTreeTable = new JTreeTableSC(catTreeModel)
    val catFrame = new JFrame()
    val catPane = new JScrollPane((catTreeTable))
    catFrame.add(catPane, BorderLayout.CENTER)
    catFrame.pack()
    catFrame.setSize(new java.awt.Dimension(800, 600))
    catFrame.setVisible(true)
  }

  def updateOutPorts(bridge: art.Art.BridgeId, observationKind: ObservationKind.Type, post: art.DataContent): Unit = {
    val cmi = cmModelInfo.get(bridge.toZ).get
    val outputs = cmi.getOut.getOutputs
    val m: Map[String, String] = GumboXDispatcher.getUpdates(bridge, observationKind, post)
    for (entry <- m.entries) {
      catTreeTable.updatePort(outputs, entry._1.native, entry._2.native)
    }
  }

  def updateInPorts(bridge: art.Art.BridgeId, observationKind: ObservationKind.Type, pre: art.DataContent): Unit = {
    val cmi = cmModelInfo.get(bridge.toZ).get
    val inputs = cmi.getIn.getInputs
    val m: Map[String, String] = GumboXDispatcher.getUpdates(bridge, observationKind, pre)
    for (entry <- m.entries) {
      catTreeTable.updatePort(inputs, entry._1.native, entry._2.native)
    }
  }

  protected implicit val context: ExecutionContextExecutorService = ExecutionContext.fromExecutorService(Executors.newSingleThreadExecutor())

  override def observePreState(bridgeId: Art.BridgeId, observationKind: ObservationKind.Type, pre: Option[DataContent]): Unit = {
    // TODO: really want to run updates in a separate, non-blocking thread. Kucing should not block
    //       the Slang program, nor any other running swing GUI -- I don't think SwingUtilities.invokeLater
    //       guarantees the latter
    Future(updateInPorts(bridgeId, observationKind, pre.get))
  }

  override def observePostState(bridgeId: Art.BridgeId, observationKind: ObservationKind.Type, post: DataContent): Unit = {
    Future(updateOutPorts(bridgeId, observationKind, post))
  }

  override def observePrePostState(bridgeId: Art.BridgeId, observationKind: ObservationKind.Type, pre: Option[DataContent], post: DataContent): Unit = {
    Future(updateOutPorts(bridgeId, observationKind, post))
  }
}
