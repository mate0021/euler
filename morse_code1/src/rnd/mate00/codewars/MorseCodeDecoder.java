package rnd.mate00.codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
 *
 * Morse code decoder part1
 *
 */
public class MorseCodeDecoder {
    private static Map<String, String> morseSigns = new HashMap<>() {{
        put("....", "H");
        put(".", "E");
        put("-.--", "Y");
        put(".---", "J");
        put("..-", "U");
        put("-..", "D");
        put(".-", "A");
        put("..", "I");
        put("...---...", "SOS");

    }};

    public static String decode(String morseCode) {
        System.out.println(morseCode);
        String result = "";

        String[] words = morseCode.trim().split("   ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                result += morseSigns.get(letter);
//                result += MorseCode.get(letter);
            }
            result += " ";
        }

        return result.trim();
    }
}
