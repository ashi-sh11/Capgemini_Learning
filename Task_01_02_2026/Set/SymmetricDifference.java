package Task_01_02_2026.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
        // Copy sets
        Set<Integer> result = new HashSet<>(set1);

        // A − B
        result.removeAll(set2);

        // B − A
        Set<Integer> temp = new HashSet<>(set2);
        temp.removeAll(set1);

        // (A − B) ∪ (B − A)
        result.addAll(temp);

        System.out.println(result);
    }


}
