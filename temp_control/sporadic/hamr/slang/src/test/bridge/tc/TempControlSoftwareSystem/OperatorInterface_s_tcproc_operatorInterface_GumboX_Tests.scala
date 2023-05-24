package tc.TempControlSoftwareSystem

import org.sireum._
import tc.TempControlSoftwareSystem._
import tc.GumboXUtil
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class OperatorInterface_s_tcproc_operatorInterface_GumboX_Tests extends OperatorInterface_s_tcproc_operatorInterface_GumboX_TestHarness_ScalaTest {

  val failOnUnsatPreconditions: B = F

  {
    val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
    val ranLibtempChanged: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

    // getInputs - needed
    def getInputs(): Option[OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer] = {
      try {
        val api_tempChanged = Some(ranLibtempChanged.next_artEmpty()) // TODO: call option's next once slang check supports traits
        val api_currentTemp = ranLibcurrentTemp.next_TempSensorTemperature_i()

        return Some(OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer(api_tempChanged,api_currentTemp))
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
                        |    tempChanged = $o.api_tempChanged
                        |    currentTemp = $o.api_currentTemp""".render)

              testComputeCB(o.api_tempChanged, o.api_currentTemp) match {
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