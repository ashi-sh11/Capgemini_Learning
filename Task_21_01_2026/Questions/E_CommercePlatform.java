package Task_21_01_2026.Questions;
import java.util.ArrayList;
import java.util.List;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "GST 18%";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "GST 5%";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class E_CommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Jacket", 4000));
        products.add(new Groceries(3, "Rice Bag", 1200));

        for (Product product : products) {
            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }
            double finalPrice = product.getPrice() + tax - product.calculateDiscount();
            System.out.println(product.getName() + " Final Price : INR " + finalPrice);
        }
    }
}
