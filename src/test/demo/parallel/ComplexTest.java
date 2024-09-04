package test.demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

public class ComplexTest {

  @Test
  public void testMinusPositiveNumbers() {
    Complex a = new Complex(5.0, 3.0);
    Complex b = new Complex(2.0, 1.0);
    Complex result = a.minus(b);

    assertEquals(3.0, result.getRe(), 0.0001);
    assertEquals(2.0, result.getIm(), 0.0001);
  }

  @Test
  public void testMinusNegativeNumbers() {
    Complex a = new Complex(-3.0, -2.0);
    Complex b = new Complex(-1.0, -1.0);
    Complex result = a.minus(b);

    assertEquals(-2.0, result.getRe(), 0.0001);
    assertEquals(-1.0, result.getIm(), 0.0001);
  }

  @Test
  public void testMinusWithZero() {
    Complex a = new Complex(4.0, 5.0);
    Complex b = new Complex(0.0, 0.0);
    Complex result = a.minus(b);

    assertEquals(4.0, result.getRe(), 0.0001);
    assertEquals(5.0, result.getIm(), 0.0001);
  }

  @Test
  public void testMinusResultingInZero() {
    Complex a = new Complex(3.0, 3.0);
    Complex b = new Complex(3.0, 3.0);
    Complex result = a.minus(b);

    assertEquals(0.0, result.getRe(), 0.0001);
    assertEquals(0.0, result.getIm(), 0.0001);
  }

}
