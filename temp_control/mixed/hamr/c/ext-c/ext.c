#include <ext.h>

// This file will not be overwritten so is safe to edit

// add c extension code here


#define MIN_TEMP 55
#define MAX_TEMP 100

static float temp = 0;
static float delta = 4;

void tc_TempSensor_TempSensorDevice_currentTempGet(STACK_FRAME tc_TempSensor_Temperature_i result) {
    // simulate
    if (temp == 0) {
        temp = tc_Initial_Values_defaultSetPoint()->low.degrees;
    }
    temp += delta;
    if (temp < tc_Initial_Values_defaultSetPoint()->low.degrees) delta = 4;
    else if (temp > tc_Initial_Values_defaultSetPoint()->high.degrees) delta = -4;
    result->degrees = (F32) temp;
}