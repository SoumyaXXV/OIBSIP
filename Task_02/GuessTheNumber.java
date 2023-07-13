import java.util.Scanner;
import java.lang.Math;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        int remainingTrials = 5;
        boolean guessedCorrectly = false;

        System.out.println("The computer has selected a number between 1 and 100.");
        System.out.println("You have 5 trials to guess the number!");

        while (remainingTrials > 0) {
            System.out.println("Enter your guess:");
            int guessedNumber = scanner.nextInt();
            remainingTrials--;

            if (guessedNumber == answer) {
                System.out.println("You guessed it right! The number is " + answer);
                System.out.println("-- YOU WIN --");
                guessedCorrectly = true;
                break;
            } else if (guessedNumber > answer) {
                System.out.println("The number entered is greater than the selected number.");
                System.out.println("You have " + remainingTrials + " trials left.");
            } else {
                System.out.println("The number entered is less than the selected number.");
                System.out.println("You have " + remainingTrials + " trials left.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("You have no trials remaining.");
            System.out.println("The actual number was: " + answer);
            System.out.println("YOU LOSE");
        }
    }
}
