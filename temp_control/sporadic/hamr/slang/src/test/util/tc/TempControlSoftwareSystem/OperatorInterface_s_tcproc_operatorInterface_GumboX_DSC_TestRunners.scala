// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class OperatorInterface_s_tcproc_operatorInterface_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[OperatorInterface_s_tcproc_operatorInterface_DSC_TestVector]
  with OperatorInterface_s_tcproc_operatorInterface_GumboX_TestHarness {

  val verbose: B = F

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibtempChanged: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): OperatorInterface_s_tcproc_operatorInterface_DSC_TestVector = {
    val api_tempChanged = ranLibtempChanged.nextOption_artEmpty()
    val api_currentTemp = ranLibcurrentTemp.nextTempSensorTemperature_i()
    return OperatorInterface_s_tcproc_operatorInterface_DSC_TestVector(
      api_tempChanged, api_currentTemp
    )
  }

  override def toCompactJson(o: OperatorInterface_s_tcproc_operatorInterface_DSC_TestVector): String = {
    return tc.JSON.fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_DSC_TestVector(o, T)
  }

  override def fromJson(json: String): OperatorInterface_s_tcproc_operatorInterface_DSC_TestVector = {
    tc.JSON.toTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_DSC_TestVector(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: OperatorInterface_s_tcproc_operatorInterface_DSC_TestVector): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        tc.DSC_RecordUnsatPre.report(tc.JSON.fromTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_DSC_TestVector(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}
