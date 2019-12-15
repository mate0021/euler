package rnd.mate00.codewars;

import java.util.concurrent.TimeUnit;

/**
 * https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
 *
 */
public class HumanReadableTime {

    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;

    public static String makeReadable(int totalSeconds) {
        long hours = TimeUnit.SECONDS.toHours(totalSeconds);
        totalSeconds -= hours * SECONDS_IN_HOUR;
        long minutes = TimeUnit.SECONDS.toMinutes(totalSeconds);
        totalSeconds -= minutes * SECONDS_IN_MINUTE;

        return String.format("%02d:%02d:%02d", hours, minutes, totalSeconds);
    }
}
