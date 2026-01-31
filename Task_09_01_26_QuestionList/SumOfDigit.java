package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Sum of "+number+" is : "+sumOfDigit(number));
    }

    private static int sumOfDigit(int number) {
        int sum =0;
        while (number!=0){
            int digit = number%10;
            sum+=digit;
            number=number/10;
        }
        return sum;
    }
}
