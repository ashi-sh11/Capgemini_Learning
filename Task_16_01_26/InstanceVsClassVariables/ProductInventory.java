package Task_16_01_26.InstanceVsClassVariables;

public class ProductInventory {
    public static void main(String[] args) {
        Product ps = new Product("oats",139);
        Product ps12 = new Product("Sugar",50);
        Product ps1 = new Product("Brush",23);
        Product ps3 = new Product("Mango",100);
        ps3.displayProductDetails();
        Product.displayTotalProduct();
    }
}

class Product {
    private String productName ;
    private int price;
    static int totalProducts;

    Product(String productName,int price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    public void displayProductDetails(){
        System.out.println("Product name : "+productName+" and price :"+price);
    }
    static void displayTotalProduct(){
        System.out.println("Total Product is : "+totalProducts);
    }
}
