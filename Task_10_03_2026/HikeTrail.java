package Task_10_03_2026;

public class HikeTrail {
    static void main() {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(findSummit(arr));
    }
    static int findSummit(int[] arr){
        int max =Integer.MIN_VALUE;
        for (int ele :arr){
            if(ele>max ) max = ele;
        }
        return max;
    }
}
