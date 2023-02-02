# Monitor

- Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.scala

    Verifies: NO

    [294, 12] Could not deduce the claim of proof step #5
    
        Reason: Timeout

    [72, 79] Could not deduce that the postcondition holds

        Reason: Unknown

- Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.scala
    
    Verifies: OK

- Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.scala

    ``Invalid 'None' operation 'get'`` thrown at line [90](hamr/slang/src/main/component/isolette/Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.scala#L90).  Changing it to use the example value resolves that
    but then proof fails at line [111](hamr/slang/src/main/component/isolette/Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.scala#L111)

    Verifies: OK, **HOWEVER** orignially received:

        [63, 86] Could not deduce that the postcondition holds

            Unknown

    but it verifies after fixing markers and regenerating.

# Regulate

- Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.scala
    
    Verifies: OK

- Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.scala

    Verifies: OK

- Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.scala

    Verifies: OK, **HOWEVER** the following warnings are issued

        [87, 12] Infeasible pattern matching case

        [121, 12] Infeasible pattern matching case
