package Task_05_02_2026.Exceptions.CheckedAndUncheckedExceptions;

import java.io.IOException;

class DataProcessor {

    public static void processData(String data)
            throws IOException {

        if (data == null) {
            throw new IOException("Data is missing");   // Checked
        }
        if (data.length() < 5) {
            throw new IllegalArgumentException("Data too short"); // Unchecked
        }
        System.out.println("Data processed successfully");
    }
}
