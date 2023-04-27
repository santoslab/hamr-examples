// #Sireum #Logika

package isolette.Regulate

import org.sireum._
import isolette._

// This file will not be overwritten so is safe to edit
object Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode {

  // BEGIN FUNCTIONS
  @strictpure def ROUND(num: Base_Types.Float_32): Base_Types.Float_32 = num
  // END FUNCTIONS
  // BEGIN STATE VARS
  var lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type = Isolette_Data_Model.Regulator_Mode.byOrdinal(0).get
  // END STATE VARS

  def initialise(api: Manage_Regulator_Mode_impl_Initialization_Api): Unit = {
    Contract(
    Modifies(
      api,
      lastRegulatorMode
    ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee REQ_MRM_1
        //   The initial mode of the regular is INIT
        api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode
        // END INITIALIZES ENSURES
      )
    )
    // example api usage
    lastRegulatorMode = Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode
    api.put_regulator_mode(lastRegulatorMode)

    api.logInfo(s"Sent on regulator_mode: $lastRegulatorMode")
  }

  def timeTriggered(api: Manage_Regulator_Mode_impl_Operational_Api): Unit = {
    Contract(
      Modifies(lastRegulatorMode, api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQ_MRM_2
        //   'transition from Init to Normal'
        //   If the current regulator mode is Init, then
        //   the regulator mode is set to NORMAL iff the regulator status is valid (see Table A-10), i.e.,
        //     if NOT (Regulator Interface Failure OR Regulator Internal Failure)
        //        AND Current Temperature.Status = Valid
        (In(lastRegulatorMode) == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode) -->: ((!(api.interface_failure.value || api.internal_failure.value) &&
           api.current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->:
          (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &&
            lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode)),
        // case REQ_MRM_Maintain_Normal
        //   'maintaining NORMAL, NORMAL to NORMAL'
        //   If the current regulator mode is Normal, then
        //   the regulator mode is stays normal iff
        //   the regulaor status is not false i.e.,
        //          if NOT(
        //              (Regulator Interface Failure OR Regulator Internal Failure)
        //              OR NOT(Current Temperature.Status = Valid)
        //          )
        (In(lastRegulatorMode) == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode) -->: ((!(api.interface_failure.value || api.internal_failure.value) &&
           api.current_tempWstatus.status == Isolette_Data_Model.ValueStatus.Valid) -->:
          (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode &&
            lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode)),
        // case REQ_MRM_3
        //   'transition for NORMAL to FAILED'
        //   If the current regulator mode is Normal, then
        //   the regulator mode is set to Failed iff
        //   the regulator status is false, i.e.,
        //      if  (Regulator Interface Failure OR Regulator Internal Failure)
        //          OR NOT(Current Temperature.Status = Valid)
        (In(lastRegulatorMode) == Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode) -->: (((api.interface_failure.value || api.internal_failure.value) &&
           api.current_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) -->:
          (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode &&
            lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode)),
        // case REQ_MRM_4
        //   'transition from INIT to FAILED'
        //   If the current regulator mode is Init, then
        //   the regulator mode and lastRegulatorMode state value is set to Failed iff
        //   the regulator status is false, i.e.,
        //          if  (Regulator Interface Failure OR Regulator Internal Failure)
        //          OR NOT(Current Temperature.Status = Valid)
        (In(lastRegulatorMode) == Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode) -->: (((api.interface_failure.value || api.internal_failure.value) &&
           api.current_tempWstatus.status != Isolette_Data_Model.ValueStatus.Valid) -->:
          (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode &&
            lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode)),
        // case REQ_MRM_MaintainFailed
        //   'maintaining FAIL, FAIL to FAIL'
        //   If the current regulator mode is Failed, then
        //   the regulator mode remains in the Failed state and the LastRegulator mode remains Failed.REQ-MRM-Maintain-Failed
        (In(lastRegulatorMode) == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode) -->: (api.regulator_mode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode &&
          lastRegulatorMode == Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode)
        // END COMPUTE ENSURES timeTriggered
      )
    )

    // -------------- Get values of input ports ------------------

    val current_tempWstatus: Isolette_Data_Model.TempWstatus_impl =
      api.get_current_tempWstatus().get

    val current_temperature_status: Isolette_Data_Model.ValueStatus.Type = current_tempWstatus.status

    val interface_failure: Isolette_Data_Model.Failure_Flag_impl =
      api.get_interface_failure().get

    val internal_failure: Isolette_Data_Model.Failure_Flag_impl =
       api.get_interface_failure().get

    //==============================================================================


    // determine regulator status as specified in FAA REMH Table A-10
    //  regulator_status = NOT (Monitor Interface Failure OR Monitor Internal Failure)
    //                          AND Current Temperature.Status = Valid
    val regulator_status: B =
    (!(interface_failure.value || internal_failure.value)
      && (current_temperature_status == Isolette_Data_Model.ValueStatus.Valid))

    lastRegulatorMode match {

      // Transitions from INIT Mode
      case Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode =>

        // REQ-MRM-2: If the current regulator mode is Init, then
        //   the regulator mode is set to NORMAL iff the regulator status is true, i.e.,
        //     if  NOT (Monitor Interface Failure OR Monitor Internal Failure)
        //         AND Current Temperature.Status = Valid
        if (regulator_status) {
          lastRegulatorMode = Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode
        }

        // REQ-MRM-3: If the current regulator mode is Init, then
        //     the regulator mode is set to Failed iff the time during
        //     which the thread has been in Init mode exceeds the
        //     Regulator Init Timeout value.
        if (!regulator_status) { //&& timeout_condition_satisfied() //TODO TIMEOUT CONDITION TO BE CONSIDERED IN FAILED REGULATOR MODE SETTING UNDER INIT
          lastRegulatorMode = Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode
        }

      // otherwise we stay in Init mode

      // Transitions from NORMAL Mode
      case Isolette_Data_Model.Regulator_Mode.Normal_Regulator_Mode =>

        // REQ-MRM-4: If the current regulator mode is Normal, then
        //     the regulator mode is set to Failed iff
        //     the regulator status is false, i.e.,
        //       if  (Monitor Interface Failure OR Monitor Internal Failure)
        //           OR NOT(Current Temperature.Status = Valid)

        if (!regulator_status) {
          lastRegulatorMode = Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode
        }

      // Transitions from FAILED Mode (do nothing -- system must be rebooted)
      case Isolette_Data_Model.Regulator_Mode.Failed_Regulator_Mode => //UNUSED CASE CONFIRMED BY LOGIKA, GOOD OUTCOME
      // do nothing
    }

    api.put_regulator_mode(lastRegulatorMode)

    api.logInfo(s"Sent on regulator_mode: $lastRegulatorMode")
  }

  def activate(api: Manage_Regulator_Mode_impl_Operational_Api): Unit = { }

  def deactivate(api: Manage_Regulator_Mode_impl_Operational_Api): Unit = { }

  def finalise(api: Manage_Regulator_Mode_impl_Operational_Api): Unit = { }

  def recover(api: Manage_Regulator_Mode_impl_Operational_Api): Unit = { }
}
