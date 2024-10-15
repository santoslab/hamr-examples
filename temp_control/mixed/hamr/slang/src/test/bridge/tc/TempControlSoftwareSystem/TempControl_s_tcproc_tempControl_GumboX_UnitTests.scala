package tc.TempControlSoftwareSystem

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.util.{Container, UnitTestConfigurationBatch}
import tc.TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_UnitTestConfiguration_Util._

// This file will not be overwritten so is safe to edit

class TempControl_s_tcproc_tempControl_GumboX_UnitTests extends TempControl_s_tcproc_tempControl_GumboX_TestHarness_ScalaTest {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  val verbose: B = F

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  val failOnUnsatPreconditions: B = F

  def configs: MSZ[UnitTestConfigurationBatch] = {
    //
    var dcwL = defaultComputewLConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions,
      name = "Compute_Config_with_state_vars_and_constrained_setPoint_and_currentTemp", // give it a unique name as test names must be unique
      description =
        st"""SetPoint's data invariants (50 <= low <= high <= 110) makes it difficult to randomly generate an
            |unconstrained SetPoint that satisfies the invariants.  Therefore make a copy of the default compute
            |config that includes state variables s.t. it ensures generated F32's are within range.  Note however
            |it doesn't enforce the constraint that low <= high, so some generated values will be rejected.
            |Also only generate currentTemp s.t. they satisfy TempControl's integration constraint.""".render,

      // there are 3 incoming events so bump up the number of tests to try and get this configuration
      // to provide coverage over the 3 different event handlers -- will need code coverage info to confirm
      numTests = 300
    )

    // get a reference to the config's profile. The profile is mutable so it can be side affected
    val p = dcwL.profile

    // create an F32 config such that it only generates F32's between 50 and 110 (SetPoint's datatype
    // invariant) when generating SetPoints. This uses an existing F32 config to simplify things.
    val constrained = p.api_setPoint.get_Config_F32(low = Some(50.0f), high = Some(110.0f))

    // assign the constrained config to any random lib that will generate a SetPoint
    p.In_currentSetPoint.set_Config_F32(constrained) // the random lib for the incoming event data port
    p.api_setPoint.set_Config_F32(constrained) // the random lib for the state var

    // only generate f32s for currentTemp s.t. they satisfy TempControl's integration constraint
    p.api_currentTemp.set_Config_F32(p.api_currentTemp.get_Config_F32(low = Some(-128.6f), high = Some(134.0f)))

    dcwL = dcwL(profile = p) // make a copy of the new config, updating its profile with the our desired profile

    var dc = defaultComputeConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions,
      name = "Compute_Config_without_state_vars_and_constrained_setPoint_and_currentTemp")
    dc = dc(profile = p)

    return MSZ(
      defaultInitializeConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions),
      //defaultComputeConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions),
      //defaultComputewLConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions)
      dc,
      dcwL
    )
  }


  for (c <- configs) {
    def next: Option[Container] = {
      try {
        c.profile.next match {
          case (cp: TempControl_s_tcproc_tempControl_PreState_Container) =>
            // only allow one incoming event
            if (ops.ISZOps(ISZ(cp.api_fanAck.nonEmpty, cp.api_setPoint.nonEmpty, cp.api_tempChanged.nonEmpty)).filter(p => p).size == 1)
              return Some(cp)
            else return None()
          case c =>
            return Some(c)
        }
      } catch {
        case e: AssertionError => // SlangCheck was unable to satisfy a datatype's filter
          return None()
      }
    }

    for (i <- 0 until c.numTests) {
      val testName = s"${c.name}_$i"

      this.registerTest(testName) {
        var retry: B = T

        var j: Z = 0
        while (j < c.numTestVectorGenRetries && retry) {
          next match {
            case Some(o) =>

              if (verbose && j > 1) {
                println(s"Retry $j:")
              }

              val results = c.test(o)

              if (verbose) {
                c.genReplay(o, testName, results) match {
                  case Some(s) => println(s)
                  case _ =>
                }
              }

              results match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println("Success!")
                  }
                  retry = F
              }
            case _ =>

          }
          j = j + 1
        }

        if (retry) {
          if (c.failOnUnsatPreconditions) {
            fail("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }

  def configsToJson: String = {
    return st"[ ${(for (c <- configs) yield s"\"${c.name}|${c.description}\"", ", ")} ]".render
  }
}
