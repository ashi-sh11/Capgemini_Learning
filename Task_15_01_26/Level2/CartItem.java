package Task_15_01_26.Level2;

public class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " item(s) added to cart.");
        }
    }

    public void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed from cart.");
        } else {
            System.out.println("Invalid quantity to remove.");
        }
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayCartDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : ₹" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total     : ₹" + calculateTotalCost());
    }
}
