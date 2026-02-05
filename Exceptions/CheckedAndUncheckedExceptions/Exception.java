package Task_05_02_2026.Exceptions.CheckedAndUncheckedExceptions;

import java.io.IOException;

public class Exception {
    public static void main(String[] args) {

        try {
            DataProcessor.processData("Hi");
        }
        catch (IOException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }
}
