// #Sireum

package RTS.Actuation

import org.sireum._
import RTS.GumboXUtil.GumboXResult
import RTS.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SlangCheckContainer]
  with OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibchannel1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibchannel2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SlangCheckContainer = {
    val api_channel1 = ranLibchannel1.next_B()
    val api_channel2 = ranLibchannel2.next_B()
    return OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SlangCheckContainer(
      api_channel1, api_channel2
    )
  }

  override def toCompactJson(o: OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SlangCheckContainer): String = {
    return RTS.JSON.fromActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SlangCheckContainer = {
    RTS.JSON.toActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_channel1, o.api_channel2) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}