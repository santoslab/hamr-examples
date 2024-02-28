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

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// create SlangCheck artifacts for the Slang types used in the project

val files: ISZ[String] = ISZ("../src/main/data/tc/TempSensor/Temperature_i.scala",
                             "../src/main/data/tc/CoolingFan/FanCmd.scala",
                             "../src/main/data/tc/CoolingFan/FanAck.scala",
                             "../src/main/data/tc/TempControlSoftwareSystem/SetPoint_i.scala",
                             "../src/main/data/tc/Base_Types.scala",
                             "../src/main/component/tc/GUMBO_Definitions/GUMBO__Library.scala",
                             "../src/main/component/tc/TempSensor/GUMBO__Library.scala",
                             "../src/main/data/tc/TempSensor/TempSensor_s_tcproc_tempSensor_Containers.scala",
                             "../src/main/data/tc/CoolingFan/Fan_s_tcproc_fan_Containers.scala",
                             "../src/main/data/tc/TempControlSoftwareSystem/TempControl_s_tcproc_tempControl_Containers.scala",
                             "../src/main/data/tc/TempControlSoftwareSystem/OperatorInterface_s_tcproc_operatorInterface_Containers.scala",
                             "../src/main/data/tc/util/Container.scala",
                             "../src/main/art/art/DataContent.scala",
                             "../src/main/data/tc/Aux_Types.scala")

val toolargs: String = st"${(files, " ")}".render

(Os.slashDir.up / "src" / "main" / "util" / "tc").mkdirAll()

proc"$sireum proyek slangcheck -p tc -o ${Os.slashDir.up}/src/main/util/tc ${Os.slashDir.up} $toolargs".at(Os.slashDir).console.runCheck()

// call to the tools version of SlangCheck which does not invoke Tipe
//proc"$sireum tools slangcheck generator -p tc -o ${Os.slashDir.up}/src/main/util/tc $toolargs".at(Os.slashDir).console.runCheck()
