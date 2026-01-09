package Task_09_01_26_CapgeminiQuestionList;

import java.util.Arrays;

public class RemoveDublicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4};
        int[] res =find(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] find(int[] arr){
        int count =0;
        int[] newArray =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    i++;
                    continue;
                }
            }
            newArray[count++]=arr[i];
        }
        int[] result =new int[count];
        for (int i = 0; i < count; i++) {
            result[i]=newArray[i];
        }
        return result;
    }
}
