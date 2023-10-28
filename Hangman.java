package AppDevelopment;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretWord = "eclipse"; // Replace with your own word
        int maxAttempts = 6;
        int attempts = 0;
        StringBuilder guessedWord = new StringBuilder("_".repeat(secretWord.length()));

        System.out.println("Welcome to the Hangman game!");
        System.out.println("Guess the word: " + guessedWord);

        while (attempts < maxAttempts && guessedWord.indexOf("_") != -1) {
            System.out.print("Enter a letter: ");
            char letter = scanner.next().charAt(0);
            boolean found = false;

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    guessedWord.setCharAt(i, letter);
                    found = true;
                }
            }

            if (!found) {
                attempts++;
                System.out.println("Incorrect guess! You have " + (maxAttempts - attempts) + " attempts left.");
            } else {
                System.out.println("Good guess! Word: " + guessedWord);
            }
        }

        if (guessedWord.indexOf("_") == -1) {
            System.out.println("Congratulations! You guessed the word: " + secretWord);
        } else {
            System.out.println("Out of attempts. The word was: " + secretWord);
        }

        scanner.close();
    }
}
