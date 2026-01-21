package Task_21_01_2026.Questions;

import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.5;
    }

    public double calculateInsurance() {
        return 1200;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car("CAR101", 2000),
                new Bike("BIKE201", 800),
                new Truck("TRK301", 4000)
        );

        for (Vehicle v : vehicles) {
            double rent = v.calculateRentalCost(3);
            double insurance = v instanceof Insurable ? ((Insurable) v).calculateInsurance() : 0;
            System.out.println(v.getType() + " Total Cost : " + (rent + insurance));
        }
    }
}
