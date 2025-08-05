package com.globallogic.practice;

import java.util.Calendar;

public class Clock {
    public int getHourOfDay() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
}
