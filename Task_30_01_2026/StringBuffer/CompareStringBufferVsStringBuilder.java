package Task_30_01_2026.StringBuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompareStringBufferVsStringBuilder {
    static String buffer(){
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sBuffer.append("Hello");
        }
        return sBuffer.toString();
    }

    static String builder(){
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sBuilder.append("Hello");
        }
        return sBuilder.toString();
    }

    static void readFile(){
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
    public static void main(String[] args) {
        long startBuffer = System.nanoTime();
        buffer();
        long endBuffer = System.nanoTime();

        long startBuilder = System.nanoTime();
        builder();
        long endBuilder = System.nanoTime();
        System.out.println("Time Taken by StringBuffer : "+(endBuffer-startBuffer)/1_000_000.0 +" ms" );
        System.out.println("Time Taken by StringBuilder : "+(endBuilder-startBuilder)/1_000_000.0 +" ms" );

        long startRead = System.nanoTime();
        readFile();
        long endRead = System.nanoTime();
        System.out.println("InputStreamReader Word Count : "+(endRead-startRead)/1_000_000.0 +" ms" );


    }
}
