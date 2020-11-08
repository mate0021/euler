package rnd.mate00.codewars

class Kata {
    static def fizzBuzzCuckooClock(time) {
        if (time == '00:00' || time == '12:00') {
            return ("Cuckoo " * 12).trim()
        }
        def result
        def (h, m) = time.split(":")*.toInteger()

        if (m == 0) {
            result = "Cuckoo " * (h % 12)
        } else if (m % 30 == 0) {
            result = "Cuckoo "
        } else if (m % 3 == 0 && m % 5 == 0) {
            result = "Fizz Buzz"
        } else if (m % 3 == 0) {
            result = "Fizz"
        } else if (m % 5 == 0 && m % 30 != 0) {
            result = "Buzz"
        } else {
            result = "tick"
        }

        result.trim()
    }
}