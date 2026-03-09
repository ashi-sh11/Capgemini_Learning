package Task_07_03_2026_M1_Practices_Questions;

public class FindCount {

    public static void main(String[] args) {
        int[] arr={12,3,14,56,77,13};
        System.out.println(findCount(arr,arr.length,13,2));
    }
    static int findCount(int[] arr,int length,int num,int diff){
        int count=0;
        for(int i=0;i<length;i++){
            if(Math.abs(arr[i]-num)<=diff)
                count++;
        }
        if(count==0)
            return -1;
        return count;
    }
}