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
%SIREUM_HOME%\bin\sireum.bat slang run "%0" %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._
import org.sireum.project.ProjectUtil._
import org.sireum.project.JSON

val sireum = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")
val isCI: B = Os.env("GITLAB_CI").nonEmpty || Os.env("GITHUB_ACTIONS").nonEmpty || Os.env("BUILD_ID").nonEmpty

val home = Os.slashDir.up.canon

val jacobHome = home / "jacob-misc"
val slangCheckJar = jacobHome / "rangen" / "out" / "rangen" / "assemble" / "rangen.jar"


def usage(): Unit = {
  println("Rangen /build")
  println(
    st"""Usage: ( compile | test | tipe |
                  build-slangcheck | run-slangcheck )+""".render)
}

def tipe(): Unit = {
  println("Slang type checking ...")
  Os.proc(ISZ(sireum.string, "proyek", "tipe", "--par", "--strict-aliasing", home.string)).at(home).console.runCheck()
  println()
}

def compile(): Unit = {
  tipe()

  println("Compiling ...")
  proc"$sireum proyek compile --par --sha3 $home".at(home).console.runCheck()
  println()
}

def test(): Unit = {
  tipe()

  println("Testing ...")
  proc"$sireum proyek test --par --sha3 $home".at(home).console.runCheck()
  println()
}

def buildSlangCheck(): Unit = {
  println("Building SlangCheck ...")

  proc"${(jacobHome / "rangen" / "bin"/ "build.cmd")} assemble".console.runCheck()

  assert (slangCheckJar.exists, s"$slangCheckJar not found")
  println(s"Examples usage: java -jar $slangCheckJar")
}

def runSlangCheck(): Unit = {
  if (!slangCheckJar.exists) {
    println("Run 'bin/build.cmd build-slangcheck' first")
    Os.exit(1)
  }
  val dataDir = home / "src" / "main" / "data"
  val testDir = home / "src" / "test" / "data"

  val dataFiles = dataDir / "RTS" / "Base_Types.scala"
  proc"java -jar $slangCheckJar tools slangcheck -o $dataDir -t $testDir $dataFiles".at(home).console.runCheck()

  val projectCmd = home / "bin" / "project.cmd"
  projectCmd.writeOver(ops.StringOps(projectCmd.read).replaceAllLiterally("\"bridge\", \"util\"", "\"bridge\", \"data\",  \"util\""))
  projectCmd.chmod("700")
}

def clone(repo: String, location: Os.Path): Unit = {
  if (!location.exists) {
    val locRel = home.relativize(location)
    val args = ISZ[String]("git", "clone", repo, locRel.value)
    Os.proc(args).at(home).console.timeout(10000).runCheck()

    buildSlangCheck()
  } else {
    Os.proc(ISZ("git", "pull")).at(location).console.runCheck()

    println("If git reported that it pulled updates to Jacob's repo then you might want to run:")
    println(s"  ${(home / "bin"/ "build.cmd").canon} build-slangcheck")
  }
}

for(subproj <- ISZ(
  ("https://github.com/santoslab/jacob-misc.git", jacobHome)
)) {
  clone(subproj._1, subproj._2)
}

if (isCI) {
  val ver = (home / "versions.properties").properties.get("org.sireum.version.z3").get
  println(s"z3 4.12+ requires glibc 2.35 but the our selfrunner has 2.31 so installing z3 4.11.2 rather than ${ver}")
  proc"sed -i s/org.sireum.version.z3=${ver}/org.sireum.version.z3=4.11.2/g ${home / "versions.properties"}".runCheck()
  proc"cat ${home / "versions.properties"}".console.runCheck()
}

for (i <- 0 until Os.cliArgs.size) {
  Os.cliArgs(i) match {
    case string"build-slangcheck" => buildSlangCheck()
    case string"run-slangcheck" => runSlangCheck()

    case string"compile" => compile()
    case string"test" => test()
    case string"tipe" => tipe()
    case string"-h" => usage()
    case string"--help" => usage()
    case cmd =>
      usage()
      eprintln(s"Unrecognized command: $cmd")
      Os.exit(-1)
  }
}
