package isolette.catgui

import java.awt._
import java.awt.event.MouseEvent
import java.util.EventObject
import javax.swing._
import javax.swing.event.{ListSelectionEvent, ListSelectionListener}
import javax.swing.table.{TableCellEditor, TableCellRenderer}
import javax.swing.tree._

class JTreeTableSC(treeTableModel: TreeTableModelSC) extends JTable { // Create the tree. It will be used as a renderer and editor.
  /** A subclass of JTree. */
  protected var tree: TreeTableCellRenderer = null
  tree = new TreeTableCellRenderer(treeTableModel)
  // Install a tableModel representing the visible rows in the tree.

  // FIXME: save the tree model so we can fire data changed
  val treeModel = new TreeTableModelAdapterSC(treeTableModel, tree)
  super.setModel(treeModel)

  // Force the JTable and JTree to share their row selection models.
  val selectionWrapper = new ListToTreeSelectionModelWrapper
  tree.setSelectionModel(selectionWrapper)
  setSelectionModel(selectionWrapper.getListSelectionModel)
  // Install the tree editor renderer and editor.
  setDefaultRenderer(classOf[TreeTableModelSC], tree)
  setDefaultEditor(classOf[TreeTableModelSC], new TreeTableCellEditor)
  // No grid.
  setShowGrid(false)
  // No intercell spacing
  setIntercellSpacing(new Dimension(0, 0))
  // And update the height of the trees row to match that of
  // the table.
  if (tree.getRowHeight < 1) {
    // Metal looks better like this.
    setRowHeight(18)
  }

  def updatePort(array: Array[_], portName: String, portValue: String): Unit = {
    if (array.isInstanceOf[Array[InputSC]]) {
      val input = array.asInstanceOf[Array[InputSC]]
      for (i <- input.indices) {
        if (input(i).column(0) eq portName) {
          if (input(i).column(2) ne portValue) {
            input(i).setUpdated(true)
            tree.setCellRenderer(new cellColor)
          }
          // FIXME: don't want the description field to update
          input(i).setColumn(Array[String](portName, input(i).column(1), portValue))
          SwingUtilities.invokeLater(() => treeModel.fireTableDataChanged())
        }
      }
    }
    if (array.isInstanceOf[Array[OutputSC]]) {
      val output = array.asInstanceOf[Array[OutputSC]]
      for (i <- output.indices) {
        if (output(i).column(0) eq portName) {
          if (output(i).column(2) ne portValue) {
            output(i).setUpdated(true)
            tree.setCellRenderer(new cellColor)
          }
          // FIXME: don't want the description field to update
          output(i).setColumn(Array[String](portName, output(i).column(1), portValue))
          SwingUtilities.invokeLater(() => treeModel.fireTableDataChanged())
        }
      }
    }
  }

  private class cellColor extends DefaultTreeCellRenderer {
    override def getTreeCellRendererComponent(tree: JTree, value: AnyRef, sel: Boolean, exp: Boolean, leaf: Boolean, row: Int, hasFocus: Boolean): Component = {
      super.getTreeCellRendererComponent(tree, value, sel, exp, leaf, row, hasFocus)
      if (value.isInstanceOf[InputSC]) {
        val input = value.asInstanceOf[InputSC]
        setBackgroundNonSelectionColor(if (input.getUpdated) Color.yellow
        else Color.white)
      }
      else if (value.isInstanceOf[OutputSC]) {
        val output = value.asInstanceOf[OutputSC]
        setBackgroundNonSelectionColor(if (output.getUpdated) Color.yellow
        else Color.white)
      }
      else setBackgroundNonSelectionColor(Color.white)
      this
    }
  }

  /**
       * Overridden to message super and forward the method to the tree.
       * Since the tree is not actually in the component hieachy it will
       * never receive this unless we forward it in this manner.
       */
  override def updateUI(): Unit = {
    super.updateUI()
    if (tree != null) tree.updateUI()
    // Use the tree's default foreground and background colors in the
    // table.
    LookAndFeel.installColorsAndFont(this, "Tree.background", "Tree.foreground", "Tree.font")
  }

