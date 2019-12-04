package rnd.mate00.codewars;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://www.codewars.com/kata/vasya-clerk/train/java
 *
 */
public class Line {

    public static String Tickets(int[] q) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int cash : q) {
            queue.add(cash);
        }

        System.out.println(queue);

        int b25 = 0;
        int b50 = 0;
        for (int pay : q) {
            if (pay == 25) {
                b25++;
            } else if (pay == 50) {
                b25--;
                b50++;
            } else if (pay == 100) {
                if (b50 > 0 && b25 > 0) {
                    b50--;
                    b25--;
                } else {
                    b25 -= 3;
                }
            }

            if (b25 < 0 || b50 < 0) {
                return "NO";
            }
        }

        return "YES";
    }

    private static boolean handleCustomer(int myCash, Queue<Integer> remaining) {
        System.out.println(String.format("my cash %d, remaining: %s", myCash, remaining));
        if (remaining == null || myCash < 25 && !remaining.isEmpty()) {
            System.out.println("1");
            return false;
        } else if (myCash > 25 && remaining.size() == 1) {
            System.out.println("2");
            return true;
        } else {
            System.out.println("3");
            return handleCustomer(myCash + remaining.poll(), remaining);
        }
    }
}
