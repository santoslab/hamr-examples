package isolette.runtimemonitor

import art.Art.BridgeId
import org.sireum._
import isolette.JSON

import java.awt.datatransfer.StringSelection
import java.awt.{BorderLayout, Dimension, Point, Toolkit}
import javax.swing._
import javax.swing.table.AbstractTableModel

// This file will not be overwritten so is safe to edit

class DefaultRuntimeMonitor extends JFrame with RuntimeMonitorListener {

  val testDir = Os.path(".") / "src" / "test" / "bridge" / "isolette"

  var jtable: JTable = _
  var model: TableModel = _
  var modelInfo: ModelInfo = _

  def init(modelInfo: ModelInfo): Unit = {
    this.setTitle("Visualizer")

    this.modelInfo = modelInfo

    model = new TableModel()
    jtable = new JTable()
    jtable.setModel(model)

    val js = new JScrollPane(jtable)
    js.setVisible(true)
    add(js, BorderLayout.PAGE_START)

    val btnGenTestSuite = new JButton("Generate TestSuite")
    btnGenTestSuite.addActionListener(e => {
      if (jtable.getSelectedRows.nonEmpty) {
        var testCases: Map[Z, ISZ[ST]] = Map.empty

        for (row <- jtable.getSelectedRows) {
          val data = model.getRow(row)
          val id = data.bridgeId.toZ
          testCases = testCases + id ~>
            (testCases.getOrElse(id, ISZ[ST]()) :+
              GumboXDispatcher.genTestCase(data.observationKind, data.pre, data.post, Some(": $i")))
        }
        GumboXDispatcher.genTestSuite(testCases.entries)
      }
    })

    val btnGenTestCase = new JButton("Generate Test Case")

    btnGenTestCase.addActionListener(e => {
      if (jtable.getSelectedRow >= 0) {
        val data = model.getRow(jtable.getSelectedRow)

        if (data.observationKind.string.native.contains("post")) {
          val testCase = GumboXDispatcher.genTestCase(data.observationKind, data.pre, data.post, None())

          val clip = Toolkit.getDefaultToolkit.getSystemClipboard
          val strse1 = new StringSelection(testCase.render.native)
          clip.setContents(strse1, strse1)

          val txt = st"""<html><pre>${testCase.render}</pre></html>"""
          val lbl = new JLabel(txt.render.native)

          val viz = new JFrame()
          viz.add(lbl)

          viz.pack()
          viz.setVisible(true)
        }
      }
    })

    val btnVisualize = new JButton("Visualize")

    btnVisualize.addActionListener(e => {
      if (jtable.getSelectedRow >= 0) {
        val data = model.getRow(jtable.getSelectedRow)

        val preOpt: Option[ST] = if (data.pre.nonEmpty) Some(st"Pre: ${JSON.to_artDataContent(data.pre.get).left}") else None()
        val postOpt: Option[ST] = if (data.post.nonEmpty) Some(st"Post: ${JSON.to_artDataContent(data.post.get).left}") else None()

        val txt =
          st"""<html>
              |  <pre>
              |    Component: ${data.bridgeId}
              |    Observation Kind: ${data.observationKind}
              |    <hr>
              |    ${preOpt}
              |    ${postOpt}
              |  </pre>
              |</html>"""

        val lbl = new JLabel(txt.render.native)

        val viz = new JFrame()
        viz.add(lbl)

        viz.pack()
        viz.setVisible(true)
      }
    })

    val jpbutton = new JPanel()

    jpbutton.setLayout(new BoxLayout(jpbutton, BoxLayout.LINE_AXIS))
    jpbutton.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10))
    jpbutton.add(Box.createHorizontalGlue())

    jpbutton.add(btnGenTestSuite)
    jpbutton.add(Box.createRigidArea(new Dimension(10, 0)))

    jpbutton.add(btnGenTestCase)
    jpbutton.add(Box.createRigidArea(new Dimension(10, 0)))

    jpbutton.add(btnVisualize)

    add(jpbutton, BorderLayout.PAGE_END)

    pack()
    setResizable(true)
    setSize(new java.awt.Dimension(1000,500))
    //setLocationRelativeTo(null)
    setLocation(new Point(300, 300))
    setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE)
    setVisible(true)
  }

  def observePreState(bridge: art.Art.BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent]): Unit = {
    SwingUtilities.invokeLater(() => dispatch(bridge, observationKind, pre, None()))
  }

  def observePostState(bridge: art.Art.BridgeId, observationKind: ObservationKind.Type, post: art.DataContent): Unit = {
    SwingUtilities.invokeLater(() => dispatch(bridge, observationKind, None(), Some(post)))
  }

  def observePrePostState(bridge: art.Art.BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent], post: art.DataContent): Unit = {
    SwingUtilities.invokeLater(() => dispatch(bridge, observationKind, pre, Some(post)))
  }

  def dispatch(bridge: art.Art.BridgeId, observationKind: ObservationKind.Type, pre: Option[art.DataContent], post: Option[art.DataContent]): Unit = {
    val row = if (bridge.toZ > 3) bridge.toZ - 1 else bridge.toZ

    val name = modelInfo.components(row).name
    model.addRow(Row(bridge, name, observationKind,
      GumboXDispatcher.checkContract(observationKind, pre, post),
      if (pre.nonEmpty) Some(JSON.from_artDataContent(pre.get, T)) else None(),
      if (post.nonEmpty) Some(JSON.from_artDataContent(post.get, T)) else None()))
  }
}

case class Row(bridgeId: BridgeId, name: String, observationKind: ObservationKind.Type, result: Boolean, pre: Option[String], post: Option[String])

class TableModel extends AbstractTableModel {
  val columnNames = Array("Component", "Kind", "Satisified")

  var data: ISZ[Row] = ISZ()

  def addRow(row: Row): Unit = {
    data = data :+ row
    fireTableRowsInserted(data.size.toInt - 1, data.size.toInt - 1)
  }

  def getRow(row: Int): Row = {
    return data(row)
  }

  override def getRowCount: Int = {
    return data.size.toInt
  }

  override def getColumnCount: Int = {
    return columnNames.length
  }

  override def getColumnName(column: Int): java.lang.String = {
    return columnNames(column)
  }

  override def getValueAt(rowIndex: Int, columnIndex: Int): Object = {
    return columnIndex match {
      case 0 => data(rowIndex).name.string.native
      case 1 => data(rowIndex).observationKind.string.native
      case 2 => data(rowIndex).result.string.native
      case _ => halt("Infeasible")
    }
  }
}