package Task_09_01_26_CapgeminiQuestionList;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int k = input.nextInt();
        int[] arr ={1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(arr,k)));
    }
    static int[] rotate(int[] arr,int k){
        k =k% arr.length;
        int[] temp = new int[arr.length];
        int j =0;
        for (int i = k; i < arr.length; i++) {
            temp[j++]=arr[i];
        }
        for (int i = 0; i < k; i++) {
            temp[j++]=arr[i];
        }
        return temp;
    }
}

