package Task_29_01_2026.AlgorithmsRuntimeAnalysis;

import java.util.Arrays;

public class SearchTarget {


    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] data = new int[n];

        for (int i = 0; i < n; i++)
            data[i] = i + 1;

        int target = n - 1;

        long start = System.nanoTime();
        linearSearch(data, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        binarySearch(data, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