  /* Workaround for BasicTableUI anomaly. Make sure the UI never tries to
       * paint the editor. The UI currently uses different techniques to
       * paint the renderers and editors and overriding setBounds() below
       * is not the right thing to do for an editor. Returning -1 for the
       * editing row in this case, ensures the editor is never painted.
       */
  override def getEditingRow: Int = if (getColumnClass(editingColumn) eq classOf[TreeTableModelSC]) -1
  else editingRow

  /**
       * Overridden to pass the new rowHeight to the tree.
       */
  override def setRowHeight(rowHeight: Int): Unit = {
    super.setRowHeight(rowHeight)
    if (tree != null && tree.getRowHeight != rowHeight) tree.setRowHeight(getRowHeight)
  }

  /**
       * Returns the tree that is being shared between the model.
       */
  def getTree: JTree = tree

  /**
       * A TreeCellRenderer that displays a JTree.
       */
  class TreeTableCellRenderer(model: TreeModel) extends JTree(model) with TableCellRenderer {

    /** Last table/tree row asked to renderer. */
    protected var visibleRow = 0

    /**
             * updateUI is overridden to set the colors of the Tree's renderer
             * to match that of the table.
             */
    override def updateUI(): Unit = {
      super.updateUI()
      // Make the tree's cell renderer use the table's cell selection
      // colors.
      val tcr = getCellRenderer
      if (tcr.isInstanceOf[DefaultTreeCellRenderer]) {
        val dtcr = tcr.asInstanceOf[DefaultTreeCellRenderer]
        // For 1.1 uncomment this, 1.2 has a bug that will cause an
        // exception to be thrown if the border selection color is
        // null.
        // dtcr.setBorderSelectionColor(null);
        dtcr.setTextSelectionColor(UIManager.getColor("Table.selectionForeground"))
        dtcr.setBackgroundSelectionColor(UIManager.getColor("Table.selectionBackground"))
      }
    }

    /**
             * Sets the row height of the tree, and forwards the row height to
             * the table.
             */
    override def setRowHeight(rowHeight: Int): Unit = {
      if (rowHeight > 0) {
        super.setRowHeight(rowHeight)
        if (JTreeTableSC.this != null && JTreeTableSC.this.getRowHeight != rowHeight) JTreeTableSC.this.setRowHeight(getRowHeight)
      }
    }

    /**
             * This is overridden to set the height to match that of the JTable.
             */
    override def setBounds(x: Int, y: Int, w: Int, h: Int): Unit = {
      super.setBounds(x, 0, w, JTreeTableSC.this.getHeight)
    }

    /**
             * Sublcassed to translate the graphics such that the last visible
             * row will be drawn at 0,0.
             */
    override def paint(g: Graphics): Unit = {
      g.translate(0, -visibleRow * getRowHeight)
      super.paint(g)
    }

    /**
             * TreeCellRenderer method. Overridden to update the visible row.
             */
    override def getTableCellRendererComponent(table: JTable, value: AnyRef, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component = {
      if (isSelected) setBackground(table.getSelectionBackground)
      else setBackground(table.getBackground)
      visibleRow = row
      this
    }
  }

  /**
       * TreeTableCellEditor implementation. Component returned is the
       * JTree.
       */
  class TreeTableCellEditor extends AbstractCellEditor with TableCellEditor {
    override def getTableCellEditorComponent(table: JTable, value: AnyRef, isSelected: Boolean, r: Int, c: Int): Component = tree

