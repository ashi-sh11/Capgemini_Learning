package Task_04_02_2026.Generics.SmartWarehouseManagementSystem;

import java.util.List;

public class WarehouseApp {
    public static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(
                    item.getName() + " (" + item.getCategory() + ")"
            );
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Phone"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        displayItems(electronicsStorage.getItems());
        displayItems(groceryStorage.getItems());
        displayItems(furnitureStorage.getItems());
    }
}
