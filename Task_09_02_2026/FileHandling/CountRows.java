package Task_09_02_2026.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRows {
    static void main(String[] args) {

        String filePath = "students.csv";
        int count = 0;
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header row
            br.readLine();

            // Count remaining rows
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }

            System.out.println("Number of records (excluding header): " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
