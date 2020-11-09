package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/56541980fa08ab47a0000040
 */
class Printer {

    static String printerError(s) {
        def legal = 'a'..'m'
        def illegalSize = (s.toList() - legal).size()

        "$illegalSize/${s.length()}"
    }

    /**
     * Also:
     * def illegalSize = s.findAll {
     *     !legal.contains(it)
     * }.size()
     */
}
