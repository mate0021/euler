import java.util.stream.Stream;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


          6 7 8 9 10
 */
public class Main {

    public static void main(String[] args) {
        int[] divTable = new int[] {5, 4, 3};
        int result = 0;
        for (int x = 10; x < 10000; x++) {
            for (int d = 0; d < divTable.length; d++) {
                if (x % divTable[d] > 0) {
                    break;
                } else if (d == divTable.length - 1 && x % divTable[d] == 0) {
                    result = x;
                }
            }
        }

        System.out.println(result);
    }
}
