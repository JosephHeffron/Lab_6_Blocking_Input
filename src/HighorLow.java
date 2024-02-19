import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1; // Generate random number between 1 and 10

        int userGuess;

        // Guess the number
        do {
            System.out.print("Guess the number (between 1 and 10): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // consume the invalid input
            }
            userGuess = scanner.nextInt();
            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Error: Please enter a number between 1 and 10.");
            }
        } while (userGuess < 1 || userGuess > 10); // Ensure the input is between 1 and 10

        // Display the random number
        System.out.println("The random number was: " + randomNumber);

        // Check the user's guess
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess was on the money!");
        } else if (userGuess < randomNumber) {
            System.out.println("Sorry, your guess was too low.");
        } else {
            System.out.println("Sorry, your guess was too high.");
        }

        scanner.close();
    }
}

