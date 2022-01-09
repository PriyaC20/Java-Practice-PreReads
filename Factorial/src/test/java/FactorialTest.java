import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    void testPositiveNumberFactorial() {
        Factorial factorial = new Factorial(4);
        int actual = factorial.performFactorial();
        assertEquals(24, actual);
    }

    @Test
    void testZeroFactorial() {
        Factorial factorial = new Factorial(0);
        int actual = factorial.performFactorial();
        assertEquals(1, actual);
    }

    @Test
    void testOneFactorial() {
        Factorial factorial = new Factorial(1);
        int actual = factorial.performFactorial();
        assertEquals(1, actual);
    }

    @Test
    void testNegativeNumberFactorial() {
        Factorial factorial = new Factorial(-3);
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> factorial.performFactorial());
        assertEquals("Factorial of negative integer is undefined", arithmeticException.getMessage());
    }
}
