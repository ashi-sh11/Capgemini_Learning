package Task_15_01_26.Level1;

public class PhoneDetails {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 74999);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 79999);

        phone1.displayDetails();
        System.out.println(" Second Object ");
        phone2.displayDetails();
    }
}

class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }
}

