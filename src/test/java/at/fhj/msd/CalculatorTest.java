package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();

    }

    @Test
    void testAddNormalValues() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void testAddWithNegative() {

        assertEquals(1, calculator.add(-2, 3));
    }

    @Test
    void testDivideNormalValues() {

        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void testDivideByZero() {

        assertEquals(Double.NEGATIVE_INFINITY, calculator.divide(-10, 0.0));
    }

    @Test
    void testDivideNegativeValues() {

        assertEquals(3, calculator.divide(-6, -2));
    }

    @Test
    void testMinusNormalValues() {

        assertEquals(3, calculator.minus(6, 3));
    }

    @Test
    void testMinusWithNegative() {

        assertEquals(-6, calculator.minus(-8, -2));
    }

    @Test
    void testMinusWithZero() {

        assertEquals(-5, calculator.minus(-5, 0));
    }

    @Test
    void testMultiplyByNormalValues() {

        assertEquals(12, calculator.multiply(4, 3));
    }

    @Test
    void testMultiplyByNegativeNumbers() {

        assertEquals(10, calculator.multiply(-2, -5));
    }

    @Test
    void testMultiplyWithZero() {

        assertEquals(0, calculator.multiply(4, 0));

    }

    @Test
    void testFactorialZero() {

        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialNormal() {

        assertEquals(1, calculator.factorial(5));
    }

    @Test
    void testFactorialNegative() {

        assertEquals(0, calculator.factorial(-5));
    }
}
