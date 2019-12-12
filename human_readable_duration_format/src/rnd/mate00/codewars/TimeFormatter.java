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
    private static final int SECS_IN_YEARS = 365 * SECS_IN_DAYS;

    public static String formatDuration(int secondsTotal) {
        System.out.println(secondsTotal);

        if (secondsTotal == 0) {
            return "now";
        }

        int years = 0;
        long days = 0;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;

        int test = 372358;
        days = TimeUnit.SECONDS.toDays(test);
        test -= days * SECS_IN_DAYS;

        hours = TimeUnit.SECONDS.toHours(test);
        test -= hours * SECS_IN_HOURS;

        minutes = TimeUnit.SECONDS.toMinutes(test);
        seconds = test - minutes * SECS_IN_MINUTES;


        System.out.println(String.format("%d years, %d days, %d hours, %d minutes, %d seconds", years, days, hours, minutes, seconds));
        return "now";
    }

}
