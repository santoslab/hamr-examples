package RTS.Actuation

import org.sireum._
import RTS.Actuation._
import RTS.GumboXUtil
import RTS.GumboXUtil.GumboXResult
import RTS.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// This file was auto-generated.  Do not edit
class Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_GumboX_Tests extends Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_GumboX_TestHarness_ScalaTest {

  val failOnUnsatPreconditions: B = F

  {
    val seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
    val ranLibinput: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
    val ranLibmanualActuatorInput: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

    // getInputs - needed
    def getInputs(): Option[Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_SlangCheckContainer] = {
      try {
        val api_input = ranLibinput.next_B()
        val api_manualActuatorInput = ranLibmanualActuatorInput.next_B()

        return Some(Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_SlangCheckContainer(api_input,api_manualActuatorInput))
      } catch {
        case e: AssertionError => return None()
      }
    }

    for (i <- 0 to 100) {
      this.registerTest(i.toString) {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numRetries && retry) {
          getInputs() match {
            case Some(o) =>

              println(st"""${if (j > 0) s"Retry $j: " else ""}Testing with
                        |    input = $o.api_input
                        |    manualActuatorInput = $o.api_manualActuatorInput""".render)

              testComputeCB(o.api_input, o.api_manualActuatorInput) match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  // success
                  println ("Success!")
                  retry = F
              }
            case _ =>
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }
}