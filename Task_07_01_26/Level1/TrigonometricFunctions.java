package Task_07_01_26.Level1;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle = input.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}
