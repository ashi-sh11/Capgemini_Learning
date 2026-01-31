package Task_30_01_2026.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrence {
    public static void main(String[] args) {
        String filePath = "/Users/ashish/Developer/Lab_java/src/Task_30_01_2026/FileReader/text.txt";
        String targetWord = "Ashish";
        int count=0;
        try {
            FileReader fr  = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line=br.readLine())!=null){
                if(!line.trim().isEmpty()){
                    String[] arr = line.split("\\s+");
                    for(String ele : arr){
                        if(ele.equalsIgnoreCase(targetWord)) count++;
                    }
                }
            }
            System.out.println("Word \""+targetWord +"\" occurred "+count+" times.");
        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

