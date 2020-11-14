package rnd.mate00.codewars

import org.junit.Test

class MultiplicationTableTest {

    @Test
    void "Example Tests"() {
        assert MultiplicationTable.multiplicationTable(1) == [[1]]
        assert MultiplicationTable.multiplicationTable(2) == [[1, 2], [2, 4]]
        assert MultiplicationTable.multiplicationTable(3) == [[1, 2, 3], [2, 4, 6], [3, 6, 9]]
    }
}
