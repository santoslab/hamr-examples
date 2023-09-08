package RTS.Actuation

import org.sireum._
import RTS.Actuation._
import RTS.GumboXUtil
import RTS.GumboXUtil.GumboXResult
import RTS.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

trait CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_GumboX_TestHarness_ScalaTest_Generator extends CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_GumboX_TestHarness_ScalaTest {

  def failOnUnsatPreconditions: B = F

  def seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)

  def getProfiles_P: ISZ[CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_Profile_P]

  def getDefaultProfile_P: CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_Profile_P = {
    return CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_Profile_P (
      name = "Default Port Profile", 
      numTests = 100, 
      api_channel1 = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_channel2 = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_channel3 = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_channel4 = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))))
  }

  def next(profile: CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_Profile_P): Option[CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P] = {
    try {
      val api_channel1 = profile.api_channel1.nextB()
      val api_channel2 = profile.api_channel2.nextB()
      val api_channel3 = profile.api_channel3.nextB()
      val api_channel4 = profile.api_channel4.nextB()

      return Some(CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(api_channel1,api_channel2,api_channel3,api_channel4))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  for (profile <- getProfiles_P) {
    testComputeCB_Profile_P(profile)
  }

  def testComputeCB_Profile_P(profile: CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_Profile_P): Unit = {
    for (i <- 0 to profile.numTests) {
      this.registerTest(s"Profile \"${profile.name}\": testComputeCB_$i") {
        var retry: B = T

        var j: Z = 0
        while (j < GumboXUtil.numTestVectorGenRetries && retry) {
          next(profile) match {
            case Some(o) =>

              if (verbose && j > 0) {
                println(s"Retry $j:")
              }

              val results = testComputeCBV(o)

              if (verbose) {
                val tq = "\"\"\""
                println(st"""Replay Unit Test:
                            |  test("Profile \"${profile.name}\": testComputeCB_$i") {
                            |    val json = st${tq}${RTS.JSON.fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(o, T)}${tq}.render
                            |    val testVector = RTS.JSON.toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(json).left
                            |    assert (testComputeCBV(testVector) == RTS.GumboXUtil.GumboXResult.$results)
                            |  }""".render)
              }

              results match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println ("Success!")
                  }
                  retry = F
              }
            case _ =>
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }
}