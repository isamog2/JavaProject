import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1; // Random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;
        int guess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Guess a number between 1 and 10:");

        while (!hasGuessedCorrectly) {
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 10) {
                System.out.println("Invalid guess. Try again:");
            } else if (guess < numberToGuess) {
                System.out.println("Higher, try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Lower, try again:");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Correct! It took you " + numberOfTries + " tries.");
            }
        }
        scanner.close();
    }
}
