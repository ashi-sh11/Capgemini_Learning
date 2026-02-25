package MockTest.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddIndex {
    static void main() {
        int[] arr = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(rotateEven(arr)));
    }

    public static int[] rotateEven(int[] arr){
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0) li.add(arr[i]);
        }
        int j =0;
        arr[0]=li.get(li.size()-1);
        for (int i = 1; i < arr.length; i++) {
            if (i%2==0){
                arr[i]=li.get(j++);
            }
        }
        return arr;
    }
}
