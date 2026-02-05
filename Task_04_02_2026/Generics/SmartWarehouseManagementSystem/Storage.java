package Task_04_02_2026.Generics.SmartWarehouseManagementSystem;

import java.util.*;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public T getItem(int index) {
        return items.get(index);
    }
    public List<T> getItems() {
        return items;
    }

}

