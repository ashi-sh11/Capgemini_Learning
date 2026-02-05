package Task_05_02_2026.Exceptions.TryWithResourceswithMultipleResources;

import java.io.*;

public class FileMerger {

    public static void mergeFiles(String file1, String file2, String outputFile) {

        try (
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Files merged successfully.");

        } catch (IOException e) {
            System.out.println("File processing error: " + e.getMessage());
        }
    }
}
