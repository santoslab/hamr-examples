// #Sireum

package tc

import org.sireum._

// This file will not be overwritten so is safe to edit

object Platform {

  def setup(): Unit = {
    // BEGIN PLATFORM SETUP
    {
      // Contributions from GumboX Plugin
      tc.runtimemonitor.RuntimeMonitor.init(tc.runtimemonitor.ModelInfo.modelInfo)
    }
    // END PLATFORM SETUP
  }

  def tearDown(): Unit = {
    // BEGIN PLATFORM TEARDOWN
    // END PLATFORM TEARDOWN
  }
}