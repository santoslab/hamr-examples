package tc.catgui

object DemoTreeTableModelSC {
  private val root = "System"
  protected var cNames: Array[String] = Array("State Element",  "Description", "Value")
  protected var cTypes: Array[Class[_]] = Array(classOf[TreeTableModelSC], classOf[String], classOf[String])
}

class DemoTreeTableModelSC (var list: Array[compSC]) extends AbstractTreeTableModelSC(DemoTreeTableModelSC.root) {
  def getPort(node: AnyRef, place: Int): AnyRef = {
    if (node.isInstanceOf[InputSC]) return node.asInstanceOf[InputSC].getColumn(place)
    if (node.isInstanceOf[OutputSC]) return node.asInstanceOf[OutputSC].getColumn(place)
    null
  }

  override def getColumnCount = 3

  override def getColumnClass(column: Int): Class[_] = {
    //return column == 0 ? TreeTableModel.class : Object.class;
    if (column < 0 || column >= DemoTreeTableModelSC.cTypes.length) return classOf[AnyRef]
    DemoTreeTableModelSC.cTypes(column)
  }

  override def getColumnName(column: Int): String = DemoTreeTableModelSC.cNames(column)

  override def getValueAt(node: AnyRef, column: Int): AnyRef = {
    //return node.toString();
    try column match {
      case 0 =>
        return node.toString
      case 1 =>
        return getPort(node, 1)
      case 2 =>
        return getPort(node, 2)
    }
    catch {
      case se: SecurityException =>

    }
    null
  }

  override def getChild(parent: AnyRef, index: Int): AnyRef = {
    //return "Child " + index;
    if (parent eq "System") return list(index)
    if (parent.isInstanceOf[compSC]) {
      val comp = parent.asInstanceOf[compSC]
      if (comp.getIn.getInputs.length > 0) {
        if (comp.getOut.getOutputs.length > 0) return if (index == 0) comp.getIn
        else comp.getOut
        return comp.getIn
      }
      else return comp.getOut
    }
    if (parent.isInstanceOf[InputsSC]) {
      val inputs = parent.asInstanceOf[InputsSC]
      return inputs.getInputs(index)
    }
    if (parent.isInstanceOf[OutputsSC]) {
      val outputs = parent.asInstanceOf[OutputsSC]
      return outputs.getOutputs(index)
    }
    ""
  }

  override def getChildCount(parent: AnyRef): Int = {
    //return parent.equals(root) ? 3 : 0;
    if (parent eq "System") return list.length
    if (parent.isInstanceOf[compSC]) {
      val comp = parent.asInstanceOf[compSC]
      var n = 0
      if (comp.getIn.getInputs.length > 0) n += 1
      if (comp.getOut.getOutputs.length > 0) n += 1
      return n
    }
    if (parent.isInstanceOf[InputsSC]) return parent.asInstanceOf[InputsSC].getInputs.length
    if (parent.isInstanceOf[OutputsSC]) return parent.asInstanceOf[OutputsSC].getOutputs.length
    0
  }
}
