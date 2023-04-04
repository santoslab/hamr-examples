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

val isCi: B = Os.env("GITLAB_CI").nonEmpty || Os.env("GITHUB_ACTIONS").nonEmpty || Os.env("BUILD_ID").nonEmpty

@datatype class C(val file: Os.Path,
                  val logikaOpts: LogikaOpt,
                  val expectedWarnings: ISZ[String],
                  val expectedErrors: ISZ[String])

@datatype class LogikaOpt (val timeout: Z,
                           val rlimit: Z)

val defaultOpts = LogikaOpt(timeout = (if(isCi) 10000 else 2000), rlimit = 2000000)

val files = ISZ[C](
  C(monitorDir / "Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.scala", defaultOpts, ISZ(), ISZ(
    "[56, 82] Could not deduce that the postcondition holds",
    "[191, 12] Could not deduce the claim of proof step #5")),

  C(monitorDir / "Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.scala", defaultOpts, ISZ(
    "[214, 17] String interpolation is currently over-approximated to produce an unconstrained string",
    "[216, 17] String interpolation is currently over-approximated to produce an unconstrained string",
    "[218, 17] String interpolation is currently over-approximated to produce an unconstrained string",
    "[220, 17] String interpolation is currently over-approximated to produce an unconstrained string"), ISZ()),

  C(monitorDir / "Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.scala", defaultOpts, ISZ(
    "[146, 17] String interpolation is currently over-approximated to produce an unconstrained string",
    "[148, 17] String interpolation is currently over-approximated to produce an unconstrained string",
    "[150, 17] String interpolation is currently over-approximated to produce an unconstrained string"), ISZ()),

  C(regulateDir / "Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.scala", defaultOpts, ISZ(), ISZ()),

  C(regulateDir / "Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.scala", defaultOpts, ISZ(), ISZ()),

  C(regulateDir /"Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.scala", defaultOpts, ISZ(
    "[81, 12] Infeasible pattern matching case",
    "[115, 12] Infeasible pattern matching case",
    "[122, 17] String interpolation is currently over-approximated to produce an unconstrained string",
    "[124, 17] String interpolation is currently over-approximated to produce an unconstrained string",
    "[126, 17] String interpolation is currently over-approximated to produce an unconstrained string"), ISZ()))

var result: Z = 0
for(f <- files) {
  val reporter = org.sireum.message.Reporter.create
  val input = ISZ[String]("proyek", "logika",
    "--timeout", f.logikaOpts.timeout.string, //
    "--rlimit", f.logikaOpts.rlimit.string, //
    home.value, f.file.value)

  println(s"Checking ${f.file.name}")
  println(st"sireum ${(input, " ")}".render)

  val start = org.sireum.extension.Time.currentMillis
  val results = Sireum.runWithReporter(input, reporter)
  val elapsed = s"in ${(org.sireum.extension.Time.currentMillis - start) / 1000} s"

  var report =  ISZ[String]()

  def compare(typ: String, expected: ISZ[String], actual: ISZ[message.Message]): Unit = {
    if (expected.size != actual.size) {
      report = report :+ s"  Was expecting ${expected.size} ${typ}s but encountered ${actual.size}"
    }
    @strictpure def m2s(m: message.Message): String = s"[${m.posOpt.get.beginLine}, ${m.posOpt.get.beginColumn}] ${m.text}"
    for (m <- actual if !ops.ISZOps(expected).exists(p => p == m2s(m))) {
      report = report :+ s"  Unexpected $typ: ${m2s(m)}"
    }
  }

  compare("warning", f.expectedWarnings, reporter.warnings)
  compare("error", f.expectedErrors, reporter.errors)

  if (report.nonEmpty) {
    println(s"*** Failed ***\n")
    println(st"${(report, "\n")}\n".render)
    result = 1
  } else {
    println(s"  Everything accounted for:")
  }
  println(s"  Verification ${if(results._1 == 0) s"succeeded $elapsed!" else s"failed $elapsed"}\n")
}

Os.exit(result)
