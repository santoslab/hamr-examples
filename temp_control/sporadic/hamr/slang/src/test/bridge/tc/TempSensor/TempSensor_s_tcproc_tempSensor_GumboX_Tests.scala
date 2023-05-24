package tc.TempSensor

import org.sireum._
import tc.TempSensor._
import tc.GumboXUtil
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class TempSensor_s_tcproc_tempSensor_GumboX_Tests extends TempSensor_s_tcproc_tempSensor_GumboX_TestHarness_ScalaTest {

  val failOnUnsatPreconditions: B = F

  {
    val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)

    // getInputs - needed
    def getInputs(): Option[TempSensor_s_tcproc_tempSensor_SlangCheckContainer] = {
      try {

        return Some(TempSensor_s_tcproc_tempSensor_SlangCheckContainer())
      } catch {
        case e: AssertionError => return None()
      }
    }

    for (i <- 0 to 100) {
      this.registerTest(i.toString) {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numRetries && retry) {
          getInputs() match {
            case Some(o) =>

              println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                        """.render)

              testComputeCB() match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  // success
                  println ("Success!")
                  retry = F
              }
            case _ =>
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }
}