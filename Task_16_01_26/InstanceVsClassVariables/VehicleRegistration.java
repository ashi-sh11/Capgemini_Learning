package Task_16_01_26.InstanceVsClassVariables;

public class VehicleRegistration {
}

class Vehicle{
    static private int registrationFee =2999;
    private String ownerName;
    private String vehicleType;


    Vehicle(String ownerName , String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType= vehicleType;
    }
    static void updateRegistrationFee( int newFee){
        registrationFee= newFee;
    }
    public void displayVehicleDetails(){
        System.out.println("Owner Name       :  "+ownerName);
        System.out.println("Vehicle Type     :  "+ownerName);
        System.out.println("Registration Fee : ₹"+registrationFee);
        System.out.println("------------------------------");
    }
}
