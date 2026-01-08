package Task_08_01_26.String.Level1;

import java.util.Scanner;

public class LowerCaseConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        String builtInLower = text.toLowerCase();
        String manualLower = convertToLowerCase(text);

        boolean isSame = compareStrings(builtInLower, manualLower);
        System.out.println("\nBuilt-in Lowercase : " + builtInLower);
        System.out.println("Manual Lowercase   : " + manualLower);
        System.out.println("Are both results same? " + isSame);
        input.close();
    }

    // Method 1: Convert string to lowercase manually using ASCII logic
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);   // ASCII conversion
            }
            result = result + ch;
        }
        return result;
    }

    // Method 2: Compare two strings using charAt()
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
