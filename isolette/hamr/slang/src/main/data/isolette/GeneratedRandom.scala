// #Sireum

package isolette


import org.sireum._
import org.sireum.Random.Gen64


@msig trait RandomLibI {
  def gen: org.sireum.Random.Gen

  // ========  Z ==========
    def get_Config_Z: Config_Z
    def set_Config_Z(config: Config_Z): Unit

    def next_ISZ_Z(): ISZ[Z] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_Z(): Z = {
      var r = gen.nextZ()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_Z.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextZ()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  B ==========
    def get_Config_B: Config_B
    def set_Config_B(config: Config_B): Unit

    def next_ISZ_B(): ISZ[B] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_B(): B = {
      var r = gen.nextB()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_B.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextB()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  C ==========
    def get_Config_C: Config_C
    def set_Config_C(config: Config_C): Unit

    def next_ISZ_C(): ISZ[C] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_C(): C = {
      var r = gen.nextC()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_C.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextC()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  R ==========
    def get_Config_R: Config_R
    def set_Config_R(config: Config_R): Unit

    def next_ISZ_R(): ISZ[R] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_R(): R = {
      var r = gen.nextR()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_R.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextR()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  F32 ==========
    def get_Config_F32: Config_F32
    def set_Config_F32(config: Config_F32): Unit

    def next_ISZ_F32(): ISZ[F32] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_F32(): F32 = {
      var r = gen.nextF32()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_F32.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextF32()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  F64 ==========
    def get_Config_F64: Config_F64
    def set_Config_F64(config: Config_F64): Unit

    def next_ISZ_F64(): ISZ[F64] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_F64(): F64 = {
      var r = gen.nextF64()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_F64.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextF64()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  S8 ==========
    def get_Config_S8: Config_S8
    def set_Config_S8(config: Config_S8): Unit

    def next_ISZ_S8(): ISZ[S8] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_S8(): S8 = {
      var r = gen.nextS8()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_S8.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextS8()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  S16 ==========
    def get_Config_S16: Config_S16
    def set_Config_S16(config: Config_S16): Unit

    def next_ISZ_S16(): ISZ[S16] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_S16(): S16 = {
      var r = gen.nextS16()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_S16.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextS16()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  S32 ==========
    def get_Config_S32: Config_S32
    def set_Config_S32(config: Config_S32): Unit

    def next_ISZ_S32(): ISZ[S32] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_S32(): S32 = {
      var r = gen.nextS32()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_S32.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextS32()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  S64 ==========
    def get_Config_S64: Config_S64
    def set_Config_S64(config: Config_S64): Unit

    def next_ISZ_S64(): ISZ[S64] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_S64(): S64 = {
      var r = gen.nextS64()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_S64.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextS64()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  U8 ==========
    def get_Config_U8: Config_U8
    def set_Config_U8(config: Config_U8): Unit

    def next_ISZ_U8(): ISZ[U8] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_U8(): U8 = {
      var r = gen.nextU8()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_U8.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextU8()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  U16 ==========
    def get_Config_U16: Config_U16
    def set_Config_U16(config: Config_U16): Unit

    def next_ISZ_U16(): ISZ[U16] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_U16(): U16 = {
      var r = gen.nextU16()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_U16.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextU16()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  U32 ==========
    def get_Config_U32: Config_U32
    def set_Config_U32(config: Config_U32): Unit

    def next_ISZ_U32(): ISZ[U32] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_U32(): U32 = {
      var r = gen.nextU32()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_U32.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextU32()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  // ========  U64 ==========
    def get_Config_U64: Config_U64
    def set_Config_U64(config: Config_U64): Unit

    def next_ISZ_U64(): ISZ[U64] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

    def next_U64(): U64 = {
      var r = gen.nextU64()
      for (i <- 0 to 100 /* num retries */ ) {
        if (get_Config_U64.filter(r)) {
          return r
        }
        println(s"Retrying for failing value: $r")
        r = gen.nextU64()
      }
      assert(F, "Requirements to strict to generate")
      halt("Requirements to strict to generate")
    }

  def next_String(): String = {
   assert(F, "Requirements to strict to generate")
   halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Boolean_Payload ===================

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload
  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): Unit

  def next_ISZ_Base_TypesBoolean_Payload(): ISZ[Base_Types.Boolean_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
    var value: B = next_B()

    var v: Base_Types.Boolean_Payload = Base_Types.Boolean_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_B()
       v = Base_Types.Boolean_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Integer_Payload ===================

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload
  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): Unit

  def next_ISZ_Base_TypesInteger_Payload(): ISZ[Base_Types.Integer_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesInteger_Payload(): Base_Types.Integer_Payload = {
    var value: Z = next_Z()

    var v: Base_Types.Integer_Payload = Base_Types.Integer_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesInteger_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Z()
       v = Base_Types.Integer_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Integer_8_Payload ===================

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload
  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): Unit

  def next_ISZ_Base_TypesInteger_8_Payload(): ISZ[Base_Types.Integer_8_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
    var value: S8 = next_S8()

    var v: Base_Types.Integer_8_Payload = Base_Types.Integer_8_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_S8()
       v = Base_Types.Integer_8_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Integer_16_Payload ===================

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload
  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): Unit

  def next_ISZ_Base_TypesInteger_16_Payload(): ISZ[Base_Types.Integer_16_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
    var value: S16 = next_S16()

    var v: Base_Types.Integer_16_Payload = Base_Types.Integer_16_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_S16()
       v = Base_Types.Integer_16_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Integer_32_Payload ===================

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload
  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): Unit

  def next_ISZ_Base_TypesInteger_32_Payload(): ISZ[Base_Types.Integer_32_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
    var value: S32 = next_S32()

    var v: Base_Types.Integer_32_Payload = Base_Types.Integer_32_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_S32()
       v = Base_Types.Integer_32_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Integer_64_Payload ===================

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload
  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): Unit

  def next_ISZ_Base_TypesInteger_64_Payload(): ISZ[Base_Types.Integer_64_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
    var value: S64 = next_S64()

    var v: Base_Types.Integer_64_Payload = Base_Types.Integer_64_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_S64()
       v = Base_Types.Integer_64_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Unsigned_8_Payload ===================

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload
  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): Unit

  def next_ISZ_Base_TypesUnsigned_8_Payload(): ISZ[Base_Types.Unsigned_8_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
    var value: U8 = next_U8()

    var v: Base_Types.Unsigned_8_Payload = Base_Types.Unsigned_8_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_U8()
       v = Base_Types.Unsigned_8_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Unsigned_16_Payload ===================

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload
  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): Unit

  def next_ISZ_Base_TypesUnsigned_16_Payload(): ISZ[Base_Types.Unsigned_16_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
    var value: U16 = next_U16()

    var v: Base_Types.Unsigned_16_Payload = Base_Types.Unsigned_16_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_U16()
       v = Base_Types.Unsigned_16_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Unsigned_32_Payload ===================

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload
  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): Unit

  def next_ISZ_Base_TypesUnsigned_32_Payload(): ISZ[Base_Types.Unsigned_32_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
    var value: U32 = next_U32()

    var v: Base_Types.Unsigned_32_Payload = Base_Types.Unsigned_32_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_U32()
       v = Base_Types.Unsigned_32_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Unsigned_64_Payload ===================

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload
  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): Unit

  def next_ISZ_Base_TypesUnsigned_64_Payload(): ISZ[Base_Types.Unsigned_64_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
    var value: U64 = next_U64()

    var v: Base_Types.Unsigned_64_Payload = Base_Types.Unsigned_64_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_U64()
       v = Base_Types.Unsigned_64_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Float_Payload ===================

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload
  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): Unit

  def next_ISZ_Base_TypesFloat_Payload(): ISZ[Base_Types.Float_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesFloat_Payload(): Base_Types.Float_Payload = {
    var value: R = next_R()

    var v: Base_Types.Float_Payload = Base_Types.Float_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesFloat_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_R()
       v = Base_Types.Float_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Float_32_Payload ===================

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload
  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): Unit

  def next_ISZ_Base_TypesFloat_32_Payload(): ISZ[Base_Types.Float_32_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
    var value: F32 = next_F32()

    var v: Base_Types.Float_32_Payload = Base_Types.Float_32_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_F32()
       v = Base_Types.Float_32_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Float_64_Payload ===================

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload
  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): Unit

  def next_ISZ_Base_TypesFloat_64_Payload(): ISZ[Base_Types.Float_64_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
    var value: F64 = next_F64()

    var v: Base_Types.Float_64_Payload = Base_Types.Float_64_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_F64()
       v = Base_Types.Float_64_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Character_Payload ===================

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload
  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): Unit

  def next_ISZ_Base_TypesCharacter_Payload(): ISZ[Base_Types.Character_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesCharacter_Payload(): Base_Types.Character_Payload = {
    var value: C = next_C()

    var v: Base_Types.Character_Payload = Base_Types.Character_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_C()
       v = Base_Types.Character_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.String_Payload ===================

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload
  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): Unit

  def next_ISZ_Base_TypesString_Payload(): ISZ[Base_Types.String_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesString_Payload(): Base_Types.String_Payload = {
    var value: String = next_String()

    var v: Base_Types.String_Payload = Base_Types.String_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesString_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_String()
       v = Base_Types.String_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Base_Types.Bits_Payload ===================

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload
  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): Unit

  def next_ISZ_Base_TypesBits_Payload(): ISZ[Base_Types.Bits_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Base_TypesBits_Payload(): Base_Types.Bits_Payload = {
    var value: ISZ[B] = next_ISZ_B()

    var v: Base_Types.Bits_Payload = Base_Types.Bits_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Base_TypesBits_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_ISZ_B()
       v = Base_Types.Bits_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Environment.Heat.Type ===================

  def get_Config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType
  def set_Config_Isolette_EnvironmentHeatType(config: Config_Isolette_EnvironmentHeatType): Unit

  def next_Isolette_EnvironmentHeatType(): Isolette_Environment.Heat.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Environment.Heat.numOfElements-1) //is genBetween inclusive

    var v: Isolette_Environment.Heat.Type = isolette.Isolette_Environment.Heat.byOrdinal(ordinal).get

    for(i <- 0 to 100) {
       if(get_Config_Isolette_EnvironmentHeatType.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Heat.numOfElements-1)
       v = isolette.Isolette_Environment.Heat.byOrdinal(ordinal).get
    }
    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Environment.Heat_Payload ===================

  def get_Config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload
  def set_Config_Isolette_EnvironmentHeat_Payload(config: Config_Isolette_EnvironmentHeat_Payload): Unit

  def next_ISZ_Isolette_EnvironmentHeat_Payload(): ISZ[Isolette_Environment.Heat_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_EnvironmentHeat_Payload(): Isolette_Environment.Heat_Payload = {
    var value: Isolette_Environment.Heat.Type = next_Isolette_EnvironmentHeatType()

    var v: Isolette_Environment.Heat_Payload = Isolette_Environment.Heat_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_EnvironmentHeat_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_EnvironmentHeatType()
       v = Isolette_Environment.Heat_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.On_Off.Type ===================

  def get_Config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType
  def set_Config_Isolette_Data_ModelOn_OffType(config: Config_Isolette_Data_ModelOn_OffType): Unit

  def next_Isolette_Data_ModelOn_OffType(): Isolette_Data_Model.On_Off.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.On_Off.numOfElements-1) //is genBetween inclusive

    var v: Isolette_Data_Model.On_Off.Type = isolette.Isolette_Data_Model.On_Off.byOrdinal(ordinal).get

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelOn_OffType.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.On_Off.numOfElements-1)
       v = isolette.Isolette_Data_Model.On_Off.byOrdinal(ordinal).get
    }
    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Status.Type ===================

  def get_Config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType
  def set_Config_Isolette_Data_ModelStatusType(config: Config_Isolette_Data_ModelStatusType): Unit

  def next_Isolette_Data_ModelStatusType(): Isolette_Data_Model.Status.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Status.numOfElements-1) //is genBetween inclusive

    var v: Isolette_Data_Model.Status.Type = isolette.Isolette_Data_Model.Status.byOrdinal(ordinal).get

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelStatusType.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Status.numOfElements-1)
       v = isolette.Isolette_Data_Model.Status.byOrdinal(ordinal).get
    }
    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.On_Off_Payload ===================

  def get_Config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload
  def set_Config_Isolette_Data_ModelOn_Off_Payload(config: Config_Isolette_Data_ModelOn_Off_Payload): Unit

  def next_ISZ_Isolette_Data_ModelOn_Off_Payload(): ISZ[Isolette_Data_Model.On_Off_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelOn_Off_Payload(): Isolette_Data_Model.On_Off_Payload = {
    var value: Isolette_Data_Model.On_Off.Type = next_Isolette_Data_ModelOn_OffType()

    var v: Isolette_Data_Model.On_Off_Payload = Isolette_Data_Model.On_Off_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelOn_Off_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelOn_OffType()
       v = Isolette_Data_Model.On_Off_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Status_Payload ===================

  def get_Config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload
  def set_Config_Isolette_Data_ModelStatus_Payload(config: Config_Isolette_Data_ModelStatus_Payload): Unit

  def next_ISZ_Isolette_Data_ModelStatus_Payload(): ISZ[Isolette_Data_Model.Status_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelStatus_Payload(): Isolette_Data_Model.Status_Payload = {
    var value: Isolette_Data_Model.Status.Type = next_Isolette_Data_ModelStatusType()

    var v: Isolette_Data_Model.Status_Payload = Isolette_Data_Model.Status_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelStatus_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelStatusType()
       v = Isolette_Data_Model.Status_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Temp_impl ===================

  def get_Config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl
  def set_Config_Isolette_Data_ModelTemp_impl(config: Config_Isolette_Data_ModelTemp_impl): Unit

  def next_ISZ_Isolette_Data_ModelTemp_impl(): ISZ[Isolette_Data_Model.Temp_impl] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelTemp_impl(): Isolette_Data_Model.Temp_impl = {
    var value: F32 = next_F32()

    var v: Isolette_Data_Model.Temp_impl = Isolette_Data_Model.Temp_impl(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelTemp_impl.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_F32()
       v = Isolette_Data_Model.Temp_impl(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Temp_impl_Payload ===================

  def get_Config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload
  def set_Config_Isolette_Data_ModelTemp_impl_Payload(config: Config_Isolette_Data_ModelTemp_impl_Payload): Unit

  def next_ISZ_Isolette_Data_ModelTemp_impl_Payload(): ISZ[Isolette_Data_Model.Temp_impl_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelTemp_impl_Payload(): Isolette_Data_Model.Temp_impl_Payload = {
    var value: Isolette_Data_Model.Temp_impl = next_Isolette_Data_ModelTemp_impl()

    var v: Isolette_Data_Model.Temp_impl_Payload = Isolette_Data_Model.Temp_impl_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelTemp_impl_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelTemp_impl()
       v = Isolette_Data_Model.Temp_impl_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.ValueStatus.Type ===================

  def get_Config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType
  def set_Config_Isolette_Data_ModelValueStatusType(config: Config_Isolette_Data_ModelValueStatusType): Unit

  def next_Isolette_Data_ModelValueStatusType(): Isolette_Data_Model.ValueStatus.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.ValueStatus.numOfElements-1) //is genBetween inclusive

    var v: Isolette_Data_Model.ValueStatus.Type = isolette.Isolette_Data_Model.ValueStatus.byOrdinal(ordinal).get

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelValueStatusType.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.ValueStatus.numOfElements-1)
       v = isolette.Isolette_Data_Model.ValueStatus.byOrdinal(ordinal).get
    }
    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.ValueStatus_Payload ===================

  def get_Config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload
  def set_Config_Isolette_Data_ModelValueStatus_Payload(config: Config_Isolette_Data_ModelValueStatus_Payload): Unit

  def next_ISZ_Isolette_Data_ModelValueStatus_Payload(): ISZ[Isolette_Data_Model.ValueStatus_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelValueStatus_Payload(): Isolette_Data_Model.ValueStatus_Payload = {
    var value: Isolette_Data_Model.ValueStatus.Type = next_Isolette_Data_ModelValueStatusType()

    var v: Isolette_Data_Model.ValueStatus_Payload = Isolette_Data_Model.ValueStatus_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelValueStatus_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelValueStatusType()
       v = Isolette_Data_Model.ValueStatus_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Monitor_Mode.Type ===================

  def get_Config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType
  def set_Config_Isolette_Data_ModelMonitor_ModeType(config: Config_Isolette_Data_ModelMonitor_ModeType): Unit

  def next_Isolette_Data_ModelMonitor_ModeType(): Isolette_Data_Model.Monitor_Mode.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Monitor_Mode.numOfElements-1) //is genBetween inclusive

    var v: Isolette_Data_Model.Monitor_Mode.Type = isolette.Isolette_Data_Model.Monitor_Mode.byOrdinal(ordinal).get

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelMonitor_ModeType.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Monitor_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Monitor_Mode.byOrdinal(ordinal).get
    }
    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Monitor_Mode_Payload ===================

  def get_Config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload
  def set_Config_Isolette_Data_ModelMonitor_Mode_Payload(config: Config_Isolette_Data_ModelMonitor_Mode_Payload): Unit

  def next_ISZ_Isolette_Data_ModelMonitor_Mode_Payload(): ISZ[Isolette_Data_Model.Monitor_Mode_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelMonitor_Mode_Payload(): Isolette_Data_Model.Monitor_Mode_Payload = {
    var value: Isolette_Data_Model.Monitor_Mode.Type = next_Isolette_Data_ModelMonitor_ModeType()

    var v: Isolette_Data_Model.Monitor_Mode_Payload = Isolette_Data_Model.Monitor_Mode_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelMonitor_Mode_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelMonitor_ModeType()
       v = Isolette_Data_Model.Monitor_Mode_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Regulator_Mode.Type ===================

  def get_Config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType
  def set_Config_Isolette_Data_ModelRegulator_ModeType(config: Config_Isolette_Data_ModelRegulator_ModeType): Unit

  def next_Isolette_Data_ModelRegulator_ModeType(): Isolette_Data_Model.Regulator_Mode.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Data_Model.Regulator_Mode.numOfElements-1) //is genBetween inclusive

    var v: Isolette_Data_Model.Regulator_Mode.Type = isolette.Isolette_Data_Model.Regulator_Mode.byOrdinal(ordinal).get

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelRegulator_ModeType.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Data_Model.Regulator_Mode.numOfElements-1)
       v = isolette.Isolette_Data_Model.Regulator_Mode.byOrdinal(ordinal).get
    }
    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Regulator_Mode_Payload ===================

  def get_Config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload
  def set_Config_Isolette_Data_ModelRegulator_Mode_Payload(config: Config_Isolette_Data_ModelRegulator_Mode_Payload): Unit

  def next_ISZ_Isolette_Data_ModelRegulator_Mode_Payload(): ISZ[Isolette_Data_Model.Regulator_Mode_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelRegulator_Mode_Payload(): Isolette_Data_Model.Regulator_Mode_Payload = {
    var value: Isolette_Data_Model.Regulator_Mode.Type = next_Isolette_Data_ModelRegulator_ModeType()

    var v: Isolette_Data_Model.Regulator_Mode_Payload = Isolette_Data_Model.Regulator_Mode_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelRegulator_Mode_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelRegulator_ModeType()
       v = Isolette_Data_Model.Regulator_Mode_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.TempWstatus_impl ===================

  def get_Config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl
  def set_Config_Isolette_Data_ModelTempWstatus_impl(config: Config_Isolette_Data_ModelTempWstatus_impl): Unit

  def next_ISZ_Isolette_Data_ModelTempWstatus_impl(): ISZ[Isolette_Data_Model.TempWstatus_impl] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelTempWstatus_impl(): Isolette_Data_Model.TempWstatus_impl = {
    var value: F32 = next_F32()
    var status: Isolette_Data_Model.ValueStatus.Type = next_Isolette_Data_ModelValueStatusType()

    var v: Isolette_Data_Model.TempWstatus_impl = Isolette_Data_Model.TempWstatus_impl(value, status)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelTempWstatus_impl.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_F32()
       status = next_Isolette_Data_ModelValueStatusType()
       v = Isolette_Data_Model.TempWstatus_impl(value, status)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.TempWstatus_impl_Payload ===================

  def get_Config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload
  def set_Config_Isolette_Data_ModelTempWstatus_impl_Payload(config: Config_Isolette_Data_ModelTempWstatus_impl_Payload): Unit

  def next_ISZ_Isolette_Data_ModelTempWstatus_impl_Payload(): ISZ[Isolette_Data_Model.TempWstatus_impl_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelTempWstatus_impl_Payload(): Isolette_Data_Model.TempWstatus_impl_Payload = {
    var value: Isolette_Data_Model.TempWstatus_impl = next_Isolette_Data_ModelTempWstatus_impl()

    var v: Isolette_Data_Model.TempWstatus_impl_Payload = Isolette_Data_Model.TempWstatus_impl_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelTempWstatus_impl_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelTempWstatus_impl()
       v = Isolette_Data_Model.TempWstatus_impl_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl ===================

  def get_Config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl
  def set_Config_Isolette_Data_ModelFailure_Flag_impl(config: Config_Isolette_Data_ModelFailure_Flag_impl): Unit

  def next_ISZ_Isolette_Data_ModelFailure_Flag_impl(): ISZ[Isolette_Data_Model.Failure_Flag_impl] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelFailure_Flag_impl(): Isolette_Data_Model.Failure_Flag_impl = {
    var value: B = next_B()

    var v: Isolette_Data_Model.Failure_Flag_impl = Isolette_Data_Model.Failure_Flag_impl(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelFailure_Flag_impl.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_B()
       v = Isolette_Data_Model.Failure_Flag_impl(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl ===================

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl
  def set_Config_Isolette_Data_ModelPhysicalTemp_impl(config: Config_Isolette_Data_ModelPhysicalTemp_impl): Unit

  def next_ISZ_Isolette_Data_ModelPhysicalTemp_impl(): ISZ[Isolette_Data_Model.PhysicalTemp_impl] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelPhysicalTemp_impl(): Isolette_Data_Model.PhysicalTemp_impl = {
    var value: F32 = next_F32()

    var v: Isolette_Data_Model.PhysicalTemp_impl = Isolette_Data_Model.PhysicalTemp_impl(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelPhysicalTemp_impl.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_F32()
       v = Isolette_Data_Model.PhysicalTemp_impl(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl_Payload ===================

  def get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload
  def set_Config_Isolette_Data_ModelFailure_Flag_impl_Payload(config: Config_Isolette_Data_ModelFailure_Flag_impl_Payload): Unit

  def next_ISZ_Isolette_Data_ModelFailure_Flag_impl_Payload(): ISZ[Isolette_Data_Model.Failure_Flag_impl_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelFailure_Flag_impl_Payload(): Isolette_Data_Model.Failure_Flag_impl_Payload = {
    var value: Isolette_Data_Model.Failure_Flag_impl = next_Isolette_Data_ModelFailure_Flag_impl()

    var v: Isolette_Data_Model.Failure_Flag_impl_Payload = Isolette_Data_Model.Failure_Flag_impl_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelFailure_Flag_impl()
       v = Isolette_Data_Model.Failure_Flag_impl_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl_Payload ===================

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload
  def set_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(config: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload): Unit

  def next_ISZ_Isolette_Data_ModelPhysicalTemp_impl_Payload(): ISZ[Isolette_Data_Model.PhysicalTemp_impl_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_Data_ModelPhysicalTemp_impl_Payload(): Isolette_Data_Model.PhysicalTemp_impl_Payload = {
    var value: Isolette_Data_Model.PhysicalTemp_impl = next_Isolette_Data_ModelPhysicalTemp_impl()

    var v: Isolette_Data_Model.PhysicalTemp_impl_Payload = Isolette_Data_Model.PhysicalTemp_impl_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_Data_ModelPhysicalTemp_impl()
       v = Isolette_Data_Model.PhysicalTemp_impl_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Environment.Interface_Interaction.Type ===================

  def get_Config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType
  def set_Config_Isolette_EnvironmentInterface_InteractionType(config: Config_Isolette_EnvironmentInterface_InteractionType): Unit

  def next_Isolette_EnvironmentInterface_InteractionType(): Isolette_Environment.Interface_Interaction.Type = {

    var ordinal: Z = gen.nextZBetween(0, isolette.Isolette_Environment.Interface_Interaction.numOfElements-1) //is genBetween inclusive

    var v: Isolette_Environment.Interface_Interaction.Type = isolette.Isolette_Environment.Interface_Interaction.byOrdinal(ordinal).get

    for(i <- 0 to 100) {
       if(get_Config_Isolette_EnvironmentInterface_InteractionType.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       ordinal= gen.nextZBetween(0, isolette.Isolette_Environment.Interface_Interaction.numOfElements-1)
       v = isolette.Isolette_Environment.Interface_Interaction.byOrdinal(ordinal).get
    }
    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }

  // ============= Isolette_Environment.Interface_Interaction_Payload ===================

  def get_Config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload
  def set_Config_Isolette_EnvironmentInterface_Interaction_Payload(config: Config_Isolette_EnvironmentInterface_Interaction_Payload): Unit

  def next_ISZ_Isolette_EnvironmentInterface_Interaction_Payload(): ISZ[Isolette_Environment.Interface_Interaction_Payload] = {
     assert(F, "Requirements to strict to generate")
     halt("Requirements to strict to generate")
    }

  def next_Isolette_EnvironmentInterface_Interaction_Payload(): Isolette_Environment.Interface_Interaction_Payload = {
    var value: Isolette_Environment.Interface_Interaction.Type = next_Isolette_EnvironmentInterface_InteractionType()

    var v: Isolette_Environment.Interface_Interaction_Payload = Isolette_Environment.Interface_Interaction_Payload(value)

    for(i <- 0 to 100) {
       if(get_Config_Isolette_EnvironmentInterface_Interaction_Payload.filter(v)) {
         return v
       }
       println(s"Retrying for failing value: $v")
       value = next_Isolette_EnvironmentInterface_InteractionType()
       v = Isolette_Environment.Interface_Interaction_Payload(value)
    }

    assert(F, "Requirements to strict to generate")
    halt("Requirements to strict to generate")
  }
}

@record class RandomLib(val gen: org.sireum.Random.Gen) extends RandomLibI {


  // ============= Z ===================
  def alwaysTrue_Z(v: Z): B = {return T}

  var config_Z: Config_Z = Config_Z(alwaysTrue_Z _)
  def get_Config_Z: Config_Z = {return config_Z}

  def set_Config_Z(config: Config_Z): Unit ={
    config_Z = config
  }

  // ============= B ===================
  def alwaysTrue_B(v: B): B = {return T}

  var config_B: Config_B = Config_B(alwaysTrue_B _)
  def get_Config_B: Config_B = {return config_B}

  def set_Config_B(config: Config_B): Unit ={
    config_B = config
  }

  // ============= C ===================
  def alwaysTrue_C(v: C): B = {return T}

  var config_C: Config_C = Config_C(alwaysTrue_C _)
  def get_Config_C: Config_C = {return config_C}

  def set_Config_C(config: Config_C): Unit ={
    config_C = config
  }

  // ============= R ===================
  def alwaysTrue_R(v: R): B = {return T}

  var config_R: Config_R = Config_R(alwaysTrue_R _)
  def get_Config_R: Config_R = {return config_R}

  def set_Config_R(config: Config_R): Unit ={
    config_R = config
  }

  // ============= F32 ===================
  def alwaysTrue_F32(v: F32): B = {return T}

  var config_F32: Config_F32 = Config_F32(alwaysTrue_F32 _)
  def get_Config_F32: Config_F32 = {return config_F32}

  def set_Config_F32(config: Config_F32): Unit ={
    config_F32 = config
  }

  // ============= F64 ===================
  def alwaysTrue_F64(v: F64): B = {return T}

  var config_F64: Config_F64 = Config_F64(alwaysTrue_F64 _)
  def get_Config_F64: Config_F64 = {return config_F64}

  def set_Config_F64(config: Config_F64): Unit ={
    config_F64 = config
  }

  // ============= S8 ===================
  def alwaysTrue_S8(v: S8): B = {return T}

  var config_S8: Config_S8 = Config_S8(alwaysTrue_S8 _)
  def get_Config_S8: Config_S8 = {return config_S8}

  def set_Config_S8(config: Config_S8): Unit ={
    config_S8 = config
  }

  // ============= S16 ===================
  def alwaysTrue_S16(v: S16): B = {return T}

  var config_S16: Config_S16 = Config_S16(alwaysTrue_S16 _)
  def get_Config_S16: Config_S16 = {return config_S16}

  def set_Config_S16(config: Config_S16): Unit ={
    config_S16 = config
  }

  // ============= S32 ===================
  def alwaysTrue_S32(v: S32): B = {return T}

  var config_S32: Config_S32 = Config_S32(alwaysTrue_S32 _)
  def get_Config_S32: Config_S32 = {return config_S32}

  def set_Config_S32(config: Config_S32): Unit ={
    config_S32 = config
  }

  // ============= S64 ===================
  def alwaysTrue_S64(v: S64): B = {return T}

  var config_S64: Config_S64 = Config_S64(alwaysTrue_S64 _)
  def get_Config_S64: Config_S64 = {return config_S64}

  def set_Config_S64(config: Config_S64): Unit ={
    config_S64 = config
  }

  // ============= U8 ===================
  def alwaysTrue_U8(v: U8): B = {return T}

  var config_U8: Config_U8 = Config_U8(alwaysTrue_U8 _)
  def get_Config_U8: Config_U8 = {return config_U8}

  def set_Config_U8(config: Config_U8): Unit ={
    config_U8 = config
  }

  // ============= U16 ===================
  def alwaysTrue_U16(v: U16): B = {return T}

  var config_U16: Config_U16 = Config_U16(alwaysTrue_U16 _)
  def get_Config_U16: Config_U16 = {return config_U16}

  def set_Config_U16(config: Config_U16): Unit ={
    config_U16 = config
  }

  // ============= U32 ===================
  def alwaysTrue_U32(v: U32): B = {return T}

  var config_U32: Config_U32 = Config_U32(alwaysTrue_U32 _)
  def get_Config_U32: Config_U32 = {return config_U32}

  def set_Config_U32(config: Config_U32): Unit ={
    config_U32 = config
  }

  // ============= U64 ===================
  def alwaysTrue_U64(v: U64): B = {return T}

  var config_U64: Config_U64 = Config_U64(alwaysTrue_U64 _)
  def get_Config_U64: Config_U64 = {return config_U64}

  def set_Config_U64(config: Config_U64): Unit ={
    config_U64 = config
  }

  // ============= Base_Types.Boolean_Payload ===================
  def alwaysTrue_Base_TypesBoolean_Payload(v: Base_Types.Boolean_Payload): B = {return T}

  var config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = Config_Base_TypesBoolean_Payload(alwaysTrue_Base_TypesBoolean_Payload _)

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = {return config_Base_TypesBoolean_Payload}

  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): Unit ={
    config_Base_TypesBoolean_Payload = config
  }

  // ============= Base_Types.Integer_Payload ===================
  def alwaysTrue_Base_TypesInteger_Payload(v: Base_Types.Integer_Payload): B = {return T}

  var config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = Config_Base_TypesInteger_Payload(alwaysTrue_Base_TypesInteger_Payload _)

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = {return config_Base_TypesInteger_Payload}

  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): Unit ={
    config_Base_TypesInteger_Payload = config
  }

  // ============= Base_Types.Integer_8_Payload ===================
  def alwaysTrue_Base_TypesInteger_8_Payload(v: Base_Types.Integer_8_Payload): B = {return T}

  var config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = Config_Base_TypesInteger_8_Payload(alwaysTrue_Base_TypesInteger_8_Payload _)

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = {return config_Base_TypesInteger_8_Payload}

  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): Unit ={
    config_Base_TypesInteger_8_Payload = config
  }

  // ============= Base_Types.Integer_16_Payload ===================
  def alwaysTrue_Base_TypesInteger_16_Payload(v: Base_Types.Integer_16_Payload): B = {return T}

  var config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = Config_Base_TypesInteger_16_Payload(alwaysTrue_Base_TypesInteger_16_Payload _)

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = {return config_Base_TypesInteger_16_Payload}

  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): Unit ={
    config_Base_TypesInteger_16_Payload = config
  }

  // ============= Base_Types.Integer_32_Payload ===================
  def alwaysTrue_Base_TypesInteger_32_Payload(v: Base_Types.Integer_32_Payload): B = {return T}

  var config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = Config_Base_TypesInteger_32_Payload(alwaysTrue_Base_TypesInteger_32_Payload _)

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = {return config_Base_TypesInteger_32_Payload}

  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): Unit ={
    config_Base_TypesInteger_32_Payload = config
  }

  // ============= Base_Types.Integer_64_Payload ===================
  def alwaysTrue_Base_TypesInteger_64_Payload(v: Base_Types.Integer_64_Payload): B = {return T}

  var config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = Config_Base_TypesInteger_64_Payload(alwaysTrue_Base_TypesInteger_64_Payload _)

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = {return config_Base_TypesInteger_64_Payload}

  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): Unit ={
    config_Base_TypesInteger_64_Payload = config
  }

  // ============= Base_Types.Unsigned_8_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_8_Payload(v: Base_Types.Unsigned_8_Payload): B = {return T}

  var config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = Config_Base_TypesUnsigned_8_Payload(alwaysTrue_Base_TypesUnsigned_8_Payload _)

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = {return config_Base_TypesUnsigned_8_Payload}

  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): Unit ={
    config_Base_TypesUnsigned_8_Payload = config
  }

  // ============= Base_Types.Unsigned_16_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_16_Payload(v: Base_Types.Unsigned_16_Payload): B = {return T}

  var config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = Config_Base_TypesUnsigned_16_Payload(alwaysTrue_Base_TypesUnsigned_16_Payload _)

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = {return config_Base_TypesUnsigned_16_Payload}

  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): Unit ={
    config_Base_TypesUnsigned_16_Payload = config
  }

  // ============= Base_Types.Unsigned_32_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_32_Payload(v: Base_Types.Unsigned_32_Payload): B = {return T}

  var config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = Config_Base_TypesUnsigned_32_Payload(alwaysTrue_Base_TypesUnsigned_32_Payload _)

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = {return config_Base_TypesUnsigned_32_Payload}

  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): Unit ={
    config_Base_TypesUnsigned_32_Payload = config
  }

  // ============= Base_Types.Unsigned_64_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_64_Payload(v: Base_Types.Unsigned_64_Payload): B = {return T}

  var config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = Config_Base_TypesUnsigned_64_Payload(alwaysTrue_Base_TypesUnsigned_64_Payload _)

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = {return config_Base_TypesUnsigned_64_Payload}

  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): Unit ={
    config_Base_TypesUnsigned_64_Payload = config
  }

  // ============= Base_Types.Float_Payload ===================
  def alwaysTrue_Base_TypesFloat_Payload(v: Base_Types.Float_Payload): B = {return T}

  var config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = Config_Base_TypesFloat_Payload(alwaysTrue_Base_TypesFloat_Payload _)

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = {return config_Base_TypesFloat_Payload}

  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): Unit ={
    config_Base_TypesFloat_Payload = config
  }

  // ============= Base_Types.Float_32_Payload ===================
  def alwaysTrue_Base_TypesFloat_32_Payload(v: Base_Types.Float_32_Payload): B = {return T}

  var config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = Config_Base_TypesFloat_32_Payload(alwaysTrue_Base_TypesFloat_32_Payload _)

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = {return config_Base_TypesFloat_32_Payload}

  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): Unit ={
    config_Base_TypesFloat_32_Payload = config
  }

  // ============= Base_Types.Float_64_Payload ===================
  def alwaysTrue_Base_TypesFloat_64_Payload(v: Base_Types.Float_64_Payload): B = {return T}

  var config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = Config_Base_TypesFloat_64_Payload(alwaysTrue_Base_TypesFloat_64_Payload _)

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = {return config_Base_TypesFloat_64_Payload}

  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): Unit ={
    config_Base_TypesFloat_64_Payload = config
  }

  // ============= Base_Types.Character_Payload ===================
  def alwaysTrue_Base_TypesCharacter_Payload(v: Base_Types.Character_Payload): B = {return T}

  var config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = Config_Base_TypesCharacter_Payload(alwaysTrue_Base_TypesCharacter_Payload _)

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = {return config_Base_TypesCharacter_Payload}

  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): Unit ={
    config_Base_TypesCharacter_Payload = config
  }

  // ============= Base_Types.String_Payload ===================
  def alwaysTrue_Base_TypesString_Payload(v: Base_Types.String_Payload): B = {return T}

  var config_Base_TypesString_Payload: Config_Base_TypesString_Payload = Config_Base_TypesString_Payload(alwaysTrue_Base_TypesString_Payload _)

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload = {return config_Base_TypesString_Payload}

  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): Unit ={
    config_Base_TypesString_Payload = config
  }

  // ============= Base_Types.Bits_Payload ===================
  def alwaysTrue_Base_TypesBits_Payload(v: Base_Types.Bits_Payload): B = {return T}

  var config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = Config_Base_TypesBits_Payload(alwaysTrue_Base_TypesBits_Payload _)

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = {return config_Base_TypesBits_Payload}

  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): Unit ={
    config_Base_TypesBits_Payload = config
  }

  // ============= Isolette_Environment.Heat.Type ===================
  def alwaysTrue_Isolette_EnvironmentHeatType(v: Isolette_Environment.Heat.Type): B = {return T}

  var config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType = Config_Isolette_EnvironmentHeatType(alwaysTrue_Isolette_EnvironmentHeatType _)

  def get_Config_Isolette_EnvironmentHeatType: Config_Isolette_EnvironmentHeatType = {return config_Isolette_EnvironmentHeatType}

  def set_Config_Isolette_EnvironmentHeatType(config: Config_Isolette_EnvironmentHeatType): Unit ={
    config_Isolette_EnvironmentHeatType = config
  }

  // ============= Isolette_Environment.Heat_Payload ===================
  def alwaysTrue_Isolette_EnvironmentHeat_Payload(v: Isolette_Environment.Heat_Payload): B = {return T}

  var config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload = Config_Isolette_EnvironmentHeat_Payload(alwaysTrue_Isolette_EnvironmentHeat_Payload _)

  def get_Config_Isolette_EnvironmentHeat_Payload: Config_Isolette_EnvironmentHeat_Payload = {return config_Isolette_EnvironmentHeat_Payload}

  def set_Config_Isolette_EnvironmentHeat_Payload(config: Config_Isolette_EnvironmentHeat_Payload): Unit ={
    config_Isolette_EnvironmentHeat_Payload = config
  }

  // ============= Isolette_Data_Model.On_Off.Type ===================
  def alwaysTrue_Isolette_Data_ModelOn_OffType(v: Isolette_Data_Model.On_Off.Type): B = {return T}

  var config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType = Config_Isolette_Data_ModelOn_OffType(alwaysTrue_Isolette_Data_ModelOn_OffType _)

  def get_Config_Isolette_Data_ModelOn_OffType: Config_Isolette_Data_ModelOn_OffType = {return config_Isolette_Data_ModelOn_OffType}

  def set_Config_Isolette_Data_ModelOn_OffType(config: Config_Isolette_Data_ModelOn_OffType): Unit ={
    config_Isolette_Data_ModelOn_OffType = config
  }

  // ============= Isolette_Data_Model.Status.Type ===================
  def alwaysTrue_Isolette_Data_ModelStatusType(v: Isolette_Data_Model.Status.Type): B = {return T}

  var config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType = Config_Isolette_Data_ModelStatusType(alwaysTrue_Isolette_Data_ModelStatusType _)

  def get_Config_Isolette_Data_ModelStatusType: Config_Isolette_Data_ModelStatusType = {return config_Isolette_Data_ModelStatusType}

  def set_Config_Isolette_Data_ModelStatusType(config: Config_Isolette_Data_ModelStatusType): Unit ={
    config_Isolette_Data_ModelStatusType = config
  }

  // ============= Isolette_Data_Model.On_Off_Payload ===================
  def alwaysTrue_Isolette_Data_ModelOn_Off_Payload(v: Isolette_Data_Model.On_Off_Payload): B = {return T}

  var config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload = Config_Isolette_Data_ModelOn_Off_Payload(alwaysTrue_Isolette_Data_ModelOn_Off_Payload _)

  def get_Config_Isolette_Data_ModelOn_Off_Payload: Config_Isolette_Data_ModelOn_Off_Payload = {return config_Isolette_Data_ModelOn_Off_Payload}

  def set_Config_Isolette_Data_ModelOn_Off_Payload(config: Config_Isolette_Data_ModelOn_Off_Payload): Unit ={
    config_Isolette_Data_ModelOn_Off_Payload = config
  }

  // ============= Isolette_Data_Model.Status_Payload ===================
  def alwaysTrue_Isolette_Data_ModelStatus_Payload(v: Isolette_Data_Model.Status_Payload): B = {return T}

  var config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload = Config_Isolette_Data_ModelStatus_Payload(alwaysTrue_Isolette_Data_ModelStatus_Payload _)

  def get_Config_Isolette_Data_ModelStatus_Payload: Config_Isolette_Data_ModelStatus_Payload = {return config_Isolette_Data_ModelStatus_Payload}

  def set_Config_Isolette_Data_ModelStatus_Payload(config: Config_Isolette_Data_ModelStatus_Payload): Unit ={
    config_Isolette_Data_ModelStatus_Payload = config
  }

  // ============= Isolette_Data_Model.Temp_impl ===================
  def alwaysTrue_Isolette_Data_ModelTemp_impl(v: Isolette_Data_Model.Temp_impl): B = {return T}

  var config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl = Config_Isolette_Data_ModelTemp_impl(alwaysTrue_Isolette_Data_ModelTemp_impl _)

  def get_Config_Isolette_Data_ModelTemp_impl: Config_Isolette_Data_ModelTemp_impl = {return config_Isolette_Data_ModelTemp_impl}

  def set_Config_Isolette_Data_ModelTemp_impl(config: Config_Isolette_Data_ModelTemp_impl): Unit ={
    config_Isolette_Data_ModelTemp_impl = config
  }

  // ============= Isolette_Data_Model.Temp_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelTemp_impl_Payload(v: Isolette_Data_Model.Temp_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload = Config_Isolette_Data_ModelTemp_impl_Payload(alwaysTrue_Isolette_Data_ModelTemp_impl_Payload _)

  def get_Config_Isolette_Data_ModelTemp_impl_Payload: Config_Isolette_Data_ModelTemp_impl_Payload = {return config_Isolette_Data_ModelTemp_impl_Payload}

  def set_Config_Isolette_Data_ModelTemp_impl_Payload(config: Config_Isolette_Data_ModelTemp_impl_Payload): Unit ={
    config_Isolette_Data_ModelTemp_impl_Payload = config
  }

  // ============= Isolette_Data_Model.ValueStatus.Type ===================
  def alwaysTrue_Isolette_Data_ModelValueStatusType(v: Isolette_Data_Model.ValueStatus.Type): B = {return T}

  var config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType = Config_Isolette_Data_ModelValueStatusType(alwaysTrue_Isolette_Data_ModelValueStatusType _)

  def get_Config_Isolette_Data_ModelValueStatusType: Config_Isolette_Data_ModelValueStatusType = {return config_Isolette_Data_ModelValueStatusType}

  def set_Config_Isolette_Data_ModelValueStatusType(config: Config_Isolette_Data_ModelValueStatusType): Unit ={
    config_Isolette_Data_ModelValueStatusType = config
  }

  // ============= Isolette_Data_Model.ValueStatus_Payload ===================
  def alwaysTrue_Isolette_Data_ModelValueStatus_Payload(v: Isolette_Data_Model.ValueStatus_Payload): B = {return T}

  var config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload = Config_Isolette_Data_ModelValueStatus_Payload(alwaysTrue_Isolette_Data_ModelValueStatus_Payload _)

  def get_Config_Isolette_Data_ModelValueStatus_Payload: Config_Isolette_Data_ModelValueStatus_Payload = {return config_Isolette_Data_ModelValueStatus_Payload}

  def set_Config_Isolette_Data_ModelValueStatus_Payload(config: Config_Isolette_Data_ModelValueStatus_Payload): Unit ={
    config_Isolette_Data_ModelValueStatus_Payload = config
  }

  // ============= Isolette_Data_Model.Monitor_Mode.Type ===================
  def alwaysTrue_Isolette_Data_ModelMonitor_ModeType(v: Isolette_Data_Model.Monitor_Mode.Type): B = {return T}

  var config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType = Config_Isolette_Data_ModelMonitor_ModeType(alwaysTrue_Isolette_Data_ModelMonitor_ModeType _)

  def get_Config_Isolette_Data_ModelMonitor_ModeType: Config_Isolette_Data_ModelMonitor_ModeType = {return config_Isolette_Data_ModelMonitor_ModeType}

  def set_Config_Isolette_Data_ModelMonitor_ModeType(config: Config_Isolette_Data_ModelMonitor_ModeType): Unit ={
    config_Isolette_Data_ModelMonitor_ModeType = config
  }

  // ============= Isolette_Data_Model.Monitor_Mode_Payload ===================
  def alwaysTrue_Isolette_Data_ModelMonitor_Mode_Payload(v: Isolette_Data_Model.Monitor_Mode_Payload): B = {return T}

  var config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload = Config_Isolette_Data_ModelMonitor_Mode_Payload(alwaysTrue_Isolette_Data_ModelMonitor_Mode_Payload _)

  def get_Config_Isolette_Data_ModelMonitor_Mode_Payload: Config_Isolette_Data_ModelMonitor_Mode_Payload = {return config_Isolette_Data_ModelMonitor_Mode_Payload}

  def set_Config_Isolette_Data_ModelMonitor_Mode_Payload(config: Config_Isolette_Data_ModelMonitor_Mode_Payload): Unit ={
    config_Isolette_Data_ModelMonitor_Mode_Payload = config
  }

  // ============= Isolette_Data_Model.Regulator_Mode.Type ===================
  def alwaysTrue_Isolette_Data_ModelRegulator_ModeType(v: Isolette_Data_Model.Regulator_Mode.Type): B = {return T}

  var config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType = Config_Isolette_Data_ModelRegulator_ModeType(alwaysTrue_Isolette_Data_ModelRegulator_ModeType _)

  def get_Config_Isolette_Data_ModelRegulator_ModeType: Config_Isolette_Data_ModelRegulator_ModeType = {return config_Isolette_Data_ModelRegulator_ModeType}

  def set_Config_Isolette_Data_ModelRegulator_ModeType(config: Config_Isolette_Data_ModelRegulator_ModeType): Unit ={
    config_Isolette_Data_ModelRegulator_ModeType = config
  }

  // ============= Isolette_Data_Model.Regulator_Mode_Payload ===================
  def alwaysTrue_Isolette_Data_ModelRegulator_Mode_Payload(v: Isolette_Data_Model.Regulator_Mode_Payload): B = {return T}

  var config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload = Config_Isolette_Data_ModelRegulator_Mode_Payload(alwaysTrue_Isolette_Data_ModelRegulator_Mode_Payload _)

  def get_Config_Isolette_Data_ModelRegulator_Mode_Payload: Config_Isolette_Data_ModelRegulator_Mode_Payload = {return config_Isolette_Data_ModelRegulator_Mode_Payload}

  def set_Config_Isolette_Data_ModelRegulator_Mode_Payload(config: Config_Isolette_Data_ModelRegulator_Mode_Payload): Unit ={
    config_Isolette_Data_ModelRegulator_Mode_Payload = config
  }

  // ============= Isolette_Data_Model.TempWstatus_impl ===================
  def alwaysTrue_Isolette_Data_ModelTempWstatus_impl(v: Isolette_Data_Model.TempWstatus_impl): B = {return T}

  var config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl = Config_Isolette_Data_ModelTempWstatus_impl(alwaysTrue_Isolette_Data_ModelTempWstatus_impl _)

  def get_Config_Isolette_Data_ModelTempWstatus_impl: Config_Isolette_Data_ModelTempWstatus_impl = {return config_Isolette_Data_ModelTempWstatus_impl}

  def set_Config_Isolette_Data_ModelTempWstatus_impl(config: Config_Isolette_Data_ModelTempWstatus_impl): Unit ={
    config_Isolette_Data_ModelTempWstatus_impl = config
  }

  // ============= Isolette_Data_Model.TempWstatus_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelTempWstatus_impl_Payload(v: Isolette_Data_Model.TempWstatus_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload = Config_Isolette_Data_ModelTempWstatus_impl_Payload(alwaysTrue_Isolette_Data_ModelTempWstatus_impl_Payload _)

  def get_Config_Isolette_Data_ModelTempWstatus_impl_Payload: Config_Isolette_Data_ModelTempWstatus_impl_Payload = {return config_Isolette_Data_ModelTempWstatus_impl_Payload}

  def set_Config_Isolette_Data_ModelTempWstatus_impl_Payload(config: Config_Isolette_Data_ModelTempWstatus_impl_Payload): Unit ={
    config_Isolette_Data_ModelTempWstatus_impl_Payload = config
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl ===================
  def alwaysTrue_Isolette_Data_ModelFailure_Flag_impl(v: Isolette_Data_Model.Failure_Flag_impl): B = {return T}

  var config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl = Config_Isolette_Data_ModelFailure_Flag_impl(alwaysTrue_Isolette_Data_ModelFailure_Flag_impl _)

  def get_Config_Isolette_Data_ModelFailure_Flag_impl: Config_Isolette_Data_ModelFailure_Flag_impl = {return config_Isolette_Data_ModelFailure_Flag_impl}

  def set_Config_Isolette_Data_ModelFailure_Flag_impl(config: Config_Isolette_Data_ModelFailure_Flag_impl): Unit ={
    config_Isolette_Data_ModelFailure_Flag_impl = config
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl ===================
  def alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl(v: Isolette_Data_Model.PhysicalTemp_impl): B = {return T}

  var config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl = Config_Isolette_Data_ModelPhysicalTemp_impl(alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl _)

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl: Config_Isolette_Data_ModelPhysicalTemp_impl = {return config_Isolette_Data_ModelPhysicalTemp_impl}

  def set_Config_Isolette_Data_ModelPhysicalTemp_impl(config: Config_Isolette_Data_ModelPhysicalTemp_impl): Unit ={
    config_Isolette_Data_ModelPhysicalTemp_impl = config
  }

  // ============= Isolette_Data_Model.Failure_Flag_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelFailure_Flag_impl_Payload(v: Isolette_Data_Model.Failure_Flag_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload = Config_Isolette_Data_ModelFailure_Flag_impl_Payload(alwaysTrue_Isolette_Data_ModelFailure_Flag_impl_Payload _)

  def get_Config_Isolette_Data_ModelFailure_Flag_impl_Payload: Config_Isolette_Data_ModelFailure_Flag_impl_Payload = {return config_Isolette_Data_ModelFailure_Flag_impl_Payload}

  def set_Config_Isolette_Data_ModelFailure_Flag_impl_Payload(config: Config_Isolette_Data_ModelFailure_Flag_impl_Payload): Unit ={
    config_Isolette_Data_ModelFailure_Flag_impl_Payload = config
  }

  // ============= Isolette_Data_Model.PhysicalTemp_impl_Payload ===================
  def alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl_Payload(v: Isolette_Data_Model.PhysicalTemp_impl_Payload): B = {return T}

  var config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload = Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(alwaysTrue_Isolette_Data_ModelPhysicalTemp_impl_Payload _)

  def get_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload = {return config_Isolette_Data_ModelPhysicalTemp_impl_Payload}

  def set_Config_Isolette_Data_ModelPhysicalTemp_impl_Payload(config: Config_Isolette_Data_ModelPhysicalTemp_impl_Payload): Unit ={
    config_Isolette_Data_ModelPhysicalTemp_impl_Payload = config
  }

  // ============= Isolette_Environment.Interface_Interaction.Type ===================
  def alwaysTrue_Isolette_EnvironmentInterface_InteractionType(v: Isolette_Environment.Interface_Interaction.Type): B = {return T}

  var config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType = Config_Isolette_EnvironmentInterface_InteractionType(alwaysTrue_Isolette_EnvironmentInterface_InteractionType _)

  def get_Config_Isolette_EnvironmentInterface_InteractionType: Config_Isolette_EnvironmentInterface_InteractionType = {return config_Isolette_EnvironmentInterface_InteractionType}

  def set_Config_Isolette_EnvironmentInterface_InteractionType(config: Config_Isolette_EnvironmentInterface_InteractionType): Unit ={
    config_Isolette_EnvironmentInterface_InteractionType = config
  }

  // ============= Isolette_Environment.Interface_Interaction_Payload ===================
  def alwaysTrue_Isolette_EnvironmentInterface_Interaction_Payload(v: Isolette_Environment.Interface_Interaction_Payload): B = {return T}

  var config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload = Config_Isolette_EnvironmentInterface_Interaction_Payload(alwaysTrue_Isolette_EnvironmentInterface_Interaction_Payload _)

  def get_Config_Isolette_EnvironmentInterface_Interaction_Payload: Config_Isolette_EnvironmentInterface_Interaction_Payload = {return config_Isolette_EnvironmentInterface_Interaction_Payload}

  def set_Config_Isolette_EnvironmentInterface_Interaction_Payload(config: Config_Isolette_EnvironmentInterface_Interaction_Payload): Unit ={
    config_Isolette_EnvironmentInterface_Interaction_Payload = config
  }
}

