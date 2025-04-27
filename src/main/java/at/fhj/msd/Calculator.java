/**
 * Represents a calculator with basic arithmetic operations.
 * Includes attributes for operands and methods for calculations.
 */
public class Calculator {

    /**
     * Stores the first number for calculations.
     */
    private int number1;

    /**
     * Stores the second number for calculations.
     */
    private int number2;

    /**
     * Adds two numbers together.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one number from another.
     * 
     * @param a the first number
     * @param b the number to subtract from the first number
     * @return the difference between a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one number by another.
     * 
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}
