package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(removeVowel(str));
    }
    static String removeVowel(String st){
        String[] arrString = st.split(" ");
        StringBuilder finalResult = new StringBuilder();
        for (String ele :arrString){
            String res ="";
            for (int i = 0; i < ele.length(); i++) {
                if("aeiou".contains(""+ele.charAt(i)) || "AEIOU".contains(""+ele.charAt(i))){
                    continue;
                }
                else {
                    res =res+ele.charAt(i);
                }
            }
            finalResult.append(res).append(" ");
        }
        return  finalResult.toString();
    }
}