    /**
             * Overridden to return false, and if the event is a mouse event
             * it is forwarded to the tree.<p>
             * The behavior for this is debatable, and should really be offered
             * as a property. By returning false, all keyboard actions are
             * implemented in terms of the table. By returning true, the
             * tree would get a chance to do something with the keyboard
             * events. For the most part this is ok. But for certain keys,
             * such as left/right, the tree will expand/collapse where as
             * the table focus should really move to a different column. Page
             * up/down should also be implemented in terms of the table.
             * By returning false this also has the added benefit that clicking
             * outside of the bounds of the tree node, but still in the tree
             * column will select the row, whereas if this returned true
             * that wouldn't be the case.
             * <p>By returning false we are also enforcing the policy that
             * the tree will never be editable (at least by a key sequence).
             */
    override def isCellEditable(e: EventObject): Boolean = {
      if (e.isInstanceOf[MouseEvent]) {
        for (counter <- getColumnCount - 1 to 0 by -1) {
          if (getColumnClass(counter) eq classOf[TreeTableModelSC]) {
            val me = e.asInstanceOf[MouseEvent]
            val newME = new MouseEvent(tree, me.getID, me.getWhen, me.getModifiers, me.getX - getCellRect(0, counter, true).x, me.getY, me.getClickCount, me.isPopupTrigger)
            tree.dispatchEvent(newME)
          }
        }
      }
      false
    }

    override def getCellEditorValue: AnyRef = null
  }

  /**
       * ListToTreeSelectionModelWrapper extends DefaultTreeSelectionModel
       * to listen for changes in the ListSelectionModel it maintains. Once
       * a change in the ListSelectionModel happens, the paths are updated
       * in the DefaultTreeSelectionModel.
       */
  class ListToTreeSelectionModelWrapper extends DefaultTreeSelectionModel {
    getListSelectionModel.addListSelectionListener(createListSelectionListener)

    /** Set to true when we are updating the ListSelectionModel. */
    protected var updatingListSelectionModel = false

    /**
             * Returns the list selection model. ListToTreeSelectionModelWrapper
             * listens for changes to this model and updates the selected paths
             * accordingly.
             */
    def getListSelectionModel = listSelectionModel

    /**
             * This is overridden to set <code>updatingListSelectionModel</code>
             * and message super. This is the only place DefaultTreeSelectionModel
             * alters the ListSelectionModel.
             */
    override def resetRowSelection(): Unit = {
      if (!updatingListSelectionModel) {
        updatingListSelectionModel = true
        try super.resetRowSelection()
        finally updatingListSelectionModel = false
      }
      // Notice how we don't message super if
      // updatingListSelectionModel is true. If
      // updatingListSelectionModel is true, it implies the
      // ListSelectionModel has already been updated and the
      // paths are the only thing that needs to be updated.
    }

    /**
             * Creates and returns an instance of ListSelectionHandler.
             */
    protected def createListSelectionListener = new ListSelectionHandler()

    /**
             * If <code>updatingListSelectionModel</code> is false, this will
             * reset the selected paths from the selected rows in the list
             * selection model.
             */
    protected def updateSelectedPathsFromSelectedRows(): Unit = {
      if (!updatingListSelectionModel) {
        updatingListSelectionModel = true
        try {
          // This is way expensive, ListSelectionModel needs an
          // enumerator for iterating.
          val min = listSelectionModel.getMinSelectionIndex
          val max = listSelectionModel.getMaxSelectionIndex
          clearSelection()
          if (min != -1 && max != -1) for (counter <- min to max) {
            if (listSelectionModel.isSelectedIndex(counter)) {
              val selPath = tree.getPathForRow(counter)
              if (selPath != null) addSelectionPath(selPath)
            }
          }
        } finally updatingListSelectionModel = false
      }
    }

    /**
      * Class responsible for calling updateSelectedPathsFromSelectedRows
      * when the selection of the list changse.
      */
    class ListSelectionHandler extends ListSelectionListener {
      override def valueChanged(e: ListSelectionEvent): Unit = {
        updateSelectedPathsFromSelectedRows()
      }
    }
  }
}
