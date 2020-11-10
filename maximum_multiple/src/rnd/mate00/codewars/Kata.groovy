package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/5aba780a6a176b029800041c
 */
class Kata {

    static maxMultiple(int divisor, int bound) {
        (bound..divisor).find {
            if (it % divisor == 0) {
                it
            }
        }
    }
}
