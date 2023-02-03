::/*#! 2> /dev/null                                 #
@ 2>/dev/null # 2>nul & echo off & goto BOF         #
if [ -z ${SIREUM_HOME} ]; then                      #
  echo "Please set SIREUM_HOME env var"             #
  exit -1                                           #
fi                                                  #
exec ${SIREUM_HOME}/bin/sireum slang run "$0" "$@"  #
:BOF
setlocal
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
%SIREUM_HOME%\\bin\\sireum.bat slang run "%0" %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._

val homeBin = Os.slashDir
val home = homeBin.up

val monitorDir = home / "src" / "main" / "component" / "isolette" / "Monitor"
val regulateDir = home / "src" / "main" / "component" / "isolette" / "Regulate"

val sireumBin = Os.path(Os.env("SIREUM_HOME").get) / "bin" 
val sireum = sireumBin / (if(Os.isWin) "sireum.bat" else "sireum")

// TODO: enhance to compare expected error/warning message with actual
val files = ISZ[(Os.Path, B)](  
    (monitorDir / "Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.scala", F),
    (monitorDir / "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.scala", T),
    (monitorDir / "Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.scala", T),

    (regulateDir / "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.scala", T),
    (regulateDir / "Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.scala", T),
    (regulateDir /"Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.scala", T))

var result: Z = 0
for(f <- files) {
    val r = proc"$sireum proyek logika --par ${home.value} ${f._1.value}".console.run()
    if ((r.exitCode == 0) != f._2) {
      cprintln(T, s"*** Failed ***")
      cprintln(T, s"Expecting verification ${if(f._2) "success" else "failure"} but it ${if(r.exitCode == 0) "succeeded" else "failed"}")
      result = r.exitCode
    }
}

Os.exit(result)
