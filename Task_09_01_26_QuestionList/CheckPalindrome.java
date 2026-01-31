package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Is palindrome : "+isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        int temp =number;
        int palNumber=0;
        while (temp!=0){
            int digit =temp%10;
            temp =temp/10;
            palNumber =(palNumber*10)+digit;
        }
        return (palNumber==number);
    }
}
