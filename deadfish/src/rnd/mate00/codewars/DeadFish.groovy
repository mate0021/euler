package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/groovy
 *
 */
class DeadFish {

    /**
     * Valid commands:
     * i - increments the value
     * d - decrements the value
     * s - squares the value
     * o - outputs to return array
     *
     * @param dataString
     */
    static def parseMy(String dataString) {
        def result = []
        def cell = 0
        dataString.toList().each {
            switch(it) {
                case 'i':
                    cell++
                    break
                case 'd':
                    cell--
                    break
                case 's':
                    cell *= cell
                    break
                case 'o':
                    result << cell
                    break
                default:
                    println "$it command ignored"
            }
        }

        result
    }

    static def parse(String dataString) {
        def cell = 0
        def result = []
        def codes = [
                'i' : { cell++ },
                'd' : { cell-- },
                's' : { cell *= cell },
                'o' : { result << cell }
        ]
        dataString.each { codes[it].call() }

        result
    }
}
