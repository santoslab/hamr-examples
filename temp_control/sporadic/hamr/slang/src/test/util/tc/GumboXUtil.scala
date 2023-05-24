// #Sireum
package tc

import org.sireum._

object GumboXUtil {

  var numRetries: Z = 100

  @enum object GumboXResult {
    "Pre_Condition_Unsat"
    "Post_Condition_Pass"
    "Post_Condition_Fail"
  }
}