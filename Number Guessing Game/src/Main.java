import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        String replay;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");


         // outer do while loop for replay option
         do {
             int randomNumber = random.nextInt(1,101);
             int attempts = 0;

            // inner do while loop for guessing numbers
            do {
                System.out.print("Enter your guess: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Enter a number: ");
                    scanner.next();  // Clear invalid input
                }

                guess = scanner.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else if ((guess < randomNumber)){
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
                }

            } while (guess != randomNumber);

            System.out.println("Do you want to play again? (y/n): ");
            replay = scanner.next().trim().toLowerCase();

            while (!replay.equals("y") && !replay.equals("n")) {
                System.out.println("Invalid input. Please enter 'y' or 'n': ");
                replay = scanner.next().trim().toLowerCase();
            }


        } while (replay.equals("y"));

        System.out.println("Thank you for playing! Goodbye!");
    }
}