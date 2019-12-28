package rnd.mate00.codewars.mostfreqwords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.*;

/**
 * https://www.codewars.com/kata/most-frequently-used-words-in-a-text/train/java
 *
 */
public class TopWords {

    public static List<String> top3(String s) {
        System.out.println(s);
        if (s.matches("\\W+")) {
            return Collections.emptyList();
        }
        List<String> strings = Arrays.asList(s.split("[^a-zA-Z0-9']+"));

        List<String> mostFrequent = strings.stream()
                .filter(e -> !e.isEmpty() && !e.isBlank() && !e.matches("[.,]+"))
                .collect(groupingBy(String::toLowerCase, counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(toList());

        return mostFrequent;
    }
}
