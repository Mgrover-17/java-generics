package com.bridgelabz.smartWarehouseSystem;

public class Furniture extends WareHouseItem {
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }

    public String getMaterial() {
        return material;
    }
}
