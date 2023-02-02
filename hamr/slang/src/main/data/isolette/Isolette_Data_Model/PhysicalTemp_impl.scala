// #Sireum

package isolette.Isolette_Data_Model

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

object PhysicalTemp_impl {
  def example(): Isolette_Data_Model.PhysicalTemp_impl = {
    return Isolette_Data_Model.PhysicalTemp_impl(Base_Types.Float_32_example())
  }
}

@datatype class PhysicalTemp_impl(
  value : F32) {
}

object PhysicalTemp_impl_Payload {
  def example(): PhysicalTemp_impl_Payload = {
    return PhysicalTemp_impl_Payload(Isolette_Data_Model.PhysicalTemp_impl.example())
  }
}

@datatype class PhysicalTemp_impl_Payload(value: Isolette_Data_Model.PhysicalTemp_impl) extends art.DataContent
