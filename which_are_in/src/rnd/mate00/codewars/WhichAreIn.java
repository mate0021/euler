package rnd.mate00.codewars;

import java.util.*;

/**
 * https://www.codewars.com/kata/which-are-in/train/java
 *
 */
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> set = new TreeSet<>();

        for (String lookUp : array1) {
            for (String dict : array2) {
                if (dict.contains(lookUp)) {
                    set.add(lookUp);
                }
            }
        }

        String[] result = new String[set.size()];
        int i = 0;
        for (String element : set) {
            result[i++] = element;
        }

        return result;
    }

    /*
    public static String[] inArray(String[] array1, String[] array2) {
    return Arrays.stream(array1)
      .filter(str ->
        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
      .distinct()
      .sorted()
      .toArray(String[]::new);
  }
     */
}
