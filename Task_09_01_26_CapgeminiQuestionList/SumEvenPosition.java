package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class SumEvenPosition {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int reverse =reverseNumber(number);
        System.out.println(sumPosition(reverse));

    }
    static int sumPosition(int n){
        int result =0;
        int count =0;
        while (n!=0){
            count++;
            int d =n%10;
            if(count%2==0)
                result =result+d;
            n/=10;
        }
        return result;
    }
    static int reverseNumber(int n){
        int result =0;
        while (n!=0){
            int d =n%10;
            result =result*10+d;
            n/=10;
        }
        return result;
    }

}
