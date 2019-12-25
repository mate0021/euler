package rnd.mate00.permutations;

import java.util.*;

/**
 * https://www.codewars.com/kata/permutations/train/java
 * https://introcs.cs.princeton.edu/java/23recursion/
 *
 */
public class Permutations {

    public static List<String> singlePermutations(String input) {
        Set<String> result = permute(input);
        ArrayList<String> list = new ArrayList<>(result);
        Collections.sort(list);
        return list;
    }

    private static Set<String> permute(String str) {
        Set<String> perm = new HashSet<>();

        if (str.length() == 0) {
            perm.add("");
            return perm;
        }

        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permute(rem);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String begin = word.substring(0, i);
                String end = word.substring(i);
                perm.add(begin + initial + end);
            }
        }
        return perm;
    }
}
