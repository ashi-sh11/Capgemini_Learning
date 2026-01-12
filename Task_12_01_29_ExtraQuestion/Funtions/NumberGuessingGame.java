package Task_12_01_29_ExtraQuestion.Funtions;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("Give feedback: high / low / correct\n");

        int low = 1;
        int high = 100;
        boolean guessed = false;

        while (!guessed) {

            int guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            String feedback = getUserFeedback();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("I guessed your number correctly!");
                guessed = true;
            }
            else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
            else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
            else {
                System.out.println("Please type only: high, low, or correct.");
            }
        }
    }

    // Generate a guess
    public static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    // Take feedback from user
    public static String getUserFeedback() {
        System.out.print("Is my guess high, low, or correct? ");
        return input.nextLine();
    }
}

