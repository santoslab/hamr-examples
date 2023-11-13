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

val homeDir = Os.slashDir.up

val sireumBin = Os.path(Os.env("SIREUM_HOME").get) / "bin"
val sireum = sireumBin / (if (Os.isWin) "sireum.bat" else "sireum")
var result: Z = 0

def run(title: String, verbose: B, proc: OsProto.Proc): Z = {
  println(s"$title ...")
  val r = (if (verbose) proc.console.echo else proc).run()
  if (!r.ok) {
    println(s"$title failed!")
    cprintln(F, r.out)
    cprintln(T, r.err)
  }
  return r.exitCode
}

println(
  st"""**************************************************************************
      |*                      TEMP CONTROL PERIODIC                             *
      |**************************************************************************""".render
)

if (result == 0) {
  result = run("Cleaning", F, proc"$sireum slang run ${homeDir / "aadl" / "bin" / "clean.cmd"}")
}

if (result == 0) {
  result = run("Running codegen targeting JVM with runtime monitoring", F, proc"$sireum slang run ${homeDir / "aadl" / "bin" / "run-hamr.cmd"} JVM")
}

if (result == 0) {
  result = run("Compiling Proyek project", F, proc"$sireum proyek compile .".at(homeDir / "hamr" / "slang"))
}

// TODO: add run-demo-jvm
//if(result == 0) {
//    result = proc"$sireum slang run ${homeDir / "hamr" / "slang" / "bin" / "run-demo-linux.cmd"}".console.echo.run().exitCode
//}

if (result == 0) {
  result = run("Verifying via Logika", T, proc"$sireum slang run ${homeDir / "hamr" / "slang" / "bin" / "run-logika.cmd"}")
}

Os.exit(result)
