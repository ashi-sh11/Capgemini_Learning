package Task_21_01_2026.Questions.RideHailingApp;


import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return vehicleId + " driven by " + driverName;
    }
}

class RideCar extends RideVehicle implements GPS {
    private String location;

    public RideCar(String id, String driver) {
        super(id, driver, 15);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class RideBike extends RideVehicle {
    public RideBike(String id, String driver) {
        super(id, driver, 10);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

class RideAuto extends RideVehicle {
    public RideAuto(String id, String driver) {
        super(id, driver, 12);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

public class RideHailingSystem {
    public static void main(String[] args) {

        List<RideVehicle> rides = List.of(
                new RideCar("CAR1", "Rahul"),
                new RideBike("BIKE1", "Aman"),
                new RideAuto("AUTO1", "Suresh")
        );

        for (RideVehicle v : rides) {
            System.out.println(v.getVehicleDetails() + " Fare: " + v.calculateFare(10));
        }
    }
}
