package com.bridgelabz.onlineMarketplace;

// Abstract class for Product Categories
public abstract class ProductCategory {
    private String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
