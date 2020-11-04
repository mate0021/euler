package rnd.mate00.codewars

import org.junit.Test

class KataTest {

    @Test
    void "Fixed tests"() {
        assert Kata.oddOrEven([0]) == "even"
        assert Kata.oddOrEven([1]) == "odd"
        assert Kata.oddOrEven([]) == "even"
        assert Kata.oddOrEven([0, 1, 5]) == 'even'
        assert Kata.oddOrEven([0, 1, 3]) == 'even'
        assert Kata.oddOrEven([1023, 1, 2]) == 'even'
        assert Kata.oddOrEven([0, -1, -5]) == 'even'
        assert Kata.oddOrEven([0, -1, -3]) == 'even'
        assert Kata.oddOrEven([-1023, 1, -2]) == 'even'
        assert Kata.oddOrEven([0, 1, 2]) == 'odd'
        assert Kata.oddOrEven([0, 1, 4]) == 'odd'
        assert Kata.oddOrEven([1023, 1, 3]) == 'odd'
        assert Kata.oddOrEven([0, -1, 2]) == 'odd'
        assert Kata.oddOrEven([0, 1, -4]) == 'odd'
        assert Kata.oddOrEven([-1023, -1, 3]) == 'odd'
    }
}
