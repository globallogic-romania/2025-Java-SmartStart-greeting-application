package com.globallogic.practice.clock;

import java.util.Calendar;

public class InternalClock implements Clock {

    @Override
    public int getHourOfDay() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
}