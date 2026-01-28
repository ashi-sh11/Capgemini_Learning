package Task_28_01_2026.Singly_LinkedList.InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        InventoryList inv = new InventoryList();

        inv.addAtEnd(101, "Laptop", 5, 50000);
        inv.addAtBeginning(102, "Mouse", 20, 500);
        inv.addAtEnd(103, "Keyboard", 10, 1500);

        inv.displayInventory();

        inv.updateQuantity(102, 25);
        inv.searchByName("Laptop");

        inv.totalInventoryValue();

        inv.sortByName(true);
        System.out.println("Sorted by Price (Ascending):");
        inv.displayInventory();
    }
}
