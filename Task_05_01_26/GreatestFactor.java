package Task_05_01_26;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number =input.nextInt();
        if (number > 0) {
            int greatestFactor = 1;
            int i =number-1;
            while(number-1>=i){
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
                i--;
            }
            System.out.println("Greatest factors of " + number + " is : "+greatestFactor);

        }
        else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
