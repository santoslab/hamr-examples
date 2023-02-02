// #Sireum

package isolette.Isolette_Data_Model

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

object TempWstatus_impl {
  def example(): Isolette_Data_Model.TempWstatus_impl = {
    return Isolette_Data_Model.TempWstatus_impl(Base_Types.Float_32_example(), Isolette_Data_Model.ValueStatus.byOrdinal(0).get)
  }
}

@datatype class TempWstatus_impl(
  value : F32,
  status : Isolette_Data_Model.ValueStatus.Type) {
}

object TempWstatus_impl_Payload {
  def example(): TempWstatus_impl_Payload = {
    return TempWstatus_impl_Payload(Isolette_Data_Model.TempWstatus_impl.example())
  }
}

@datatype class TempWstatus_impl_Payload(value: Isolette_Data_Model.TempWstatus_impl) extends art.DataContent
