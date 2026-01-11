package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(capitalize(str));
    }
    static String capitalize(String str){
        StringBuilder sb = new StringBuilder();
        String[] stringArray = str.split(" ");
        String res ="";
        for (String s :stringArray){
            res =s.substring(0,1).toUpperCase();
            sb.append(res).append(s.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
