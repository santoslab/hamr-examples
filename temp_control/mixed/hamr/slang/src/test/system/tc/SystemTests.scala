package tc

import org.sireum._
import art.Art
import art.scheduling.static._

// This file will not be overwritten so is safe to edit

class SystemTests extends SystemTestSuite {

  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
  //       abstract method
  var scheduler: StaticScheduler = Schedulers.getStaticSchedulerH(MNone())

  def compute(isz: ISZ[Command]): Unit = {
    scheduler = scheduler(commandProvider = ISZCommandProvider(isz :+ Stop()))

    Art.computePhase(scheduler)
  }

  // Suggestion: add the following import renamings of the components' SystemTestAPIs,
  //             replacing nickname with shortened versions that are easier to reference
  // import tc.TempSensor.{TempSensor_s_tcproc_tempSensor_SystemTestAPI => nickname}
  // import tc.CoolingFan.{Fan_s_tcproc_fan_SystemTestAPI => nickname}
  // import tc.TempControlSoftwareSystem.{TempControl_s_tcproc_tempControl_SystemTestAPI => nickname}
  // import tc.TempControlSoftwareSystem.{OperatorInterface_s_tcproc_operatorInterface_SystemTestAPI => nickname}

  test("Example system test") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run components' compute entrypoints through one hyper-period
    compute(ISZ(Hstep(1)))

    // use the component SystemTestAPIs' put methods to change the prestate values for components
    // TODO

    // run another hyper-period
    compute(ISZ(Hstep(1)))

    // use the component SystemTestAPIs' check or get methods to check the poststate values for components
    // TODO
  }
}
