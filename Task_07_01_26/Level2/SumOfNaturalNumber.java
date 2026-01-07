package Task_07_01_26.Level2;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int formulaSum=sumOfNaturalUsingFormula(number);
        int recursionSum=sumOfNaturalUsingRecursion(number);
        if(formulaSum ==-1 || recursionSum ==-1)
            System.out.println(number+" is the negative number, Please enter the positive number.");
        else {
            System.out.println("Sum of " + number + " natural numbers using recursion " + sumOfNaturalUsingRecursion(number));
            System.out.println("Sum of " + number + " natural numbers using formula " + sumOfNaturalUsingFormula(number));
        }
    }

    public static int sumOfNaturalUsingRecursion(int number) {
        if(number<=0) return -1;
        if(number==1) return 1;
        return number +sumOfNaturalUsingRecursion(number-1);
    }

    public static int sumOfNaturalUsingFormula(int number) {
        if(number<=0) return -1;
        return number *(number+1)/2;
    }

}
