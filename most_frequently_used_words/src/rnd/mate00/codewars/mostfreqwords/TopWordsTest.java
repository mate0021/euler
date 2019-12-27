package rnd.mate00.codewars.mostfreqwords;

import org.junit.Test;

import java.util.Collections;
import java.util.stream.*;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class TopWordsTest {

    @Test
    public void sampleTests() {
        assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")) ));
    }

    @Test
    public void t1() {
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
    }

    @Test
    public void t2() {
        assertEquals(Arrays.asList("e", "d", "a"), TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
    }

    @Test
    public void t3() {
        assertEquals(Arrays.asList("won't", "wont"), TopWords.top3("  //wont won't won't "));
    }

    @Test
    public void t4() {
        assertEquals(Arrays.asList("e"), TopWords.top3("  , e   .. "));
    }

    @Test
    public void t5() {
        assertEquals(Collections.emptyList(), TopWords.top3("  ...  "));
    }

    @Test
    public void t6() {
        assertEquals(Collections.emptyList(), TopWords.top3("  '''  "));
    }

    @Test
    public void t7() {
        assertEquals(Collections.emptyList(), TopWords.top3("  '  "));
    }
}