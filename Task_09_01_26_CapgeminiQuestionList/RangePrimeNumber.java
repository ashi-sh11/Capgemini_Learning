package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class RangePrimeNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int startingNumber = input.nextInt();
        int endingNumber = input.nextInt();
        for (int i = startingNumber; i <= endingNumber; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");

            }
        }
    }

    static boolean isPrime(int number){
        if(number <=1) return false;
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
