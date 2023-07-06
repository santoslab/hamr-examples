// #Sireum
package tc

import org.sireum._

object GumboXUtil {

  var numTests: Z = 100

  var numTestVectorGenRetries: Z = 100

  @enum object GumboXResult {
    "Pre_Condition_Unsat"
    "Post_Condition_Pass"
    "Post_Condition_Fail"
  }
}