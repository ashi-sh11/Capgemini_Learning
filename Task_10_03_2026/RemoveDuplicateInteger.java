package Task_10_03_2026;

import java.util.*;


public class RemoveDuplicateInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,1,5};
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);
    }
}