package Task_09_02_2026.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {
     static void main(String[] args) {

        String filePath = "/Users/ashish/Developer/Lab_java/src/Task_09_02_2026/FileHandling/students.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();

            System.out.println("Students scoring more than 80 marks:");
            System.out.println("------------------------------------");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println("ID    : " + data[0]);
                    System.out.println("Name  : " + data[1]);
                    System.out.println("Age   : " + data[2]);
                    System.out.println("Marks : " + marks);
                    System.out.println("--------------------");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}