// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[OperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer]
  with OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrentTemp: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): OperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer = {
    val api_currentTemp = ranLibcurrentTemp.next_TempSensorTemperature_i()
    return OperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer(
      api_currentTemp
    )
  }

  override def toCompactJson(o: OperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer): String = {
    return tc.JSON.fromTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): OperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer = {
    tc.JSON.toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: OperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_currentTemp) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}