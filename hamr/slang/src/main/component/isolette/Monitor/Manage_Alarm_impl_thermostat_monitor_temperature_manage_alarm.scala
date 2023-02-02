// #Sireum #Logika

package isolette.Monitor

import org.sireum._
import isolette._
import org.sireum.justification.{Auto, Smt2}

// This file will not be overwritten so is safe to edit
object Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm {

  // BEGIN FUNCTIONS
  @strictpure def timeout_condition_satisfied(): Base_Types.Boolean = T
  // END FUNCTIONS
  // BEGIN STATE VARS
  var lastCmd: Isolette_Data_Model.On_Off.Type = Isolette_Data_Model.On_Off.byOrdinal(0).get
  // END STATE VARS

  def initialise(api: Manage_Alarm_impl_Initialization_Api): Unit = {
    Contract(
      Modifies(
        lastCmd,
        api
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee alarmcontrolIsInitiallyOff
        api.alarm_control == Isolette_Data_Model.On_Off.Off,
        // guarantee lastCmdInitiallySetToOff
        lastCmd == Isolette_Data_Model.On_Off.Off
        // END INITIALIZES ENSURES
      )
    )
    // example api usage
    lastCmd = Isolette_Data_Model.On_Off.Off
    //  REQ-MA-1: If the Monitor Mode is INIT, the Alarm Control shall be set
    //    to Off.
    api.put_alarm_control(Isolette_Data_Model.On_Off.Off)
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    //api.put_alarm_control(Isolette_Data_Model.On_Off.byOrdinal(0).get)
  }

