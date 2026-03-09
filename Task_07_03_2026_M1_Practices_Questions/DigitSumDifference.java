package Task_07_03_2026_M1_Practices_Questions;

public class DigitSumDifference {

    public static void main(String[] args) {
        System.out.println(DigitSumDifference(50,120));
    }
    static int DigitSumDifference(int m,int n){
        int sum4=0;
        int sum7=0;
        for(int i=m;i<=n;i++){
            if(i%4==0)
                sum4 += digitSum(i);
            if(i%7==0)
                sum7 += digitSum(i);
        }
        return Math.abs(sum4-sum7);
    }
    static int digitSum(int num){
        int sum=0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}