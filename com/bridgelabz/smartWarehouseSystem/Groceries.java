package com.bridgelabz.smartWarehouseSystem;

public class Groceries extends WareHouseItem {
    private String expiryDate;

    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
