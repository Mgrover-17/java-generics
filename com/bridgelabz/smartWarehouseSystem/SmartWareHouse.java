package com.bridgelabz.smartWarehouseSystem;

public class SmartWareHouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200.00, "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.00, "Samsung"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", 2.50, "2025-05-01"));
        groceriesStorage.addItem(new Groceries("Bread", 1.50, "2025-03-30"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table", 150.00, "Wood"));
        furnitureStorage.addItem(new Furniture("Chair", 75.00, "Plastic"));

        // Display items using wildcard method
        System.out.println("Electronics:");
        WareHouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WareHouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        WareHouseUtils.displayItems(furnitureStorage.getItems());
    }
}
