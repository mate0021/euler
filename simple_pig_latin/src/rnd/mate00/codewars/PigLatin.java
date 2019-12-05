package rnd.mate00.codewars;

/**
 * https://www.codewars.com/kata/simple-pig-latin/train/java
 *
 */
public class PigLatin {

    public static String pigIt(String str) {
        System.out.println(str);

        String[] words = str.split(" ");
        int i = 0;
        for (String w : words) {
            words[i++] = swapLetter(w);
        }

        return str;
    }

    private static String swapLetter(String word) {
        return word;
    }
}
