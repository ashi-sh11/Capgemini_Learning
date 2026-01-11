package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next().toLowerCase();
        String str2 = input.next().toLowerCase();
        System.out.println("String  first \""+str1+"\" and String second \""+str2+"\" is anagrams ?"+ (str1.equals(str1)));
    }

    static boolean anagram(String str1 ,String str2){
        int[] freq= new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch-'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(freq[i]!=0) return false;
        }
        return true;
    }
}
