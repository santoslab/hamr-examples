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

// create serializers/deserializers for the Slang types used in the project

val files: ISZ[String] = ISZ("../src/main/data/tc/TempSensor/Temperature_i.scala",
                             "../src/main/data/tc/CoolingFan/FanCmd.scala",
                             "../src/main/data/tc/CoolingFan/FanAck.scala",
                             "../src/main/data/tc/TempControlSoftwareSystem/SetPoint_i.scala",
                             "../src/main/data/tc/Base_Types.scala",
                             "../src/main/data/tc/TempSensor/TempSensorPeriodic_p_tcproc_tempSensor_SlangCheckContainer.scala",
                             "../src/main/data/tc/CoolingFan/FanPeriodic_p_tcproc_fan_SlangCheckContainer.scala",
                             "../src/main/data/tc/TempControlSoftwareSystem/TempControlPeriodic_p_tcproc_tempControl_SlangCheckContainer.scala",
                             "../src/main/data/tc/TempControlSoftwareSystem/OperatorInterfacePeriodic_p_tcproc_operatorInterface_SlangCheckContainer.scala",
                             "../src/main/art/art/DataContent.scala")

val toolargs: String = st"${(files, " ")}".render

proc"$sireum tools sergen -p tc -m json,msgpack -o ${Os.slashDir.up}/src/main/data/tc $toolargs".at(Os.slashDir).console.runCheck()
