package Task_08_01_26.String.Level1;

public class ASCIIValue {
    public static void main(String[] args) {
        String text = "AaBb";
        int[][] charASCIIValues = findASCIIValues(text.trim());
        displayASCIIValues(text, charASCIIValues);
    }

    private static void displayASCIIValues(String text, int[][] value) {

        for (int i = 0; i < text.length(); i++) {
            System.out.print((char)value[i][0] );
            System.out.println("\t"+value[i][1]);
        }
    }

    private static int[][] findASCIIValues(String text) {
        int[][] value = new int[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            value[i][0] = text.charAt(i);
            value[i][1] = text.charAt(i);
        }
        return value;
    }
}
