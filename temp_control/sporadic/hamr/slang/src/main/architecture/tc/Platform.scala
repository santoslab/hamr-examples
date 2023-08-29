// #Sireum

package tc

import org.sireum._
import tc.runtimemonitor.tcModelInfo

// This file will not be overwritten so is safe to edit

object Platform {

  def setup(): Unit = {
    // BEGIN PLATFORM SETUP
    {
      // Contributions from GumboX Plugin
      tc.runtimemonitor.RuntimeMonitor.init(tcModelInfo.modelInfo)
    }
    // END PLATFORM SETUP
  }

  def tearDown(): Unit = {
    // BEGIN PLATFORM TEARDOWN
    // END PLATFORM TEARDOWN
  }
}