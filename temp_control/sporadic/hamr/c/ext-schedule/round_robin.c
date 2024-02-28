#include <all.h>
#include <signal.h>

// This file will not be overwritten so is safe to edit

// Transpiled signature of the Slang variable tc.Schedulers.roundRobinSchedule
// in architecture/tc/Schedulers.scala.  This weak function declaration allows
// tc_ScheduleProviderI_getRoundRobinOrder to detect whether the Slang variable was deleted
__attribute__((weak)) IS_FDDCB6 tc_Schedulers_roundRobinSchedule(STACK_FRAME_ONLY);

volatile sig_atomic_t shouldStop = 0;

/*!
 * Example C implementation of the Slang extension method tc.ScheduleProviderI.getRoundRobinOrder()
 * defined in architecture/tc/Schedulers.scala
 *
 * @param result an empty schedule.  Add components in the order you want them to be dispatched.
 *               IS_FDDCB6=ISZ[art.Art.BridgeId], i.e. an immutable sequence of art.Bridge
 */
void tc_ScheduleProviderI_getRoundRobinOrder(STACK_FRAME IS_FDDCB6 result) {
  DeclNewStackFrame(caller, "round_robin.c", "", "tc_ScheduleProviderI_getRoundRobinOrder", 0);

  if(tc_Schedulers_roundRobinSchedule) {
    printf("Using the round robin order provided in architecture/tc/Schedulers.scala. Edit method \n");
    printf("  tc_ScheduleProviderI_getRoundRobinOrder located in round_robin.c\n");
    printf("to supply your own\n");

    IS_FDDCB6 order = tc_Schedulers_roundRobinSchedule(SF_LAST);
    memcpy(result->value, order->value, sizeof(art_Art_BridgeId) * order->size);
    result->size = order->size;

  } else {
    printf("Transpiled Slang variable tc.Schedulers.roundRobinSchedule not found.  Using an example schedule from method");
    printf("  tc_ScheduleProviderI_getRoundRobinOrder located in round_robin.c\n");

    // example schedule
    int i = 0;
    IS_FDDCB6_up(result, i++, (art_Art_BridgeId) tc_Arch_TempControlSoftwareSystem_s_Instance_tcproc_tempSensor(SF_LAST)->id);
    IS_FDDCB6_up(result, i++, (art_Art_BridgeId) tc_Arch_TempControlSoftwareSystem_s_Instance_tcproc_fan(SF_LAST)->id);
    IS_FDDCB6_up(result, i++, (art_Art_BridgeId) tc_Arch_TempControlSoftwareSystem_s_Instance_tcproc_tempControl(SF_LAST)->id);
    IS_FDDCB6_up(result, i++, (art_Art_BridgeId) tc_Arch_TempControlSoftwareSystem_s_Instance_tcproc_operatorInterface(SF_LAST)->id);

    result->size = i;
  }
}

/*!
 * signal handler that sets shouldStop to true when invoked
 */
void sigHandler(int signo) {
  shouldStop = 1;
}

/*!
 * Example C implementation of Slang extension method art.scheduling.roundrobin.RoundRobinExtensions.init()
 * defined in art/scheduling/roundrobin/RoundRobin.scala.  The scheduler calls this
 * during the initialization phase
 *
 * It registers a signal handler that is used to shut down the demo when it receives
 * SIGINT (CTRL+C), SIGTERM
 */
Unit art_scheduling_roundrobin_RoundRobinExtensions_init(STACK_FRAME_ONLY){
  int sigs[] = {SIGINT, SIGTERM};
  for(int i = 0; i < sizeof(sigs) / sizeof(int); i++){
    if(signal(sigs[i], sigHandler) == SIG_ERR) {
      printf("Error occurred while setting signal handler for %i\n", sigs[i]);
      exit(-1);
    }
  }
}

/*!
 * Example C implementation of Slang extension method art.scheduling.roundrobin.RoundRobinExtensions.shouldStop()
 * defined in art/scheduling/roundrobin/RoundRobin.scala.  The scheduler calls this
 * during the compute phase to determine when it should transition to the finalize phase
 */
B art_scheduling_roundrobin_RoundRobinExtensions_shouldStop(STACK_FRAME_ONLY){
    return shouldStop == 1;
}
