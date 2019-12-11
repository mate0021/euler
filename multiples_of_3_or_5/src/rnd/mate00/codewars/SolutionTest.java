package rnd.mate00.codewars;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }

    @Test
    public void test2() {
        assertEquals(78, new Solution().solution(20));
    }
}
