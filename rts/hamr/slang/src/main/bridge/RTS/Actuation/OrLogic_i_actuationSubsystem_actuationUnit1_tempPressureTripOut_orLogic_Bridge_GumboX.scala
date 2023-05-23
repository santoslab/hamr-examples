// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._

// This file was auto-generated.  Do not edit
object OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_Bridge_GumboX {
  /** guarantees orOutput
    * @param api_actuate port variable
    * @param api_channel1 port variable
    * @param api_channel2 port variable
    */
  @strictpure def compute_spec_orOutput_guarantee(
      api_actuate: Base_Types.Boolean,
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean): B =
    api_actuate == (api_channel1 | api_channel2)


  /**
    * @param api_actuate port variable
    * @param api_channel1 port variable
    * @param api_channel2 port variable
    */
  @strictpure def time_triggered_oracle(
      api_actuate: Base_Types.Boolean,
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean): B =
    compute_spec_orOutput_guarantee(api_actuate, api_channel1, api_channel2)
}
