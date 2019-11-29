package rnd.mate00.codewars;

/**
 * https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
 */
public class BitCounting {

    public static int countBits(int n) {
        if (n == 0) {
            return 0;
        }
        int ones = 0;
        while (n > 1) {
            if (n % 2 > 0) {
                ones++;
            }
            n /=  2;
        }

        return ++ones;
    }
}