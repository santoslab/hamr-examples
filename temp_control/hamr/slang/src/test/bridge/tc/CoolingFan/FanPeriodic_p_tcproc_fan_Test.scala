package tc.CoolingFan

import org.sireum._
import tc.CoolingFan._

// This file will not be overwritten so is safe to edit
class FanPeriodic_p_tcproc_fan_Test extends FanPeriodic_p_tcproc_fan_ScalaTest {

  test("Example Unit Test"){
    put_concrete_inputs(FanCmd.Off)

    testCompute()
  }
}
