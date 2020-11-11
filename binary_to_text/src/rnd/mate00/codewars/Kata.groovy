package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/5583d268479559400d000064/train/groovy
 */
class Kata {

    static def binaryToString(String input) {
        List<String> bytes = new ArrayList<>();
        def aByte = ''
        def counter = 0

        input.toList().each {
            aByte += it
            counter++
            if (counter == 8) {
                bytes.add(aByte)
                counter = 0
                aByte = ''
            }
        }

        if (aByte) {
            bytes.add(aByte)
        }

        def result = ''
        bytes.each {
            result += (char) Integer.parseInt(it, 2)
        }

        result
    }

}
