package oopsbanner;

/**
 * UC-3: Modular Banner Construction
 *
 * This use case demonstrates how to construct the OOPS banner
 * using modular methods. Each letter pattern is defined in a
 * separate method, improving readability, reusability, and
 * maintainability.
 *
 * OOPS Concepts Used:
 * - Modularity
 * - Encapsulation
 * - Abstraction
 * - DRY Principle
 *
 * Author: Ashish
 * Version: 3.0
 */
public class UseCase3 {

    /**
     * Entry point of the program.
     * Builds individual character patterns and composes
     * them to render the OOPS banner.
     */
    public static void main(String[] args) {

        // Fetch individual letter patterns
        String[] firstO  = getOPattern();
        String[] secondO = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Render banner line by line
        for (int row = 0; row < firstO.length; row++) {
            System.out.println(
                    firstO[row]  + "   " +
                            secondO[row] + "   " +
                            pPattern[row] + "   " +
                            sPattern[row]
            );
        }
    }

    /* =========================================================
       CHARACTER PATTERN DEFINITIONS
       ========================================================= */

    /**
     * Builds the pattern for letter 'O'.
     *
     */
    private static String[] getOPattern() {
        return new String[] {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }

    /**
     * Builds the pattern for letter 'P'.
     *
     */
    private static String[] getPPattern() {
        return new String[] {
                " ******  ",
                "**    ** ",
                "**    ** ",
                "**    ** ",
                "******  ",
                "**      ",
                "**      ",
                "**      "
        };
    }

    /**
     * Builds the pattern for letter 'S'.
     *
     */
    private static String[] getSPattern() {
        return new String[] {
                "  *****  ",
                "**      ",
                "**      ",
                " *****  ",
                "      **",
                "      **",
                "      **",
                " *****  "
        };
    }
}
