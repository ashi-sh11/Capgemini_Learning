package Task_02_01_26.level1;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        boolean isDivisible =(number%5==0);
        if(isDivisible){
            System.out.println("Is the number "+number+" divisible by 5? YES");
        }
        else{
            System.out.println("Is the number "+number+" divisible by 5? NO");
        }

    }
}
