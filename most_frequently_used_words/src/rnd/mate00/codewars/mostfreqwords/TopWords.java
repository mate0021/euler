package rnd.mate00.codewars.mostfreqwords;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        List<String> strings = Arrays.asList(s.split(" "));

        System.out.println(strings.size());
        System.out.println(strings);

        List<String> frequencyMap = strings.stream()
                .filter(e -> !e.isEmpty() && !e.isBlank())
                .filter(e -> !e.matches("[.,]+"))
                .peek(s12 -> System.out.println(">>" + s12 + "<<"))
                .map(s1 -> {
                    return s1.replaceAll("[.:,/ ]", "").trim();
                })
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(" < " + frequencyMap);
        return frequencyMap;
    }
}
