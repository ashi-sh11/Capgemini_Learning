package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
