package Task_05_01_26;

import java.util.Scanner;

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number =input.nextInt();
        if(number>0){
            System.out.println("Number is Positive.");
        }
        else if(number<0){
            System.out.println("Number is Negative.");

        }
        else{
            System.out.println("Number is Zero");
        }
    }
}
