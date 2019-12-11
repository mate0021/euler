package rnd.mate00.codewars;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/multiples-of-3-or-5/train/java
 *
 */
public class Solution {

    public int solution(int number) {
        int result = 0;

        for (int x = 0; x < number; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                result += x;
            } else if (x % 3 == 0) {
                result += x;
            } else if (x % 5 == 0) {
                result += x;
            }
        }

        return result;
    }
}

/* better
return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
 */