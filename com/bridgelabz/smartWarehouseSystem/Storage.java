package com.bridgelabz.smartWarehouseSystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WareHouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }
}
