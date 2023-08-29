package tc.catgui

import javax.swing.event.{EventListenerList, TreeModelEvent, TreeModelListener}
import javax.swing.tree.TreePath

abstract class AbstractTreeTableModelSC(protected var root: AnyRef) extends TreeTableModelSC {
  protected var listenerList = new EventListenerList
  override def getRoot: AnyRef = root
  override def isLeaf(node: AnyRef): Boolean = getChildCount(node) == 0
  override def valueForPathChanged(path: TreePath, newValue: AnyRef): Unit = {
  }

  // This is not called in the JTree's default mode: use a naive implementation.
  override def getIndexOfChild(parent: AnyRef, child: AnyRef): Int = {
    for (i <- 0 until getChildCount(parent)) {
      if (getChild(parent, i) == child) return i
    }
    -1
  }

  override def addTreeModelListener(l: TreeModelListener): Unit = {
    listenerList.add(classOf[TreeModelListener], l)
  }

  override def removeTreeModelListener(l: TreeModelListener): Unit = {
    listenerList.remove(classOf[TreeModelListener], l)
  }

  /*
       * Notify all listeners that have registered interest for
       * notification on this event type.  The event instance
       * is lazily created using the parameters passed into
       * the fire method.
       * @see EventListenerList
       */
  protected def fireTreeNodesChanged(source: AnyRef, path: Array[AnyRef], childIndices: Array[Int], children: Array[AnyRef]): Unit = {
    // Guaranteed to return a non-null array
    val listeners = listenerList.getListenerList
    var e: TreeModelEvent = null
    // Process the listeners last to first, notifying
    // those that are interested in this event
    var i = listeners.length - 2
    while (i >= 0) {
      if (listeners(i) eq classOf[TreeModelListener]) {
        // Lazily create the event:
        if (e == null) e = new TreeModelEvent(source, path, childIndices, children)
        listeners(i + 1).asInstanceOf[TreeModelListener].treeNodesChanged(e)
      }

      i -= 2
    }
  }

  /*
       * Notify all listeners that have registered interest for
       * notification on this event type.  The event instance
       * is lazily created using the parameters passed into
       * the fire method.
       * @see EventListenerList
       */
  protected def fireTreeNodesInserted(source: AnyRef, path: Array[AnyRef], childIndices: Array[Int], children: Array[AnyRef]): Unit = {
    // Guaranteed to return a non-null array
    val listeners = listenerList.getListenerList
    var e: TreeModelEvent = null
    // Process the listeners last to first, notifying
    // those that are interested in this event
    var i = listeners.length - 2
    while (i >= 0) {
      if (listeners(i) eq classOf[TreeModelListener]) {
        // Lazily create the event:
        if (e == null) e = new TreeModelEvent(source, path, childIndices, children)
        listeners(i + 1).asInstanceOf[TreeModelListener].treeNodesInserted(e)
      }

      i -= 2
    }
  }

  /*
       * Notify all listeners that have registered interest for
       * notification on this event type.  The event instance
       * is lazily created using the parameters passed into
       * the fire method.
       * @see EventListenerList
       */
  protected def fireTreeNodesRemoved(source: AnyRef, path: Array[AnyRef], childIndices: Array[Int], children: Array[AnyRef]): Unit = {
    // Guaranteed to return a non-null array
    val listeners = listenerList.getListenerList
    var e: TreeModelEvent = null
    // Process the listeners last to first, notifying
    // those that are interested in this event
    var i = listeners.length - 2
    while (i >= 0) {
      if (listeners(i) eq classOf[TreeModelListener]) {
        // Lazily create the event:
        if (e == null) e = new TreeModelEvent(source, path, childIndices, children)
        listeners(i + 1).asInstanceOf[TreeModelListener].treeNodesRemoved(e)
      }

      i -= 2
    }
  }

  /*
       * Notify all listeners that have registered interest for
       * notification on this event type.  The event instance
       * is lazily created using the parameters passed into
       * the fire method.
       * @see EventListenerList
       */
  protected def fireTreeStructureChanged(source: AnyRef, path: Array[AnyRef], childIndices: Array[Int], children: Array[AnyRef]): Unit = {
    // Guaranteed to return a non-null array
    val listeners = listenerList.getListenerList
    var e: TreeModelEvent = null
    // Process the listeners last to first, notifying
    // those that are interested in this event
    var i = listeners.length - 2
    while (i >= 0) {
      if (listeners(i) eq classOf[TreeModelListener]) {
        // Lazily create the event:
        if (e == null) e = new TreeModelEvent(source, path, childIndices, children)
        listeners(i + 1).asInstanceOf[TreeModelListener].treeStructureChanged(e)
      }

      i -= 2
    }
  }

  //
  // Default impelmentations for methods in the TreeTableModel interface.
  //
  override def getColumnClass(column: Int): Class[_] = classOf[AnyRef]

  /** By default, make the column with the Tree in it the only editable one.
       *  Making this column editable causes the JTable to forward mouse
       *  and keyboard events in the Tree column to the underlying JTree.
       */
  override def isCellEditable(node: AnyRef, column: Int): Boolean = getColumnClass(column) eq classOf[TreeTableModelSC]

  override def setValueAt(aValue: AnyRef, node: AnyRef, column: Int): Unit = {
  }
  // Left to be implemented in the subclass:
  /*
       *   public Object getChild(Object parent, int index)
       *   public int getChildCount(Object parent)
       *   public int getColumnCount()
       *   public String getColumnName(Object node, int column)
       *   public Object getValueAt(Object node, int column)
       */
}
