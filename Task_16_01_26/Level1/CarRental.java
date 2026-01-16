package Task_16_01_26.Level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int perDayCost;

    CarRental(){
        this.customerName="Guest";
        this.carModel="Maruti Swift";
        this.rentalDays=1;
        this.perDayCost =899;
    }

    CarRental(String customerName , String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        setPerDayCost(carModel);
    }
    public  void setPerDayCost(String carModel){
        switch (carModel){
            case "Tata Punch" -> perDayCost = 1099;
            case "Kia Seltos"->perDayCost = 1299;
            case "Hyundai Creta"-> perDayCost = 1499;
            case "BMW 5 Series"-> perDayCost = 2199;
            default -> perDayCost =899;
        }
    }
    public int calculateRentalCost(){
        return rentalDays * perDayCost;
    }
}
