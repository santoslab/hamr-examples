// #Sireum

package RTS.EventControl

import org.sireum._
import art.{Art, ArtNative, Empty}
import RTS._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
@msig trait EventControlMockThread_i_eventControlMock_eventControlMockThread_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.RTS_i_Instance_eventControlMock_eventControlMockThread)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.RTS_i_Instance_eventControlMock_eventControlMockThread)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.RTS_i_Instance_eventControlMock_eventControlMockThread)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.RTS_i_Instance_eventControlMock_eventControlMockThread)
  }

  /** helper function to check EventControlMockThread_i_eventControlMock_eventControlMockThread's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param manualActuatorInput1 method that will be called with the value of the outgoing data
   *        port 'manualActuatorInput1'.
   * @param manualActuatorInput2 method that will be called with the value of the outgoing data
   *        port 'manualActuatorInput2'.
   */
  def check_concrete_output(manualActuatorInput1: Base_Types.Boolean => B,
                            manualActuatorInput2: Base_Types.Boolean => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val manualActuatorInput1Value: Base_Types.Boolean = get_manualActuatorInput1().get
    if(!manualActuatorInput1(manualActuatorInput1Value)) {
      testFailures = testFailures :+ st"'manualActuatorInput1' did not match expected: value of the outgoing data port is ${manualActuatorInput1Value}"
    }
    val manualActuatorInput2Value: Base_Types.Boolean = get_manualActuatorInput2().get
    if(!manualActuatorInput2(manualActuatorInput2Value)) {
      testFailures = testFailures :+ st"'manualActuatorInput2' did not match expected: value of the outgoing data port is ${manualActuatorInput2Value}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // getter for out DataPort
  def get_manualActuatorInput1(): Option[Base_Types.Boolean] = {
    val value: Option[Base_Types.Boolean] = get_manualActuatorInput1_payload() match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port manualActuatorInput1.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_manualActuatorInput1_payload(): Option[Base_Types.Boolean_Payload] = {
    return ArtNative.observeOutPortValue(Arch.RTS_i_Instance_eventControlMock_eventControlMockThread.initialization_api.manualActuatorInput1_Id).asInstanceOf[Option[Base_Types.Boolean_Payload]]
  }

  // getter for out DataPort
  def get_manualActuatorInput2(): Option[Base_Types.Boolean] = {
    val value: Option[Base_Types.Boolean] = get_manualActuatorInput2_payload() match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port manualActuatorInput2.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_manualActuatorInput2_payload(): Option[Base_Types.Boolean_Payload] = {
    return ArtNative.observeOutPortValue(Arch.RTS_i_Instance_eventControlMock_eventControlMockThread.initialization_api.manualActuatorInput2_Id).asInstanceOf[Option[Base_Types.Boolean_Payload]]
  }

}
