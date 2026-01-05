package Task_05_01_26;

import java.util.Scanner;

public class CompareSumNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number =input.nextInt();
        if(number>0){
            int formulaSum=0;
            int whileSum=0;
            int increment =1;
            while(number>=increment){
                whileSum+=increment;
                increment++;
            }
            formulaSum =number * (number+1) / 2;
            System.out.println("Sum using while loop: " + whileSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (whileSum == formulaSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations are not equal.");
            }
        }
        else{
            System.out.println("The number " + number + " is not a natural number.");
        }

    }
}
