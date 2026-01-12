package Task_12_01_29_ExtraQuestion.Funtions;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== BASIC CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose an operation (1-4): ");
        int choice = input.nextInt();

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 2:
                result = subtract(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 3:
                result = multiply(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    result = divide(num1, num2);
                    System.out.println("Result = " + result);
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }

    // Function for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for Division
    public static double divide(double a, double b) {
        return a / b;
    }
}

