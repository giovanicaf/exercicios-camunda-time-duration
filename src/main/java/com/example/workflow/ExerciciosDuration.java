package com.company;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;

@SpringBootApplication
public class ExerciciosDuration {

    public static void main(String[] args) {

        parse("PT1M37S.1SSS");

        parse("PT01S");
        parse("PT20S");//T must be at the beginning to time part
        parse("P2D");//2 day
        parse("-P2D");//minus 2 days
        parse("P-2DT-20S");//S for seconds
        parse("PT20H");//H for hours
        parse("PT220H");
        parse("PT20M");//M for minutes
        parse("PT20.3S");//second can be in fraction like 20.3
        parse("P4DT12H20M20.3S");
        parse("P-4DT-12H-20M-20.3S");
        parse("-P4DT12H20M20.3S");

    }
    private static void parse(String pattern) {
        Duration d = Duration.parse(pattern);
        System.out.println("Pattern:                  => " + pattern + " --> " +  d);
//        System.out.println(" ");
//        System.out.println(" -------------------------------------------------------------------------------------------  ");
//        System.out.println(" ");
        System.out.println("Pattern formatDuration :  => " + pattern + " --> " +  formatDuration(d));
        System.out.println(" ");
    }
    public static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }
}
