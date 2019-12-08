package rnd.mate00.codewars;

import java.util.regex.Pattern;

/**
 * https://www.codewars.com/kata/simple-pig-latin/train/java
 *
 */
public class PigLatin {

    public static String pigIt(String str) {
        System.out.println(str);

        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String w : words) {
            String swapped = swapFirstLetter(w);
            sb.append(swapped);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    private static String swapFirstLetter(String word) {
        if (word.length() == 1 && !isCharacter(word)) {
            return word;
        }
        StringBuilder sb = new StringBuilder();
        char firstChar = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isCharacter(c)) {
                sb.append(c);
            }
        }
        sb.append(firstChar + "ay");
        if (!isCharacter(word.charAt(word.length() - 1))) {
            sb.append(word.charAt(word.length() - 1));
        }

        return sb.toString().trim();
    }

    private static boolean isCharacter(Character c) {
        return isCharacter(String.valueOf(c));
    }

    private static boolean isCharacter(String s) {
        return Pattern.matches("\\w", s);
    }
}
