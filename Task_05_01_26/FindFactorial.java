package Task_05_01_26;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number =input.nextInt();
        if(number>0){
            long factorial =1;
            int increment =1;
            while (number>=increment){
                factorial = factorial*increment;
                increment++;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        else {
            System.out.println(number+" is Negative, Please enter a positive integer.");
        }
    }
}
