package Task_30_01_2026.StringBuilder;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(reverseString(sb));
    }

    static String reverseString(StringBuilder sb){
        sb.reverse();
        return sb.toString();
    }
}
