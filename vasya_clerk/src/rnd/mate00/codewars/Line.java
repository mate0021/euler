package rnd.mate00.codewars;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://www.codewars.com/kata/vasya-clerk/train/java
 *
 */
public class Line {

    public static String Tickets(int[] peopleInLine) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int cash : peopleInLine) {
            queue.add(cash);
        }

        System.out.println(queue);

        return handleCustomer(queue.poll(), queue) ? "YES" : "NO";
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
