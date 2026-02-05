package Task_04_02_2026.Generics.SmartWarehouseManagementSystem;

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public String getCategory() {
        return "Groceries";
    }
}
