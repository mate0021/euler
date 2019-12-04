package rnd.mate00.codewars;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://www.codewars.com/kata/vasya-clerk/train/java
 *
 */
public class Line {

    private static final int TICKET_PRICE = 25;

    public static String Tickets(int[] q) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int cash : q) {
            queue.add(cash);
        }

        System.out.println(queue);

        int myCash = 0;
        boolean can = true;
        for (int i = 0; i < q.length; i++) {
            if (q[i] == TICKET_PRICE) {
                myCash += q[i];
            } else if (q[i] > TICKET_PRICE && canChange(myCash, q[i])) {
                myCash -= (q[i] - TICKET_PRICE);
            } else {
                can = false;
                break;
            }
        }

        return can ? "YES" : "NO";
    }

    private static boolean canChange(int myCash, int nextClient) {
        return myCash >= nextClient - TICKET_PRICE;
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
