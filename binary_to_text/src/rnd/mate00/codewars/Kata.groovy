package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/5583d268479559400d000064/train/groovy
 */
class Kata {

    static def binaryToStringMy(String input) {
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

    static def binaryToString(String input) {
        input.toList()
            .collate(8)
            .stream()
            .map { it.join("") }                        // <- instead of this
            .map { ((char) Integer.parseInt(it, 2)) } // Integer.parseInt(it.join(""), 2)
            .collect()
            .join()
    }
}
