package Task_29_01_2026.AlgorithmsRuntimeAnalysis;

import java.util.Random;

public class SortingLargeDataEfficiently {
    public static void main(String[] args) {
        int n = 10000;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(n);
            arr1[i] = arr2[i] = arr3[i] = value;
        }

        long start, end;

        start = System.nanoTime();
        BubbleSort.bubbleSort(arr1);
        end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        MergeSort.mergeSort(arr2, 0, n - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort Time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        QuickSort.quickSort(arr3, 0, n - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
class MergeSort {

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }
}
class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
