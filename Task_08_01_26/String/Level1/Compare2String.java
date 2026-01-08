package Task_08_01_26.String.Level1;

import java.util.Scanner;

public class Compare2String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.next();
        String secondWord = input.next();
        boolean firstResult =compareUsingCharMethod(firstWord,secondWord);
        boolean secondResult =compareUsingBuiltInMethod(firstWord,secondWord);
        if(firstResult && secondResult){
            System.out.println("First string \""+firstWord+"\" and second string \""+secondWord+"\" are equal ");
        }
        else
            System.out.println("First string \""+firstWord+"\" and second string \""+secondWord+"\" are not equal ");

    }

    private static boolean compareUsingBuiltInMethod(String firstWord, String secondWord) {
        if(firstWord.equals(secondWord)) return true;
        return false;
    }

    static boolean compareUsingCharMethod(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) return false;
        for(int i =0;i<firstWord.length();i++){
            if(firstWord.charAt(i)!=secondWord.charAt(i))return false;
        }
        return true;
    }
}
