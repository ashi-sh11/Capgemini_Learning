package Task_30_01_2026.LinearSearch;

public class FirstNegativeNumber {
    static int firstNegative(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={14,4,1,0,53,56,-1,6,-2,62,1};
        System.out.println("Index of first negative number is : " +firstNegative(arr));
    }
}
