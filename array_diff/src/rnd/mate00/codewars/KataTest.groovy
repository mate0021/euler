package rnd.mate00.codewars

import org.junit.Test

class KataTest {

    @Test
    void "Example Tests"() {
        assert Kata.arrayDiff([1,2], [1]) == [2]
        assert Kata.arrayDiff([1,2,2], [1]) == [2,2]
        assert Kata.arrayDiff([1,2,2], [2]) == [1]
        assert Kata.arrayDiff([1,2,2], []) == [1,2,2]
        assert Kata.arrayDiff([], [1,2]) == []
    }
}
