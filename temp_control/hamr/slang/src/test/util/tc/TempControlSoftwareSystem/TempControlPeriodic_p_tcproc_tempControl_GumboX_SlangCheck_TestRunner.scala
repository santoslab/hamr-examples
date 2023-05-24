// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class TempControlPeriodic_p_tcproc_tempControl_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer]
  with TempControlPeriodic_p_tcproc_tempControl_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibfanAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibsetPoint: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer = {
    val api_currentTemp = ranLibcurrentTemp.next_TempSensorTemperature_i()
    val api_fanAck = ranLibfanAck.next_CoolingFanFanAckType()
    val api_setPoint = ranLibsetPoint.next_TempControlSoftwareSystemSetPoint_i()
    return TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer(
      api_currentTemp, api_fanAck, api_setPoint
    )
  }

  override def toCompactJson(o: TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer): String = {
    return tc.JSON.fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer = {
    tc.JSON.toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_currentTemp, o.api_fanAck, o.api_setPoint) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}