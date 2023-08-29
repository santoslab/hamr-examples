package tc.catgui

class InputsSC(var inputs: Array[InputSC]){
  def getInputs: Array[InputSC] = { return inputs; }
  override def toString: String = { return "Input"; }
}
