package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/573992c724fc289553000e95/train/groovy
 *
 */
class ToSmallest {

    static long[] smallest(long n) {
        Tuple t = findPositionOfMin(n)
        printf ("From %s min: %s on pos %s now is %s", n, t[0], t[1], t[2])
        println()
        t.collect {
            Long.parseLong(it)
        }
    }

    private static Tuple findPositionOfMin(long n) {
        def digits = String.valueOf(n).toList()*.toInteger()
        int min = 9
        int minPos = -1
        int pos = 0
        digits.each {
            if (it < min && !isAlreadyToTheLeft(digits, pos)) {
                min = it
                minPos = pos
            }
            pos++
        }

        int i
        digits.remove minPos
        for (i = 0; i < minPos; i++) {
            if (digits[i] > min) {
                digits.add(i, min)
                break
            }
        }

        new Tuple(digits.join(''), minPos.toString(), i.toString())
    }

    private static boolean isAlreadyToTheLeft(ArrayList<Integer> digits, int pos) {
        if (pos == 0) {
            return true
        }
        if (digits[pos - 1] <= digits[pos]) {
            return true
        }
        return false
    }
}
