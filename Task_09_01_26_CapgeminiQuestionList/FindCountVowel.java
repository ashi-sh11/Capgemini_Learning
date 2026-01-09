package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class FindCountVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        st=st.toLowerCase();
        int countVowel=0;
        for(int i=0;i<st.length();i++){
            String ch  = ""+st.charAt(i);
            if("aeiou".contains(ch)){
                countVowel++;
            }
        }
        System.out.println(countVowel);
    }
}

