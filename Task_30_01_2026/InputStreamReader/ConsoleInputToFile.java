package Task_30_01_2026.InputStreamReader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputToFile {
    public static void main(String[] args) {
        String filePath ="/Users/ashish/Developer/Lab_java/src/Task_30_01_2026/InputStreamReader/InputFile.txt";

        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            FileWriter fw = new FileWriter(filePath);

            String inputLine;

            System.out.println("Enter text (type 'exit' to stop):");

            while (true){
                inputLine=br.readLine();
                if(inputLine.equalsIgnoreCase("exit")) break;
                fw.write(inputLine );
            }
            fw.close();
            br.close();
            System.out.println("Input saved to file successfully.");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
