package isolette.catgui

import javax.swing.tree.TreeModel

abstract class TreeTableModelSC extends TreeModel {
  def getColumnCount: Int

  def getColumnName(column: Int): String

  def getColumnClass(column: Int): Class[_]

  def getValueAt(node: AnyRef, column: Int): AnyRef

  def isCellEditable(node: AnyRef, column: Int): Boolean

  def setValueAt(aValue: AnyRef, node: AnyRef, column: Int): Unit
}
