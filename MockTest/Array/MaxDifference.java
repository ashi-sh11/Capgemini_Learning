package MockTest.Array;

public class MaxDifference {
    static void main() {
        int[] arr = {2,7,3,1,9};
        System.out.println(findMaxDiff(arr));
    }

    public static int findMaxDiff(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j>i){
                    max= Math.max(max,arr[j]-arr[i]);
                }
            }
        }
        return max;
    }
}
