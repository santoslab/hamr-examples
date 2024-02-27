// This file contains manually written unit tests for each of the component requirements for the
// Manage Heat Source component.   The "manually written" tests can be contrasted with the automated
// property-based randomized GUMBOX units tests in
// ToDo:  Record the name of the file for GUMBOX component tests
//
// These tests exercise both the Initialize and Compute entry point application code.
// Test inputs conform to the ranges for types/variables stated in the requirements document
//  (see Isolette.InitialValues for range documentation)

package isolette.Regulate

import org.sireum._
import isolette._
import isolette.Isolette_Data_Model._

// This file will not be overwritten so is safe to edit
class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Test extends Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_ScalaTest {

//---------------------------------------
//  H e l p e r     F u n c t i o n s
//---------------------------------------

  // helper function to check for expected concrete value for heat control
  def check_expected_heat_control(heat_control_expected: On_Off.Type): Unit = {
    // pass a lambda to grab output and check for desired output
    check_concrete_output(c => c == heat_control_expected)
  }

  // helper function to check for expected concrete value for lastCmd thread local variable
  def check_expected_lastCmd(lastCmd_expected: On_Off.Type): Unit = {
    val lastCmd_actual = Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd
    assert(lastCmd_actual == lastCmd_expected)
  }

//==================================================================================
//----------------------------------------------------------------------------------
//  I n i t i a l i z e     E n t r y    P o i n t
//----------------------------------------------------------------------------------
//==================================================================================

// It is the responsibility of the Initialize entry point to provide initial values
// for output data ports and thread local variables.  The initial value of the
// output port (only heat_control for this component) is related to
//
//  REQ-MHS-1: If the Regulator Mode is INIT,
//    the Heat Control shall be set to Off
//
//  based on this it also seems appropropriate to constrain the lastCmd
//  thread local variable to be Off

test("Req-MHS-1: Init mode (Initialize Entry Point)") {
  // inputs
  //   Note: According to the AADL standard, the Initialize entry point should not read
  //   any values from its input ports.  In HAMR, no APIs are available to the
  //   application developer to read from the input ports.  Therefore, there are
  //   no input values set in the test.
  //
  // execute initialize entry point
  testInitialise()

  // --------- outputs ----------
  //  - heat control output port = Off
  check_expected_heat_control(On_Off.Off)
  //  - thread local variable lastCmd is Off
  check_expected_lastCmd(On_Off.Off)
}

//==================================================================================
//----------------------------------------------------------------------------------
//  C o m p u t e    E n t r y    P o i n t
//----------------------------------------------------------------------------------
//==================================================================================

//========================================================================
//  REQ-MHS-1: If the Regulator Mode is INIT,
//    the Heat Control shall be set to Off.
//========================================================================


  test("Req-MHS-1: Init mode") {
    // ---- REQ-MHS-1   - T e s t    D e s i g n -----------------
    /*
       Inputs:
         current_tempWstatus  *don't care* (validity: don't care)
         lower_desired_temp: *don't care*
         upper_desired_temp: *don't care*
         regulator_mode: INIT

       Expected Outputs:
         heat_control: OFF
    */
    // --------- inputs ----------
    //  Illustrate *put_concrete_inputs* method that sets input ports with a
    //   single method (a test below illustrates alternate per-port APIs)
    //  Note: to avoid accidental swapping of input values (getting intended values in
    //  wrong ports), use Scala's named argument style
    //    https://docs.scala-lang.org/tour/named-arguments.html
    put_concrete_inputs(
      // these values are independent of requirement ("don't care" values)
      current_tempWstatus = TempWstatus_impl(InitialValues.DEFAULT_CURRENT_TEMPERATURE,
                                             ValueStatus.Invalid),
      lower_desired_temp = Temp_impl(InitialValues.DEFAULT_LOWER_DESIRED_TEMPERATURE),
      upper_desired_temp = Temp_impl(InitialValues.DEFAULT_UPPER_DESIRED_TEMPERATURE),
      // relevant to requirement
      regulator_mode = Regulator_Mode.Init_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)
  }

