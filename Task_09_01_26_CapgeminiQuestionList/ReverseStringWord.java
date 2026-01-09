package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class ReverseStringWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        String result ="";
        String[] stringArray =st.split(" ");
        for(String ele : stringArray){
            int end =ele.length()-1;
            String str ="";
            while(0<=end){
                str+=st.charAt(end);
                end--;
            }
            result+=str+" ";
        }
        System.out.println(result);
    }
}
