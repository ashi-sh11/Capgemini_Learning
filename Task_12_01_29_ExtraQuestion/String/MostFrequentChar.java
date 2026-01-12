package Task_12_01_29_ExtraQuestion.String;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int max = 0;
        char result = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > max) {
                max = freq[s.charAt(i)];
                result = s.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: " + result);
    }
}
