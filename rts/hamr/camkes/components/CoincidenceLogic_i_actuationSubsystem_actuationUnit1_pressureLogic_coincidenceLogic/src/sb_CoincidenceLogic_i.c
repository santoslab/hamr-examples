// This file will be regenerated, do not edit

#include <sb_CoincidenceLogic_i.h>
#include <CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_adapter.h>
#include <string.h>
#include <camkes.h>

seqNum_t sb_actuate_seqNum;

seqNum_t sb_channel4_seqNum;

seqNum_t sb_channel3_seqNum;

seqNum_t sb_channel2_seqNum;

seqNum_t sb_channel1_seqNum;

/*****************************************************************
 * sb_channel1_is_empty:
 *
 * Helper method to determine if the data infrastructure port has
 * received data
 *
 ****************************************************************/
bool sb_channel1_is_empty() {
  return is_empty_sp_union_art_DataContent(sb_channel1);
}

bool sb_channel1_read(union_art_DataContent * value) {
  seqNum_t new_seqNum;
  if ( read_sp_union_art_DataContent(sb_channel1, value, &new_seqNum) ) {
    sb_channel1_seqNum = new_seqNum;
    return true;
  } else {
    return false;
  }
}

/*****************************************************************
 * sb_channel2_is_empty:
 *
 * Helper method to determine if the data infrastructure port has
 * received data
 *
 ****************************************************************/
bool sb_channel2_is_empty() {
  return is_empty_sp_union_art_DataContent(sb_channel2);
}

bool sb_channel2_read(union_art_DataContent * value) {
  seqNum_t new_seqNum;
  if ( read_sp_union_art_DataContent(sb_channel2, value, &new_seqNum) ) {
    sb_channel2_seqNum = new_seqNum;
    return true;
  } else {
    return false;
  }
}

/*****************************************************************
 * sb_channel3_is_empty:
 *
 * Helper method to determine if the data infrastructure port has
 * received data
 *
 ****************************************************************/
bool sb_channel3_is_empty() {
  return is_empty_sp_union_art_DataContent(sb_channel3);
}

bool sb_channel3_read(union_art_DataContent * value) {
  seqNum_t new_seqNum;
  if ( read_sp_union_art_DataContent(sb_channel3, value, &new_seqNum) ) {
    sb_channel3_seqNum = new_seqNum;
    return true;
  } else {
    return false;
  }
}

/*****************************************************************
 * sb_channel4_is_empty:
 *
 * Helper method to determine if the data infrastructure port has
 * received data
 *
 ****************************************************************/
bool sb_channel4_is_empty() {
  return is_empty_sp_union_art_DataContent(sb_channel4);
}

bool sb_channel4_read(union_art_DataContent * value) {
  seqNum_t new_seqNum;
  if ( read_sp_union_art_DataContent(sb_channel4, value, &new_seqNum) ) {
    sb_channel4_seqNum = new_seqNum;
    return true;
  } else {
    return false;
  }
}

bool sb_actuate_write(const union_art_DataContent * value) {
  return write_sp_union_art_DataContent(sb_actuate, value, &sb_actuate_seqNum);
}

// send actuate: Out DataPort bool
Unit RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_actuate_Send(
  STACK_FRAME
  art_DataContent d) {
  DeclNewStackFrame(caller, "sb_CoincidenceLogic_i.c", "", "RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_actuate_Send", 0);

  sb_actuate_write(d);
}

// is_empty channel1: In DataPort
B RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel1_IsEmpty(STACK_FRAME_ONLY) {
  return sb_channel1_is_empty();
}

// receive channel1: In DataPort union_art_DataContent
Unit RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel1_Receive(
  STACK_FRAME
  Option_8E9F45 result) {
  DeclNewStackFrame(caller, "sb_CoincidenceLogic_i.c", "", "RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel1_Receive", 0);

  union_art_DataContent val;
  if(sb_channel1_read((union_art_DataContent *) &val)) {
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


// is_empty channel2: In DataPort
B RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel2_IsEmpty(STACK_FRAME_ONLY) {
  return sb_channel2_is_empty();
}

// receive channel2: In DataPort union_art_DataContent
Unit RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel2_Receive(
  STACK_FRAME
  Option_8E9F45 result) {
  DeclNewStackFrame(caller, "sb_CoincidenceLogic_i.c", "", "RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel2_Receive", 0);

  union_art_DataContent val;
  if(sb_channel2_read((union_art_DataContent *) &val)) {
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


// is_empty channel3: In DataPort
B RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel3_IsEmpty(STACK_FRAME_ONLY) {
  return sb_channel3_is_empty();
}

// receive channel3: In DataPort union_art_DataContent
Unit RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel3_Receive(
  STACK_FRAME
  Option_8E9F45 result) {
  DeclNewStackFrame(caller, "sb_CoincidenceLogic_i.c", "", "RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel3_Receive", 0);

  union_art_DataContent val;
  if(sb_channel3_read((union_art_DataContent *) &val)) {
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


// is_empty channel4: In DataPort
B RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel4_IsEmpty(STACK_FRAME_ONLY) {
  return sb_channel4_is_empty();
}

// receive channel4: In DataPort union_art_DataContent
Unit RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel4_Receive(
  STACK_FRAME
  Option_8E9F45 result) {
  DeclNewStackFrame(caller, "sb_CoincidenceLogic_i.c", "", "RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_seL4Nix_channel4_Receive", 0);

  union_art_DataContent val;
  if(sb_channel4_read((union_art_DataContent *) &val)) {
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
  DeclNewStackFrame(NULL, "sb_CoincidenceLogic_i.c", "", "pre_init", 0);

  printf("Entering pre-init of CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic\n");

  // initialise data structure for data port actuate
  init_sp_union_art_DataContent(sb_actuate, &sb_actuate_seqNum);

  // initialise slang-embedded components/ports
  RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_adapter_initialiseArchitecture(SF_LAST);

  // call the component's initialise entrypoint
  RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_adapter_initialiseEntryPoint(SF_LAST);

  printf("Leaving pre-init of CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic\n");
}

/************************************************************************
 * int run(void)
 * Main active thread function.
 ************************************************************************/
int run(void) {
  DeclNewStackFrame(NULL, "sb_CoincidenceLogic_i.c", "", "run", 0);

  sb_self_pacer_tick_emit();
  for(;;) {
    sb_self_pacer_tock_wait();
    // call the component's compute entrypoint
    RTS_Actuation_CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_adapter_computeEntryPoint(SF_LAST);
    sb_self_pacer_tick_emit();
  }
  return 0;
}