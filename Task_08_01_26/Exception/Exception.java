package Task_08_01_26.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("data.txt");
        }catch (FileNotFoundException e){
            System.out.println("This is the exception msg "+e.getMessage());
            System.out.println("This is the exception msg "+e);
        }

    }
}
