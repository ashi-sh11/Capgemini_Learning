package Task_01_02_2026.List;

import java.util.*;

public class RotateList {

    public static <T> List<T> rotateList(List<T> list, int k) {
        int n = list.size();
        k = k % n;

        List<T> rotated = new ArrayList<>();

        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> rotated = rotateList(numbers, 2);
        System.out.println(rotated);
    }
}
