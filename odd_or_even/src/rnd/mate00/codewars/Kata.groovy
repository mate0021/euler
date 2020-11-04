package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/5949481f86420f59480000e7/train/groovy
 */
class Kata {

    static String oddOrEven(list) {
        def value = list.stream().reduce(0, { i1, i2 -> i1 + i2 })

        (value % 2) ? "odd" : "even"
    }

    /**
     * even better
     *   list.sum(0) % 2 ? "odd" : "even"
     */
}
