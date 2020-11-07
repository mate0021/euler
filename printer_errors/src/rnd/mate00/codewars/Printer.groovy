package rnd.mate00.codewars

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
