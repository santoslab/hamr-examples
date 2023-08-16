package tc.runtimemonitor

import art.Art.BridgeId
import art.Bridge
import org.sireum._
import tc.JSON

import java.awt.{BorderLayout, Dimension}
import javax.swing._
import javax.swing.table.AbstractTableModel

class GUI extends JFrame {

  var jtable: JTable = _
  var model: TableModel = _

  def init(): Unit = {
    this.setTitle("Temp Control")

    model = new TableModel()
    jtable = new JTable()
    jtable.setModel(model)

    add(jtable.getTableHeader(), BorderLayout.PAGE_START)
    add(jtable, BorderLayout.CENTER)

    this.setPreferredSize(new Dimension(500, 300))
    this.pack()
    this.setResizable(true)
    this.setLocationRelativeTo(null)
    this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE)
    this.setVisible(true)
  }

  def update1(bridge: art.Art.BridgeId, observationKind: ObservationKind.Type, pre: art.DataContent): Unit = {
    SwingUtilities.invokeLater( () => {
      val status : B = {
        // FIXME
        if(observationKind.string.native.contains("postInit"))
          GumboXDispatcher.dispatch(observationKind, None(), Some(pre))
        else
          GumboXDispatcher.dispatch(observationKind, Some(pre), None())
      }
      model.addRow(Row(bridge, observationKind, status, JSON.from_artDataContent(pre, T)))
    })
  }

  def update2(bridge: art.Art.BridgeId, observationKind: ObservationKind.Type, pre: art.DataContent, post: art.DataContent): Unit = {
    SwingUtilities.invokeLater(() => {
      model.addRow(Row(bridge, observationKind,
        GumboXDispatcher.dispatch(observationKind, Some(pre), Some(post)),
        JSON.from_artDataContent(pre, T), JSON.from_artDataContent(post, T)))
    })

  }
}

case class Row(bridgeId: BridgeId, observationKind: ObservationKind.Type, result: Boolean, pre: String, post: String = "")

class TableModel extends AbstractTableModel {
  val columnNames = Array("BridgeId", "Kind", "Satisified")

  var data: ISZ[Row] = ISZ()

  def addRow(row: Row): Unit = {
    data = data :+ row
    println(s"added $row")
    fireTableRowsInserted(data.size.toInt - 1, data.size.toInt - 1)
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
      case 0 => data(rowIndex).bridgeId.string.native
      case 1 => data(rowIndex).observationKind.string.native
      case 2 => data(rowIndex).result.string.native
      case _ => halt("Infeasible")
    }
  }
}
