// #Sireum

package RTS

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Base_Types.scala

CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVectors.scala

CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVectors.scala

CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVectors.scala

OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVectors.scala

CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVectors.scala

CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVectors.scala

CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVectors.scala

OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVectors.scala

OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVectors.scala

Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVectors.scala

OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVectors.scala

Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVectors.scala

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
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId._artEmpty_Id)

    if(get_Config__artDataContent.additiveTypeFiltering) {
       callEnum = get_Config__artDataContent.typeFilter
    } else {
       for(h <- get_Config__artDataContent.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: art.DataContent = c match {
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
      case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
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
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
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
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
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

  // ============= Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector ===================

  def get_Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector: Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector
  def set_Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(config: Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector): Unit

  def nextISZActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(): ISZ[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector()
     }

     return temp
  }

  def nextActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector = {
    var api_input: B = nextB()
    var api_manualActuatorInput: B = nextB()

    var v: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector = Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(api_input, api_manualActuatorInput)

    if(get_Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector.attempts) {
        if(get_Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_input = nextB()
        api_manualActuatorInput = nextB()
        v = Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(api_input, api_manualActuatorInput)
     }
    } else {
     while(T) {
       if(get_Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_input = nextB()
       api_manualActuatorInput = nextB()
       v = Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(api_input, api_manualActuatorInput)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(): Option[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector ===================

  def get_Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector: Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector
  def set_Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(config: Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector): Unit

  def nextISZActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(): ISZ[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector()
     }

     return temp
  }

  def nextActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector = {
    var api_input: B = nextB()
    var api_manualActuatorInput: B = nextB()

    var v: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector = Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(api_input, api_manualActuatorInput)

    if(get_Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector.attempts) {
        if(get_Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_input = nextB()
        api_manualActuatorInput = nextB()
        v = Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(api_input, api_manualActuatorInput)
     }
    } else {
     while(T) {
       if(get_Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_input = nextB()
       api_manualActuatorInput = nextB()
       v = Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(api_input, api_manualActuatorInput)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(): Option[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector ===================

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector
  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector): Unit

  def nextISZActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(): ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()
    var api_channel3: B = nextB()
    var api_channel4: B = nextB()

    var v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)

    if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        api_channel3 = nextB()
        api_channel4 = nextB()
        v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    } else {
     while(T) {
       if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       api_channel3 = nextB()
       api_channel4 = nextB()
       v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(): Option[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector ===================

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector
  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector): Unit

  def nextISZActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(): ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()
    var api_channel3: B = nextB()
    var api_channel4: B = nextB()

    var v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)

    if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        api_channel3 = nextB()
        api_channel4 = nextB()
        v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    } else {
     while(T) {
       if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       api_channel3 = nextB()
       api_channel4 = nextB()
       v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(): Option[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector ===================

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector
  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector): Unit

  def nextISZActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(): ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()
    var api_channel3: B = nextB()
    var api_channel4: B = nextB()

    var v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)

    if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        api_channel3 = nextB()
        api_channel4 = nextB()
        v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    } else {
     while(T) {
       if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       api_channel3 = nextB()
       api_channel4 = nextB()
       v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(): Option[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector ===================

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector
  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector): Unit

  def nextISZActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(): ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()
    var api_channel3: B = nextB()
    var api_channel4: B = nextB()

    var v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)

    if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        api_channel3 = nextB()
        api_channel4 = nextB()
        v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    } else {
     while(T) {
       if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       api_channel3 = nextB()
       api_channel4 = nextB()
       v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(): Option[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector ===================

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector
  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector): Unit

  def nextISZActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(): ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()
    var api_channel3: B = nextB()
    var api_channel4: B = nextB()

    var v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)

    if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        api_channel3 = nextB()
        api_channel4 = nextB()
        v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    } else {
     while(T) {
       if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       api_channel3 = nextB()
       api_channel4 = nextB()
       v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(): Option[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector ===================

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector
  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector): Unit

  def nextISZActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(): ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()
    var api_channel3: B = nextB()
    var api_channel4: B = nextB()

    var v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)

    if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        api_channel3 = nextB()
        api_channel4 = nextB()
        v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    } else {
     while(T) {
       if(get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       api_channel3 = nextB()
       api_channel4 = nextB()
       v = Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(api_channel1, api_channel2, api_channel3, api_channel4)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(): Option[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector ===================

  def get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector
  def set_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(config: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector): Unit

  def nextISZActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(): ISZ[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()

    var v: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector = Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(api_channel1, api_channel2)

    if(get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        v = Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(api_channel1, api_channel2)
     }
    } else {
     while(T) {
       if(get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       v = Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(api_channel1, api_channel2)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(): Option[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector ===================

  def get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector
  def set_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(config: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector): Unit

  def nextISZActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(): ISZ[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()

    var v: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector = Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(api_channel1, api_channel2)

    if(get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        v = Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(api_channel1, api_channel2)
     }
    } else {
     while(T) {
       if(get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       v = Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(api_channel1, api_channel2)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(): Option[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector ===================

  def get_Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector
  def set_Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(config: Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector): Unit

  def nextISZActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(): ISZ[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()

    var v: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector = Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(api_channel1, api_channel2)

    if(get_Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        v = Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(api_channel1, api_channel2)
     }
    } else {
     while(T) {
       if(get_Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       v = Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(api_channel1, api_channel2)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(): Option[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector())
    } else {
      return None()
    }
  }

  // ============= Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector ===================

  def get_Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector
  def set_Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(config: Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector): Unit

  def nextISZActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(): ISZ[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector] = {
     val length: Z = gen.nextZBetween(0, 256)
     var temp: ISZ[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector] = ISZ()
     for (r <- 0 until length) {
       temp = temp :+ nextActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector()
     }

     return temp
  }

  def nextActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector = {
    var api_channel1: B = nextB()
    var api_channel2: B = nextB()

    var v: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector = Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(api_channel1, api_channel2)

    if(get_Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector.attempts >= 0) {
     for(i <- 0 to get_Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector.attempts) {
        if(get_Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector.filter(v)) {
          return v
        }
        println(s"Retrying for failing value: $v")
        api_channel1 = nextB()
        api_channel2 = nextB()
        v = Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(api_channel1, api_channel2)
     }
    } else {
     while(T) {
       if(get_Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       api_channel1 = nextB()
       api_channel2 = nextB()
       v = Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(api_channel1, api_channel2)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  def nextOptionActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(): Option[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector())
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

  // ============= Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector ===================
  def alwaysTrue_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(v: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector): B = {return T}

  var config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector: Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector = Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(100, alwaysTrue_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector _)

  def get_Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector: Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector = {return config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector}

  def set_Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector(config: Config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector): Unit ={
    config_ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_DSC_TestVector = config
  }

  // ============= Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector ===================
  def alwaysTrue_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(v: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector): B = {return T}

  var config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector: Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector = Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(100, alwaysTrue_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector _)

  def get_Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector: Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector = {return config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector}

  def set_Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector(config: Config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector): Unit ={
    config_ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_DSC_TestVector = config
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector): B = {return T}

  var config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector = Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(100, alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector _)

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector = {return config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector}

  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector): Unit ={
    config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_DSC_TestVector = config
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector): B = {return T}

  var config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector = Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(100, alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector _)

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector = {return config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector}

  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector): Unit ={
    config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_DSC_TestVector = config
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector): B = {return T}

  var config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector = Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(100, alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector _)

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector = {return config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector}

  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector): Unit ={
    config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_DSC_TestVector = config
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector): B = {return T}

  var config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector = Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(100, alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector _)

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector = {return config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector}

  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector): Unit ={
    config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_DSC_TestVector = config
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector): B = {return T}

  var config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector = Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(100, alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector _)

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector = {return config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector}

  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector): Unit ={
    config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_DSC_TestVector = config
  }

  // ============= Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(v: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector): B = {return T}

  var config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector = Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(100, alwaysTrue_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector _)

  def get_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector = {return config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector}

  def set_Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector(config: Config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector): Unit ={
    config_ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_DSC_TestVector = config
  }

  // ============= Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(v: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector): B = {return T}

  var config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector = Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(100, alwaysTrue_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector _)

  def get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector = {return config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector}

  def set_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector(config: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector): Unit ={
    config_ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_DSC_TestVector = config
  }

  // ============= Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(v: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector): B = {return T}

  var config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector = Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(100, alwaysTrue_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector _)

  def get_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector = {return config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector}

  def set_Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector(config: Config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector): Unit ={
    config_ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_DSC_TestVector = config
  }

  // ============= Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(v: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector): B = {return T}

  var config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector = Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(100, alwaysTrue_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector _)

  def get_Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector = {return config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector}

  def set_Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector(config: Config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector): Unit ={
    config_ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_DSC_TestVector = config
  }

  // ============= Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector ===================
  def alwaysTrue_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(v: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector): B = {return T}

  var config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector = Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(100, alwaysTrue_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector _)

  def get_Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector: Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector = {return config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector}

  def set_Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector(config: Config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector): Unit ={
    config_ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_DSC_TestVector = config
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
}

