// #Sireum

package tc.runtimemonitor

import org.sireum._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object GumboXDispatcher {
  def checkContract(observationKind: ObservationKind.Type, preContainer: Option[art.DataContent], postContainer: Option[art.DataContent]): B = {
    observationKind match {
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postInit =>
        val result: B = tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_GumboX.inititialize_IEP_Post_Container(postContainer.get.asInstanceOf[tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS])
        //println(s"tempSensor.initialise: Post-condition: ${if (result) "" else "un"}satisfied")
        return result
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_preCompute =>
        // checking the pre-state values of tempSensor's compute entrypoint is not required
        return T
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postCompute =>
        val result: B = tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_GumboX.compute_CEP_Post_Container(preContainer.get.asInstanceOf[tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS], postContainer.get.asInstanceOf[tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS])
        //println(s"tempSensor.timeTriggered: Post-condition: ${if (result) "" else "un"}satisfied")
        return result

      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_fan_postInit =>
        // checking the post-state values of fan's initialise entrypoint is not required
        return T
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_fan_preCompute =>
        // checking the pre-state values of fan's compute entrypoint is not required
        return T
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_fan_postCompute =>
        // checking the post-state values of fan's compute entrypoint is not required
        return T

      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postInit =>
        val result: B = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.inititialize_IEP_Post_Container(postContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS])
        //println(s"tempControl.initialise: Post-condition: ${if (result) "" else "un"}satisfied")
        return result
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_preCompute =>
        val result: B = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Pre_Container(preContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS])
        //println(s"tempControl.timeTriggered: Pre-condition: ${if (result) "" else "un"}satisfied")
        return result
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postCompute =>
        val result: B = tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Post_Container(preContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS], postContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS])
        //println(s"tempControl.timeTriggered: Post-condition: ${if (result) "" else "un"}satisfied")
        return result

      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postInit =>
        val result: B = tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX.inititialize_IEP_Post_Container(postContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS])
        //println(s"operatorInterface.initialise: Post-condition: ${if (result) "" else "un"}satisfied")
        return result
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_preCompute =>
        val result: B = tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX.compute_CEP_Pre_Container(preContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS])
        //println(s"operatorInterface.timeTriggered: Pre-condition: ${if (result) "" else "un"}satisfied")
        return result
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postCompute =>
        val result: B = tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX.compute_CEP_Post_Container(preContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS], postContainer.get.asInstanceOf[tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS])
        //println(s"operatorInterface.timeTriggered: Post-condition: ${if (result) "" else "un"}satisfied")
        return result

      case _ => halt("Infeasible")
    }
  }

  def genTestSuite(testCases: ISZ[(Z, ISZ[ST])]): Unit = {
    val tq = "\"\"\""

    val testRoot = Os.path(".") / "src" / "test" / "bridge"

    val TempSensorPeriodic_p_tcproc_tempSensor_id = Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor.id
    val FanPeriodic_p_tcproc_fan_id = Arch.TempControlSoftwareSystem_p_Instance_tcproc_fan.id
    val TempControlPeriodic_p_tcproc_tempControl_id = Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempControl.id
    val OperatorInterfacePeriodic_p_tcproc_operatorInterface_id = Arch.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.id

    def genUniqueSuiteName(path: Os.Path, prefix: String): String = {
      var i = 0
      while(true) {
        val cand = path / s"${prefix}_${i}.scala"
        if (!cand.exists) {
          return s"${prefix}_${i}"
        }
        i = i + 1
      }
      halt("Infeasible")
    }

    for (p <- testCases) {
      art.Art.BridgeId.fromZ(p._1) match {
        case TempSensorPeriodic_p_tcproc_tempSensor_id =>
          val prefix = "TempSensorPeriodic_p_tcproc_tempSensor_RM_TestSuite"
          val path = testRoot /+ ISZ("tc","TempSensor")
          val suiteName = genUniqueSuiteName(path, prefix)

          val testSuite =
            st"""package tc.TempSensor
                |
                |import org.sireum._
                |import tc.TempSensor._
                |
                |class ${suiteName} extends TempSensorPeriodic_p_tcproc_tempSensor_GumboX_TestHarness_ScalaTest {
                |  val verbose: B = T
                |
                |  ${p._2}
                |}"""
          val filename = path / s"${suiteName}.scala"
          filename.writeOver(testSuite.render)
          println(s"Wrote: ${filename.toUri}")
        case FanPeriodic_p_tcproc_fan_id =>
          val prefix = "FanPeriodic_p_tcproc_fan_RM_TestSuite"
          val path = testRoot /+ ISZ("tc","CoolingFan")
          val suiteName = genUniqueSuiteName(path, prefix)

          val testSuite =
            st"""package tc.CoolingFan
                |
                |import org.sireum._
                |import tc.CoolingFan._
                |
                |class ${suiteName} extends FanPeriodic_p_tcproc_fan_GumboX_TestHarness_ScalaTest {
                |  val verbose: B = T
                |
                |  ${p._2}
                |}"""
          val filename = path / s"${suiteName}.scala"
          filename.writeOver(testSuite.render)
          println(s"Wrote: ${filename.toUri}")
        case TempControlPeriodic_p_tcproc_tempControl_id =>
          val prefix = "TempControlPeriodic_p_tcproc_tempControl_RM_TestSuite"
          val path = testRoot /+ ISZ("tc","TempControlSoftwareSystem")
          val suiteName = genUniqueSuiteName(path, prefix)

          val testSuite =
            st"""package tc.TempControlSoftwareSystem
                |
                |import org.sireum._
                |import tc.TempControlSoftwareSystem._
                |
                |class ${suiteName} extends TempControlPeriodic_p_tcproc_tempControl_GumboX_TestHarness_ScalaTest {
                |  val verbose: B = T
                |
                |  ${p._2}
                |}"""
          val filename = path / s"${suiteName}.scala"
          filename.writeOver(testSuite.render)
          println(s"Wrote: ${filename.toUri}")
        case OperatorInterfacePeriodic_p_tcproc_operatorInterface_id =>
          val prefix = "OperatorInterfacePeriodic_p_tcproc_operatorInterface_RM_TestSuite"
          val path = testRoot /+ ISZ("tc","TempControlSoftwareSystem")
          val suiteName = genUniqueSuiteName(path, prefix)

          val testSuite =
            st"""package tc.TempControlSoftwareSystem
                |
                |import org.sireum._
                |import tc.TempControlSoftwareSystem._
                |
                |class ${suiteName} extends OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX_TestHarness_ScalaTest {
                |  val verbose: B = T
                |
                |  ${p._2}
                |}"""
          val filename = path / s"${suiteName}.scala"
          filename.writeOver(testSuite.render)
          println(s"Wrote: ${filename.toUri}")
        case x => halt(s"Infeasible bridge id: $x")
      }
    }
  }

  def genTestCase(observationKind: ObservationKind.Type, preContainer: Option[String], postContainer: Option[String], testNameSuffix: Option[String]): ST = {
    val tq = "\"\"\""
    val suffix: String =
      if (testNameSuffix.nonEmpty) testNameSuffix.get
      else ""

    observationKind match {
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postInit =>
        return (st"""// Begin test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postInit
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postInit: Check Post-condition$suffix") {
                    |  val postJson: String = st${tq}${postContainer.get}${tq}.render
                    |  val postContainer = tc.JSON.toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(postJson).left
                    |  assert(tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_GumboX.inititialize_IEP_Post_Container(postContainer))
                    |}
                    |// End test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postInit""")
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postCompute =>
        return (st"""// Begin test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postCompute
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postCompute: Check Post-condition$suffix") {
                    |  val preJson: String = st${tq}${preContainer.get}${tq}.render
                    |  val postJson: String = st${tq}${postContainer.get}${tq}.render
                    |  val preContainer = tc.JSON.toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS(preJson).left
                    |  val postContainer = tc.JSON.toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS(postJson).left
                    |  if (verbose) {
                    |    println("Pre-State Values:")
                    |    println(s"  $$preContainer")
                    |    println("Post-State Values:")
                    |    println(s"  $$postContainer");
                    |  }
                    |  assert(tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_GumboX.compute_CEP_Post_Container(preContainer, postContainer))
                    |}
                    |// End test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postCompute""")

      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postInit =>
        return (st"""// Begin test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postInit
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postInit: Check Post-condition$suffix") {
                    |  val postJson: String = st${tq}${postContainer.get}${tq}.render
                    |  val postContainer = tc.JSON.toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(postJson).left
                    |  assert(tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.inititialize_IEP_Post_Container(postContainer))
                    |}
                    |// End test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postInit""")
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_preCompute =>
        return (st"""// Begin test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempControl_preCompute
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_tempControl_preCompute: Check Pre-condition$suffix") {
                    |  val preJson: String = st${tq}${preContainer.get}${tq}.render
                    |  val preContainer = tc.JSON.toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(preJson).left
                    |  if (verbose) {
                    |    println("Pre-State Values:")
                    |    println(s"  $$preContainer")
                    |  }
                    |  assert(tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Pre_Container(preContainer))
                    |}
                    |// End test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempControl_preCompute""")
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postCompute =>
        return (st"""// Begin test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postCompute
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postCompute: Check Pre-condition$suffix") {
                    |  val preJson: String = st${tq}${preContainer.get}${tq}.render
                    |  val preContainer = tc.JSON.toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(preJson).left
                    |  if (verbose) {
                    |    println("Pre-State Values:")
                    |    println(s"  $$preContainer")
                    |  }
                    |  assert(tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Pre_Container(preContainer))
                    |}
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postCompute: Check Post-condition$suffix") {
                    |  val preJson: String = st${tq}${preContainer.get}${tq}.render
                    |  val postJson: String = st${tq}${postContainer.get}${tq}.render
                    |  val preContainer = tc.JSON.toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS(preJson).left
                    |  val postContainer = tc.JSON.toTempControlSoftwareSystemTempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS(postJson).left
                    |  if (verbose) {
                    |    println("Pre-State Values:")
                    |    println(s"  $$preContainer")
                    |    println("Post-State Values:")
                    |    println(s"  $$postContainer");
                    |  }
                    |  assert(tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_GumboX.compute_CEP_Post_Container(preContainer, postContainer))
                    |}
                    |// End test cases for TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postCompute""")
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postInit =>
        return (st"""// Begin test cases for TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postInit
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postInit: Check Post-condition$suffix") {
                    |  val postJson: String = st${tq}${postContainer.get}${tq}.render
                    |  val postContainer = tc.JSON.toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(postJson).left
                    |  assert(tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX.inititialize_IEP_Post_Container(postContainer))
                    |}
                    |// End test cases for TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postInit""")
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_preCompute =>
        return (st"""// Begin test cases for TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_preCompute
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_preCompute: Check Pre-condition$suffix") {
                    |  val preJson: String = st${tq}${preContainer.get}${tq}.render
                    |  val preContainer = tc.JSON.toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(preJson).left
                    |  if (verbose) {
                    |    println("Pre-State Values:")
                    |    println(s"  $$preContainer")
                    |  }
                    |  assert(tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX.compute_CEP_Pre_Container(preContainer))
                    |}
                    |// End test cases for TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_preCompute""")
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postCompute =>
        return (st"""// Begin test cases for TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postCompute
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postCompute: Check Pre-condition$suffix") {
                    |  val preJson: String = st${tq}${preContainer.get}${tq}.render
                    |  val preContainer = tc.JSON.toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(preJson).left
                    |  if (verbose) {
                    |    println("Pre-State Values:")
                    |    println(s"  $$preContainer")
                    |  }
                    |  assert(tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX.compute_CEP_Pre_Container(preContainer))
                    |}
                    |
                    |test(s"TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postCompute: Check Post-condition$suffix") {
                    |  val preJson: String = st${tq}${preContainer.get}${tq}.render
                    |  val postJson: String = st${tq}${postContainer.get}${tq}.render
                    |  val preContainer = tc.JSON.toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(preJson).left
                    |  val postContainer = tc.JSON.toTempControlSoftwareSystemOperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(postJson).left
                    |  if (verbose) {
                    |    println("Pre-State Values:")
                    |    println(s"  $$preContainer")
                    |    println("Post-State Values:")
                    |    println(s"  $$postContainer");
                    |  }
                    |  assert(tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_GumboX.compute_CEP_Post_Container(preContainer, postContainer))
                    |}
                    |// End test cases for TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postCompute""")
      case _ => return st"// TODO ${observationKind}"
    }
  }

  def getUpdates(bridge_id: art.Art.BridgeId, observationKind: ObservationKind.Type, container: art.DataContent): Map[String, String] = {
    observationKind match {
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postInit =>
        var updates: Map[String, String] = Map.empty
        val postContainer = container.asInstanceOf[tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS]
        updates = updates + s"${bridge_id}_Out_currentTemp" ~> postContainer.api_currentTemp.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_fan_postInit =>
        var updates: Map[String, String] = Map.empty
        val postContainer = container.asInstanceOf[tc.CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS]
        updates = updates + s"${bridge_id}_Out_fanAck" ~> postContainer.api_fanAck.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postInit =>
        var updates: Map[String, String] = Map.empty
        val postContainer = container.asInstanceOf[tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS]
        updates = updates + s"${bridge_id}_Out_latestFanCmd" ~> postContainer.latestFanCmd.string
        updates = updates + s"${bridge_id}_Out_fanCmd" ~> postContainer.api_fanCmd.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postInit =>
        var updates: Map[String, String] = Map.empty
        val postContainer = container.asInstanceOf[tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS]
        updates = updates + s"${bridge_id}_Out_setPoint" ~> postContainer.api_setPoint.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_preCompute =>
        var updates: Map[String, String] = Map.empty
        val preContainer = container.asInstanceOf[tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container_PS]
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_fan_preCompute =>
        var updates: Map[String, String] = Map.empty
        val preContainer = container.asInstanceOf[tc.CoolingFan.FanPeriodic_p_tcproc_fan_PreState_Container_PS]
        updates = updates + s"${bridge_id}_In_fanCmd" ~> preContainer.api_fanCmd.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_preCompute =>
        var updates: Map[String, String] = Map.empty
        val preContainer = container.asInstanceOf[tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS]
        updates = updates + s"${bridge_id}_In_In_latestFanCmd" ~> preContainer.In_latestFanCmd.string
        updates = updates + s"${bridge_id}_In_currentTemp" ~> preContainer.api_currentTemp.string
        updates = updates + s"${bridge_id}_In_fanAck" ~> preContainer.api_fanAck.string
        updates = updates + s"${bridge_id}_In_setPoint" ~> preContainer.api_setPoint.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_preCompute =>
        var updates: Map[String, String] = Map.empty
        val preContainer = container.asInstanceOf[tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS]
        updates = updates + s"${bridge_id}_In_currentTemp" ~> preContainer.api_currentTemp.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor_postCompute =>
        var updates: Map[String, String] = Map.empty
        val postContainer = container.asInstanceOf[tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_PostState_Container_PS]
        updates = updates + s"${bridge_id}_Out_currentTemp" ~> postContainer.api_currentTemp.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_fan_postCompute =>
        var updates: Map[String, String] = Map.empty
        val postContainer = container.asInstanceOf[tc.CoolingFan.FanPeriodic_p_tcproc_fan_PostState_Container_PS]
        updates = updates + s"${bridge_id}_Out_fanAck" ~> postContainer.api_fanAck.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_tempControl_postCompute =>
        var updates: Map[String, String] = Map.empty
        val postContainer = container.asInstanceOf[tc.TempControlSoftwareSystem.TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS]
        updates = updates + s"${bridge_id}_Out_latestFanCmd" ~> postContainer.latestFanCmd.string
        updates = updates + s"${bridge_id}_Out_fanCmd" ~> postContainer.api_fanCmd.string
        return updates
      case tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postCompute =>
        var updates: Map[String, String] = Map.empty
        val postContainer = container.asInstanceOf[tc.TempControlSoftwareSystem.OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS]
        updates = updates + s"${bridge_id}_Out_setPoint" ~> postContainer.api_setPoint.string
        return updates
      case _ => return Map.empty
    }
  }
}