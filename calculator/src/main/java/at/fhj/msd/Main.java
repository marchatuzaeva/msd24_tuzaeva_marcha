package at.fhj.msd;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    System.out.println("Addition: " + calculator.add(10, 5));
    System.out.println("Subtraction: " + calculator.minus(10, 5));
    System.out.println("Multiplication: " + calculator.multiply(10, 5));
    System.out.println("Division: " + calculator.divide(10, 5));

    System.out.println("Your Name: Marcha Tuzaeva");

  }
}
