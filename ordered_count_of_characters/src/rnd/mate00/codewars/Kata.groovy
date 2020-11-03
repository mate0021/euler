package rnd.mate00.codewars


/*
 * https://www.codewars.com/kata/57a6633153ba33189e000074/train/groovy
 */

class Kata {

    static def orderedCount(input) {
        input.toList()
                .groupBy {it} // ['a' : ['a', 'a', 'a'], 'b' : ['b', 'b']]
                .collect {
                    [it.getKey(), it.getValue().size()]
                }
    }

    static def orderedCount2(input) {
        def tmpMap = [:]
        input.each {
            if (!tmpMap.containsKey(it)) {
                tmpMap[it] = 1
            } else {
                tmpMap[it] += 1
            }
        }

        tmpMap.collect {
            [it.getKey(), it.getValue()]
        }
    }

    static def orderedCountMy(input) {
        if (input.isEmpty()) {
            []
        } else {
            def result = []
            def tmpMap = [:]
            input.chars().forEach(c -> {
                def ch = (char) c
                if (!tmpMap.containsKey(ch)) {
                    tmpMap[ch] = 1
                } else {
                    tmpMap[ch] += 1
                }
            })
            result = tmpMap.collect {entry -> {
                [entry.getKey(), entry.getValue()]
            }}
            result
        }
    }
}
