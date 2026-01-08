package Task_08_01_26.Exception;

import java.lang.Exception;

public class Exception2 {
    public static void main(String[] args) {
        try {
            java.io.File file = new java.io.File("file.txt");
            java.util.Scanner sc = new java.util.Scanner(file);
        } catch (java.io.IOException e) {
            System.out.println("IOException occurred"+ e.getMessage());
        }  catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
