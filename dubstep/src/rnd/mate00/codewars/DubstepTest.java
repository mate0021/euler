package rnd.mate00.codewars;


import org.junit.Test;

import static org.junit.Assert.*;
import static rnd.mate00.codewars.Dubstep.SongDecoder;

public class DubstepTest {

    @Test
    public void Test1() {
        assertEquals("ABC", SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", SongDecoder("RWUBWUBWUBLWUB"));
    }

    @Test
    public void tripleWubInside() {
        assertEquals("A B", SongDecoder("AWUBWUBWUBB"));
    }

    @Test
    public void tripleWubLeading() {
        assertEquals("AB", SongDecoder("WUBWUBWUBAB"));
    }

    @Test
    public void tripleWubTrailing() {
        assertEquals("AB", SongDecoder("ABWUBWUBWUB"));
    }

}