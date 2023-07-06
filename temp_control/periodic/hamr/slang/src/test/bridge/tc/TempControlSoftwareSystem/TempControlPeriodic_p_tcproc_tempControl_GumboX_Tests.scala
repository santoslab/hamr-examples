package tc.TempControlSoftwareSystem

import org.sireum._
import tc.TempControlSoftwareSystem._
import tc.GumboXUtil
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
class TempControlPeriodic_p_tcproc_tempControl_GumboX_Tests extends TempControlPeriodic_p_tcproc_tempControl_GumboX_TestHarness_ScalaTest {

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  val failOnUnsatPreconditions: B = F

  val verbose: B = F

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibfanAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibsetPoint: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblatestFanCmd: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  def getTestVector(): Option[TempControlPeriodic_p_tcproc_tempControl_DSC_TestVector] = {
    try {
      val api_currentTemp = ranLibcurrentTemp.nextTempSensorTemperature_i()
      val api_fanAck = ranLibfanAck.nextCoolingFanFanAckType()
      val api_setPoint = ranLibsetPoint.nextTempControlSoftwareSystemSetPoint_i()

      return Some(TempControlPeriodic_p_tcproc_tempControl_DSC_TestVector(api_currentTemp,api_fanAck,api_setPoint))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  def getTestVectorwL(): Option[TempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL] = {
    try {
      val In_latestFanCmd = ranLiblatestFanCmd.nextCoolingFanFanCmdType()
      val api_currentTemp = ranLibcurrentTemp.nextTempSensorTemperature_i()
      val api_fanAck = ranLibfanAck.nextCoolingFanFanAckType()
      val api_setPoint = ranLibsetPoint.nextTempControlSoftwareSystemSetPoint_i()

      return Some(TempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL(In_latestFanCmd,api_currentTemp,api_fanAck,api_setPoint))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  {
    for (i <- 0 to GumboXUtil.numTests) {
      testInitialiseCB() match {
        case GumboXResult.Pre_Condition_Unsat =>
          halt("Infeasible as initialize entry points cannot contain assume clauses and cannot access incoming ports or state variables")
        case GumboXResult.Post_Condition_Fail =>
          fail ("Post condition did not hold")
        case GumboXResult.Post_Condition_Pass =>
          if (verbose) {
            println ("Success!")
          }
      }
    }
  }

  {

    for (i <- 0 to GumboXUtil.numTests) {
      this.registerTest(s"testComputeCB_$i") {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numTestVectorGenRetries && retry) {
          getTestVector() match {
            case Some(o) =>

              if (verbose) {
                println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                            |    currentTemp = $o.api_currentTemp
                            |    fanAck = $o.api_fanAck
                            |    setPoint = $o.api_setPoint""".render)
              }

              testComputeCB(o.api_currentTemp, o.api_fanAck, o.api_setPoint) match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println ("Success!")
                  }
                  retry = F
              }
            case _ =>
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }

  {

    for (i <- 0 to GumboXUtil.numTests) {
      this.registerTest(s"testComputeCBwL_$i") {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numTestVectorGenRetries && retry) {
          getTestVectorwL() match {
            case Some(o) =>

              if (verbose) {
                println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                            |    latestFanCmd = $o.In_latestFanCmd
                            |    currentTemp = $o.api_currentTemp
                            |    fanAck = $o.api_fanAck
                            |    setPoint = $o.api_setPoint""".render)
              }

              testComputeCBwL(o.In_latestFanCmd, o.api_currentTemp, o.api_fanAck, o.api_setPoint) match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println ("Success!")
                  }
                  retry = F
              }
            case _ =>
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }
}