import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters;

        // Input the measurement in meters
        do {
            System.out.print("Enter the measurement in meters: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // consume the invalid input
            }
            meters = scanner.nextDouble();
            if (meters <= 0) {
                System.out.println("Error: Measurement must be positive.");
            }
        } while (meters <= 0); // Ensure the input is positive

        // Convert meters to miles
        double miles = meters * 0.000621371;
        System.out.println("Measurement in miles: " + miles);

        // Convert meters to feet
        double feet = meters * 3.28084;
        System.out.println("Measurement in feet: " + feet);

        // Convert meters to inches
        double inches = meters * 39.3701;
        System.out.println("Measurement in inches: " + inches);

        scanner.close();
    }
}
