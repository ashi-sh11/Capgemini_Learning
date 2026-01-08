package Task_08_01_26.String.Level2;

import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text with spaces: ");
        String text = input.nextLine();

        int[] indexes = findTrimIndexes(text);
        String manualTrim = createSubstring(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();
        boolean isSame = compareStrings(manualTrim, builtInTrim);
        System.out.println("\nManual Trim Result : [" + manualTrim + "]");
        System.out.println("Built-in Trim Result: [" + builtInTrim + "]");
        System.out.println("Are both same? " + isSame);

    }

    // Find start & end index without spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }

    //  Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}
