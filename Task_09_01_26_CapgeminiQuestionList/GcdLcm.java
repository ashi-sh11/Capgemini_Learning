package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class GcdLcm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int gcd = findGcd(a, b);
        int lcm = findLcm(a, b);
        System.out.println("HCF = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    static int findGcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int findLcm(int a, int b) {

        return (a * b) / findGcd(a, b);
    }
}
