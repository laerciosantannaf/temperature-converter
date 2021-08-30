import java.util.Scanner;

public class Converter {

  public static final String LABEL_FAHRENHEIT = "Fahrenheit";
  public static final String LABEL_CELSIUS = "Celsius";

  public static void main(String[] args) {
    init();
  }

  public static void init() {
    Scanner scan = new Scanner(System.in);
    System.out.printf("Digite 1 (%s) e 2 (%s): ", LABEL_FAHRENHEIT, LABEL_CELSIUS);
    System.out.printf("Valor convertido: %s", convert(scan, scan.nextInt()));
  }

  public static float fahrenheitToCelsius(float fahrenheit) {
    return (fahrenheit - 32) * 5/9;
  }

  public static float celsiusToFahrenheit(float celsius) {
    return (celsius - 5/9) + 32;
  }

  private static String convert(Scanner scan, int opt) {
    String model = "Digite um valor em %s: ";
    switch(opt) {
      case 1:
        System.out.printf(model, LABEL_FAHRENHEIT);
        return String.format("%.2f ºC", fahrenheitToCelsius(scan.nextFloat()));
      case 2:
        System.out.printf(model, LABEL_CELSIUS);
        return String.format("%.2f ºF", celsiusToFahrenheit(scan.nextFloat()));
      default:
        return "ERROR!";
    }
  }
}
