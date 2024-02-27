// #Sireum

package isolette

import org.sireum._

object InitialValues {

  // current temperature: 68..105   (Table A-3)
  val DEFAULT_CURRENT_TEMPERATURE: F32 = 98f
  val CURRENT_TEMPERATURE_LOWER_RANGE: F32 = 68f
  val CURRENT_TEMPERATURE_UPPER_RANGE: F32 = 105f

  // display temperature: 68..105 (Table A-6)
  val DEFAULT_DISPLAYED_TEMPERATURE: F32 = 98f
  val DISPLAY_TEMPERATURE_LOWER_RANGE: F32 = 68f
  val DISPLAY_TEMPERATURE_UPPER_RANGE: F32 = 105f

  // ------ Regulator Subsystem -------

  // lower desired temperature: 97..99  (Table A-5)
  //    96..101 (Table A-7)  ..ToDo: why are these numbers different than the ones above
  val DEFAULT_LOWER_DESIRED_TEMPERATURE: F32 = 97f // [97..99]
  val LOWER_DESIRED_TEMPERATURE_LOWER_RANGE: F32 = 97f
  val LOWER_DESIRED_TEMPERATURE_UPPER_RANGE: F32 = 99f

  // upper desired temperature: 98..100 (Table A-5)
  //    97..102 (Table A-7) ..ToDo: why are these numbers different than the ones above
  val DEFAULT_UPPER_DESIRED_TEMPERATURE: F32 = 99f // [98..100]
  val UPPER_DESIRED_TEMPERATURE_LOWER_RANGE: F32 = 98f
  val UPPER_DESIRED_TEMPERATURE_UPPER_RANGE: F32 = 100f

  val DEFAULT_REGULATOR_STATUS: Isolette_Data_Model.Status.Type = Isolette_Data_Model.Status.Init_Status
  val DEFAULT_REGULATOR_INTERNAL_FAILURE_FLAG: B = false
  val DEFAULT_REGULATOR_INTERFACE_FAILURE_FLAG: B = false

  // ------ Monitor Subsystem -------

  // Issue detected via runtime monitoring.  According to Table A-12  http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=112
  // the lower alarm temp should be between [96..101].  In order to provide
  // some bounds on the float values (i.e. to help out SMT2) the gumbo assumes
  // clause was updated accordingly, but the these initial values were
  // not updated to match.

  /* OLD VALUES
   Looks like they came form Table A-5
     http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=101

   val DEFAULT_LOWER_ALARM_TEMPERATURE: F32 = 95f   // [93..98]
   val LOWER_ALARM_TEMPERATURE_LOWER_RANGE: F32 = 93f
   val LOWER_ALARM_TEMPERATURE_UPPER_RANGE: F32 = 98f
   */

  // lower alarm temperature: 93..98 (Table A-5)
  //    96..101 (Table A-12)  ..ToDo: why are these numbers different than the ones above
  val DEFAULT_LOWER_ALARM_TEMPERATURE: F32 = 97f // [96..101]
  val LOWER_ALARM_TEMPERATURE_LOWER_RANGE: F32 = 96f // used by operator interface
  val LOWER_ALARM_TEMPERATURE_UPPER_RANGE: F32 = 101f // used by operator interface

  // similarily, Table A-12 indicated an upper range of [97..102] but values from Table A-5
  // were used.  In this case the original 101 was in range, but

  /* OLD VALUES
  val DEFAULT_UPPER_ALARM_TEMPERATURE: F32 = 101f // [99..103]
  val UPPER_ALARM_TEMPERATURE_LOWER_RANGE: F32 = 99f
  val UPPER_ALARM_TEMPERATURE_UPPER_RANGE: F32 = 103f
  */

  // upper alarm temperature: 99..103 (Table A-5)
  //    97..102 (Table A-12)  ..ToDo: why are these numbers different than the ones above
  val DEFAULT_UPPER_ALARM_TEMPERATURE: F32 = 101f // [97..102]
  val UPPER_ALARM_TEMPERATURE_LOWER_RANGE: F32 = 97f // used by operator interface
  val UPPER_ALARM_TEMPERATURE_UPPER_RANGE: F32 = 102f //used by operator interface


  val DEFAULT_MONITOR_STATUS: Isolette_Data_Model.Status.Type = Isolette_Data_Model.Status.Init_Status
  val DEFAULT_MONITOR_INTERNAL_FAILURE_FLAG: B = false
  val DEFAULT_MONITOR_INTERFACE_FAILURE_FLAG: B = false
}