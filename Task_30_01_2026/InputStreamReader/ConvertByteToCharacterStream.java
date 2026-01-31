package Task_30_01_2026.InputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ConvertByteToCharacterStream {
    public static void main(String[] args) {
        String filePath ="/Users/ashish/Developer/Lab_java/src/Task_30_01_2026/InputStreamReader/data.xml";
        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line ;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e){

        }
    }
}
