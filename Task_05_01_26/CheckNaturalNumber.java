package Task_05_01_26;

import java.util.Scanner;

public class CheckNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number =input.nextInt();
        // Check if the number is a natural number
        if(number>=0){
            int sumOfNaturalNumber=0;
            sumOfNaturalNumber =(number*(number+1)/2);
            System.out.println("The sum of "+number+" natural numbers is "+sumOfNaturalNumber);
        }
        else {
            System.out.println("The number "+number+" is not a natural number");

        }
    }
}
