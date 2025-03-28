package com.bridgelabz.smartWarehouseSystem;

public class Electronics extends WareHouseItem {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    public String getBrand() {
        return brand;
    }
}
