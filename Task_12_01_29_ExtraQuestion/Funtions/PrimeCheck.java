package Task_12_01_29_ExtraQuestion.Funtions;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean result = isPrime(number);

        if (result) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }

    // Function to check prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
