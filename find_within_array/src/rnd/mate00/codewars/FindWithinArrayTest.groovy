package rnd.mate00.codewars

import org.junit.Test

class FindWithinArrayTest {

    @Test
    void "Example Tests" () {
        def isEven = { v, i -> v % 2 == 0 }
        def neverTrue = { v, i -> false }
        def isValueEqualToIndex = { v, i -> v == i }
        def isLengthEqualToIndex = { v, i -> v.size() == i }

        assert FindWithinArray.findInArray([], isEven) == -1
        assert FindWithinArray.findInArray([1,3,5,6,7], isEven) == 3
        assert FindWithinArray.findInArray([2,4,6,8], isEven) == 0
        assert FindWithinArray.findInArray([2,4,6,8], neverTrue) == -1
        assert FindWithinArray.findInArray([13,5,3,1,4,5], isValueEqualToIndex) == 4
        assert FindWithinArray.findInArray(["one","two","three","four","five","six"], isLengthEqualToIndex) == 4
        assert FindWithinArray.findInArray(["bc","af","d","e"], isLengthEqualToIndex) == -1
    }
}
