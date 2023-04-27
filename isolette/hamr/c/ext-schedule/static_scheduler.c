#include <all.h>

// This file will not be overwritten so is safe to edit

// Transpiled signature of the Slang variable isolette.Schedulers.staticSchedule
// in architecture/isolette/Schedulers.scala.  This weak function declaration allows
// isolette_ScheduleProviderI_getStaticSchedule to detect whether the Slang variable was deleted
__attribute__((weak)) art_scheduling_static_Schedule_DScheduleSpec isolette_Schedulers_staticSchedule(STACK_FRAME_ONLY);

// helper method
void fillInSlot(IS_5AA467 slotSequence, int index, Z bridgeId, int length);

/*!
 * Example C implementation of the Slang extension method isolette.ScheduleProviderI.getStaticSchedule()
 * defined in architecture/isolette/Schedulers.scala
 *
 * @param result an empty schedule. Add slots in the order you want components to be dispatched.
 */
void isolette_ScheduleProviderI_getStaticSchedule(STACK_FRAME art_scheduling_static_Schedule_DScheduleSpec result){
  DeclNewStackFrame(caller, "static_scheduler.c", "", "isolette_ScheduleProviderI_getStaticSchedule", 0);

  if(isolette_Schedulers_staticSchedule) {
    printf("Using the static schedule provided in architecture/isolette/Schedulers.scala. Edit method \n");
    printf("  isolette_ScheduleProviderI_getStaticSchedule located in static_scheduler.c\n");
    printf("to supply your own\n");

    art_scheduling_static_Schedule_DScheduleSpec schedule = isolette_Schedulers_staticSchedule(SF_LAST);
    result->hyperPeriod = schedule->hyperPeriod;
    result->maxDomain = schedule->maxDomain;
    memcpy(&result->schedule, &schedule->schedule, sizeof(struct art_scheduling_static_Schedule_DSchedule));

  } else {
    printf("Transpiled Slang variable isolette.Schedulers.staticSchedule not found.  Using an example schedule from method");
    printf("  isolette_ScheduleProviderI_getStaticSchedule located in static_scheduler.c\n");

    // IS_5AA467=IS[Z, art.scheduling.static.Schedule.Slot], i.e. an immutable sequence of art.scheduling.static.Schedule.Slot
    DeclNewIS_5AA467(slotSequence);

    Z length = 1000 / 11;

    int i = 0;
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_thermostat_regulate_temperature_detect_regulator_failure(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_operator_interface_oip_oit(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat(SF_LAST)->id, length);
    fillInSlot(&slotSequence, i++, isolette_Arch_isolette_single_sensor_Instance_heat_source_cpi_heat_controller(SF_LAST)->id, length);
    slotSequence.size = i;

    DeclNewart_scheduling_static_Schedule_DSchedule(dschedule);
    art_scheduling_static_Schedule_DSchedule_apply(SF &dschedule, &slotSequence);

    Z maxDomain = 100;
    Z hyperPeriod = 1000;

    art_scheduling_static_Schedule_DScheduleSpec_apply(SF result, maxDomain, hyperPeriod, &dschedule);
  }
}

void fillInSlot(IS_5AA467 slotSequence, int index, Z bridgeId, int length) {
  slotSequence->value[index].bridgeId = bridgeId;
  slotSequence->value[index].length = length;
}
