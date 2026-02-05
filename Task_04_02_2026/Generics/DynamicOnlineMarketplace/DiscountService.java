package Task_04_02_2026.Generics.DynamicOnlineMarketplace;

class DiscountService {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double oldPrice = product.getPrice();
        double discount = oldPrice * (percentage / 100);
        product.setPrice(oldPrice - discount);
    }
}
