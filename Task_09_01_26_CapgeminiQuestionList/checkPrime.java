package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number +" is prime ? "+isPrime(number));
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
