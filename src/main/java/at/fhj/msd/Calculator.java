package at.fhj.msd;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int factorial(int n) {
        if (n < 0)
            return 0;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}