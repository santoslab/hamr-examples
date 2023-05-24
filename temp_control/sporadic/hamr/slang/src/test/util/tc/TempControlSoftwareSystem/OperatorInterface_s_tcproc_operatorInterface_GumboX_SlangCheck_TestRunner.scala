// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class OperatorInterface_s_tcproc_operatorInterface_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer]
  with OperatorInterface_s_tcproc_operatorInterface_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibtempChanged: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer = {
    val api_tempChanged = Some(ranLibtempChanged.next_artEmpty()) // TODO: call option's next once slang check supports traits
    val api_currentTemp = ranLibcurrentTemp.next_TempSensorTemperature_i()
    return OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer(
      api_tempChanged, api_currentTemp
    )
  }

  override def toCompactJson(o: OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer): String = {
    return tc.JSON.fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer = {
    tc.JSON.toTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: OperatorInterface_s_tcproc_operatorInterface_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_tempChanged, o.api_currentTemp) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}