package oopsbanner;

/**
 * UC-2: Render OOPS as ASCII Banner
 *
 * This class demonstrates how to render a predefined
 * ASCII banner using a 1D String array.
 *
 * Each element of the array represents one row
 * of the banner. The banner is printed line by line
 * using an enhanced for-loop.
 *
 * Author: Ashish
 * Version: 2.0
 */
public class UseCase2 {

    /**
     * Entry point of the program.
     * Prints the OOPS banner to the console.
     */
    public static void main(String[] args) {

        // Banner data: each string represents one row
        String[] oopsBanner = buildOopsBanner();

        // Render banner
        for (String line : oopsBanner) {
            System.out.println(line);
        }
    }

    /* =========================================================
       UTILITY METHOD: BANNER DEFINITION
       ========================================================= */

    /**
     * Builds and returns the OOPS banner pattern.
     *
     */
    private static String[] buildOopsBanner() {
        return new String[] {
                "   ***       ***     ******       ***** ",
                " **   **   **   **   **    **   **    ",
                "**     ** **     **  **    **   **    ",
                "**     ** **     **  **    **   **    ",
                "**     ** **     **  *******     *** ",
                "**     ** **     **  **              **",
                "**     ** **     **  **              **",
                " **   **   **   **   **              **",
                "  ***      ***      **          ***** "
        };
    }
}
