package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class PrintASCIIValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        printASCII(str);

    }
    static void printASCII(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch==' ') continue;
            System.out.println("ASCII value of "+(ch)+" is "+(int)ch);
        }
    }
}
