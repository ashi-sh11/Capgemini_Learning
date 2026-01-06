package Task_06_01_26.Level1;

import java.util.Scanner;

public class AddNumberUntilZeroOrNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double totalSum = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or negative to stop):");

        while (true) {

            double value = input.nextDouble();

            if (value <= 0) {
                break;
            }

            if (index == numbers.length) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            numbers[index] = value;
            index++;
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            totalSum += numbers[i];
        }

        System.out.println("\nTotal sum of positive numbers: " + totalSum);
    }
}
