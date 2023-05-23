::/*#! 2> /dev/null                                   #
@ 2>/dev/null # 2>nul & echo off & goto BOF           #
if [ -z ${SIREUM_HOME} ]; then                        #
  echo "Please set SIREUM_HOME env var"               #
  exit -1                                             #
fi                                                    #
exec ${SIREUM_HOME}/bin/sireum slang run "$0" "$@"    #
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

val sireum = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")

// create SlangCheck generators for the types used in the project

val slangCheckJar: Os.Path = {
  Os.env("SLANG_CHECK_JAR") match {
    case Some(p) =>
      val cand = Os.path(p)
      if (!cand.exists) {
        halt(s"SLANG_CHECK_JAR is not a file: $p")
      } else {
        cand
      }
    case _ => halt(s"SLANG_CHECK_JAR is not defined")
  }
}

val files: ISZ[String] = ISZ("../src/main/data/RTS/Base_Types.scala",
                             "../src/main/art/art/DataContent.scala")

val toolargs: String = st"${(files, " ")}".render

proc"java -jar $slangCheckJar tools slangcheck -p RTS -o ../src/main/data $toolargs".at(Os.slashDir).console.runCheck()
