package rnd.mate00.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

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
        List<Character> chars = new ArrayList<>();
        for (char c : word.toCharArray()) {
            chars.add(c);
        }
        String newSuffix = chars.get(0) + "ay";

        for (int i = 1; i < word.length(); i++) {
            chars.add(i - 1, word.charAt(i));
        }

        char swap;
        for (int i = 0; i < word.length(); i++) {
            if (isCharacter(word.charAt(i))) {

            }
        }
        return word;
    }

    private static boolean isCharacter(Character c) {
        return Pattern.matches("\\w", String.valueOf(c));
    }
}
