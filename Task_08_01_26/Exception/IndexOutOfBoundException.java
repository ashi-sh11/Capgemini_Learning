package Task_08_01_26.Exception;

import java.util.Scanner;

public class IndexOutOfBoundException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String str1 =input.next();
        System.out.print("Enter a index: ");
        int index =input.nextInt();
        System.out.println("---- Generating NullPointerException ----");
        System.out.println(genrateException(str1,index)); // This will crash the program

        System.out.println("------Handling NullPointerException ------");
        handleException(str1,index);
    }

    private static char genrateException(String str1, int index) {
        return str1.charAt(index);
    }

    private static void handleException(String str1, int index) {
        char ch ;
        try {
            ch=str1.charAt(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
