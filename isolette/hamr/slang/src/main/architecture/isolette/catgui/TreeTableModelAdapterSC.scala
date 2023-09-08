package isolette.catgui

import javax.swing._
import javax.swing.event.{TreeExpansionEvent, TreeExpansionListener, TreeModelEvent, TreeModelListener}
import javax.swing.table.AbstractTableModel


class TreeTableModelAdapterSC(var treeTableModel: TreeTableModelSC, var tree: JTree) extends AbstractTableModel {
  tree.addTreeExpansionListener(new TreeExpansionListener() {
    // Don't use fireTableRowsInserted() here; the selection model
    // would get updated twice.
    override def treeExpanded(event: TreeExpansionEvent): Unit = {
      fireTableDataChanged()
    }

    override def treeCollapsed(event: TreeExpansionEvent): Unit = {
      fireTableDataChanged()
    }
  })
  // Install a TreeModelListener that can update the table when
  // tree changes. We use delayedFireTableDataChanged as we can
  // not be guaranteed the tree will have finished processing
  // the event before us.
  treeTableModel.addTreeModelListener(new TreeModelListener() {
    override def treeNodesChanged(e: TreeModelEvent): Unit = {
      delayedFireTableDataChanged()
    }

    override def treeNodesInserted(e: TreeModelEvent): Unit = {
      delayedFireTableDataChanged()
    }

    override def treeNodesRemoved(e: TreeModelEvent): Unit = {
      delayedFireTableDataChanged()
    }

    override def treeStructureChanged(e: TreeModelEvent): Unit = {
      delayedFireTableDataChanged()
    }
  })

  // Wrappers, implementing TableModel interface.
  override def getColumnCount: Int = treeTableModel.getColumnCount

  override def getColumnName(column: Int): String = treeTableModel.getColumnName(column)

  override def getColumnClass(column: Int): Class[_] = treeTableModel.getColumnClass(column)

  override def getRowCount: Int = tree.getRowCount

  protected def nodeForRow(row: Int): AnyRef = {
    val treePath = tree.getPathForRow(row)
    treePath.getLastPathComponent
  }

  override def getValueAt(row: Int, column: Int): AnyRef = treeTableModel.getValueAt(nodeForRow(row), column)

  override def isCellEditable(row: Int, column: Int): Boolean = treeTableModel.isCellEditable(nodeForRow(row), column)

  override def setValueAt(value: AnyRef, row: Int, column: Int): Unit = {
    treeTableModel.setValueAt(value, nodeForRow(row), column)
  }

  /**
       * Invokes fireTableDataChanged after all the pending events have been
       * processed. SwingUtilities.invokeLater is used to handle this.
       */
  protected def delayedFireTableDataChanged(): Unit = {
    SwingUtilities.invokeLater(new Runnable() {
      override def run(): Unit = {
        fireTableDataChanged()
      }
    })
  }
}
