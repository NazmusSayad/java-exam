import java.util.*;

class Calculator {
  public static void fahrenheitToCelsius(double fahrenheit) {
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
  }

  public static void celsiusToFahrenheit(double celsius) {
    double fahrenheit = (9.0 / 5) * celsius + 32;
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}

public class CelsiusFahrenheit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble();
    Calculator.fahrenheitToCelsius(fahrenheit);

    System.out.println("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();
    Calculator.celsiusToFahrenheit(celsius);

    input.close();
  }
}