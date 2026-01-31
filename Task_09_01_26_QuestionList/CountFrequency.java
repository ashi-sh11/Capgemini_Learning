package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        int[] freq=frequency(str);
        printFrequency(freq);
    }
    static int[] frequency(String str){
        int[] freq = new int[26];
        str=str.replaceAll(" ","");

        for (int i = 0; i < str.length();i++) {

            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
                freq[ch-'a']++;
            else if(ch>='A' && ch<='Z')
                freq[ch-'A']++;

        }
        return freq;
    }

    static void printFrequency(int[] frequency){
        for (int i = 0; i < 26; i++) {
            if (frequency[i]==0){
                continue;
            }
            else {
                System.out.println(((char)('a'+i))+" "+frequency[i]);
            }
        }
    }
}
