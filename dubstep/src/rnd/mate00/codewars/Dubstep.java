package rnd.mate00.codewars;

/**
 * https://www.codewars.com/kata/dubstep/java
 *
 */
public class Dubstep {

    public static String SongDecoder (String song) {

        return song
                .replaceAll("^(WUB)*", "") // remove all starting occurrences
                .replaceAll("(WUB)*$", "") // remove all ending occurrences
                .replaceAll("(WUB)+", " "); // squeeze all WUBs with a space
    }
}