  // Illustrate alternate APIs for setting inputs and retreiving outputs and asserting
  //  expected results
  test("Req-MHS-1: Init mode (alternate APIs)") {
    /*
       Inputs:
         current_tempWstatus  *don't care* (validity: don't care)
         lower_desired_temp: *don't care*
         upper_desired_temp: *don't care*
         regulator_mode: INIT

       Expected Outputs:
         heat_control: OFF
    */
    // --------- inputs ----------
    //  Illustrate per-input-port APIs
    put_current_tempWstatus(TempWstatus_impl(InitialValues.DEFAULT_CURRENT_TEMPERATURE,
                                             ValueStatus.Invalid))
    put_lower_desired_temp(Temp_impl(InitialValues.DEFAULT_LOWER_DESIRED_TEMPERATURE))
    put_upper_desired_temp(Temp_impl(InitialValues.DEFAULT_UPPER_DESIRED_TEMPERATURE))
    put_regulator_mode(Regulator_Mode.Init_Regulator_Mode)

    // execute compute entry point
    testCompute()

    // Note: Illustrate alternate approach of directly retreiving output port values,
    //  and comparing to expected results

    // ----------- get thread output values -----------
    // get the value of the heat_control output data
    //   (option type - NONE means that no event was sent out the port)
    val heat_control_actualOpt = get_heat_control()
    val heat_control_actual = heat_control_actualOpt.get // Some(..) option value is expected

    // ----------- compare expected and actual output values ------------
    val heat_control_expected = On_Off.Off
    // Note: ScalaTest expects the following format
    //        <actual value> == <expected value>
    assert(heat_control_actual == heat_control_expected)
    // Alternatively, you can use the following ScalaTest feature
    //   (https://www.baeldung.com/scala/scalatest-assertions)
    assertResult(heat_control_expected) {heat_control_actual}
  }

  //========================================================================
  //  REQ-MHS-2: If the Regulator Mode is NORMAL and the
  //  Current Temperature is less than the Lower Desired Temperature,
  //  the Heat Control shall be set to On.
  //========================================================================

