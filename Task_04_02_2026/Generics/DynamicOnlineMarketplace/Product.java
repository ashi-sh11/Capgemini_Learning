package Task_04_02_2026.Generics.DynamicOnlineMarketplace;

public class Product <T extends Category>{
    private String productName ;
    private double price;
    private T category;

    public Product(String productName , double price,T category){
        this.productName=productName;
        this.price=price;
        this.category=category;

    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getProductNameName() {
        return productName;
    }
    public T getCategory() {
        return category;
    }
}
