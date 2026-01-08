package Task_08_01_26.String.Level1;

import java.util.Scanner;

public class CheckSubStringEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int startingIndex = input.nextInt();
        int endingIndex = input.nextInt();

        if (startingIndex<0 ||endingIndex>word.length())
            System.out.println("Please enter the valid index");

        String resultUsingChar = usingBuildInMethod(word,startingIndex,endingIndex);
        String resultUsingBuildIn = usingCharAtMethod(word,startingIndex,endingIndex);
        if(resultUsingChar.equals(resultUsingBuildIn))
            System.out.println("First substring  using build-In method \""+resultUsingBuildIn+"\" and second substring using charAt method \""+resultUsingChar+"\" are equal");
        else
            System.out.println("First substring  using build-In method \""+resultUsingBuildIn+"\" and second substring using charAt method \""+resultUsingChar+"\" are not equal");

    }

    private static String usingCharAtMethod(String word ,int startIndex ,int endingIndex) {
        String result ="";
        for(int i =startIndex ;i<endingIndex;i++){
            result +=word.charAt(i);
        }
        return result;
    }

    private static String usingBuildInMethod(String word,int startIndex ,int endingIndex) {
        String result =word.substring(startIndex,endingIndex);
        return result;
    }
}
