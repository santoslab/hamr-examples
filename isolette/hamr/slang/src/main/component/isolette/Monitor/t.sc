// #Sireum #Logika

import org.sireum._

var c : F32 = 0f
var l: F32 = 0f
var u: F32 = 0f

def x(): Unit = {
  Contract (
    Requires(

      c != F32.NaN,
      l != F32.NaN,
      u != F32.NaN,

      //l + 0.5f != F32.NaN,

      //u - 0.5f != F32.NaN,

      //u - l > 1.0f,

      0.0f > u && u < 150.0f,
      //-500f > l && l < 500f,
       //-500f > c && c < 500f
    ),
    Ensures(T)
  )
  if (c < l || c > u) {
    assert (T)
  }
  else if ((c >= l && c < l + 0.5f) ||
    (c > (u - 0.5f) && c <= u)) {
    assert (T)
  }
  else if (c >= (l + 0.5f) && c <= (u - 0.5f)) {
    assert (T)
  }
  else {
    assert (F)
  }


}