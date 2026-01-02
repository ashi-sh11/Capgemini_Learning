package level2_practiceproblem;

import java.util.Scanner;

public class PoundsToKilograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weightInPounds = input.nextDouble();
        double weightInKg = weightInPounds / 2.2;

        System.out.println(
                "The weight of the person in pound is " +
                        weightInPounds +
                        " and in kg is " + weightInKg
        );

    }
}

