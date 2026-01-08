package Task_08_01_26.String.Level1;

import java.util.Scanner;

public class UpperCaseConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();

        String builtInUpper = text.toUpperCase();
        String manualUpper = convertToUpperCase(text);

        boolean isSame = compareStrings(builtInUpper, manualUpper);

        System.out.println("\nBuilt-in Uppercase : " + builtInUpper);
        System.out.println("Manual Uppercase   : " + manualUpper);
        System.out.println("Are both results same? " + isSame);
    }

    public static String convertToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
