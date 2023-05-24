// #Sireum

package tc.TempSensor

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class TempSensorPeriodic_p_tcproc_tempSensor_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[TempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer]
  with TempSensorPeriodic_p_tcproc_tempSensor_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)

  override def next(): TempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer = {
    return TempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer(
    )
  }

  override def toCompactJson(o: TempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer): String = {
    return tc.JSON.fromTempSensorTempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): TempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer = {
    tc.JSON.toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: TempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB() match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}