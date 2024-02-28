#include <all.h>

// This file will not be overwritten so is safe to edit

// Transpiled signature of the Slang variable tc.Schedulers.staticSchedule
// in architecture/tc/Schedulers.scala.  This weak function declaration allows
// tc_ScheduleProviderI_getStaticSchedule to detect whether the Slang variable was deleted
__attribute__((weak)) art_scheduling_static_Schedule_DScheduleSpec tc_Schedulers_defaultStaticSchedule(STACK_FRAME_ONLY);

// helper method
void fillInSlot(IS_5AA467 slotSequence, int index, Z bridgeId, int length);

/*!
 * Example C implementation of the Slang extension method tc.ScheduleProviderI.getStaticSchedule()
 * defined in architecture/tc/Schedulers.scala
 *
 * @param result an empty schedule. Add slots in the order you want components to be dispatched.
 */
void tc_ScheduleProviderI_getStaticSchedule(STACK_FRAME art_scheduling_static_Schedule_DScheduleSpec result){
  DeclNewStackFrame(caller, "static_scheduler.c", "", "tc_ScheduleProviderI_getStaticSchedule", 0);

  if(tc_Schedulers_defaultStaticSchedule) {
    printf("Using the static schedule provided in architecture/tc/Schedulers.scala. Edit method \n");
    printf("  tc_ScheduleProviderI_getStaticSchedule located in static_scheduler.c\n");
    printf("to supply your own\n");

    art_scheduling_static_Schedule_DScheduleSpec schedule = tc_Schedulers_defaultStaticSchedule(SF_LAST);
    result->hyperPeriod = schedule->hyperPeriod;
    result->maxDomain = schedule->maxDomain;
    memcpy(&result->schedule, &schedule->schedule, sizeof(struct art_scheduling_static_Schedule_DSchedule));

  } else {
    printf("Transpiled Slang variable tc.Schedulers.staticSchedule not found.  Using an example schedule from method");
    printf("  tc_ScheduleProviderI_getStaticSchedule located in static_scheduler.c\n");

    // IS_5AA467=IS[Z, art.scheduling.static.Schedule.Slot], i.e. an immutable sequence of art.scheduling.static.Schedule.Slot
    DeclNewIS_5AA467(slotSequence);

    Z length = 1000 / 4;

    int i = 0;
    fillInSlot(&slotSequence, i++, tc_Arch_TempControlSoftwareSystem_s_Instance_tcproc_tempSensor(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, tc_Arch_TempControlSoftwareSystem_s_Instance_tcproc_fan(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, tc_Arch_TempControlSoftwareSystem_s_Instance_tcproc_tempControl(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, tc_Arch_TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface(SF_LAST)->id, length);
    slotSequence.size = i;

    DeclNewart_scheduling_static_Schedule_DSchedule(dschedule);
    art_scheduling_static_Schedule_DSchedule_apply(SF &dschedule, &slotSequence);

    Z maxDomain = 100;
    Z hyperPeriod = 1000;

    art_scheduling_static_Schedule_DScheduleSpec_apply(SF result, maxDomain, hyperPeriod, &dschedule);
  }
}

void fillInSlot(IS_5AA467 slotSequence, int index, Z bridgeId, int length) {
  // TODO: need to refactor to adjust to 2023.10 Slang changes
  exit(1);
  //slotSequence->value[index].bridgeId = bridgeId;
  //slotSequence->value[index].length = length;
}

Unit art_scheduling_static_StaticSchedulerIO_message(STACK_FRAME String m) {
  printf("%s\n", m->value);
}
