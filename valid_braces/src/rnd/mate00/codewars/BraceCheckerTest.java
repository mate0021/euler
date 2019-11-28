package rnd.mate00.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BraceCheckerTest {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void valid() {
        assertEquals(true, checker.isValid("()()"));
    }

    @Test
    public void validSequence() {
        assertTrue(checker.isValid("(){}[]"));
    }

    @Test
    public void validNested() {
        assertTrue(checker.isValid("([{}])"));
        assertTrue(checker.isValid("[({})]"));
    }

    @Test
    public void validNestedSequence() {
        assertTrue(checker.isValid("([]){{}}"));
    }

    @Test
    public void validNestedPlusSequence() {
        assertTrue(checker.isValid("(){}[()]"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
        assertFalse(checker.isValid("[][{()]"));
        assertFalse(checker.isValid("[{(})]"));
        assertFalse(checker.isValid("()()["));
        assertFalse(checker.isValid("(({{[[]]}})"));
    }

    @Test
    public void invalidSingles() {
        assertFalse(checker.isValid("("));
        assertFalse(checker.isValid(")"));
    }

    @Test
    public void invalidFromAttempt() {
        assertFalse(checker.isValid("())({}}{()][]["));
    }
}
