package se.iths;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Test av alla metoder i TextProcessor-klassen");
    }

    @Test
    void testStringToUppercase() {
        TextProcessor textProcessor = new TextProcessor();
        assertEquals("HEJ", textProcessor.stringToUppercase("hej"));
    }

    @Test
    void testStringToLowerCaseEqualsTrue() {
        TextProcessor textProcessor = new TextProcessor();
        assertTrue(textProcessor.stringToLowerCase("HEJ").equals("hej"));
    }

    @Test
    void testStringToReverseNotNull() {
        TextProcessor textProcessor = new TextProcessor();
        assertNotNull(textProcessor.stringToReverse("Hej"));
    }
}