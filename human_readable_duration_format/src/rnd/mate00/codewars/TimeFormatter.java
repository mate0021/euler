package rnd.mate00.codewars;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * https://www.codewars.com/kata/human-readable-duration-format/train/java
 *
 */
public class TimeFormatter {

    private static final int SECS_IN_MINUTES = 60;
    private static final int SECS_IN_HOURS = 60 * SECS_IN_MINUTES;
    private static final int SECS_IN_DAYS = 24 * SECS_IN_HOURS;
    private static final int DAYS_IN_YEAR = 365;

    public static String formatDuration(int secondsTotal) {
        System.out.println(secondsTotal);

        if (secondsTotal == 0) {
            return "now";
        }

        long years, days, hours, minutes, seconds;

        days = TimeUnit.SECONDS.toDays(secondsTotal);
        secondsTotal -= days * SECS_IN_DAYS;

        years = days / DAYS_IN_YEAR;
        days -= years * DAYS_IN_YEAR;

        hours = TimeUnit.SECONDS.toHours(secondsTotal);
        secondsTotal -= hours * SECS_IN_HOURS;

        minutes = TimeUnit.SECONDS.toMinutes(secondsTotal);
        seconds = secondsTotal - minutes * SECS_IN_MINUTES;

        return formatTime(years, days, hours, minutes, seconds);
    }

    private static String formatTime(long years, long days, long hours, long minutes, long seconds) {
        List<String> parts = new ArrayList<>();
        if (years > 0) {
            parts.add(years + (years == 1 ? " year" : " years"));
        }
        if (days > 0) {
            parts.add(days + (days == 1 ? " day" : " days"));
        }
        if (hours > 0) {
            parts.add(hours + (hours == 1 ? " hour" : " hours"));
        }
        if (minutes > 0) {
            parts.add(minutes + (minutes == 1 ? " minute" : " minutes"));
        }
        if (seconds > 0) {
            parts.add(seconds + (seconds == 1 ? " second" : " seconds"));
        }

        if (parts.size() == 1) {
            return parts.get(0);
        }

        int last = parts.size() - 1;
        return String.join(" and ", String.join(", ", parts.subList(0, last)), parts.get(last));
    }

}
