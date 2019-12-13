package rnd.mate00.codewars;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * https://www.codewars.com/kata/human-readable-duration-format/train/java
 *
 */
public class TimeFormatter {

    private static final int SECS_IN_MINUTES = 60;
    private static final int SECS_IN_HOURS = 60 * SECS_IN_MINUTES;
    private static final int SECS_IN_DAYS = 24 * SECS_IN_HOURS;
    private static final int SECS_IN_YEAR = 365 * SECS_IN_DAYS;
    private static final int DAYS_IN_YEAR = 365;

    public static String formatDuration(int secondsTotal) {
        System.out.println(secondsTotal);

        if (secondsTotal == 0) {
            return "now";
        }

        long years = 0;
        long days = 0;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;

        int test = SECS_IN_DAYS * 365 * 2 + 54 * SECS_IN_DAYS + 13 * SECS_IN_HOURS + 74 * SECS_IN_MINUTES + 14;

        days = TimeUnit.SECONDS.toDays(test);
        test -= days * SECS_IN_DAYS;

        years = days / DAYS_IN_YEAR;
        days -= years * DAYS_IN_YEAR;

        hours = TimeUnit.SECONDS.toHours(test);
        test -= hours * SECS_IN_HOURS;

        minutes = TimeUnit.SECONDS.toMinutes(test);
        seconds = test - minutes * SECS_IN_MINUTES;


        System.out.println(String.format("%d years, %d days, %d hours, %d minutes, %d seconds", years, days, hours, minutes, seconds));
        return "now";
    }

}
