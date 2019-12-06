package rnd.mate00.codewars;

import java.util.ArrayList;
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
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String w : words) {
            String swapped = swapLetter(w);
//            words[i++] = swapped;
            System.out.println(swapped);
            sb.append(swapped);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    private static String swapLetter(String word) {
        System.out.println(word);
        List<Character> newWord = new ArrayList<>();

        int x = 0;
        while (!isCharacter(word.charAt(x))) {
            newWord.add(word.charAt(x++));
        }
        char firstChar = word.charAt(x);
//        System.out.println(String.format("Stopped at %d char %s", x, word.charAt(x)));
//        System.out.println(newWord);
        for (int i = x + 1; i < word.length(); i++) {
            if (isCharacter(word.charAt(i))) {
                newWord.add(word.charAt(i));
            } else {
                newWord.add(firstChar);
                newWord.add('a');
                newWord.add('y');
                newWord.add(word.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        newWord.stream().forEach(l -> sb.append(l));

        return sb.toString();
    }

    private static boolean isCharacter(Character c) {
        return Pattern.matches("\\w", String.valueOf(c));
    }
}
