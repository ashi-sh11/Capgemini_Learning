package Task_19_01_2026.Inheritance;

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vs = new Vehicle[3];

         vs[0] = new Car(110,"petrol",5);
         vs[1]= new Truck(80,"diesel",55);
         vs[2] = new Motorcycle(90,"pertol",55);

        System.out.println("=== Vehicle Details ===");
        vs[0].displayInfo();
        System.out.println("--------------------");
        vs[1].displayInfo();
        System.out.println("--------------------");
        vs[2].displayInfo();
        System.out.println("--------------------");
    }
}
class Vehicle{
    public int maxSpeed;
    public String fuelType ;

    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed =maxSpeed;
        this.fuelType=fuelType;
    }

    public void displayInfo(){
        System.out.println("Max speed of Vehicle : "+maxSpeed);
        System.out.println("Fuel type of Vehicle : "+fuelType);
    }
}

class Car extends Vehicle{
    public int seatCapacity;

    public Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity);
    }
}


class Truck extends Vehicle{
    public int loadtCapacity;

    public Truck(int maxSpeed,String fuelType,int loadCapacity){
        super(maxSpeed,fuelType);
        this.loadtCapacity=loadCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity : "+loadtCapacity +" tons");
    }
}

class Motorcycle extends Vehicle{
    public int mileage;

    public Motorcycle(int maxSpeed,String fuelType,int mileage){
        super(maxSpeed,fuelType);
        this.mileage=mileage;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Mileage of bike is : "+mileage+" Kmph");
    }
}