  def timeTriggered(api: Manage_Alarm_impl_Operational_Api): Unit = {
    Contract(
      Requires(
        api.lower_alarm_temp.value < api.upper_alarm_temp.value,
        api.upper_alarm_temp.value - api.lower_alarm_temp.value > 15.0f,
        api.upper_alarm_temp.value > -512.0f & api.upper_alarm_temp.value < 512.0f,
        api.lower_alarm_temp.value > -512.0f & api.lower_alarm_temp.value < 512.0f,
      ),
      Modifies(
        lastCmd,
        api
      ),
      Ensures(
        // BEGIN COMPUTE_ENSURES timeTriggered
        // case REQMRM1
        //   REQ-MA-1
        (api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
          api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode) -->: (api.alarm_control == Isolette_Data_Model.On_Off.Off & lastCmd == Isolette_Data_Model.On_Off.Off),
        // case REQMRM2
        //   REQ-MA-2
        (api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
          api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
          (api.current_tempWstatus.value < api.lower_alarm_temp.value || api.current_tempWstatus.value > api.upper_alarm_temp.value)) -->:
          (api.alarm_control == Isolette_Data_Model.On_Off.Onn & lastCmd == Isolette_Data_Model.On_Off.Onn),
        // case REQMRM3
        //   REQ-MA-3
        (api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
          api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
          ((api.current_tempWstatus.value >= api.lower_alarm_temp.value
            && api.current_tempWstatus.value < api.lower_alarm_temp.value + 0.5f)
            || (api.current_tempWstatus.value > api.upper_alarm_temp.value - 0.5f
            && api.current_tempWstatus.value <= api.upper_alarm_temp.value))) -->:
          (api.alarm_control == In(lastCmd) &
          lastCmd == In(lastCmd)),
        // case REQMRM4
        //   REQ-MRM-4
        (api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
          api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
          api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f) -->:
          (api.alarm_control == Isolette_Data_Model.On_Off.Off & lastCmd == Isolette_Data_Model.On_Off.Off),
        // case REQMRM5
        //   REQ-MRM-5
        (api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
          api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode) -->:
          (api.alarm_control == Isolette_Data_Model.On_Off.Onn & lastCmd == Isolette_Data_Model.On_Off.Onn)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    // -------------- Get values of input ports ------------------

    val lower: Isolette_Data_Model.Temp_impl =
      api.get_lower_alarm_temp().get
    // remove code for old approach that lacked initializers
    // api.getlower_alarm_temp().getOrElseEager(LOW)
    Deduce(
      1 #> (lower.value == api.lower_alarm_temp.value) by Auto,
      2 #> (lower.value - 0.5f == api.lower_alarm_temp.value - 0.5f) by Auto
    )

    val upper: Isolette_Data_Model.Temp_impl =
      api.get_upper_alarm_temp().get
    // remove code for old approach that lacked initializers
    // api.getupper_alarm_temp().getOrElseEager(HIGH)

    Deduce(
      1 #> (upper.value == api.upper_alarm_temp.value) by Auto,
      2 #> (upper.value - 0.5f == api.upper_alarm_temp.value - 0.5f) by Auto
    )
    //assume(lower.value == 54.0f && upper.value == 75.0f)
    val monitor_mode: Isolette_Data_Model.Monitor_Mode.Type =
      api.get_monitor_mode().get
    // remove code for old approach that lacked initializers
    // api.getmonitor_mode().getOrElseEager(DEFAULT_MODE)

    Deduce(
      1 #> (api.monitor_mode == monitor_mode) by Auto
    )

    val currentTemp: Isolette_Data_Model.TempWstatus_impl =
      api.get_current_tempWstatus().get
    // remove code for old approach that lacked initializers
    // api.getcurrent_tempWstatus().getOrElseEager(DEFAULT_TEMP)

    //==============================================================================

    //assume(lower.value < upper.value && (upper.value - lower.value > 2.0f))
    //assume(lower.value > -200.0f && upper.value > -200.0f && lower.value < 200.0f && upper.value < 200.0f)

    // current command defaults to value of last command
    var currentCmd: Isolette_Data_Model.On_Off.Type = lastCmd

//    if (currentTemp.value == F32.NaN || upper.value == F32.NaN || lower.value == F32.NaN || currentTemp.value - 0.5f == F32.NaN || currentTemp.value + 0.5f == F32.NaN) {
//      //assert((currentTemp.value < lower.value || currentTemp.value > upper.value) ||
//        //((currentTemp.value >= lower.value && currentTemp.value < lower.value + 0.5f) || (currentTemp.value <= upper.value && currentTemp.value > upper.value - 0.5f)) ||
//        //(currentTemp.value >= lower.value + 0.5f || currentTemp.value <= upper.value - 0.5f))
//      Deduce(
//        1 #> (!(api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
//          api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
//          api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f)) by Auto
//      )
//      currentCmd = Isolette_Data_Model.On_Off.Onn
//    }
//    // address all cases of monitor_mode: Init, Normal, Failed
//    else if(monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)
//      {
//        Deduce(
//          1 #> (!(api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
//            api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
//            api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f)) by Auto
//        )
//        currentCmd = Isolette_Data_Model.On_Off.Off
//      }
//    else if(monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode)
//      {
//        Deduce(
//          1 #> (!(api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
//            api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
//            api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f)) by Auto
//        )
//        currentCmd = Isolette_Data_Model.On_Off.Onn
//      }
//    else if(monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode)
//      {
//        assert(monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode)
//        if(currentTemp.value < lower.value || currentTemp.value > upper.value)
//          {
//            Deduce(
//              1 #> (!(api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
//                api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
//                api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f)) by Auto
//            )
//            //TODO REQUIRED DEDUCTION FOR ASSERT 3
//            currentCmd = Isolette_Data_Model.On_Off.Onn
//          }
//        else if(currentTemp.value >= lower.value+0.5f && currentTemp.value <= upper.value-0.5f)
//            {
//              currentCmd = Isolette_Data_Model.On_Off.Off
//              Deduce(
//                1 #> ((api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
//                  api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
//                  api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f) -->:
//                  (currentCmd == Isolette_Data_Model.On_Off.Off)) by Auto
//              )
//            }
//        else{
//          Deduce(
//            1 #> (!(api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
//              api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
//              api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f)) by Auto
//          )
//          currentCmd = lastCmd
//        }
//      }
    if (!(currentTemp.value == F32.NaN || upper.value == F32.NaN || lower.value == F32.NaN || upper.value - 0.5f == F32.NaN || lower.value + 0.5f == F32.NaN)) {
      Deduce(
        1 #> (currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN) by Auto,
        2 #> ((currentTemp.value > upper.value || currentTemp.value < lower.value) |^
          (currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f) |^
          (((currentTemp.value >= lower.value
            && currentTemp.value < lower.value + 0.5f)
            || (currentTemp.value > upper.value - 0.5f
            && currentTemp.value <= upper.value)))) by Auto
      )
    }
    if(currentTemp.value == F32.NaN || upper.value == F32.NaN || lower.value == F32.NaN || upper.value - 0.5f == F32.NaN || lower.value + 0.5f == F32.NaN)
    {

      assert(!(currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
        monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
        currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f))
      currentCmd = Isolette_Data_Model.On_Off.Onn
    }
    else if (monitor_mode == Isolette_Data_Model.Monitor_Mode.Init_Monitor_Mode)
    {
      assert(!(currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
        monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
        currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f))
      currentCmd = Isolette_Data_Model.On_Off.Off
    }
    else if (monitor_mode == Isolette_Data_Model.Monitor_Mode.Failed_Monitor_Mode)
    {
      assert(!(currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
        monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
        currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f))
      currentCmd = Isolette_Data_Model.On_Off.Onn
    }
    else if (monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode && (currentTemp.value > upper.value || currentTemp.value < lower.value))
    {
      //assert(currentTemp.value >= lower.value + 0.5f)
      assert(!(currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
        monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
        currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f))
      currentCmd = Isolette_Data_Model.On_Off.Onn
    }
    else if (monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode && (currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f))
    {
      assert((currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
        monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
        currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f))
      currentCmd = Isolette_Data_Model.On_Off.Off
      Deduce(
        1 #> ((api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
          api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
          api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f) -->:
          (currentCmd == Isolette_Data_Model.On_Off.Off)) by Auto
      )
      assert((currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
        monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
        currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f) -->: (currentCmd == Isolette_Data_Model.On_Off.Off))
    }
    else if (monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode && ((currentTemp.value >= lower.value
      && currentTemp.value < lower.value + 0.5f)
      || (currentTemp.value > upper.value - 0.5f
      && currentTemp.value <= upper.value)))
    {
      assert(!(currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
        monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
        currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f))
      currentCmd = lastCmd
    }
    else {
      assert(!(currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
        monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
        currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f))
    }
    //ASSERT 3
    Deduce(1#>(api.current_tempWstatus == currentTemp && api.current_tempWstatus.value == currentTemp.value) by Auto)
    Deduce(1#>(api.upper_alarm_temp == upper && api.upper_alarm_temp.value == upper.value) by Auto)
    Deduce(1#>(api.lower_alarm_temp == lower && api.lower_alarm_temp.value == lower.value) by Auto)
//    assert((currentTemp.value != F32.NaN && upper.value != F32.NaN && lower.value != F32.NaN && currentTemp.value - 0.5f != F32.NaN && currentTemp.value + 0.5f != F32.NaN &&
//      monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
//      currentTemp.value >= lower.value + 0.5f && currentTemp.value <= upper.value - 0.5f) -->: (currentCmd == Isolette_Data_Model.On_Off.Off))
//    Deduce(
//      1 #> ((api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
//        api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &&
//        api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f) -->:
//        (currentCmd == Isolette_Data_Model.On_Off.Off)) by Auto
//    )
    lastCmd = currentCmd
    api.put_alarm_control(currentCmd)
    Deduce(
      2 #> (currentCmd == api.alarm_control) by Auto,
      3 #> (lastCmd == currentCmd) by Auto,
      4 #> ((currentCmd == Isolette_Data_Model.On_Off.Off) -->: (api.alarm_control == Isolette_Data_Model.On_Off.Off && lastCmd == Isolette_Data_Model.On_Off.Off)) by Auto,
//      1 #> ((api.current_tempWstatus.value != F32.NaN && api.upper_alarm_temp.value != F32.NaN && api.lower_alarm_temp.value != F32.NaN && api.current_tempWstatus.value - 0.5f != F32.NaN && api.current_tempWstatus.value + 0.5f != F32.NaN &&
//        api.monitor_mode == Isolette_Data_Model.Monitor_Mode.Normal_Monitor_Mode &
//        api.current_tempWstatus.value >= api.lower_alarm_temp.value + 0.5f && api.current_tempWstatus.value <= api.upper_alarm_temp.value - 0.5f) -->:
//        (currentCmd == Isolette_Data_Model.On_Off.Off)) by Smt2("z3", 500000, 1000000000),
      5 #> ((currentTemp.value > upper.value | currentTemp.value < lower.value)
        |^ ((currentTemp.value <= upper.value & currentTemp.value > upper.value - 0.5f) | (currentTemp.value >= lower.value & currentTemp.value < lower.value + 0.5f))
        |^ (currentTemp.value >= lower.value + 0.5f & currentTemp.value <= upper.value - 0.5f))
        by Smt2("cvc5", 5000, 10000000)
    )
//    val apiUsage_current_tempWstatus: Option[Isolette_Data_Model.TempWstatus_impl] = api.get_current_tempWstatus()
//    api.logInfo(s"Received on current_tempWstatus: ${apiUsage_current_tempWstatus}")
//    val apiUsage_lower_alarm_temp: Option[Isolette_Data_Model.Temp_impl] = api.get_lower_alarm_temp()
//    api.logInfo(s"Received on lower_alarm_temp: ${apiUsage_lower_alarm_temp}")
//    val apiUsage_upper_alarm_temp: Option[Isolette_Data_Model.Temp_impl] = api.get_upper_alarm_temp()
//    api.logInfo(s"Received on upper_alarm_temp: ${apiUsage_upper_alarm_temp}")
//    val apiUsage_monitor_mode: Option[isolette.Isolette_Data_Model.Monitor_Mode.Type] = api.get_monitor_mode()
//    api.logInfo(s"Received on monitor_mode: ${apiUsage_monitor_mode}")
  }

  def activate(api: Manage_Alarm_impl_Operational_Api): Unit = { }

  def deactivate(api: Manage_Alarm_impl_Operational_Api): Unit = { }

  def finalise(api: Manage_Alarm_impl_Operational_Api): Unit = { }

  def recover(api: Manage_Alarm_impl_Operational_Api): Unit = { }
}
