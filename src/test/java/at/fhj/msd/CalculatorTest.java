package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

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
  void tesetDivideNormalValues() {

    assertEquals(5, calculator.divide(10, 2));
  }

  @Test
  void testDivideByZero() {

    assertEquals(0, calculator.divide(10, 0));
  }
}
