package Task_16_01_26.Level1;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking(){
        this.guestName="Guest";
        this.roomType="Regular";
        this.nights=1;
    }

    HotelBooking(String guestName,String roomType, int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    HotelBooking(HotelBooking copyBooking){
        this.guestName=copyBooking.guestName;
        this.roomType=copyBooking.roomType;
        this.nights=copyBooking.nights;
    }
}
