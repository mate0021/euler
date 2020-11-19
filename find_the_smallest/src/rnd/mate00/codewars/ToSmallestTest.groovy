package rnd.mate00.codewars

import org.junit.Test

import static org.junit.Assert.*;

class ToSmallestTest {

    private static void testing(long n, String res) {
        assertEquals(res, Arrays.toString(ToSmallest.smallest(n)));
    }

    @Test
    public void test() {
        testing(261235, "[126235, 2, 0]");
        testing(209917, "[29917, 0, 1]");
        testing(285365, "[238565, 3, 1]");
        testing(269045, "[26945, 3, 0]");
        testing(296837, "[239687, 4, 1]");
    }

    @Test
    void "Random1" () {
        testing(34817179077579504, "[3481717907757954, 15, 0]")
    }

    @Test
    void "Random2" () {
        testing(187863002809, "[18786300289, 10, 0]")
    }
}
