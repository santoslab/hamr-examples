package isolette.Isolette.UserInterface

import isolette.Isolette_Data_Model.TempWstatus_impl
import isolette._
import org.sireum._

import java.util.concurrent.atomic.AtomicReference

object Interface_Ext {

  // Alternatively could implement gui directly here rather than
  // doing pass-throughs

  val form: Gui = new Gui()

  var lowerDesiredTempWstatus: AtomicReference[Isolette_Data_Model.TempWstatus_impl] = new AtomicReference[TempWstatus_impl]()
  var upperDesiredTempWstatus: AtomicReference[Isolette_Data_Model.TempWstatus_impl] = new AtomicReference[TempWstatus_impl]()
  var lowerAlarmTempWstatus: AtomicReference[Isolette_Data_Model.TempWstatus_impl] = new AtomicReference[TempWstatus_impl]()
  var upperAlarmTempWstatus: AtomicReference[Isolette_Data_Model.TempWstatus_impl] = new AtomicReference[TempWstatus_impl]()

  def initialise(_lowerDesiredTempWstatus: Isolette_Data_Model.TempWstatus_impl,
                 _upperDesiredTempWstatus: Isolette_Data_Model.TempWstatus_impl,
                 _lowerAlarmTempWstatus: Isolette_Data_Model.TempWstatus_impl,
                 _upperAlarmTempWstatus: Isolette_Data_Model.TempWstatus_impl): Unit = {
    lowerDesiredTempWstatus.set(_lowerDesiredTempWstatus)
    upperDesiredTempWstatus.set(_upperDesiredTempWstatus)
    lowerAlarmTempWstatus.set(_lowerAlarmTempWstatus)
    upperAlarmTempWstatus.set(_upperAlarmTempWstatus)

    form.init(
      lowerDesiredTempWstatus.get(),
      upperDesiredTempWstatus.get(),
      lowerAlarmTempWstatus.get(),
      upperAlarmTempWstatus.get())
  }

  def finalise(): Unit = {
    form.frame.dispose()
  }

  def setRegulatorStatus(v: Option[Isolette_Data_Model.Status.Type]): Unit = {
    form.setRegulatorStatus(v)
  }

  def setMonitorStatus(v: Option[Isolette_Data_Model.Status.Type]): Unit = {
    form.setMonitorStatus(v)
  }

  def setDispayTemperature(v: Option[Isolette_Data_Model.Temp_impl]): Unit = {
    form.setDisplayTemperature(v)
  }

  def setAlarmControl(v: Option[Isolette_Data_Model.On_Off.Type]): Unit = {
    form.setAlarmControl(v)
  }


  def getLowerDesiredTempWstatus(): Isolette_Data_Model.TempWstatus_impl = {
    return lowerDesiredTempWstatus.get()
  }

  def getUpperDesiredTempWstatus(): Isolette_Data_Model.TempWstatus_impl = {
    return upperDesiredTempWstatus.get()
  }

  def getLowerAlarmTempWstatus(): Isolette_Data_Model.TempWstatus_impl = {
    return lowerAlarmTempWstatus.get()
  }

  def getUpperAlarmTempWstatus(): Isolette_Data_Model.TempWstatus_impl = {
    return upperAlarmTempWstatus.get()
  }
}
