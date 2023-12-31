// Number Guessing Game
// This code is done by Vishal Kumar Patel
// You have to guess any number between 1 to 100.
/* The code is design in such a way that it will choose any number between 1 to 100, and the user have to guess the correct number.
 if the user will choose a number which is higher than the correct number then a message will prompt saying the guess is too high or if you choose a number
   which is lower than the correct number then the message will prompt saying the Guess is too low */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random numb = new Random();
        int numberToGuess = numb.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int count=0;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess any number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the Correct number!");
                count++;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again:");
                count++;
            } else {
                System.out.println("Your guess is too high. Try again:");
                count++;
            }
        }

        System.out.println("Your total attempt is: " + count);
        scanner.close();
    }
}
