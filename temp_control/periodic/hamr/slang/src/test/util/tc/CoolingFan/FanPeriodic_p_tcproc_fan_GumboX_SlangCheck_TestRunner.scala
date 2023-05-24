// #Sireum

package tc.CoolingFan

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class FanPeriodic_p_tcproc_fan_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[FanPeriodic_p_tcproc_fan_SlangCheckContainer]
  with FanPeriodic_p_tcproc_fan_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibfanCmd: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): FanPeriodic_p_tcproc_fan_SlangCheckContainer = {
    val api_fanCmd = ranLibfanCmd.next_CoolingFanFanCmdType()
    return FanPeriodic_p_tcproc_fan_SlangCheckContainer(
      api_fanCmd
    )
  }

  override def toCompactJson(o: FanPeriodic_p_tcproc_fan_SlangCheckContainer): String = {
    return tc.JSON.fromCoolingFanFanPeriodic_p_tcproc_fan_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): FanPeriodic_p_tcproc_fan_SlangCheckContainer = {
    tc.JSON.toCoolingFanFanPeriodic_p_tcproc_fan_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: FanPeriodic_p_tcproc_fan_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_fanCmd) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}