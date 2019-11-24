import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        List<Integer> palindromes = new ArrayList<>();

        int result = 0;
        outer:
        for (int i = 999; i > 1; i--) {
            for (int j = 999; j > 1; j--) {
                if ((i * j) / 100000 < 1) {
                    break;
                } else
                if (isPalindromic(i * j)) {
                    result = i * j;
                    System.out.println(String.format(" >> %d * %d = %d", i, j, i * j));
                    palindromes.add(result);
//                    break outer; // <-- DONT BREAK. We don't know if this is the largest palindrome! (995 * 583) < (993 * 913)
                }
            }
        }

        System.out.println(palindromes.size());
        System.out.println(palindromes.stream().max(Comparator.naturalOrder()));
    }
    
    private static int getDigitAtPosition(int input, int position) {
        int result = input / (int) pow(10, position);
        result %= 10;

        return result;
    }

    private static boolean isPalindromic(int input) {
        int numOfDigits = getNumberOfDigits(input);
        return getDigitAtPosition(input, 0) == getDigitAtPosition(input, 5) &&
                getDigitAtPosition(input, 1) == getDigitAtPosition(input, 4) &&
                getDigitAtPosition(input, 2) == getDigitAtPosition(input, 3);
    }

    private static int getNumberOfDigits(int input) {
        return (int) Math.log10(input) + 1;
    }
}
/*

x * 10^1 + y * 10^0
683386

6 * 100000 -> ^5
8 *  10000 -> ^4
3 *   1000 -> ^3

3 *    100 -> ^2
8 *     10 -> ^1
6 *      1 -> ^0


6digits:
x % 100000 == x
x %
*/
