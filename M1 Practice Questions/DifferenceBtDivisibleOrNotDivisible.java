package Task_09_03_2026;

public class DifferenceBtDivisibleOrNotDivisible  {
    static void main() {
        int n =3;
        int m =10;
        System.out.println(findDiffernce(n,m));
    }
    static int findDiffernce(int n ,int m){
        int divisibleSum =0,notDivisibleSum =0;
        for (int i = 1; i <=m; i++) {
            if(i % n==0) divisibleSum +=i;
            else notDivisibleSum +=i;
        }
        return notDivisibleSum-divisibleSum;
    }
}
