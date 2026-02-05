package Task_04_02_2026.Generics.SmartWarehouseManagementSystem;

abstract class WarehouseItem {
    private String name ;

    public WarehouseItem(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract String getCategory();
}
