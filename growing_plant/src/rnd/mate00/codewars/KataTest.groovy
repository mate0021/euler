package rnd.mate00.codewars

import org.junit.Test

class KataTest {

    @Test
    void basicTests() {
        assert Kata.growingPlant(100, 10, 910) == 10
        assert Kata.growingPlant(10, 9, 4) == 1
        assert Kata.growingPlant(5, 2, 5) == 1
        assert Kata.growingPlant(5, 2, 6) == 2
    }

    @Test
    void "Additional tests" () {
        assert Kata.growingPlant(82, 12, 737) == 11
    }
}
