package Task_08_01_26.String.Level2;

import java.util.Scanner;

public class WordSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        String[] builtInWords = text.split(" ");
        String[] manualWords = splitWords(text);


        boolean isSame = compareArrays(builtInWords, manualWords);
        System.out.println("\nBuilt-in Split Result:");
        printArray(builtInWords);
        System.out.println("\nManual Split Result:");
        printArray(manualWords);
        System.out.println("\nAre both results same? " + isSame);
    }

    // Find length of string without using length()
    public static int findLength(String text) {

        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Split text into words using charAt()
    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 1: Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Step 2: Extract words
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[wordIndex++] = extractSubstring(text, start, end);
            start = end + 1;
        }

        // Last word
        words[wordIndex] = extractSubstring(text, start, length);

        return words;
    }

    // Extract substring using charAt()
    public static String extractSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    // Utility method to print array
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
