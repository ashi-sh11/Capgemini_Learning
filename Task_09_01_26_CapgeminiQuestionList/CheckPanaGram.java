package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class CheckPanaGram {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Is  panagram : "+isPanagram(str));
    }
    private static boolean isPanagram(String str) {
        int[] freq = new int[26];
        str=str.replace(" ","").toLowerCase();
        for(int i=0;i<str.length();i++) {
            char ch =str.charAt(i);
            freq[ch-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(freq[i] ==0) return false;
        }
        return true;
    }
}

