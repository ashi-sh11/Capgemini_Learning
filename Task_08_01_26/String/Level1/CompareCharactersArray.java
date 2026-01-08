package Task_08_01_26.String.Level1;

import java.util.Scanner;

public class CompareCharactersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        compareElementByelement(usingBuildInMethod(word),usingBuildInMethod(word));
    }

    private static void compareElementByelement(char[] chars, char[] chars1) {
        if(chars.length != chars1.length)
            System.out.println("Both characters array are not equal");
        boolean isEqual =true;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] !=chars1[i]){
                System.out.println("Both characters array are not equal");
                isEqual=false;
                break;
            }
        }
        if(isEqual)
            System.out.println("Both characters array are equal");
    }

    public static char[] usingForLoop(String word){
        int stringLength = word.length();
        char[] charArray = new char[stringLength];
        for (int i = 0; i < stringLength; i++) {
            charArray[i]=word.charAt(i);
        }
        return charArray;
    }
    public static char[] usingBuildInMethod(String word){
        char[] charArray = word.toCharArray();
        return charArray;
    }
}
