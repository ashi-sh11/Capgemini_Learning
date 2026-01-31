package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class removeSpecialCharacter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("First method");
        System.out.println(removeSpecial(str));
        System.out.println("Second method");
        System.out.println(removeSpecial2(str));
    }

    static String removeSpecial(String str){
        return str.replaceAll("[^a-zA-Z0-9 s]","");
    }
    static String removeSpecial2(String str ){
        StringBuilder sb = new StringBuilder();
        String[] stringArray = str.split(" ");
        for (String s :stringArray){
            String res ="";
            for (int i = 0; i < s.length(); i++) {
                if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') ||(s.charAt(i)>='0' && s.charAt(i)<='9')){
                    res =res+s.charAt(i);
                }
            }
            sb.append(res).append(" ");
        }
        return sb.toString().trim();
    }
}
