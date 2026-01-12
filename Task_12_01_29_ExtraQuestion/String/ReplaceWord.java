package Task_12_01_29_ExtraQuestion.String;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("New word: ");
        String newWord = sc.nextLine();

        String[] words = sentence.split(" ");
        String result = "";

        for (String w : words) {
            if (w.equals(oldWord))
                result += newWord + " ";
            else
                result += w + " ";
        }
        System.out.println("Modified Sentence: " + result.trim());
    }
}
