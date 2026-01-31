package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int[] res =countEvenOdd(number);
        System.out.println("Even digit count "+res[0]+" Odd digit count "+res[1]);
    }
    static int [] countEvenOdd(int number){
        int evenCount =0;
        int oddCount =0;
        while(number!=0){
            int digit=number%10;
            if(digit%2==0) evenCount++;
            else oddCount++;
            number=number/10;
        }
        return new int[] {evenCount,oddCount};
    }
}
