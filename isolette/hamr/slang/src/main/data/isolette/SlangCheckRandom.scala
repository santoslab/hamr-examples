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

Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVectors.scala

Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectors.scala

Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectors.scala

Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectors.scala

Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectors.scala

Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectors.scala

DataContent.scala

*/

@msig trait RandomLibI {
  def gen: org.sireum.Random.Gen

  def get_Size: Z
  def set_Size(s: Z): Unit

  // ========  Z ==========
    def get_Config_Z: Config_Z
    def set_Config_Z(config: Config_Z): Unit

    def nextISZZ(): ISZ[Z] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[Z] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextZ()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionZ(): Option[Z] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextZ())
      } else {
        return None()
      }
    }

  // ========  B ==========
    def get_Config_B: Config_B
    def set_Config_B(config: Config_B): Unit

    def nextISZ_B(): ISZ[B] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[B] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextB()
        }

        return temp
    }

    def nextB(): B = {
      var r = gen.nextB()
      if(get_Config_B.attempts >= 0) {
       for (i <- 0 to get_Config_B.attempts) {
         if (get_Config_B.filter(r)) {
           return r
         }
         println(s"Retrying for failing value: $r")
         r = gen.nextB()
       }
      } else {
       while(T) {
         if (get_Config_B.filter(r)) {
           return r
         }
         println(s"Retrying for failing value: $r")
         r = gen.nextB()
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

    def nextOptionB(): Option[B] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextB())
      } else {
        return None()
      }
    }

  // ========  C ==========
    def get_Config_C: Config_C
    def set_Config_C(config: Config_C): Unit

    def nextISZ_C(): ISZ[C] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[C] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextC()
        }

        return temp
    }

    def nextC(): C = {
      var r = gen.nextC()
      if(get_Config_C.attempts >= 0) {
       for (i <- 0 to get_Config_C.attempts) {
         if (get_Config_C.filter(r)) {
           return r
         }
         println(s"Retrying for failing value: $r")
         r = gen.nextC()
       }
      } else {
       while(T) {
         if (get_Config_C.filter(r)) {
           return r
         }
         println(s"Retrying for failing value: $r")
         r = gen.nextC()
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

    def nextOptionC(): Option[C] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextC())
      } else {
        return None()
      }
    }

  // ========  R ==========
    def get_Config_R: Config_R
    def set_Config_R(config: Config_R): Unit

    def nextISZR(): ISZ[R] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[R] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextR()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionR(): Option[R] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextR())
      } else {
        return None()
      }
    }

  // ========  F32 ==========
    def get_Config_F32: Config_F32
    def set_Config_F32(config: Config_F32): Unit

    def nextISZF32(): ISZ[F32] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[F32] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextF32()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionF32(): Option[F32] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextF32())
      } else {
        return None()
      }
    }

  // ========  F64 ==========
    def get_Config_F64: Config_F64
    def set_Config_F64(config: Config_F64): Unit

    def nextISZF64(): ISZ[F64] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[F64] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextF64()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionF64(): Option[F64] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextF64())
      } else {
        return None()
      }
    }

  // ========  S8 ==========
    def get_Config_S8: Config_S8
    def set_Config_S8(config: Config_S8): Unit

    def nextISZS8(): ISZ[S8] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[S8] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextS8()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionS8(): Option[S8] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextS8())
      } else {
        return None()
      }
    }

  // ========  S16 ==========
    def get_Config_S16: Config_S16
    def set_Config_S16(config: Config_S16): Unit

    def nextISZS16(): ISZ[S16] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[S16] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextS16()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionS16(): Option[S16] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextS16())
      } else {
        return None()
      }
    }

  // ========  S32 ==========
    def get_Config_S32: Config_S32
    def set_Config_S32(config: Config_S32): Unit

    def nextISZS32(): ISZ[S32] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[S32] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextS32()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionS32(): Option[S32] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextS32())
      } else {
        return None()
      }
    }

  // ========  S64 ==========
    def get_Config_S64: Config_S64
    def set_Config_S64(config: Config_S64): Unit

    def nextISZS64(): ISZ[S64] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[S64] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextS64()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionS64(): Option[S64] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextS64())
      } else {
        return None()
      }
    }

  // ========  U8 ==========
    def get_Config_U8: Config_U8
    def set_Config_U8(config: Config_U8): Unit

    def nextISZU8(): ISZ[U8] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[U8] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextU8()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionU8(): Option[U8] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextU8())
      } else {
        return None()
      }
    }

  // ========  U16 ==========
    def get_Config_U16: Config_U16
    def set_Config_U16(config: Config_U16): Unit

    def nextISZU16(): ISZ[U16] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[U16] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextU16()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionU16(): Option[U16] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextU16())
      } else {
        return None()
      }
    }

  // ========  U32 ==========
    def get_Config_U32: Config_U32
    def set_Config_U32(config: Config_U32): Unit

    def nextISZU32(): ISZ[U32] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[U32] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextU32()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionU32(): Option[U32] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextU32())
      } else {
        return None()
      }
    }

  // ========  U64 ==========
    def get_Config_U64: Config_U64
    def set_Config_U64(config: Config_U64): Unit

    def nextISZU64(): ISZ[U64] = {
     val length: Z = gen.nextZBetween(0, get_Size)
        var temp: ISZ[U64] = ISZ()
        for (r <- 0 until length) {
          temp = temp :+ nextU64()
        }

        return temp
    }

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
         println(s"Retrying for failing value: $r")
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
         println(s"Retrying for failing value: $r")
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

    def nextOptionU64(): Option[U64] = {
      val none: Z = gen.nextZBetween(0,1)

      if(none == 0) {
        return Some(nextU64())
      } else {
        return None()
      }
    }

  def nextString(): String = {
    val length: Z = gen.nextZBetween(0, get_Size)
    var str: String = ""
    for(r <- 0 until length){
      str = s"${str}${gen.nextC().string}"
    }

    return str
  }

  // ============= art.DataContent ===================

  def get_Config__artDataContent: Config__artDataContent
  def set_Config__artDataContent(config: Config__artDataContent): Unit

  def nextISZ_artDataContent(): ISZ[art.DataContent] = {
    val length: Z = gen.nextZBetween(0, get_Size)
    var temp: ISZ[art.DataContent] = ISZ()
    for (r <- 0 until length) {
      temp = temp :+ next_artDataContent()
    }

    return temp
  }

  def next_artDataContent(): art.DataContent = {
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelFailure_Flag_impl_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelMonitor_Mode_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelOn_Off_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelPhysicalTemp_impl_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelRegulator_Mode_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelStatus_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelTempWstatus_impl_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelTemp_impl_Payload_Id, _artDataContent_DataTypeId.Isolette_Data_ModelValueStatus_Payload_Id, _artDataContent_DataTypeId.Isolette_EnvironmentHeat_Payload_Id, _artDataContent_DataTypeId.Isolette_EnvironmentInterface_Interaction_Payload_Id)

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
      case _ => halt("Invalid Child")
    }


    if(get_Config__artDataContent.attempts >= 0) {
     for(i <- 0 to get_Config__artDataContent.attempts) {
       if(get_Config__artDataContent.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
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
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config__artDataContent.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
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
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOption_artDataContent(): Option[art.DataContent] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(next_artDataContent())
    } else {
      return None()
    }
  }

  // ============= art.Empty ===================

  def get_Config__artEmpty: Config__artEmpty
  def set_Config__artEmpty(config: Config__artEmpty): Unit

  def nextISZ_artEmpty(): ISZ[art.Empty] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[art.Empty] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ next_artEmpty()
     }

     return temp
  }

  def next_artEmpty(): art.Empty = {

    var v: art.Empty = art.Empty()

    if(get_Config__artEmpty.attempts >= 0) {
     for(i <- 0 to get_Config__artEmpty.attempts) {
        if(get_Config__artEmpty.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        v = art.Empty()
     }
    } else {
     while(T) {
       if(get_Config__artEmpty.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       v = art.Empty()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOption_artEmpty(): Option[art.Empty] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(next_artEmpty())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Boolean_Payload ===================

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload
  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): Unit

  def nextISZBase_TypesBoolean_Payload(): ISZ[Base_Types.Boolean_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Boolean_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesBoolean_Payload()
     }

     return temp
  }

  def nextBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
    var value: B = nextB()

    var v: Base_Types.Boolean_Payload = Base_Types.Boolean_Payload(value)

    if(get_Config_Base_TypesBoolean_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBoolean_Payload.attempts) {
        if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextB()
        v = Base_Types.Boolean_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextB()
       v = Base_Types.Boolean_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesBoolean_Payload(): Option[Base_Types.Boolean_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesBoolean_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Integer_Payload ===================

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload
  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): Unit

  def nextISZBase_TypesInteger_Payload(): ISZ[Base_Types.Integer_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Integer_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesInteger_Payload()
     }

     return temp
  }

  def nextBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
    var value: Z = nextZ()

    var v: Base_Types.Integer_Payload = Base_Types.Integer_Payload(value)

    if(get_Config_Base_TypesInteger_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_Payload.attempts) {
        if(get_Config_Base_TypesInteger_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextZ()
        v = Base_Types.Integer_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextZ()
       v = Base_Types.Integer_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesInteger_Payload(): Option[Base_Types.Integer_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesInteger_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Integer_8_Payload ===================

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload
  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): Unit

  def nextISZBase_TypesInteger_8_Payload(): ISZ[Base_Types.Integer_8_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Integer_8_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesInteger_8_Payload()
     }

     return temp
  }

  def nextBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
    var value: S8 = nextS8()

    var v: Base_Types.Integer_8_Payload = Base_Types.Integer_8_Payload(value)

    if(get_Config_Base_TypesInteger_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_8_Payload.attempts) {
        if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextS8()
        v = Base_Types.Integer_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextS8()
       v = Base_Types.Integer_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesInteger_8_Payload(): Option[Base_Types.Integer_8_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesInteger_8_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Integer_16_Payload ===================

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload
  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): Unit

  def nextISZBase_TypesInteger_16_Payload(): ISZ[Base_Types.Integer_16_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Integer_16_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesInteger_16_Payload()
     }

     return temp
  }

  def nextBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
    var value: S16 = nextS16()

    var v: Base_Types.Integer_16_Payload = Base_Types.Integer_16_Payload(value)

    if(get_Config_Base_TypesInteger_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_16_Payload.attempts) {
        if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextS16()
        v = Base_Types.Integer_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextS16()
       v = Base_Types.Integer_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesInteger_16_Payload(): Option[Base_Types.Integer_16_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesInteger_16_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Integer_32_Payload ===================

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload
  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): Unit

  def nextISZBase_TypesInteger_32_Payload(): ISZ[Base_Types.Integer_32_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Integer_32_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesInteger_32_Payload()
     }

     return temp
  }

  def nextBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
    var value: S32 = nextS32()

    var v: Base_Types.Integer_32_Payload = Base_Types.Integer_32_Payload(value)

    if(get_Config_Base_TypesInteger_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_32_Payload.attempts) {
        if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextS32()
        v = Base_Types.Integer_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextS32()
       v = Base_Types.Integer_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesInteger_32_Payload(): Option[Base_Types.Integer_32_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesInteger_32_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Integer_64_Payload ===================

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload
  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): Unit

  def nextISZBase_TypesInteger_64_Payload(): ISZ[Base_Types.Integer_64_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Integer_64_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesInteger_64_Payload()
     }

     return temp
  }

  def nextBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
    var value: S64 = nextS64()

    var v: Base_Types.Integer_64_Payload = Base_Types.Integer_64_Payload(value)

    if(get_Config_Base_TypesInteger_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_64_Payload.attempts) {
        if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextS64()
        v = Base_Types.Integer_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextS64()
       v = Base_Types.Integer_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesInteger_64_Payload(): Option[Base_Types.Integer_64_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesInteger_64_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Unsigned_8_Payload ===================

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload
  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): Unit

  def nextISZBase_TypesUnsigned_8_Payload(): ISZ[Base_Types.Unsigned_8_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Unsigned_8_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesUnsigned_8_Payload()
     }

     return temp
  }

  def nextBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
    var value: U8 = nextU8()

    var v: Base_Types.Unsigned_8_Payload = Base_Types.Unsigned_8_Payload(value)

    if(get_Config_Base_TypesUnsigned_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_8_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextU8()
        v = Base_Types.Unsigned_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextU8()
       v = Base_Types.Unsigned_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesUnsigned_8_Payload(): Option[Base_Types.Unsigned_8_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesUnsigned_8_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Unsigned_16_Payload ===================

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload
  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): Unit

  def nextISZBase_TypesUnsigned_16_Payload(): ISZ[Base_Types.Unsigned_16_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Unsigned_16_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesUnsigned_16_Payload()
     }

     return temp
  }

  def nextBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
    var value: U16 = nextU16()

    var v: Base_Types.Unsigned_16_Payload = Base_Types.Unsigned_16_Payload(value)

    if(get_Config_Base_TypesUnsigned_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_16_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextU16()
        v = Base_Types.Unsigned_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextU16()
       v = Base_Types.Unsigned_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesUnsigned_16_Payload(): Option[Base_Types.Unsigned_16_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesUnsigned_16_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Unsigned_32_Payload ===================

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload
  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): Unit

  def nextISZBase_TypesUnsigned_32_Payload(): ISZ[Base_Types.Unsigned_32_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Unsigned_32_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesUnsigned_32_Payload()
     }

     return temp
  }

  def nextBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
    var value: U32 = nextU32()

    var v: Base_Types.Unsigned_32_Payload = Base_Types.Unsigned_32_Payload(value)

    if(get_Config_Base_TypesUnsigned_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_32_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextU32()
        v = Base_Types.Unsigned_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextU32()
       v = Base_Types.Unsigned_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesUnsigned_32_Payload(): Option[Base_Types.Unsigned_32_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesUnsigned_32_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Unsigned_64_Payload ===================

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload
  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): Unit

  def nextISZBase_TypesUnsigned_64_Payload(): ISZ[Base_Types.Unsigned_64_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Unsigned_64_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesUnsigned_64_Payload()
     }

     return temp
  }

  def nextBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
    var value: U64 = nextU64()

    var v: Base_Types.Unsigned_64_Payload = Base_Types.Unsigned_64_Payload(value)

    if(get_Config_Base_TypesUnsigned_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_64_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextU64()
        v = Base_Types.Unsigned_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextU64()
       v = Base_Types.Unsigned_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesUnsigned_64_Payload(): Option[Base_Types.Unsigned_64_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesUnsigned_64_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Float_Payload ===================

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload
  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): Unit

  def nextISZBase_TypesFloat_Payload(): ISZ[Base_Types.Float_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Float_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesFloat_Payload()
     }

     return temp
  }

  def nextBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
    var value: R = nextR()

    var v: Base_Types.Float_Payload = Base_Types.Float_Payload(value)

    if(get_Config_Base_TypesFloat_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_Payload.attempts) {
        if(get_Config_Base_TypesFloat_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextR()
        v = Base_Types.Float_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextR()
       v = Base_Types.Float_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesFloat_Payload(): Option[Base_Types.Float_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesFloat_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Float_32_Payload ===================

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload
  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): Unit

  def nextISZBase_TypesFloat_32_Payload(): ISZ[Base_Types.Float_32_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Float_32_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesFloat_32_Payload()
     }

     return temp
  }

  def nextBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
    var value: F32 = nextF32()

    var v: Base_Types.Float_32_Payload = Base_Types.Float_32_Payload(value)

    if(get_Config_Base_TypesFloat_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_32_Payload.attempts) {
        if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextF32()
        v = Base_Types.Float_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextF32()
       v = Base_Types.Float_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesFloat_32_Payload(): Option[Base_Types.Float_32_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesFloat_32_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Float_64_Payload ===================

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload
  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): Unit

  def nextISZBase_TypesFloat_64_Payload(): ISZ[Base_Types.Float_64_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Float_64_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesFloat_64_Payload()
     }

     return temp
  }

  def nextBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
    var value: F64 = nextF64()

    var v: Base_Types.Float_64_Payload = Base_Types.Float_64_Payload(value)

    if(get_Config_Base_TypesFloat_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_64_Payload.attempts) {
        if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextF64()
        v = Base_Types.Float_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextF64()
       v = Base_Types.Float_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesFloat_64_Payload(): Option[Base_Types.Float_64_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesFloat_64_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Character_Payload ===================

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload
  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): Unit

  def nextISZBase_TypesCharacter_Payload(): ISZ[Base_Types.Character_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Character_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesCharacter_Payload()
     }

     return temp
  }

  def nextBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
    var value: C = nextC()

    var v: Base_Types.Character_Payload = Base_Types.Character_Payload(value)

    if(get_Config_Base_TypesCharacter_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesCharacter_Payload.attempts) {
        if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextC()
        v = Base_Types.Character_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextC()
       v = Base_Types.Character_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesCharacter_Payload(): Option[Base_Types.Character_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesCharacter_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.String_Payload ===================

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload
  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): Unit

  def nextISZBase_TypesString_Payload(): ISZ[Base_Types.String_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.String_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesString_Payload()
     }

     return temp
  }

  def nextBase_TypesString_Payload(): Base_Types.String_Payload = {
    var value: String = nextString()

    var v: Base_Types.String_Payload = Base_Types.String_Payload(value)

    if(get_Config_Base_TypesString_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesString_Payload.attempts) {
        if(get_Config_Base_TypesString_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextString()
        v = Base_Types.String_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesString_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextString()
       v = Base_Types.String_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesString_Payload(): Option[Base_Types.String_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesString_Payload())
    } else {
      return None()
    }
  }

  // ============= Base_Types.Bits_Payload ===================

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload
  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): Unit

  def nextISZBase_TypesBits_Payload(): ISZ[Base_Types.Bits_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Base_Types.Bits_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextBase_TypesBits_Payload()
     }

     return temp
  }

  def nextBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
    var value: ISZ[B] = nextISZ_B()

    var v: Base_Types.Bits_Payload = Base_Types.Bits_Payload(value)

    if(get_Config_Base_TypesBits_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBits_Payload.attempts) {
        if(get_Config_Base_TypesBits_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextISZ_B()
        v = Base_Types.Bits_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBits_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextISZ_B()
       v = Base_Types.Bits_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionBase_TypesBits_Payload(): Option[Base_Types.Bits_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextBase_TypesBits_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl ===================

  def get_Config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl
  def set_Config_Isolette_Data_ModelFailure_Flag_impl(config: Config_Isolette_Data_ModelFailure_Flag_impl): Unit

  def nextISZIsolette_Data_ModelFailure_Flag_impl(): ISZ[Isolette_Data_Model.Failure_Flag_impl] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.Failure_Flag_impl] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelFailure_Flag_impl()
     }

     return temp
  }

  def nextIsolette_Data_ModelFailure_Flag_impl(): Isolette_Data_Model.Failure_Flag_impl = {
    var value: B = nextB()

    var v: Isolette_Data_Model.Failure_Flag_impl = Isolette_Data_Model.Failure_Flag_impl(value)

    if(get_Config_Isolette_Data_ModelFailure_Flag_impl.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelFailure_Flag_impl.attempts) {
        if(get_Config_Isolette_Data_ModelFailure_Flag_impl.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextB()
        v = Isolette_Data_Model.Failure_Flag_impl(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelFailure_Flag_impl.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextB()
       v = Isolette_Data_Model.Failure_Flag_impl(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelFailure_Flag_impl(): Option[Isolette_Data_Model.Failure_Flag_impl] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelFailure_Flag_impl())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl_Payload ===================

  def get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload
  def set_Config_Isolette_Data_ModelFailure_Flag_impl_Payload(config: Config_Isolette_Data_ModelFailure_Flag_impl_Payload): Unit

  def nextISZIsolette_Data_ModelFailure_Flag_impl_Payload(): ISZ[Isolette_Data_Model.Failure_Flag_impl_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.Failure_Flag_impl_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelFailure_Flag_impl_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelFailure_Flag_impl_Payload(): Isolette_Data_Model.Failure_Flag_impl_Payload = {
    var value: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Isolette_Data_Model.Failure_Flag_impl_Payload = Isolette_Data_Model.Failure_Flag_impl_Payload(value)

    if(get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Isolette_Data_Model.Failure_Flag_impl_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Isolette_Data_Model.Failure_Flag_impl_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelFailure_Flag_impl_Payload(): Option[Isolette_Data_Model.Failure_Flag_impl_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelFailure_Flag_impl_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Monitor_Mode.Type ===================

  def get_Config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType
  def set_Config_Isolette_Data_ModelMonitor_ModeType(config: Config_Isolette_Data_ModelMonitor_ModeType): Unit

  def nextIsolette_Data_ModelMonitor_ModeType(): Isolette_Data_Model.Monitor_Mode.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Monitor_Mode.numOfElements-1)

    var v: Isolette_Data_Model.Monitor_Mode.Type = isolette.Isolette_Data_Model.Monitor_Mode.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelMonitor_ModeType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelMonitor_ModeType.attempts) {
       if(get_Config_Isolette_Data_ModelMonitor_ModeType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Monitor_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Monitor_Mode.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelMonitor_ModeType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Monitor_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Monitor_Mode.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelMonitor_ModeType(): Option[Isolette_Data_Model.Monitor_Mode.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelMonitor_ModeType())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Monitor_Mode_Payload ===================

  def get_Config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload
  def set_Config_Isolette_Data_ModelMonitor_Mode_Payload(config: Config_Isolette_Data_ModelMonitor_Mode_Payload): Unit

  def nextISZIsolette_Data_ModelMonitor_Mode_Payload(): ISZ[Isolette_Data_Model.Monitor_Mode_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.Monitor_Mode_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelMonitor_Mode_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelMonitor_Mode_Payload(): Isolette_Data_Model.Monitor_Mode_Payload = {
    var value: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()

    var v: Isolette_Data_Model.Monitor_Mode_Payload = Isolette_Data_Model.Monitor_Mode_Payload(value)

    if(get_Config_Isolette_Data_ModelMonitor_Mode_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelMonitor_Mode_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelMonitor_Mode_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelMonitor_ModeType()
        v = Isolette_Data_Model.Monitor_Mode_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelMonitor_Mode_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelMonitor_ModeType()
       v = Isolette_Data_Model.Monitor_Mode_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelMonitor_Mode_Payload(): Option[Isolette_Data_Model.Monitor_Mode_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelMonitor_Mode_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.On_Off.Type ===================

  def get_Config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType
  def set_Config_Isolette_Data_ModelOn_OffType(config: Config_Isolette_Data_ModelOn_OffType): Unit

  def nextIsolette_Data_ModelOn_OffType(): Isolette_Data_Model.On_Off.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.On_Off.numOfElements-1)

    var v: Isolette_Data_Model.On_Off.Type = isolette.Isolette_Data_Model.On_Off.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelOn_OffType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelOn_OffType.attempts) {
       if(get_Config_Isolette_Data_ModelOn_OffType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.On_Off.numOfElements-1)
       v = isolette.Isolette_Data_Model.On_Off.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelOn_OffType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.On_Off.numOfElements-1)
       v = isolette.Isolette_Data_Model.On_Off.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelOn_OffType(): Option[Isolette_Data_Model.On_Off.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelOn_OffType())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.On_Off_Payload ===================

  def get_Config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload
  def set_Config_Isolette_Data_ModelOn_Off_Payload(config: Config_Isolette_Data_ModelOn_Off_Payload): Unit

  def nextISZIsolette_Data_ModelOn_Off_Payload(): ISZ[Isolette_Data_Model.On_Off_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.On_Off_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelOn_Off_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelOn_Off_Payload(): Isolette_Data_Model.On_Off_Payload = {
    var value: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()

    var v: Isolette_Data_Model.On_Off_Payload = Isolette_Data_Model.On_Off_Payload(value)

    if(get_Config_Isolette_Data_ModelOn_Off_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelOn_Off_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelOn_Off_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelOn_OffType()
        v = Isolette_Data_Model.On_Off_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelOn_Off_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelOn_OffType()
       v = Isolette_Data_Model.On_Off_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelOn_Off_Payload(): Option[Isolette_Data_Model.On_Off_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelOn_Off_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl ===================

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl
  def set_Config_Isolette_Data_ModelPhysicalTemp_impl(config: Config_Isolette_Data_ModelPhysicalTemp_impl): Unit

  def nextISZIsolette_Data_ModelPhysicalTemp_impl(): ISZ[Isolette_Data_Model.PhysicalTemp_impl] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.PhysicalTemp_impl] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelPhysicalTemp_impl()
     }

     return temp
  }

  def nextIsolette_Data_ModelPhysicalTemp_impl(): Isolette_Data_Model.PhysicalTemp_impl = {
    var value: F32 = nextF32()

    var v: Isolette_Data_Model.PhysicalTemp_impl = Isolette_Data_Model.PhysicalTemp_impl(value)

    if(get_Config_Isolette_Data_ModelPhysicalTemp_impl.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelPhysicalTemp_impl.attempts) {
        if(get_Config_Isolette_Data_ModelPhysicalTemp_impl.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextF32()
        v = Isolette_Data_Model.PhysicalTemp_impl(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelPhysicalTemp_impl.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextF32()
       v = Isolette_Data_Model.PhysicalTemp_impl(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelPhysicalTemp_impl(): Option[Isolette_Data_Model.PhysicalTemp_impl] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelPhysicalTemp_impl())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl_Payload ===================

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload
  def set_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(config: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload): Unit

  def nextISZIsolette_Data_ModelPhysicalTemp_impl_Payload(): ISZ[Isolette_Data_Model.PhysicalTemp_impl_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.PhysicalTemp_impl_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelPhysicalTemp_impl_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelPhysicalTemp_impl_Payload(): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
    var value: Isolette_Data_Model.PhysicalTemp_impl = nextIsolette_Data_ModelPhysicalTemp_impl()

    var v: Isolette_Data_Model.PhysicalTemp_impl_Payload = Isolette_Data_Model.PhysicalTemp_impl_Payload(value)

    if(get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelPhysicalTemp_impl()
        v = Isolette_Data_Model.PhysicalTemp_impl_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelPhysicalTemp_impl()
       v = Isolette_Data_Model.PhysicalTemp_impl_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelPhysicalTemp_impl_Payload(): Option[Isolette_Data_Model.PhysicalTemp_impl_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelPhysicalTemp_impl_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Regulator_Mode.Type ===================

  def get_Config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType
  def set_Config_Isolette_Data_ModelRegulator_ModeType(config: Config_Isolette_Data_ModelRegulator_ModeType): Unit

  def nextIsolette_Data_ModelRegulator_ModeType(): Isolette_Data_Model.Regulator_Mode.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Regulator_Mode.numOfElements-1)

    var v: Isolette_Data_Model.Regulator_Mode.Type = isolette.Isolette_Data_Model.Regulator_Mode.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelRegulator_ModeType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelRegulator_ModeType.attempts) {
       if(get_Config_Isolette_Data_ModelRegulator_ModeType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Regulator_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Regulator_Mode.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelRegulator_ModeType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Regulator_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Regulator_Mode.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelRegulator_ModeType(): Option[Isolette_Data_Model.Regulator_Mode.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelRegulator_ModeType())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Regulator_Mode_Payload ===================

  def get_Config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload
  def set_Config_Isolette_Data_ModelRegulator_Mode_Payload(config: Config_Isolette_Data_ModelRegulator_Mode_Payload): Unit

  def nextISZIsolette_Data_ModelRegulator_Mode_Payload(): ISZ[Isolette_Data_Model.Regulator_Mode_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.Regulator_Mode_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelRegulator_Mode_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelRegulator_Mode_Payload(): Isolette_Data_Model.Regulator_Mode_Payload = {
    var value: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()

    var v: Isolette_Data_Model.Regulator_Mode_Payload = Isolette_Data_Model.Regulator_Mode_Payload(value)

    if(get_Config_Isolette_Data_ModelRegulator_Mode_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelRegulator_Mode_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelRegulator_Mode_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelRegulator_ModeType()
        v = Isolette_Data_Model.Regulator_Mode_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelRegulator_Mode_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelRegulator_ModeType()
       v = Isolette_Data_Model.Regulator_Mode_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelRegulator_Mode_Payload(): Option[Isolette_Data_Model.Regulator_Mode_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelRegulator_Mode_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Status.Type ===================

  def get_Config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType
  def set_Config_Isolette_Data_ModelStatusType(config: Config_Isolette_Data_ModelStatusType): Unit

  def nextIsolette_Data_ModelStatusType(): Isolette_Data_Model.Status.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Status.numOfElements-1)

    var v: Isolette_Data_Model.Status.Type = isolette.Isolette_Data_Model.Status.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelStatusType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelStatusType.attempts) {
       if(get_Config_Isolette_Data_ModelStatusType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Status.numOfElements-1)
       v = isolette.Isolette_Data_Model.Status.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelStatusType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Status.numOfElements-1)
       v = isolette.Isolette_Data_Model.Status.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelStatusType(): Option[Isolette_Data_Model.Status.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelStatusType())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Status_Payload ===================

  def get_Config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload
  def set_Config_Isolette_Data_ModelStatus_Payload(config: Config_Isolette_Data_ModelStatus_Payload): Unit

  def nextISZIsolette_Data_ModelStatus_Payload(): ISZ[Isolette_Data_Model.Status_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.Status_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelStatus_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelStatus_Payload(): Isolette_Data_Model.Status_Payload = {
    var value: Isolette_Data_Model.Status.Type = nextIsolette_Data_ModelStatusType()

    var v: Isolette_Data_Model.Status_Payload = Isolette_Data_Model.Status_Payload(value)

    if(get_Config_Isolette_Data_ModelStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelStatus_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelStatus_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelStatusType()
        v = Isolette_Data_Model.Status_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelStatus_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelStatusType()
       v = Isolette_Data_Model.Status_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelStatus_Payload(): Option[Isolette_Data_Model.Status_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelStatus_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.TempWstatus_impl ===================

  def get_Config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl
  def set_Config_Isolette_Data_ModelTempWstatus_impl(config: Config_Isolette_Data_ModelTempWstatus_impl): Unit

  def nextISZIsolette_Data_ModelTempWstatus_impl(): ISZ[Isolette_Data_Model.TempWstatus_impl] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.TempWstatus_impl] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelTempWstatus_impl()
     }

     return temp
  }

  def nextIsolette_Data_ModelTempWstatus_impl(): Isolette_Data_Model.TempWstatus_impl = {
    var value: F32 = nextF32()
    var status: Isolette_Data_Model.ValueStatus.Type = nextIsolette_Data_ModelValueStatusType()

    var v: Isolette_Data_Model.TempWstatus_impl = Isolette_Data_Model.TempWstatus_impl(value, status)

    if(get_Config_Isolette_Data_ModelTempWstatus_impl.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelTempWstatus_impl.attempts) {
        if(get_Config_Isolette_Data_ModelTempWstatus_impl.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextF32()
        status = nextIsolette_Data_ModelValueStatusType()
        v = Isolette_Data_Model.TempWstatus_impl(value, status)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelTempWstatus_impl.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextF32()
       status = nextIsolette_Data_ModelValueStatusType()
       v = Isolette_Data_Model.TempWstatus_impl(value, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelTempWstatus_impl(): Option[Isolette_Data_Model.TempWstatus_impl] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelTempWstatus_impl())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.TempWstatus_impl_Payload ===================

  def get_Config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload
  def set_Config_Isolette_Data_ModelTempWstatus_impl_Payload(config: Config_Isolette_Data_ModelTempWstatus_impl_Payload): Unit

  def nextISZIsolette_Data_ModelTempWstatus_impl_Payload(): ISZ[Isolette_Data_Model.TempWstatus_impl_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.TempWstatus_impl_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelTempWstatus_impl_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelTempWstatus_impl_Payload(): Isolette_Data_Model.TempWstatus_impl_Payload = {
    var value: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Isolette_Data_Model.TempWstatus_impl_Payload = Isolette_Data_Model.TempWstatus_impl_Payload(value)

    if(get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelTempWstatus_impl()
        v = Isolette_Data_Model.TempWstatus_impl_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelTempWstatus_impl()
       v = Isolette_Data_Model.TempWstatus_impl_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelTempWstatus_impl_Payload(): Option[Isolette_Data_Model.TempWstatus_impl_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelTempWstatus_impl_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Temp_impl ===================

  def get_Config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl
  def set_Config_Isolette_Data_ModelTemp_impl(config: Config_Isolette_Data_ModelTemp_impl): Unit

  def nextISZIsolette_Data_ModelTemp_impl(): ISZ[Isolette_Data_Model.Temp_impl] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.Temp_impl] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelTemp_impl()
     }

     return temp
  }

  def nextIsolette_Data_ModelTemp_impl(): Isolette_Data_Model.Temp_impl = {
    var value: F32 = nextF32()

    var v: Isolette_Data_Model.Temp_impl = Isolette_Data_Model.Temp_impl(value)

    if(get_Config_Isolette_Data_ModelTemp_impl.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelTemp_impl.attempts) {
        if(get_Config_Isolette_Data_ModelTemp_impl.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextF32()
        v = Isolette_Data_Model.Temp_impl(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelTemp_impl.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextF32()
       v = Isolette_Data_Model.Temp_impl(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelTemp_impl(): Option[Isolette_Data_Model.Temp_impl] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelTemp_impl())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.Temp_impl_Payload ===================

  def get_Config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload
  def set_Config_Isolette_Data_ModelTemp_impl_Payload(config: Config_Isolette_Data_ModelTemp_impl_Payload): Unit

  def nextISZIsolette_Data_ModelTemp_impl_Payload(): ISZ[Isolette_Data_Model.Temp_impl_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.Temp_impl_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelTemp_impl_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelTemp_impl_Payload(): Isolette_Data_Model.Temp_impl_Payload = {
    var value: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Isolette_Data_Model.Temp_impl_Payload = Isolette_Data_Model.Temp_impl_Payload(value)

    if(get_Config_Isolette_Data_ModelTemp_impl_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelTemp_impl_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelTemp_impl_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelTemp_impl()
        v = Isolette_Data_Model.Temp_impl_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelTemp_impl_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelTemp_impl()
       v = Isolette_Data_Model.Temp_impl_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelTemp_impl_Payload(): Option[Isolette_Data_Model.Temp_impl_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelTemp_impl_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.ValueStatus.Type ===================

  def get_Config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType
  def set_Config_Isolette_Data_ModelValueStatusType(config: Config_Isolette_Data_ModelValueStatusType): Unit

  def nextIsolette_Data_ModelValueStatusType(): Isolette_Data_Model.ValueStatus.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.ValueStatus.numOfElements-1)

    var v: Isolette_Data_Model.ValueStatus.Type = isolette.Isolette_Data_Model.ValueStatus.byOrdinal(ordinal).get
    if(get_Config_Isolette_Data_ModelValueStatusType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelValueStatusType.attempts) {
       if(get_Config_Isolette_Data_ModelValueStatusType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.ValueStatus.numOfElements-1)
       v = isolette.Isolette_Data_Model.ValueStatus.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_Data_ModelValueStatusType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.ValueStatus.numOfElements-1)
       v = isolette.Isolette_Data_Model.ValueStatus.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelValueStatusType(): Option[Isolette_Data_Model.ValueStatus.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelValueStatusType())
    } else {
      return None()
    }
  }

  // ============= Isolette_Data_Model.ValueStatus_Payload ===================

  def get_Config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload
  def set_Config_Isolette_Data_ModelValueStatus_Payload(config: Config_Isolette_Data_ModelValueStatus_Payload): Unit

  def nextISZIsolette_Data_ModelValueStatus_Payload(): ISZ[Isolette_Data_Model.ValueStatus_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Data_Model.ValueStatus_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_Data_ModelValueStatus_Payload()
     }

     return temp
  }

  def nextIsolette_Data_ModelValueStatus_Payload(): Isolette_Data_Model.ValueStatus_Payload = {
    var value: Isolette_Data_Model.ValueStatus.Type = nextIsolette_Data_ModelValueStatusType()

    var v: Isolette_Data_Model.ValueStatus_Payload = Isolette_Data_Model.ValueStatus_Payload(value)

    if(get_Config_Isolette_Data_ModelValueStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_Data_ModelValueStatus_Payload.attempts) {
        if(get_Config_Isolette_Data_ModelValueStatus_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_Data_ModelValueStatusType()
        v = Isolette_Data_Model.ValueStatus_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_Data_ModelValueStatus_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_Data_ModelValueStatusType()
       v = Isolette_Data_Model.ValueStatus_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_Data_ModelValueStatus_Payload(): Option[Isolette_Data_Model.ValueStatus_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_Data_ModelValueStatus_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Environment.Heat.Type ===================

  def get_Config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType
  def set_Config_Isolette_EnvironmentHeatType(config: Config_Isolette_EnvironmentHeatType): Unit

  def nextIsolette_EnvironmentHeatType(): Isolette_Environment.Heat.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Environment.Heat.numOfElements-1)

    var v: Isolette_Environment.Heat.Type = isolette.Isolette_Environment.Heat.byOrdinal(ordinal).get
    if(get_Config_Isolette_EnvironmentHeatType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_EnvironmentHeatType.attempts) {
       if(get_Config_Isolette_EnvironmentHeatType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Heat.numOfElements-1)
       v = isolette.Isolette_Environment.Heat.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_EnvironmentHeatType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Heat.numOfElements-1)
       v = isolette.Isolette_Environment.Heat.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_EnvironmentHeatType(): Option[Isolette_Environment.Heat.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_EnvironmentHeatType())
    } else {
      return None()
    }
  }

  // ============= Isolette_Environment.Heat_Payload ===================

  def get_Config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload
  def set_Config_Isolette_EnvironmentHeat_Payload(config: Config_Isolette_EnvironmentHeat_Payload): Unit

  def nextISZIsolette_EnvironmentHeat_Payload(): ISZ[Isolette_Environment.Heat_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Environment.Heat_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_EnvironmentHeat_Payload()
     }

     return temp
  }

  def nextIsolette_EnvironmentHeat_Payload(): Isolette_Environment.Heat_Payload = {
    var value: Isolette_Environment.Heat.Type = nextIsolette_EnvironmentHeatType()

    var v: Isolette_Environment.Heat_Payload = Isolette_Environment.Heat_Payload(value)

    if(get_Config_Isolette_EnvironmentHeat_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_EnvironmentHeat_Payload.attempts) {
        if(get_Config_Isolette_EnvironmentHeat_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_EnvironmentHeatType()
        v = Isolette_Environment.Heat_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_EnvironmentHeat_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_EnvironmentHeatType()
       v = Isolette_Environment.Heat_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_EnvironmentHeat_Payload(): Option[Isolette_Environment.Heat_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_EnvironmentHeat_Payload())
    } else {
      return None()
    }
  }

  // ============= Isolette_Environment.Interface_Interaction.Type ===================

  def get_Config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType
  def set_Config_Isolette_EnvironmentInterface_InteractionType(config: Config_Isolette_EnvironmentInterface_InteractionType): Unit

  def nextIsolette_EnvironmentInterface_InteractionType(): Isolette_Environment.Interface_Interaction.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Environment.Interface_Interaction.numOfElements-1)

    var v: Isolette_Environment.Interface_Interaction.Type = isolette.Isolette_Environment.Interface_Interaction.byOrdinal(ordinal).get
    if(get_Config_Isolette_EnvironmentInterface_InteractionType.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_EnvironmentInterface_InteractionType.attempts) {
       if(get_Config_Isolette_EnvironmentInterface_InteractionType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Interface_Interaction.numOfElements-1)
       v = isolette.Isolette_Environment.Interface_Interaction.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Isolette_EnvironmentInterface_InteractionType.filter(v)) {
        return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Interface_Interaction.numOfElements-1)
       v = isolette.Isolette_Environment.Interface_Interaction.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_EnvironmentInterface_InteractionType(): Option[Isolette_Environment.Interface_Interaction.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_EnvironmentInterface_InteractionType())
    } else {
      return None()
    }
  }

  // ============= Isolette_Environment.Interface_Interaction_Payload ===================

  def get_Config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload
  def set_Config_Isolette_EnvironmentInterface_Interaction_Payload(config: Config_Isolette_EnvironmentInterface_Interaction_Payload): Unit

  def nextISZIsolette_EnvironmentInterface_Interaction_Payload(): ISZ[Isolette_Environment.Interface_Interaction_Payload] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Isolette_Environment.Interface_Interaction_Payload] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextIsolette_EnvironmentInterface_Interaction_Payload()
     }

     return temp
  }

  def nextIsolette_EnvironmentInterface_Interaction_Payload(): Isolette_Environment.Interface_Interaction_Payload = {
    var value: Isolette_Environment.Interface_Interaction.Type = nextIsolette_EnvironmentInterface_InteractionType()

    var v: Isolette_Environment.Interface_Interaction_Payload = Isolette_Environment.Interface_Interaction_Payload(value)

    if(get_Config_Isolette_EnvironmentInterface_Interaction_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Isolette_EnvironmentInterface_Interaction_Payload.attempts) {
        if(get_Config_Isolette_EnvironmentInterface_Interaction_Payload.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        value = nextIsolette_EnvironmentInterface_InteractionType()
        v = Isolette_Environment.Interface_Interaction_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Isolette_EnvironmentInterface_Interaction_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = nextIsolette_EnvironmentInterface_InteractionType()
       v = Isolette_Environment.Interface_Interaction_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionIsolette_EnvironmentInterface_Interaction_Payload(): Option[Isolette_Environment.Interface_Interaction_Payload] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextIsolette_EnvironmentInterface_Interaction_Payload())
    } else {
      return None()
    }
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector ===================

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector
  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector): Unit

  def nextISZMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(): ISZ[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector()
     }

     return temp
  }

  def nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_upper_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)

    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector.attempts) {
        if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(): Option[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL ===================

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL
  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL): Unit

  def nextISZMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(): ISZ[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL()
     }

     return temp
  }

  def nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(): Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL = {
    var In_lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_upper_alarm_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)

    if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL.attempts) {
        if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        In_lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
        v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       In_lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       api_upper_alarm_temp = nextIsolette_Data_ModelTemp_impl()
       v = Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_alarm_temp, api_monitor_mode, api_upper_alarm_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(): Option[Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextMonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL())
    } else {
      return None()
    }
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector ===================

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector
  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector): Unit

  def nextISZMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(): ISZ[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector()
     }

     return temp
  }

  def nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)

    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector.attempts) {
        if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(): Option[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL ===================

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL
  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL): Unit

  def nextISZMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(): ISZ[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL()
     }

     return temp
  }

  def nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(): Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL = {
    var In_lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_monitor_mode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_upper_alarm_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)

    if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL.attempts) {
        if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        In_lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
        api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       In_lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_monitor_mode = nextIsolette_Data_ModelMonitor_ModeType()
       api_upper_alarm_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_alarm_tempWstatus, api_monitor_mode, api_upper_alarm_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(): Option[Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextMonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL())
    } else {
      return None()
    }
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector ===================

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector
  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector): Unit

  def nextISZMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(): ISZ[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector()
     }

     return temp
  }

  def nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(api_current_tempWstatus, api_interface_failure, api_internal_failure)

    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector.attempts) {
        if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(): Option[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL ===================

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL
  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL): Unit

  def nextISZMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(): ISZ[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL()
     }

     return temp
  }

  def nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(): Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL = {
    var In_lastMonitorMode: Isolette_Data_Model.Monitor_Mode.Type = nextIsolette_Data_ModelMonitor_ModeType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)

    if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL.attempts >= 0) {
     for(i <- 0 to get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL.attempts) {
        if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        In_lastMonitorMode = nextIsolette_Data_ModelMonitor_ModeType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       In_lastMonitorMode = nextIsolette_Data_ModelMonitor_ModeType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(In_lastMonitorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(): Option[Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextMonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL())
    } else {
      return None()
    }
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector ===================

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector
  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector): Unit

  def nextISZRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(): ISZ[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector()
     }

     return temp
  }

  def nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_upper_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)

    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector.attempts) {
        if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
        v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
       v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(): Option[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL ===================

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL
  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL): Unit

  def nextISZRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(): ISZ[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL()
     }

     return temp
  }

  def nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(): Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL = {
    var In_lastCmd: Isolette_Data_Model.On_Off.Type = nextIsolette_Data_ModelOn_OffType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_upper_desired_temp: Isolette_Data_Model.Temp_impl = nextIsolette_Data_ModelTemp_impl()

    var v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)

    if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL.attempts) {
        if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        In_lastCmd = nextIsolette_Data_ModelOn_OffType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
        v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       In_lastCmd = nextIsolette_Data_ModelOn_OffType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_temp = nextIsolette_Data_ModelTemp_impl()
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       api_upper_desired_temp = nextIsolette_Data_ModelTemp_impl()
       v = Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(): Option[Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL())
    } else {
      return None()
    }
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector ===================

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector
  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector): Unit

  def nextISZRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(): ISZ[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector()
     }

     return temp
  }

  def nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(): Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()

    var v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)

    if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector.attempts) {
        if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
        api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_lower_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_regulator_mode = nextIsolette_Data_ModelRegulator_ModeType()
       api_upper_desired_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       v = Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(): Option[Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector ===================

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector
  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector): Unit

  def nextISZRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(): ISZ[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector()
     }

     return temp
  }

  def nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector = {
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(api_current_tempWstatus, api_interface_failure, api_internal_failure)

    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector.attempts) {
        if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(): Option[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL ===================

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL
  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL): Unit

  def nextISZRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(): ISZ[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL()
     }

     return temp
  }

  def nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(): Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL = {
    var In_lastRegulatorMode: Isolette_Data_Model.Regulator_Mode.Type = nextIsolette_Data_ModelRegulator_ModeType()
    var api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl = nextIsolette_Data_ModelTempWstatus_impl()
    var api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()
    var api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = nextIsolette_Data_ModelFailure_Flag_impl()

    var v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(In_lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)

    if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL.attempts >= 0) {
     for(i <- 0 to get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL.attempts) {
        if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        In_lastRegulatorMode = nextIsolette_Data_ModelRegulator_ModeType()
        api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
        api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
        v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(In_lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    } else {
     while(T) {
       if(get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       In_lastRegulatorMode = nextIsolette_Data_ModelRegulator_ModeType()
       api_current_tempWstatus = nextIsolette_Data_ModelTempWstatus_impl()
       api_interface_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       api_internal_failure = nextIsolette_Data_ModelFailure_Flag_impl()
       v = Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(In_lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(): Option[Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL())
    } else {
      return None()
    }
  }
}

@record class RandomLib(val gen: org.sireum.Random.Gen) extends RandomLibI {

  var size: Z = 50

  def get_Size: Z = {return size}

  def set_Size(s: Z): Unit ={
    size = s
  }

  // ============= Z ===================
  def alwaysTrue_Z(v: Z): B = {return T}

  var config_Z: Config_Z = Config_Z(None(), None(), 100, alwaysTrue_Z _)
  def get_Config_Z: Config_Z = {return config_Z}

  def set_Config_Z(config: Config_Z): Unit ={
    config_Z = config
  }

  // ============= B ===================
  def alwaysTrue_B(v: B): B = {return T}

  var config_B: Config_B = Config_B(100, alwaysTrue_B _)
  def get_Config_B: Config_B = {return config_B}

  def set_Config_B(config: Config_B): Unit ={
    config_B = config
  }

  // ============= C ===================
  def alwaysTrue_C(v: C): B = {return T}

  var config_C: Config_C = Config_C(100, alwaysTrue_C _)
  def get_Config_C: Config_C = {return config_C}

  def set_Config_C(config: Config_C): Unit ={
    config_C = config
  }

  // ============= R ===================
  def alwaysTrue_R(v: R): B = {return T}

  var config_R: Config_R = Config_R(None(), None(), 100, alwaysTrue_R _)
  def get_Config_R: Config_R = {return config_R}

  def set_Config_R(config: Config_R): Unit ={
    config_R = config
  }

  // ============= F32 ===================
  def alwaysTrue_F32(v: F32): B = {return T}

  var config_F32: Config_F32 = Config_F32(None(), None(), 100, alwaysTrue_F32 _)
  def get_Config_F32: Config_F32 = {return config_F32}

  def set_Config_F32(config: Config_F32): Unit ={
    config_F32 = config
  }

  // ============= F64 ===================
  def alwaysTrue_F64(v: F64): B = {return T}

  var config_F64: Config_F64 = Config_F64(None(), None(), 100, alwaysTrue_F64 _)
  def get_Config_F64: Config_F64 = {return config_F64}

  def set_Config_F64(config: Config_F64): Unit ={
    config_F64 = config
  }

  // ============= S8 ===================
  def alwaysTrue_S8(v: S8): B = {return T}

  var config_S8: Config_S8 = Config_S8(None(), None(), 100, alwaysTrue_S8 _)
  def get_Config_S8: Config_S8 = {return config_S8}

  def set_Config_S8(config: Config_S8): Unit ={
    config_S8 = config
  }

  // ============= S16 ===================
  def alwaysTrue_S16(v: S16): B = {return T}

  var config_S16: Config_S16 = Config_S16(None(), None(), 100, alwaysTrue_S16 _)
  def get_Config_S16: Config_S16 = {return config_S16}

  def set_Config_S16(config: Config_S16): Unit ={
    config_S16 = config
  }

  // ============= S32 ===================
  def alwaysTrue_S32(v: S32): B = {return T}

  var config_S32: Config_S32 = Config_S32(None(), None(), 100, alwaysTrue_S32 _)
  def get_Config_S32: Config_S32 = {return config_S32}

  def set_Config_S32(config: Config_S32): Unit ={
    config_S32 = config
  }

  // ============= S64 ===================
  def alwaysTrue_S64(v: S64): B = {return T}

  var config_S64: Config_S64 = Config_S64(None(), None(), 100, alwaysTrue_S64 _)
  def get_Config_S64: Config_S64 = {return config_S64}

  def set_Config_S64(config: Config_S64): Unit ={
    config_S64 = config
  }

  // ============= U8 ===================
  def alwaysTrue_U8(v: U8): B = {return T}

  var config_U8: Config_U8 = Config_U8(None(), None(), 100, alwaysTrue_U8 _)
  def get_Config_U8: Config_U8 = {return config_U8}

  def set_Config_U8(config: Config_U8): Unit ={
    config_U8 = config
  }

  // ============= U16 ===================
  def alwaysTrue_U16(v: U16): B = {return T}

  var config_U16: Config_U16 = Config_U16(None(), None(), 100, alwaysTrue_U16 _)
  def get_Config_U16: Config_U16 = {return config_U16}

  def set_Config_U16(config: Config_U16): Unit ={
    config_U16 = config
  }

  // ============= U32 ===================
  def alwaysTrue_U32(v: U32): B = {return T}

  var config_U32: Config_U32 = Config_U32(None(), None(), 100, alwaysTrue_U32 _)
  def get_Config_U32: Config_U32 = {return config_U32}

  def set_Config_U32(config: Config_U32): Unit ={
    config_U32 = config
  }

  // ============= U64 ===================
  def alwaysTrue_U64(v: U64): B = {return T}

  var config_U64: Config_U64 = Config_U64(None(), None(), 100, alwaysTrue_U64 _)
  def get_Config_U64: Config_U64 = {return config_U64}

  def set_Config_U64(config: Config_U64): Unit ={
    config_U64 = config
  }

  // ============= art.DataContent ===================
  def alwaysTrue__artDataContent(v: art.DataContent): B = {return T}

  var config__artDataContent: Config__artDataContent = Config__artDataContent(100, F, ISZ(), alwaysTrue__artDataContent _)

  def get_Config__artDataContent: Config__artDataContent = {return config__artDataContent}

  def set_Config__artDataContent(config: Config__artDataContent): Unit ={
    config__artDataContent = config
  }

  // ============= art.Empty ===================
  def alwaysTrue__artEmpty(v: art.Empty): B = {return T}

  var config__artEmpty: Config__artEmpty = Config__artEmpty(100, alwaysTrue__artEmpty _)

  def get_Config__artEmpty: Config__artEmpty = {return config__artEmpty}

  def set_Config__artEmpty(config: Config__artEmpty): Unit ={
    config__artEmpty = config
  }

  // ============= Base_Types.Boolean_Payload ===================
  def alwaysTrue_Base_TypesBoolean_Payload(v: Base_Types.Boolean_Payload): B = {return T}

  var config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = Config_Base_TypesBoolean_Payload(100, alwaysTrue_Base_TypesBoolean_Payload _)

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = {return config_Base_TypesBoolean_Payload}

  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): Unit ={
    config_Base_TypesBoolean_Payload = config
  }

  // ============= Base_Types.Integer_Payload ===================
  def alwaysTrue_Base_TypesInteger_Payload(v: Base_Types.Integer_Payload): B = {return T}

  var config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = Config_Base_TypesInteger_Payload(100, alwaysTrue_Base_TypesInteger_Payload _)

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = {return config_Base_TypesInteger_Payload}

  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): Unit ={
    config_Base_TypesInteger_Payload = config
  }

  // ============= Base_Types.Integer_8_Payload ===================
  def alwaysTrue_Base_TypesInteger_8_Payload(v: Base_Types.Integer_8_Payload): B = {return T}

  var config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = Config_Base_TypesInteger_8_Payload(100, alwaysTrue_Base_TypesInteger_8_Payload _)

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = {return config_Base_TypesInteger_8_Payload}

  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): Unit ={
    config_Base_TypesInteger_8_Payload = config
  }

  // ============= Base_Types.Integer_16_Payload ===================
  def alwaysTrue_Base_TypesInteger_16_Payload(v: Base_Types.Integer_16_Payload): B = {return T}

  var config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = Config_Base_TypesInteger_16_Payload(100, alwaysTrue_Base_TypesInteger_16_Payload _)

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = {return config_Base_TypesInteger_16_Payload}

  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): Unit ={
    config_Base_TypesInteger_16_Payload = config
  }

  // ============= Base_Types.Integer_32_Payload ===================
  def alwaysTrue_Base_TypesInteger_32_Payload(v: Base_Types.Integer_32_Payload): B = {return T}

  var config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = Config_Base_TypesInteger_32_Payload(100, alwaysTrue_Base_TypesInteger_32_Payload _)

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = {return config_Base_TypesInteger_32_Payload}

  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): Unit ={
    config_Base_TypesInteger_32_Payload = config
  }

  // ============= Base_Types.Integer_64_Payload ===================
  def alwaysTrue_Base_TypesInteger_64_Payload(v: Base_Types.Integer_64_Payload): B = {return T}

  var config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = Config_Base_TypesInteger_64_Payload(100, alwaysTrue_Base_TypesInteger_64_Payload _)

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = {return config_Base_TypesInteger_64_Payload}

  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): Unit ={
    config_Base_TypesInteger_64_Payload = config
  }

  // ============= Base_Types.Unsigned_8_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_8_Payload(v: Base_Types.Unsigned_8_Payload): B = {return T}

  var config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = Config_Base_TypesUnsigned_8_Payload(100, alwaysTrue_Base_TypesUnsigned_8_Payload _)

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = {return config_Base_TypesUnsigned_8_Payload}

  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): Unit ={
    config_Base_TypesUnsigned_8_Payload = config
  }

  // ============= Base_Types.Unsigned_16_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_16_Payload(v: Base_Types.Unsigned_16_Payload): B = {return T}

  var config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = Config_Base_TypesUnsigned_16_Payload(100, alwaysTrue_Base_TypesUnsigned_16_Payload _)

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = {return config_Base_TypesUnsigned_16_Payload}

  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): Unit ={
    config_Base_TypesUnsigned_16_Payload = config
  }

  // ============= Base_Types.Unsigned_32_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_32_Payload(v: Base_Types.Unsigned_32_Payload): B = {return T}

  var config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = Config_Base_TypesUnsigned_32_Payload(100, alwaysTrue_Base_TypesUnsigned_32_Payload _)

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = {return config_Base_TypesUnsigned_32_Payload}

  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): Unit ={
    config_Base_TypesUnsigned_32_Payload = config
  }

  // ============= Base_Types.Unsigned_64_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_64_Payload(v: Base_Types.Unsigned_64_Payload): B = {return T}

  var config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = Config_Base_TypesUnsigned_64_Payload(100, alwaysTrue_Base_TypesUnsigned_64_Payload _)

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = {return config_Base_TypesUnsigned_64_Payload}

  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): Unit ={
    config_Base_TypesUnsigned_64_Payload = config
  }

  // ============= Base_Types.Float_Payload ===================
  def alwaysTrue_Base_TypesFloat_Payload(v: Base_Types.Float_Payload): B = {return T}

  var config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = Config_Base_TypesFloat_Payload(100, alwaysTrue_Base_TypesFloat_Payload _)

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = {return config_Base_TypesFloat_Payload}

  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): Unit ={
    config_Base_TypesFloat_Payload = config
  }

  // ============= Base_Types.Float_32_Payload ===================
  def alwaysTrue_Base_TypesFloat_32_Payload(v: Base_Types.Float_32_Payload): B = {return T}

  var config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = Config_Base_TypesFloat_32_Payload(100, alwaysTrue_Base_TypesFloat_32_Payload _)

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = {return config_Base_TypesFloat_32_Payload}

  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): Unit ={
    config_Base_TypesFloat_32_Payload = config
  }

  // ============= Base_Types.Float_64_Payload ===================
  def alwaysTrue_Base_TypesFloat_64_Payload(v: Base_Types.Float_64_Payload): B = {return T}

  var config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = Config_Base_TypesFloat_64_Payload(100, alwaysTrue_Base_TypesFloat_64_Payload _)

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = {return config_Base_TypesFloat_64_Payload}

  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): Unit ={
    config_Base_TypesFloat_64_Payload = config
  }

  // ============= Base_Types.Character_Payload ===================
  def alwaysTrue_Base_TypesCharacter_Payload(v: Base_Types.Character_Payload): B = {return T}

  var config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = Config_Base_TypesCharacter_Payload(100, alwaysTrue_Base_TypesCharacter_Payload _)

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = {return config_Base_TypesCharacter_Payload}

  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): Unit ={
    config_Base_TypesCharacter_Payload = config
  }

  // ============= Base_Types.String_Payload ===================
  def alwaysTrue_Base_TypesString_Payload(v: Base_Types.String_Payload): B = {return T}

  var config_Base_TypesString_Payload: Config_Base_TypesString_Payload = Config_Base_TypesString_Payload(100, alwaysTrue_Base_TypesString_Payload _)

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload = {return config_Base_TypesString_Payload}

  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): Unit ={
    config_Base_TypesString_Payload = config
  }

  // ============= Base_Types.Bits_Payload ===================
  def alwaysTrue_Base_TypesBits_Payload(v: Base_Types.Bits_Payload): B = {return T}

  var config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = Config_Base_TypesBits_Payload(100, alwaysTrue_Base_TypesBits_Payload _)

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = {return config_Base_TypesBits_Payload}

  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): Unit ={
    config_Base_TypesBits_Payload = config
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl ===================
  def alwaysTrue_Isolette_Data_ModelFailure_Flag_impl(v: Isolette_Data_Model.Failure_Flag_impl): B = {return T}

  var config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl = Config_Isolette_Data_ModelFailure_Flag_impl(100, alwaysTrue_Isolette_Data_ModelFailure_Flag_impl _)

  def get_Config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl = {return config_Isolette_Data_ModelFailure_Flag_impl}

  def set_Config_Isolette_Data_ModelFailure_Flag_impl(config: Config_Isolette_Data_ModelFailure_Flag_impl): Unit ={
    config_Isolette_Data_ModelFailure_Flag_impl = config
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelFailure_Flag_impl_Payload(v: Isolette_Data_Model.Failure_Flag_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload = Config_Isolette_Data_ModelFailure_Flag_impl_Payload(100, alwaysTrue_Isolette_Data_ModelFailure_Flag_impl_Payload _)

  def get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload = {return config_Isolette_Data_ModelFailure_Flag_impl_Payload}

  def set_Config_Isolette_Data_ModelFailure_Flag_impl_Payload(config: Config_Isolette_Data_ModelFailure_Flag_impl_Payload): Unit ={
    config_Isolette_Data_ModelFailure_Flag_impl_Payload = config
  }

  // ============= Isolette_Data_Model.Monitor_Mode.Type ===================
  def alwaysTrue_Isolette_Data_ModelMonitor_ModeType(v: Isolette_Data_Model.Monitor_Mode.Type): B = {return T}

  var config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType = Config_Isolette_Data_ModelMonitor_ModeType(100, alwaysTrue_Isolette_Data_ModelMonitor_ModeType _)

  def get_Config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType = {return config_Isolette_Data_ModelMonitor_ModeType}

  def set_Config_Isolette_Data_ModelMonitor_ModeType(config: Config_Isolette_Data_ModelMonitor_ModeType): Unit ={
    config_Isolette_Data_ModelMonitor_ModeType = config
  }

  // ============= Isolette_Data_Model.Monitor_Mode_Payload ===================
  def alwaysTrue_Isolette_Data_ModelMonitor_Mode_Payload(v: Isolette_Data_Model.Monitor_Mode_Payload): B = {return T}

  var config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload = Config_Isolette_Data_ModelMonitor_Mode_Payload(100, alwaysTrue_Isolette_Data_ModelMonitor_Mode_Payload _)

  def get_Config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload = {return config_Isolette_Data_ModelMonitor_Mode_Payload}

  def set_Config_Isolette_Data_ModelMonitor_Mode_Payload(config: Config_Isolette_Data_ModelMonitor_Mode_Payload): Unit ={
    config_Isolette_Data_ModelMonitor_Mode_Payload = config
  }

  // ============= Isolette_Data_Model.On_Off.Type ===================
  def alwaysTrue_Isolette_Data_ModelOn_OffType(v: Isolette_Data_Model.On_Off.Type): B = {return T}

  var config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType = Config_Isolette_Data_ModelOn_OffType(100, alwaysTrue_Isolette_Data_ModelOn_OffType _)

  def get_Config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType = {return config_Isolette_Data_ModelOn_OffType}

  def set_Config_Isolette_Data_ModelOn_OffType(config: Config_Isolette_Data_ModelOn_OffType): Unit ={
    config_Isolette_Data_ModelOn_OffType = config
  }

  // ============= Isolette_Data_Model.On_Off_Payload ===================
  def alwaysTrue_Isolette_Data_ModelOn_Off_Payload(v: Isolette_Data_Model.On_Off_Payload): B = {return T}

  var config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload = Config_Isolette_Data_ModelOn_Off_Payload(100, alwaysTrue_Isolette_Data_ModelOn_Off_Payload _)

  def get_Config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload = {return config_Isolette_Data_ModelOn_Off_Payload}

  def set_Config_Isolette_Data_ModelOn_Off_Payload(config: Config_Isolette_Data_ModelOn_Off_Payload): Unit ={
    config_Isolette_Data_ModelOn_Off_Payload = config
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl ===================
  def alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl(v: Isolette_Data_Model.PhysicalTemp_impl): B = {return T}

  var config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl = Config_Isolette_Data_ModelPhysicalTemp_impl(100, alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl _)

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl = {return config_Isolette_Data_ModelPhysicalTemp_impl}

  def set_Config_Isolette_Data_ModelPhysicalTemp_impl(config: Config_Isolette_Data_ModelPhysicalTemp_impl): Unit ={
    config_Isolette_Data_ModelPhysicalTemp_impl = config
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl_Payload(v: Isolette_Data_Model.PhysicalTemp_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload = Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(100, alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl_Payload _)

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload = {return config_Isolette_Data_ModelPhysicalTemp_impl_Payload}

  def set_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(config: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload): Unit ={
    config_Isolette_Data_ModelPhysicalTemp_impl_Payload = config
  }

  // ============= Isolette_Data_Model.Regulator_Mode.Type ===================
  def alwaysTrue_Isolette_Data_ModelRegulator_ModeType(v: Isolette_Data_Model.Regulator_Mode.Type): B = {return T}

  var config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType = Config_Isolette_Data_ModelRegulator_ModeType(100, alwaysTrue_Isolette_Data_ModelRegulator_ModeType _)

  def get_Config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType = {return config_Isolette_Data_ModelRegulator_ModeType}

  def set_Config_Isolette_Data_ModelRegulator_ModeType(config: Config_Isolette_Data_ModelRegulator_ModeType): Unit ={
    config_Isolette_Data_ModelRegulator_ModeType = config
  }

  // ============= Isolette_Data_Model.Regulator_Mode_Payload ===================
  def alwaysTrue_Isolette_Data_ModelRegulator_Mode_Payload(v: Isolette_Data_Model.Regulator_Mode_Payload): B = {return T}

  var config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload = Config_Isolette_Data_ModelRegulator_Mode_Payload(100, alwaysTrue_Isolette_Data_ModelRegulator_Mode_Payload _)

  def get_Config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload = {return config_Isolette_Data_ModelRegulator_Mode_Payload}

  def set_Config_Isolette_Data_ModelRegulator_Mode_Payload(config: Config_Isolette_Data_ModelRegulator_Mode_Payload): Unit ={
    config_Isolette_Data_ModelRegulator_Mode_Payload = config
  }

  // ============= Isolette_Data_Model.Status.Type ===================
  def alwaysTrue_Isolette_Data_ModelStatusType(v: Isolette_Data_Model.Status.Type): B = {return T}

  var config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType = Config_Isolette_Data_ModelStatusType(100, alwaysTrue_Isolette_Data_ModelStatusType _)

  def get_Config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType = {return config_Isolette_Data_ModelStatusType}

  def set_Config_Isolette_Data_ModelStatusType(config: Config_Isolette_Data_ModelStatusType): Unit ={
    config_Isolette_Data_ModelStatusType = config
  }

  // ============= Isolette_Data_Model.Status_Payload ===================
  def alwaysTrue_Isolette_Data_ModelStatus_Payload(v: Isolette_Data_Model.Status_Payload): B = {return T}

  var config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload = Config_Isolette_Data_ModelStatus_Payload(100, alwaysTrue_Isolette_Data_ModelStatus_Payload _)

  def get_Config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload = {return config_Isolette_Data_ModelStatus_Payload}

  def set_Config_Isolette_Data_ModelStatus_Payload(config: Config_Isolette_Data_ModelStatus_Payload): Unit ={
    config_Isolette_Data_ModelStatus_Payload = config
  }

  // ============= Isolette_Data_Model.TempWstatus_impl ===================
  def alwaysTrue_Isolette_Data_ModelTempWstatus_impl(v: Isolette_Data_Model.TempWstatus_impl): B = {return T}

  var config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl = Config_Isolette_Data_ModelTempWstatus_impl(100, alwaysTrue_Isolette_Data_ModelTempWstatus_impl _)

  def get_Config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl = {return config_Isolette_Data_ModelTempWstatus_impl}

  def set_Config_Isolette_Data_ModelTempWstatus_impl(config: Config_Isolette_Data_ModelTempWstatus_impl): Unit ={
    config_Isolette_Data_ModelTempWstatus_impl = config
  }

  // ============= Isolette_Data_Model.TempWstatus_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelTempWstatus_impl_Payload(v: Isolette_Data_Model.TempWstatus_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload = Config_Isolette_Data_ModelTempWstatus_impl_Payload(100, alwaysTrue_Isolette_Data_ModelTempWstatus_impl_Payload _)

  def get_Config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload = {return config_Isolette_Data_ModelTempWstatus_impl_Payload}

  def set_Config_Isolette_Data_ModelTempWstatus_impl_Payload(config: Config_Isolette_Data_ModelTempWstatus_impl_Payload): Unit ={
    config_Isolette_Data_ModelTempWstatus_impl_Payload = config
  }

  // ============= Isolette_Data_Model.Temp_impl ===================
  def alwaysTrue_Isolette_Data_ModelTemp_impl(v: Isolette_Data_Model.Temp_impl): B = {return T}

  var config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl = Config_Isolette_Data_ModelTemp_impl(100, alwaysTrue_Isolette_Data_ModelTemp_impl _)

  def get_Config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl = {return config_Isolette_Data_ModelTemp_impl}

  def set_Config_Isolette_Data_ModelTemp_impl(config: Config_Isolette_Data_ModelTemp_impl): Unit ={
    config_Isolette_Data_ModelTemp_impl = config
  }

  // ============= Isolette_Data_Model.Temp_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelTemp_impl_Payload(v: Isolette_Data_Model.Temp_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload = Config_Isolette_Data_ModelTemp_impl_Payload(100, alwaysTrue_Isolette_Data_ModelTemp_impl_Payload _)

  def get_Config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload = {return config_Isolette_Data_ModelTemp_impl_Payload}

  def set_Config_Isolette_Data_ModelTemp_impl_Payload(config: Config_Isolette_Data_ModelTemp_impl_Payload): Unit ={
    config_Isolette_Data_ModelTemp_impl_Payload = config
  }

  // ============= Isolette_Data_Model.ValueStatus.Type ===================
  def alwaysTrue_Isolette_Data_ModelValueStatusType(v: Isolette_Data_Model.ValueStatus.Type): B = {return T}

  var config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType = Config_Isolette_Data_ModelValueStatusType(100, alwaysTrue_Isolette_Data_ModelValueStatusType _)

  def get_Config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType = {return config_Isolette_Data_ModelValueStatusType}

  def set_Config_Isolette_Data_ModelValueStatusType(config: Config_Isolette_Data_ModelValueStatusType): Unit ={
    config_Isolette_Data_ModelValueStatusType = config
  }

  // ============= Isolette_Data_Model.ValueStatus_Payload ===================
  def alwaysTrue_Isolette_Data_ModelValueStatus_Payload(v: Isolette_Data_Model.ValueStatus_Payload): B = {return T}

  var config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload = Config_Isolette_Data_ModelValueStatus_Payload(100, alwaysTrue_Isolette_Data_ModelValueStatus_Payload _)

  def get_Config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload = {return config_Isolette_Data_ModelValueStatus_Payload}

  def set_Config_Isolette_Data_ModelValueStatus_Payload(config: Config_Isolette_Data_ModelValueStatus_Payload): Unit ={
    config_Isolette_Data_ModelValueStatus_Payload = config
  }

  // ============= Isolette_Environment.Heat.Type ===================
  def alwaysTrue_Isolette_EnvironmentHeatType(v: Isolette_Environment.Heat.Type): B = {return T}

  var config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType = Config_Isolette_EnvironmentHeatType(100, alwaysTrue_Isolette_EnvironmentHeatType _)

  def get_Config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType = {return config_Isolette_EnvironmentHeatType}

  def set_Config_Isolette_EnvironmentHeatType(config: Config_Isolette_EnvironmentHeatType): Unit ={
    config_Isolette_EnvironmentHeatType = config
  }

  // ============= Isolette_Environment.Heat_Payload ===================
  def alwaysTrue_Isolette_EnvironmentHeat_Payload(v: Isolette_Environment.Heat_Payload): B = {return T}

  var config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload = Config_Isolette_EnvironmentHeat_Payload(100, alwaysTrue_Isolette_EnvironmentHeat_Payload _)

  def get_Config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload = {return config_Isolette_EnvironmentHeat_Payload}

  def set_Config_Isolette_EnvironmentHeat_Payload(config: Config_Isolette_EnvironmentHeat_Payload): Unit ={
    config_Isolette_EnvironmentHeat_Payload = config
  }

  // ============= Isolette_Environment.Interface_Interaction.Type ===================
  def alwaysTrue_Isolette_EnvironmentInterface_InteractionType(v: Isolette_Environment.Interface_Interaction.Type): B = {return T}

  var config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType = Config_Isolette_EnvironmentInterface_InteractionType(100, alwaysTrue_Isolette_EnvironmentInterface_InteractionType _)

  def get_Config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType = {return config_Isolette_EnvironmentInterface_InteractionType}

  def set_Config_Isolette_EnvironmentInterface_InteractionType(config: Config_Isolette_EnvironmentInterface_InteractionType): Unit ={
    config_Isolette_EnvironmentInterface_InteractionType = config
  }

  // ============= Isolette_Environment.Interface_Interaction_Payload ===================
  def alwaysTrue_Isolette_EnvironmentInterface_Interaction_Payload(v: Isolette_Environment.Interface_Interaction_Payload): B = {return T}

  var config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload = Config_Isolette_EnvironmentInterface_Interaction_Payload(100, alwaysTrue_Isolette_EnvironmentInterface_Interaction_Payload _)

  def get_Config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload = {return config_Isolette_EnvironmentInterface_Interaction_Payload}

  def set_Config_Isolette_EnvironmentInterface_Interaction_Payload(config: Config_Isolette_EnvironmentInterface_Interaction_Payload): Unit ={
    config_Isolette_EnvironmentInterface_Interaction_Payload = config
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector ===================
  def alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector): B = {return T}

  var config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector = Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(100, alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector _)

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector = {return config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector}

  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector): Unit ={
    config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVector = config
  }

  // ============= Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL ===================
  def alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(v: Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL): B = {return T}

  var config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL = Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(100, alwaysTrue_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL _)

  def get_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL = {return config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL}

  def set_Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL(config: Config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL): Unit ={
    config_MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_DSC_TestVectorwL = config
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector ===================
  def alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector): B = {return T}

  var config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector = Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(100, alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector _)

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector = {return config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector}

  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector): Unit ={
    config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVector = config
  }

  // ============= Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL ===================
  def alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(v: Monitor.Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL): B = {return T}

  var config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL = Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(100, alwaysTrue_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL _)

  def get_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL = {return config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL}

  def set_Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL(config: Config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL): Unit ={
    config_MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_DSC_TestVectorwL = config
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector ===================
  def alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector): B = {return T}

  var config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector = Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(100, alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector _)

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector = {return config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector}

  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector): Unit ={
    config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVector = config
  }

  // ============= Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL ===================
  def alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(v: Monitor.Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL): B = {return T}

  var config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL = Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(100, alwaysTrue_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL _)

  def get_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL = {return config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL}

  def set_Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL(config: Config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL): Unit ={
    config_MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_DSC_TestVectorwL = config
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector ===================
  def alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector): B = {return T}

  var config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector = Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(100, alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector _)

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector = {return config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector}

  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector): Unit ={
    config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVector = config
  }

  // ============= Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL ===================
  def alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(v: Regulate.Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL): B = {return T}

  var config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL = Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(100, alwaysTrue_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL _)

  def get_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL = {return config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL}

  def set_Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL(config: Config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL): Unit ={
    config_RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_DSC_TestVectorwL = config
  }

  // ============= Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector ===================
  def alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(v: Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector): B = {return T}

  var config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector = Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(100, alwaysTrue_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector _)

  def get_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector = {return config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector}

  def set_Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector(config: Config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector): Unit ={
    config_RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_DSC_TestVector = config
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector ===================
  def alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector): B = {return T}

  var config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector = Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(100, alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector _)

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector = {return config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector}

  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector): Unit ={
    config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVector = config
  }

  // ============= Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL ===================
  def alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(v: Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL): B = {return T}

  var config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL = Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(100, alwaysTrue_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL _)

  def get_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL = {return config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL}

  def set_Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL(config: Config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL): Unit ={
    config_RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_DSC_TestVectorwL = config
  }
}

