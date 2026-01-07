package Task_07_01_26.Level1;

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int[] arr = findQuotientAndReminder(number1,number2);
        System.out.println("By dividing the "+number1+" by "+number2+" qoutient is "+arr[0]
        +" reminder is "+arr[1]);

    }
    static int[]  findQuotientAndReminder(int number1 ,int number2){
        int quotient=number1 / number2;
        int reminder =number1 % number2;
        return new int[]{quotient,reminder};
    }
}
