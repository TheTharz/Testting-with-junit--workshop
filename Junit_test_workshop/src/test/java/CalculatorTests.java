import org.example.Calculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorTests {

        Calculator calculator = new Calculator();

        @Test
        public void testAddition() {
            assertEquals(5, calculator.add(2, 3));
            assertEquals(10, calculator.add(5, 5));
            assertEquals(-1, calculator.add(2, -3));
        }

        @Test
        public void testSubtraction() {
            assertEquals(1, calculator.subtract(3, 2));
            assertEquals(0, calculator.subtract(5, 5));
            assertEquals(5, calculator.subtract(2, -3));
        }

        @Test
        public void testMultiplication() {
            assertEquals(6, calculator.multiply(2, 3));
            assertEquals(25, calculator.multiply(5, 5));
            assertEquals(-6, calculator.multiply(2, -3));
        }

        @Test
        public void testDivision() {
            assertEquals(2.5, calculator.divide(5, 2), 0.001); // Specify delta for double comparison
            assertEquals(1, calculator.divide(5, 5), 0.001);

            try {
                calculator.divide(5, 0); // Attempt to divide by zero
                fail("Expected IllegalArgumentException"); // Fail if no exception is thrown
            } catch (IllegalArgumentException e) {
                assertEquals("Cannot divide by zero", e.getMessage()); // Check exception message
            }
        }

}
