package rnd.mate00.codewars

import org.junit.Test

class PrinterTest {

    @Test
    void "Basic Tests"() {
        assert "3/56" == Printer.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")
        assert "6/60" == Printer.printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")
        assert "11/65" == Printer.printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu")
    }
}
