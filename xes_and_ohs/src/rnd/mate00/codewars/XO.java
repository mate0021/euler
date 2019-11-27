package rnd.mate00.codewars;

import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
 */
public class XO {
    public static boolean getXO(String xxxooo) {
        int xes = 0;
        int ohs = 0;

        char[] chars = xxxooo.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'X' || chars[i] == 'x') {
                xes++;
            }
            if (chars[i] == 'o' || chars[i] == 'O') {
                ohs++;
            }
        }
        return xes == ohs;
    }
}
