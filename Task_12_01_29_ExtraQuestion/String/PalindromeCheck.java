package Task_12_01_29_ExtraQuestion.String;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean isPal = true;
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPal = false;
                break;
            }
            i++; j--;
        }

        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
    }
}

