package at.fhj.msd;

public class CalculatorImpl implements ICalculator {
    @Override
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    @Override
    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return number1 / number2;
    }
}
