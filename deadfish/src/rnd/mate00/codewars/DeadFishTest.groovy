package rnd.mate00.codewars

import org.junit.Test

class DeadFishTest {

    @Test
    void "Example Tests" () {
        assert DeadFish.parse("iiisdoso") == [8, 64]
        assert DeadFish.parse("iiisdosodddddiso") == [8, 64, 3600]
    }
}
