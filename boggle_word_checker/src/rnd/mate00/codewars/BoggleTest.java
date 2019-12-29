package rnd.mate00.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BoggleTest {

    final private static char[][] board = {
            {'E','A','R','A'},
            {'N','L','E','C'},
            {'I','A','I','S'},
            {'B','Y','O','R'}
    };

    private static String[]  toCheck   = {"C", "EAR","EARS","BAILER","RSCAREIOYBAILNEA" ,"CEREAL" ,"ROBES"};
    private static boolean[] expecteds = {true, true, false, true,    true,               false,    false };

    @Test
    public void sampleTests() {
        for (int i=0 ; i < toCheck.length ; i++) {
            assertEquals( expecteds[i], new Boggle(deepCopy(board), toCheck[i]).check() );
        }
    }

    private char[][] deepCopy(char[][] arr) {
        return Arrays.stream(arr)
                .map( a -> Arrays.copyOf(a, a.length) )
                .toArray(char[][]::new);
    }

}