package rnd.mate00.codewars;

/**
 * https://www.codewars.com/kata/number-of-trailing-zeros-of-n/train/java
 *
 * http://mathworld.wolfram.com/Factorial.html
 *
 */
public class Solution {

    public static int zeros(int n) {
        System.out.println("n = " + n);

        int sum = 0;
        for (int k = 1; k <= log(5, n); k++) {
            sum += n / Math.pow(5, k);
        }

        return sum;
    }

    private static double log(int b, int x) {
        return Math.log(x) / Math.log(b);
    }
}
