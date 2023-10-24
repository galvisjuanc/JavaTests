package com.jcgc.util;

public class DateUtil {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0){
            return true;
        } else {
            return false;
        }

    }
}
