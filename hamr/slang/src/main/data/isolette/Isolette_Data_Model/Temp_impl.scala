// #Sireum

package isolette.Isolette_Data_Model

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

object Temp_impl {
  def example(): Isolette_Data_Model.Temp_impl = {
    return Isolette_Data_Model.Temp_impl(Base_Types.Float_32_example())
  }
}

@datatype class Temp_impl(
  value : F32) {
}

object Temp_impl_Payload {
  def example(): Temp_impl_Payload = {
    return Temp_impl_Payload(Isolette_Data_Model.Temp_impl.example())
  }
}

@datatype class Temp_impl_Payload(value: Isolette_Data_Model.Temp_impl) extends art.DataContent
