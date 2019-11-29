package rnd.mate00.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitCountingTest {

    @Test
    public void test() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }

    @Test
    public void zeroCase() {
        assertEquals(0, BitCounting.countBits(0));
    }

}