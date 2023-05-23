// #Sireum

package RTS.Actuation

import org.sireum._
import art.{Art, ArtNative, Empty}
import RTS._

// This file was auto-generated.  Do not edit
@msig trait CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic)
  }

  /** helper function to set the values of all input ports.
   * @param channel1 payload for data port channel1
   * @param channel2 payload for data port channel2
   * @param channel3 payload for data port channel3
   * @param channel4 payload for data port channel4
   */
  def put_concrete_inputs(channel1 : Base_Types.Boolean,
                          channel2 : Base_Types.Boolean,
                          channel3 : Base_Types.Boolean,
                          channel4 : Base_Types.Boolean): Unit = {
    put_channel1(channel1)
    put_channel2(channel2)
    put_channel3(channel3)
    put_channel4(channel4)
  }


  /** helper function to check CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param actuate method that will be called with the value of the outgoing data
   *        port 'actuate'.
   */
  def check_concrete_output(actuate: Base_Types.Boolean => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val actuateValue: Base_Types.Boolean = get_actuate().get
    if(!actuate(actuateValue)) {
      testFailures = testFailures :+ st"'actuate' did not match expected: value of the outgoing data port is ${actuateValue}"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in DataPort
  def put_channel1(value : Base_Types.Boolean): Unit = {
    ArtNative.insertInPortValue(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.operational_api.channel1_Id, Base_Types.Boolean_Payload(value))
  }

  // setter for in DataPort
  def put_channel2(value : Base_Types.Boolean): Unit = {
    ArtNative.insertInPortValue(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.operational_api.channel2_Id, Base_Types.Boolean_Payload(value))
  }

  // setter for in DataPort
  def put_channel3(value : Base_Types.Boolean): Unit = {
    ArtNative.insertInPortValue(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.operational_api.channel3_Id, Base_Types.Boolean_Payload(value))
  }

  // setter for in DataPort
  def put_channel4(value : Base_Types.Boolean): Unit = {
    ArtNative.insertInPortValue(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.operational_api.channel4_Id, Base_Types.Boolean_Payload(value))
  }

  // getter for out DataPort
  def get_actuate(): Option[Base_Types.Boolean] = {
    val value: Option[Base_Types.Boolean] = get_actuate_payload() match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port actuate.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_actuate_payload(): Option[Base_Types.Boolean_Payload] = {
    return ArtNative.observeOutPortValue(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.initialization_api.actuate_Id).asInstanceOf[Option[Base_Types.Boolean_Payload]]
  }

}
