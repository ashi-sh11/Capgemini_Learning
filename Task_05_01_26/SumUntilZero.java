package Task_05_01_26;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum =0.0;
        double number =0.0;
        while(true){
            number=input.nextDouble();
            if(number==0){
                break;
            }
            sum+=number;
        }
        System.out.println("The sum is " + sum);
    }
}
