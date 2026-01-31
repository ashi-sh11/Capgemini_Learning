package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class ReverseArrrayUsingTwoPointer{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int size = input.nextInt();
        int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= input.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed Array");
        display(arr);
    }
    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

