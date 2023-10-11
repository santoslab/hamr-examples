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

val files: ISZ[String] = ISZ("../src/main/data/RTS/Base_Types.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator__Containers.scala",
                             "../src/main/data/RTS/Actuation/OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator__Containers.scala",
                             "../src/main/art/art/DataContent.scala",
                             "../src/main/data/RTS/Aux_Types.scala")

val toolargs: String = st"${(files, " ")}".render

proc"$sireum proyek slangcheck -p RTS -o ${Os.slashDir.up}/src/main/data/RTS ${Os.slashDir.up} $toolargs".at(Os.slashDir).console.runCheck()
