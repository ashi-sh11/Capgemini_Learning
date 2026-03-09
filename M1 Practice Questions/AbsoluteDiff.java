package Task_09_03_2026;

public class AbsoluteDiff {
    static void main() {
        int[] arr = {12 ,3, 14 ,56,77 ,13};
        int num = 13;
        int diff =2;
        System.out.println(findCount(arr,num,diff));
    }
    static int findCount(int arr[], int num, int diff){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]-num)<=diff)count++;
        }
        if (count ==0) return -1;
        return count;
    }
}


