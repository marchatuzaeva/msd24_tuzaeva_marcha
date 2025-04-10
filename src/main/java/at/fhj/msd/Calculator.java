package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double a, double b) {
        logger.debug("add() called with parameters: a={}, b={}", a, b);
        return a + b;
    }

    public double divide(double a, double b) {
        logger.debug("divide() called with parameters: a={}, b={}", a, b);
        if (b == 0) {
            logger.error("Division by zero attempted! Parameters: a={}, b={}", a, b);
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double minus(double a, double b) {
        logger.debug("minus() called with parameters: a={}, b={}", a, b);
        return a - b;
    }

    public double multiply(double a, double b) {
        logger.debug("multiply() called with parameters: a={}, b={}", a, b);
        return a * b;
    }

    public int factorial(int n) {
        if (n < 0) {
            logger.error("Invalid input for factorial: n cannot be negative");
            throw new IllegalArgumentException("n darf nicht negativ sein.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        logger.info("factorial called with: n=" + n + ", result=" + result);
        return result;
    }

}