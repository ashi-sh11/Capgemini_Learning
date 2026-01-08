package Task_08_01_26.String.Level1;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = input.nextLine();

        System.out.println("\n--- Generating Exception ---");
        generateException(text);     // This will crash the program

        System.out.println("\n--- Handling Exception ---");
        handleException(text);       // This will handle safely
    }
    public static void generateException(String text) {

        int number = Integer.parseInt(text);   // may throw NumberFormatException
        System.out.println("Number is: " + number);
    }
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        }
        catch (java.lang.NumberFormatException e) {
            System.out.println("NumberFormatException caught: Input is not a valid number.");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught.");
        }
    }
}
