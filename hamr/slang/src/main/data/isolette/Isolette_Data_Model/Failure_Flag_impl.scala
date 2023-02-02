// #Sireum

package isolette.Isolette_Data_Model

import org.sireum._
import isolette._

// This file was auto-generated.  Do not edit

object Failure_Flag_impl {
  def example(): Isolette_Data_Model.Failure_Flag_impl = {
    return Isolette_Data_Model.Failure_Flag_impl(Base_Types.Boolean_example())
  }
}

@datatype class Failure_Flag_impl(
  value : B) {
}

object Failure_Flag_impl_Payload {
  def example(): Failure_Flag_impl_Payload = {
    return Failure_Flag_impl_Payload(Isolette_Data_Model.Failure_Flag_impl.example())
  }
}

@datatype class Failure_Flag_impl_Payload(value: Isolette_Data_Model.Failure_Flag_impl) extends art.DataContent
