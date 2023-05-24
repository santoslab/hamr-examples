// #Sireum

package tc.TempSensor

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class TempSensor_s_tcproc_tempSensor_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[TempSensor_s_tcproc_tempSensor_SlangCheckContainer]
  with TempSensor_s_tcproc_tempSensor_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)

  override def next(): TempSensor_s_tcproc_tempSensor_SlangCheckContainer = {
    return TempSensor_s_tcproc_tempSensor_SlangCheckContainer(
    )
  }

  override def toCompactJson(o: TempSensor_s_tcproc_tempSensor_SlangCheckContainer): String = {
    return tc.JSON.fromTempSensorTempSensor_s_tcproc_tempSensor_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): TempSensor_s_tcproc_tempSensor_SlangCheckContainer = {
    tc.JSON.toTempSensorTempSensor_s_tcproc_tempSensor_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: TempSensor_s_tcproc_tempSensor_SlangCheckContainer): B = {
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