package Task_05_02_2026.Exceptions.Exception;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
