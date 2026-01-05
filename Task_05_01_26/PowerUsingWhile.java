package Task_05_01_26;

import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        if (number > 0 && power >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result = result * number;
                counter++;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);
        } else {
            System.out.println("Please enter positive integers for number and power.");
        }
    }
}
