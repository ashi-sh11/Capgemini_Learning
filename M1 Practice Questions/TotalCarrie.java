package Task_09_03_2026;

public class TotalCarrie {
    static void main() {
//        int num1 = 123456789;
//        int num2 = 987654321;
        int num1 = 9999;
        int num2 = 1;
        System.out.println(findCarrie(num1,num2));
    }
    static int findCarrie(int num1,int num2){

        int carry =0;
        int carrycount =0;
        while (num1 !=0 || num2 != 0) {
            int rem1 = num1 % 10;
            int rem2 = num2 % 10;
            int sum = rem2 + rem1 + carry;
            carry = sum / 10;
            carrycount += carry;
            num2 /= 10;
            num1 /= 10;
        }
        return carrycount;
    }
}
