package tc.TempControlSoftwareSystem

import org.sireum._
import tc.CoolingFan.FanAck
import tc.TempControlSoftwareSystem._
import tc.TempSensor.Temperature_i

// This file will not be overwritten so is safe to edit
class TempControlPeriodic_p_tcproc_tempControl_Test extends TempControlPeriodic_p_tcproc_tempControl_ScalaTest {

  test("Example Unit Test"){
    put_concrete_inputs(Temperature_i(70.0f), FanAck.Ok, SetPoint_i(Temperature_i(60.0f), Temperature_i(100.0f)))
    testCompute()
  }
}
