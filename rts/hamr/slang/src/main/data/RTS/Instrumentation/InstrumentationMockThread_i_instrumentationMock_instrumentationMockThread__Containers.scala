// #Sireum

package RTS.Instrumentation

import org.sireum._
import RTS._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@sig trait InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container extends art.DataContent {
}

// container for incoming ports
@datatype class InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P (
  ) extends InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container

// container for incoming ports and state variables
@datatype class InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS (
  ) extends InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container

@sig trait InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container extends art.DataContent {
  def api_unit1_pressureLogic_channel1: B
  def api_unit1_pressureLogic_channel2: B
  def api_unit1_pressureLogic_channel3: B
  def api_unit1_pressureLogic_channel4: B
  def api_unit1_saturationLogic_channel1: B
  def api_unit1_saturationLogic_channel2: B
  def api_unit1_saturationLogic_channel3: B
  def api_unit1_saturationLogic_channel4: B
  def api_unit1_temperatureLogic_channel1: B
  def api_unit1_temperatureLogic_channel2: B
  def api_unit1_temperatureLogic_channel3: B
  def api_unit1_temperatureLogic_channel4: B
  def api_unit2_pressureLogic_channel1: B
  def api_unit2_pressureLogic_channel2: B
  def api_unit2_pressureLogic_channel3: B
  def api_unit2_pressureLogic_channel4: B
  def api_unit2_saturationLogic_channel1: B
  def api_unit2_saturationLogic_channel2: B
  def api_unit2_saturationLogic_channel3: B
  def api_unit2_saturationLogic_channel4: B
  def api_unit2_temperatureLogic_channel1: B
  def api_unit2_temperatureLogic_channel2: B
  def api_unit2_temperatureLogic_channel3: B
  def api_unit2_temperatureLogic_channel4: B
}

// container for outgoing ports
@datatype class InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P (
  val api_unit1_pressureLogic_channel1: B,
  val api_unit1_pressureLogic_channel2: B,
  val api_unit1_pressureLogic_channel3: B,
  val api_unit1_pressureLogic_channel4: B,
  val api_unit1_saturationLogic_channel1: B,
  val api_unit1_saturationLogic_channel2: B,
  val api_unit1_saturationLogic_channel3: B,
  val api_unit1_saturationLogic_channel4: B,
  val api_unit1_temperatureLogic_channel1: B,
  val api_unit1_temperatureLogic_channel2: B,
  val api_unit1_temperatureLogic_channel3: B,
  val api_unit1_temperatureLogic_channel4: B,
  val api_unit2_pressureLogic_channel1: B,
  val api_unit2_pressureLogic_channel2: B,
  val api_unit2_pressureLogic_channel3: B,
  val api_unit2_pressureLogic_channel4: B,
  val api_unit2_saturationLogic_channel1: B,
  val api_unit2_saturationLogic_channel2: B,
  val api_unit2_saturationLogic_channel3: B,
  val api_unit2_saturationLogic_channel4: B,
  val api_unit2_temperatureLogic_channel1: B,
  val api_unit2_temperatureLogic_channel2: B,
  val api_unit2_temperatureLogic_channel3: B,
  val api_unit2_temperatureLogic_channel4: B) extends InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container

// container for outgoing ports and state variables
@datatype class InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS (
  val api_unit1_pressureLogic_channel1: B,
  val api_unit1_pressureLogic_channel2: B,
  val api_unit1_pressureLogic_channel3: B,
  val api_unit1_pressureLogic_channel4: B,
  val api_unit1_saturationLogic_channel1: B,
  val api_unit1_saturationLogic_channel2: B,
  val api_unit1_saturationLogic_channel3: B,
  val api_unit1_saturationLogic_channel4: B,
  val api_unit1_temperatureLogic_channel1: B,
  val api_unit1_temperatureLogic_channel2: B,
  val api_unit1_temperatureLogic_channel3: B,
  val api_unit1_temperatureLogic_channel4: B,
  val api_unit2_pressureLogic_channel1: B,
  val api_unit2_pressureLogic_channel2: B,
  val api_unit2_pressureLogic_channel3: B,
  val api_unit2_pressureLogic_channel4: B,
  val api_unit2_saturationLogic_channel1: B,
  val api_unit2_saturationLogic_channel2: B,
  val api_unit2_saturationLogic_channel3: B,
  val api_unit2_saturationLogic_channel4: B,
  val api_unit2_temperatureLogic_channel1: B,
  val api_unit2_temperatureLogic_channel2: B,
  val api_unit2_temperatureLogic_channel3: B,
  val api_unit2_temperatureLogic_channel4: B) extends InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container
