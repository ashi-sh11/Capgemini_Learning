package Task_12_01_29_ExtraQuestion.String;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
    }
}
