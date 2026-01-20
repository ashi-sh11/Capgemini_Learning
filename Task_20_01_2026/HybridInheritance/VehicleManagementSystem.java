package Task_19_01_2026.HybridInheritance;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev =
                new ElectricVehicle("Tesla Model 3", 225, 75);

        PetrolVehicle pv =
                new PetrolVehicle("Hyundai Creta", 190, 50);

        System.out.println("=== Electric Vehicle ===");
        ev.displayDetails();
        ev.charge();

        System.out.println("\n=== Petrol Vehicle ===");
        pv.displayDetails();
        pv.refuel();
    }
}

class Vehicle {

    protected String model;
    protected int maxSpeed;


    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}
// Interface
interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {

    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle...");
        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
    }
}

 class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
        System.out.println("Fuel Tank Capacity : " + fuelTankCapacity + " liters");
    }
}
