package oopsbanner;

import java.util.HashMap;
import java.util.Map;

/**
 * UC-5: Use Map for Character Patterns and Render via Function
 *
 * This use case demonstrates how to use Java Collections (HashMap)
 * to store banner character patterns and render a banner word
 * using nested loops and StringBuilder.
 *
 * Key Concepts:
 * - HashMap for efficient character-pattern lookup
 * - StringBuilder for efficient string concatenation
 * - Static utility methods
 * - Separation of concerns between data and rendering logic
 *
 * Author: Ashish
 * Version: 5.0
 */
public class UseCase5 {

    /* =========================================================
       PART 1: UTILITY METHOD – BUILD CHARACTER PATTERN MAP
       ========================================================= */

    /**
     * Builds and returns a mapping of characters to their
     * corresponding ASCII banner patterns.
     *
     */
    private static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for letter 'O'
        patternMap.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        // Pattern for letter 'P'
        patternMap.put('P', new String[]{
                " ******  ",
                "**    ** ",
                "**    ** ",
                "**    ** ",
                "******  ",
                "**      ",
                "**      ",
                "**      "
        });

        // Pattern for letter 'S'
        patternMap.put('S', new String[]{
                " *****  ",
                "**      ",
                "**      ",
                " *****  ",
                "      **",
                "      **",
                "      **",
                " *****  "
        });

        return patternMap;
    }

    /* =========================================================
       PART 2: UTILITY METHOD – RENDER BANNER
       ========================================================= */

    /**
     * Renders the given word as a banner by fetching
     * patterns from the map and printing them row by row.
     *

     */
    private static void renderBanner(String word,
                                     Map<Character, String[]> map) {

        // Banner height derived from any one character pattern
        int height = map.get(word.charAt(0)).length;

        // Outer loop → iterate over rows
        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            // Inner loop → iterate over characters in word
            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[row])
                        .append("   "); // spacing between letters
            }

            System.out.println(line.toString());
        }
    }

    /* =========================================================
       PART 3: MAIN METHOD (ENTRY POINT)
       ========================================================= */

    /**
     * Entry point of the program.
     * Builds character pattern map and renders the OOPS banner.
     */
    public static void main(String[] args) {

        // Build character → pattern mapping
        Map<Character, String[]> patternMap =
                buildCharacterPatternMap();

        renderBanner("OOPS", patternMap);
    }
}
