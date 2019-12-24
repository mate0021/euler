package rnd.mate00.permutations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://www.codewars.com/kata/permutations/train/java
 * https://introcs.cs.princeton.edu/java/23recursion/
 *
 */
public class Permutations {

    public static List<String> singlePermutations(String input) {
        char[] chars = input.toCharArray();
        Set<String> result = new HashSet<>();

        //result = ...
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // result.add(permute(c, list_of_others_than_c));
        }
        System.out.println(permute("", input));
        return Arrays.asList("ab", "ba");
    }
    /*
    abc
    perm(abc) = [a, perm(bc)]
    perm(bc) = [b, perm(c)]
    perm(c) = [c]
     */
    static String permute(String prefix, String in) {
        if (in.length() == 0) {
            return prefix;
        }
        String result = "";
        for (int i = 0; i < in.length(); i++) {
            result = permute(prefix + in.charAt(i), in.substring(0, i) + in.substring(i + 1, in.length()));
        }

        return result;
    }

}
