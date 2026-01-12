package Task_12_01_29_ExtraQuestion.String;

import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");
        String longest = words[0];

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }
        System.out.println("Longest word: " + longest);
    }
}
