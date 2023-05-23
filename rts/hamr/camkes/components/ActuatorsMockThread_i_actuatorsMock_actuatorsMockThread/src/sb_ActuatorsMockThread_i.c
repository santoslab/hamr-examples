// This file will be regenerated, do not edit

#include <sb_ActuatorsMockThread_i.h>
#include <ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_adapter.h>
#include <string.h>
#include <camkes.h>

seqNum_t sb_saturationActuate_seqNum;

seqNum_t sb_tempPressureActuate_seqNum;

/*****************************************************************
 * sb_tempPressureActuate_is_empty:
 *
 * Helper method to determine if the data infrastructure port has
 * received data
 *
 ****************************************************************/
bool sb_tempPressureActuate_is_empty() {
  return is_empty_sp_union_art_DataContent(sb_tempPressureActuate);
}

bool sb_tempPressureActuate_read(union_art_DataContent * value) {
  seqNum_t new_seqNum;
  if ( read_sp_union_art_DataContent(sb_tempPressureActuate, value, &new_seqNum) ) {
    sb_tempPressureActuate_seqNum = new_seqNum;
    return true;
  } else {
    return false;
  }
}

/*****************************************************************
 * sb_saturationActuate_is_empty:
 *
 * Helper method to determine if the data infrastructure port has
 * received data
 *
 ****************************************************************/
bool sb_saturationActuate_is_empty() {
  return is_empty_sp_union_art_DataContent(sb_saturationActuate);
}

bool sb_saturationActuate_read(union_art_DataContent * value) {
  seqNum_t new_seqNum;
  if ( read_sp_union_art_DataContent(sb_saturationActuate, value, &new_seqNum) ) {
    sb_saturationActuate_seqNum = new_seqNum;
    return true;
  } else {
    return false;
  }
}

// is_empty tempPressureActuate: In DataPort
B RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_seL4Nix_tempPressureActuate_IsEmpty(STACK_FRAME_ONLY) {
  return sb_tempPressureActuate_is_empty();
}

// receive tempPressureActuate: In DataPort union_art_DataContent
Unit RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_seL4Nix_tempPressureActuate_Receive(
  STACK_FRAME
  Option_8E9F45 result) {
  DeclNewStackFrame(caller, "sb_ActuatorsMockThread_i.c", "", "RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_seL4Nix_tempPressureActuate_Receive", 0);

  union_art_DataContent val;
  if(sb_tempPressureActuate_read((union_art_DataContent *) &val)) {
    // wrap payload in Some and place in result
    DeclNewSome_D29615(some);
    Some_D29615_apply(SF &some, (art_DataContent) &val);
    Type_assign(result, &some, sizeof(union Option_8E9F45));
  } else {
    // put None in result
    DeclNewNone_964667(none);
    Type_assign(result, &none, sizeof(union Option_8E9F45));
  }
}


// is_empty saturationActuate: In DataPort
B RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_seL4Nix_saturationActuate_IsEmpty(STACK_FRAME_ONLY) {
  return sb_saturationActuate_is_empty();
}

// receive saturationActuate: In DataPort union_art_DataContent
Unit RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_seL4Nix_saturationActuate_Receive(
  STACK_FRAME
  Option_8E9F45 result) {
  DeclNewStackFrame(caller, "sb_ActuatorsMockThread_i.c", "", "RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_seL4Nix_saturationActuate_Receive", 0);

  union_art_DataContent val;
  if(sb_saturationActuate_read((union_art_DataContent *) &val)) {
    // wrap payload in Some and place in result
    DeclNewSome_D29615(some);
    Some_D29615_apply(SF &some, (art_DataContent) &val);
    Type_assign(result, &some, sizeof(union Option_8E9F45));
  } else {
    // put None in result
    DeclNewNone_964667(none);
    Type_assign(result, &none, sizeof(union Option_8E9F45));
  }
}


void pre_init(void) {
  DeclNewStackFrame(NULL, "sb_ActuatorsMockThread_i.c", "", "pre_init", 0);

  printf("Entering pre-init of ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread\n");

  // initialise slang-embedded components/ports
  RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_adapter_initialiseArchitecture(SF_LAST);

  // call the component's initialise entrypoint
  RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_adapter_initialiseEntryPoint(SF_LAST);

  printf("Leaving pre-init of ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread\n");
}

/************************************************************************
 * int run(void)
 * Main active thread function.
 ************************************************************************/
int run(void) {
  DeclNewStackFrame(NULL, "sb_ActuatorsMockThread_i.c", "", "run", 0);

  sb_self_pacer_tick_emit();
  for(;;) {
    sb_self_pacer_tock_wait();
    // call the component's compute entrypoint
    RTS_Actuators_ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_adapter_computeEntryPoint(SF_LAST);
    sb_self_pacer_tick_emit();
  }
  return 0;
}
