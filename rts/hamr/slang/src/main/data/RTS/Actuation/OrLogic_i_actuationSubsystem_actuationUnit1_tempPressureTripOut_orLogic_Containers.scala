// #Sireum

package RTS.Actuation

import org.sireum._
import RTS._
import RTS.util.Container

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@sig trait OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container extends Container {
  def api_channel1: B
  def api_channel2: B
}

// container for incoming ports
@datatype class OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P (
  val api_channel1: B,
  val api_channel2: B) extends OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container

// container for incoming ports and state variables
@datatype class OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS (
  val api_channel1: B,
  val api_channel2: B) extends OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container

@sig trait OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container extends Container {
  def api_actuate: B
}

// container for outgoing ports
@datatype class OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P (
  val api_actuate: B) extends OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container

// container for outgoing ports and state variables
@datatype class OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS (
  val api_actuate: B) extends OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container