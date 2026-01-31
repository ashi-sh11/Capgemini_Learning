package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr ={1,3,5,4};
        System.out.println("Missing Number is "+findMissing(arr));
    }

    static int findMissing(int[] arr){
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int arrSum=0;
        for (int i = 0; i <n-1; i++) {
            arrSum +=arr[i];
        }
        return totalSum-arrSum;
    }
}
