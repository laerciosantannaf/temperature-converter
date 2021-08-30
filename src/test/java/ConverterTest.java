import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

  @Test
  public void testCelsiusConverter() {
    float result = Converter.celsiusToFahrenheit(0);
    assertEquals(32.0, result, 0.01);
  }

  @Test
  public void testFahrenheitConverter() {
    float result = Converter.fahrenheitToCelsius(0);
    assertEquals(-17.77777862548828, result, 0.01);
  }
}
