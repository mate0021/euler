package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/51f082ba7297b8f07f000001/train/groovy
 *
 */
class FindWithinArray {


    static def findInArray(array, function) {
        def index = -1
        def result = -1
        array.find { it ->
            index++
            if (function(it, index)) {
                result = index
                return true
            }
        }

        result

//        array = []
//        array.withIndex().findIndexOf(function)
    }
}
