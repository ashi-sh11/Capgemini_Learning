package Task_08_01_26.String.Level1;

import java.util.Scanner;

public class IllegalArgumentException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();

        System.out.println("\n--- Generating Exception ---");
        generateException(text);     // This will crash the program

        System.out.println("\n--- Handling Exception ---");
        handleException(text);
    }
    public static void generateException(String text) {

        // start index > end index  (IllegalArgumentException)
        String result = text.substring(5, 2);

        System.out.println(result);
    }
    public static void handleException(String text) {

        try {
            String result = text.substring(2, 10);
            System.out.println(result);
        }
        catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught.");
        }
    }

}

