package rnd.mate00.codewars;

/**
 * https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
 *
 */
public class Kata {

    public static int findEvenIndex(int[] arr) {

        for (int e : arr) {
            System.out.print(e + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++ ) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int l = 0; l < i; l++) {
                sumLeft += arr[l];
            }
            for (int r = i+1; r < arr.length; r++) {
                sumRight += arr[r];
            }
            System.out.println(String.format("Idx %d sumL %d, sumR %d", i, sumLeft, sumRight));

            if (sumLeft == sumRight) {
                return i;
            }
        }

        return -1;
    }
}
