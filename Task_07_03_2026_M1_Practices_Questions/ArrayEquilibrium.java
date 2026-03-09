package Task_07_03_2026_M1_Practices_Questions;

public class ArrayEquilibrium {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,3};
        System.out.println(findEquilibrium(arr));
    }

    static int findEquilibrium(int[] arr){
        int totalSum = 0;
        for(int num : arr)
            totalSum += num;
        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum)
                return i;
            leftSum += arr[i];
        }
        return -1;
    }
}