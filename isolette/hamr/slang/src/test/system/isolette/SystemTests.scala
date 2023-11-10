package isolette

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
  // import isolette.Regulate.{Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_SystemTestAPI => nickname}
  // import isolette.Regulate.{Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SystemTestAPI => nickname}
  // import isolette.Regulate.{Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_SystemTestAPI => nickname}
  // import isolette.Regulate.{Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_SystemTestAPI => nickname}
  // import isolette.Monitor.{Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_SystemTestAPI => nickname}
  // import isolette.Monitor.{Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_SystemTestAPI => nickname}
  // import isolette.Monitor.{Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SystemTestAPI => nickname}
  // import isolette.Monitor.{Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_SystemTestAPI => nickname}
  // import isolette.Isolette.{operator_interface_thread_impl_operator_interface_oip_oit_SystemTestAPI => nickname}
  // import isolette.Devices.{Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_SystemTestAPI => nickname}
  // import isolette.Devices.{Heat_Source_impl_heat_source_cpi_heat_controller_SystemTestAPI => nickname}

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
