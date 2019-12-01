package rnd.mate00.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhichAreInTest {

    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void empty() {
        String[] a1 = {"tarp", "mice", "bull"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        assertTrue(WhichAreIn.inArray(a1, a2).length == 0);
    }

}