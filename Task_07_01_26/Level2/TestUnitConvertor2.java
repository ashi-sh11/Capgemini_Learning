package Task_07_01_26.Level2;

import java.util.Scanner;

public class TestUnitConvertor2 {

    public class UnitConvertor {

        private static final double YARDS_TO_FEET = 3;
        private static final double FEET_TO_YARDS = 0.333333;
        private static final double METERS_TO_INCHES = 39.3701;
        private static final double INCHES_TO_METERS = 0.0254;
        private static final double INCHES_TO_CM = 2.54;

        public static double convertYardsToFeet(double yards) {
            return yards * YARDS_TO_FEET;
        }

        public static double convertFeetToYards(double feet) {
            return feet * FEET_TO_YARDS;
        }

        public static double convertMetersToInches(double meters) {
            return meters * METERS_TO_INCHES;
        }

        public static double convertInchesToMeters(double inches) {
            return inches * INCHES_TO_METERS;
        }

        public static double convertInchesToCentimeters(double inches) {
            return inches * INCHES_TO_CM;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(UnitConvertor.convertYardsToFeet(number));
        System.out.println(UnitConvertor.convertFeetToYards(number));
        System.out.println(UnitConvertor.convertMetersToInches(number));
        System.out.println(UnitConvertor.convertInchesToMeters(number));
        System.out.println(UnitConvertor.convertInchesToCentimeters(number));
    }
}
