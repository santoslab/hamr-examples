# Isolette Unit Tests Traceability Report

This file indicates how each component/function requirement is addressed by unit testing.

## Regulate Subsystem

### Manage Heat Source

*REQ-MHS-1:* If the Regulator Mode is INIT, the Heat Control shall be set to Off.



*REQ-MHS-2:* If the Regulator Mode is NORMAL and the Current Temperature is less than the Lower Desired Temperature, the Heat Control shall be set to On.

*REQ-MHS-3:* If the Regulator Mode is NORMAL and the Current Temperature is
      greater than the Upper Desired Temperature, the Heat Control shall be set to Off.

*REQ-MHS-4:* If the Regulator Mode is NORMAL and the Current Temperature is
      greater than or equal to the Lower Desired Temperature and less than or equal to the
      Upper Desired Temperature, the value of the Heat Control shall not be changed.

*REQ-MHS-5:* If the Regulator Mode is FAILED, the Heat Control shall be set to Off.




## Monitor Subsystem

