package Task_08_01_26.String.Level2;

import java.util.Scanner;

public class LengthWithoutInBuildFuntion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String str1 =input.next();
        findLengthWithoutFunction(str1);
    }
    static void findLengthWithoutFunction(String str){
        int index =0;
        try{
            while (true){
                str.charAt(index);
                index++;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Length of the string without build-In funtion : "+index);
        }
    }
}
