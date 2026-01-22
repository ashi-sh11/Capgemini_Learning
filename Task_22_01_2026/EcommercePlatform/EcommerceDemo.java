package Task_22_01_2026.EcommercePlatform;


import java.util.*;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }
}

class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order o) {
        System.out.println(name + " placed an order");
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Customer c = new Customer("Ashish");
        Order o = new Order();
        o.addProduct(new Product("Laptop"));
        c.placeOrder(o);
    }
}
