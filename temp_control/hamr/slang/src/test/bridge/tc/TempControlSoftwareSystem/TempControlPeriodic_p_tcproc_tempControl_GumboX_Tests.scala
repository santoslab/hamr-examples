package tc.TempControlSoftwareSystem

import org.sireum._
import tc.TempControlSoftwareSystem._
import tc.GumboXUtil
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class TempControlPeriodic_p_tcproc_tempControl_GumboX_Tests extends TempControlPeriodic_p_tcproc_tempControl_GumboX_TestHarness_ScalaTest {

  val failOnUnsatPreconditions: B = F

  {
    val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
    val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibfanAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibsetPoint: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

    // getInputs - needed
    def getInputs(): Option[TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer] = {
      try {
        val api_currentTemp = ranLibcurrentTemp.next_TempSensorTemperature_i()
        val api_fanAck = ranLibfanAck.next_CoolingFanFanAckType()
        val api_setPoint = ranLibsetPoint.next_TempControlSoftwareSystemSetPoint_i()

        return Some(TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer(api_currentTemp,api_fanAck,api_setPoint))
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
                        |    currentTemp = $o.api_currentTemp
                        |    fanAck = $o.api_fanAck
                        |    setPoint = $o.api_setPoint""".render)

              testComputeCB(o.api_currentTemp, o.api_fanAck, o.api_setPoint) match {
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