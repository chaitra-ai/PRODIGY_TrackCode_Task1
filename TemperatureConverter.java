package Task01;

import java.util.Scanner;

public class TemperatureConverter {
	
	public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();  // Consume newline character

        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String unit = scanner.nextLine().toLowerCase();

        double fahrenheit, celsius, kelvin;
        switch (unit) {
            case "celsius":
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "fahrenheit":
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
                break;
            case "kelvin":
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                return;
        }

        System.out.println(temperature + " " + unit.toUpperCase() + " is equal to:");
        System.out.printf("%.2f Fahrenheit\n", fahrenheit);
        System.out.printf("%.2f Celsius\n", celsius);
        System.out.printf("%.2f Kelvin\n", kelvin);

        scanner.close();
    }


}
