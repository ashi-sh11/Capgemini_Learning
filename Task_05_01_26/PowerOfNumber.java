package Task_05_01_26;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int base =input.nextInt();
        int exponent =input.nextInt();
        if(base>0 && exponent>=0){
            int result =1;
            for (int i =1;i<=exponent;i++){
                result = result * base;
            }
            System.out.println(base + " raised to the power " + exponent + " is " + result);
        }
        else {
            System.out.println("Please enter positive integers for number and power.");
        }
    }
}

