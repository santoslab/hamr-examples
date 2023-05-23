// #Sireum

package RTS.Actuators

import org.sireum._
import art.{Art, ArtNative, Empty}
import RTS._

// This file was auto-generated.  Do not edit
@msig trait ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread)
  }

  /** helper function to set the values of all input ports.
   * @param tempPressureActuate payload for data port tempPressureActuate
   * @param saturationActuate payload for data port saturationActuate
   */
  def put_concrete_inputs(tempPressureActuate : Base_Types.Boolean,
                          saturationActuate : Base_Types.Boolean): Unit = {
    put_tempPressureActuate(tempPressureActuate)
    put_saturationActuate(saturationActuate)
  }


  // setter for in DataPort
  def put_tempPressureActuate(value : Base_Types.Boolean): Unit = {
    ArtNative.insertInPortValue(Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread.operational_api.tempPressureActuate_Id, Base_Types.Boolean_Payload(value))
  }

  // setter for in DataPort
  def put_saturationActuate(value : Base_Types.Boolean): Unit = {
    ArtNative.insertInPortValue(Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread.operational_api.saturationActuate_Id, Base_Types.Boolean_Payload(value))
  }

}
