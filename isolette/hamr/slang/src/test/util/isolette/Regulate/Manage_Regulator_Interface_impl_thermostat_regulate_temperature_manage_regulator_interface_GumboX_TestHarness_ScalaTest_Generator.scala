package isolette.Regulate

import org.sireum._
import isolette.Regulate._
import isolette.GumboXUtil
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256
import org.scalatest.BeforeAndAfterAll

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness_ScalaTest_Generator {

  // CB entrypoint id ~> (testName ~> (retry num ~> preStateContainer)))
  var report: HashSMap[String, HashSMap[String, Map[Z, Option[String]]]] = _

  def resetReport(): Unit = report = HashSMap.empty

  def updateReport(entryPoint: String, result: String, testName: String, retry: Z, jsonContainer: Option[String]): Unit = {
    val key = s"$entryPoint : $result"
    val cbEntries: HashSMap[String, Map[Z, Option[String]]] =
      if (report.contains(key)) report.get(key).get
      else HashSMap.empty
    val testNameEntries: Map[Z, Option[String]] =
      if (cbEntries.contains(testName)) cbEntries.get(testName).get
      else Map.empty
    assert (!testNameEntries.contains(retry))

    report = report + key ~> (cbEntries + (testName ~> (testNameEntries + (retry ~> jsonContainer))))
  }

  def emitReport(): Unit = {
    println("Test Results")
    for(e <- report.entries) {
      println(s"  ${e._1} = ${e._2.size}")
      val attempts = e._2.values.elements.foldLeft(z"0")((o, m) => o + m.size)
      println(s"    Total Attempts = $attempts")
    }
  }

  def deserializeReport(p: Os.Path): HashSMap[String, HashSMap[String, Map[Z, Option[String]]]] = {
    halt("Not yet")
  }

  def serializeReport(dir: Os.Path): Unit = {
    val filename = dir / s"Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness_ScalaTest_Generator_${System.currentTimeMillis()}.json"
    //filename.write(JSON.from_artDataContent(GumboXUtil.Report(report), T))
    var map1: HashSMap[String, String] = HashSMap.empty
    for(e <- report.entries) {
      var map2: HashSMap[String, String] = HashSMap.empty
      for (t <- e._2.entries) {
        var map3: Map[Z, String] = Map.empty
        for (r <- t._2.entries) {
          val s: String =
            if (r._2.isEmpty) ""
            else r._2.get
          map3 = map3 + (r._1 ~> s)
        }
        map2 = map2 + (t._1 ~>
          org.sireum.Json.Printer.printMap(T, map3, org.sireum.Json.Printer.printZ _, org.sireum.Json.Printer.printString _).render)
      }
      map1 = map1 + (e._1 ~>
        org.sireum.Json.Printer.printHashSMap(T, map2, org.sireum.Json.Printer.printString _, org.sireum.Json.Printer.printString _).render)
    }
    val sreport = org.sireum.Json.Printer.printHashSMap(T, map1, org.sireum.Json.Printer.printString _, org.sireum.Json.Printer.printString _).render
    filename.write(sreport)
    println(s"Wrote: ${filename.toUri}")
  }
}

import Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness_ScalaTest_Generator._

trait Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness_ScalaTest_Generator extends Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness_ScalaTest
  with BeforeAndAfterAll {

  // return a directory path if you want to serialize the report
  def serializeReportPath: Option[Os.Path] = None()

  def failOnUnsatPreconditions: B = F

  def seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)

  def getProfiles_P: ISZ[Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Profile_P]

  def getDefaultProfile_P: Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Profile_P = {
    return Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Profile_P (
      name = "Default Port Profile", 
      numTests = 100, 
      numTestVectorGenRetries = 100, 
      api_current_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_lower_desired_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_regulator_mode = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))), 
      api_upper_desired_tempWstatus = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64()))))
  }

  def next(profile: Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Profile_P): Option[Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P] = {
    try {
      val api_current_tempWstatus = profile.api_current_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_lower_desired_tempWstatus = profile.api_lower_desired_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
      val api_regulator_mode = profile.api_regulator_mode.nextIsolette_Data_ModelRegulator_ModeType()
      val api_upper_desired_tempWstatus = profile.api_upper_desired_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()

      return Some(Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(api_current_tempWstatus,api_lower_desired_tempWstatus,api_regulator_mode,api_upper_desired_tempWstatus))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  override def beforeAll(): Unit = resetReport()

  override def afterAll(): Unit = {
    emitReport()
    serializeReportPath match {
      case Some (p) => serializeReport(p)
      case _ =>
    }
  }

  def numInitialiseTests: Z = 100

  {
    for (i <- 0 until numInitialiseTests) {
      val testName = s"testInitialiseCB_$i"
      this.registerTest(testName) {
        val results = testInitialiseCB()
        updateReport("testInitialiseCB", results.name, testName, 0, None())

        results match {
          case GumboXResult.Pre_Condition_Unsat =>
            halt("Infeasible as initialize entry points cannot contain assume clauses and cannot access incoming ports or state variables")
          case GumboXResult.Post_Condition_Fail =>
            fail ("Post condition did not hold")
          case GumboXResult.Post_Condition_Pass =>
            if (verbose) {
              println ("Success!")
            }
        }
      }
    }
  }

  for (profile <- getProfiles_P) {
    testComputeCB_Profile_P(profile)
  }

  def testComputeCB_Profile_P(profile: Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Profile_P): Unit = {
    for (i <- 0 until profile.numTests) {
      val testName = s"Profile \"${profile.name}\": testComputeCB_$i"
      val escapedTestName = s"Profile \\\"${profile.name}\\\": testComputeCB_$i"

      this.registerTest(testName) {
        var retry: B = T

        var j: Z = 0
        while (j < profile.numTestVectorGenRetries && retry) {
          next(profile) match {
            case Some(o) =>

              if (verbose && j > 0) {
                println(s"Retry $j:")
              }

              val results = testComputeCBV(o)

              val json = isolette.JSON.fromRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(o, T)
              updateReport("testComputeCB_Profile_P", results.name, testName, j, Some(json))

              if (verbose) {
                val tq = "\"\"\""
                println(st"""Replay Unit Test:
                            |  test("Replay: $escapedTestName") {
                            |    val json = st${tq}${json}${tq}.render
                            |    val testVector = isolette.JSON.toRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(json).left
                            |    assert (testComputeCBV(testVector) == isolette.GumboXUtil.GumboXResult.$results)
                            |  }""".render)
              }

              results match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println ("Success!")
                  }
                  retry = F
              }
            case _ =>
              updateReport("testComputeCB_Profile_P", "SlangCheck RTS", testName, j, None())
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }
}