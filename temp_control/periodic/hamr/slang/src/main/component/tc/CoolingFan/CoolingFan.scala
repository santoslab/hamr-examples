package tc.CoolingFan

object FanDevice_Ext_Sim {
  // create a random number generator for generating random failures for fan actuation
  val rand = new java.util.Random
  // configure failure rate for fan,
  //  i.e., an Error will be simulated 35 out of every 100 times
  val errorRate = 35

  // declare variable to track whether the fan is on or not
  var isOn: Boolean = false

  def fanCmdActuate(cmd: FanCmd.Type): FanAck.Type = {

    // compute acknowledgement value
    val ackVal = {
      // if next random value indicates there should be no error
      if (rand.nextInt(100) < 100 - errorRate) {
        // compute the "isOn" status by setting it to
        //   true if the received command is On
        //   false if the received command is not On
        isOn = cmd == FanCmd.On
        // set the acknowledgement value to OK
        FanAck.Ok
      } else
      // set the acknowledgement value to Error
        FanAck.Error
    }

    return ackVal
  }
}
