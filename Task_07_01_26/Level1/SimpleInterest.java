package Task_07_01_26.Level1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principleAmount = input.nextInt();
        int rateOfInterest = input.nextInt();
        int time = input.nextInt();
        calculateSimpleInterest(principleAmount,rateOfInterest,time);
    }

    static void calculateSimpleInterest(int principleAmount, int rateOfInterest, int time) {
        double simpleInterest =0.0;
        simpleInterest = (principleAmount * rateOfInterest * time) /100;
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "
                +principleAmount+", Rate of Interest "+rateOfInterest+" and Time "+time);
    }
}
