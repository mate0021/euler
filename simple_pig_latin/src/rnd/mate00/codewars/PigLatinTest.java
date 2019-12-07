package rnd.mate00.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }

    @Test
    public void punctuationUntouched() {
        assertEquals("illWay odecay, orfay oodfay!", PigLatin.pigIt("Will code, for food!"));
    }

//    @Test
    public void spanishExclamationUntouched() {
        assertEquals("!olaHay, enioressay!", PigLatin.pigIt("!Hola, seniores!"));
    }

    @Test
    public void exclamationAtTheEnd() {
        assertEquals("oratay oay oresmay !", PigLatin.pigIt("O tempora o mores !"));
    }

}