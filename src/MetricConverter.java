import java.util.Scanner;
// Import scanner
// Create class
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare variables
        double meters;

        // Input the measurement in meters
        do {
            System.out.print("Enter the measurement in meters: "); // output
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number."); // output
                scanner.next(); 
                // Invalid input
            }
            meters = scanner.nextDouble();
            if (meters <= 0) {
                System.out.println("Error: Measurement must be positive."); // output
            }
        } while (meters <= 0); 
        // Ensure the input is positive

        // Convert meters to miles
        double miles = meters * 0.000621371;
        System.out.println("Measurement in miles: " + miles); // output

        // Convert meters to feet
        double feet = meters * 3.28084;
        System.out.println("Measurement in feet: " + feet); // output

        // Convert meters to inches
        double inches = meters * 39.3701;
        System.out.println("Measurement in inches: " + inches); // output

        scanner.close();
    }
}
