package Task_21_01_2026.Questions;

import java.util.*;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return itemName;
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return price * quantity - applyDiscount();
    }

    public double applyDiscount() {
        return price * quantity * 0.1;
    }

    public String getDiscountDetails() {
        return "10% Veg Discount";
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return price * quantity + 50;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = List.of(
                new VegItem("Paneer", 200, 2),
                new NonVegItem("Chicken", 300, 1)
        );

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails() + " Total: " + item.calculateTotalPrice());
        }
    }
}
