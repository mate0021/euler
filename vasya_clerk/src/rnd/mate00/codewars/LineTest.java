package rnd.mate00.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void test1() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", Line.Tickets(new int []{25, 100}));
    }

    @Test
    public void notPossibleToHandleAllQueue1() {
        assertEquals("NO", Line.Tickets(new int[] {100, 50, 25, 25}));
    }

    @Test
    public void notPossibleToHandleAllQueue2() {
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 50, 50, 100}));
    }

    @Test
    public void notPossibleToHandleAllQueue3() {
        assertEquals("NO", Line.Tickets(new int[] {50, 50, 50, 50, 50, 50, 50, 50, 50, 50}));
    }

    @Test
    public void notPossibleToHandleAllQueue4() {
        assertEquals("NO", Line.Tickets(new int[] {100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
    }

    @Test
    public void notPossibleToHandleAllQueue5() {
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
    }

    @Test
    public void notPossibleToHandleAllQueue6() {
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 25, 25, 25, 100, 100}));
    }

    @Test
    public void notPossibleToHandleAllQueue7() {
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 100}));
    }

    @Test
    public void notPossibleToHandleAllQueue8() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 25, 50, 100, 50}));
    }

    @Test
    public void shouldHandleAllQueue1() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 100}));
    }

    @Test
    public void shouldHandleAllQueue2() {
        assertEquals("YES", Line.Tickets(new int[] {25, 50}));
    }
}