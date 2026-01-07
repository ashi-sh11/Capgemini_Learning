package Task_07_01_26.Level1;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature = input.nextInt();
        int windSpeed = input.nextInt();

        double result = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + result);

    }
    static double calculateWindChill(double temperature, double windSpeed){
        double result =35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
        return result;
    }
}
