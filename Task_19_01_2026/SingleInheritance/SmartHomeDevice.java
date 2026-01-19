package Task_19_01_2026.SingleInheritance;

public class SmartHomeDevice {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("THERMO-101", true, 22.5f);

        System.out.println("=== Smart Home Device Status ===");
        thermostat.displayStatus();
    }
}

class Device{
    String deviceId;
    boolean status;

    Device(String deviceId ,boolean status){
        this.deviceId=deviceId;
        this.status=status;
    }

    public void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + (status ? "ON" : "OFF"));
    }
}

class Thermostat extends Device{
    float temperatureSetting;

     Thermostat(String deviceId , boolean status,float temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}