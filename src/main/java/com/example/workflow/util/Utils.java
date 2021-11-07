package com.example.workflow.util;

public class Utils {


    public static String convertToTimeDuration(Long milisegundos){
        return toDay(milisegundos)
                + toHour(milisegundos)
                + toMinute(milisegundos)
                + toSecond(milisegundos)
                + toMillisecond(milisegundos);
    }
    private static String toMillisecond(Long milisegundos){
        long millis = milisegundos % 1000;
        return millis == 0 ? "" : millis + "Millis";
    }

    private static String toSecond(Long milisegundos){
        long second = (milisegundos / 1000) % 60;
        return second == 0 ? "" : second + "S";
    }

    private static String toMinute(Long milisegundos){
        long minute = (milisegundos / (1000 * 60)) % 60;
        return minute == 0 ? "" : minute + "M";
    }

    private static String toHour(Long milisegundos){
        long hour = (milisegundos / (1000 * 60 * 60)) % 24;
        return hour == 0 ? "" : hour + "H";
    }

    private static String toDay(Long milisegundos){
        long day = (milisegundos / (1000 * 60 * 60 * 24)) % 24;
        return day == 0 ? "" : day + "D";
    }
}
