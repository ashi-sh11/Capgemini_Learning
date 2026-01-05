package Task_05_01_26;

import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number =input.nextInt();
        if(number>0) {
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    System.out.println(i+" Even Number");
                }
                else {
                    System.out.println(i+" Odd Number");

                }
            }
        }
        else {
            System.out.println(number+" is Negative, Please enter a natural number.");
        }

    }
}
