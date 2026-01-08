package Task_08_01_26.Exception;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];
        System.out.print("Enter name 1: ");
        names[0] = input.nextLine();
        System.out.print("Enter name 2: ");
        names[1] = input.nextLine();
        System.out.print("Enter name 3: ");
        names[2] = input.nextLine();

        System.out.println("\n--- Generating Exception ---");
        generateException(names);     // This will crash the program

        System.out.println("\n--- Handling Exception ---");
        handleException(names);       // This will handle safely
    }

    // Method 1: Generates ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {

        // Accessing index beyond array length
        System.out.println(names[5]);
    }

    // Method 2: Handles ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            System.out.println(names[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: You tried to access an invalid index.");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught.");
        }
    }
}
