package oopsbanner;

/**
 * UC-4: Store Character Pattern in a Class
 *
 * This use case demonstrates how to encapsulate
 * banner character patterns inside a dedicated
 * inner class and separate data from rendering logic.
 *
 * OOPS Principles Applied:
 * - Encapsulation
 * - Modularity
 * - Abstraction
 * - Immutability
 * - Single Responsibility Principle
 * - Separation of Concerns
 *
 * Author: Ashish
 * Version: 4.0
 */
public class UseCase4 {

    /* =========================================================
       PART 1: INNER CLASS (DATA HOLDER)
       ========================================================= */

    /**
     * Inner class that encapsulates a banner character
     * and its corresponding pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }


        public char getCharacter() {
            return character;
        }

        /**
         * @return pattern rows for the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /* =========================================================
       PART 2: CHARACTER PATTERN DEFINITIONS
       ========================================================= */

    /**
     * Pattern for letter 'O'
     */
    private static String[] getOPattern() {
        return new String[]{
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
     * Pattern for letter 'P'
     */
    private static String[] getPPattern() {
        return new String[]{
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
     * Pattern for letter 'S'
     */
    private static String[] getSPattern() {
        return new String[]{
                "  ***** ",
                "**      ",
                "**      ",
                " *****  ",
                "      **",
                "      **",
                "      **",
                " *****  "
        };
    }

    /* =========================================================
       PART 3: UTILITY METHOD (ABSTRACTION)
       ========================================================= */

    /**
     * Retrieves the pattern for a given character
     * from an array of CharacterPatternMap objects.
     *
     */
    private static String[] getCharacterPattern(
            CharacterPatternMap[] maps, char ch) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[0];
    }

    /* =========================================================
       PART 4: MAIN METHOD (RENDERING LOGIC)
       ========================================================= */

    /**
     * Entry point of the program.
     * Builds character objects and renders the OOPS banner.
     */
    public static void main(String[] args) {

        // Array of objects holding character-pattern mapping
        CharacterPatternMap[] characters = {
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };

        // Fetch patterns using abstraction
        String[] firstO  = getCharacterPattern(characters, 'O');
        String[] secondO = getCharacterPattern(characters, 'O');
        String[] pPattern = getCharacterPattern(characters, 'P');
        String[] sPattern = getCharacterPattern(characters, 'S');

        for (int row = 0; row < firstO.length; row++) {
            System.out.println(
                    firstO[row]  + "   " +
                            secondO[row] + "   " +
                            pPattern[row] + "   " +
                            sPattern[row]
            );
        }
    }
}
