// #Sireum

package tc

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Temperature_i.scala

FanCmd.scala

FanAck.scala

SetPoint_i.scala

Base_Types.scala

TempSensor_s_tcproc_tempSensor__Containers.scala

GUMBO__Library.scala

GUMBO__Library.scala

Fan_s_tcproc_fan__Containers.scala

TempControl_s_tcproc_tempControl__Containers.scala

OperatorInterface_s_tcproc_operatorInterface__Containers.scala

CaptureKind.scala

DataContent.scala

Aux_Types.scala

*/

@msig trait RandomLibI {
  def gen: org.sireum.Random.Gen

  def get_numElement: Z
  def set_numElement(s: Z): Unit

  // ========  Z ==========
    def get_Config_Z: Config_Z
    def set_Config_Z(config: Config_Z): Unit

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
    def set_Config_B(config: Config_B): Unit

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

  // ========  C ==========}
    def get_Config_C: Config_C
    def set_Config_C(config: Config_C): Unit

    def nextC(): C = {
      var r = gen.nextC()
      if(get_Config_C.attempts >= 0) {
       for (i <- 0 to get_Config_C.attempts) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextC()
       }
      } else {
       while(T) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextC()
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  R ==========
    def get_Config_R: Config_R
    def set_Config_R(config: Config_R): Unit

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
    def set_Config_F32(config: Config_F32): Unit

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
    def set_Config_F64(config: Config_F64): Unit

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
    def set_Config_S8(config: Config_S8): Unit

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
    def set_Config_S16(config: Config_S16): Unit

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
    def set_Config_S32(config: Config_S32): Unit

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
    def set_Config_S64(config: Config_S64): Unit

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
    def set_Config_U8(config: Config_U8): Unit

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
    def set_Config_U16(config: Config_U16): Unit

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
    def set_Config_U32(config: Config_U32): Unit

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
    def set_Config_U64(config: Config_U64): Unit

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

  def nextString(): String = {
    val length: Z = gen.nextZBetween(0, get_numElement)
    var str: String = ""
    for(r <- 0 until length){
      str = s"${str}${gen.nextC().string}"
    }

    return str
  }

  // ============= runtimemonitor.CaptureKind.Type ===================

  def get_Config_runtimemonitorCaptureKindType: Config_runtimemonitorCaptureKindType
  def set_Config_runtimemonitorCaptureKindType(config: Config_runtimemonitorCaptureKindType): Unit

  def nextruntimemonitorCaptureKindType(): runtimemonitor.CaptureKind.Type = {

    var ordinal: Z = gen.nextZBetween(0, tc.runtimemonitor.CaptureKind.numOfElements-1)

    var v: runtimemonitor.CaptureKind.Type = tc.runtimemonitor.CaptureKind.byOrdinal(ordinal).get
    if(get_Config_runtimemonitorCaptureKindType.attempts >= 0) {
     for(i <- 0 to get_Config_runtimemonitorCaptureKindType.attempts) {
       if(get_Config_runtimemonitorCaptureKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorCaptureKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.runtimemonitor.CaptureKind.numOfElements-1)
       v = tc.runtimemonitor.CaptureKind.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_runtimemonitorCaptureKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorCaptureKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.runtimemonitor.CaptureKind.numOfElements-1)
       v = tc.runtimemonitor.CaptureKind.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.DataContent ===================

  def get_Config__artDataContent: Config__artDataContent
  def set_Config__artDataContent(config: Config__artDataContent): Unit

  def next_artDataContent(): art.DataContent = {
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.CoolingFanFanAck_Payload_Id, _artDataContent_DataTypeId.CoolingFanFanCmd_Payload_Id, _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PostState_Container_Id, _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PostState_wLContainer_Id, _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PreState_Container_Id, _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PreState_wLContainer_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemSetPoint_i_Payload_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_Id, _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer_Id, _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_Id, _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer_Id, _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_Id, _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer_Id, _artDataContent_DataTypeId.TempSensorTemperature_i_Payload_Id)

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
      case _artDataContent_DataTypeId.CoolingFanFanAck_Payload_Id => (nextCoolingFanFanAck_Payload _).apply()
      case _artDataContent_DataTypeId.CoolingFanFanCmd_Payload_Id => (nextCoolingFanFanCmd_Payload _).apply()
      case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PostState_Container_Id => (nextCoolingFanFan_s_tcproc_fan_PostState_Container _).apply()
      case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PostState_wLContainer_Id => (nextCoolingFanFan_s_tcproc_fan_PostState_wLContainer _).apply()
      case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PreState_Container_Id => (nextCoolingFanFan_s_tcproc_fan_PreState_Container _).apply()
      case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PreState_wLContainer_Id => (nextCoolingFanFan_s_tcproc_fan_PreState_wLContainer _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemSetPoint_i_Payload_Id => (nextTempControlSoftwareSystemSetPoint_i_Payload _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container _).apply()
      case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer _).apply()
      case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container _).apply()
      case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer _).apply()
      case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container _).apply()
      case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer _).apply()
      case _artDataContent_DataTypeId.TempSensorTemperature_i_Payload_Id => (nextTempSensorTemperature_i_Payload _).apply()
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
         case _artDataContent_DataTypeId.CoolingFanFanAck_Payload_Id => (nextCoolingFanFanAck_Payload _).apply()
         case _artDataContent_DataTypeId.CoolingFanFanCmd_Payload_Id => (nextCoolingFanFanCmd_Payload _).apply()
         case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PostState_Container_Id => (nextCoolingFanFan_s_tcproc_fan_PostState_Container _).apply()
         case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PostState_wLContainer_Id => (nextCoolingFanFan_s_tcproc_fan_PostState_wLContainer _).apply()
         case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PreState_Container_Id => (nextCoolingFanFan_s_tcproc_fan_PreState_Container _).apply()
         case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PreState_wLContainer_Id => (nextCoolingFanFan_s_tcproc_fan_PreState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemSetPoint_i_Payload_Id => (nextTempControlSoftwareSystemSetPoint_i_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container _).apply()
         case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container _).apply()
         case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempSensorTemperature_i_Payload_Id => (nextTempSensorTemperature_i_Payload _).apply()
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
         case _artDataContent_DataTypeId.CoolingFanFanAck_Payload_Id => (nextCoolingFanFanAck_Payload _).apply()
         case _artDataContent_DataTypeId.CoolingFanFanCmd_Payload_Id => (nextCoolingFanFanCmd_Payload _).apply()
         case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PostState_Container_Id => (nextCoolingFanFan_s_tcproc_fan_PostState_Container _).apply()
         case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PostState_wLContainer_Id => (nextCoolingFanFan_s_tcproc_fan_PostState_wLContainer _).apply()
         case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PreState_Container_Id => (nextCoolingFanFan_s_tcproc_fan_PreState_Container _).apply()
         case _artDataContent_DataTypeId.CoolingFanFan_s_tcproc_fan_PreState_wLContainer_Id => (nextCoolingFanFan_s_tcproc_fan_PreState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer_Id => (nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemSetPoint_i_Payload_Id => (nextTempControlSoftwareSystemSetPoint_i_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container _).apply()
         case _artDataContent_DataTypeId.TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer_Id => (nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container _).apply()
         case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container _).apply()
         case _artDataContent_DataTypeId.TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer_Id => (nextTempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer _).apply()
         case _artDataContent_DataTypeId.TempSensorTemperature_i_Payload_Id => (nextTempSensorTemperature_i_Payload _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.Empty ===================

  def get_Config__artEmpty: Config__artEmpty
  def set_Config__artEmpty(config: Config__artEmpty): Unit

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
  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): Unit

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
  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): Unit

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
  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): Unit

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
  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): Unit

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
  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): Unit

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
  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): Unit

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
  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): Unit

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
  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): Unit

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
  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): Unit

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
  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): Unit

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
  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): Unit

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
  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): Unit

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
  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): Unit

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
  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): Unit

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
  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): Unit

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
  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): Unit

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

  // ============= CoolingFan.FanAck.Type ===================

  def get_Config_CoolingFanFanAckType: Config_CoolingFanFanAckType
  def set_Config_CoolingFanFanAckType(config: Config_CoolingFanFanAckType): Unit

  def nextCoolingFanFanAckType(): CoolingFan.FanAck.Type = {

    var ordinal: Z = gen.nextZBetween(0, tc.CoolingFan.FanAck.numOfElements-1)

    var v: CoolingFan.FanAck.Type = tc.CoolingFan.FanAck.byOrdinal(ordinal).get
    if(get_Config_CoolingFanFanAckType.attempts >= 0) {
     for(i <- 0 to get_Config_CoolingFanFanAckType.attempts) {
       if(get_Config_CoolingFanFanAckType.filter(v)) {
        return v
       }
       if (get_Config_CoolingFanFanAckType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.CoolingFan.FanAck.numOfElements-1)
       v = tc.CoolingFan.FanAck.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_CoolingFanFanAckType.filter(v)) {
        return v
       }
       if (get_Config_CoolingFanFanAckType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.CoolingFan.FanAck.numOfElements-1)
       v = tc.CoolingFan.FanAck.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= CoolingFan.FanAck_Payload ===================

  def get_Config_CoolingFanFanAck_Payload: Config_CoolingFanFanAck_Payload
  def set_Config_CoolingFanFanAck_Payload(config: Config_CoolingFanFanAck_Payload): Unit

  def nextCoolingFanFanAck_Payload(): CoolingFan.FanAck_Payload = {
    var value: CoolingFan.FanAck.Type = nextCoolingFanFanAckType()

    var v: CoolingFan.FanAck_Payload = CoolingFan.FanAck_Payload(value)

    if(get_Config_CoolingFanFanAck_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_CoolingFanFanAck_Payload.attempts) {
        if(get_Config_CoolingFanFanAck_Payload.filter(v)) {
          return v
        }
        if (get_Config_CoolingFanFanAck_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextCoolingFanFanAckType()
        v = CoolingFan.FanAck_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_CoolingFanFanAck_Payload.filter(v)) {
         return v
       }
       if (get_Config_CoolingFanFanAck_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextCoolingFanFanAckType()
       v = CoolingFan.FanAck_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= CoolingFan.FanCmd.Type ===================

  def get_Config_CoolingFanFanCmdType: Config_CoolingFanFanCmdType
  def set_Config_CoolingFanFanCmdType(config: Config_CoolingFanFanCmdType): Unit

  def nextCoolingFanFanCmdType(): CoolingFan.FanCmd.Type = {

    var ordinal: Z = gen.nextZBetween(0, tc.CoolingFan.FanCmd.numOfElements-1)

    var v: CoolingFan.FanCmd.Type = tc.CoolingFan.FanCmd.byOrdinal(ordinal).get
    if(get_Config_CoolingFanFanCmdType.attempts >= 0) {
     for(i <- 0 to get_Config_CoolingFanFanCmdType.attempts) {
       if(get_Config_CoolingFanFanCmdType.filter(v)) {
        return v
       }
       if (get_Config_CoolingFanFanCmdType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.CoolingFan.FanCmd.numOfElements-1)
       v = tc.CoolingFan.FanCmd.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_CoolingFanFanCmdType.filter(v)) {
        return v
       }
       if (get_Config_CoolingFanFanCmdType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.CoolingFan.FanCmd.numOfElements-1)
       v = tc.CoolingFan.FanCmd.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= CoolingFan.FanCmd_Payload ===================

  def get_Config_CoolingFanFanCmd_Payload: Config_CoolingFanFanCmd_Payload
  def set_Config_CoolingFanFanCmd_Payload(config: Config_CoolingFanFanCmd_Payload): Unit

  def nextCoolingFanFanCmd_Payload(): CoolingFan.FanCmd_Payload = {
    var value: CoolingFan.FanCmd.Type = nextCoolingFanFanCmdType()

    var v: CoolingFan.FanCmd_Payload = CoolingFan.FanCmd_Payload(value)

    if(get_Config_CoolingFanFanCmd_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_CoolingFanFanCmd_Payload.attempts) {
        if(get_Config_CoolingFanFanCmd_Payload.filter(v)) {
          return v
        }
        if (get_Config_CoolingFanFanCmd_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextCoolingFanFanCmdType()
        v = CoolingFan.FanCmd_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_CoolingFanFanCmd_Payload.filter(v)) {
         return v
       }
       if (get_Config_CoolingFanFanCmd_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextCoolingFanFanCmdType()
       v = CoolingFan.FanCmd_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= CoolingFan.Fan_s_tcproc_fan_PreState_Container ===================

  def get_Config_CoolingFanFan_s_tcproc_fan_PreState_Container: Config_CoolingFanFan_s_tcproc_fan_PreState_Container
  def set_Config_CoolingFanFan_s_tcproc_fan_PreState_Container(config: Config_CoolingFanFan_s_tcproc_fan_PreState_Container): Unit

  def nextCoolingFanFan_s_tcproc_fan_PreState_Container(): CoolingFan.Fan_s_tcproc_fan_PreState_Container = {
    var api_fanCmd: Option[CoolingFan.FanCmd.Type] = nextOptionCoolingFanFanCmdType()

    var v: CoolingFan.Fan_s_tcproc_fan_PreState_Container = CoolingFan.Fan_s_tcproc_fan_PreState_Container(api_fanCmd)

    if(get_Config_CoolingFanFan_s_tcproc_fan_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_CoolingFanFan_s_tcproc_fan_PreState_Container.attempts) {
        if(get_Config_CoolingFanFan_s_tcproc_fan_PreState_Container.filter(v)) {
          return v
        }
        if (get_Config_CoolingFanFan_s_tcproc_fan_PreState_Container.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanCmd = nextOptionCoolingFanFanCmdType()
        v = CoolingFan.Fan_s_tcproc_fan_PreState_Container(api_fanCmd)
     }
    } else {
     while(T) {
       if(get_Config_CoolingFanFan_s_tcproc_fan_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_CoolingFanFan_s_tcproc_fan_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanCmd = nextOptionCoolingFanFanCmdType()
       v = CoolingFan.Fan_s_tcproc_fan_PreState_Container(api_fanCmd)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= CoolingFan.Fan_s_tcproc_fan_PreState_wLContainer ===================

  def get_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer: Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer
  def set_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer(config: Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer): Unit

  def nextCoolingFanFan_s_tcproc_fan_PreState_wLContainer(): CoolingFan.Fan_s_tcproc_fan_PreState_wLContainer = {
    var api_fanCmd: Option[CoolingFan.FanCmd.Type] = nextOptionCoolingFanFanCmdType()

    var v: CoolingFan.Fan_s_tcproc_fan_PreState_wLContainer = CoolingFan.Fan_s_tcproc_fan_PreState_wLContainer(api_fanCmd)

    if(get_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer.attempts >= 0) {
     for(i <- 0 to get_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer.attempts) {
        if(get_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer.filter(v)) {
          return v
        }
        if (get_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanCmd = nextOptionCoolingFanFanCmdType()
        v = CoolingFan.Fan_s_tcproc_fan_PreState_wLContainer(api_fanCmd)
     }
    } else {
     while(T) {
       if(get_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer.filter(v)) {
         return v
       }
       if (get_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanCmd = nextOptionCoolingFanFanCmdType()
       v = CoolingFan.Fan_s_tcproc_fan_PreState_wLContainer(api_fanCmd)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= CoolingFan.Fan_s_tcproc_fan_PostState_Container ===================

  def get_Config_CoolingFanFan_s_tcproc_fan_PostState_Container: Config_CoolingFanFan_s_tcproc_fan_PostState_Container
  def set_Config_CoolingFanFan_s_tcproc_fan_PostState_Container(config: Config_CoolingFanFan_s_tcproc_fan_PostState_Container): Unit

  def nextCoolingFanFan_s_tcproc_fan_PostState_Container(): CoolingFan.Fan_s_tcproc_fan_PostState_Container = {
    var api_fanAck: Option[CoolingFan.FanAck.Type] = nextOptionCoolingFanFanAckType()

    var v: CoolingFan.Fan_s_tcproc_fan_PostState_Container = CoolingFan.Fan_s_tcproc_fan_PostState_Container(api_fanAck)

    if(get_Config_CoolingFanFan_s_tcproc_fan_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_CoolingFanFan_s_tcproc_fan_PostState_Container.attempts) {
        if(get_Config_CoolingFanFan_s_tcproc_fan_PostState_Container.filter(v)) {
          return v
        }
        if (get_Config_CoolingFanFan_s_tcproc_fan_PostState_Container.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanAck = nextOptionCoolingFanFanAckType()
        v = CoolingFan.Fan_s_tcproc_fan_PostState_Container(api_fanAck)
     }
    } else {
     while(T) {
       if(get_Config_CoolingFanFan_s_tcproc_fan_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_CoolingFanFan_s_tcproc_fan_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanAck = nextOptionCoolingFanFanAckType()
       v = CoolingFan.Fan_s_tcproc_fan_PostState_Container(api_fanAck)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= CoolingFan.Fan_s_tcproc_fan_PostState_wLContainer ===================

  def get_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer: Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer
  def set_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer(config: Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer): Unit

  def nextCoolingFanFan_s_tcproc_fan_PostState_wLContainer(): CoolingFan.Fan_s_tcproc_fan_PostState_wLContainer = {
    var api_fanAck: Option[CoolingFan.FanAck.Type] = nextOptionCoolingFanFanAckType()

    var v: CoolingFan.Fan_s_tcproc_fan_PostState_wLContainer = CoolingFan.Fan_s_tcproc_fan_PostState_wLContainer(api_fanAck)

    if(get_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer.attempts >= 0) {
     for(i <- 0 to get_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer.attempts) {
        if(get_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer.filter(v)) {
          return v
        }
        if (get_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanAck = nextOptionCoolingFanFanAckType()
        v = CoolingFan.Fan_s_tcproc_fan_PostState_wLContainer(api_fanAck)
     }
    } else {
     while(T) {
       if(get_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer.filter(v)) {
         return v
       }
       if (get_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanAck = nextOptionCoolingFanFanAckType()
       v = CoolingFan.Fan_s_tcproc_fan_PostState_wLContainer(api_fanAck)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container ===================

  def get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container
  def set_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(config: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container): Unit

  def nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container = {
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_currentTemp: TempSensor.Temperature_i = nextTempSensorTemperature_i()

    var v: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container(api_tempChanged, api_currentTemp)

    if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container.attempts) {
        if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_tempChanged = nextOption_artEmpty()
        api_currentTemp = nextTempSensorTemperature_i()
        v = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container(api_tempChanged, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_tempChanged = nextOption_artEmpty()
       api_currentTemp = nextTempSensorTemperature_i()
       v = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container(api_tempChanged, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer ===================

  def get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer
  def set_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(config: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer): Unit

  def nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer = {
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_currentTemp: TempSensor.Temperature_i = nextTempSensorTemperature_i()

    var v: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(api_tempChanged, api_currentTemp)

    if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer.attempts) {
        if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_tempChanged = nextOption_artEmpty()
        api_currentTemp = nextTempSensorTemperature_i()
        v = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(api_tempChanged, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_tempChanged = nextOption_artEmpty()
       api_currentTemp = nextTempSensorTemperature_i()
       v = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(api_tempChanged, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container ===================

  def get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container
  def set_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(config: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container): Unit

  def nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container = {
    var api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i] = nextOptionTempControlSoftwareSystemSetPoint_i()

    var v: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container(api_setPoint)

    if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container.attempts) {
        if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_setPoint = nextOptionTempControlSoftwareSystemSetPoint_i()
        v = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container(api_setPoint)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_setPoint = nextOptionTempControlSoftwareSystemSetPoint_i()
       v = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container(api_setPoint)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer ===================

  def get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer
  def set_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(config: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer): Unit

  def nextTempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(): TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer = {
    var api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i] = nextOptionTempControlSoftwareSystemSetPoint_i()

    var v: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(api_setPoint)

    if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer.attempts) {
        if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_setPoint = nextOptionTempControlSoftwareSystemSetPoint_i()
        v = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(api_setPoint)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_setPoint = nextOptionTempControlSoftwareSystemSetPoint_i()
       v = TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(api_setPoint)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.SetPoint_i ===================

  def get_Config_TempControlSoftwareSystemSetPoint_i: Config_TempControlSoftwareSystemSetPoint_i
  def set_Config_TempControlSoftwareSystemSetPoint_i(config: Config_TempControlSoftwareSystemSetPoint_i): Unit

  def nextTempControlSoftwareSystemSetPoint_i(): TempControlSoftwareSystem.SetPoint_i = {
    var low: TempSensor.Temperature_i = nextTempSensorTemperature_i()
    var high: TempSensor.Temperature_i = nextTempSensorTemperature_i()

    var v: TempControlSoftwareSystem.SetPoint_i = TempControlSoftwareSystem.SetPoint_i(low, high)

    if(get_Config_TempControlSoftwareSystemSetPoint_i.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemSetPoint_i.attempts) {
        if(get_Config_TempControlSoftwareSystemSetPoint_i.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemSetPoint_i.verbose) {
          println(s"Retrying for failing value: $v")
        }
        low = nextTempSensorTemperature_i()
        high = nextTempSensorTemperature_i()
        v = TempControlSoftwareSystem.SetPoint_i(low, high)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemSetPoint_i.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemSetPoint_i.verbose) {
         println(s"Retrying for failing value: $v")
       }
       low = nextTempSensorTemperature_i()
       high = nextTempSensorTemperature_i()
       v = TempControlSoftwareSystem.SetPoint_i(low, high)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.SetPoint_i_Payload ===================

  def get_Config_TempControlSoftwareSystemSetPoint_i_Payload: Config_TempControlSoftwareSystemSetPoint_i_Payload
  def set_Config_TempControlSoftwareSystemSetPoint_i_Payload(config: Config_TempControlSoftwareSystemSetPoint_i_Payload): Unit

  def nextTempControlSoftwareSystemSetPoint_i_Payload(): TempControlSoftwareSystem.SetPoint_i_Payload = {
    var value: TempControlSoftwareSystem.SetPoint_i = nextTempControlSoftwareSystemSetPoint_i()

    var v: TempControlSoftwareSystem.SetPoint_i_Payload = TempControlSoftwareSystem.SetPoint_i_Payload(value)

    if(get_Config_TempControlSoftwareSystemSetPoint_i_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemSetPoint_i_Payload.attempts) {
        if(get_Config_TempControlSoftwareSystemSetPoint_i_Payload.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemSetPoint_i_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextTempControlSoftwareSystemSetPoint_i()
        v = TempControlSoftwareSystem.SetPoint_i_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemSetPoint_i_Payload.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemSetPoint_i_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextTempControlSoftwareSystemSetPoint_i()
       v = TempControlSoftwareSystem.SetPoint_i_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container ===================

  def get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container
  def set_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(config: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container): Unit

  def nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container = {
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_fanAck: Option[CoolingFan.FanAck.Type] = nextOptionCoolingFanFanAckType()
    var api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i] = nextOptionTempControlSoftwareSystemSetPoint_i()
    var api_currentTemp: TempSensor.Temperature_i = nextTempSensorTemperature_i()

    var v: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)

    if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container.attempts) {
        if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_tempChanged = nextOption_artEmpty()
        api_fanAck = nextOptionCoolingFanFanAckType()
        api_setPoint = nextOptionTempControlSoftwareSystemSetPoint_i()
        api_currentTemp = nextTempSensorTemperature_i()
        v = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_tempChanged = nextOption_artEmpty()
       api_fanAck = nextOptionCoolingFanFanAckType()
       api_setPoint = nextOptionTempControlSoftwareSystemSetPoint_i()
       api_currentTemp = nextTempSensorTemperature_i()
       v = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer ===================

  def get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer
  def set_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer(config: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer): Unit

  def nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer = {
    var In_currentFanState: CoolingFan.FanCmd.Type = nextCoolingFanFanCmdType()
    var In_currentSetPoint: TempControlSoftwareSystem.SetPoint_i = nextTempControlSoftwareSystemSetPoint_i()
    var In_latestTemp: TempSensor.Temperature_i = nextTempSensorTemperature_i()
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_fanAck: Option[CoolingFan.FanAck.Type] = nextOptionCoolingFanFanAckType()
    var api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i] = nextOptionTempControlSoftwareSystemSetPoint_i()
    var api_currentTemp: TempSensor.Temperature_i = nextTempSensorTemperature_i()

    var v: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer(In_currentFanState, In_currentSetPoint, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)

    if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer.attempts) {
        if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_currentFanState = nextCoolingFanFanCmdType()
        In_currentSetPoint = nextTempControlSoftwareSystemSetPoint_i()
        In_latestTemp = nextTempSensorTemperature_i()
        api_tempChanged = nextOption_artEmpty()
        api_fanAck = nextOptionCoolingFanFanAckType()
        api_setPoint = nextOptionTempControlSoftwareSystemSetPoint_i()
        api_currentTemp = nextTempSensorTemperature_i()
        v = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer(In_currentFanState, In_currentSetPoint, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_currentFanState = nextCoolingFanFanCmdType()
       In_currentSetPoint = nextTempControlSoftwareSystemSetPoint_i()
       In_latestTemp = nextTempSensorTemperature_i()
       api_tempChanged = nextOption_artEmpty()
       api_fanAck = nextOptionCoolingFanFanAckType()
       api_setPoint = nextOptionTempControlSoftwareSystemSetPoint_i()
       api_currentTemp = nextTempSensorTemperature_i()
       v = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer(In_currentFanState, In_currentSetPoint, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container ===================

  def get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container
  def set_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(config: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container): Unit

  def nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container = {
    var api_fanCmd: Option[CoolingFan.FanCmd.Type] = nextOptionCoolingFanFanCmdType()

    var v: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container(api_fanCmd)

    if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container.attempts) {
        if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanCmd = nextOptionCoolingFanFanCmdType()
        v = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container(api_fanCmd)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanCmd = nextOptionCoolingFanFanCmdType()
       v = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container(api_fanCmd)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer ===================

  def get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer
  def set_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer(config: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer): Unit

  def nextTempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer(): TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer = {
    var currentFanState: CoolingFan.FanCmd.Type = nextCoolingFanFanCmdType()
    var currentSetPoint: TempControlSoftwareSystem.SetPoint_i = nextTempControlSoftwareSystemSetPoint_i()
    var latestTemp: TempSensor.Temperature_i = nextTempSensorTemperature_i()
    var api_fanCmd: Option[CoolingFan.FanCmd.Type] = nextOptionCoolingFanFanCmdType()

    var v: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer(currentFanState, currentSetPoint, latestTemp, api_fanCmd)

    if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer.attempts) {
        if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer.filter(v)) {
          return v
        }
        if (get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        currentFanState = nextCoolingFanFanCmdType()
        currentSetPoint = nextTempControlSoftwareSystemSetPoint_i()
        latestTemp = nextTempSensorTemperature_i()
        api_fanCmd = nextOptionCoolingFanFanCmdType()
        v = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer(currentFanState, currentSetPoint, latestTemp, api_fanCmd)
     }
    } else {
     while(T) {
       if(get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer.filter(v)) {
         return v
       }
       if (get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       currentFanState = nextCoolingFanFanCmdType()
       currentSetPoint = nextTempControlSoftwareSystemSetPoint_i()
       latestTemp = nextTempSensorTemperature_i()
       api_fanCmd = nextOptionCoolingFanFanCmdType()
       v = TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer(currentFanState, currentSetPoint, latestTemp, api_fanCmd)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container ===================

  def get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container
  def set_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(config: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container): Unit

  def nextTempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container = {

    var v: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container = TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container()

    if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container.attempts) {
        if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container.filter(v)) {
          return v
        }
        if (get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container()
     }
    } else {
     while(T) {
       if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempSensor.TempSensor_s_tcproc_tempSensor_PreState_wLContainer ===================

  def get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer
  def set_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer(config: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer): Unit

  def nextTempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer(): TempSensor.TempSensor_s_tcproc_tempSensor_PreState_wLContainer = {

    var v: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_wLContainer = TempSensor.TempSensor_s_tcproc_tempSensor_PreState_wLContainer()

    if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer.attempts >= 0) {
     for(i <- 0 to get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer.attempts) {
        if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer.filter(v)) {
          return v
        }
        if (get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = TempSensor.TempSensor_s_tcproc_tempSensor_PreState_wLContainer()
     }
    } else {
     while(T) {
       if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer.filter(v)) {
         return v
       }
       if (get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = TempSensor.TempSensor_s_tcproc_tempSensor_PreState_wLContainer()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container ===================

  def get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container
  def set_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(config: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container): Unit

  def nextTempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container = {
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_currentTemp: TempSensor.Temperature_i = nextTempSensorTemperature_i()

    var v: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container = TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container(api_tempChanged, api_currentTemp)

    if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container.attempts) {
        if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container.filter(v)) {
          return v
        }
        if (get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_tempChanged = nextOption_artEmpty()
        api_currentTemp = nextTempSensorTemperature_i()
        v = TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container(api_tempChanged, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_tempChanged = nextOption_artEmpty()
       api_currentTemp = nextTempSensorTemperature_i()
       v = TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container(api_tempChanged, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempSensor.TempSensor_s_tcproc_tempSensor_PostState_wLContainer ===================

  def get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer
  def set_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer(config: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer): Unit

  def nextTempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer(): TempSensor.TempSensor_s_tcproc_tempSensor_PostState_wLContainer = {
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_currentTemp: TempSensor.Temperature_i = nextTempSensorTemperature_i()

    var v: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_wLContainer = TempSensor.TempSensor_s_tcproc_tempSensor_PostState_wLContainer(api_tempChanged, api_currentTemp)

    if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer.attempts >= 0) {
     for(i <- 0 to get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer.attempts) {
        if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer.filter(v)) {
          return v
        }
        if (get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_tempChanged = nextOption_artEmpty()
        api_currentTemp = nextTempSensorTemperature_i()
        v = TempSensor.TempSensor_s_tcproc_tempSensor_PostState_wLContainer(api_tempChanged, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer.filter(v)) {
         return v
       }
       if (get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_tempChanged = nextOption_artEmpty()
       api_currentTemp = nextTempSensorTemperature_i()
       v = TempSensor.TempSensor_s_tcproc_tempSensor_PostState_wLContainer(api_tempChanged, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempSensor.Temperature_i ===================

  def get_Config_TempSensorTemperature_i: Config_TempSensorTemperature_i
  def set_Config_TempSensorTemperature_i(config: Config_TempSensorTemperature_i): Unit

  def nextTempSensorTemperature_i(): TempSensor.Temperature_i = {
    var degrees: F32 = nextF32()

    var v: TempSensor.Temperature_i = TempSensor.Temperature_i(degrees)

    if(get_Config_TempSensorTemperature_i.attempts >= 0) {
     for(i <- 0 to get_Config_TempSensorTemperature_i.attempts) {
        if(get_Config_TempSensorTemperature_i.filter(v)) {
          return v
        }
        if (get_Config_TempSensorTemperature_i.verbose) {
          println(s"Retrying for failing value: $v")
        }
        degrees = nextF32()
        v = TempSensor.Temperature_i(degrees)
     }
    } else {
     while(T) {
       if(get_Config_TempSensorTemperature_i.filter(v)) {
         return v
       }
       if (get_Config_TempSensorTemperature_i.verbose) {
         println(s"Retrying for failing value: $v")
       }
       degrees = nextF32()
       v = TempSensor.Temperature_i(degrees)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempSensor.Temperature_i_Payload ===================

  def get_Config_TempSensorTemperature_i_Payload: Config_TempSensorTemperature_i_Payload
  def set_Config_TempSensorTemperature_i_Payload(config: Config_TempSensorTemperature_i_Payload): Unit

  def nextTempSensorTemperature_i_Payload(): TempSensor.Temperature_i_Payload = {
    var value: TempSensor.Temperature_i = nextTempSensorTemperature_i()

    var v: TempSensor.Temperature_i_Payload = TempSensor.Temperature_i_Payload(value)

    if(get_Config_TempSensorTemperature_i_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_TempSensorTemperature_i_Payload.attempts) {
        if(get_Config_TempSensorTemperature_i_Payload.filter(v)) {
          return v
        }
        if (get_Config_TempSensorTemperature_i_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextTempSensorTemperature_i()
        v = TempSensor.Temperature_i_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_TempSensorTemperature_i_Payload.filter(v)) {
         return v
       }
       if (get_Config_TempSensorTemperature_i_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextTempSensorTemperature_i()
       v = TempSensor.Temperature_i_Payload(value)
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

  def nextOptionCoolingFanFanCmdType(): Option[CoolingFan.FanCmd.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextCoolingFanFanCmdType())
    } else {
      return None()
    }
  }

  def nextOptionCoolingFanFanAckType(): Option[CoolingFan.FanAck.Type] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextCoolingFanFanAckType())
    } else {
      return None()
    }
  }

  def nextOption_artEmpty(): Option[art.Empty] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(next_artEmpty())
    } else {
      return None()
    }
  }

  def nextOptionTempControlSoftwareSystemSetPoint_i(): Option[TempControlSoftwareSystem.SetPoint_i] = {
    val none: Z = gen.nextZBetween(0,1)

    if(none == 0) {
      return Some(nextTempControlSoftwareSystemSetPoint_i())
    } else {
      return None()
    }
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

  // ============= Z ===================
  def alwaysTrue_Z(v: Z): B = {return T}

  var config_Z: Config_Z = Config_Z(None(), None(), 100, _verbose, alwaysTrue_Z _)
  def get_Config_Z: Config_Z = {return config_Z}

  def set_Config_Z(config: Config_Z): Unit ={
    config_Z = config
  }

  // ============= B ===================
  def alwaysTrue_B(v: B): B = {return T}

  var config_B: Config_B = Config_B(100, _verbose, alwaysTrue_B _)
  def get_Config_B: Config_B = {return config_B}

  def set_Config_B(config: Config_B): Unit ={
    config_B = config
  }

  // ============= C ===================
  def alwaysTrue_C(v: C): B = {return T}

  var config_C: Config_C = Config_C(100, _verbose, alwaysTrue_C _)
  def get_Config_C: Config_C = {return config_C}

  def set_Config_C(config: Config_C): Unit ={
    config_C = config
  }

  // ============= R ===================
  def alwaysTrue_R(v: R): B = {return T}

  var config_R: Config_R = Config_R(None(), None(), 100, _verbose, alwaysTrue_R _)
  def get_Config_R: Config_R = {return config_R}

  def set_Config_R(config: Config_R): Unit ={
    config_R = config
  }

  // ============= F32 ===================
  def alwaysTrue_F32(v: F32): B = {return T}

  var config_F32: Config_F32 = Config_F32(None(), None(), 100, _verbose, alwaysTrue_F32 _)
  def get_Config_F32: Config_F32 = {return config_F32}

  def set_Config_F32(config: Config_F32): Unit ={
    config_F32 = config
  }

  // ============= F64 ===================
  def alwaysTrue_F64(v: F64): B = {return T}

  var config_F64: Config_F64 = Config_F64(None(), None(), 100, _verbose, alwaysTrue_F64 _)
  def get_Config_F64: Config_F64 = {return config_F64}

  def set_Config_F64(config: Config_F64): Unit ={
    config_F64 = config
  }

  // ============= S8 ===================
  def alwaysTrue_S8(v: S8): B = {return T}

  var config_S8: Config_S8 = Config_S8(None(), None(), 100, _verbose, alwaysTrue_S8 _)
  def get_Config_S8: Config_S8 = {return config_S8}

  def set_Config_S8(config: Config_S8): Unit ={
    config_S8 = config
  }

  // ============= S16 ===================
  def alwaysTrue_S16(v: S16): B = {return T}

  var config_S16: Config_S16 = Config_S16(None(), None(), 100, _verbose, alwaysTrue_S16 _)
  def get_Config_S16: Config_S16 = {return config_S16}

  def set_Config_S16(config: Config_S16): Unit ={
    config_S16 = config
  }

  // ============= S32 ===================
  def alwaysTrue_S32(v: S32): B = {return T}

  var config_S32: Config_S32 = Config_S32(None(), None(), 100, _verbose, alwaysTrue_S32 _)
  def get_Config_S32: Config_S32 = {return config_S32}

  def set_Config_S32(config: Config_S32): Unit ={
    config_S32 = config
  }

  // ============= S64 ===================
  def alwaysTrue_S64(v: S64): B = {return T}

  var config_S64: Config_S64 = Config_S64(None(), None(), 100, _verbose, alwaysTrue_S64 _)
  def get_Config_S64: Config_S64 = {return config_S64}

  def set_Config_S64(config: Config_S64): Unit ={
    config_S64 = config
  }

  // ============= U8 ===================
  def alwaysTrue_U8(v: U8): B = {return T}

  var config_U8: Config_U8 = Config_U8(None(), None(), 100, _verbose, alwaysTrue_U8 _)
  def get_Config_U8: Config_U8 = {return config_U8}

  def set_Config_U8(config: Config_U8): Unit ={
    config_U8 = config
  }

  // ============= U16 ===================
  def alwaysTrue_U16(v: U16): B = {return T}

  var config_U16: Config_U16 = Config_U16(None(), None(), 100, _verbose, alwaysTrue_U16 _)
  def get_Config_U16: Config_U16 = {return config_U16}

  def set_Config_U16(config: Config_U16): Unit ={
    config_U16 = config
  }

  // ============= U32 ===================
  def alwaysTrue_U32(v: U32): B = {return T}

  var config_U32: Config_U32 = Config_U32(None(), None(), 100, _verbose, alwaysTrue_U32 _)
  def get_Config_U32: Config_U32 = {return config_U32}

  def set_Config_U32(config: Config_U32): Unit ={
    config_U32 = config
  }

  // ============= U64 ===================
  def alwaysTrue_U64(v: U64): B = {return T}

  var config_U64: Config_U64 = Config_U64(None(), None(), 100, _verbose, alwaysTrue_U64 _)
  def get_Config_U64: Config_U64 = {return config_U64}

  def set_Config_U64(config: Config_U64): Unit ={
    config_U64 = config
  }

  // ============= runtimemonitor.CaptureKind.Type ===================
  def alwaysTrue_runtimemonitorCaptureKindType(v: runtimemonitor.CaptureKind.Type): B = {return T}

  var config_runtimemonitorCaptureKindType: Config_runtimemonitorCaptureKindType = Config_runtimemonitorCaptureKindType(100, _verbose, alwaysTrue_runtimemonitorCaptureKindType _)

  def get_Config_runtimemonitorCaptureKindType: Config_runtimemonitorCaptureKindType = {return config_runtimemonitorCaptureKindType}

  def set_Config_runtimemonitorCaptureKindType(config: Config_runtimemonitorCaptureKindType): Unit ={
    config_runtimemonitorCaptureKindType = config
  }

  // ============= art.DataContent ===================
  def alwaysTrue__artDataContent(v: art.DataContent): B = {return T}

  var config__artDataContent: Config__artDataContent = Config__artDataContent(100, _verbose, F, ISZ(), alwaysTrue__artDataContent _)

  def get_Config__artDataContent: Config__artDataContent = {return config__artDataContent}

  def set_Config__artDataContent(config: Config__artDataContent): Unit ={
    config__artDataContent = config
  }

  // ============= art.Empty ===================
  def alwaysTrue__artEmpty(v: art.Empty): B = {return T}

  var config__artEmpty: Config__artEmpty = Config__artEmpty(100, _verbose, alwaysTrue__artEmpty _)

  def get_Config__artEmpty: Config__artEmpty = {return config__artEmpty}

  def set_Config__artEmpty(config: Config__artEmpty): Unit ={
    config__artEmpty = config
  }

  // ============= Base_Types.Boolean_Payload ===================
  def alwaysTrue_Base_TypesBoolean_Payload(v: Base_Types.Boolean_Payload): B = {return T}

  var config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = Config_Base_TypesBoolean_Payload(100, _verbose, alwaysTrue_Base_TypesBoolean_Payload _)

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = {return config_Base_TypesBoolean_Payload}

  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): Unit ={
    config_Base_TypesBoolean_Payload = config
  }

  // ============= Base_Types.Integer_Payload ===================
  def alwaysTrue_Base_TypesInteger_Payload(v: Base_Types.Integer_Payload): B = {return T}

  var config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = Config_Base_TypesInteger_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_Payload _)

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = {return config_Base_TypesInteger_Payload}

  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): Unit ={
    config_Base_TypesInteger_Payload = config
  }

  // ============= Base_Types.Integer_8_Payload ===================
  def alwaysTrue_Base_TypesInteger_8_Payload(v: Base_Types.Integer_8_Payload): B = {return T}

  var config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = Config_Base_TypesInteger_8_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_8_Payload _)

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = {return config_Base_TypesInteger_8_Payload}

  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): Unit ={
    config_Base_TypesInteger_8_Payload = config
  }

  // ============= Base_Types.Integer_16_Payload ===================
  def alwaysTrue_Base_TypesInteger_16_Payload(v: Base_Types.Integer_16_Payload): B = {return T}

  var config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = Config_Base_TypesInteger_16_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_16_Payload _)

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = {return config_Base_TypesInteger_16_Payload}

  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): Unit ={
    config_Base_TypesInteger_16_Payload = config
  }

  // ============= Base_Types.Integer_32_Payload ===================
  def alwaysTrue_Base_TypesInteger_32_Payload(v: Base_Types.Integer_32_Payload): B = {return T}

  var config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = Config_Base_TypesInteger_32_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_32_Payload _)

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = {return config_Base_TypesInteger_32_Payload}

  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): Unit ={
    config_Base_TypesInteger_32_Payload = config
  }

  // ============= Base_Types.Integer_64_Payload ===================
  def alwaysTrue_Base_TypesInteger_64_Payload(v: Base_Types.Integer_64_Payload): B = {return T}

  var config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = Config_Base_TypesInteger_64_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_64_Payload _)

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = {return config_Base_TypesInteger_64_Payload}

  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): Unit ={
    config_Base_TypesInteger_64_Payload = config
  }

  // ============= Base_Types.Unsigned_8_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_8_Payload(v: Base_Types.Unsigned_8_Payload): B = {return T}

  var config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = Config_Base_TypesUnsigned_8_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_8_Payload _)

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = {return config_Base_TypesUnsigned_8_Payload}

  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): Unit ={
    config_Base_TypesUnsigned_8_Payload = config
  }

  // ============= Base_Types.Unsigned_16_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_16_Payload(v: Base_Types.Unsigned_16_Payload): B = {return T}

  var config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = Config_Base_TypesUnsigned_16_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_16_Payload _)

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = {return config_Base_TypesUnsigned_16_Payload}

  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): Unit ={
    config_Base_TypesUnsigned_16_Payload = config
  }

  // ============= Base_Types.Unsigned_32_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_32_Payload(v: Base_Types.Unsigned_32_Payload): B = {return T}

  var config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = Config_Base_TypesUnsigned_32_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_32_Payload _)

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = {return config_Base_TypesUnsigned_32_Payload}

  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): Unit ={
    config_Base_TypesUnsigned_32_Payload = config
  }

  // ============= Base_Types.Unsigned_64_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_64_Payload(v: Base_Types.Unsigned_64_Payload): B = {return T}

  var config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = Config_Base_TypesUnsigned_64_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_64_Payload _)

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = {return config_Base_TypesUnsigned_64_Payload}

  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): Unit ={
    config_Base_TypesUnsigned_64_Payload = config
  }

  // ============= Base_Types.Float_Payload ===================
  def alwaysTrue_Base_TypesFloat_Payload(v: Base_Types.Float_Payload): B = {return T}

  var config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = Config_Base_TypesFloat_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_Payload _)

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = {return config_Base_TypesFloat_Payload}

  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): Unit ={
    config_Base_TypesFloat_Payload = config
  }

  // ============= Base_Types.Float_32_Payload ===================
  def alwaysTrue_Base_TypesFloat_32_Payload(v: Base_Types.Float_32_Payload): B = {return T}

  var config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = Config_Base_TypesFloat_32_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_32_Payload _)

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = {return config_Base_TypesFloat_32_Payload}

  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): Unit ={
    config_Base_TypesFloat_32_Payload = config
  }

  // ============= Base_Types.Float_64_Payload ===================
  def alwaysTrue_Base_TypesFloat_64_Payload(v: Base_Types.Float_64_Payload): B = {return T}

  var config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = Config_Base_TypesFloat_64_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_64_Payload _)

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = {return config_Base_TypesFloat_64_Payload}

  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): Unit ={
    config_Base_TypesFloat_64_Payload = config
  }

  // ============= Base_Types.Character_Payload ===================
  def alwaysTrue_Base_TypesCharacter_Payload(v: Base_Types.Character_Payload): B = {return T}

  var config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = Config_Base_TypesCharacter_Payload(100, _verbose, alwaysTrue_Base_TypesCharacter_Payload _)

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = {return config_Base_TypesCharacter_Payload}

  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): Unit ={
    config_Base_TypesCharacter_Payload = config
  }

  // ============= Base_Types.String_Payload ===================
  def alwaysTrue_Base_TypesString_Payload(v: Base_Types.String_Payload): B = {return T}

  var config_Base_TypesString_Payload: Config_Base_TypesString_Payload = Config_Base_TypesString_Payload(100, _verbose, alwaysTrue_Base_TypesString_Payload _)

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload = {return config_Base_TypesString_Payload}

  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): Unit ={
    config_Base_TypesString_Payload = config
  }

  // ============= Base_Types.Bits_Payload ===================
  def alwaysTrue_Base_TypesBits_Payload(v: Base_Types.Bits_Payload): B = {return T}

  var config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = Config_Base_TypesBits_Payload(100, _verbose, alwaysTrue_Base_TypesBits_Payload _)

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = {return config_Base_TypesBits_Payload}

  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): Unit ={
    config_Base_TypesBits_Payload = config
  }

  // ============= CoolingFan.FanAck.Type ===================
  def alwaysTrue_CoolingFanFanAckType(v: CoolingFan.FanAck.Type): B = {return T}

  var config_CoolingFanFanAckType: Config_CoolingFanFanAckType = Config_CoolingFanFanAckType(100, _verbose, alwaysTrue_CoolingFanFanAckType _)

  def get_Config_CoolingFanFanAckType: Config_CoolingFanFanAckType = {return config_CoolingFanFanAckType}

  def set_Config_CoolingFanFanAckType(config: Config_CoolingFanFanAckType): Unit ={
    config_CoolingFanFanAckType = config
  }

  // ============= CoolingFan.FanAck_Payload ===================
  def alwaysTrue_CoolingFanFanAck_Payload(v: CoolingFan.FanAck_Payload): B = {return T}

  var config_CoolingFanFanAck_Payload: Config_CoolingFanFanAck_Payload = Config_CoolingFanFanAck_Payload(100, _verbose, alwaysTrue_CoolingFanFanAck_Payload _)

  def get_Config_CoolingFanFanAck_Payload: Config_CoolingFanFanAck_Payload = {return config_CoolingFanFanAck_Payload}

  def set_Config_CoolingFanFanAck_Payload(config: Config_CoolingFanFanAck_Payload): Unit ={
    config_CoolingFanFanAck_Payload = config
  }

  // ============= CoolingFan.FanCmd.Type ===================
  def alwaysTrue_CoolingFanFanCmdType(v: CoolingFan.FanCmd.Type): B = {return T}

  var config_CoolingFanFanCmdType: Config_CoolingFanFanCmdType = Config_CoolingFanFanCmdType(100, _verbose, alwaysTrue_CoolingFanFanCmdType _)

  def get_Config_CoolingFanFanCmdType: Config_CoolingFanFanCmdType = {return config_CoolingFanFanCmdType}

  def set_Config_CoolingFanFanCmdType(config: Config_CoolingFanFanCmdType): Unit ={
    config_CoolingFanFanCmdType = config
  }

  // ============= CoolingFan.FanCmd_Payload ===================
  def alwaysTrue_CoolingFanFanCmd_Payload(v: CoolingFan.FanCmd_Payload): B = {return T}

  var config_CoolingFanFanCmd_Payload: Config_CoolingFanFanCmd_Payload = Config_CoolingFanFanCmd_Payload(100, _verbose, alwaysTrue_CoolingFanFanCmd_Payload _)

  def get_Config_CoolingFanFanCmd_Payload: Config_CoolingFanFanCmd_Payload = {return config_CoolingFanFanCmd_Payload}

  def set_Config_CoolingFanFanCmd_Payload(config: Config_CoolingFanFanCmd_Payload): Unit ={
    config_CoolingFanFanCmd_Payload = config
  }

  // ============= CoolingFan.Fan_s_tcproc_fan_PreState_Container ===================
  def alwaysTrue_CoolingFanFan_s_tcproc_fan_PreState_Container(v: CoolingFan.Fan_s_tcproc_fan_PreState_Container): B = {return T}

  var config_CoolingFanFan_s_tcproc_fan_PreState_Container: Config_CoolingFanFan_s_tcproc_fan_PreState_Container = Config_CoolingFanFan_s_tcproc_fan_PreState_Container(100, _verbose, alwaysTrue_CoolingFanFan_s_tcproc_fan_PreState_Container _)

  def get_Config_CoolingFanFan_s_tcproc_fan_PreState_Container: Config_CoolingFanFan_s_tcproc_fan_PreState_Container = {return config_CoolingFanFan_s_tcproc_fan_PreState_Container}

  def set_Config_CoolingFanFan_s_tcproc_fan_PreState_Container(config: Config_CoolingFanFan_s_tcproc_fan_PreState_Container): Unit ={
    config_CoolingFanFan_s_tcproc_fan_PreState_Container = config
  }

  // ============= CoolingFan.Fan_s_tcproc_fan_PreState_wLContainer ===================
  def alwaysTrue_CoolingFanFan_s_tcproc_fan_PreState_wLContainer(v: CoolingFan.Fan_s_tcproc_fan_PreState_wLContainer): B = {return T}

  var config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer: Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer = Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer(100, _verbose, alwaysTrue_CoolingFanFan_s_tcproc_fan_PreState_wLContainer _)

  def get_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer: Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer = {return config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer}

  def set_Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer(config: Config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer): Unit ={
    config_CoolingFanFan_s_tcproc_fan_PreState_wLContainer = config
  }

  // ============= CoolingFan.Fan_s_tcproc_fan_PostState_Container ===================
  def alwaysTrue_CoolingFanFan_s_tcproc_fan_PostState_Container(v: CoolingFan.Fan_s_tcproc_fan_PostState_Container): B = {return T}

  var config_CoolingFanFan_s_tcproc_fan_PostState_Container: Config_CoolingFanFan_s_tcproc_fan_PostState_Container = Config_CoolingFanFan_s_tcproc_fan_PostState_Container(100, _verbose, alwaysTrue_CoolingFanFan_s_tcproc_fan_PostState_Container _)

  def get_Config_CoolingFanFan_s_tcproc_fan_PostState_Container: Config_CoolingFanFan_s_tcproc_fan_PostState_Container = {return config_CoolingFanFan_s_tcproc_fan_PostState_Container}

  def set_Config_CoolingFanFan_s_tcproc_fan_PostState_Container(config: Config_CoolingFanFan_s_tcproc_fan_PostState_Container): Unit ={
    config_CoolingFanFan_s_tcproc_fan_PostState_Container = config
  }

  // ============= CoolingFan.Fan_s_tcproc_fan_PostState_wLContainer ===================
  def alwaysTrue_CoolingFanFan_s_tcproc_fan_PostState_wLContainer(v: CoolingFan.Fan_s_tcproc_fan_PostState_wLContainer): B = {return T}

  var config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer: Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer = Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer(100, _verbose, alwaysTrue_CoolingFanFan_s_tcproc_fan_PostState_wLContainer _)

  def get_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer: Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer = {return config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer}

  def set_Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer(config: Config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer): Unit ={
    config_CoolingFanFan_s_tcproc_fan_PostState_wLContainer = config
  }

  // ============= TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container ===================
  def alwaysTrue_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(v: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_Container): B = {return T}

  var config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container = Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(100, _verbose, alwaysTrue_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container _)

  def get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container = {return config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container}

  def set_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container(config: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container): Unit ={
    config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_Container = config
  }

  // ============= TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer ===================
  def alwaysTrue_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(v: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer): B = {return T}

  var config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer = Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(100, _verbose, alwaysTrue_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer _)

  def get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer = {return config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer}

  def set_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer(config: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer): Unit ={
    config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PreState_wLContainer = config
  }

  // ============= TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container ===================
  def alwaysTrue_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(v: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_Container): B = {return T}

  var config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container = Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(100, _verbose, alwaysTrue_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container _)

  def get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container = {return config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container}

  def set_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container(config: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container): Unit ={
    config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_Container = config
  }

  // ============= TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer ===================
  def alwaysTrue_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(v: TempControlSoftwareSystem.OperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer): B = {return T}

  var config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer = Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(100, _verbose, alwaysTrue_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer _)

  def get_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer = {return config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer}

  def set_Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer(config: Config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer): Unit ={
    config_TempControlSoftwareSystemOperatorInterface_s_tcproc_operatorInterface_PostState_wLContainer = config
  }

  // ============= TempControlSoftwareSystem.SetPoint_i ===================
  def alwaysTrue_TempControlSoftwareSystemSetPoint_i(v: TempControlSoftwareSystem.SetPoint_i): B = {return T}

  var config_TempControlSoftwareSystemSetPoint_i: Config_TempControlSoftwareSystemSetPoint_i = Config_TempControlSoftwareSystemSetPoint_i(100, _verbose, TempControlSoftwareSystem.SetPoint_i_GumboX.D_Inv_SetPoint_i _)

  def get_Config_TempControlSoftwareSystemSetPoint_i: Config_TempControlSoftwareSystemSetPoint_i = {return config_TempControlSoftwareSystemSetPoint_i}

  def set_Config_TempControlSoftwareSystemSetPoint_i(config: Config_TempControlSoftwareSystemSetPoint_i): Unit ={
    config_TempControlSoftwareSystemSetPoint_i = config
  }

  // ============= TempControlSoftwareSystem.SetPoint_i_Payload ===================
  def alwaysTrue_TempControlSoftwareSystemSetPoint_i_Payload(v: TempControlSoftwareSystem.SetPoint_i_Payload): B = {return T}

  var config_TempControlSoftwareSystemSetPoint_i_Payload: Config_TempControlSoftwareSystemSetPoint_i_Payload = Config_TempControlSoftwareSystemSetPoint_i_Payload(100, _verbose, alwaysTrue_TempControlSoftwareSystemSetPoint_i_Payload _)

  def get_Config_TempControlSoftwareSystemSetPoint_i_Payload: Config_TempControlSoftwareSystemSetPoint_i_Payload = {return config_TempControlSoftwareSystemSetPoint_i_Payload}

  def set_Config_TempControlSoftwareSystemSetPoint_i_Payload(config: Config_TempControlSoftwareSystemSetPoint_i_Payload): Unit ={
    config_TempControlSoftwareSystemSetPoint_i_Payload = config
  }

  // ============= TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container ===================
  def alwaysTrue_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(v: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_Container): B = {return T}

  var config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container = Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(100, _verbose, alwaysTrue_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container _)

  def get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container = {return config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container}

  def set_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container(config: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container): Unit ={
    config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_Container = config
  }

  // ============= TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer ===================
  def alwaysTrue_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer(v: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PreState_wLContainer): B = {return T}

  var config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer = Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer(100, _verbose, alwaysTrue_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer _)

  def get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer = {return config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer}

  def set_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer(config: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer): Unit ={
    config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PreState_wLContainer = config
  }

  // ============= TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container ===================
  def alwaysTrue_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(v: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_Container): B = {return T}

  var config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container = Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(100, _verbose, alwaysTrue_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container _)

  def get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container = {return config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container}

  def set_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container(config: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container): Unit ={
    config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_Container = config
  }

  // ============= TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer ===================
  def alwaysTrue_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer(v: TempControlSoftwareSystem.TempControl_s_tcproc_tempControl_PostState_wLContainer): B = {return T}

  var config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer = Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer(100, _verbose, alwaysTrue_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer _)

  def get_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer = {return config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer}

  def set_Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer(config: Config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer): Unit ={
    config_TempControlSoftwareSystemTempControl_s_tcproc_tempControl_PostState_wLContainer = config
  }

  // ============= TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container ===================
  def alwaysTrue_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(v: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_Container): B = {return T}

  var config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container = Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(100, _verbose, alwaysTrue_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container _)

  def get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container = {return config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container}

  def set_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container(config: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container): Unit ={
    config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_Container = config
  }

  // ============= TempSensor.TempSensor_s_tcproc_tempSensor_PreState_wLContainer ===================
  def alwaysTrue_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer(v: TempSensor.TempSensor_s_tcproc_tempSensor_PreState_wLContainer): B = {return T}

  var config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer = Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer(100, _verbose, alwaysTrue_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer _)

  def get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer = {return config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer}

  def set_Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer(config: Config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer): Unit ={
    config_TempSensorTempSensor_s_tcproc_tempSensor_PreState_wLContainer = config
  }

  // ============= TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container ===================
  def alwaysTrue_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(v: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_Container): B = {return T}

  var config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container = Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(100, _verbose, alwaysTrue_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container _)

  def get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container = {return config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container}

  def set_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container(config: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container): Unit ={
    config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_Container = config
  }

  // ============= TempSensor.TempSensor_s_tcproc_tempSensor_PostState_wLContainer ===================
  def alwaysTrue_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer(v: TempSensor.TempSensor_s_tcproc_tempSensor_PostState_wLContainer): B = {return T}

  var config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer = Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer(100, _verbose, alwaysTrue_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer _)

  def get_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer = {return config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer}

  def set_Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer(config: Config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer): Unit ={
    config_TempSensorTempSensor_s_tcproc_tempSensor_PostState_wLContainer = config
  }

  // ============= TempSensor.Temperature_i ===================
  def alwaysTrue_TempSensorTemperature_i(v: TempSensor.Temperature_i): B = {return T}

  var config_TempSensorTemperature_i: Config_TempSensorTemperature_i = Config_TempSensorTemperature_i(100, _verbose, TempSensor.Temperature_i_GumboX.D_Inv_Temperature_i _)

  def get_Config_TempSensorTemperature_i: Config_TempSensorTemperature_i = {return config_TempSensorTemperature_i}

  def set_Config_TempSensorTemperature_i(config: Config_TempSensorTemperature_i): Unit ={
    config_TempSensorTemperature_i = config
  }

  // ============= TempSensor.Temperature_i_Payload ===================
  def alwaysTrue_TempSensorTemperature_i_Payload(v: TempSensor.Temperature_i_Payload): B = {return T}

  var config_TempSensorTemperature_i_Payload: Config_TempSensorTemperature_i_Payload = Config_TempSensorTemperature_i_Payload(100, _verbose, alwaysTrue_TempSensorTemperature_i_Payload _)

  def get_Config_TempSensorTemperature_i_Payload: Config_TempSensorTemperature_i_Payload = {return config_TempSensorTemperature_i_Payload}

  def set_Config_TempSensorTemperature_i_Payload(config: Config_TempSensorTemperature_i_Payload): Unit ={
    config_TempSensorTemperature_i_Payload = config
  }
}

