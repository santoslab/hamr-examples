// #Sireum

package isolette

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Heat.scala

Interface_Interaction.scala

PhysicalTemp_impl.scala

ValueStatus.scala

TempWstatus_impl.scala

On_Off.scala

Status.scala

Temp_impl.scala

Regulator_Mode.scala

Failure_Flag_impl.scala

Monitor_Mode.scala

Base_Types.scala

Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface__Containers.scala

Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source__Containers.scala

Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode__Containers.scala

Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure__Containers.scala

Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface__Containers.scala

Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm__Containers.scala

Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode__Containers.scala

Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure__Containers.scala

operator_interface_thread_impl_operator_interface_oip_oit__Containers.scala

Temperature_Sensor_impl_temperature_sensor_cpi_thermostat__Containers.scala

Heat_Source_impl_heat_source_cpi_heat_controller__Containers.scala

ObservationKind.scala

DataContent.scala

Aux_Types.scala

*/

@msig trait RandomLibI {
  def gen: org.sireum.Random.Gen

  def get_numElement: Z
  def set_numElement(s: Z): Unit

  // ========  Z ==========
    def get_Config_Z: Config_Z
    def set_Config_Z(config: Config_Z): RandomLib

    def nextZ(): Z = {
      val conf = get_Config_Z

      var r: Z = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextZ()
          else
            gen.nextZBetween(S64.Min.toZ, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextZBetween(conf.low.get, S64.Max.toZ)
          else
            gen.nextZBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_Z.attempts >= 0) {
       for (i <- 0 to get_Config_Z.attempts) {
         if (get_Config_Z.filter(r)) {
           return r
         }
         if (get_Config_Z.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextZ()
           else
              gen.nextZBetween(S64.Min.toZ, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextZBetween(conf.low.get, S64.Max.toZ)
            else
             gen.nextZBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_Z.filter(r)) {
           return r
         }
         if (get_Config_Z.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextZ()
           else
              gen.nextZBetween(S64.Min.toZ, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextZBetween(conf.low.get, S64.Max.toZ)
            else
             gen.nextZBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  B ==========}
    def get_Config_B: Config_B
    def set_Config_B(config: Config_B): RandomLib

    def nextB(): B = {
      var r = gen.nextB()
      if(get_Config_B.attempts >= 0) {
       for (i <- 0 to get_Config_B.attempts) {
         if (get_Config_B.filter(r)) {
           return r
         }
         if (get_Config_B.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextB()
       }
      } else {
       while(T) {
         if (get_Config_B.filter(r)) {
           return r
         }
         if (get_Config_B.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextB()
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  C ==========
    def get_Config_C: Config_C
    def set_Config_C(config: Config_C): RandomLib

    def nextC(): C = {
      val conf = get_Config_C

      var r: C = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextC()
          else
            gen.nextCBetween(C.fromZ(0), conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextCBetween(conf.low.get, C.fromZ(1114111))
          else
            gen.nextCBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_C.attempts >= 0) {
       for (i <- 0 to get_Config_C.attempts) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextC()
           else
              gen.nextCBetween(C.fromZ(0), conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextCBetween(conf.low.get, C.fromZ(1114111))
            else
             gen.nextCBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextC()
           else
              gen.nextCBetween(C.fromZ(0), conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextCBetween(conf.low.get, C.fromZ(1114111))
            else
             gen.nextCBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  R ==========
    def get_Config_R: Config_R
    def set_Config_R(config: Config_R): RandomLib

    def nextR(): R = {
      val conf = get_Config_R

      var r: R = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextR()
          else
            gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
          else
            gen.nextRBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_R.attempts >= 0) {
       for (i <- 0 to get_Config_R.attempts) {
         if (get_Config_R.filter(r)) {
           return r
         }
         if (get_Config_R.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextR()
           else
              gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
            else
             gen.nextRBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_R.filter(r)) {
           return r
         }
         if (get_Config_R.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextR()
           else
              gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
            else
             gen.nextRBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  F32 ==========
    def get_Config_F32: Config_F32
    def set_Config_F32(config: Config_F32): RandomLib

    def nextF32(): F32 = {
      val conf = get_Config_F32

      var r: F32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextF32()
          else
            gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
          else
            gen.nextF32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_F32.attempts >= 0) {
       for (i <- 0 to get_Config_F32.attempts) {
         if (get_Config_F32.filter(r)) {
           return r
         }
         if (get_Config_F32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF32()
           else
              gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
            else
             gen.nextF32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_F32.filter(r)) {
           return r
         }
         if (get_Config_F32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF32()
           else
              gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
            else
             gen.nextF32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  F64 ==========
    def get_Config_F64: Config_F64
    def set_Config_F64(config: Config_F64): RandomLib

    def nextF64(): F64 = {
      val conf = get_Config_F64

      var r: F64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextF64()
          else
            gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
          else
            gen.nextF64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_F64.attempts >= 0) {
       for (i <- 0 to get_Config_F64.attempts) {
         if (get_Config_F64.filter(r)) {
           return r
         }
         if (get_Config_F64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF64()
           else
              gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
            else
             gen.nextF64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_F64.filter(r)) {
           return r
         }
         if (get_Config_F64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF64()
           else
              gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
            else
             gen.nextF64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S8 ==========
    def get_Config_S8: Config_S8
    def set_Config_S8(config: Config_S8): RandomLib

    def nextS8(): S8 = {
      val conf = get_Config_S8

      var r: S8 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS8()
          else
            gen.nextS8Between(S8.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS8Between(conf.low.get, S8.Max)
          else
            gen.nextS8Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S8.attempts >= 0) {
       for (i <- 0 to get_Config_S8.attempts) {
         if (get_Config_S8.filter(r)) {
           return r
         }
         if (get_Config_S8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS8()
           else
              gen.nextS8Between(S8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS8Between(conf.low.get, S8.Max)
            else
             gen.nextS8Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S8.filter(r)) {
           return r
         }
         if (get_Config_S8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS8()
           else
              gen.nextS8Between(S8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS8Between(conf.low.get, S8.Max)
            else
             gen.nextS8Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S16 ==========
    def get_Config_S16: Config_S16
    def set_Config_S16(config: Config_S16): RandomLib

    def nextS16(): S16 = {
      val conf = get_Config_S16

      var r: S16 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS16()
          else
            gen.nextS16Between(S16.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS16Between(conf.low.get, S16.Max)
          else
            gen.nextS16Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S16.attempts >= 0) {
       for (i <- 0 to get_Config_S16.attempts) {
         if (get_Config_S16.filter(r)) {
           return r
         }
         if (get_Config_S16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS16()
           else
              gen.nextS16Between(S16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS16Between(conf.low.get, S16.Max)
            else
             gen.nextS16Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S16.filter(r)) {
           return r
         }
         if (get_Config_S16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS16()
           else
              gen.nextS16Between(S16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS16Between(conf.low.get, S16.Max)
            else
             gen.nextS16Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S32 ==========
    def get_Config_S32: Config_S32
    def set_Config_S32(config: Config_S32): RandomLib

    def nextS32(): S32 = {
      val conf = get_Config_S32

      var r: S32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS32()
          else
            gen.nextS32Between(S32.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS32Between(conf.low.get, S32.Max)
          else
            gen.nextS32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S32.attempts >= 0) {
       for (i <- 0 to get_Config_S32.attempts) {
         if (get_Config_S32.filter(r)) {
           return r
         }
         if (get_Config_S32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS32()
           else
              gen.nextS32Between(S32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS32Between(conf.low.get, S32.Max)
            else
             gen.nextS32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S32.filter(r)) {
           return r
         }
         if (get_Config_S32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS32()
           else
              gen.nextS32Between(S32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS32Between(conf.low.get, S32.Max)
            else
             gen.nextS32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S64 ==========
    def get_Config_S64: Config_S64
    def set_Config_S64(config: Config_S64): RandomLib

    def nextS64(): S64 = {
      val conf = get_Config_S64

      var r: S64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS64()
          else
            gen.nextS64Between(S64.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS64Between(conf.low.get, S64.Max)
          else
            gen.nextS64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S64.attempts >= 0) {
       for (i <- 0 to get_Config_S64.attempts) {
         if (get_Config_S64.filter(r)) {
           return r
         }
         if (get_Config_S64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS64()
           else
              gen.nextS64Between(S64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS64Between(conf.low.get, S64.Max)
            else
             gen.nextS64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S64.filter(r)) {
           return r
         }
         if (get_Config_S64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS64()
           else
              gen.nextS64Between(S64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS64Between(conf.low.get, S64.Max)
            else
             gen.nextS64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U8 ==========
    def get_Config_U8: Config_U8
    def set_Config_U8(config: Config_U8): RandomLib

    def nextU8(): U8 = {
      val conf = get_Config_U8

      var r: U8 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU8()
          else
            gen.nextU8Between(U8.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU8Between(conf.low.get, U8.Max)
          else
            gen.nextU8Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U8.attempts >= 0) {
       for (i <- 0 to get_Config_U8.attempts) {
         if (get_Config_U8.filter(r)) {
           return r
         }
         if (get_Config_U8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU8()
           else
              gen.nextU8Between(U8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU8Between(conf.low.get, U8.Max)
            else
             gen.nextU8Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U8.filter(r)) {
           return r
         }
         if (get_Config_U8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU8()
           else
              gen.nextU8Between(U8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU8Between(conf.low.get, U8.Max)
            else
             gen.nextU8Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U16 ==========
    def get_Config_U16: Config_U16
    def set_Config_U16(config: Config_U16): RandomLib

    def nextU16(): U16 = {
      val conf = get_Config_U16

      var r: U16 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU16()
          else
            gen.nextU16Between(U16.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU16Between(conf.low.get, U16.Max)
          else
            gen.nextU16Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U16.attempts >= 0) {
       for (i <- 0 to get_Config_U16.attempts) {
         if (get_Config_U16.filter(r)) {
           return r
         }
         if (get_Config_U16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU16()
           else
              gen.nextU16Between(U16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU16Between(conf.low.get, U16.Max)
            else
             gen.nextU16Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U16.filter(r)) {
           return r
         }
         if (get_Config_U16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU16()
           else
              gen.nextU16Between(U16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU16Between(conf.low.get, U16.Max)
            else
             gen.nextU16Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U32 ==========
    def get_Config_U32: Config_U32
    def set_Config_U32(config: Config_U32): RandomLib

    def nextU32(): U32 = {
      val conf = get_Config_U32

      var r: U32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU32()
          else
            gen.nextU32Between(U32.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU32Between(conf.low.get, U32.Max)
          else
            gen.nextU32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U32.attempts >= 0) {
       for (i <- 0 to get_Config_U32.attempts) {
         if (get_Config_U32.filter(r)) {
           return r
         }
         if (get_Config_U32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU32()
           else
              gen.nextU32Between(U32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU32Between(conf.low.get, U32.Max)
            else
             gen.nextU32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U32.filter(r)) {
           return r
         }
         if (get_Config_U32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU32()
           else
              gen.nextU32Between(U32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU32Between(conf.low.get, U32.Max)
            else
             gen.nextU32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U64 ==========
    def get_Config_U64: Config_U64
    def set_Config_U64(config: Config_U64): RandomLib

    def nextU64(): U64 = {
      val conf = get_Config_U64

      var r: U64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU64()
          else
            gen.nextU64Between(U64.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU64Between(conf.low.get, U64.Max)
          else
            gen.nextU64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U64.attempts >= 0) {
       for (i <- 0 to get_Config_U64.attempts) {
         if (get_Config_U64.filter(r)) {
           return r
         }
         if (get_Config_U64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU64()
           else
              gen.nextU64Between(U64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU64Between(conf.low.get, U64.Max)
            else
             gen.nextU64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U64.filter(r)) {
           return r
         }
         if (get_Config_U64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU64()
           else
              gen.nextU64Between(U64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU64Between(conf.low.get, U64.Max)
            else
             gen.nextU64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ============= String ===================

  def get_Config_String: Config_String
  def set_Config_String(config: Config_String): RandomLib

  def nextString(): String = {

    var length: Z = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
    var str: String = ""
    for(r <- 0 until length){
      str = s"${str}${nextC().string}"
    }

    if(get_Config_String.attempts >= 0) {
      for (i <- 0 to get_Config_String.attempts) {
        if(get_Config_String.filter(str)) {
          return str
        }
        if(get_Config_String.verbose) {
          println(s"Retrying for failing value: $str")
        }

        length = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
        str = ""
        for (r <- 0 until length) {
          str = s"${str}${nextC().string}"
        }
      }
    } else {
      while(T) {
        if (get_Config_String.filter(str)) {
          return str
        }
        if (get_Config_String.verbose) {
          println(s"Retrying for failing value: $str")
        }

        length = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
        str = ""
        for (r <- 0 until length) {
          str = s"${str}${nextC().string}"
        }
      }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= runtimemonitor.ObservationKind.Type ===================

  def get_Config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType
  def set_Config_runtimemonitorObservationKindType(config: Config_runtimemonitorObservationKindType): RandomLib

  def nextruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.runtimemonitor.ObservationKind.numOfElements-1)

    var v: runtimemonitor.ObservationKind.Type = isolette.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
    if(get_Config_runtimemonitorObservationKindType.attempts >= 0) {
     for(i <- 0 to get_Config_runtimemonitorObservationKindType.attempts) {
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.runtimemonitor.ObservationKind.numOfElements-1)
       v = isolette.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.runtimemonitor.ObservationKind.numOfElements-1)
       v = isolette.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.DataContent ===================

  def get_Config__artDataContent: Config__artDataContent
  def set_Config__artDataContent(config: Config__artDataContent): RandomLib

  def next_artDataContent(): art.DataContent = {
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id, _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id, _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id, _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id, _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id, _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id, _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id, _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id, _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id, _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id, _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id, _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id, _artDataContent_DataTypeId.Isolette_Data_ModelFailure_Flag_impl_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelMonitor_Mode_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelOn_Off_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelPhysicalTemp_impl_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelRegulator_Mode_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelStatus_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelTempWstatus_impl_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelTemp_impl_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelValueStatus_Payload_Id, _artDataContent_DataTypeId.Isolette_EnvironmentHeat_Payload_Id, _artDataContent_DataTypeId.Isolette_EnvironmentInterface_Interaction_Payload_Id, _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id, _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id, _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id, _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id, _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id, _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id, _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id, _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id, _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id, _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id, _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id, _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id, _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id, _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id, _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id, _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id, _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id, _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id, _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id, _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id, _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id, _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id, _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id, _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id, _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id, _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id, _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id, _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id, _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id, _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id, _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id, _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id)

    if(get_Config__artDataContent.additiveTypeFiltering) {
       callEnum = get_Config__artDataContent.typeFilter
    } else {
       for(h <- get_Config__artDataContent.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: art.DataContent = c match {
      case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
      case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
      case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelFailure_Flag_impl_Payload_Id => (nextIsolette_Data_ModelFailure_Flag_impl_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelMonitor_Mode_Payload_Id => (nextIsolette_Data_ModelMonitor_Mode_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelOn_Off_Payload_Id => (nextIsolette_Data_ModelOn_Off_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelPhysicalTemp_impl_Payload_Id => (nextIsolette_Data_ModelPhysicalTemp_impl_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelRegulator_Mode_Payload_Id => (nextIsolette_Data_ModelRegulator_Mode_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelStatus_Payload_Id => (nextIsolette_Data_ModelStatus_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelTempWstatus_impl_Payload_Id => (nextIsolette_Data_ModelTempWstatus_impl_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelTemp_impl_Payload_Id => (nextIsolette_Data_ModelTemp_impl_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_Data_ModelValueStatus_Payload_Id => (nextIsolette_Data_ModelValueStatus_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_EnvironmentHeat_Payload_Id => (nextIsolette_EnvironmentHeat_Payload _).apply()
      case _artDataContent_DataTypeId.Isolette_EnvironmentInterface_Interaction_Payload_Id => (nextIsolette_EnvironmentInterface_Interaction_Payload _).apply()
      case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config__artDataContent.attempts >= 0) {
     for(i <- 0 to get_Config__artDataContent.attempts) {
       if(get_Config__artDataContent.filter(v)) {
        return v
       }
       if (get_Config__artDataContent.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
         case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
         case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelFailure_Flag_impl_Payload_Id => (nextIsolette_Data_ModelFailure_Flag_impl_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelMonitor_Mode_Payload_Id => (nextIsolette_Data_ModelMonitor_Mode_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelOn_Off_Payload_Id => (nextIsolette_Data_ModelOn_Off_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelPhysicalTemp_impl_Payload_Id => (nextIsolette_Data_ModelPhysicalTemp_impl_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelRegulator_Mode_Payload_Id => (nextIsolette_Data_ModelRegulator_Mode_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelStatus_Payload_Id => (nextIsolette_Data_ModelStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelTempWstatus_impl_Payload_Id => (nextIsolette_Data_ModelTempWstatus_impl_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelTemp_impl_Payload_Id => (nextIsolette_Data_ModelTemp_impl_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelValueStatus_Payload_Id => (nextIsolette_Data_ModelValueStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_EnvironmentHeat_Payload_Id => (nextIsolette_EnvironmentHeat_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_EnvironmentInterface_Interaction_Payload_Id => (nextIsolette_EnvironmentInterface_Interaction_Payload _).apply()
         case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config__artDataContent.filter(v)) {
         return v
       }
       if (get_Config__artDataContent.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
         case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
         case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelFailure_Flag_impl_Payload_Id => (nextIsolette_Data_ModelFailure_Flag_impl_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelMonitor_Mode_Payload_Id => (nextIsolette_Data_ModelMonitor_Mode_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelOn_Off_Payload_Id => (nextIsolette_Data_ModelOn_Off_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelPhysicalTemp_impl_Payload_Id => (nextIsolette_Data_ModelPhysicalTemp_impl_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelRegulator_Mode_Payload_Id => (nextIsolette_Data_ModelRegulator_Mode_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelStatus_Payload_Id => (nextIsolette_Data_ModelStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelTempWstatus_impl_Payload_Id => (nextIsolette_Data_ModelTempWstatus_impl_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelTemp_impl_Payload_Id => (nextIsolette_Data_ModelTemp_impl_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_Data_ModelValueStatus_Payload_Id => (nextIsolette_Data_ModelValueStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_EnvironmentHeat_Payload_Id => (nextIsolette_EnvironmentHeat_Payload _).apply()
         case _artDataContent_DataTypeId.Isolette_EnvironmentInterface_Interaction_Payload_Id => (nextIsolette_EnvironmentInterface_Interaction_Payload _).apply()
         case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.Empty ===================

  def get_Config__artEmpty: Config__artEmpty
  def set_Config__artEmpty(config: Config__artEmpty): RandomLib

  def next_artEmpty(): art.Empty = {

    var v: art.Empty = art.Empty()

    if(get_Config__artEmpty.attempts >= 0) {
     for(i <- 0 to get_Config__artEmpty.attempts) {
        if(get_Config__artEmpty.filter(v)) {
          return v
        }
        if (get_Config__artEmpty.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = art.Empty()
     }
    } else {
     while(T) {
       if(get_Config__artEmpty.filter(v)) {
         return v
       }
       if (get_Config__artEmpty.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = art.Empty()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Boolean_Payload ===================

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload
  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): RandomLib

  def nextBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
    var value: B = nextB()

    var v: Base_Types.Boolean_Payload = Base_Types.Boolean_Payload(value)

    if(get_Config_Base_TypesBoolean_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBoolean_Payload.attempts) {
        if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesBoolean_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextB()
        v = Base_Types.Boolean_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesBoolean_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextB()
       v = Base_Types.Boolean_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_Payload ===================

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload
  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): RandomLib

  def nextBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
    var value: Z = nextZ()

    var v: Base_Types.Integer_Payload = Base_Types.Integer_Payload(value)

    if(get_Config_Base_TypesInteger_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_Payload.attempts) {
        if(get_Config_Base_TypesInteger_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextZ()
        v = Base_Types.Integer_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextZ()
       v = Base_Types.Integer_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_8_Payload ===================

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload
  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): RandomLib

  def nextBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
    var value: S8 = nextS8()

    var v: Base_Types.Integer_8_Payload = Base_Types.Integer_8_Payload(value)

    if(get_Config_Base_TypesInteger_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_8_Payload.attempts) {
        if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_8_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS8()
        v = Base_Types.Integer_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_8_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS8()
       v = Base_Types.Integer_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_16_Payload ===================

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload
  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): RandomLib

  def nextBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
    var value: S16 = nextS16()

    var v: Base_Types.Integer_16_Payload = Base_Types.Integer_16_Payload(value)

    if(get_Config_Base_TypesInteger_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_16_Payload.attempts) {
        if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_16_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS16()
        v = Base_Types.Integer_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_16_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS16()
       v = Base_Types.Integer_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_32_Payload ===================

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload
  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): RandomLib

  def nextBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
    var value: S32 = nextS32()

    var v: Base_Types.Integer_32_Payload = Base_Types.Integer_32_Payload(value)

    if(get_Config_Base_TypesInteger_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_32_Payload.attempts) {
        if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS32()
        v = Base_Types.Integer_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS32()
       v = Base_Types.Integer_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_64_Payload ===================

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload
  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): RandomLib

  def nextBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
    var value: S64 = nextS64()

    var v: Base_Types.Integer_64_Payload = Base_Types.Integer_64_Payload(value)

    if(get_Config_Base_TypesInteger_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_64_Payload.attempts) {
        if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS64()
        v = Base_Types.Integer_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS64()
       v = Base_Types.Integer_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_8_Payload ===================

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload
  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): RandomLib

  def nextBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
    var value: U8 = nextU8()

    var v: Base_Types.Unsigned_8_Payload = Base_Types.Unsigned_8_Payload(value)

    if(get_Config_Base_TypesUnsigned_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_8_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_8_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU8()
        v = Base_Types.Unsigned_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_8_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU8()
       v = Base_Types.Unsigned_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_16_Payload ===================

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload
  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): RandomLib

  def nextBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
    var value: U16 = nextU16()

    var v: Base_Types.Unsigned_16_Payload = Base_Types.Unsigned_16_Payload(value)

    if(get_Config_Base_TypesUnsigned_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_16_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_16_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU16()
        v = Base_Types.Unsigned_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_16_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU16()
       v = Base_Types.Unsigned_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_32_Payload ===================

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload
  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): RandomLib

  def nextBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
    var value: U32 = nextU32()

    var v: Base_Types.Unsigned_32_Payload = Base_Types.Unsigned_32_Payload(value)

    if(get_Config_Base_TypesUnsigned_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_32_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU32()
        v = Base_Types.Unsigned_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU32()
       v = Base_Types.Unsigned_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_64_Payload ===================

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload
  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): RandomLib

  def nextBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
    var value: U64 = nextU64()

    var v: Base_Types.Unsigned_64_Payload = Base_Types.Unsigned_64_Payload(value)

    if(get_Config_Base_TypesUnsigned_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_64_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU64()
        v = Base_Types.Unsigned_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU64()
       v = Base_Types.Unsigned_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_Payload ===================

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload
  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): RandomLib

  def nextBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
    var value: R = nextR()

    var v: Base_Types.Float_Payload = Base_Types.Float_Payload(value)

    if(get_Config_Base_TypesFloat_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_Payload.attempts) {
        if(get_Config_Base_TypesFloat_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextR()
        v = Base_Types.Float_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextR()
       v = Base_Types.Float_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_32_Payload ===================

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload
  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): RandomLib

  def nextBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
    var value: F32 = nextF32()

    var v: Base_Types.Float_32_Payload = Base_Types.Float_32_Payload(value)

    if(get_Config_Base_TypesFloat_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_32_Payload.attempts) {
        if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF32()
        v = Base_Types.Float_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF32()
       v = Base_Types.Float_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_64_Payload ===================

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload
  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): RandomLib

  def nextBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
    var value: F64 = nextF64()

    var v: Base_Types.Float_64_Payload = Base_Types.Float_64_Payload(value)

    if(get_Config_Base_TypesFloat_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_64_Payload.attempts) {
        if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF64()
        v = Base_Types.Float_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF64()
       v = Base_Types.Float_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Character_Payload ===================

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload
  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): RandomLib

  def nextBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
    var value: C = nextC()

    var v: Base_Types.Character_Payload = Base_Types.Character_Payload(value)

    if(get_Config_Base_TypesCharacter_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesCharacter_Payload.attempts) {
        if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesCharacter_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextC()
        v = Base_Types.Character_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesCharacter_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextC()
       v = Base_Types.Character_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.String_Payload ===================

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload
  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): RandomLib

  def nextBase_TypesString_Payload(): Base_Types.String_Payload = {
    var value: String = nextString()

    var v: Base_Types.String_Payload = Base_Types.String_Payload(value)

    if(get_Config_Base_TypesString_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesString_Payload.attempts) {
        if(get_Config_Base_TypesString_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesString_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextString()
        v = Base_Types.String_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesString_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesString_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextString()
       v = Base_Types.String_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Bits_Payload ===================

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload
  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): RandomLib

  def nextBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
    var value: ISZ[B] = nextISZB()

    var v: Base_Types.Bits_Payload = Base_Types.Bits_Payload(value)

    if(get_Config_Base_TypesBits_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBits_Payload.attempts) {
        if(get_Config_Base_TypesBits_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesBits_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextISZB()
        v = Base_Types.Bits_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBits_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesBits_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextISZB()
       v = Base_Types.Bits_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container ===================

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container
  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container): RandomLib

  def nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container(): Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container = {
    var callEnum: ISZ[DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.Type] = ISZ(DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id, DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id)

    if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container = c match {
      case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P _).apply()
      case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.attempts) {
       if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P _).apply()
         case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P _).apply()
         case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P ===================

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P
  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P): RandomLib

  def nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P(): Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P = {
    var api_heat_control: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()

    var v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P(api_heat_control)

    if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P.attempts) {
        if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_heat_control = nextIsolette_Data_ModelOn_OffType()
        v = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P(api_heat_control)
     }
    } else {
     while(T) {
       if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_heat_control = nextIsolette_Data_ModelOn_OffType()
       v = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P(api_heat_control)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS ===================

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS
  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS): RandomLib

  def nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS(): Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS = {
    var api_heat_control: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()

    var v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS(api_heat_control)

    if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS.attempts) {
        if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_heat_control = nextIsolette_Data_ModelOn_OffType()
        v = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS(api_heat_control)
     }
    } else {
     while(T) {
       if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_heat_control = nextIsolette_Data_ModelOn_OffType()
       v = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS(api_heat_control)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container ===================

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container
  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container): RandomLib

  def nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container(): Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container = {
    var callEnum: ISZ[DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.Type] = ISZ(DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id, DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id)

    if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container = c match {
      case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P _).apply()
      case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.attempts) {
       if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P _).apply()
         case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P _).apply()
         case DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId.DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id => (nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P ===================

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P
  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P): RandomLib

  def nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P(): Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P = {
    var api_heat_out: Isolette_Environment.Heat.Type = nextIsolette_EnvironmentHeatType()

    var v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P(api_heat_out)

    if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P.attempts) {
        if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_heat_out = nextIsolette_EnvironmentHeatType()
        v = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P(api_heat_out)
     }
    } else {
     while(T) {
       if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_heat_out = nextIsolette_EnvironmentHeatType()
       v = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P(api_heat_out)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS ===================

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS
  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS): RandomLib

  def nextDevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS(): Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS = {
    var api_heat_out: Isolette_Environment.Heat.Type = nextIsolette_EnvironmentHeatType()

    var v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS(api_heat_out)

    if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS.attempts) {
        if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_heat_out = nextIsolette_EnvironmentHeatType()
        v = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS(api_heat_out)
     }
    } else {
     while(T) {
       if(get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_heat_out = nextIsolette_EnvironmentHeatType()
       v = Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS(api_heat_out)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container ===================

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container
  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container): RandomLib

  def nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container(): Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container = {
    var callEnum: ISZ[DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.Type] = ISZ(DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id, DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id)

    if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container = c match {
      case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P _).apply()
      case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.attempts) {
       if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P _).apply()
         case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P _).apply()
         case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P ===================

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P
  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P): RandomLib

  def nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P(): Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P = {
    var api_air: Isolette_Data_Model.PhysicalTemp_impl = nextIsolette_Data_ModelPhysicalTemp_impl()

    var v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P(api_air)

    if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P.attempts) {
        if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_air = nextIsolette_Data_ModelPhysicalTemp_impl()
        v = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P(api_air)
     }
    } else {
     while(T) {
       if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_air = nextIsolette_Data_ModelPhysicalTemp_impl()
       v = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P(api_air)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS ===================

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS
  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS): RandomLib

  def nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS(): Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS = {
    var api_air: Isolette_Data_Model.PhysicalTemp_impl = nextIsolette_Data_ModelPhysicalTemp_impl()

    var v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS(api_air)

    if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS.attempts) {
        if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_air = nextIsolette_Data_ModelPhysicalTemp_impl()
        v = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS(api_air)
     }
    } else {
     while(T) {
       if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_air = nextIsolette_Data_ModelPhysicalTemp_impl()
       v = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS(api_air)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container ===================

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container
  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container): RandomLib

  def nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container(): Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container = {
    var callEnum: ISZ[DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.Type] = ISZ(DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id, DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id)

    if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container = c match {
      case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P _).apply()
      case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.attempts) {
       if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P _).apply()
         case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P _).apply()
         case DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId.DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id => (nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P ===================

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P
  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P): RandomLib

  def nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P(): Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P(api_current_tempWstatus)

    if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P.attempts) {
        if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P(api_current_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P(api_current_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS ===================

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS
  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS): RandomLib

  def nextDevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS(): Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS(api_current_tempWstatus)

    if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS.attempts) {
        if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS(api_current_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS(api_current_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container ===================

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container
  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container): RandomLib

  def nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container(): Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container = {
    var callEnum: ISZ[Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Type] = ISZ(Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id, Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id)

    if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container = c match {
      case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P _).apply()
      case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.attempts) {
       if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P _).apply()
         case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P _).apply()
         case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P ===================

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P
  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P): RandomLib

  def nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P(): Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P = {
    var api_alarm_control: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_display_temperature: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_monitor_status: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()
    var api_regulator_status: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()

    var v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P(api_alarm_control, api_display_temperature, api_monitor_status, api_regulator_status)

    if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P.attempts) {
        if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_alarm_control = nextIsolette_Data_ModelOn_OffType()
        api_display_temperature = nextIsolette_Data_ModelTemp_impl()
        api_monitor_status = nextIsolette_Data_ModelStatusType()
        api_regulator_status = nextIsolette_Data_ModelStatusType()
        v = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P(api_alarm_control, api_display_temperature, api_monitor_status, api_regulator_status)
     }
    } else {
     while(T) {
       if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_alarm_control = nextIsolette_Data_ModelOn_OffType()
       api_display_temperature = nextIsolette_Data_ModelTemp_impl()
       api_monitor_status = nextIsolette_Data_ModelStatusType()
       api_regulator_status = nextIsolette_Data_ModelStatusType()
       v = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P(api_alarm_control, api_display_temperature, api_monitor_status, api_regulator_status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS ===================

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS
  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS): RandomLib

  def nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS(): Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS = {
    var api_alarm_control: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_display_temperature: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_monitor_status: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()
    var api_regulator_status: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()

    var v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS(api_alarm_control, api_display_temperature, api_monitor_status, api_regulator_status)

    if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS.attempts) {
        if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_alarm_control = nextIsolette_Data_ModelOn_OffType()
        api_display_temperature = nextIsolette_Data_ModelTemp_impl()
        api_monitor_status = nextIsolette_Data_ModelStatusType()
        api_regulator_status = nextIsolette_Data_ModelStatusType()
        v = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS(api_alarm_control, api_display_temperature, api_monitor_status, api_regulator_status)
     }
    } else {
     while(T) {
       if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_alarm_control = nextIsolette_Data_ModelOn_OffType()
       api_display_temperature = nextIsolette_Data_ModelTemp_impl()
       api_monitor_status = nextIsolette_Data_ModelStatusType()
       api_regulator_status = nextIsolette_Data_ModelStatusType()
       v = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS(api_alarm_control, api_display_temperature, api_monitor_status, api_regulator_status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container ===================

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container
  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container): RandomLib

  def nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container(): Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container = {
    var callEnum: ISZ[Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Type] = ISZ(Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id, Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id)

    if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container = c match {
      case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P _).apply()
      case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.attempts) {
       if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P _).apply()
         case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P _).apply()
         case Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId.Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id => (nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P ===================

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P
  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P): RandomLib

  def nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P(): Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P = {
    var api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P(api_lower_alarm_tempWstatus, api_lower_desired_tempWstatus, api_upper_alarm_tempWstatus, api_upper_desired_tempWstatus)

    if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P.attempts) {
        if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P(api_lower_alarm_tempWstatus, api_lower_desired_tempWstatus, api_upper_alarm_tempWstatus, api_upper_desired_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P(api_lower_alarm_tempWstatus, api_lower_desired_tempWstatus, api_upper_alarm_tempWstatus, api_upper_desired_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS ===================

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS
  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS): RandomLib

  def nextIsoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS(): Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS = {
    var api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS(api_lower_alarm_tempWstatus, api_lower_desired_tempWstatus, api_upper_alarm_tempWstatus, api_upper_desired_tempWstatus)

    if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS.attempts) {
        if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS(api_lower_alarm_tempWstatus, api_lower_desired_tempWstatus, api_upper_alarm_tempWstatus, api_upper_desired_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS(api_lower_alarm_tempWstatus, api_lower_desired_tempWstatus, api_upper_alarm_tempWstatus, api_upper_desired_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl ===================

  def get_Config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl
  def set_Config_Isolette_Data_ModelFailure_Flag_impl(config: Config_Isolette_Data_ModelFailure_Flag_impl): RandomLib

  def nextIsolette_Data_ModelFailure_Flag_impl(): Isolette_Data_Model.Failure_Flag_impl = {
    var value: B = nextB()

    var v: Isolette_Data_Model.Failure_Flag_impl = Isolette_Data_Model.Failure_Flag_impl(value)

    if(get_Config_Isolette_Data_ModelFailure_Flag_impl.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelFailure_Flag_impl.attempts) {
        if(get_Config_Isolette_Data_ModelFailure_Flag_impl.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelFailure_Flag_impl.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextB()
        v = Isolette_Data_Model.Failure_Flag_impl(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelFailure_Flag_impl.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelFailure_Flag_impl.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextB()
       v = Isolette_Data_Model.Failure_Flag_impl(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl_Payload ===================

  def get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload
  def set_Config_Isolette_Data_ModelFailure_Flag_impl_Payload(config: Config_Isolette_Data_ModelFailure_Flag_impl_Payload): RandomLib

  def nextIsolette_Data_ModelFailure_Flag_impl_Payload(): Isolette_Data_Model.Failure_Flag_impl_Payload = {
    var value: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Isolette_Data_Model.Failure_Flag_impl_Payload = Isolette_Data_Model.Failure_Flag_impl_Payload(value)

    if(get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Isolette_Data_Model.Failure_Flag_impl_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Isolette_Data_Model.Failure_Flag_impl_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Monitor_Mode.Type ===================

  def get_Config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType
  def set_Config_Isolette_Data_ModelMonitor_ModeType(config: Config_Isolette_Data_ModelMonitor_ModeType): RandomLib

  def nextIsolette_Data_ModelMonitor_ModeType(): Isolette_Data_Model.Monitor_Mode.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Monitor_Mode.numOfElements-1)

    var v: Isolette_Data_Model.Monitor_Mode.Type = isolette.Isolette_Data_Model.Monitor_Mode.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelMonitor_ModeType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelMonitor_ModeType.attempts) {
       if(get_Config_Isolette_Data_ModelMonitor_ModeType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelMonitor_ModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Monitor_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Monitor_Mode.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelMonitor_ModeType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelMonitor_ModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Monitor_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Monitor_Mode.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Monitor_Mode_Payload ===================

  def get_Config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload
  def set_Config_Isolette_Data_ModelMonitor_Mode_Payload(config: Config_Isolette_Data_ModelMonitor_Mode_Payload): RandomLib

  def nextIsolette_Data_ModelMonitor_Mode_Payload(): Isolette_Data_Model.Monitor_Mode_Payload = {
    var value: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()

    var v: Isolette_Data_Model.Monitor_Mode_Payload = Isolette_Data_Model.Monitor_Mode_Payload(value)

    if(get_Config_Isolette_Data_ModelMonitor_Mode_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelMonitor_Mode_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelMonitor_Mode_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelMonitor_Mode_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelMonitor_ModeType()
        v = Isolette_Data_Model.Monitor_Mode_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelMonitor_Mode_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelMonitor_Mode_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelMonitor_ModeType()
       v = Isolette_Data_Model.Monitor_Mode_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.On_Off.Type ===================

  def get_Config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType
  def set_Config_Isolette_Data_ModelOn_OffType(config: Config_Isolette_Data_ModelOn_OffType): RandomLib

  def nextIsolette_Data_ModelOn_OffType(): Isolette_Data_Model.On_Off.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.On_Off.numOfElements-1)

    var v: Isolette_Data_Model.On_Off.Type = isolette.Isolette_Data_Model.On_Off.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelOn_OffType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelOn_OffType.attempts) {
       if(get_Config_Isolette_Data_ModelOn_OffType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelOn_OffType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.On_Off.numOfElements-1)
       v = isolette.Isolette_Data_Model.On_Off.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelOn_OffType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelOn_OffType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.On_Off.numOfElements-1)
       v = isolette.Isolette_Data_Model.On_Off.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.On_Off_Payload ===================

  def get_Config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload
  def set_Config_Isolette_Data_ModelOn_Off_Payload(config: Config_Isolette_Data_ModelOn_Off_Payload): RandomLib

  def nextIsolette_Data_ModelOn_Off_Payload(): Isolette_Data_Model.On_Off_Payload = {
    var value: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()

    var v: Isolette_Data_Model.On_Off_Payload = Isolette_Data_Model.On_Off_Payload(value)

    if(get_Config_Isolette_Data_ModelOn_Off_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelOn_Off_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelOn_Off_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelOn_Off_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelOn_OffType()
        v = Isolette_Data_Model.On_Off_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelOn_Off_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelOn_Off_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelOn_OffType()
       v = Isolette_Data_Model.On_Off_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl ===================

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl
  def set_Config_Isolette_Data_ModelPhysicalTemp_impl(config: Config_Isolette_Data_ModelPhysicalTemp_impl): RandomLib

  def nextIsolette_Data_ModelPhysicalTemp_impl(): Isolette_Data_Model.PhysicalTemp_impl = {
    var value: F32 = nextF32()

    var v: Isolette_Data_Model.PhysicalTemp_impl = Isolette_Data_Model.PhysicalTemp_impl(value)

    if(get_Config_Isolette_Data_ModelPhysicalTemp_impl.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelPhysicalTemp_impl.attempts) {
        if(get_Config_Isolette_Data_ModelPhysicalTemp_impl.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelPhysicalTemp_impl.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF32()
        v = Isolette_Data_Model.PhysicalTemp_impl(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelPhysicalTemp_impl.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelPhysicalTemp_impl.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF32()
       v = Isolette_Data_Model.PhysicalTemp_impl(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl_Payload ===================

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload
  def set_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(config: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload): RandomLib

  def nextIsolette_Data_ModelPhysicalTemp_impl_Payload(): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
    var value: Isolette_Data_Model.PhysicalTemp_impl = nextIsolette_Data_ModelPhysicalTemp_impl()

    var v: Isolette_Data_Model.PhysicalTemp_impl_Payload = Isolette_Data_Model.PhysicalTemp_impl_Payload(value)

    if(get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelPhysicalTemp_impl()
        v = Isolette_Data_Model.PhysicalTemp_impl_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelPhysicalTemp_impl()
       v = Isolette_Data_Model.PhysicalTemp_impl_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Regulator_Mode.Type ===================

  def get_Config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType
  def set_Config_Isolette_Data_ModelRegulator_ModeType(config: Config_Isolette_Data_ModelRegulator_ModeType): RandomLib

  def nextIsolette_Data_ModelRegulator_ModeType(): Isolette_Data_Model.Regulator_Mode.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Regulator_Mode.numOfElements-1)

    var v: Isolette_Data_Model.Regulator_Mode.Type = isolette.Isolette_Data_Model.Regulator_Mode.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelRegulator_ModeType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelRegulator_ModeType.attempts) {
       if(get_Config_Isolette_Data_ModelRegulator_ModeType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelRegulator_ModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Regulator_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Regulator_Mode.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelRegulator_ModeType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelRegulator_ModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Regulator_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Regulator_Mode.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Regulator_Mode_Payload ===================

  def get_Config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload
  def set_Config_Isolette_Data_ModelRegulator_Mode_Payload(config: Config_Isolette_Data_ModelRegulator_Mode_Payload): RandomLib

  def nextIsolette_Data_ModelRegulator_Mode_Payload(): Isolette_Data_Model.Regulator_Mode_Payload = {
    var value: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()

    var v: Isolette_Data_Model.Regulator_Mode_Payload = Isolette_Data_Model.Regulator_Mode_Payload(value)

    if(get_Config_Isolette_Data_ModelRegulator_Mode_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelRegulator_Mode_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelRegulator_Mode_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelRegulator_Mode_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelRegulator_ModeType()
        v = Isolette_Data_Model.Regulator_Mode_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelRegulator_Mode_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelRegulator_Mode_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelRegulator_ModeType()
       v = Isolette_Data_Model.Regulator_Mode_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Status.Type ===================

  def get_Config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType
  def set_Config_Isolette_Data_ModelStatusType(config: Config_Isolette_Data_ModelStatusType): RandomLib

  def nextIsolette_Data_ModelStatusType(): Isolette_Data_Model.Status.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Status.numOfElements-1)

    var v: Isolette_Data_Model.Status.Type = isolette.Isolette_Data_Model.Status.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelStatusType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelStatusType.attempts) {
       if(get_Config_Isolette_Data_ModelStatusType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Status.numOfElements-1)
       v = isolette.Isolette_Data_Model.Status.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelStatusType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Status.numOfElements-1)
       v = isolette.Isolette_Data_Model.Status.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Status_Payload ===================

  def get_Config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload
  def set_Config_Isolette_Data_ModelStatus_Payload(config: Config_Isolette_Data_ModelStatus_Payload): RandomLib

  def nextIsolette_Data_ModelStatus_Payload(): Isolette_Data_Model.Status_Payload = {
    var value: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()

    var v: Isolette_Data_Model.Status_Payload = Isolette_Data_Model.Status_Payload(value)

    if(get_Config_Isolette_Data_ModelStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelStatus_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelStatus_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelStatus_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelStatusType()
        v = Isolette_Data_Model.Status_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelStatus_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelStatus_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelStatusType()
       v = Isolette_Data_Model.Status_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.TempWstatus_impl ===================

  def get_Config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl
  def set_Config_Isolette_Data_ModelTempWstatus_impl(config: Config_Isolette_Data_ModelTempWstatus_impl): RandomLib

  def nextIsolette_Data_ModelTempWstatus_impl(): Isolette_Data_Model.TempWstatus_impl = {
    var value: F32 = nextF32()
    var status: Isolette_Data_Model.ValueStatus.Type = nextIsolette_Data_ModelValueStatusType()

    var v: Isolette_Data_Model.TempWstatus_impl = Isolette_Data_Model.TempWstatus_impl(value, status)

    if(get_Config_Isolette_Data_ModelTempWstatus_impl.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelTempWstatus_impl.attempts) {
        if(get_Config_Isolette_Data_ModelTempWstatus_impl.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelTempWstatus_impl.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF32()
        status = nextIsolette_Data_ModelValueStatusType()
        v = Isolette_Data_Model.TempWstatus_impl(value, status)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelTempWstatus_impl.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelTempWstatus_impl.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF32()
       status = nextIsolette_Data_ModelValueStatusType()
       v = Isolette_Data_Model.TempWstatus_impl(value, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.TempWstatus_impl_Payload ===================

  def get_Config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload
  def set_Config_Isolette_Data_ModelTempWstatus_impl_Payload(config: Config_Isolette_Data_ModelTempWstatus_impl_Payload): RandomLib

  def nextIsolette_Data_ModelTempWstatus_impl_Payload(): Isolette_Data_Model.TempWstatus_impl_Payload = {
    var value: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Isolette_Data_Model.TempWstatus_impl_Payload = Isolette_Data_Model.TempWstatus_impl_Payload(value)

    if(get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelTempWstatus_impl()
        v = Isolette_Data_Model.TempWstatus_impl_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelTempWstatus_impl()
       v = Isolette_Data_Model.TempWstatus_impl_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Temp_impl ===================

  def get_Config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl
  def set_Config_Isolette_Data_ModelTemp_impl(config: Config_Isolette_Data_ModelTemp_impl): RandomLib

  def nextIsolette_Data_ModelTemp_impl(): Isolette_Data_Model.Temp_impl = {
    var value: F32 = nextF32()

    var v: Isolette_Data_Model.Temp_impl = Isolette_Data_Model.Temp_impl(value)

    if(get_Config_Isolette_Data_ModelTemp_impl.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelTemp_impl.attempts) {
        if(get_Config_Isolette_Data_ModelTemp_impl.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelTemp_impl.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF32()
        v = Isolette_Data_Model.Temp_impl(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelTemp_impl.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelTemp_impl.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF32()
       v = Isolette_Data_Model.Temp_impl(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.Temp_impl_Payload ===================

  def get_Config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload
  def set_Config_Isolette_Data_ModelTemp_impl_Payload(config: Config_Isolette_Data_ModelTemp_impl_Payload): RandomLib

  def nextIsolette_Data_ModelTemp_impl_Payload(): Isolette_Data_Model.Temp_impl_Payload = {
    var value: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Isolette_Data_Model.Temp_impl_Payload = Isolette_Data_Model.Temp_impl_Payload(value)

    if(get_Config_Isolette_Data_ModelTemp_impl_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelTemp_impl_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelTemp_impl_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelTemp_impl_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelTemp_impl()
        v = Isolette_Data_Model.Temp_impl_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelTemp_impl_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelTemp_impl_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelTemp_impl()
       v = Isolette_Data_Model.Temp_impl_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.ValueStatus.Type ===================

  def get_Config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType
  def set_Config_Isolette_Data_ModelValueStatusType(config: Config_Isolette_Data_ModelValueStatusType): RandomLib

  def nextIsolette_Data_ModelValueStatusType(): Isolette_Data_Model.ValueStatus.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.ValueStatus.numOfElements-1)

    var v: Isolette_Data_Model.ValueStatus.Type = isolette.Isolette_Data_Model.ValueStatus.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelValueStatusType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelValueStatusType.attempts) {
       if(get_Config_Isolette_Data_ModelValueStatusType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelValueStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.ValueStatus.numOfElements-1)
       v = isolette.Isolette_Data_Model.ValueStatus.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelValueStatusType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_Data_ModelValueStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.ValueStatus.numOfElements-1)
       v = isolette.Isolette_Data_Model.ValueStatus.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Data_Model.ValueStatus_Payload ===================

  def get_Config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload
  def set_Config_Isolette_Data_ModelValueStatus_Payload(config: Config_Isolette_Data_ModelValueStatus_Payload): RandomLib

  def nextIsolette_Data_ModelValueStatus_Payload(): Isolette_Data_Model.ValueStatus_Payload = {
    var value: Isolette_Data_Model.ValueStatus.Type = nextIsolette_Data_ModelValueStatusType()

    var v: Isolette_Data_Model.ValueStatus_Payload = Isolette_Data_Model.ValueStatus_Payload(value)

    if(get_Config_Isolette_Data_ModelValueStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelValueStatus_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelValueStatus_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_Data_ModelValueStatus_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_Data_ModelValueStatusType()
        v = Isolette_Data_Model.ValueStatus_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelValueStatus_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_Data_ModelValueStatus_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_Data_ModelValueStatusType()
       v = Isolette_Data_Model.ValueStatus_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Environment.Heat.Type ===================

  def get_Config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType
  def set_Config_Isolette_EnvironmentHeatType(config: Config_Isolette_EnvironmentHeatType): RandomLib

  def nextIsolette_EnvironmentHeatType(): Isolette_Environment.Heat.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Environment.Heat.numOfElements-1)

    var v: Isolette_Environment.Heat.Type = isolette.Isolette_Environment.Heat.byOrdinal(ordinal).get
    if(get_Config_Isolette_EnvironmentHeatType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_EnvironmentHeatType.attempts) {
       if(get_Config_Isolette_EnvironmentHeatType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_EnvironmentHeatType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Heat.numOfElements-1)
       v = isolette.Isolette_Environment.Heat.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_EnvironmentHeatType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_EnvironmentHeatType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Heat.numOfElements-1)
       v = isolette.Isolette_Environment.Heat.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Environment.Heat_Payload ===================

  def get_Config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload
  def set_Config_Isolette_EnvironmentHeat_Payload(config: Config_Isolette_EnvironmentHeat_Payload): RandomLib

  def nextIsolette_EnvironmentHeat_Payload(): Isolette_Environment.Heat_Payload = {
    var value: Isolette_Environment.Heat.Type = nextIsolette_EnvironmentHeatType()

    var v: Isolette_Environment.Heat_Payload = Isolette_Environment.Heat_Payload(value)

    if(get_Config_Isolette_EnvironmentHeat_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_EnvironmentHeat_Payload.attempts) {
        if(get_Config_Isolette_EnvironmentHeat_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_EnvironmentHeat_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_EnvironmentHeatType()
        v = Isolette_Environment.Heat_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_EnvironmentHeat_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_EnvironmentHeat_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_EnvironmentHeatType()
       v = Isolette_Environment.Heat_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Environment.Interface_Interaction.Type ===================

  def get_Config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType
  def set_Config_Isolette_EnvironmentInterface_InteractionType(config: Config_Isolette_EnvironmentInterface_InteractionType): RandomLib

  def nextIsolette_EnvironmentInterface_InteractionType(): Isolette_Environment.Interface_Interaction.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Environment.Interface_Interaction.numOfElements-1)

    var v: Isolette_Environment.Interface_Interaction.Type = isolette.Isolette_Environment.Interface_Interaction.byOrdinal(ordinal).get
    if(get_Config_Isolette_EnvironmentInterface_InteractionType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_EnvironmentInterface_InteractionType.attempts) {
       if(get_Config_Isolette_EnvironmentInterface_InteractionType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_EnvironmentInterface_InteractionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Interface_Interaction.numOfElements-1)
       v = isolette.Isolette_Environment.Interface_Interaction.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_EnvironmentInterface_InteractionType.filter(v)) {
        return v
       }
       if (get_Config_Isolette_EnvironmentInterface_InteractionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Interface_Interaction.numOfElements-1)
       v = isolette.Isolette_Environment.Interface_Interaction.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Isolette_Environment.Interface_Interaction_Payload ===================

  def get_Config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload
  def set_Config_Isolette_EnvironmentInterface_Interaction_Payload(config: Config_Isolette_EnvironmentInterface_Interaction_Payload): RandomLib

  def nextIsolette_EnvironmentInterface_Interaction_Payload(): Isolette_Environment.Interface_Interaction_Payload = {
    var value: Isolette_Environment.Interface_Interaction.Type = nextIsolette_EnvironmentInterface_InteractionType()

    var v: Isolette_Environment.Interface_Interaction_Payload = Isolette_Environment.Interface_Interaction_Payload(value)

    if(get_Config_Isolette_EnvironmentInterface_Interaction_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_EnvironmentInterface_Interaction_Payload.attempts) {
        if(get_Config_Isolette_EnvironmentInterface_Interaction_Payload.filter(v)) {
          return v
        }
        if (get_Config_Isolette_EnvironmentInterface_Interaction_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextIsolette_EnvironmentInterface_InteractionType()
        v = Isolette_Environment.Interface_Interaction_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_EnvironmentInterface_Interaction_Payload.filter(v)) {
         return v
       }
       if (get_Config_Isolette_EnvironmentInterface_Interaction_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextIsolette_EnvironmentInterface_InteractionType()
       v = Isolette_Environment.Interface_Interaction_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container ===================

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container
  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container): RandomLib

  def nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container(): Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container = {
    var callEnum: ISZ[MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.Type] = ISZ(MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id, MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id)

    if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container = c match {
      case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P _).apply()
      case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.attempts) {
       if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P _).apply()
         case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P _).apply()
         case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P ===================

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P
  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P): RandomLib

  def nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P(): Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P = {

    var v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P()

    if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P.attempts) {
        if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P()
     }
    } else {
     while(T) {
       if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS ===================

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS
  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS): RandomLib

  def nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS(): Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS = {

    var v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS()

    if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS.attempts) {
        if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS()
     }
    } else {
     while(T) {
       if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container ===================

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container
  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container): RandomLib

  def nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container(): Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container = {
    var callEnum: ISZ[MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.Type] = ISZ(MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id, MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id)

    if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container = c match {
      case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P _).apply()
      case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.attempts) {
       if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P _).apply()
         case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P _).apply()
         case MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId.MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id => (nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P ===================

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P
  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P): RandomLib

  def nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P(): Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P = {
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P(api_internal_failure)

    if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P.attempts) {
        if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P(api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P(api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS ===================

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS
  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS): RandomLib

  def nextMonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(): Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS = {
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(api_internal_failure)

    if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS.attempts) {
        if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container ===================

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container
  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container): RandomLib

  def nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container = {
    var callEnum: ISZ[MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.Type] = ISZ(MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id, MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id)

    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container = c match {
      case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P _).apply()
      case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.attempts) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P _).apply()
         case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P _).apply()
         case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P ===================

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P
  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P): RandomLib

  def nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_upper_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)

    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P.attempts) {
        if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS ===================

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS
  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS): RandomLib

  def nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS = {
    var In_lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_upper_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)

    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS.attempts) {
        if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container ===================

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container
  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container): RandomLib

  def nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container = {
    var callEnum: ISZ[MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.Type] = ISZ(MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id, MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id)

    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container = c match {
      case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P _).apply()
      case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.attempts) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P _).apply()
         case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P _).apply()
         case MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId.MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id => (nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P ===================

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P
  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P): RandomLib

  def nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P = {
    var api_alarm_control: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()

    var v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(api_alarm_control)

    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P.attempts) {
        if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_alarm_control = nextIsolette_Data_ModelOn_OffType()
        v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(api_alarm_control)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_alarm_control = nextIsolette_Data_ModelOn_OffType()
       v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(api_alarm_control)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS ===================

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS
  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS): RandomLib

  def nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS = {
    var lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_alarm_control: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()

    var v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(lastCmd, api_alarm_control)

    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS.attempts) {
        if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_alarm_control = nextIsolette_Data_ModelOn_OffType()
        v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(lastCmd, api_alarm_control)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_alarm_control = nextIsolette_Data_ModelOn_OffType()
       v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(lastCmd, api_alarm_control)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container ===================

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container
  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container): RandomLib

  def nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container = {
    var callEnum: ISZ[MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.Type] = ISZ(MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id, MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id)

    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container = c match {
      case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P _).apply()
      case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.attempts) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P _).apply()
         case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P _).apply()
         case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P ===================

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P
  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P): RandomLib

  def nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)

    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P.attempts) {
        if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS ===================

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS
  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS): RandomLib

  def nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS = {
    var In_lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)

    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS.attempts) {
        if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container ===================

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container
  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container): RandomLib

  def nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container = {
    var callEnum: ISZ[MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.Type] = ISZ(MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id, MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id)

    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container = c match {
      case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P _).apply()
      case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.attempts) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P _).apply()
         case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P _).apply()
         case MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId.MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P ===================

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P
  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P): RandomLib

  def nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P = {
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_lower_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_monitor_status: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()
    var api_upper_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(api_interface_failure, api_lower_alarm_temp, api_monitor_status, api_upper_alarm_temp)

    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P.attempts) {
        if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        api_monitor_status = nextIsolette_Data_ModelStatusType()
        api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(api_interface_failure, api_lower_alarm_temp, api_monitor_status, api_upper_alarm_temp)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       api_monitor_status = nextIsolette_Data_ModelStatusType()
       api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(api_interface_failure, api_lower_alarm_temp, api_monitor_status, api_upper_alarm_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS ===================

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS
  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS): RandomLib

  def nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS = {
    var lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_lower_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_monitor_status: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()
    var api_upper_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(lastCmd, api_interface_failure, api_lower_alarm_temp, api_monitor_status, api_upper_alarm_temp)

    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS.attempts) {
        if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        api_monitor_status = nextIsolette_Data_ModelStatusType()
        api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(lastCmd, api_interface_failure, api_lower_alarm_temp, api_monitor_status, api_upper_alarm_temp)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       api_monitor_status = nextIsolette_Data_ModelStatusType()
       api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(lastCmd, api_interface_failure, api_lower_alarm_temp, api_monitor_status, api_upper_alarm_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container ===================

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container
  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container): RandomLib

  def nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container = {
    var callEnum: ISZ[MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.Type] = ISZ(MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id, MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id)

    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container = c match {
      case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P _).apply()
      case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.attempts) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P _).apply()
         case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P _).apply()
         case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P ===================

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P
  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P): RandomLib

  def nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(api_current_tempWstatus, api_interface_failure, api_internal_failure)

    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P.attempts) {
        if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS ===================

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS
  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS): RandomLib

  def nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS = {
    var In_lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)

    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS.attempts) {
        if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_lastMonitorMode = nextIsolette_Data_ModelMonitor_ModeType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_lastMonitorMode = nextIsolette_Data_ModelMonitor_ModeType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container ===================

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container
  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container): RandomLib

  def nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container = {
    var callEnum: ISZ[MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.Type] = ISZ(MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id, MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id)

    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container = c match {
      case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P _).apply()
      case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.attempts) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P _).apply()
         case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P _).apply()
         case MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId.MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id => (nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P ===================

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P
  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P): RandomLib

  def nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P = {
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()

    var v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(api_monitor_mode)

    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P.attempts) {
        if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(api_monitor_mode)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(api_monitor_mode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS ===================

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS
  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS): RandomLib

  def nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS = {
    var lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()

    var v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(lastMonitorMode, api_monitor_mode)

    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS.attempts) {
        if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        lastMonitorMode = nextIsolette_Data_ModelMonitor_ModeType()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(lastMonitorMode, api_monitor_mode)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       lastMonitorMode = nextIsolette_Data_ModelMonitor_ModeType()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(lastMonitorMode, api_monitor_mode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container ===================

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container
  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container): RandomLib

  def nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container(): Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container = {
    var callEnum: ISZ[RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.Type] = ISZ(RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id, RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id)

    if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container = c match {
      case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P _).apply()
      case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.attempts) {
       if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P _).apply()
         case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P _).apply()
         case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P ===================

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P
  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P): RandomLib

  def nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P(): Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P = {

    var v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P()

    if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P.attempts) {
        if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P()
     }
    } else {
     while(T) {
       if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS ===================

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS
  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS): RandomLib

  def nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS(): Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS = {

    var v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS()

    if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS.attempts) {
        if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS()
     }
    } else {
     while(T) {
       if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container ===================

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container
  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container): RandomLib

  def nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container(): Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container = {
    var callEnum: ISZ[RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.Type] = ISZ(RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id, RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id)

    if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container = c match {
      case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P _).apply()
      case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.attempts) {
       if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P _).apply()
         case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P _).apply()
         case RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId.RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id => (nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P ===================

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P
  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P): RandomLib

  def nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P(): Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P = {
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P(api_internal_failure)

    if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P.attempts) {
        if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P(api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P(api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS ===================

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS
  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS): RandomLib

  def nextRegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS(): Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS = {
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS(api_internal_failure)

    if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS.attempts) {
        if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS(api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS(api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container ===================

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container
  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container): RandomLib

  def nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container = {
    var callEnum: ISZ[RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.Type] = ISZ(RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id, RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id)

    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container = c match {
      case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P _).apply()
      case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.attempts) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P _).apply()
         case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P _).apply()
         case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P ===================

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P
  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P): RandomLib

  def nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_upper_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)

    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P.attempts) {
        if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
        v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
       v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS ===================

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS
  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS): RandomLib

  def nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS = {
    var In_lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_upper_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)

    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS.attempts) {
        if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
        v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
       v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container ===================

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container
  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container): RandomLib

  def nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container = {
    var callEnum: ISZ[RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.Type] = ISZ(RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id, RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id)

    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container = c match {
      case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P _).apply()
      case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.attempts) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P _).apply()
         case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P _).apply()
         case RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId.RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id => (nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P ===================

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P
  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P): RandomLib

  def nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P = {
    var api_heat_control: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()

    var v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(api_heat_control)

    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P.attempts) {
        if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_heat_control = nextIsolette_Data_ModelOn_OffType()
        v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(api_heat_control)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_heat_control = nextIsolette_Data_ModelOn_OffType()
       v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(api_heat_control)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS ===================

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS
  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS): RandomLib

  def nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS = {
    var lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_heat_control: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()

    var v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(lastCmd, api_heat_control)

    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS.attempts) {
        if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_heat_control = nextIsolette_Data_ModelOn_OffType()
        v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(lastCmd, api_heat_control)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_heat_control = nextIsolette_Data_ModelOn_OffType()
       v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(lastCmd, api_heat_control)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container ===================

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container
  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container): RandomLib

  def nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container(): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container = {
    var callEnum: ISZ[RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.Type] = ISZ(RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id, RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id)

    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container = c match {
      case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P _).apply()
      case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.attempts) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P _).apply()
         case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P _).apply()
         case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P ===================

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P
  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P): RandomLib

  def nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)

    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P.attempts) {
        if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS ===================

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS
  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS): RandomLib

  def nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)

    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS.attempts) {
        if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container ===================

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container
  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container): RandomLib

  def nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container(): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container = {
    var callEnum: ISZ[RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.Type] = ISZ(RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id, RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id)

    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container = c match {
      case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P _).apply()
      case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.attempts) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P _).apply()
         case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P _).apply()
         case RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId.RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P ===================

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P
  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P): RandomLib

  def nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P = {
    var api_displayed_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_lower_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_regulator_status: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()
    var api_upper_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp)

    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P.attempts) {
        if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_displayed_temp = nextIsolette_Data_ModelTemp_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
        api_regulator_status = nextIsolette_Data_ModelStatusType()
        api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
        v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_displayed_temp = nextIsolette_Data_ModelTemp_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
       api_regulator_status = nextIsolette_Data_ModelStatusType()
       api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
       v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS ===================

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS
  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS): RandomLib

  def nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS = {
    var api_displayed_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_lower_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_regulator_status: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()
    var api_upper_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp)

    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS.attempts) {
        if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_displayed_temp = nextIsolette_Data_ModelTemp_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
        api_regulator_status = nextIsolette_Data_ModelStatusType()
        api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
        v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_displayed_temp = nextIsolette_Data_ModelTemp_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
       api_regulator_status = nextIsolette_Data_ModelStatusType()
       api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
       v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container ===================

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container
  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container): RandomLib

  def nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container = {
    var callEnum: ISZ[RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.Type] = ISZ(RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id, RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id)

    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container = c match {
      case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P _).apply()
      case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.attempts) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P _).apply()
         case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P _).apply()
         case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P ===================

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P
  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P): RandomLib

  def nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(api_current_tempWstatus, api_interface_failure, api_internal_failure)

    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P.attempts) {
        if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS ===================

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS
  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS): RandomLib

  def nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS = {
    var In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(In_lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)

    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS.attempts) {
        if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_lastRegulatorMode = nextIsolette_Data_ModelRegulator_ModeType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(In_lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_lastRegulatorMode = nextIsolette_Data_ModelRegulator_ModeType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(In_lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container ===================

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container
  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container): RandomLib

  def nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container = {
    var callEnum: ISZ[RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.Type] = ISZ(RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id, RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id)

    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container = c match {
      case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P _).apply()
      case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.attempts) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P _).apply()
         case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P _).apply()
         case RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId.RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id => (nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P ===================

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P
  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P): RandomLib

  def nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P = {
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()

    var v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(api_regulator_mode)

    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P.attempts) {
        if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(api_regulator_mode)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(api_regulator_mode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS ===================

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS
  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS): RandomLib

  def nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS = {
    var lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()

    var v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(lastRegulatorMode, api_regulator_mode)

    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS.attempts) {
        if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        lastRegulatorMode = nextIsolette_Data_ModelRegulator_ModeType()
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(lastRegulatorMode, api_regulator_mode)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       lastRegulatorMode = nextIsolette_Data_ModelRegulator_ModeType()
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(lastRegulatorMode, api_regulator_mode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== ISZ[B] =====================

  def nextISZB(): ISZ[B] = {
    val length: Z = gen.nextZBetween(0, get_numElement)
    var temp: ISZ[B] = ISZ()
    for (r <- 0 until length) {
      temp = temp :+ nextB()
    }

    return temp
  }
}

@record class RandomLib(val gen: org.sireum.Random.Gen) extends RandomLibI {

  var numElem: Z = 50

  var _verbose: B = F
  def verbose: RandomLib = {
    _verbose = !_verbose
    return this
  }

  def get_numElement: Z = {return numElem}

  def set_numElement(s: Z): Unit ={
    numElem = s
  }

  // ============= String =============

  def alwaysTrue_String(v: String): B = {return T}

  var config_String: Config_String = Config_String(0, numElem, 100, _verbose, alwaysTrue_String _)

  def get_Config_String: Config_String = {return config_String}

  def set_Config_String(config: Config_String): RandomLib = {
    config_String = config
    return this
  }

  // ============= Z ===================
  def alwaysTrue_Z(v: Z): B = {return T}

  var config_Z: Config_Z = Config_Z(None(), None(), 100, _verbose, alwaysTrue_Z _)
  def get_Config_Z: Config_Z = {return config_Z}

  def set_Config_Z(config: Config_Z): RandomLib ={
    config_Z = config
    return this
  }

  // ============= B ===================
  def alwaysTrue_B(v: B): B = {return T}

  var config_B: Config_B = Config_B(100, _verbose, alwaysTrue_B _)
  def get_Config_B: Config_B = {return config_B}

  def set_Config_B(config: Config_B): RandomLib ={
    config_B = config
    return this
  }

  // ============= C ===================
  def alwaysTrue_C(v: C): B = {return T}

  var config_C: Config_C = Config_C(None(), None(), 100, _verbose, alwaysTrue_C _)
  def get_Config_C: Config_C = {return config_C}

  def set_Config_C(config: Config_C): RandomLib ={
    config_C = config
    return this
  }

  // ============= R ===================
  def alwaysTrue_R(v: R): B = {return T}

  var config_R: Config_R = Config_R(None(), None(), 100, _verbose, alwaysTrue_R _)
  def get_Config_R: Config_R = {return config_R}

  def set_Config_R(config: Config_R): RandomLib ={
    config_R = config
    return this
  }

  // ============= F32 ===================
  def alwaysTrue_F32(v: F32): B = {return T}

  var config_F32: Config_F32 = Config_F32(None(), None(), 100, _verbose, alwaysTrue_F32 _)
  def get_Config_F32: Config_F32 = {return config_F32}

  def set_Config_F32(config: Config_F32): RandomLib ={
    config_F32 = config
    return this
  }

  // ============= F64 ===================
  def alwaysTrue_F64(v: F64): B = {return T}

  var config_F64: Config_F64 = Config_F64(None(), None(), 100, _verbose, alwaysTrue_F64 _)
  def get_Config_F64: Config_F64 = {return config_F64}

  def set_Config_F64(config: Config_F64): RandomLib ={
    config_F64 = config
    return this
  }

  // ============= S8 ===================
  def alwaysTrue_S8(v: S8): B = {return T}

  var config_S8: Config_S8 = Config_S8(None(), None(), 100, _verbose, alwaysTrue_S8 _)
  def get_Config_S8: Config_S8 = {return config_S8}

  def set_Config_S8(config: Config_S8): RandomLib ={
    config_S8 = config
    return this
  }

  // ============= S16 ===================
  def alwaysTrue_S16(v: S16): B = {return T}

  var config_S16: Config_S16 = Config_S16(None(), None(), 100, _verbose, alwaysTrue_S16 _)
  def get_Config_S16: Config_S16 = {return config_S16}

  def set_Config_S16(config: Config_S16): RandomLib ={
    config_S16 = config
    return this
  }

  // ============= S32 ===================
  def alwaysTrue_S32(v: S32): B = {return T}

  var config_S32: Config_S32 = Config_S32(None(), None(), 100, _verbose, alwaysTrue_S32 _)
  def get_Config_S32: Config_S32 = {return config_S32}

  def set_Config_S32(config: Config_S32): RandomLib ={
    config_S32 = config
    return this
  }

  // ============= S64 ===================
  def alwaysTrue_S64(v: S64): B = {return T}

  var config_S64: Config_S64 = Config_S64(None(), None(), 100, _verbose, alwaysTrue_S64 _)
  def get_Config_S64: Config_S64 = {return config_S64}

  def set_Config_S64(config: Config_S64): RandomLib ={
    config_S64 = config
    return this
  }

  // ============= U8 ===================
  def alwaysTrue_U8(v: U8): B = {return T}

  var config_U8: Config_U8 = Config_U8(None(), None(), 100, _verbose, alwaysTrue_U8 _)
  def get_Config_U8: Config_U8 = {return config_U8}

  def set_Config_U8(config: Config_U8): RandomLib ={
    config_U8 = config
    return this
  }

  // ============= U16 ===================
  def alwaysTrue_U16(v: U16): B = {return T}

  var config_U16: Config_U16 = Config_U16(None(), None(), 100, _verbose, alwaysTrue_U16 _)
  def get_Config_U16: Config_U16 = {return config_U16}

  def set_Config_U16(config: Config_U16): RandomLib ={
    config_U16 = config
    return this
  }

  // ============= U32 ===================
  def alwaysTrue_U32(v: U32): B = {return T}

  var config_U32: Config_U32 = Config_U32(None(), None(), 100, _verbose, alwaysTrue_U32 _)
  def get_Config_U32: Config_U32 = {return config_U32}

  def set_Config_U32(config: Config_U32): RandomLib ={
    config_U32 = config
    return this
  }

  // ============= U64 ===================
  def alwaysTrue_U64(v: U64): B = {return T}

  var config_U64: Config_U64 = Config_U64(None(), None(), 100, _verbose, alwaysTrue_U64 _)
  def get_Config_U64: Config_U64 = {return config_U64}

  def set_Config_U64(config: Config_U64): RandomLib ={
    config_U64 = config
    return this
  }

  // ============= runtimemonitor.ObservationKind.Type ===================
  def alwaysTrue_runtimemonitorObservationKindType(v: runtimemonitor.ObservationKind.Type): B = {return T}

  var config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType = Config_runtimemonitorObservationKindType(100, _verbose, alwaysTrue_runtimemonitorObservationKindType _)

  def get_Config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType = {return config_runtimemonitorObservationKindType}

  def set_Config_runtimemonitorObservationKindType(config: Config_runtimemonitorObservationKindType): RandomLib ={
    config_runtimemonitorObservationKindType = config
    return this
  }

  // ============= art.DataContent ===================
  def alwaysTrue__artDataContent(v: art.DataContent): B = {return T}

  var config__artDataContent: Config__artDataContent = Config__artDataContent(100, _verbose, F, ISZ(), alwaysTrue__artDataContent _)

  def get_Config__artDataContent: Config__artDataContent = {return config__artDataContent}

  def set_Config__artDataContent(config: Config__artDataContent): RandomLib ={
    config__artDataContent = config
    return this
  }

  // ============= art.Empty ===================
  def alwaysTrue__artEmpty(v: art.Empty): B = {return T}

  var config__artEmpty: Config__artEmpty = Config__artEmpty(100, _verbose, alwaysTrue__artEmpty _)

  def get_Config__artEmpty: Config__artEmpty = {return config__artEmpty}

  def set_Config__artEmpty(config: Config__artEmpty): RandomLib ={
    config__artEmpty = config
    return this
  }

  // ============= Base_Types.Boolean_Payload ===================
  def alwaysTrue_Base_TypesBoolean_Payload(v: Base_Types.Boolean_Payload): B = {return T}

  var config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = Config_Base_TypesBoolean_Payload(100, _verbose, alwaysTrue_Base_TypesBoolean_Payload _)

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = {return config_Base_TypesBoolean_Payload}

  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): RandomLib ={
    config_Base_TypesBoolean_Payload = config
    return this
  }

  // ============= Base_Types.Integer_Payload ===================
  def alwaysTrue_Base_TypesInteger_Payload(v: Base_Types.Integer_Payload): B = {return T}

  var config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = Config_Base_TypesInteger_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_Payload _)

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = {return config_Base_TypesInteger_Payload}

  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): RandomLib ={
    config_Base_TypesInteger_Payload = config
    return this
  }

  // ============= Base_Types.Integer_8_Payload ===================
  def alwaysTrue_Base_TypesInteger_8_Payload(v: Base_Types.Integer_8_Payload): B = {return T}

  var config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = Config_Base_TypesInteger_8_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_8_Payload _)

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = {return config_Base_TypesInteger_8_Payload}

  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): RandomLib ={
    config_Base_TypesInteger_8_Payload = config
    return this
  }

  // ============= Base_Types.Integer_16_Payload ===================
  def alwaysTrue_Base_TypesInteger_16_Payload(v: Base_Types.Integer_16_Payload): B = {return T}

  var config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = Config_Base_TypesInteger_16_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_16_Payload _)

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = {return config_Base_TypesInteger_16_Payload}

  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): RandomLib ={
    config_Base_TypesInteger_16_Payload = config
    return this
  }

  // ============= Base_Types.Integer_32_Payload ===================
  def alwaysTrue_Base_TypesInteger_32_Payload(v: Base_Types.Integer_32_Payload): B = {return T}

  var config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = Config_Base_TypesInteger_32_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_32_Payload _)

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = {return config_Base_TypesInteger_32_Payload}

  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): RandomLib ={
    config_Base_TypesInteger_32_Payload = config
    return this
  }

  // ============= Base_Types.Integer_64_Payload ===================
  def alwaysTrue_Base_TypesInteger_64_Payload(v: Base_Types.Integer_64_Payload): B = {return T}

  var config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = Config_Base_TypesInteger_64_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_64_Payload _)

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = {return config_Base_TypesInteger_64_Payload}

  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): RandomLib ={
    config_Base_TypesInteger_64_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_8_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_8_Payload(v: Base_Types.Unsigned_8_Payload): B = {return T}

  var config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = Config_Base_TypesUnsigned_8_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_8_Payload _)

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = {return config_Base_TypesUnsigned_8_Payload}

  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): RandomLib ={
    config_Base_TypesUnsigned_8_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_16_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_16_Payload(v: Base_Types.Unsigned_16_Payload): B = {return T}

  var config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = Config_Base_TypesUnsigned_16_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_16_Payload _)

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = {return config_Base_TypesUnsigned_16_Payload}

  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): RandomLib ={
    config_Base_TypesUnsigned_16_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_32_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_32_Payload(v: Base_Types.Unsigned_32_Payload): B = {return T}

  var config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = Config_Base_TypesUnsigned_32_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_32_Payload _)

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = {return config_Base_TypesUnsigned_32_Payload}

  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): RandomLib ={
    config_Base_TypesUnsigned_32_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_64_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_64_Payload(v: Base_Types.Unsigned_64_Payload): B = {return T}

  var config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = Config_Base_TypesUnsigned_64_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_64_Payload _)

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = {return config_Base_TypesUnsigned_64_Payload}

  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): RandomLib ={
    config_Base_TypesUnsigned_64_Payload = config
    return this
  }

  // ============= Base_Types.Float_Payload ===================
  def alwaysTrue_Base_TypesFloat_Payload(v: Base_Types.Float_Payload): B = {return T}

  var config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = Config_Base_TypesFloat_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_Payload _)

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = {return config_Base_TypesFloat_Payload}

  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): RandomLib ={
    config_Base_TypesFloat_Payload = config
    return this
  }

  // ============= Base_Types.Float_32_Payload ===================
  def alwaysTrue_Base_TypesFloat_32_Payload(v: Base_Types.Float_32_Payload): B = {return T}

  var config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = Config_Base_TypesFloat_32_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_32_Payload _)

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = {return config_Base_TypesFloat_32_Payload}

  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): RandomLib ={
    config_Base_TypesFloat_32_Payload = config
    return this
  }

  // ============= Base_Types.Float_64_Payload ===================
  def alwaysTrue_Base_TypesFloat_64_Payload(v: Base_Types.Float_64_Payload): B = {return T}

  var config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = Config_Base_TypesFloat_64_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_64_Payload _)

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = {return config_Base_TypesFloat_64_Payload}

  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): RandomLib ={
    config_Base_TypesFloat_64_Payload = config
    return this
  }

  // ============= Base_Types.Character_Payload ===================
  def alwaysTrue_Base_TypesCharacter_Payload(v: Base_Types.Character_Payload): B = {return T}

  var config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = Config_Base_TypesCharacter_Payload(100, _verbose, alwaysTrue_Base_TypesCharacter_Payload _)

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = {return config_Base_TypesCharacter_Payload}

  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): RandomLib ={
    config_Base_TypesCharacter_Payload = config
    return this
  }

  // ============= Base_Types.String_Payload ===================
  def alwaysTrue_Base_TypesString_Payload(v: Base_Types.String_Payload): B = {return T}

  var config_Base_TypesString_Payload: Config_Base_TypesString_Payload = Config_Base_TypesString_Payload(100, _verbose, alwaysTrue_Base_TypesString_Payload _)

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload = {return config_Base_TypesString_Payload}

  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): RandomLib ={
    config_Base_TypesString_Payload = config
    return this
  }

  // ============= Base_Types.Bits_Payload ===================
  def alwaysTrue_Base_TypesBits_Payload(v: Base_Types.Bits_Payload): B = {return T}

  var config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = Config_Base_TypesBits_Payload(100, _verbose, alwaysTrue_Base_TypesBits_Payload _)

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = {return config_Base_TypesBits_Payload}

  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): RandomLib ={
    config_Base_TypesBits_Payload = config
    return this
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container ===================
  def alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container(v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container): B = {return T}

  var config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container = Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container _)

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container = {return config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container}

  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container): RandomLib ={
    config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container = config
    return this
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P ===================
  def alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P(v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P): B = {return T}

  var config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P = Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P(100, _verbose, alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P _)

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P = {return config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P}

  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P): RandomLib ={
    config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P = config
    return this
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS ===================
  def alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS(v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS): B = {return T}

  var config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS = Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS(100, _verbose, alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS _)

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS = {return config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS}

  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS): RandomLib ={
    config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS = config
    return this
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container ===================
  def alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container(v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container): B = {return T}

  var config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container = Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container _)

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container = {return config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container}

  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container): RandomLib ={
    config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container = config
    return this
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P ===================
  def alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P(v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P): B = {return T}

  var config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P = Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P(100, _verbose, alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P _)

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P = {return config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P}

  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P): RandomLib ={
    config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P = config
    return this
  }

  // ============= Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS ===================
  def alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS(v: Devices.Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS): B = {return T}

  var config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS = Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS(100, _verbose, alwaysTrue_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS _)

  def get_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS = {return config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS}

  def set_Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS(config: Config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS): RandomLib ={
    config_DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS = config
    return this
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container ===================
  def alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container(v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container): B = {return T}

  var config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container = Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container _)

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container = {return config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container}

  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container): RandomLib ={
    config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container = config
    return this
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P ===================
  def alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P(v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P): B = {return T}

  var config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P = Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P(100, _verbose, alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P _)

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P = {return config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P}

  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P): RandomLib ={
    config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P = config
    return this
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS ===================
  def alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS(v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS): B = {return T}

  var config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS = Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS(100, _verbose, alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS _)

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS = {return config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS}

  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS): RandomLib ={
    config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS = config
    return this
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container ===================
  def alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container(v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container): B = {return T}

  var config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container = Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container _)

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container = {return config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container}

  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container): RandomLib ={
    config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container = config
    return this
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P ===================
  def alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P(v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P): B = {return T}

  var config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P = Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P(100, _verbose, alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P _)

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P = {return config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P}

  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P): RandomLib ={
    config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P = config
    return this
  }

  // ============= Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS ===================
  def alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS(v: Devices.Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS): B = {return T}

  var config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS = Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS(100, _verbose, alwaysTrue_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS _)

  def get_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS = {return config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS}

  def set_Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS(config: Config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS): RandomLib ={
    config_DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS = config
    return this
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container ===================
  def alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container(v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container): B = {return T}

  var config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container = Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container _)

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container = {return config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container}

  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container): RandomLib ={
    config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container = config
    return this
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P ===================
  def alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P(v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P): B = {return T}

  var config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P = Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P(100, _verbose, alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P _)

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P = {return config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P}

  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P): RandomLib ={
    config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P = config
    return this
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS ===================
  def alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS(v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS): B = {return T}

  var config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS = Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS(100, _verbose, alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS _)

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS = {return config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS}

  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS): RandomLib ={
    config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS = config
    return this
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container ===================
  def alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container(v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container): B = {return T}

  var config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container = Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container _)

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container = {return config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container}

  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container): RandomLib ={
    config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container = config
    return this
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P ===================
  def alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P(v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P): B = {return T}

  var config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P = Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P(100, _verbose, alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P _)

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P = {return config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P}

  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P): RandomLib ={
    config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P = config
    return this
  }

  // ============= Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS ===================
  def alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS(v: Isolette.operator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS): B = {return T}

  var config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS = Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS(100, _verbose, alwaysTrue_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS _)

  def get_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS = {return config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS}

  def set_Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS(config: Config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS): RandomLib ={
    config_Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS = config
    return this
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl ===================
  def alwaysTrue_Isolette_Data_ModelFailure_Flag_impl(v: Isolette_Data_Model.Failure_Flag_impl): B = {return T}

  var config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl = Config_Isolette_Data_ModelFailure_Flag_impl(100, _verbose, alwaysTrue_Isolette_Data_ModelFailure_Flag_impl _)

  def get_Config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl = {return config_Isolette_Data_ModelFailure_Flag_impl}

  def set_Config_Isolette_Data_ModelFailure_Flag_impl(config: Config_Isolette_Data_ModelFailure_Flag_impl): RandomLib ={
    config_Isolette_Data_ModelFailure_Flag_impl = config
    return this
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelFailure_Flag_impl_Payload(v: Isolette_Data_Model.Failure_Flag_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload = Config_Isolette_Data_ModelFailure_Flag_impl_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelFailure_Flag_impl_Payload _)

  def get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload = {return config_Isolette_Data_ModelFailure_Flag_impl_Payload}

  def set_Config_Isolette_Data_ModelFailure_Flag_impl_Payload(config: Config_Isolette_Data_ModelFailure_Flag_impl_Payload): RandomLib ={
    config_Isolette_Data_ModelFailure_Flag_impl_Payload = config
    return this
  }

  // ============= Isolette_Data_Model.Monitor_Mode.Type ===================
  def alwaysTrue_Isolette_Data_ModelMonitor_ModeType(v: Isolette_Data_Model.Monitor_Mode.Type): B = {return T}

  var config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType = Config_Isolette_Data_ModelMonitor_ModeType(100, _verbose, alwaysTrue_Isolette_Data_ModelMonitor_ModeType _)

  def get_Config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType = {return config_Isolette_Data_ModelMonitor_ModeType}

  def set_Config_Isolette_Data_ModelMonitor_ModeType(config: Config_Isolette_Data_ModelMonitor_ModeType): RandomLib ={
    config_Isolette_Data_ModelMonitor_ModeType = config
    return this
  }

  // ============= Isolette_Data_Model.Monitor_Mode_Payload ===================
  def alwaysTrue_Isolette_Data_ModelMonitor_Mode_Payload(v: Isolette_Data_Model.Monitor_Mode_Payload): B = {return T}

  var config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload = Config_Isolette_Data_ModelMonitor_Mode_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelMonitor_Mode_Payload _)

  def get_Config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload = {return config_Isolette_Data_ModelMonitor_Mode_Payload}

  def set_Config_Isolette_Data_ModelMonitor_Mode_Payload(config: Config_Isolette_Data_ModelMonitor_Mode_Payload): RandomLib ={
    config_Isolette_Data_ModelMonitor_Mode_Payload = config
    return this
  }

  // ============= Isolette_Data_Model.On_Off.Type ===================
  def alwaysTrue_Isolette_Data_ModelOn_OffType(v: Isolette_Data_Model.On_Off.Type): B = {return T}

  var config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType = Config_Isolette_Data_ModelOn_OffType(100, _verbose, alwaysTrue_Isolette_Data_ModelOn_OffType _)

  def get_Config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType = {return config_Isolette_Data_ModelOn_OffType}

  def set_Config_Isolette_Data_ModelOn_OffType(config: Config_Isolette_Data_ModelOn_OffType): RandomLib ={
    config_Isolette_Data_ModelOn_OffType = config
    return this
  }

  // ============= Isolette_Data_Model.On_Off_Payload ===================
  def alwaysTrue_Isolette_Data_ModelOn_Off_Payload(v: Isolette_Data_Model.On_Off_Payload): B = {return T}

  var config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload = Config_Isolette_Data_ModelOn_Off_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelOn_Off_Payload _)

  def get_Config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload = {return config_Isolette_Data_ModelOn_Off_Payload}

  def set_Config_Isolette_Data_ModelOn_Off_Payload(config: Config_Isolette_Data_ModelOn_Off_Payload): RandomLib ={
    config_Isolette_Data_ModelOn_Off_Payload = config
    return this
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl ===================
  def alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl(v: Isolette_Data_Model.PhysicalTemp_impl): B = {return T}

  var config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl = Config_Isolette_Data_ModelPhysicalTemp_impl(100, _verbose, alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl _)

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl = {return config_Isolette_Data_ModelPhysicalTemp_impl}

  def set_Config_Isolette_Data_ModelPhysicalTemp_impl(config: Config_Isolette_Data_ModelPhysicalTemp_impl): RandomLib ={
    config_Isolette_Data_ModelPhysicalTemp_impl = config
    return this
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl_Payload(v: Isolette_Data_Model.PhysicalTemp_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload = Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl_Payload _)

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload = {return config_Isolette_Data_ModelPhysicalTemp_impl_Payload}

  def set_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(config: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload): RandomLib ={
    config_Isolette_Data_ModelPhysicalTemp_impl_Payload = config
    return this
  }

  // ============= Isolette_Data_Model.Regulator_Mode.Type ===================
  def alwaysTrue_Isolette_Data_ModelRegulator_ModeType(v: Isolette_Data_Model.Regulator_Mode.Type): B = {return T}

  var config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType = Config_Isolette_Data_ModelRegulator_ModeType(100, _verbose, alwaysTrue_Isolette_Data_ModelRegulator_ModeType _)

  def get_Config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType = {return config_Isolette_Data_ModelRegulator_ModeType}

  def set_Config_Isolette_Data_ModelRegulator_ModeType(config: Config_Isolette_Data_ModelRegulator_ModeType): RandomLib ={
    config_Isolette_Data_ModelRegulator_ModeType = config
    return this
  }

  // ============= Isolette_Data_Model.Regulator_Mode_Payload ===================
  def alwaysTrue_Isolette_Data_ModelRegulator_Mode_Payload(v: Isolette_Data_Model.Regulator_Mode_Payload): B = {return T}

  var config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload = Config_Isolette_Data_ModelRegulator_Mode_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelRegulator_Mode_Payload _)

  def get_Config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload = {return config_Isolette_Data_ModelRegulator_Mode_Payload}

  def set_Config_Isolette_Data_ModelRegulator_Mode_Payload(config: Config_Isolette_Data_ModelRegulator_Mode_Payload): RandomLib ={
    config_Isolette_Data_ModelRegulator_Mode_Payload = config
    return this
  }

  // ============= Isolette_Data_Model.Status.Type ===================
  def alwaysTrue_Isolette_Data_ModelStatusType(v: Isolette_Data_Model.Status.Type): B = {return T}

  var config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType = Config_Isolette_Data_ModelStatusType(100, _verbose, alwaysTrue_Isolette_Data_ModelStatusType _)

  def get_Config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType = {return config_Isolette_Data_ModelStatusType}

  def set_Config_Isolette_Data_ModelStatusType(config: Config_Isolette_Data_ModelStatusType): RandomLib ={
    config_Isolette_Data_ModelStatusType = config
    return this
  }

  // ============= Isolette_Data_Model.Status_Payload ===================
  def alwaysTrue_Isolette_Data_ModelStatus_Payload(v: Isolette_Data_Model.Status_Payload): B = {return T}

  var config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload = Config_Isolette_Data_ModelStatus_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelStatus_Payload _)

  def get_Config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload = {return config_Isolette_Data_ModelStatus_Payload}

  def set_Config_Isolette_Data_ModelStatus_Payload(config: Config_Isolette_Data_ModelStatus_Payload): RandomLib ={
    config_Isolette_Data_ModelStatus_Payload = config
    return this
  }

  // ============= Isolette_Data_Model.TempWstatus_impl ===================
  def alwaysTrue_Isolette_Data_ModelTempWstatus_impl(v: Isolette_Data_Model.TempWstatus_impl): B = {return T}

  var config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl = Config_Isolette_Data_ModelTempWstatus_impl(100, _verbose, alwaysTrue_Isolette_Data_ModelTempWstatus_impl _)

  def get_Config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl = {return config_Isolette_Data_ModelTempWstatus_impl}

  def set_Config_Isolette_Data_ModelTempWstatus_impl(config: Config_Isolette_Data_ModelTempWstatus_impl): RandomLib ={
    config_Isolette_Data_ModelTempWstatus_impl = config
    return this
  }

  // ============= Isolette_Data_Model.TempWstatus_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelTempWstatus_impl_Payload(v: Isolette_Data_Model.TempWstatus_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload = Config_Isolette_Data_ModelTempWstatus_impl_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelTempWstatus_impl_Payload _)

  def get_Config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload = {return config_Isolette_Data_ModelTempWstatus_impl_Payload}

  def set_Config_Isolette_Data_ModelTempWstatus_impl_Payload(config: Config_Isolette_Data_ModelTempWstatus_impl_Payload): RandomLib ={
    config_Isolette_Data_ModelTempWstatus_impl_Payload = config
    return this
  }

  // ============= Isolette_Data_Model.Temp_impl ===================
  def alwaysTrue_Isolette_Data_ModelTemp_impl(v: Isolette_Data_Model.Temp_impl): B = {return T}

  var config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl = Config_Isolette_Data_ModelTemp_impl(100, _verbose, alwaysTrue_Isolette_Data_ModelTemp_impl _)

  def get_Config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl = {return config_Isolette_Data_ModelTemp_impl}

  def set_Config_Isolette_Data_ModelTemp_impl(config: Config_Isolette_Data_ModelTemp_impl): RandomLib ={
    config_Isolette_Data_ModelTemp_impl = config
    return this
  }

  // ============= Isolette_Data_Model.Temp_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelTemp_impl_Payload(v: Isolette_Data_Model.Temp_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload = Config_Isolette_Data_ModelTemp_impl_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelTemp_impl_Payload _)

  def get_Config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload = {return config_Isolette_Data_ModelTemp_impl_Payload}

  def set_Config_Isolette_Data_ModelTemp_impl_Payload(config: Config_Isolette_Data_ModelTemp_impl_Payload): RandomLib ={
    config_Isolette_Data_ModelTemp_impl_Payload = config
    return this
  }

  // ============= Isolette_Data_Model.ValueStatus.Type ===================
  def alwaysTrue_Isolette_Data_ModelValueStatusType(v: Isolette_Data_Model.ValueStatus.Type): B = {return T}

  var config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType = Config_Isolette_Data_ModelValueStatusType(100, _verbose, alwaysTrue_Isolette_Data_ModelValueStatusType _)

  def get_Config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType = {return config_Isolette_Data_ModelValueStatusType}

  def set_Config_Isolette_Data_ModelValueStatusType(config: Config_Isolette_Data_ModelValueStatusType): RandomLib ={
    config_Isolette_Data_ModelValueStatusType = config
    return this
  }

  // ============= Isolette_Data_Model.ValueStatus_Payload ===================
  def alwaysTrue_Isolette_Data_ModelValueStatus_Payload(v: Isolette_Data_Model.ValueStatus_Payload): B = {return T}

  var config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload = Config_Isolette_Data_ModelValueStatus_Payload(100, _verbose, alwaysTrue_Isolette_Data_ModelValueStatus_Payload _)

  def get_Config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload = {return config_Isolette_Data_ModelValueStatus_Payload}

  def set_Config_Isolette_Data_ModelValueStatus_Payload(config: Config_Isolette_Data_ModelValueStatus_Payload): RandomLib ={
    config_Isolette_Data_ModelValueStatus_Payload = config
    return this
  }

  // ============= Isolette_Environment.Heat.Type ===================
  def alwaysTrue_Isolette_EnvironmentHeatType(v: Isolette_Environment.Heat.Type): B = {return T}

  var config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType = Config_Isolette_EnvironmentHeatType(100, _verbose, alwaysTrue_Isolette_EnvironmentHeatType _)

  def get_Config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType = {return config_Isolette_EnvironmentHeatType}

  def set_Config_Isolette_EnvironmentHeatType(config: Config_Isolette_EnvironmentHeatType): RandomLib ={
    config_Isolette_EnvironmentHeatType = config
    return this
  }

  // ============= Isolette_Environment.Heat_Payload ===================
  def alwaysTrue_Isolette_EnvironmentHeat_Payload(v: Isolette_Environment.Heat_Payload): B = {return T}

  var config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload = Config_Isolette_EnvironmentHeat_Payload(100, _verbose, alwaysTrue_Isolette_EnvironmentHeat_Payload _)

  def get_Config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload = {return config_Isolette_EnvironmentHeat_Payload}

  def set_Config_Isolette_EnvironmentHeat_Payload(config: Config_Isolette_EnvironmentHeat_Payload): RandomLib ={
    config_Isolette_EnvironmentHeat_Payload = config
    return this
  }

  // ============= Isolette_Environment.Interface_Interaction.Type ===================
  def alwaysTrue_Isolette_EnvironmentInterface_InteractionType(v: Isolette_Environment.Interface_Interaction.Type): B = {return T}

  var config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType = Config_Isolette_EnvironmentInterface_InteractionType(100, _verbose, alwaysTrue_Isolette_EnvironmentInterface_InteractionType _)

  def get_Config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType = {return config_Isolette_EnvironmentInterface_InteractionType}

  def set_Config_Isolette_EnvironmentInterface_InteractionType(config: Config_Isolette_EnvironmentInterface_InteractionType): RandomLib ={
    config_Isolette_EnvironmentInterface_InteractionType = config
    return this
  }

  // ============= Isolette_Environment.Interface_Interaction_Payload ===================
  def alwaysTrue_Isolette_EnvironmentInterface_Interaction_Payload(v: Isolette_Environment.Interface_Interaction_Payload): B = {return T}

  var config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload = Config_Isolette_EnvironmentInterface_Interaction_Payload(100, _verbose, alwaysTrue_Isolette_EnvironmentInterface_Interaction_Payload _)

  def get_Config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload = {return config_Isolette_EnvironmentInterface_Interaction_Payload}

  def set_Config_Isolette_EnvironmentInterface_Interaction_Payload(config: Config_Isolette_EnvironmentInterface_Interaction_Payload): RandomLib ={
    config_Isolette_EnvironmentInterface_Interaction_Payload = config
    return this
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container ===================
  def alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container(v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container): B = {return T}

  var config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container = Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container _)

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container = {return config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container}

  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container): RandomLib ={
    config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container = config
    return this
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P ===================
  def alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P(v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P): B = {return T}

  var config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P = Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P(100, _verbose, alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P _)

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P = {return config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P}

  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P): RandomLib ={
    config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P = config
    return this
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS ===================
  def alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS(v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS): B = {return T}

  var config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS = Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS(100, _verbose, alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS _)

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS = {return config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS}

  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS): RandomLib ={
    config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS = config
    return this
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container ===================
  def alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container(v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container): B = {return T}

  var config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container = Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container _)

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container = {return config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container}

  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container): RandomLib ={
    config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container = config
    return this
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P ===================
  def alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P(v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P): B = {return T}

  var config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P = Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P(100, _verbose, alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P _)

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P = {return config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P}

  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P): RandomLib ={
    config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P = config
    return this
  }

  // ============= Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS ===================
  def alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(v: Monitor.Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS): B = {return T}

  var config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS = Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(100, _verbose, alwaysTrue_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS _)

  def get_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS = {return config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS}

  def set_Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(config: Config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS): RandomLib ={
    config_MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS = config
    return this
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container ===================
  def alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container(v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container): B = {return T}

  var config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container = Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container _)

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container = {return config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container}

  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container): RandomLib ={
    config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container = config
    return this
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P ===================
  def alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P): B = {return T}

  var config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P = Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(100, _verbose, alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P _)

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P = {return config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P}

  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P): RandomLib ={
    config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P = config
    return this
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS ===================
  def alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS): B = {return T}

  var config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS = Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(100, _verbose, alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS _)

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS = {return config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS}

  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS): RandomLib ={
    config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS = config
    return this
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container ===================
  def alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container(v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container): B = {return T}

  var config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container = Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container _)

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container = {return config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container}

  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container): RandomLib ={
    config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container = config
    return this
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P ===================
  def alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P): B = {return T}

  var config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P = Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(100, _verbose, alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P _)

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P = {return config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P}

  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P): RandomLib ={
    config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P = config
    return this
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS ===================
  def alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS): B = {return T}

  var config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS = Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(100, _verbose, alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS _)

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS = {return config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS}

  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS): RandomLib ={
    config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container ===================
  def alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container(v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container): B = {return T}

  var config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container = Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container _)

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container = {return config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container}

  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container): RandomLib ={
    config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P ===================
  def alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P): B = {return T}

  var config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P = Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(100, _verbose, alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P _)

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P = {return config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P}

  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P): RandomLib ={
    config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS ===================
  def alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS): B = {return T}

  var config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS = Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(100, _verbose, alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS _)

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS = {return config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS}

  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS): RandomLib ={
    config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container ===================
  def alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container(v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container): B = {return T}

  var config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container = Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container _)

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container = {return config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container}

  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container): RandomLib ={
    config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P ===================
  def alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P): B = {return T}

  var config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P = Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(100, _verbose, alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P _)

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P = {return config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P}

  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P): RandomLib ={
    config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS ===================
  def alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS): B = {return T}

  var config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS = Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(100, _verbose, alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS _)

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS = {return config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS}

  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS): RandomLib ={
    config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container ===================
  def alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container(v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container): B = {return T}

  var config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container = Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container _)

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container = {return config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container}

  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container): RandomLib ={
    config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P ===================
  def alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P): B = {return T}

  var config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P = Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(100, _verbose, alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P _)

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P = {return config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P}

  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P): RandomLib ={
    config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS ===================
  def alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS): B = {return T}

  var config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS = Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(100, _verbose, alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS _)

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS = {return config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS}

  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS): RandomLib ={
    config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container ===================
  def alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container(v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container): B = {return T}

  var config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container = Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container _)

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container = {return config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container}

  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container): RandomLib ={
    config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P ===================
  def alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P): B = {return T}

  var config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P = Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(100, _verbose, alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P _)

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P = {return config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P}

  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P): RandomLib ={
    config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P = config
    return this
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS ===================
  def alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS): B = {return T}

  var config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS = Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(100, _verbose, alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS _)

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS = {return config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS}

  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS): RandomLib ={
    config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS = config
    return this
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container ===================
  def alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container(v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container): B = {return T}

  var config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container = Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container _)

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container = {return config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container}

  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container): RandomLib ={
    config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container = config
    return this
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P ===================
  def alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P(v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P): B = {return T}

  var config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P = Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P(100, _verbose, alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P _)

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P = {return config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P}

  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P): RandomLib ={
    config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P = config
    return this
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS ===================
  def alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS(v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS): B = {return T}

  var config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS = Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS(100, _verbose, alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS _)

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS = {return config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS}

  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS): RandomLib ={
    config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS = config
    return this
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container ===================
  def alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container(v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container): B = {return T}

  var config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container = Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container _)

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container = {return config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container}

  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container): RandomLib ={
    config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container = config
    return this
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P ===================
  def alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P(v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P): B = {return T}

  var config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P = Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P(100, _verbose, alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P _)

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P = {return config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P}

  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P): RandomLib ={
    config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P = config
    return this
  }

  // ============= Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS ===================
  def alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS(v: Regulate.Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS): B = {return T}

  var config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS = Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS(100, _verbose, alwaysTrue_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS _)

  def get_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS = {return config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS}

  def set_Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS(config: Config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS): RandomLib ={
    config_RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS = config
    return this
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container ===================
  def alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container(v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container): B = {return T}

  var config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container = Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container _)

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container = {return config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container}

  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container): RandomLib ={
    config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container = config
    return this
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P ===================
  def alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P): B = {return T}

  var config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P = Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(100, _verbose, alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P _)

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P = {return config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P}

  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P): RandomLib ={
    config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P = config
    return this
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS ===================
  def alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS): B = {return T}

  var config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS = Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(100, _verbose, alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS _)

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS = {return config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS}

  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS): RandomLib ={
    config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS = config
    return this
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container ===================
  def alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container(v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container): B = {return T}

  var config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container = Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container _)

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container = {return config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container}

  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container): RandomLib ={
    config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container = config
    return this
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P ===================
  def alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P): B = {return T}

  var config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P = Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(100, _verbose, alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P _)

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P = {return config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P}

  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P): RandomLib ={
    config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P = config
    return this
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS ===================
  def alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS): B = {return T}

  var config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS = Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(100, _verbose, alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS _)

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS = {return config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS}

  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS): RandomLib ={
    config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container ===================
  def alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container(v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container): B = {return T}

  var config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container = Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container _)

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container = {return config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container}

  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container): RandomLib ={
    config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P ===================
  def alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P): B = {return T}

  var config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P = Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(100, _verbose, alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P _)

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P = {return config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P}

  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P): RandomLib ={
    config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS ===================
  def alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS): B = {return T}

  var config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS = Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(100, _verbose, alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS _)

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS = {return config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS}

  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS): RandomLib ={
    config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container ===================
  def alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container(v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container): B = {return T}

  var config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container = Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container _)

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container = {return config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container}

  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container): RandomLib ={
    config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P ===================
  def alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P): B = {return T}

  var config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P = Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(100, _verbose, alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P _)

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P = {return config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P}

  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P): RandomLib ={
    config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS ===================
  def alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS): B = {return T}

  var config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS = Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(100, _verbose, alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS _)

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS = {return config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS}

  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS): RandomLib ={
    config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container ===================
  def alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container(v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container): B = {return T}

  var config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container = Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container _)

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container = {return config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container}

  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container): RandomLib ={
    config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P ===================
  def alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P): B = {return T}

  var config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P = Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(100, _verbose, alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P _)

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P = {return config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P}

  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P): RandomLib ={
    config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS ===================
  def alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS): B = {return T}

  var config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS = Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(100, _verbose, alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS _)

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS = {return config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS}

  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS): RandomLib ={
    config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container ===================
  def alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container(v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container): B = {return T}

  var config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container = Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container _)

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container = {return config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container}

  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container): RandomLib ={
    config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P ===================
  def alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P): B = {return T}

  var config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P = Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(100, _verbose, alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P _)

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P = {return config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P}

  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P): RandomLib ={
    config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P = config
    return this
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS ===================
  def alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS): B = {return T}

  var config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS = Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(100, _verbose, alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS _)

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS = {return config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS}

  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS): RandomLib ={
    config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS = config
    return this
  }
}

