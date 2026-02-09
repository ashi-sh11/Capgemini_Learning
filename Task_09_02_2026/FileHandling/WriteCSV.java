package Task_09_02_2026.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
     static void main(String[] args) {

        String fileName = "employees.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            // Write header
            writer.append("ID,Name,Department,Salary\n");

            // Write employee records
            writer.append("1,Alice,HR,45000\n");
            writer.append("2,Bob,IT,55000\n");
            writer.append("3,Charlie,Finance,60000\n");
            writer.append("4,David,Marketing,48000\n");
            writer.append("5,Eva,Operations,52000\n");

            System.out.println("Employee data written successfully to " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}