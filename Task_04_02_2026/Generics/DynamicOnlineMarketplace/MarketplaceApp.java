package Task_04_02_2026.Generics.DynamicOnlineMarketplace;


public class MarketplaceApp {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Basics", 500, new BookCategory());

        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 20000, new GadgetCategory());

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(shirt, 20);
        DiscountService.applyDiscount(phone, 5);

        System.out.println(book.getProductNameName() + " - " + book.getPrice());
        System.out.println(shirt.getProductNameName() + " - " + shirt.getPrice());
        System.out.println(phone.getProductNameName() + " - " + phone.getPrice());
    }
}
