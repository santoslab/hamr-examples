::/*#! 2> /dev/null                                   #
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

val hamrDir = Os.slashDir.up / "hamr"
val slangDir = hamrDir / "slang"

val toKeep = ops.ISZOps(ISZ(
  (slangDir / "bin" / "run-demo-jvm.cmd"),
  (slangDir / "bin" / "run-logika.cmd"),
  (slangDir / "src" / "main" / "component"), // contains user provided behavior code
  (slangDir / "src" / "test" / "bridge") // contains user provided unit tests
))

def rec(p: Os.Path): Unit = {
  if(p.isFile && !toKeep.contains(p)) {
    println(s"Removing file ${p.value}")
    p.remove()
  } else {
    if (toKeep.contains(p)) {
      return
    } else {
      for(pp <- p.list) {
        rec(pp)
      }
      if(p.list.isEmpty) {
        println(s"Removing directory ${p.value}")
        p.removeAll()
      }
    }
  }
}
rec(hamrDir)
