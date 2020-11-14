package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08/train/groovy
 *
 */
class MultiplicationTable {

    static def multiplicationTableMy(Integer size) {
        def result = []
        (1..size).each {
            def row = []
            def current = it
            (1..size).each {
                row << it * current
            }
            result << row
        }

        result
    }

    static def multiplicationTable(Integer size) {
        (1..size).collect {i ->         // collect is a mapping function
            (1..size).collect {j ->     // so for each element in first range ([1, 2, 3....])
                i * j                          // there is a new list created containing its multiplications ([1, 2, 3], [2, 4, 6]...)
            }
        }
    }
}
