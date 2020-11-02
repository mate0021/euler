package rnd.mate00.codewars

import java.util.function.IntFunction;

/*
 * https://www.codewars.com/kata/57a6633153ba33189e000074/train/groovy
 */

class Kata {

    static def orderedCount(input) {
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
