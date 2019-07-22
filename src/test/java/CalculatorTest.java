import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  private Calculator calculator;

  @Before
  public void before() {
    calculator = new Calculator();
  }

  @Test
  public void calculatorCanAdd() {
    assertEquals(8.5, calculator.add(3.2, 5.3), 0.01);
  }

  @Test
  public void calculatorCanSubtract() {
    assertEquals(4.2, calculator.subtract(10.9, 6.7), 0.01);
  }

  @Test
  public void calculatorCanMultiply() {
    assertEquals(42.0, calculator.multiply(6.0, 7.0), 0.01);
  }

  @Test
  public void calculatorCanDivide() {
    assertEquals(4.0, calculator.divide(32.0, 8.0), 0.01);
  }

}
