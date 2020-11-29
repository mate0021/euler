package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/groovy
 *
 */
class Meeting {

    static String meeting(String s) {
        s.split(';')
        .collect {
            def split = it.split(':')*.toUpperCase()
            new Tuple(split[1], split[0])
        }
        .sort {it.get(0) }
        .collect {
            "(${it[0]}, ${it[1]})"
        }
        .join('')
    }
}
