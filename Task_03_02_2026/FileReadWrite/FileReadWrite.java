package Task_03_02_2026.FileReadWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileReadWrite {
    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        File file = new File(sourceFile);

        if (!file.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
