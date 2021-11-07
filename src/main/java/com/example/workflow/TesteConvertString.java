package com.company;

import java.time.Duration;

public class TesteConvertString {


    public static void main(String[] args) {
//        parse( convertToTimeDuration(999L) );
        var pattern =  convertToTimeDuration(97001L) ;
        System.out.println(pattern);
        parse( 97001L) ;
    }
    private static void parse(long pattern) {
       //Duration d1 = Duration.parse(pattern);
//        System.out.println("Pattern: " + pattern + " Duração: " + d1);
//        System.out.println("Pattern: " + pattern);
//        Duration d2 = Duration.ofMillis(97001L);
        System.out.println(" Duração: " + Duration.ofMillis(pattern).toString());
    }

    public static String convertToTimeDuration(Long milisegundos){
        return "PT" + toDay(milisegundos)
                + toHour(milisegundos)
                + toMinute(milisegundos)
                + toSecond(milisegundos)
                + toMillisecond(milisegundos);
    }
    private static String toMillisecond(Long milisegundos){
        long millis = milisegundos % 1000;
        return millis == 0 ? "" : millis + "SSS";
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
