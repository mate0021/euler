package rnd.mate00.codewars

import org.junit.Test

class KataTest {

    @Test
    void "Example Tests" () {
        assert Kata.binaryToString('0100100001100101011011000110110001101111') == 'Hello'
        assert Kata.binaryToString('00110001001100000011000100110001') == '1011'
    }

    @Test
    void "Random test3" () {
        assert Kata.binaryToString('1101000111011111111111') == 'Ñß?'
    }

    @Test
    void "Random test4" () {
        assert Kata.binaryToString('1101001111111001101101010000111110110011000110001010011000101111001010000110100111') == 'Óùµ\u000F³\u0018¦/(i\u0003'
    }

    @Test
    void "Random test5" () {
        assert Kata.binaryToString('111110100010111') == 'ú\u0017'
    }

    @Test
    void "Random test6" () {
        assert Kata.binaryToString('1110101100000101001100110000010111001111001000110101101100010101001110010110') == 'ë\u00053\u0005Ï#[\u00159\u0006'
    }

    @Test
    void "Random test 7" () {
        assert Kata.binaryToString('0110011110111111101101100101111101100010110011') == 'g¿¶_b3'
    }

    @Test
    void "Random test 8" () {
        assert Kata.binaryToString('1010100111100010101000') == '©â('
    }

    @Test
    void "Random test 9" () {
        assert Kata.binaryToString('110011111101101001010001011000110001001010011111111100') == 'ÏÚQc\u0012\u009F<'
    }
}
