import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");

        do {
            System.out.print("Take a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Try a higher number.");
            } else if (guess > randomNumber) {
                System.out.println("Try a lower number.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
        scanner.close();
    }
}
