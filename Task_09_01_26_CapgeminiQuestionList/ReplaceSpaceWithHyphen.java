package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class ReplaceSpaceWithHyphen {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        StringBuilder result =new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                result.append('-');

            }
            else
                result.append(str.charAt(i));
        }
        System.out.println(result);
    }
}
