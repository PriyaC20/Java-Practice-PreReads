import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberCheckerTest {
    @Test
    void returnFalseIfNumberIsLessThan2() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(1);
        Boolean isPrime = primeNumberChecker.check();
        assertFalse(isPrime);
    }

    @Test
    void returnFalseIfNotPrime() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(10);
        Boolean isPrime = primeNumberChecker.check();
        assertFalse(isPrime);
    }

    @Test
    void returnTrueIfPrime() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(5);
        Boolean isPrime = primeNumberChecker.check();
        assertTrue(isPrime);
    }
}