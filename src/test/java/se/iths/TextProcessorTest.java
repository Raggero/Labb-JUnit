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
    void stringToUpperCase() {
        TextProcessor textProcessor = new TextProcessor();
        assertEquals("HEJ", textProcessor.stringToUpperCase("hej"));
    }

    @Test
    void stringToLowerCase() {
        TextProcessor textProcessor = new TextProcessor();
        assertTrue(textProcessor.stringToLowerCase("HEJ").equals("hej"));
    }

    @Test
    void stringToReverse() {
        TextProcessor textProcessor = new TextProcessor();
        assertNotNull(textProcessor.stringToReverse("Hej"));
    }
}