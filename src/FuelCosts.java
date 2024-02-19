import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallonsOfGas;
        double fuelEfficiency;
        double pricePerGallon;

        // Input the number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallonsOfGas = scanner.nextDouble();
        } while (gallonsOfGas <= 0); // Ensure the input is positive

        // Input the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = scanner.nextDouble();
        } while (fuelEfficiency <= 0); // Ensure the input is positive

        // Input the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0); // Ensure the input is positive

        // Calculate cost per 100 miles
        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        System.out.printf("The cost per 100 miles is: $%.2f\n", costPer100Miles);

        // Calculate how far the car can go with the gas in the tank
        double distance = gallonsOfGas * fuelEfficiency;
        System.out.printf("The car can go %.2f miles with the gas in the tank.\n", distance);

        scanner.close();
    }
}
