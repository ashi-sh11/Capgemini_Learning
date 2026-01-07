package Task_07_01_26.Level2;

import java.util.Scanner;

public class TestUnitConvertor3 {
    public class UnitConvertor {

        public static double convertFarhenheitToCelsius(double farhenheit) {
            return (farhenheit - 32) * 5 / 9;
        }

        public static double convertCelsiusToFarhenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        public static double convertPoundsToKilograms(double pounds) {
            return pounds * 0.453592;
        }

        public static double convertKilogramsToPounds(double kilograms) {
            return kilograms * 2.20462;
        }

        public static double convertGallonsToLiters(double gallons) {
            return gallons * 3.78541;
        }

        public static double convertLitersToGallons(double liters) {
            return liters * 0.264172;
        }
    }

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = input.nextDouble();
                System.out.println("Fahrenheit → Celsius = "
                        + UnitConvertor.convertFarhenheitToCelsius(fahrenheit));

                System.out.print("\nEnter temperature in Celsius: ");
                double celsius = input.nextDouble();
                System.out.println("Celsius → Fahrenheit = "
                        + UnitConvertor.convertCelsiusToFarhenheit(celsius));

                System.out.print("\nEnter weight in Pounds: ");
                double pounds = input.nextDouble();
                System.out.println("Pounds → Kilograms = "
                        + UnitConvertor.convertPoundsToKilograms(pounds));

                System.out.print("\nEnter weight in Kilograms: ");
                double kilograms = input.nextDouble();
                System.out.println("Kilograms → Pounds = "
                        + UnitConvertor.convertKilogramsToPounds(kilograms));

                System.out.print("\nEnter volume in Gallons: ");
                double gallons = input.nextDouble();
                System.out.println("Gallons → Liters = "
                        + UnitConvertor.convertGallonsToLiters(gallons));

                System.out.print("\nEnter volume in Liters: ");
                double liters = input.nextDouble();
                System.out.println("Liters → Gallons = "
                        + UnitConvertor.convertLitersToGallons(liters));
    }
}
