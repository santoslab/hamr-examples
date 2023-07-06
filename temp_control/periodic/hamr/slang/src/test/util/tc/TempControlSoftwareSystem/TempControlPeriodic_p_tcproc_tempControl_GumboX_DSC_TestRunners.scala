// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class TempControlPeriodic_p_tcproc_tempControl_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[TempControlPeriodic_p_tcproc_tempControl_DSC_TestVector]
  with TempControlPeriodic_p_tcproc_tempControl_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibfanAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibsetPoint: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): TempControlPeriodic_p_tcproc_tempControl_DSC_TestVector = {
    val api_currentTemp = ranLibcurrentTemp.nextTempSensorTemperature_i()
    val api_fanAck = ranLibfanAck.nextCoolingFanFanAckType()
    val api_setPoint = ranLibsetPoint.nextTempControlSoftwareSystemSetPoint_i()
    return TempControlPeriodic_p_tcproc_tempControl_DSC_TestVector(
      api_currentTemp, api_fanAck, api_setPoint
    )
  }

  override def toCompactJson(o: TempControlPeriodic_p_tcproc_tempControl_DSC_TestVector): String = {
    return tc.JSON.fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_DSC_TestVector(o, T)
  }

  override def fromJson(json: String): TempControlPeriodic_p_tcproc_tempControl_DSC_TestVector = {
    tc.JSON.toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_DSC_TestVector(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: TempControlPeriodic_p_tcproc_tempControl_DSC_TestVector): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_currentTemp, o.api_fanAck, o.api_setPoint) match {
      case GumboXResult.Pre_Condition_Unsat =>
        tc.DSC_RecordUnsatPre.report(tc.JSON.fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_DSC_TestVector(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}

@record class TempControlPeriodic_p_tcproc_tempControl_GumboX_DSC_TestRunnerwL
  extends Random.Gen.TestRunner[TempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL]
  with TempControlPeriodic_p_tcproc_tempControl_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLiblatestFanCmd: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibfanAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibsetPoint: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): TempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL = {
    val In_latestFanCmd = ranLiblatestFanCmd.nextCoolingFanFanCmdType()
    val api_currentTemp = ranLibcurrentTemp.nextTempSensorTemperature_i()
    val api_fanAck = ranLibfanAck.nextCoolingFanFanAckType()
    val api_setPoint = ranLibsetPoint.nextTempControlSoftwareSystemSetPoint_i()
    return TempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL(
      In_latestFanCmd, api_currentTemp, api_fanAck, api_setPoint
    )
  }

  override def toCompactJson(o: TempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL): String = {
    return tc.JSON.fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL(o, T)
  }

  override def fromJson(json: String): TempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL = {
    tc.JSON.toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: TempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBwL(o.In_latestFanCmd, o.api_currentTemp, o.api_fanAck, o.api_setPoint) match {
      case GumboXResult.Pre_Condition_Unsat =>
        tc.DSC_RecordUnsatPre.report(tc.JSON.fromTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_DSC_TestVectorwL(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}
