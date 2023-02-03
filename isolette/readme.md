# Isolette

## Tool Setup

Install Kekinian, FMIDE, and IVE by following the instructions: [Installing and Updating FMIDE (customization of AADL OSATE IDE) and HAMR](https://hamr.sireum.org/hamr-doc/ch0X-hamr-installation.html#installing-and-updating-fmide-customization-of-aadl-osate-ide-and-hamr) 

It's recommended that you set the environment variable ``SIREUM_HOME`` so that it points to the directory where you cloned/installed Keninian


## Regenerating the Slang Project

From within FMIDE, 

- Select ``File >> Import ...``, then choose ``Existing Project into Workspace``.

- Point the select ``Select root directory:`` option at the [./aadl](./aadl) directory
  and import the ``isolette`` project

- Open [./aadl/aadl/packages/Isolette.aadl](./aadl/aadl/packages/Isolette.aadl)

- In the Outline view, select this system implementation: [thermostat_single_sensor.impl](./aadl/aadl/packages/Isolette.aadl#L171)

- Click the HAMR icon in the menu bar (or choose ``OSATE >> Sireum HAMR >> Code Generation``)

- Select the ``JVM`` platform, point the output directory to [./hamr/slang](./hamr/slang/), set the ``Base Package Name`` to be ``isolette`` and click ``Run``.


From the command line, invoke the following script: [./aadl/bin/run-hamr.cmd](./aadl/bin/run-hamr.cmd)

```
./aadl/bin/run-hamr.cmd
```

## Running the Demo

Follow the directions contained in [./hamr/slang/bin/project.cmd](./hamr/slang/bin/project.cmd#L19-L50) to either run the demo from the command line or from within IVE.

## Running Proyek Logika

From the command line:

```
sireum proyek logika --par --all ./hamr/slang
```

or, invoke the script [./hamr/slang/bin/run-logika.cmd](./hamr/slang/bin/run-logika.cmd)

```
./hamr/slang/bin/run-logika.cmd
```

From within IVE, if the file is in Logika (ie. its first line looks like [this](./hamr/slang/src/main/component/isolette/Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.scala#L1)) then you can right click the editor and in the context menu choose ``Logika Check (All in File)`` or ``Logika Check (Line)``.
