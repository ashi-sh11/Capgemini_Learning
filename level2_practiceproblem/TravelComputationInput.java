package level2_practiceproblem;

import java.util.Scanner;

public class TravelComputationInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();

        double distanceFromToVia = input.nextDouble();
        double distanceViaToFinalCity = input.nextDouble();

        int timeFromToVia = input.nextInt();
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println(
                "The Total Distance travelled by " + name +
                        " from " + fromCity +
                        " to " + toCity +
                        " via " + viaCity +
                        " is " + totalDistance +
                        " miles and Total Time taken is " +
                        totalTime + " minutes"
        );

    }
}
