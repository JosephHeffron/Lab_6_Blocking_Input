import java.util.Scanner;

public class CtoFConverter {
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("%.2f°C is equal to %.2f°F\n", celsius, fahrenheit);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid number for the temperature in Celsius.");
                scanner.next(); // consume the invalid input
            }
        }
        scanner.close();
    }
}
