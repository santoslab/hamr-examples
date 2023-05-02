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

// create serializers/deserializers for the Slang types used in the project

val sireum = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")

proc"$sireum tools sergen -p isolette -m json,msgpack -o ${Os.slashDir.up}/src/main/data/isolette ../src/main/art/art/DataContent.scala ../src/main/data/isolette/Isolette_Environment/Heat.scala ../src/main/data/isolette/Isolette_Environment/Interface_Interaction.scala ../src/main/data/isolette/Isolette_Data_Model/PhysicalTemp_impl.scala ../src/main/data/isolette/Isolette_Data_Model/ValueStatus.scala ../src/main/data/isolette/Isolette_Data_Model/TempWstatus_impl.scala ../src/main/data/isolette/Isolette_Data_Model/On_Off.scala ../src/main/data/isolette/Isolette_Data_Model/Status.scala ../src/main/data/isolette/Isolette_Data_Model/Temp_impl.scala ../src/main/data/isolette/Isolette_Data_Model/Regulator_Mode.scala ../src/main/data/isolette/Isolette_Data_Model/Failure_Flag_impl.scala ../src/main/data/isolette/Isolette_Data_Model/Monitor_Mode.scala ../src/main/data/isolette/Base_Types.scala".at(Os.slashDir).console.runCheck()
