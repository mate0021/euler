package rnd.mate00.permutations;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PermutationsTest {

    @Test
    public void testSingle() {
        List<String> result = Permutations.singlePermutations("a");
        assertTrue(result.size() == 1);
        assertEquals(Arrays.asList("a"), result);
    }

    @Test
    public void testDouble() {
        List<String> result = Permutations.singlePermutations("ab");
        assertEquals(2, result.size());
        assertEquals(Arrays.asList("ab", "ba"), result);
    }

    @Test
    public void testQuadruple() {
        List<String> result = Permutations.singlePermutations("aabb");
        assertEquals(Arrays.asList("aabb","abab","abba","baab","baba","bbaa"), result);
    }
}