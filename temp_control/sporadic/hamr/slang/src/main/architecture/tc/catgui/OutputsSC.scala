package tc.catgui

class OutputsSC(var outputs: Array[OutputSC]) {
  def getOutputs: Array[OutputSC] = { return outputs; }
  override def toString: String = { return "Output"; }
}
