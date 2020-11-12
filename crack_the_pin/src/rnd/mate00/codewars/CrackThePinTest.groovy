package rnd.mate00.codewars

import org.junit.Test

class CrackThePinTest {

    @Test
    void ShouldWorkWithSimplePIN() {
        assert CrackThePin.crack("827ccb0eea8a706c4c34a16891f84e7b") == "12345"
        assert CrackThePin.crack("86aa400b65433b608a9db30070ec60cd") == "00078"
    }
}
