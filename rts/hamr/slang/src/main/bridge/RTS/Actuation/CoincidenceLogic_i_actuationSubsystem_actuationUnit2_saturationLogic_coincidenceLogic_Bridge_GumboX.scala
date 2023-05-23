// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._

// This file was auto-generated.  Do not edit
object CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_Bridge_GumboX {
  /** guarantees coincidenceOutput
    * @param api_actuate port variable
    * @param api_channel1 port variable
    * @param api_channel2 port variable
    * @param api_channel3 port variable
    * @param api_channel4 port variable
    */
  @strictpure def compute_spec_coincidenceOutput_guarantee(
      api_actuate: Base_Types.Boolean,
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_channel3: Base_Types.Boolean,
      api_channel4: Base_Types.Boolean): B =
    api_actuate == (api_channel1 & api_channel2 | api_channel1 & api_channel3 | api_channel1 & api_channel4 | api_channel2 & api_channel3 | api_channel2 & api_channel4 | api_channel3 & api_channel4)


  /**
    * @param api_actuate port variable
    * @param api_channel1 port variable
    * @param api_channel2 port variable
    * @param api_channel3 port variable
    * @param api_channel4 port variable
    */
  @strictpure def time_triggered_oracle(
      api_actuate: Base_Types.Boolean,
      api_channel1: Base_Types.Boolean,
      api_channel2: Base_Types.Boolean,
      api_channel3: Base_Types.Boolean,
      api_channel4: Base_Types.Boolean): B =
    compute_spec_coincidenceOutput_guarantee(api_actuate, api_channel1, api_channel2, api_channel3, api_channel4)
}
