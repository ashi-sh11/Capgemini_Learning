package Task_18_01_2026.Questions;

public class ShoppingCartSystem {
}

class Product {
    private static double discount = 10.0;
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        }
    }

    public double calculateTotalCost() {
        double total = price * quantity;
        double discountAmount = total * discount / 100;
        return total - discountAmount;
    }

    public void displayProductDetails() {
        System.out.println("Product ID   : " + productID);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Discount     : " + discount + "%");
        System.out.println("Final Cost   : ₹" + calculateTotalCost());
    }

    public static void processIfValidProduct(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            product.displayProductDetails();
        } else {
            System.out.println("Invalid object. Not a Product.");
        }
    }
}
