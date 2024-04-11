import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int target = rand.nextInt(max - min + 1) + min;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess == target) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = input.next();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    break;
                } else {
                    target = rand.nextInt(max - min + 1) + min;
                    attempts = 0;
                    System.out.println("I've selected a new number. Let's play again!");
                }
            } else if (guess < target) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        } while (true);

        System.out.println("Thank you for playing the Number Guessing Game!");
        input.close();
    }
}
