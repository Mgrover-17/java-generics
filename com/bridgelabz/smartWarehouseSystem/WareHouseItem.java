package com.bridgelabz.smartWarehouseSystem;

public abstract class WareHouseItem {
    private String name;
    private double price;

    public WareHouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() + " - Name: " + name + ", Price: " + price;
    }
}
