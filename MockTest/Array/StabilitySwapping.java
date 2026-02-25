package MockTest.Array;

import java.util.Arrays;

public class StabilitySwapping {
    static void main() {
        int[] arr = {5,2,9,1,6};
        swapping(arr);
        System.out.println("First Output : "+Arrays.toString(arr));
        int[] arr1={6,5,2,5,1};
        swapping(arr1);
        System.out.println("Second Output : "+Arrays.toString(arr1));
    }
    public static void swapping(int[] arr){
        for (int i = 0; i < arr.length-1; i=i+2) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
        }
    }
}
