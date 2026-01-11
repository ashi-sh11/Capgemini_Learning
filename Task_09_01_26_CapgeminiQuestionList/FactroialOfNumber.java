package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class FactroialOfNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(findFactorial(number));
    }
    static double findFactorial(int number){
        double fact =1;
        for (int i = 1; i <= number; i++) {
            fact=fact*i;
        }
        return fact;
    }
}

