package MockTest.Array;

public class BalanceSplit {
    static void main() {
        int[] arr = {1,2,3,4,10};
        System.out.println("First output : "+(isBalance(arr)?"Yes":"No"));
        int[] arr1 = {2,1,1,2,1};
        System.out.println("Second output : "+(isBalance(arr1)?"Yes":"No"));
    }
    public static boolean isBalance(int[] arr){
        int start =0,end=arr.length-1;
        int leftSum =0,rightSum=0;
        leftSum+=arr[start++];

        while (start<=end){
            if(leftSum>rightSum){
                rightSum+=arr[end];
                end--;
            }
            else{
                leftSum+=arr[start];
                start++;
            }
        }
        return leftSum == rightSum;
    }
}
