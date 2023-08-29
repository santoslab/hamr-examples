package tc.catgui

class OutputSC(var column: Array[String]) {
  var updated: Boolean = false;

  def getColumn: Array[String] = {
    return column;
  }

  def setColumn(columnN: Array[String]): Unit = {
    column = columnN;
  }

  def getUpdated: Boolean = {
    return updated;
  }

  def setUpdated(updatedN: Boolean): Unit = {
    updated = updatedN;
  }

  override def toString: String = {
    return column(0);
  }
}
