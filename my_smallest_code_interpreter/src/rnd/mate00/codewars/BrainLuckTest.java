package rnd.mate00.codewars;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BrainLuckTest {

    private BrainLuck subject;

    @Test
    public void testEchoUntilByte255Encountered() {
        assertThat(new BrainLuck(",+[-.,+]").process("Codewars" + ((char) 255)), is("Codewars"));
    }

    @Test
    public void testEchoUntilByte0Encountered() {
        assertThat(new BrainLuck(",[.[-],]").process("Codewars" + ((char) 0)), is("Codewars"));
    }

    @Test
    public void testTwoNumbersMultiplier() {
        final char[] input = {8, 9};
        assertThat(new BrainLuck(",>,<[>[->+>+<<]>>[-<<+>>]<<<-]>>.").process(String.valueOf(input[0]) + String.valueOf(input[1])), is(String.valueOf((char) (input[0] * input[1]))));
    }

    @Test
    public void shouldReadOneCharFromInput() {
        subject = new BrainLuck(",.");
        String result = subject.process("A");

        assertEquals("A", result);
    }

    @Test
    public void shouldIncrementCurrentCell() {
        subject = new BrainLuck(",+.");
        String result = subject.process("A");

        assertEquals("B", result);
    }

    @Test
    public void shouldDecrementCurrentCell() {
        subject = new BrainLuck(",-.");
        String result = subject.process("B");

        assertEquals("A", result);
    }

    @Test
    public void shouldStartFrom0() {
        subject = new BrainLuck(",+.");
        String result = subject.process("" + (char) 255);

        assertEquals(0, result.toCharArray()[0]);
    }

    @Test
    public void shouldStartFrom255() {
        subject = new BrainLuck(",-.");
        String result = subject.process("" + (char) 0);

        assertEquals(255, result.toCharArray()[0]);
    }

    @Test
    public void shouldIncrementThreeChars() {
        subject = new BrainLuck(",+.,+.,+.");
        String result = subject.process("ABC");

        assertEquals("BCD", result);
    }

    @Test
    public void shouldResetCellToZero() {
        char[] memory = new char[] { 67 };
        subject = new BrainLuck("[-]");
        subject.setMem(memory);

        subject.process("");

        System.out.println(subject.getMem()[0]);
    }

    @Test
    public void shouldMovePointerRightAndIncrementCell() {
        subject = new BrainLuck("++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.");
        String result = subject.process("");

        assertEquals("Hello World!\n", result);
    }
}