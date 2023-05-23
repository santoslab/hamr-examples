// #Sireum

package RTS.Actuation

import org.sireum._
import RTS.GumboXUtil.GumboXResult
import RTS.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
@record class Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_GumboX_SlangCheck_TestRunner
  extends Random.Gen.TestRunner[Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SlangCheckContainer]
  with Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_GumboX_TestHarness {

  val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibinput: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibmanualActuatorInput: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SlangCheckContainer = {
    val api_input = ranLibinput.next_B()
    val api_manualActuatorInput = ranLibmanualActuatorInput.next_B()
    return Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SlangCheckContainer(
      api_input, api_manualActuatorInput
    )
  }

  override def toCompactJson(o: Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SlangCheckContainer): String = {
    return RTS.JSON.fromActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SlangCheckContainer(o, T)
  }

  override def fromJson(json: String): Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SlangCheckContainer = {
    RTS.JSON.toActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SlangCheckContainer(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SlangCheckContainer): B = {
    BeforeEntrypoint()
    val r: B = testComputeCB(o.api_input, o.api_manualActuatorInput) match {
      case GumboXResult.Pre_Condition_Unsat => T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}