package Task_12_01_29_ExtraQuestion.String;

import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                result += s.charAt(i);
            }
        }

        System.out.println("Modified String: " + result);
    }
}
