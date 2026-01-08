package Task_08_01_26.String.Level1;

public class NullPointerDemo {

    public static void main(String[] args) {

        System.out.println("---- Generating NullPointerException ----");
        generateException(); // this will crash the program

        System.out.println("\n---- Handling NullPointerException ----");
        handleException();
    }

    // Method 1: Generates NullPointerException
    public static void generateException() {

        String text = null;
        System.out.println(text.length());
    }

    // Method 2: Handles NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught: You tried to use a null object.");
        }
    }
}
