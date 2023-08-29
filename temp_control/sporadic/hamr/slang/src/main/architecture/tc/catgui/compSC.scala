package tc.catgui

class compSC(val in:InputsSC, val out:OutputsSC, val name:String){
  def getIn: InputsSC = { return in; }
  def getOut: OutputsSC = { return out; }
  override def toString: String = { return name; }
}
