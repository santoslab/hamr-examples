package art.scheduling.static

import org.sireum._

import scala.io.StdIn.readLine

object CliIOExt {
  def getCommand(prompt: String): String = {
    print(prompt)
    val command = readLine()
    return command
  }
}
