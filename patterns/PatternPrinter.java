package patterns;

import java.util.Scanner;

/**
 * PatternPrinter
 *
 * A utility class that demonstrates multiple number
 * and character patterns using loops.
 *
 * All pattern methods are static and independent,
 * making the code modular, readable, and reusable.
 *
 * Author: Ashish
 * Version: 1.0
 */
public class PatternPrinter {

    /**
     * Entry point of the program.
     * Reads input and calls required pattern method.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Call the required pattern here
        printIncreasingNumberTriangle(n);

    }

    /* =========================================================
       PATTERN 1: Increasing Number Triangle
       Output (n = 5):
       1
       1 2
       1 2 3
       1 2 3 4
       1 2 3 4 5
       ========================================================= */
    static void printIncreasingNumberTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       PATTERN 2: Reverse Increasing Triangle
       Output (n = 5):
       5
       4 5
       3 4 5
       2 3 4 5
       1 2 3 4 5
       ========================================================= */
    static void printReverseIncreasingTriangle(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = row; col <= n; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       PATTERN 3: Reverse Number Triangle
       Output (n = 5):
       1
       2 1
       3 2 1
       4 3 2 1
       5 4 3 2 1
       ========================================================= */
    static void printReverseNumberTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       PATTERN 4: Repeating Row Number
       Output (n = 5):
       1
       2 2
       3 3 3
       4 4 4 4
       5 5 5 5 5
       ========================================================= */
    static void printRepeatingRowNumber(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       PATTERN 5: Decreasing Count Triangle
       Output (n = 5):
       1 1 1 1 1
       2 2 2 2
       3 3 3
       4 4
       5
       ========================================================= */
    static void printDecreasingCountTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n - row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       PATTERN 6: Alphabet Triangle
       Output (n = 5):
       A
       A B
       A B C
       A B C D
       A B C D E
       ========================================================= */
    static void printAlphabetTriangle(int n) {
        for (int row = 0; row < n; row++) {
            char ch = 'A';
            for (int col = 0; col <= row; col++) {
                System.out.print((char) (ch + col) + " ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       PATTERN 7: Continuous Number Triangle
       Output (n = 5):
       1
       2 3
       4 5 6
       7 8 9 10
       11 12 13 14 15
       ========================================================= */
    static void printContinuousNumberTriangle(int n) {
        int value = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(value++ + " ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       PATTERN 8: Repeating Number Inverted Triangle
       Output (n = 5):
       1
       2 2
       3 3 3
       4 4 4 4
       5 5 5 5 5
       ========================================================= */
    static void printRepeatingInvertedTriangle(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= row; col--) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       PATTERN 9: Alphabet Decreasing Triangle
       Output (n = 5):
       A A A A A
       B B B B
       C C C
       D D
       E
       ========================================================= */
    static void printAlphabetDecreasingTriangle(int n) {
        char ch = 'A';
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }

    /* =========================================================
       PATTERN 10: Alternating Binary Triangle
       Output (n = 5):
       1
       0 0
       1 1 1
       0 0 0 0
       1 1 1 1 1
       ========================================================= */
    static void printAlternatingBinaryTriangle(int n) {
        int toggle = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(toggle + " ");
            }
            System.out.println();
            toggle = 1 - toggle;
        }
    }
}
