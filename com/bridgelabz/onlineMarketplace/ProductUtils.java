package com.bridgelabz.onlineMarketplace;

public class ProductUtils {
    // Generic method to apply discounts dynamically
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = (product.getPrice() * percentage) / 100;
        double newPrice = product.getPrice() - discountAmount;
        product.setPrice(newPrice);
        System.out.println("Discount Applied: " + product.getName() + " now costs " + newPrice);
    }
}
