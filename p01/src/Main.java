import java.util.stream.IntStream;

/*


If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

 */
public class Main {

    public static void main(String[] args) {
        System.out.println(sumUpToBelow(1000));
    }

    static int sumUpToBelow(int value) {
        return IntStream
                .range(0, value)
                .filter(i -> (i % 3 == 0) || (i % 5 == 0))
                .sum();
    }
}