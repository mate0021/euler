public class Main {

    public static void main(String[] args) {

        outer:
        for (int i = 99; i > 1; i--) {
            for (int j = 99; j > 1; j--) {
                System.out.println(i * j);
                if ((i * j) / 1000 < 1) {
                    break outer;
                }
            }
        }

        int input = 5234;
        System.out.println( (input / 100) );
        int pos = 2;
        for (int x = 3; x > 0; x--) {
            if (x == pos) {

            }
        }
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
