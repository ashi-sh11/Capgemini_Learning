package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr = {13,45,23,65,23,63,65};
        System.out.println("Second Largest Number in Array : "+findSecondLargest(arr));
    }

    private static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int ele :arr){
            if(ele>largest){
                secondLargest=largest;
                largest=ele;
            } else if (ele>secondLargest && ele !=largest) {
                secondLargest=ele;
            }
        }
        return secondLargest;
    }
}
