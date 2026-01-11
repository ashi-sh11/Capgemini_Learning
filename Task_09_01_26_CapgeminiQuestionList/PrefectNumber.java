package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class PrefectNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number+" is perfect square ? "+findPerfectNumber(number));
    }
    static boolean findPerfectNumber(int num){
        int totalSum=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                totalSum+=i;
            }
        }
        return num==totalSum;
    }
}
