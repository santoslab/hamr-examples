package isolette.Devices

import org.scalatest.{BeforeAndAfterEach, OneInstancePerTest}
import org.scalatest.funsuite.AnyFunSuite
import org.sireum.$internal.MutableMarker

// This file was auto-generated.  Do not edit
abstract class Heat_Source_impl_heat_source_cpi_heat_controller_ScalaTest extends
  AnyFunSuite with OneInstancePerTest with BeforeAndAfterEach with
  Heat_Source_impl_heat_source_cpi_heat_controller_TestApi {

  var clonable: Boolean = true
  var owned: Boolean = false

  override def string: org.sireum.String = {
    this.toString()
  }

  override def $clonable: Boolean = {
    return clonable
  }

  override def $clonable_=(b: Boolean): MutableMarker = {
    clonable = b
    return this
  }

  override def $owned: Boolean = {
    return owned
  }

  override def $owned_=(b: Boolean): MutableMarker = {
    owned = b
    return this
  }

  override def $clone: MutableMarker = {
    // not expecting users to want to clone realizations of this abstract class
    return this
  }

  override def beforeEach(): Unit = {
    BeforeEntrypoint()
  }

  override def afterEach(): Unit = {
    AfterEntrypoint()
  }
}