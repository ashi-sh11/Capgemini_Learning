package Task_07_03_2026_M1_Practices_Questions;

public class RatsFood {
    public static void main(String[] args) {
        int r=7;
        int unit=2;
        int[] arr={2,8,3,5,7,4,1,2};
        System.out.println(foodRequired(r,unit,arr));
    }

    static int foodRequired(int r,int unit,int[] arr){
        if(arr==null)
            return -1;
        int foodNeeded=r*unit;
        int sum=0;
        for(int i=0;i<arr.length;i++){

            sum += arr[i];

            if(sum>=foodNeeded)
                return i+1;
        }
        return 0;
    }
}