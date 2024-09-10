import java.util.Random;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        // Create a Scanner object to get user input 
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        final int maxAttempts = 10; // Predefined limit for attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        // Use a loop to allow multiple attempts
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // Compare the user's guess with the generated number
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            // Check if the player has exceeded the maximum number of attempts
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all your attempts. The number was " + randomNumber + ".");
            }
        }

        // Close the scanner
        scanner.close();
    }
}