  test("Req-MHS-2: Normal mode; current LT lower desired") {
    /*
       Inputs:
         current_tempWstatus  95f  (validity: don't care (use Valid))
         lower_desired_temp: 98f
         upper_desired_temp: *don't care* (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: On
    */
    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(95f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f), // irrelevant to requirement
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Onn)
  }

  //========================================================================
  // REQ-MHS-3: If the Regulator Mode is NORMAL and the Current Temperature is
  // greater than the Upper Desired Temperature
  // the Heat Control shall be set to Off
  //========================================================================

  test("Req-MHS-3: Normal mode; current GT upper desired") {
    /*
       Inputs:
         current_tempWstatus  101f  (validity: don't care (use Valid))
         lower_desired_temp: *don't care* (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: On
    */
    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(101f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f), // irrelevant to requirement
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)
  }

  //========================================================================
  // REQ-MHS-4:
  //   If the Regulator Mode is NORMAL and the Current Temperature is
  //   greater than or equal to the Lower Desired Temperature and less than or
  //   equal to the Upper Desired Temperature,
  //   the value of the Heat Control shall not be changed.
  //========================================================================

  // Test design notes:
  // the "shall not be changed" requires reasoning about the internal
  // state of the component (saved heat control value) or about the value
  // of the heat control output on the previous activation.  To test the requirement above,
  // we create a sequence of activations and assertions that capture the requirement
  // in terms of values on previous activations.  An alternative approach is to
  // modify the internal state of the component directly -- that approach is
  // illustrated in the Req-MHS-4-alt tests.

  test("Req-MHS-4: Normal, Medium Temp") {

    // Activation (prep for 1): Cause heat control to be On

    /*
          Inputs:
            current_tempWstatus  95f  (validity: don't care (use Valid))
            lower_desired_temp: (use 98f)
            upper_desired_temp: (use 100f)
            regulator_mode: Normal

          Expected Outputs:
            heat_control: On
       */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(95f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode)

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Onn)

    // Activation 1-a: Current temp lies within set points (closed interval)
    //   in this case current temp is equal to lower bound,
    //   so heat control should still be on
    /*
       Inputs:
         current_tempWstatus  98f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: On
    */
    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(98f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Onn)

    // Activation 1-b: Current temp lies within set points (closed interval)
    //   in this case current temp is between lower bound and upper bound,
    //   so heat control should still be on
    /*
       Inputs:
         current_tempWstatus  99f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: On
   */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(99f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Onn)

    // Activation 1-c: Current temp lies within set points (closed interval)
    //   in this case current temp is equal to upper bound,
    //   so heat control should still be on

    /*
       Inputs:
         current_tempWstatus  100f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: On
   */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(100f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Onn)

    // Activation (prep for 2):   Cause the heat control to be off
    //   Current temp lies within set points (closed interval)
    //   in this case current temp is greater than upper bound,
    //   so heat control should be off
    /*
       Inputs:
         current_tempWstatus  101f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: Off
    */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(101f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)

    // Activation 2-a:
    //   Current temp lies within set points (closed interval)
    //   in this case current temp is equal to upper bound,
    //   so heat control should still be off

    /*
       Inputs:
         current_tempWstatus  100f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: Off
    */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(100f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)

    // Activation 2-b:
    //   Current temp lies within set points (closed interval)
    //   in this case current temp is between lower and upper bound,
    //   so heat control should still be off

    /*
       Inputs:
         current_tempWstatus  99f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: Off
    */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(99f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)

    // Activation 2-c:
    //   Current temp lies within set points (closed interval)
    //   in this case current temp is equal to lower bound,
    //   so heat control should still be off
    /*
       Inputs:
         current_tempWstatus  98f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       Expected Outputs:
         heat_control: Off
    */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(98f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)
  }



  test("Req-MHS-4 (alt 1-a): Normal, Medium Temp (heat control on, current temp eq lower desired temp)") {
    // Activation 1-a: Current temp lies within set points (closed interval)
    //   in this case current temp is equal to lower bound,
    //   so heat control should still be on
    /*
       Inputs:
         current_tempWstatus  98f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       ** force previous heat_control lastCmd to ON **

       Expected Outputs:
         heat_control: On
    */
    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(98f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    //  set component internal state to Onn
    Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd = On_Off.Onn


    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Onn)
  }

  test("Req-MHS-4 (alt 1-b): Normal, Medium Temp (heat control on, current temp between lower/upper desired temp)") {
    // Activation 1-b: Current temp lies within set points (closed interval)
    //   in this case current temp is between lower bound and upper bound,
    //   so heat control should still be on
    /*
       Inputs:
         current_tempWstatus  99f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       ** force previous heat_control lastCmd to ON **

       Expected Outputs:
         heat_control: On
   */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(99f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    //  set component internal state to Onn
    Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd = On_Off.Onn

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Onn)
  }

  test("Req-MHS-4 (alt 1-c): Normal, Medium Temp (heat control on, current temp eq upper desired temp)") {
    // Activation 1-c: Current temp lies within set points (closed interval)
    //   in this case current temp is equal to upper bound,
    //   so heat control should still be on

    /*
       Inputs:
         current_tempWstatus  100f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       ** force previous heat_control lastCmd to ON **

       Expected Outputs:
         heat_control: On
   */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(100f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    //  set component internal state to Onn
    Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd = On_Off.Onn

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Onn)
  }

  test("Req-MHS-4 (alt 2-a): Normal, Medium Temp (heat control off, current temp eq upper desired temp)") {
    // Activation 2-a:
    //   Current temp lies within set points (closed interval)
    //   in this case current temp is equal to upper bound,
    //   so heat control should still be off

    /*
       Inputs:
         current_tempWstatus  100f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

       ** force previous heat_control lastCmd to OFF **

       Expected Outputs:
         heat_control: Off
    */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(100f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    //  set component internal state to Off
    Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd = On_Off.Off

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)
  }

  test("Req-MHS-4 (alt 2-b): Normal, Medium Temp (heat control off, current temp between lower/upper desired temp)") {
    // Activation 2-b:
    //   Current temp lies within set points (closed interval)
    //   in this case current temp is between lower and upper bound,
    //   so heat control should still be off

    /*
       Inputs:
         current_tempWstatus  99f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

     ** force previous heat_control lastCmd to OFF **

       Expected Outputs:
         heat_control: Off
    */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(99f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    //  set component internal state to Off
    Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.lastCmd = On_Off.Off

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)
  }

  test("Req-MHS-4 (alt 2-c): Normal, Medium Temp (heat control off, current temp eq lower desired temp)") {
    // Activation 2-c:
    //   Current temp lies within set points (closed interval)
    //   in this case current temp is equal to lower bound,
    //   so heat control should still be off
    /*
       Inputs:
         current_tempWstatus  98f  (validity: don't care (use Valid))
         lower_desired_temp: (use 98f)
         upper_desired_temp: (use 100f)
         regulator_mode: Normal

      ** force previous heat_control lastCmd to OFF **

       Expected Outputs:
         heat_control: Off
    */

    // --------- inputs ----------
    put_concrete_inputs(
      current_tempWstatus = TempWstatus_impl(98f, ValueStatus.Valid),
      lower_desired_temp = Temp_impl(98f),
      upper_desired_temp = Temp_impl(100f),
      regulator_mode = Regulator_Mode.Normal_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)
  }



  //========================================================================
  //  REQ-MHS-5: If the Regulator Mode is FAILED,
  //  the Heat Control shall be set to Off.
  //========================================================================

  test("Req-MHS-5: Failed mode") {
    /*
       Inputs:
         current_tempWstatus  *don't care* (validity: don't care)
         lower_desired_temp: *don't care*
         upper_desired_temp: *don't care*
         regulator_mode: FAILED

       Expected Outputs:
         heat_control: OFF
    */
    // --------- inputs ----------
    put_concrete_inputs(
      // these values are independent of requirement ("don't care" values)
      current_tempWstatus = TempWstatus_impl(InitialValues.DEFAULT_CURRENT_TEMPERATURE,
        ValueStatus.Invalid),
      lower_desired_temp = Temp_impl(InitialValues.DEFAULT_LOWER_DESIRED_TEMPERATURE),
      upper_desired_temp = Temp_impl(InitialValues.DEFAULT_UPPER_DESIRED_TEMPERATURE),
      // relevant to requirement
      regulator_mode = Regulator_Mode.Failed_Regulator_Mode
    )

    // execute compute entry point
    testCompute()

    // --------- outputs ----------
    check_expected_heat_control(On_Off.Off)
  }

}
