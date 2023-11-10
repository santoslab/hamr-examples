// #Sireum

package isolette

import org.sireum._

// This file will not be overwritten so is safe to edit

object Platform {

  def setup(): Unit = {
    // BEGIN MARKER PLATFORM SETUP
    {
      // Contributions from GumboX Plugin
      isolette.runtimemonitor.RuntimeMonitor.init(isolette.runtimemonitor.ModelInfo.modelInfo)
    }
    // END MARKER PLATFORM SETUP
  }

  def tearDown(): Unit = {
    // BEGIN MARKER PLATFORM TEARDOWN
    {
      // Contributions from GumboX Plugin
      isolette.runtimemonitor.RuntimeMonitor.finalise()
    }
    // END MARKER PLATFORM TEARDOWN
  }
}