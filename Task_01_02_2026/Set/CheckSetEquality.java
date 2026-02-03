package Task_01_02_2026.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckSetEquality {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> b = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println(a.equals(b));
        System.out.println(funtion2(a,b));
    }
    static boolean funtion2(Set<Integer> set1,Set<Integer> set2){
        set1.removeAll(set2);// this will remove all the matching element from set1
        return set1.isEmpty();
    }
}
