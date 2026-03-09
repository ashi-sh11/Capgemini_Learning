package Task_09_03_2026;

public class MaxExponentOfTwo {
    static void main() {
        int start =7;
        int end =12;
        System.out.println(findMaxExponent(start,end));
    }
    static int findMaxExponent(int start ,int end){
        int maxExp =-1;
        int max = start;
        for (int i = start; i <=end;i++) {
            int n =i;
            int count =0;
            while(n%2==0) {
                count++;
                n /= 2;
            }
            if(count>maxExp){
                maxExp =count;
                max = i;
            }
        }
        return max;
    }
}
