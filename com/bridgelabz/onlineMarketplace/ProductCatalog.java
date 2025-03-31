package com.bridgelabz.onlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    // Add product to catalog
    public void addProduct(Product<?> product) {
        products.add(product);
    }

    // Display catalog
    public void displayCatalog() {
        System.out.println("\nProduct Catalog:");
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}
