package Task_30_01_2026.BinarySearch;

public class RotationPoint {
    static int findRotationPoint(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end - start) / 2;

            if(arr[mid]>arr[end]){
                start =mid+1;
            }else {
                end=mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int index = findRotationPoint(arr);
        System.out.println("Rotation Point Index: " + index);
        System.out.println("Smallest Element: " + arr[index]);
    }
}

