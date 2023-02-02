# aadl

 Table of Contents
  * [Diagrams](#diagrams)
    * [AADL Arch](#aadl-arch)
    * [SeL4](#sel4)
      * [SeL4 CAmkES Arch](#sel4-camkes-arch)
      * [SeL4 CAmkES HAMR Arch](#sel4-camkes-hamr-arch)
  * [Example Output](#example-output)
    * [SeL4 Expected Output: Timeout = 15 seconds](#sel4-expected-output-timeout--15-seconds)

## Diagrams
### AADL Arch
![AADL Arch](diagrams/aadl-arch.png)

### SeL4
#### SeL4 CAmkES Arch
![SeL4 CAmkES Arch](diagrams/CAmkES-arch-SeL4.svg)

#### SeL4 CAmkES HAMR Arch
![SeL4 CAmkES HAMR Arch](diagrams/CAmkES-HAMR-arch-SeL4.svg)

## Example Output
*NOTE:* actual output may differ due to issues related to thread interleaving
### SeL4 Expected Output: Timeout = 15 seconds

  |HAMR Codegen Configuration| |
  |--|--|
  | refer to [bin/run-hamr-SeL4.sh](bin/run-hamr-SeL4.sh) |


  **How To Run**
  ```
  ./bin/run-hamr-SeL4.sh
  ./../hamr/src/c/camkes/bin/run-camkes.sh  -s
  ```

  ```
  Booting all finished, dropped to user space
  Entering pre-init of Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode
  Entering pre-init of Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface
  Entering pre-init of Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source
  Entering pre-init of Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode
  Entering pre-init of Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface
  Entering pre-init of Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm
  Entering pre-init of Temperature_Sensor_impl_temperature_sensor_cpi_thermostat
  LeaEntering pre-init of operator_interface_thread_impl_operator_interface_oip_oit
  Entering pre-init of Heat_Source_impl_heat_source_cpi_heat_controller
  Leaving pre-init of HeLeaving pre-init of Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode
  Leaving pre-init of Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface
  Leaving pre-init of Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source
  Leaving pre-init of Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode
  Leaving pre-init of Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface
  Leaving pre-init of Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm
  ving pre-init of Temperature_Sensor_impl_temperature_sensor_cpi_thermostat
  Leaving pre-init of operator_interface_thread_impl_operator_interface_oip_oit
  at_Source_impl_heat_source_cpi_heat_controller
  isolette_Isolette_UserInterface_Interface_init called 
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: Init_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: Init_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 98.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Off
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(59.000000)
  isolette_single_sensor_Instance_heat_source_cpi_heat_controller: Received command: Off
  isolette_Devices_Heat_Source_Native_setState called: Off
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 59.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Onn
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(63.000000)
  isolette_single_sensor_Instance_heat_source_cpi_heat_controller: Received command: Onn
  isolette_Devices_Heat_Source_Native_setState called: Onn
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 63.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Onn
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(67.000000)
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 67.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Onn
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(71.000000)
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 71.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Onn
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(75.000000)
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 75.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Onn
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(79.000000)
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 79.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Onn
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(83.000000)
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 83.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Onn
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(87.000000)
  isolette_Isolette_UserInterface_Interface_setRegulatorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setMonitorStatus called: On_Status
  isolette_Isolette_UserInterface_Interface_setDispayTemperature called: 87.000000
  isolette_Isolette_UserInterface_Interface_setAlarmControl called: Onn
  isolette_Isolette_UserInterface_Interface_getLowerDesiredTempWstatus called: 97.000000
  isolette_Isolette_UserInterface_Interface_getUpperDesiredTempWstatus called: 99.000000
  isolette_Isolette_UserInterface_Interface_getLowerAlarmTempWstatus called: 95.000000
  isolette_Isolette_UserInterface_Interface_getUpperAlarmTempWstatus called: 101.000000
  isolette_Devices_Temperature_Sensor_Native_getCurrentTemp called
  isolette_single_sensor_Instance_temperature_sensor_cpi_thermostat: Sensed temperature: Temp_impl(91.000000)

  ```