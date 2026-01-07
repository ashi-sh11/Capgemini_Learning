package Task_07_01_26.Level2;


import java.util.Scanner;

public class TestUnitConvertor {

        private static final double KM_TO_MILES = 0.621371;
        private static final double MILES_TO_KM = 1.60934;
        private static final double METERS_TO_FEET = 3.28084;
        private static final double FEET_TO_METERS = 0.3048;

        public static double convertKmToMiles(double km) {
            return km * KM_TO_MILES;
        }

        public static double convertMilesToKm(double miles) {
            return miles * MILES_TO_KM;
        }

        public static double convertMetersToFeet(double meters) {
            return meters * METERS_TO_FEET;
        }

        public static double convertFeetToMeters(double feet) {
            return feet * FEET_TO_METERS;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(convertKmToMiles(number));
        System.out.println(convertMilesToKm(number));
        System.out.println(convertMetersToFeet(number));
        System.out.println(convertFeetToMeters(number));
    }
}
