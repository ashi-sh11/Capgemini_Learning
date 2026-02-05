package Task_05_02_2026.Exceptions.TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                System.out.println("Reading file: " + path);
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
                System.out.println(e.getMessage());
            }
            System.out.println("----------");
        }
    }

    public static void main(String[] args) {

        FileProcessor processor = new FileProcessor();

        processor.processFiles(
                Arrays.asList("/Users/ashish/Developer/Lab_java/src/Task_05_02_2026/Exceptions/TryWithResources/file1.txt", "file2.txt", "file3.txt")
        );
    }
}
