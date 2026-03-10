package Task_10_03_2026;

import java.util.Locale;

public class Anagrams {
    static void main() {
        String str1 ="anna";
        String str2 ="nanA";
        System.out.println(findAnagrams(str1,str2));
    }
    static String findAnagrams(String str1,String str2){
        str2=str2.toLowerCase();
        str1=str1.toLowerCase();
        int[] charArray = new int[26];
        for (char ch : str1.toCharArray()){
            charArray[ch-'a']++;
        }

        for (char ch : str2.toCharArray()){
            charArray[ch-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(charArray[i] != 0) return "No";
        }
        return "Yes";
    }
}
