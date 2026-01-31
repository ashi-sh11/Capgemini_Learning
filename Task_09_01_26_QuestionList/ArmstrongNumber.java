package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int temp=number;
        int count =0;
        while (temp!=0) {
            count++;
            int digit = temp % 10;
            temp = temp / 10;
        }
        int tempNumber =number;
        int arms=0;
        while (tempNumber!=0){
            int digit =tempNumber%10;
            tempNumber=tempNumber/10;
            arms +=Math.pow(digit,count);
        }
        System.out.println(number+" is Armstrong number "+ (arms==number));
    }
}
