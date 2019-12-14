package rnd.mate00.codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * https://www.codewars.com/kata/the-observed-pin/train/java
 * 
 */
public class ObservedPin {

    private static final Map<Character, List<String>> neighbours = new HashMap<>() {{
        put('1', asList("1", "2", "4"));
        put('3', asList("3", "2", "6"));


        put('2', asList("2", "1", "3", "5"));

        put('4', asList("4", "1", "5", "7"));
        put('5', asList("5", "2", "4", "6", "8"));
        put('6', asList("6", "3", "5", "9"));
        put('7', asList("7", "4", "8"));
        put('8', asList("8", "5", "7", "9", "0"));
        put('9', asList("9", "6", "8"));
        put('0', asList("0", "8"));
    }};

    public static List<String> getPINs(String observed) {
        System.out.println(observed);
        List<String> result = new ArrayList<>();
        for (char c : observed.toCharArray()) {
//            neighbours.get(c).forEach();
        }

        return result;
    }

    private List<String> mergeLists(List<String>... lists) {
        List<String> result = new ArrayList<>();
        for (int lNo = 0; lNo < lists.length; lNo++) {
            lists[lNo].get(0) + lists[lNo+1].get(0) + ... + lists[lNo]
        }
        return result;
    }

    /*
    13 -> 13, 12, 16, 23, 22, 26, 43, 42, 46

    341 -> (3,2,6), (4,1,5,7), (1,2,4)
    301 -> (3,2,6), (0,8), (1,2,4)

     */
}
