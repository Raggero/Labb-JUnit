package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Körs före varje test");
    }

    @Test
    @DisplayName("Testar addNumbers() i Calculatorklassen")
    void addNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.addNumbers(4,2));
    }

    @RepeatedTest(5)
    @DisplayName("Testar subtractNumbers() i Calculatorklassen")
    void subtractNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.subtractNumbers(8,2));
    }

    @Disabled
    void multiplyNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiplyNumbers(3,2));
    }

    @Test
    @DisplayName("Testar divideNumbers() i Calculatorklassen")
    void divideNumbers() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.divideNumbers(12,2) == 6);
    }
}